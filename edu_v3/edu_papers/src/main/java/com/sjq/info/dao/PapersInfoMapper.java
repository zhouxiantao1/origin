package com.sjq.info.dao;

import java.util.List;
import java.util.Map;
import com.sjq.info.vo.PapersInfoVo;
import com.sjq.info.bean.PapersInfoBean;

/**
 * [自动生成]抽象试卷模块-试卷信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-11 00:59:01
 * @version 1.0
 */
public interface PapersInfoMapper {

	/**
	 * 根据ID查询试卷模块-试卷信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	PapersInfoVo queryPapersInfoById(Long id);

	/**
	 * 查询所有的试卷模块-试卷信息信息
	 * @return 查询到的列表
	 */
	List<PapersInfoVo> queryAllPapersInfo();
	
	/**
	 * 根据条件查询所有试卷模块-试卷信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<PapersInfoVo> queryPapersInfoBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询试卷模块-试卷信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryPapersInfoTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询试卷模块-试卷信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryPapersInfoPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除试卷模块-试卷信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deletePapersInfoById(PapersInfoBean bean);
	
	/**
	 * (更新)根据ID更新所有试卷模块-试卷信息信息
	 * @param bean 试卷模块-试卷信息实体
	 * @return     受更新影响的行数
	 */
	int updatePapersInfoById(PapersInfoBean bean);
	
	/**
	 * (增加)增加试卷模块-试卷信息信息
	 * @param bean 试卷模块-试卷信息实体
	 * @return     受增加影响的行数
	 */
	int insertPapersInfo(PapersInfoBean bean);

	
}