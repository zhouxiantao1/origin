package com.sjq.develop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjq.develop.bean.DevelopCodeMethodBean;
import com.sjq.develop.dao.DevelopMethodMapper;
import com.sjq.develop.service.DevelopMethodService;
import com.sjq.develop.vo.DevelopMethodVo;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月12日下午4:04:01
 * @version 1.0
 */
@Service("DevelopMethodService")
public class DevelopMethodServiceImpl implements DevelopMethodService {

	@Autowired
	private DevelopMethodMapper developMethodMapper;
	
	public List<DevelopMethodVo> queryDevelopMethodAll() {
		return developMethodMapper.queryDevelopMethodAll();
	}

	@Transactional
	public int insertDevelopCodeMethod(Long codeId, List<DevelopCodeMethodBean> bs) {
		
		this.developMethodMapper.deleteAllDevelopCodeMethodByCodeId(codeId);
		
		for(DevelopCodeMethodBean bean:bs){
			this.developMethodMapper.insertDevelopCodeMethod(bean);
		}
		
		return 0;
	}

	public List<DevelopMethodVo> queryDevelopMethodAllByCodeId(Long codeId) {
		
		return developMethodMapper.queryDevelopMethodAllByCodeId(codeId);
		
	}

	public List<DevelopMethodVo> queryDevelopMethodByCodeId(Long codeId) {
		
		return developMethodMapper.queryDevelopMethodByCodeId(codeId);
		
	}

	public List<DevelopMethodVo> queryDevelopMethodByIds(Long[] ids) {
		return developMethodMapper.queryDevelopMethodByIds(ids);
	}

}
