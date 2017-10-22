package com.sjq.info.service;

import java.util.List;
import java.util.Map;

import com.sjq.info.bean.PapersInfoBean;
import com.sjq.info.search.PapersInfoSearch;
import com.sjq.info.vo.PapersInfoVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象试卷模块-试卷信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-11 00:59:01
 * @version 1.0
 */
 
public interface PapersInfoService {
	
	/**
	 * 根据ID查询试卷模块-试卷信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	PapersInfoVo queryPapersInfoById(Long id);

	/**
	 * 查询所有的试卷模块-试卷信息信息
	 * @return 查询到的结果列表
	 */
	List<PapersInfoVo> queryAllPapersInfo();
				
				
	/**
	 * 根据条件查询所有试卷模块-试卷信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<PapersInfoVo> queryPapersInfoBySearch(PapersInfoSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryPapersInfoPage(PageBean pb,PapersInfoSearch search);
				
				
	/**
	 * (删除)根据ID删除试卷模块-试卷信息信息
	 * @param id
	 * @return
	 */
	int deletePapersInfoById(PapersInfoBean bean);
				
				
	/**
	 * (更新)根据ID更新所有试卷模块-试卷信息信息
	 * @param bean
	 * @return
	 */
	int updatePapersInfoById(PapersInfoBean bean);
				
				
	/**
	 * (增加)增加试卷模块-试卷信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertPapersInfo(PapersInfoBean bean);
				
	
}