<div class="header">
	<div class="top_fix clearfix">
		<h1 class="fl"><img src="${basePath!''}/images/logo1.png"></h1>
		<!-- <h3 class="fl"><span>|</span>个人中心</h3> -->
		<div class="head_pic fr">
			<div class="fl head_name">
				${Session.SPRING_SECURITY_CONTEXT.authentication.principal.username!'xxx'}<i></i>
				<div class="set">
					<p class="object"><span class='role_name'>${Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.name!'xxx'}</span></p>
					<p class="my_set"><em></em>个人中心</p>
					<p class="quiet"><em></em><a href="${basePath}/log/operation/list.htm">操作日志</a></p>
					<p class="quiet"><em></em><a href="${basePath}/j_spring_security_logout">退出登录</a></p>
					<div class="arr"></div>
				</div>
			</div>
			<span class="fr"><img src="${basePath!''}/images/头像圆.png"></span>
		</div>
	</div>
</div>
<div class="banner">
	<div class="bn_content">
		<dl class="clearfix">
			<dt class="fl"><img src="${basePath!''}/images/头像方.png"></dt>
			<dd class="fl">
				<div class="reduce">
					<h3>
					${Session.SPRING_SECURITY_CONTEXT.authentication.principal.nameOfUser!'xxx'}
					<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code == 'ROLE_09'>
						(老师)
					</#if>
					<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code == 'ROLE_10'>
						(家长)
					</#if>
					<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code == 'ROLE_11'>
						(学生)
					</#if>
					</h3>
					<div>
						<p class="fl"><i class="posi"></i>广州</p>
						<p class="fl"><i class="school"></i>广州师范学院</p>
						<p class="fl"><i class="email"></i>guangzhou@cp.com</p>
					</div>
				</div>
			</dd>
		</dl>
	</div>
</div>