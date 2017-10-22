package com.sjq.paper.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.paper.dao.EvaluatePaperMapper;
import com.sjq.paper.service.EvaluatePaperService;
import com.sjq.paper.bean.EvaluatePaperBean;
import com.sjq.paper.search.EvaluatePaperSearch;
import com.sjq.paper.vo.EvaluatePaperVo;
import com.sjq.util.PageBean;
import com.sjq.util.datetime.DateUtil;

/**
 * [自动生成]实现问卷信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:23
 * @version 1.0
 */
 
@Service("EvaluatePaperService")
public class EvaluatePaperServiceImpl implements EvaluatePaperService {
	

	@Autowired
	private EvaluatePaperMapper evaluatePaperMapper;
	
	/**
	 * (更新)根据ID物理删除记录
	 * @param bean 问卷信息实体
	 * @return     受更新影响的行数
	 */
	public int  deleteEvaluatePaperById(Long id){
		return this.evaluatePaperMapper.deleteEvaluatePaperById(id);
	}
	
	/**
	 * (更新)根据ID更新所有问卷信息信息
	 * @param bean
	 * @return
	 */
	public int updateEvaluatePaperById(EvaluatePaperBean bean){
		
		return this.evaluatePaperMapper.updateEvaluatePaperById(bean);
		
	}
	
	/**
	 * 查询所有的问卷信息信息
	 * @return
	 */
	public List<EvaluatePaperVo> queryAllEvaluatePaper(){
		
		return this.evaluatePaperMapper.queryAllEvaluatePaper();
	
	}
				
				
	
	/**
	 * 根据ID查询问卷信息信息
	 * @return
	 */
	public EvaluatePaperVo queryEvaluatePaperById(Long id){
		
		return this.evaluatePaperMapper.queryEvaluatePaperById(id);

	}
	

	/**
	 * 根据条件查询所有问卷信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluatePaperVo> queryEvaluatePaperBySearch(EvaluatePaperSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("title",search.getTitle());
  		map.put("indicatorId",search.getIndicatorId());
  		map.put("delflag",search.getDelflag());
  		map.put("userId",search.getUserId());
  		List<EvaluatePaperVo> evaluatePaperVoList = this.evaluatePaperMapper.queryEvaluatePaperBySearch(map);
	    ArrayList<EvaluatePaperVo> list = new ArrayList<EvaluatePaperVo>();
	    for(EvaluatePaperVo evaluatePaperVo : evaluatePaperVoList){//将时间转换成String格式，用于新增测评页面
	      	String dateStr = DateUtil.format(evaluatePaperVo.getCreateTime(), " yyyy-MM-dd HH:mm:ss");
	      	evaluatePaperVo.setCreateTimeStr(dateStr);
	      	list.add(evaluatePaperVo);
	     }
		return list;
	}
	
	
	/**
	 * 根据条件查询问卷信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluatePaperTotalCount(EvaluatePaperSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("userId",search.getUserId());
		
		return this.evaluatePaperMapper.queryEvaluatePaperTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluatePaperPage(PageBean pb,EvaluatePaperSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("userId",search.getUserId());
  		
        // 设置PageBean的行数参数
        pb.setRows(this.evaluatePaperMapper.queryEvaluatePaperTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        List<Object> objectList = this.evaluatePaperMapper.queryEvaluatePaperPage(map);
        ArrayList<Object> list = new ArrayList<Object>();
        for(Object object : objectList){
        	EvaluatePaperVo evaluatePaperVo = (EvaluatePaperVo)object;
        	String dateStr = DateUtil.format(evaluatePaperVo.getCreateTime(), " yyyy-MM-dd HH:mm:ss");
        	evaluatePaperVo.setCreateTimeStr(dateStr);
        	list.add(evaluatePaperVo);
        }
        pb.setList(list);
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据条件删除问卷信息信息
	 * @param map
	 * @return
	 */
	public int deleteEvaluatePaperBySearch(EvaluatePaperBean bean,EvaluatePaperSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.evaluatePaperMapper.deleteEvaluatePaperBySearch(map);
		
	}
	
				
	
	/**
	 * (增加)增加问卷信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluatePaper(EvaluatePaperBean bean){
	
		
		return this.evaluatePaperMapper.insertEvaluatePaper(bean);
		
	}
	
	
	
}
