package com.sjq.develop.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sjq.develop.bean.DevelopCodePropertyBean;
import com.sjq.develop.dao.DevelopCodePropertyMapper;
import com.sjq.develop.vo.DevelopCodePropertyVo;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月12日上午9:43:39
 * @version 1.0
 */
@Repository("DevelopCodePropertyMapper")
public class DevelopCodePropertyMapperImpl extends BasicSqlSupport  implements DevelopCodePropertyMapper {

	public List<DevelopCodePropertyVo> queryDevelopCodePropertyByCodeId(Long codeId) {
		
		 return this.selectList("com.sjq.develop.dao.DevelopCodePropertyMapper.queryDevelopCodePropertyByCodeId",codeId);
		
	}

	public int insertDevelopCodeProerty(DevelopCodePropertyBean bean) {
		return this.insert("com.sjq.develop.dao.DevelopCodePropertyMapper.insertDevelopCodeProperty", bean);
	}

}
