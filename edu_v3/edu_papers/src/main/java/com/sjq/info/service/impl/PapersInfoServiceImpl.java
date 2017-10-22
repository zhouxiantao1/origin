package com.sjq.info.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.info.dao.PapersInfoMapper;
import com.sjq.info.service.PapersInfoService;
import com.sjq.info.bean.PapersInfoBean;
import com.sjq.info.search.PapersInfoSearch;
import com.sjq.info.vo.PapersInfoVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现试卷模块-试卷信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-11 00:59:01
 * @version 1.0
 */
 
@Service("PapersInfoService")
public class PapersInfoServiceImpl implements PapersInfoService {
	
	/**
	 * 根据ID查询试卷模块-试卷信息信息
	 * @return
	 */
	public PapersInfoVo queryPapersInfoById(Long id){
		
		return this.papersInfoMapper.queryPapersInfoById(id);

	}

	@Autowired
	private PapersInfoMapper papersInfoMapper;
	
	/**
	 * 查询所有的试卷模块-试卷信息信息
	 * @return
	 */
	public List<PapersInfoVo> queryAllPapersInfo(){
		
		return this.papersInfoMapper.queryAllPapersInfo();
	
	}
				

	/**
	 * 根据条件查询所有试卷模块-试卷信息信息
	 * @param map
	 * @return
	 */
	public List<PapersInfoVo> queryPapersInfoBySearch(PapersInfoSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("paperName",search.getPaperName());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("status",search.getStatus());
		
		return this.papersInfoMapper.queryPapersInfoBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryPapersInfoPage(PageBean pb,PapersInfoSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("paperName",search.getPaperName());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("createName",search.getCreateName());
  		map.put("examType",search.getExamType());
  		map.put("isSubjective",search.getIsSubjective());
	
        // 设置PageBean的行数参数
        pb.setRows(this.papersInfoMapper.queryPapersInfoTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.papersInfoMapper.queryPapersInfoPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除试卷模块-试卷信息信息
	 * @param id
	 * @return
	 */
	public int deletePapersInfoById(PapersInfoBean bean){
		return this.papersInfoMapper.deletePapersInfoById(bean);
	}
	
				
	/**
	 * (更新)根据ID更新所有试卷模块-试卷信息信息
	 * @param bean
	 * @return
	 */
	public int updatePapersInfoById(PapersInfoBean bean){
		
		return this.papersInfoMapper.updatePapersInfoById(bean);
		
	}
	
				
	
	/**
	 * (增加)增加试卷模块-试卷信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertPapersInfo(PapersInfoBean bean){
	
		
		return this.papersInfoMapper.insertPapersInfo(bean);
		
	}
	
	
	
}
