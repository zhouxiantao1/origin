package com.sjq.ware.service.impl;

import java.io.UnsupportedEncodingException;
import java.text.Collator;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.elasticsearch.index.query.BaseQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjq.ware.dao.QuestionWareMapper;
import com.sjq.ware.service.QuestionWareService;
import com.sjq.ware.bean.QuestionRelatedBean;
import com.sjq.ware.bean.QuestionWareBean;
import com.sjq.ware.search.QuestionWareSearch;
import com.sjq.ware.vo.QuestionWareVo;
import com.sjq.answer.bean.QuestionAnswerBean;
import com.sjq.answer.dao.QuestionAnswerMapper;
import com.sjq.answer.vo.QuestionAnswerVo;
import com.sjq.common.util.cookie.CookieUtil;
import com.sjq.common.util.phputil.dto.QuestionOptionsDto;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现题库模块-题库中心service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 11:53:57
 * @version 1.0
 */
 
@Service("QuestionWareService")
public class QuestionWareServiceImpl implements QuestionWareService {
	

	@Autowired
	private QuestionWareMapper questionWareMapper;
	

	@Autowired
	private QuestionAnswerMapper questionAnswerMapper;
	
	
	private static final String COOKIE_QUESTION_EXPORT = "question_export_cookie";
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryQuestionWarePage(PageBean pb,QuestionWareSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("questionContent",search.getQuestionContent());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("stageId",search.getStageId());
  		map.put("typeId",search.getTypeId());
  		map.put("difficulty", search.getDifficulty());
  		if(search.getBelongToLib()!=null && !search.getBelongToLib().equals("5")) map.put("belongToLib", search.getBelongToLib());  //"我的题库"，根据create_id就行
  		map.put("createId", search.getCreateId());
  		map.put("ids", search.getIds());
  		map.put("checkId", search.getCheckId());
  		map.put("checkStatus", search.getCheckStatus());
  		map.put("sort", search.getSort());
  		
	
        // 设置PageBean的行数参数
        pb.setRows(this.questionWareMapper.queryQuestionWareTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.questionWareMapper.queryQuestionWarePage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
	/**
	 * (增加)增加题库模块-题库中心信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	@Transactional
	public int insertQuestionWare(QuestionWareBean qwb,QuestionAnswerBean qab,Long[] knowIds,Long[] catelogIds){
		
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		String createName = cu.getUsername()==null?"":cu.getUsername();
		
		//保存试题
		qwb.setCreateName(createName);
		qwb.setCreateTime(new Date());
		this.questionWareMapper.insertQuestionWare(qwb);
		
		//保存试题答案
		qab.setQuestionId(qwb.getId());
		qab.setCreateName(createName);
		qab.setCreateTime(new Date());
		this.questionAnswerMapper.insertQuestionAnswer(qab);
		
		//保存知识点试题有关联信息
		QuestionRelatedBean qrb = new QuestionRelatedBean();
		for(Long knowId:knowIds){
			
			qrb.setCreateName(createName);
			qrb.setCreateTime(new Date());
			qrb.setRelatedType("2");
			qrb.setQuestionId(qwb.getId());
			qrb.setRelatedId(knowId);
			this.questionWareMapper.insertQuestionRelated(qrb);
			
		}

		//保存课本章节试题有关联信息
		for(Long catelogId:catelogIds){
			
			qrb.setCreateName(createName);
			qrb.setCreateTime(new Date());
			qrb.setRelatedType("1");
			qrb.setQuestionId(qwb.getId());
			qrb.setRelatedId(catelogId);
			this.questionWareMapper.insertQuestionRelated(qrb);
			
		}
		
		return 1;
		
	}
	
	

	@Override
	public int modifyQuestionWare(QuestionWareBean qwb, QuestionAnswerBean qab, Long[] knowIds, Long[] catelogIds) {
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		String name = cu.getUsername()==null?"":cu.getUsername();
		
		qwb.setModTime(new Date());
		qwb.setModName(name);
		
		//修改试题
		this.questionWareMapper.updateQuestionWareById(qwb);
		
		
		qab.setModTime(new Date());
		qab.setModName(name);
		//修改试题答案
		this.questionAnswerMapper.updateQuestionAnswerById(qab);
		
		
		//删除所有之前关联的知识与章节
		this.questionWareMapper.updateQuestionRelatedByQuestionId(qwb.getId());
		
		
		//重新绑定知识点关联
		QuestionRelatedBean qrb = new QuestionRelatedBean();
		for(Long knowId:knowIds){
			
			qrb.setCreateName(name);
			qrb.setCreateTime(new Date());
			qrb.setRelatedType("2");
			qrb.setQuestionId(qwb.getId());
			qrb.setRelatedId(knowId);
			this.questionWareMapper.insertQuestionRelated(qrb);
			
		}
		
		
		//重新绑定章节关联
		for(Long catelogId:catelogIds){
			
			qrb.setCreateName(name);
			qrb.setCreateTime(new Date());
			qrb.setRelatedType("1");
			qrb.setQuestionId(qwb.getId());
			qrb.setRelatedId(catelogId);
			this.questionWareMapper.insertQuestionRelated(qrb);
			
		}
		
		
		
		return 1;
	}
	
	/**
	 * (删除)根据ID删除题库模块-题库中心信息
	 * @param id
	 * @return
	 */
	public int deleteQuestionWareById(QuestionWareBean bean){
		return this.questionWareMapper.deleteQuestionWareById(bean);
	}
	
	
	/**
	 * 根据条件查询题库模块-题库中心count总数
	 * @param map
	 * @return
	 */
	public int queryQuestionWareTotalCount(QuestionWareSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("questionContent",search.getQuestionContent());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("stageId",search.getStageId());
  		map.put("typeId",search.getTypeId());
  		map.put("checkStatus",search.getCheckStatus());
		
		return this.questionWareMapper.queryQuestionWareTotalCount(map);
	}
	
	
	/**
	 * 根据条件查询所有题库模块-题库中心信息
	 * @param map
	 * @return
	 */
	public List<QuestionWareVo> queryQuestionWareBySearch(QuestionWareSearch search){
		
		Map<String,Object> map = new HashMap<String,Object>();
  		map.put("id",search.getId());
  		map.put("questionContent",search.getQuestionContent());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("stageId",search.getStageId());
  		map.put("typeId",search.getTypeId());
  		map.put("checkStatus",search.getCheckStatus());
		
		return this.questionWareMapper.queryQuestionWareBySearch(map);
	}
	
	
	/**
	 * (更新)根据ID更新所有题库模块-题库中心信息
	 * @param bean
	 * @return
	 */
	public int updateQuestionWareById(QuestionWareBean bean){
		
		return this.questionWareMapper.updateQuestionWareById(bean);
		
	}

	/**
	 * 根据ID查询题库模块-题库中心信息
	 * @return
	 */
	public QuestionWareVo queryQuestionWareById(Long id){
		
		return this.questionWareMapper.queryQuestionWareById(id);

	}

	@Override
	public List<Map<String, Object>> queryQuestionIdsBySearch(QuestionWareSearch search) {
		
		Map<String,Object> map = new HashMap<String,Object>();
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("stageId",search.getStageId());
  		map.put("checkStatus",search.getCheckStatus());
		
		return this.questionWareMapper.queryQuestionIdsBySearch(map);
	}
	
	

	/**
	 * (更新)根据条件更新所有题库模块-题库中心信息
	 * @param map
	 * @return
	 */
	public int updateQuestionWareBySearch(QuestionWareBean bean,QuestionWareSearch search){
		
		// 定义一个HashMap集合
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.questionWareMapper.updateQuestionWareBySearch(map);
	}

	@Override
	public boolean checkQuestionWareAnswer(Long questionId, String answer) {
		
		QuestionWareVo vo = this.questionWareMapper.queryQuestionWareById(questionId);
		
		if(vo != null){
			
			for(int i=0;i<vo.getQods().size();i++){
				QuestionOptionsDto dto = vo.getQods().get(i);
				if(dto.getIs_answer().equals("1")){
					System.out.println(String.valueOf(i)+"  "+answer);
					if(String.valueOf(i).equals(answer)){
						return true;	
					}
				}
				
			}
			
		}else{
			return false;
		}
		
		return false;
		
	}

	@Override
	public String queryQuestionExportCookie(HttpServletRequest request, HttpServletResponse response){
		
		String cookieValue = CookieUtil.getCookie(request, COOKIE_QUESTION_EXPORT);
		
		return cookieValue;
		
	}
	
	
	
	

	@Override
	public void deleteQuestionExportCookieByTypeName(String typeName, HttpServletRequest request, HttpServletResponse response)  {
		
		String cookieValue = CookieUtil.getCookie(request, COOKIE_QUESTION_EXPORT);
		String newValue = "";
		
		if(cookieValue != null){
			
			for(String v:cookieValue.split("\\|")){
				
				String[] ks = v.split("#");
				
				if(!ks[0].equals(typeName)){
					
					newValue += ks[0] + "#" +ks[1] + "|";
					
				}
				
			}
			
		}
		
		
		CookieUtil.addCookie(response, COOKIE_QUESTION_EXPORT, newValue);
		
		
	}

	@Override
	public void addQuestionExportCookie(String id, String typeName, HttpServletRequest request,
			HttpServletResponse response) {
		
		// 选择题,1234;填空题,2523;选择题,4234;
		String cookieValue = CookieUtil.getCookie(request, COOKIE_QUESTION_EXPORT);
		
		if(cookieValue==null||cookieValue.equals("")){
			
			CookieUtil.addCookie(response, COOKIE_QUESTION_EXPORT, typeName+"#"+id+"|");
			
		}else{
			
			boolean isExist = false;
			
			for(String v:cookieValue.split("\\|")){
				
				String[] ks = v.split("#");
				if(ks[1].equals(id)){
					isExist = true;
				}
				
			}
			
			if(!isExist){
				CookieUtil.addCookie(response, COOKIE_QUESTION_EXPORT, cookieValue + typeName+"#"+id+"|");
			}
			
		}
		
	}


	@Override
	public void deleteQuestionExportCookieById(String id, HttpServletRequest request,
			HttpServletResponse response) {
		
		String cookieValue = CookieUtil.getCookie(request, COOKIE_QUESTION_EXPORT);
		String newValue = "";
		
		if(cookieValue != null){
			
			for(String v:cookieValue.split("\\|")){
				
				String[] ks = v.split("#");
				
				if(!ks[1].equals(id)){
					
					newValue += ks[0] + "#" +ks[1] + "|";
					
				}
				
			}
			
		}
		
		CookieUtil.addCookie(response, COOKIE_QUESTION_EXPORT, newValue);
		
	}

	@Override
	public void clearQuestionExportCookie(HttpServletRequest request ,HttpServletResponse response) {
		CookieUtil.addCookie(response, COOKIE_QUESTION_EXPORT, "");
	}
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryQuestionWarePageManual(PageBean pb,QuestionWareSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("questionContent",search.getQuestionContent());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("stageId",search.getStageId());
  		map.put("typeId",search.getTypeId());
  		map.put("difficulty", search.getDifficulty());
  		map.put("belongToLib", search.getBelongToLib());  //"我的题库"，根据create_id就行
  		map.put("createId", search.getCreateId());
  		map.put("ids", search.getIds());
  		map.put("checkId", search.getCheckId());
  		map.put("checkStatus", search.getCheckStatus());
  		map.put("sort", search.getSort());
  		
	
        // 设置PageBean的行数参数
        pb.setRows(this.questionWareMapper.queryQuestionWareTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.questionWareMapper.queryQuestionWarePage(map));
           
        // 返回pageBean
        return pb;
		
	}

	@Override
	public int updateQuestionWareByIds(Map<String, Object> map) {
		return this.questionWareMapper.updateQuestionWareByIds(map);
	}

}
