package com.sjq.offpaperscore.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.offpaperscore.bean.OffPaperscoreBean;
import com.sjq.offpaperscore.dao.OffPaperscoreMapper;
import com.sjq.offpaperscore.search.OffPaperscoreSearch;
import com.sjq.offpaperscore.service.OffPaperscoreService;

@Service("OffPaperscoreService")
public class OffPaperscoreServiceImpl implements OffPaperscoreService {

	@Autowired
	private OffPaperscoreMapper offPaperscoreMapper;
	
	@Override
	public int insertOffPaperscoreBatch(List<OffPaperscoreBean> offPaperscoreBeanList) {
		return offPaperscoreMapper.insertOffPaperscoreBatch(offPaperscoreBeanList);
	}

	@Override
	public int deleteOffPaperscoreBatch(Long examId, Long examDetailId) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",examId);
  		map.put("examDetailId", examDetailId);
		return offPaperscoreMapper.deleteOffPaperscoreBatch(map);
	}

	@Override
	public Map<String, Map<String,String>> queryOffPaperscoreBySearch(OffPaperscoreSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("districtId",search.getDistrictId());
  		map.put("schoolId",search.getSchoolId());
  		map.put("classId",search.getClassId());
  		map.put("gradeId",search.getGradeId());
		
		return this.offPaperscoreMapper.queryOffPaperscoreBySearch(map);
	}
	
}
