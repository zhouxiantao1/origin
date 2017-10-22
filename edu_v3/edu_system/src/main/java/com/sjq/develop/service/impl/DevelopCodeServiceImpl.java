package com.sjq.develop.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjq.develop.bean.DevelopCodeBean;
import com.sjq.develop.bean.DevelopCodePropertyBean;
import com.sjq.develop.dao.DevelopCodeMapper;
import com.sjq.develop.dao.DevelopCodePropertyMapper;
import com.sjq.develop.search.DevelopCodeSearch;
import com.sjq.develop.service.DevelopCodeService;
import com.sjq.develop.vo.DevelopCodeVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现代码生成模块service层
 * @author Zheng.ZeJie
 * @since  
 * @version 1.0
 */

@Service("DevelopCodeService")
public class DevelopCodeServiceImpl implements DevelopCodeService {
	

	@Autowired
	private DevelopCodeMapper developCodeMapper;
	
	@Autowired
	private DevelopCodePropertyMapper developCodePropertyMapper;
	
	
	/**
	 * (查询)查询所有的信息
	 * @return
	 */
	
	public List<DevelopCodeVo> selectAll(){
		
		return this.developCodeMapper.selectAll();
	
	}
	
	/**
	 * (查询)根据ID查询所有信息
	 * @return
	 */
	
	public DevelopCodeVo queryCodeById(Long id){
		
		return this.developCodeMapper.queryCodeById(id);

	}
	
	/**
	 * (查询)根据IDS查询所有信息
	 * @param map
	 * @return
	 */
	
	public List<DevelopCodeVo> queryCodeByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return developCodeMapper.queryCodeByIds(map);
	}

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map
	 * @return
	 */
	
	public List<DevelopCodeVo> queryCodeBySearch(DevelopCodeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", search.getId());
		map.put("createTime", search.getCreateTime());
		map.put("createName", search.getCreateName());
		map.put("modTime", search.getModTime());
		map.put("modName", search.getModName());
		map.put("codeName",search.getCodeName());
		map.put("projectName;",search.getProjectName());
		map.put("moduleName",search.getModuleName());
		map.put("codeComment",search.getCodeComment());
		
		
		return this.developCodeMapper.queryCodeBySearch(map);
	}
	
	/**
	 * (查询)根据条件查询count总数
	 * @param map
	 * @return
	 */
	
	public int queryTotalCount(DevelopCodeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", search.getId());
		map.put("createTime", search.getCreateTime());
		map.put("createName", search.getCreateName());
		map.put("modTime", search.getModTime());
		map.put("modName", search.getModName());
		map.put("codeName",search.getCodeName());
		map.put("projectName;",search.getProjectName());
		map.put("moduleName",search.getModuleName());
		map.put("codeComment",search.getCodeComment());
		
		return this.developCodeMapper.queryTotalCount(map);
	}
	
	
	/**
	 * （查询）分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	
	public PageBean queryPage(PageBean pb,DevelopCodeSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", search.getId());
		map.put("createTime", search.getCreateTime());
		map.put("createName", search.getCreateName());
		map.put("modTime", search.getModTime());
		map.put("modName", search.getModName());
		map.put("codeName",search.getCodeName());
		map.put("projectName;",search.getProjectName());
		map.put("moduleName",search.getModuleName());
		map.put("codeComment",search.getCodeComment());
	
        // 设置PageBean的行数参数
        pb.setRows(this.developCodeMapper.queryTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.developCodeMapper.queryByPageBean(map));
           
        // 返回pageBean
        return pb;
		
	}
	
	/**
	 * (删除)删除所有的 信息
	 * @return
	 */
	
	public int deleteAll(){
		return this.developCodeMapper.deleteAll();
	}
	
	/**
	 * (删除)根据ID删除信息
	 * @param id
	 * @return
	 */
	
	public int deleteCodeById(Long id){
		return this.developCodeMapper.deleteCodeById(id);
	}
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map
	 * @return
	 */
	
	public int deleteCodeByIds(Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.developCodeMapper.deleteCodeByIds(map);
	}
	
	/**
	 * (删除)根据条件删除信息
	 * @param map
	 * @return
	 */
	
	public int deleteCodeBySearch(DevelopCodeSearch search){
		return 0;
	}
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param bean
	 * @return
	 */
	
	public int updateCode(DevelopCodeBean bean){
		return developCodeMapper.updateCode(bean);
	}
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean
	 * @return
	 */
	
	public int updateCodeById(DevelopCodeBean bean){
		
		return this.developCodeMapper.updateCodeById(bean);
		
	}
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map
	 * @return
	 */
	
	public int updateCodeByIds(Long[] ids,DevelopCodeBean bean){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		map.put("createTime", bean.getCreateTime());
		map.put("createName", bean.getCreateName());
		map.put("modTime", bean.getModTime());
		map.put("modName", bean.getModName());
		
		return this.developCodeMapper.updateCodeByIds(map);
	}
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map
	 * @return
	 */
	
	public int updateCodeBySearch(DevelopCodeBean bean,DevelopCodeSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.developCodeMapper.updateCodeBySearch(map);
	}
	
	/**
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	
	@Transactional
	public int insertDevelopCode(DevelopCodeBean bean){
		
		//先创建开发任务
		this.developCodeMapper.insertCode(bean);
		
		//创建5个默认的属性性
		DevelopCodePropertyBean pBean = new DevelopCodePropertyBean();
		pBean.setCreateName("系统默认生成");
		pBean.setCodeId(bean.getId());
		
		//id
		pBean.setName("id");
		pBean.setType("bigint");
		pBean.setLength("(20)");
		pBean.setIsNull("1");
		pBean.setComment("自增id");
		pBean.setDef("");
		pBean.setIsSearch("1");
		this.developCodePropertyMapper.insertDevelopCodeProerty(pBean);
		
		
		//创建人
		pBean.setName("create_name");
		pBean.setType("varchar");
		pBean.setLength("(100)");
		pBean.setIsNull("1");
		pBean.setComment("(默认)创建人");
		pBean.setDef("");
		pBean.setIsSearch("0");
		this.developCodePropertyMapper.insertDevelopCodeProerty(pBean);
		
		//创建时间
		pBean.setName("create_time");
		pBean.setType("datetime");
		pBean.setLength("");
		pBean.setIsNull("1");
		pBean.setComment("(默认)创建时间");
		pBean.setDef("");
		pBean.setIsSearch("0");
		this.developCodePropertyMapper.insertDevelopCodeProerty(pBean);
		
		//修改人
		pBean.setName("mod_name");
		pBean.setType("varchar");
		pBean.setLength("(100)");
		pBean.setIsNull("0");
		pBean.setComment("(默认)修改人");
		pBean.setDef("");
		pBean.setIsSearch("0");
		this.developCodePropertyMapper.insertDevelopCodeProerty(pBean);
		
		//修改时间
		pBean.setName("mod_time");
		pBean.setType("datetime");
		pBean.setLength("");
		pBean.setIsNull("0");
		pBean.setComment("(默认)修改时间");
		pBean.setDef("");
		pBean.setIsSearch("0");
		this.developCodePropertyMapper.insertDevelopCodeProerty(pBean);
		
		//删除标识
		pBean.setName("delflag");
		pBean.setType("enum");
		pBean.setLength("('0','1')");
		pBean.setIsNull("1");
		pBean.setComment("(默认)删除标识");
		pBean.setDef("'0'");
		pBean.setIsSearch("1");
		this.developCodePropertyMapper.insertDevelopCodeProerty(pBean);
		
	
		return 1;
		
	}
	
	
}
