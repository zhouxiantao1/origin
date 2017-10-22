<div class="headers">
	<div class="head_mid">
		<div class="top_fix clearfix">
			<h1 class="fl"><img src="${basePath!''}/images/logo_big.png"></h1>
			<!-- <h3 class="fl"><span>|</span>个人中心</h3> -->
			<div class="head_pic fr">
				<div class="fl head_name">
					${Session.SPRING_SECURITY_CONTEXT.authentication.principal.username!'xxx'}<i></i>
					<div class="set">
						<p class="object"><span class='role_name'>${Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.name!'xxx'}</span></p>
						<p class="my_set"><em></em>个人中心</p>
						<p class="operate_daily"><em></em><a href="${basePath}/log/operation/list.htm">操作日志</a></p>
						<p class="quiet"><em></em><a href="${basePath}/j_spring_security_logout">退出登录</a></p>
						<div class="arr"></div>
					</div>
				</div>
				<span class="fr"><img src="${basePath!''}/images/头像圆.png"></span>
			</div>
		</div>
	</div>
	<div class="head_nav">
		<ul class="clearfix">
			<li><a  href="${basePath!''}/home.htm">首页</a></li>
				<#assign menu = Session.SPRING_SECURITY_CONTEXT.authentication.principal.menumap>
				<#if menu?? && menu?size !=0>
					<#list menu as m>
						<li><a href="${basePath!''}${m.url!''}">${m.name!''}</a></li>
					</#list>
				</#if>
				<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code!='ROLE_11' && Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code!='ROLE_10'  && Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code!='ROLE_01'>
					<li><a href="${basePath!''}/papers/mypapers/list.htm">试卷管理</a></li>
					<li><a href="${basePath!''}/exam/online/manage/list.htm">考试管理</a></li>
				</#if>
				<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code=='ROLE_11'>
					<li><a href="${basePath!''}/exam/online/student/list.htm?isSubmit=0">考试管理</a></li>
				</#if>
				
				<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code!='ROLE_01'>
					<li><a href="${basePath!''}/bi/analysis/list.htm">统计分析</a></li>
				</#if>
				
				
		</ul>
	</div>
</div>