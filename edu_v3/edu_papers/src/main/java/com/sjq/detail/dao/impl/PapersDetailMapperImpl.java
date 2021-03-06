package com.sjq.detail.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.detail.vo.PapersDetailVo;
import com.sjq.detail.bean.PapersDetailBean;
import com.sjq.detail.dao.PapersDetailMapper;

/**
 * [自动生成]试卷模块-试卷明细信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-10 23:58:11
 * @version 1.0
 */
@Repository("PapersDetailMapper")
public class PapersDetailMapperImpl extends BasicSqlSupport implements PapersDetailMapper {

	/**
	 * 根据条件查询所有试卷模块-试卷明细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<PapersDetailVo>  queryPapersDetailBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.detail.dao.PapersDetailMapper.queryPapersDetailBySearch",map);
	}
	
	/**
	 * (删除)根据条件删除试卷模块-试卷明细信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deletePapersDetailBySearch(Map<String, Object> map){
		return this.delete("com.sjq.detail.dao.PapersDetailMapper.deletePapersDetailBySearch",map);
	}
	
	/**
	 * (更新)根据条件更新所有试卷模块-试卷明细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updatePapersDetailBySearch(Map<String, Object> map){
	    return this.update("com.sjq.detail.dao.PapersDetailMapper.updatePapersDetailBySearch", map);
	}
	
	/**
	 * (增加)增加试卷模块-试卷明细信息信息
	 * @param bean 试卷模块-试卷明细信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertPapersDetail(PapersDetailBean bean){
		return this.insert("com.sjq.detail.dao.PapersDetailMapper.insertPapersDetail", bean);
	}

	@Override
	public PapersDetailVo queryPapersDetailById(Long id) {
		 return this.selectOne("com.sjq.detail.dao.PapersDetailMapper.queryPapersDetailById",id);
	}
	
	

}