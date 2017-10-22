package com.sjq.info.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.info.vo.PapersInfoVo;
import com.sjq.info.bean.PapersInfoBean;
import com.sjq.info.dao.PapersInfoMapper;

/**
 * [自动生成]试卷模块-试卷信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-11 00:59:01
 * @version 1.0
 */
@Repository("PapersInfoMapper")
public class PapersInfoMapperImpl extends BasicSqlSupport implements PapersInfoMapper {

	/**
	 * 根据ID查询试卷模块-试卷信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public PapersInfoVo queryPapersInfoById(Long id){
	    return this.selectOne("com.sjq.info.dao.PapersInfoMapper.queryPapersInfoById",id);
	}
	
	/**
	 * 查询所有的试卷模块-试卷信息信息
	 * @return 查询到的列表
	 */
	public List<PapersInfoVo> queryAllPapersInfo(){
	     return this.selectList("com.sjq.info.dao.PapersInfoMapper.queryAllPapersInfo");
	}
				
	/**
	 * 根据条件查询所有试卷模块-试卷信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<PapersInfoVo>  queryPapersInfoBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.info.dao.PapersInfoMapper.queryPapersInfoBySearch",map);
	}
	
	/**
	 * 根据条件查询试卷模块-试卷信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryPapersInfoTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.info.dao.PapersInfoMapper.queryPapersInfoTotalCount",map);
	}
	
	/**
	 * 分页查询试卷模块-试卷信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryPapersInfoPage(Map<String, Object> map){
		return this.selectList("com.sjq.info.dao.PapersInfoMapper.queryPapersInfoPage",map);
	}
	
	/**
	 * (删除)根据ID删除试卷模块-试卷信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deletePapersInfoById(PapersInfoBean bean){
		return this.delete("com.sjq.info.dao.PapersInfoMapper.deletePapersInfoById",bean);
	}
	
	/**
	 * (更新)根据ID更新所有试卷模块-试卷信息信息
	 * @param bean 试卷模块-试卷信息实体
	 * @return     受更新影响的行数
	 */
	public int  updatePapersInfoById(PapersInfoBean bean){
	    return this.update("com.sjq.info.dao.PapersInfoMapper.updatePapersInfoById", bean);
	}
	
	/**
	 * (增加)增加试卷模块-试卷信息信息
	 * @param bean 试卷模块-试卷信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertPapersInfo(PapersInfoBean bean){
		return this.insert("com.sjq.info.dao.PapersInfoMapper.insertPapersInfo", bean);
	}
	
	

}