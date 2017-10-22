package com.sjq.${dco.moduleName!''}.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.${dco.moduleName!''}.vo.${dco.upperProjectName!''}${dco.upperModuleName!''}Vo;
import com.sjq.${dco.moduleName!''}.bean.${dco.upperProjectName!''}${dco.upperModuleName!''}Bean;
import com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper;

/**
 * [自动生成]${dco.codeComment!''}DAO实现
 * @author  ShuiJingQiu
 * @since   ${.now?string("yyyy-MM-dd HH:mm:ss")}
 * @version 1.0
 */
@Repository("${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper")
public class ${dco.upperProjectName!''}${dco.upperModuleName!''}MapperImpl extends BasicSqlSupport implements ${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper {

	<#if dmvs?? && dmvs?size != 0>
		<#list dmvs as dmv>
			<#if dmv.methodClassType == 'D'>
				<#if dmv.methodCode == 'D_M_S1'>
	/**
	 * ${dmv.methodComment!''}
	 * @return 查询到的列表
	 */
	public List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(){
	     return this.selectList("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}");
	}
				
				</#if>
				<#if dmv.methodCode == 'D_M_S2'>
	/**
	 * ${dmv.methodComment!''}
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ${dco.upperProjectName!''}${dco.upperModuleName!''}Vo ${dmv.methodName!''}(Long id){
	    return this.selectOne("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}",id);
	}

				</#if>
				<#if dmv.methodCode == 'D_M_S3'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo>  ${dmv.methodName!''}(Map<String, Object> map){
		return this.selectList("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}",map);
	}

				</#if>
				<#if dmv.methodCode == 'D_M_S4'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo>  ${dmv.methodName!''}(Map<String, Object> map){
		return this.selectList("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}",map);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_S5'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  ${dmv.methodName!''}(Map<String, Object> map){
	    return this.selectOne("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}",map);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_S6'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  ${dmv.methodName!''}(Map<String, Object> map){
		return this.selectList("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}",map);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_D1'>
	/**
	 * ${dmv.methodComment!''}
	 * @return  受删除影响的行数
	 */
	public int  ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
	    return this.delete("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}",bean);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_D2'>
	/**
	 * ${dmv.methodComment!''}
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
		return this.delete("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}",bean);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_D3'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  ${dmv.methodName!''}(Map<String, Object> map){
		return this.delete("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}",map);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_D4'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  ${dmv.methodName!''}(Map<String, Object> map){
		return this.delete("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}",map);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_U1'>
	/**
	 * ${dmv.methodComment!''}
	 * @param bean ${dco.codeComment!''}实体
	 * @return     受更新影响的行数
	 */
	public int  ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
	    return this.update("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}", bean);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_U2'>
	/**
	 * ${dmv.methodComment!''}
	 * @param bean ${dco.codeComment!''}实体
	 * @return     受更新影响的行数
	 */
	public int  ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
	    return this.update("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}", bean);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_U3'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	public int  ${dmv.methodName!''}(Map<String, Object> map){
	    return this.update("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}", map);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_U4'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  ${dmv.methodName!''}(Map<String, Object> map){
	    return this.update("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}", map);
	}
	
				</#if>
				<#if dmv.methodCode == 'D_M_I1'>
	/**
	 * ${dmv.methodComment!''}
	 * @param bean ${dco.codeComment!''}实体
	 * @return     受增加影响的行数
	 */
	public int  ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean){
		return this.insert("com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper.${dmv.methodName!''}", bean);
	}
	
				</#if>
			</#if>
		</#list>
	</#if>
	

}