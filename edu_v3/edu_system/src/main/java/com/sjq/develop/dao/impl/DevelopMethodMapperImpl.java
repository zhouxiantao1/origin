package com.sjq.develop.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sjq.develop.bean.DevelopCodeMethodBean;
import com.sjq.develop.dao.DevelopMethodMapper;
import com.sjq.develop.vo.DevelopMethodVo;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月12日下午4:04:31
 * @version 1.0
 */
@Repository("DevelopMethodMapper")
public class DevelopMethodMapperImpl extends BasicSqlSupport  implements DevelopMethodMapper {

	public List<DevelopMethodVo> queryDevelopMethodAll() {
		 return this.selectList("com.sjq.develop.dao.DevelopMethodMapper.queryDevelopMethodAll");
	}

	public int deleteAllDevelopCodeMethodByCodeId(Long codeId) {
		return this.update("com.sjq.develop.dao.DevelopMethodMapper.deleteAllDevelopCodeMethodByCodeId", codeId);
	}

	public int insertDevelopCodeMethod(DevelopCodeMethodBean bean) {
		return this.insert("com.sjq.develop.dao.DevelopMethodMapper.insertDevelopCodeMethod",bean);
	}

	public List<DevelopMethodVo> queryDevelopMethodAllByCodeId(Long codeId) {
		 return this.selectList("com.sjq.develop.dao.DevelopMethodMapper.queryDevelopMethodAllByCodeId",codeId);
	}

	public List<DevelopMethodVo> queryDevelopMethodByCodeId(Long codeId) {
		return this.selectList("com.sjq.develop.dao.DevelopMethodMapper.queryDevelopMethodByCodeId",codeId);
	}

	public List<DevelopMethodVo> queryDevelopMethodByIds(Long[] ids) {
		 return this.selectList("com.sjq.develop.dao.DevelopMethodMapper.queryDevelopMethodByIds",ids);
	}

}
