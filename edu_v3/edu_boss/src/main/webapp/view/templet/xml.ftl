<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="com.sjq.${dco.moduleName!''}.dao.${dco.upperProjectName!''}${dco.upperModuleName!''}Mapper">
	<resultMap id="BaseResultMap" type="com.sjq.${dco.moduleName!''}.vo.${dco.upperProjectName!''}${dco.upperModuleName!''}Vo">
		<#if dcpvs??>
  		<#list dcpvs as dcpv>
  		<result column="${dcpv.name!''}" property="${dcpv.lowerName!''}" jdbcType="${dcpv.jdbcType!''}" />
  		</#list>
  		</#if> 
	</resultMap>
	
	<sql id="Base_Column_List">
		<#if dcpvs??>
  		<#list dcpvs as dcpv>
  		${dcpv.name!''}<#if dcpv_index+1 != dcpvs?size>,</#if>
  		</#list>
  		</#if> 
	</sql>
	
	<#if dmvs?? && dmvs?size != 0>
		<#list dmvs as dmv>
			<#if dmv.methodClassType == 'D'>
				<#if dmv.methodCode == 'D_M_S1'>
	<!-- ${dmv.methodComment!''} -->
	<select id="${dmv.methodName!''}" resultMap="BaseResultMap" >
 	   select 
       <include refid="Base_Column_List" />
       from ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
       where delflag='0'
    </select>
	
				</#if>
				<#if dmv.methodCode == 'D_M_S2'>
	
	<!-- ${dmv.methodComment!''} -->
	<select id="${dmv.methodName!''}" resultMap="BaseResultMap" parameterType="java.lang.Long">
	   select 
       <include refid="Base_Column_List" />
       from ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
       where delflag='0' and id =${r"#{id,jdbcType=BIGINT}"}
    </select>
    
				</#if>
				<#if dmv.methodCode == 'D_M_S3'>    
    
	<!-- ${dmv.methodComment!''} -->
	<select id="${dmv.methodName!''}" resultMap="BaseResultMap"  parameterType="java.util.Map">
	   select 
       <include refid="Base_Column_List" />
       from ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
       where delflag='0' and id in 
	   <foreach collection="Ids" item="id" open="(" close=")" separator=",">
	   ${r"#{id}"}
	   </foreach>
	</select>     
	
				</#if>
				<#if dmv.methodCode == 'D_M_S4'>
					
	<!-- ${dmv.methodComment!''} -->
	<select id="${dmv.methodName!''}" resultMap="BaseResultMap"  parameterType="java.util.Map">
	   select 
       <include refid="Base_Column_List" />
       from ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
       where 1=1 
       <#if dcpvs??>
  	   <#list dcpvs as dcpv>
  	   <if test="${dcpv.lowerName!''} != null">
       		and ${dcpv.name!''} = ${r"#{"}${dcpv.lowerName!''}${r"}"}
       </if>
  	   </#list>
  	   </#if> 
	</select>
	
				</#if>
				<#if dmv.methodCode == 'D_M_S5'>
					
	<!-- ${dmv.methodComment!''} -->
	<select id="${dmv.methodName!''}" parameterType="java.util.Map" resultType="java.lang.Integer">
		select count(1) from
		${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''} where delflag='0'
       <#if dcpvs??>
  	   <#list dcpvs as dcpv>
  	   <if test="${dcpv.lowerName!''} != null">
       		and ${dcpv.name!''} =  ${r"#{"}${dcpv.lowerName!''}${r"}"}
       </if>
  	   </#list>
  	   </#if> 
	</select>
	

				</#if>
				<#if dmv.methodCode == 'D_M_S6'>
					
	<!-- ${dmv.methodComment!''} -->
	<select id="${dmv.methodName!''}" resultMap="BaseResultMap"  parameterType="java.util.Map">
		select   
	    <include refid="Base_Column_List" />
		from
		${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''} where delflag='0'
       <#if dcpvs??>
  	   <#list dcpvs as dcpv>
  	   <if test="${dcpv.lowerName!''} != null">
       		and ${dcpv.name!''} =  ${r"#{"}${dcpv.lowerName!''}${r"}"}
       </if>
  	   </#list>
  	   </#if> 
  	   limit ${r"#{startRowNum}"},${r"#{endRowNum}"}
	</select>

				</#if>
				<#if dmv.methodCode == 'D_M_D1'>
					
	<!-- ${dmv.methodComment!''}  -->
	<delete id="${dmv.methodName!''}"  parameterType="com.sjq.${dco.moduleName!''}.bean.${dco.upperProjectName!''}${dco.upperModuleName!''}Bean">
		update ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''} 
		<set> 
		<#if dcpvs??>
	  	  <#list dcpvs as dcpv>
	  	    <#if dcpv.name == 'mod_name' || dcpv.name == 'mod_time'> 
	  	    <if test="${dcpv.lowerName!''} != null">
	       	${dcpv.name!''} =  ${r"#{"}${dcpv.lowerName!''},jdbcType=${dcpv.jdbcType!''}${r"}"},
	        </if>
	        </#if>
	  	  </#list>
	  	</#if> 
		delflag = '1'
		</set>
	</delete>

				</#if>
				<#if dmv.methodCode == 'D_M_D2'>
					
	<!-- ${dmv.methodComment!''} --> 
	<delete id="${dmv.methodName!''}" parameterType="java.lang.Long">
		update ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''} 
		<set> 
		<#if dcpvs??>
	  	  <#list dcpvs as dcpv>
	  	    <#if dcpv.name == 'mod_name' || dcpv.name == 'mod_time'> 
	  	    <if test="${dcpv.lowerName!''} != null">
	       	${dcpv.name!''} =  ${r"#{"}${dcpv.lowerName!''},jdbcType=${dcpv.jdbcType!''}${r"}"},
	        </if>
	        </#if>
	  	  </#list>
	  	</#if> 
		delflag = '1'
		</set>
		where  id = ${r"#{id,jdbcType=BIGINT}"} 
	</delete>
	
				</#if>
				<#if dmv.methodCode == 'D_M_D3'>
					
	<!-- ${dmv.methodComment!''} -->
	<delete id="${dmv.methodName!''}"  parameterType="java.util.Map">
	   update 
       ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
       <set> 
		<#if dcpvs??>
	  	  <#list dcpvs as dcpv>
	  	    <#if dcpv.name == 'mod_name' || dcpv.name == 'mod_time'> 
	  	    <if test="bean.${dcpv.lowerName!''} != null">
	       	${dcpv.name!''} =  ${r"#{"}bean.${dcpv.lowerName!''},jdbcType=${dcpv.jdbcType!''}${r"}"},
	        </if>
	        </#if>
	  	  </#list>
	  	</#if> 
		delflag = '1'
		</set>
       where in 
	   <foreach collection="Ids" item="id" open="(" close=")" separator=",">
	   ${r"#{id}"}
	   </foreach>
	</delete>
	
				</#if>
				<#if dmv.methodCode == 'D_M_D4'>
					
	<!-- ${dmv.methodComment!''}  -->
	<delete id="${dmv.methodName!''}" parameterType="java.util.Map">
		update 
		${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
		<set> 
		<#if dcpvs??>
	  	  <#list dcpvs as dcpv>
	  	    <#if dcpv.name == 'mod_name' || dcpv.name == 'mod_time'> 
	  	    <if test="bean.${dcpv.lowerName!''} != null">
	       	${dcpv.name!''} =  ${r"#{"}bean.${dcpv.lowerName!''},jdbcType=${dcpv.jdbcType!''}${r"}"},
	        </if>
	        </#if>
	  	  </#list>
	  	</#if> 
		delflag = '1'
		</set>
		where 1=1
       <#if dcpvs??>
  	   <#list dcpvs as dcpv>
  	   <#if dcpv.name != 'create_name' || dcpv.name != 'create_time'> 
  	   <if test="search.${dcpv.lowerName!''} != null">
       		and ${dcpv.name!''} =  ${r"#{"}search.${dcpv.lowerName!''}${r"}"}
       </if>
       </#if>
  	   </#list>
  	   </#if> 
	</delete>
	
				</#if>
				<#if dmv.methodCode == 'D_M_U1'>
					
	<!-- ${dmv.methodComment!''} -->
	<update id="${dmv.methodName!''}" parameterType="com.sjq.${dco.moduleName!''}.bean.${dco.upperProjectName!''}${dco.upperModuleName!''}Bean">
		update ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
		<set>
			
	        <#if dcpvs??>
	  	    <#list dcpvs as dcpv>
	  	    <#if dcpv.name != 'create_name' && dcpv.name != 'create_time' && dcpv.name != 'id'> 
	  	    <if test="${dcpv.lowerName!''} != null">
	       	${dcpv.name!''} =  ${r"#{"}${dcpv.lowerName!''},jdbcType=${dcpv.jdbcType!''}${r"}"},
	        </if>
	        </#if>
	  	    </#list>
	  	    </#if> 
		</set>
	</update>
	
				</#if>
				<#if dmv.methodCode == 'D_M_U2'>
					
	<!-- ${dmv.methodComment!''} -->
	<update id="${dmv.methodName!''}" parameterType="com.sjq.${dco.moduleName!''}.bean.${dco.upperProjectName!''}${dco.upperModuleName!''}Bean" >
		update ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
		<set>
	        <#if dcpvs??>
	  	    <#list dcpvs as dcpv>
	  	    <#if dcpv.name != 'create_name' && dcpv.name != 'create_time' && dcpv.name != 'id'> 
	  	    <if test="${dcpv.lowerName!''} != null">
	       	${dcpv.name!''} =  ${r"#{"}${dcpv.lowerName!''},jdbcType=${dcpv.jdbcType!''}${r"}"},
	        </if>
	        </#if>
	  	    </#list>
	  	    </#if> 
		</set>
		where 1 = 1 and id = ${r"#{id,jdbcType=BIGINT}"} 
	</update>
	
				</#if>
				<#if dmv.methodCode == 'D_M_U3'>
					
	<!-- ${dmv.methodComment!''} -->
	<update id="${dmv.methodName!''}"  parameterType="java.util.Map">
		update ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
		<set>
	        <#if dcpvs??>
	  	    <#list dcpvs as dcpv>
	  	    <#if dcpv.name != 'create_name' && dcpv.name != 'create_time' && dcpv.name != 'id'> 
	  	    <if test="bean.${dcpv.lowerName!''} != null">
	       	${dcpv.name!''} =  ${r"#{"}bean.${dcpv.lowerName!''},jdbcType=${dcpv.jdbcType!''}${r"}"},
	        </if>
	        </#if>
	  	    </#list>
	  	    </#if> 
		</set>
		where 1 = 1 and id in 
	   <foreach collection="Ids" item="id" open="(" close=")" separator=",">
	   ${r"#{id}"}
	   </foreach>
	</update>
	
				</#if>
				<#if dmv.methodCode == 'D_M_U4'>
					
	<!-- ${dmv.methodComment!''} -->
	<update id="${dmv.methodName!''}"  parameterType="java.util.Map" >
		update ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
		<set>
	        <#if dcpvs??>
	  	    <#list dcpvs as dcpv>
	  	    <#if dcpv.name != 'create_name' && dcpv.name != 'create_time' && dcpv.name != 'id'> 
	  	    <if test="bean.${dcpv.lowerName!''} != null">
	       	${dcpv.name!''} =  ${r"#{"}bean.${dcpv.lowerName!''},jdbcType=${dcpv.jdbcType!''}${r"}"},
	        </if>
	        </#if>
	  	    </#list>
	  	    </#if> 
		</set>
		where 1=1
       <#if dcpvs??>
  	   <#list dcpvs as dcpv>
  	   <if test="search.${dcpv.lowerName!''} != null">
       		and ${dcpv.name!''} = ${r"#{"}search.${dcpv.lowerName!''}${r"}"}
       </if>
  	   </#list>
  	   </#if> 
	</update>
	
				</#if>
				<#if dmv.methodCode == 'D_M_I1'>
					
	<!-- ${dmv.methodComment!''} --> 
	<insert id="${dmv.methodName!''}" parameterType="com.sjq.${dco.moduleName!''}.bean.${dco.upperProjectName!''}${dco.upperModuleName!''}Bean">
		insert into ${dco.tableTop!''}_${dco.lowerProjectName!''}_${dco.lowerModuleName!''}
		<trim prefix="(" suffix=")" suffixOverrides=",">
	       <#if dcpvs??>
	  	   <#list dcpvs as dcpv>
	  	   <#if dcpv.name != 'mod_name' && dcpv.name != 'mod_time'> 
	  	   <if test="${dcpv.lowerName!''} != null">
	       	${dcpv.name!''},
	       </if>
	       </#if>
	  	   </#list>
	  	   </#if> 
		</trim>
		<trim prefix="values (" suffix=")" suffixOverrides=",">
	        <#if dcpvs??>
	  	    <#list dcpvs as dcpv>
	  	    <#if dcpv.name != 'mod_name' && dcpv.name != 'mod_time'> 
	  	    <if test="${dcpv.lowerName!''} != null">
	       		${r"#{"}${dcpv.lowerName!''},jdbcType=${dcpv.jdbcType!''}${r"}"},
	        </if>
	        </#if>
	  	    </#list>
	  	    </#if> 
		</trim>
	</insert>
				</#if>
			</#if>
		</#list>
	</#if>
    
	   
</mapper>