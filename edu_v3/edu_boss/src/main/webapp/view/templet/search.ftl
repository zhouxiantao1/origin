package com.sjq.${dco.moduleName!''}.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]${dco.codeComment!''}Search
 * @author  ShuiJingQiu
 * @since   ${.now?string("yyyy-MM-dd HH:mm:ss")}
 * @version 1.0
 */

public class ${dco.upperProjectName!''}${dco.upperModuleName!''}Search{

	<#if dcpvs??>
	<#list dcpvs as dcpv>
	<#if dcpv.isSearch == '1'>
	private ${dcpv.beanType!''} ${dcpv.lowerName!''}; /* ${dcpv.comment!''} */
	</#if>
	</#list>
	</#if>
	
	<#if dcpvs??>
	<#list dcpvs as dcpv>
	<#if dcpv.isSearch == '1'>
	public ${dcpv.beanType!''} get${dcpv.upperName!''}() {
		return ${dcpv.lowerName!''};
	}

	public void set${dcpv.upperName!''}(${dcpv.beanType!''} ${dcpv.lowerName!''}) {
		this.${dcpv.lowerName!''} = ${dcpv.lowerName!''};
	} 
	</#if>
	</#list>
	</#if>


}