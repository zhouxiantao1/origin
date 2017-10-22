package com.sjq.ware.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjq.answer.bean.QuestionAnswerBean;
import com.sjq.util.PageBean;
import com.sjq.ware.bean.QuestionWareBean;
import com.sjq.ware.search.QuestionWareSearch;
import com.sjq.ware.vo.QuestionWareVo;

/**
 * [自动生成]抽象题库模块-题库中心service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 11:53:57
 * @version 1.0
 */
 
public interface QuestionWareService {

	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryQuestionWarePage(PageBean pb,QuestionWareSearch search);
	
	PageBean queryQuestionWarePageManual(PageBean pb,QuestionWareSearch search);
				
	
	/**
	 * (增加)增加题库模块-题库中心信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertQuestionWare(QuestionWareBean qwb,QuestionAnswerBean qab,Long[] knowIds,Long[] catelogIds);
	
	
	/**
	 * (增加)增加题库模块-题库中心信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int modifyQuestionWare(QuestionWareBean qwb,QuestionAnswerBean qab,Long[] knowIds,Long[] catelogIds);
	
	
	
	/**
	* (删除)根据ID删除题库模块-题库中心信息
	* @param id
	* @return
	*/
	int deleteQuestionWareById(QuestionWareBean bean);
	
	/**
	 * 根据条件查询题库模块-题库中心count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryQuestionWareTotalCount(QuestionWareSearch search);
	
	
	/**
	 * 根据条件查询所有题库模块-题库中心信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<QuestionWareVo> queryQuestionWareBySearch(QuestionWareSearch search);
	
	
	/**
	* (更新)根据ID更新所有题库模块-题库中心信息
	* @param bean
	* @return
	*/
	int updateQuestionWareById(QuestionWareBean bean);
	
	
	/**
	 * 根据ID查询题库模块-题库中心信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	QuestionWareVo queryQuestionWareById(Long id);
	
	
	/**
	 * 根据条件获取所有的试题id
	 * @param search
	 * @return
	 */
	List<Map<String,Object>> queryQuestionIdsBySearch(QuestionWareSearch search);
	
	
	/**
	 * (更新)根据条件更新所有题库模块-题库中心信息
	 * @param map
	 * @return
	 */
	int updateQuestionWareBySearch(QuestionWareBean bean,QuestionWareSearch search);
	
	
	/**
	 * 
	 * @param questionId
	 * @param answer
	 * @return
	 */
	boolean checkQuestionWareAnswer(Long questionId,String answer);
	
	
	/**
	 * 获取待导出试题的cooike信息
	 * @param request
	 * @param response
	 * @return
	 */
	String queryQuestionExportCookie(HttpServletRequest request ,HttpServletResponse response);
	
	/**
	 * 根据题型名称删除cooike信息
	 * @param id
	 * @param request
	 * @param response
	 */
	void deleteQuestionExportCookieByTypeName(String typeName,HttpServletRequest request ,HttpServletResponse response);
	
	/**
	 * 根据试题id删除cooike信息
	 * @param id
	 * @param request
	 * @param response
	 */
	void deleteQuestionExportCookieById(String id,HttpServletRequest request ,HttpServletResponse response);
	
	/**
	 * 增加题型cooike信息
	 * @param id
	 * @param typeName
	 * @param request
	 * @param response
	 */
	void addQuestionExportCookie(String id,String typeName,HttpServletRequest request ,HttpServletResponse response);
	
	
	/**
	 * 导完清空初始
	 */
	void clearQuestionExportCookie(HttpServletRequest request ,HttpServletResponse response);
	
	//更新组卷次数
	int updateQuestionWareByIds(Map<String, Object> map);
}