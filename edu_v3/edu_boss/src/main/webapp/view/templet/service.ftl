package com.sjq.${dco.moduleName!''}.service;

import java.util.List;
import java.util.Map;

import com.sjq.${dco.moduleName!''}.bean.${dco.upperProjectName!''}${dco.upperModuleName!''}Bean;
import com.sjq.${dco.moduleName!''}.search.${dco.upperProjectName!''}${dco.upperModuleName!''}Search;
import com.sjq.${dco.moduleName!''}.vo.${dco.upperProjectName!''}${dco.upperModuleName!''}Vo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象${dco.codeComment!''}service层
 * @author  ShuiJingQiu
 * @since   ${.now?string("yyyy-MM-dd HH:mm:ss")}
 * @version 1.0
 */
 
public interface ${dco.upperProjectName!''}${dco.upperModuleName!''}Service {

	<#if dmvs?? && dmvs?size != 0>
		<#list dmvs as dmv>
			<#if dmv.methodClassType == 'S'>
				<#if dmv.methodCode == 'S_M_S1'>
	/**
	 * ${dmv.methodComment!''}
	 * @return 查询到的结果列表
	 */
	List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}();
				
				</#if>
				<#if dmv.methodCode == 'S_M_S2'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	${dco.upperProjectName!''}${dco.upperModuleName!''}Vo ${dmv.methodName!''}(Long id);
				
				</#if>
				<#if dmv.methodCode == 'S_M_S3'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(Long[] ids);
	
				</#if>
				<#if dmv.methodCode == 'S_M_S4'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Search search);
				
				</#if>
				<#if dmv.methodCode == 'S_M_S5'>
					
	/**
	 * ${dmv.methodComment!''}
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Search search);
	
				</#if>
				<#if dmv.methodCode == 'S_M_S6'>
	
	/**
	 * ${dmv.methodComment!''}
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean ${dmv.methodName!''}(PageBean pb,${dco.upperProjectName!''}${dco.upperModuleName!''}Search search);
				
				</#if>
				<#if dmv.methodCode == 'S_M_D1'>
	/**
	 * ${dmv.methodComment!''}
	 * @return
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
				
				</#if>
				<#if dmv.methodCode == 'S_M_D2'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param id
	 * @return
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
				
				</#if>
				<#if dmv.methodCode == 'S_M_D3'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,Long[] ids);
				
				</#if>
				<#if dmv.methodCode == 'S_M_D4'>
								
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,${dco.upperProjectName!''}${dco.upperModuleName!''}Search search);
				
				</#if>
				<#if dmv.methodCode == 'S_M_U1'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param vo 
	 * @return
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
				
				</#if>
				<#if dmv.methodCode == 'S_M_U2'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param bean
	 * @return
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
				
				</#if>
				<#if dmv.methodCode == 'S_M_U3'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	int ${dmv.methodName!''}(Long[] ids,${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
				
				</#if>
				<#if dmv.methodCode == 'S_M_U4'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param map
	 * @return
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,${dco.upperProjectName!''}${dco.upperModuleName!''}Search search);
				
				</#if>
				<#if dmv.methodCode == 'S_M_I1'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean);
				
				</#if>
			</#if>
		</#list>
	</#if>
	
}