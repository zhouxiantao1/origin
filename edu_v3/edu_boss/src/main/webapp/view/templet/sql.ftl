
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}`
-- ----------------------------
DROP TABLE IF EXISTS `${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}`;
CREATE TABLE `${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}` (
  		<#if dcpvs??>
  		<#list dcpvs as dcpv>
  		<#if dcpv.name == 'id'>
  		`${dcpv.name}` bigint(20) <#if dcpv.def??>DEFAULT ${dcpv.def}</#if> <#if dcpv.isNull == '0'> NULL <#else> NOT NULL </#if>  AUTO_INCREMENT  <#if dcpv.comment??>COMMENT '${dcpv.comment}'</#if>,
  		<#else>
  		`${dcpv.name}` ${dcpv.type}<#if dcpv.length??>${dcpv.length}</#if> <#if dcpv.def??> DEFAULT ${dcpv.def}</#if> <#if dcpv.isNull == '0'> NULL <#else> NOT NULL </#if>  <#if dcpv.comment??>COMMENT '${dcpv.comment}'</#if>,
  		</#if>
  		</#list>
  		</#if> 
  		PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


