package com.sjq.${dco.moduleName!''}.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper;
import com.sjq.${dco.moduleName!''}.service.${dco.upperProjectName!''}${dco.upperModuleName!''}Service;
import com.sjq.${dco.moduleName!''}.bean.${dco.upperProjectName!''}${dco.upperModuleName!''}Bean;
import com.sjq.${dco.moduleName!''}.search.${dco.upperProjectName!''}${dco.upperModuleName!''}Search;
import com.sjq.${dco.moduleName!''}.vo.${dco.upperProjectName!''}${dco.upperModuleName!''}Vo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现${dco.codeComment!''}service层
 * @author  ShuiJingQiu
 * @since   ${.now?string("yyyy-MM-dd HH:mm:ss")}
 * @version 1.0
 */
 
@Service("${dco.upperProjectName!''}${dco.upperModuleName!''}Service")
public class ${dco.upperProjectName!''}${dco.upperModuleName!''}ServiceImpl implements ${dco.upperProjectName!''}${dco.upperModuleName!''}Service {
	

	@Autowired
	private ${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper ${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper;
	
	<#if dmvs?? && dmvs?size != 0>
		<#list dmvs as dmv>
			<#if dmv.methodClassType == 'S'>
				<#if dmv.methodCode == 'S_M_S1'>
	/**
	 * ${dmv.methodComment!''}
	 * @return
	 */
	public List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(){
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}();
	
	}
				
				</#if>
				<#if dmv.methodCode == 'S_M_S2'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @return
	 */
	public ${dco.upperProjectName!''}${dco.upperModuleName!''}Vo ${dmv.methodName!''}(Long id){
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(id);

	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_S3'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	public List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(map);
	}
	
			    </#if>
				<#if dmv.methodCode == 'S_M_S4'>

	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	public List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Search search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		<#if dcpvs??>
  		<#list dcpvs as dcpv>
  		<#if dcpv.isSearch == '1'>
  		map.put("${dcpv.lowerName}",search.get${dcpv.upperName}());
  		</#if>
		</#list>
		</#if>
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(map);
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_S5'>
	
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Search search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		<#if dcpvs??>
  		<#list dcpvs as dcpv>
  		<#if dcpv.isSearch == '1'>
  		map.put("${dcpv.lowerName}",search.get${dcpv.upperName}());
  		</#if>
		</#list>
		</#if>
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(map);
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_S6'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean ${dmv.methodName!''}(PageBean pb,${dco.upperProjectName!''}${dco.upperModuleName!''}Search search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
		<#if dcpvs??>
  		<#list dcpvs as dcpv>
  		<#if dcpv.isSearch == '1'>
  		map.put("${dcpv.lowerName}",search.get${dcpv.upperName}());
  		</#if>
		</#list>
		</#if>
	
        // 设置PageBean的行数参数
        pb.setRows(this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.query${dco.upperProjectName!''}${dco.upperModuleName!''}TotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.query${dco.upperProjectName!''}${dco.upperModuleName!''}Page(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_D1'>
				
				
	/**
	 * ${dmv.methodComment!''}
	 * @return
	 */
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(bean);
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_D2'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @param id
	 * @return
	 */
	public int delete${dco.upperProjectName!''}${dco.upperModuleName!''}ById(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(bean);
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_D3'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(map);
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_D4'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,${dco.upperProjectName!''}${dco.upperModuleName!''}Search search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(map);
		
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_U1'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @param bean
	 * @return
	 */
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
	
		return ${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(bean);
		
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_U2'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param bean
	 * @return
	 */
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(bean);
		
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_U3'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	public int ${dmv.methodName!''}(Long[] ids,${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
		
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(map);
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_U4'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,${dco.upperProjectName!''}${dco.upperModuleName!''}Search search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(map);
	}
	
				</#if>
				<#if dmv.methodCode == 'S_M_I1'>
				
	
	/**
	 * ${dmv.methodComment!''}
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
	
		
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}(bean);
		
	}
	
				</#if>
			</#if>
		</#list>
	</#if>
	
	
}
