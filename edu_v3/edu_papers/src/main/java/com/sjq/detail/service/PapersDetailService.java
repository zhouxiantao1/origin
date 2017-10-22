package com.sjq.detail.service;

import java.util.List;
import java.util.Map;

import com.sjq.detail.bean.PapersDetailBean;
import com.sjq.detail.search.PapersDetailSearch;
import com.sjq.detail.vo.PapersDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象试卷模块-试卷明细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-10 23:58:11
 * @version 1.0
 */
 
public interface PapersDetailService {
	
	PapersDetailVo queryPapersDetailById(Long id);

				
	/**
	 * 根据条件查询所有试卷模块-试卷明细信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<PapersDetailVo> queryPapersDetailBySearch(PapersDetailSearch search);
				
								
	/**
	 * (删除)根据条件删除试卷模块-试卷明细信息信息
	 * @param map
	 * @return
	 */
	int deletePapersDetailBySearch(PapersDetailBean bean,PapersDetailSearch search);
				
				
	/**
	 * (更新)根据条件更新所有试卷模块-试卷明细信息信息
	 * @param map
	 * @return
	 */
	int updatePapersDetailBySearch(PapersDetailBean bean,PapersDetailSearch search);
				
				
	/**
	 * (增加)增加试卷模块-试卷明细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertPapersDetail(PapersDetailBean bean);
				
	
}