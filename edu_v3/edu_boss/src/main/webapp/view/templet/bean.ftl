package com.sjq.${dco.moduleName!''}.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]${dco.codeComment}bean
 * @author  ShuiJingQiu
 * @since   ${.now?string("yyyy-MM-dd HH:mm:ss")}
 * @version 1.0
 */

public class ${dco.upperProjectName!''}${dco.upperModuleName!''}Bean{


	<#if dcpvs??>
	<#list dcpvs as dcpv>
	private ${dcpv.beanType!''} ${dcpv.lowerName!''}; /* ${dcpv.comment!''} */
	</#list>
	</#if>
	
	<#if dcpvs??>
	<#list dcpvs as dcpv>
	public ${dcpv.beanType!''} get${dcpv.upperName!''}() {
		return ${dcpv.lowerName!''};
	}

	public void set${dcpv.upperName!''}(${dcpv.beanType!''} ${dcpv.lowerName!''}) {
		this.${dcpv.lowerName!''} = ${dcpv.lowerName!''};
	} 
	</#list>
	</#if>


}