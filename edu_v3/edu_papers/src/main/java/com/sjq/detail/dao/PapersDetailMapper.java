package com.sjq.detail.dao;

import java.util.List;
import java.util.Map;
import com.sjq.detail.vo.PapersDetailVo;
import com.sjq.detail.bean.PapersDetailBean;

/**
 * [自动生成]抽象试卷模块-试卷明细信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-10 23:58:11
 * @version 1.0
 */
public interface PapersDetailMapper {
	
	PapersDetailVo queryPapersDetailById(Long id);

	/**
	 * 根据条件查询所有试卷模块-试卷明细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<PapersDetailVo> queryPapersDetailBySearch(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除试卷模块-试卷明细信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deletePapersDetailBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有试卷模块-试卷明细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updatePapersDetailBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加试卷模块-试卷明细信息信息
	 * @param bean 试卷模块-试卷明细信息实体
	 * @return     受增加影响的行数
	 */
	int insertPapersDetail(PapersDetailBean bean);

	
}