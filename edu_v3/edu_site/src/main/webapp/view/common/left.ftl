<div class="side_bar fl">
	<ul>
		<a href="${basePath!''}/home.htm"><li class="one_li"><img src="${basePath!''}/images/首页-首页.png"><p>首页</p></li></a>
		
		<#assign menu = Session.SPRING_SECURITY_CONTEXT.authentication.principal.menumap>
		<#if menu?? && menu?size !=0>
			<#list menu as m>
				<a href="${basePath!''}${m.url!''}"><li><img src="${basePath!''}/images/${m.img_url!''}"><p>${m.name!''}</p></li></a>
			</#list>
		</#if>
		
		<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code!='ROLE_11' && Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code!='ROLE_10'  && Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code!='ROLE_01'>
			<a href="${basePath!''}/papers/mypapers/list.htm"><li><img src="${basePath!''}/images/组卷管理.png"><p>试卷管理</p></li></a>
			<a href="${basePath!''}/exam/online/manage/list.htm"><li><img src="${basePath!''}/images/考试管理.png"><p>考试管理</p></li></a>
		</#if>
		<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_11'>
			<a href="${basePath!''}/exam/online/student/list.htm?isSubmit=0"><li><img src="${basePath!''}/images/考试管理.png"><p>考试管理</p></li></a>
		</#if>
		<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_01' ||Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_09' || Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_11' || Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_10'>
			<a href="${basePath!''}/work/homework/list.htm"><li><img src="${basePath!''}/images/在线作业.png"><p>在线作业</p></li></a>
		</#if>
		<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_06'|| Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_07' || Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_08'||Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_09'||Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_10' ||Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_11'>
			<a href="${basePath!''}/archives/comment/list.htm"><li><img src="${basePath!''}/images/档案.png"><p>学业档案</p></li></a>
		</#if>
		<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_02' || Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_03' || Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='Role_7'>
			<a href="${basePath!''}/evaluate/paper/list.htm"><li><img src="${basePath!''}/images/问卷量表库.png"><p>问卷量表库</p></li></a>
		</#if>
		<a href="${basePath!''}/evaluate/eva/list.htm"><li><img src="${basePath!''}/images/测评管理.png"><p>测评管理</p></li></a>
		<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code!='ROLE_01'>
			<a href="${basePath!''}/bi/analysis/list.htm"><li><img src="${basePath!''}/images/分析诊断-(1).png"><p>统计分析</p></li></a>
		</#if>
			<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_02' || Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_03' || Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='Role_7'|| Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_06'|| Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_07'|| Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_08'|| Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_09'|| Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_11'>
			<a href="${basePath!''}/interlocution/ask/list.htm"><li class="no_border"><img src="${basePath!''}/images/答疑中心.png"><p>答疑中心</p></li></a>
		</#if>
		
		<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_02' ||  Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_03'||  Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='Role_7'>
		<a href="${basePath!''}/base/staff/list.htm"><li><img src="${basePath!''}/images/基础信息.png"><p>基础信息</p></li></a>
		</#if>
	</ul>
</div>