package com.sjq.job.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.job.bean.JobSchedulerConfig;
import com.sjq.job.dao.JobSchedulerConfigMapper;
import com.sjq.job.service.JobSchedulerConfigService;
import com.sjq.util.PageBean;

/**
 *
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:26:39
 * @version 1.0
 */
@Service("JobShedulerConfigService")
public class JobSchedulerConfigServiceImpl implements JobSchedulerConfigService {
	
	@Autowired
	private JobSchedulerConfigMapper jobSchedulerConfigMapper;

	public List<JobSchedulerConfig> findListSchedulerConfig(Map<String, Object> map) {
		return jobSchedulerConfigMapper.findListSchedulerConfig(map);
	}

	public PageBean queryPage(PageBean pb,Map<String,Object> map) {
	
        // 设置PageBean的行数参数
        pb.setRows(this.jobSchedulerConfigMapper.queryTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.jobSchedulerConfigMapper.queryByPageBean(map));
           
        // 返回pageBean
        return pb;
		
	}

	public int insertSchedulerConfig(JobSchedulerConfig bean) {
		return this.jobSchedulerConfigMapper.insertSchedulerConfig(bean);
	}


}
