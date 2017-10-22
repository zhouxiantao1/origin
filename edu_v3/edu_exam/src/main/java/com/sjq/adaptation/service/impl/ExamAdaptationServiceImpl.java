package com.sjq.adaptation.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjq.adaptation.dao.ExamAdaptationKnowledgeMapper;
import com.sjq.adaptation.dao.ExamAdaptationMapper;
import com.sjq.adaptation.service.ExamAdaptationService;
import com.sjq.adaptation.bean.ExamAdaptationBean;
import com.sjq.adaptation.bean.ExamAdaptationKnowledgeBean;
import com.sjq.adaptation.search.ExamAdaptationSearch;
import com.sjq.adaptation.vo.ExamAdaptationVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现考试模块-自适应测试service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 23:31:54
 * @version 1.0
 */
 
@Service("ExamAdaptationService")
public class ExamAdaptationServiceImpl implements ExamAdaptationService {
	

	@Autowired
	private ExamAdaptationMapper examAdaptationMapper;
	
		

	@Autowired
	private ExamAdaptationKnowledgeMapper examAdaptationKnowledgeMapper;
	
	/**
	 * 根据ID查询考试模块-自适应测试信息
	 * @return
	 */
	public ExamAdaptationVo queryExamAdaptationById(Long id){
		
		return this.examAdaptationMapper.queryExamAdaptationById(id);

	}
	

	/**
	 * 根据条件查询所有考试模块-自适应测试信息
	 * @param map
	 * @return
	 */
	public List<ExamAdaptationVo> queryExamAdaptationBySearch(ExamAdaptationSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("isValid", search.getIsValid());
		
		return this.examAdaptationMapper.queryExamAdaptationBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryExamAdaptationPage(PageBean pb,ExamAdaptationSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("stageId", search.getStageId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.examAdaptationMapper.queryExamAdaptationTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.examAdaptationMapper.queryExamAdaptationPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除考试模块-自适应测试信息
	 * @param id
	 * @return
	 */
	public int deleteExamAdaptationById(ExamAdaptationBean bean){
		return this.examAdaptationMapper.deleteExamAdaptationById(bean);
	}
	
				
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试信息
	 * @param bean
	 * @return
	 */
	public int updateExamAdaptationById(ExamAdaptationBean bean){
		
		return this.examAdaptationMapper.updateExamAdaptationById(bean);
		
	}
	
				
	
	/**
	 * (增加)增加考试模块-自适应测试信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamAdaptation(ExamAdaptationBean bean,Long[] knowIds){
		
		this.examAdaptationMapper.insertExamAdaptation(bean);
		
		//封装自适应知识点关联
		for(Long id:knowIds){
			ExamAdaptationKnowledgeBean eak = new ExamAdaptationKnowledgeBean();
			eak.setCreateName(bean.getCreateName());
			eak.setCreateTime(new Date());
			eak.setDelflag("0");
			eak.setKnowledgeId(id);
			eak.setNum(0);
			eak.setAdaptationId(bean.getId());
			
			examAdaptationKnowledgeMapper.insertExamAdaptationKnowledge(eak);
		}
		
		//初始化选库
		this.examAdaptationMapper.setExamAdaptationQuestion(bean.getId());
	
		int knowNum = this.examAdaptationMapper.getExamAdaptationKnowledge(bean.getId());
		
		System.out.println(knowNum);
		
		List<Map<String,Object>> maps = this.examAdaptationMapper.getExamAdaptationKnowledgeIdList(bean.getId());
		
		System.out.println(maps.size());
		
		int cnum = bean.getNum().intValue();
		
		if(knowNum > cnum){
				
			for(int i=1;i<knowNum;i++){
				
				Map<String,Object> map = maps.get(i-1);
				Map<String,Object> upmap = new HashMap<String,Object>();
				
				upmap.put("adaptationId", bean.getId());
				upmap.put("knowledgeId", Long.valueOf(map.get("knowledge_id").toString()));
				
				if(i<=cnum){
					upmap.put("num", 1);
				}else{
					upmap.put("num", 0);
				}
				
				examAdaptationKnowledgeMapper.updateExamAdaptationKnowledgeBySearch(upmap);
			}
				
		}else{
			
			for(int i=1;i<knowNum+1;i++){
				
				Map<String,Object> map = maps.get(i-1);
				Map<String,Object> upmap = new HashMap<String,Object>();
				
				upmap.put("adaptationId", bean.getId());
				upmap.put("knowledgeId", Long.valueOf(map.get("knowledge_id").toString()));
				
				if(i-1<cnum%knowNum){
					upmap.put("num", cnum/knowNum+1);
				}else{
					upmap.put("num", cnum/knowNum);
				}
				
				examAdaptationKnowledgeMapper.updateExamAdaptationKnowledgeBySearch(upmap);
			}
			
		}
		
		return 1;
		
	}


	@Override
	public int getExamAdaptationKnowledge(Long adapatationId) {

		return examAdaptationMapper.getExamAdaptationKnowledge(adapatationId);
		
	}


	@Override
	public List<Map<String, Object>> getExamAdaptationKnowledgeIdList(Long adapatationId) {

		return examAdaptationMapper.getExamAdaptationKnowledgeIdList(adapatationId);
	}
	
	


	@Override
	public void setExamAdaptationQuestion(Long adapatationId) {
		this.examAdaptationMapper.setExamAdaptationQuestion(adapatationId);
	}


	@Override
	public List<Map<String, Object>> getExamAdaptationKnowledgeAnswerCount(Map<String, Object> map) {
		return examAdaptationMapper.getExamAdaptationKnowledgeAnswerCount(map);
	}
	
	
	public static void main(String[] args){
		
		int knowNum = 60;
		
		System.out.println(knowNum);
		
		int cnum = 121;
		
		if(knowNum > cnum){
			
			for(int i=1;i<knowNum+1;i++){
				
				if(i<=cnum){
					System.out.println(i+" "+cnum + "   "+knowNum + "   "+cnum%knowNum+"  "+1);
				}else{
					System.out.println(i+" "+cnum + "   "+knowNum + "   "+cnum%knowNum+"  "+0);
				}
				
			}
			
		}else{
			
			for(int i=1;i<knowNum+1;i++){
				
				if(i-1<cnum%knowNum){
					System.out.println(i+" "+cnum + "   "+knowNum + "   "+cnum%knowNum+"  "+(cnum/knowNum+1));
				}else{
					System.out.println(i+" "+cnum + "   "+knowNum + "   "+cnum%knowNum+"  "+cnum/knowNum);
				}
				
			}
			
			
		}
		
		
	}


	@Override
	public PageBean queryMyExamAdaptationPage(PageBean pb, ExamAdaptationSearch search) {
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("stageId", search.getStageId());
  		map.put("status", search.getStatus());
  		map.put("userId", search.getUserId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.examAdaptationMapper.queryMyExamAdaptationTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setMlist(this.examAdaptationMapper.queryMyExamAdaptationPage(map));
           
        // 返回pageBean
        return pb;
	}


	@Override
	public int queryExamAdaptationQuestionNum(Long[] ids) {
		
		Map<String, Object> map = new HashMap<String, Object>();
	  	map.put("ids",ids);
	  	
		return this.examAdaptationMapper.queryExamAdaptationQuestionNum(map);
	}


	@Override
	public int queryExamAdaptationTotalCount(ExamAdaptationSearch search) {
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("stageId", search.getStageId());
	
        return this.examAdaptationMapper.queryExamAdaptationTotalCount(map);
	}
}
