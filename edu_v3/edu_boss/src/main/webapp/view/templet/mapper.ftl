package com.sjq.${dco.moduleName!''}.dao;

import java.util.List;
import java.util.Map;
import com.sjq.${dco.moduleName!''}.vo.${dco.upperProjectName!''}${dco.upperModuleName!''}Vo;
import com.sjq.${dco.moduleName!''}.bean.${dco.upperProjectName!''}${dco.upperModuleName!''}Bean;

/**
 * [自动生成]抽象${dco.codeComment!''}Dao层
 * @author  ShuiJingQiu
 * @since   ${.now?string("yyyy-MM-dd HH:mm:ss")}
 * @version 1.0
 */
public interface ${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper {


	<#if dmvs?? && dmvs?size != 0>
		<#list dmvs as dmv>
			<#if dmv.methodClassType == 'D'>
				<#if dmv.methodCode == 'D_M_S1'>
	/**
	 * ${dmv.methodComment!''}
	 * @return 查询到的列表
	 */
	List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}();
	
				</#if>
				<#if dmv.methodCode == 'D_M_S2'>
	/**
	 * ${dmv.methodComment!''}
	 * @param id 标识
	 * @return   查询到的列表
	 */
	${dco.upperProjectName!''}${dco.upperModuleName!''}Vo ${dmv.methodName!''}(Long id);
	
				</#if>
				<#if dmv.methodCode == 'D_M_S3'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(Map<String, Object> map);	
			
				</#if>
				<#if dmv.methodCode == 'D_M_S4'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(Map<String, Object> map);
	
				</#if>
				<#if dmv.methodCode == 'D_M_S5'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int ${dmv.methodName!''}(Map<String, Object> map);
	
				</#if>
				<#if dmv.methodCode == 'D_M_S6'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> ${dmv.methodName!''}(Map<String, Object> map);
	
				</#if>
				<#if dmv.methodCode == 'D_M_D1'>
	/**
	 * ${dmv.methodComment!''}
	 * @return  受删除影响的行数
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
	
				</#if>
				<#if dmv.methodCode == 'D_M_D2'>
	/**
	 * ${dmv.methodComment!''}
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
	
				</#if>
				<#if dmv.methodCode == 'D_M_D3'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int ${dmv.methodName!''}(Map<String, Object> map);
		
				</#if>
				<#if dmv.methodCode == 'D_M_D4'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int ${dmv.methodName!''}(Map<String, Object> map);
	
				</#if>
				<#if dmv.methodCode == 'D_M_U1'>
	/**
	 * ${dmv.methodComment!''}
	 * @param bean ${dco.codeComment}实体
	 * @return     受更新影响的行数
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
	
				</#if>
				<#if dmv.methodCode == 'D_M_U2'>
	/**
	 * ${dmv.methodComment!''}
	 * @param bean ${dco.codeComment}实体
	 * @return     受更新影响的行数
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
	
				</#if>
				<#if dmv.methodCode == 'D_M_U3'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	int ${dmv.methodName!''}(Map<String, Object> map);
	
				</#if>
				<#if dmv.methodCode == 'D_M_U4'>
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int ${dmv.methodName!''}(Map<String, Object> map);
	
				</#if>
				<#if dmv.methodCode == 'D_M_I1'>
	/**
	 * ${dmv.methodComment!''}
	 * @param bean ${dco.codeComment}实体
	 * @return     受增加影响的行数
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);

				</#if>
			</#if>
		</#list>
	</#if>
	
}