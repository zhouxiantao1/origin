package com.sjq.develop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.develop.bean.DevelopCodePropertyBean;
import com.sjq.develop.dao.DevelopCodePropertyMapper;
import com.sjq.develop.service.DevelopCodePropertyService;
import com.sjq.develop.vo.DevelopCodePropertyVo;

@Service("DevelopCodePropertyService")
public class DevelopCodePropertyServiceImpl implements DevelopCodePropertyService {
	
	@Autowired
	private DevelopCodePropertyMapper developCodePropertyMapper;

	public List<DevelopCodePropertyVo> queryDevelopCodePropertyByCodeId(Long codeId) {
		return developCodePropertyMapper.queryDevelopCodePropertyByCodeId(codeId);
	}

	public int insertDevelopCodeProerty(DevelopCodePropertyBean bean) {
		return this.developCodePropertyMapper.insertDevelopCodeProerty(bean);
	}

}
