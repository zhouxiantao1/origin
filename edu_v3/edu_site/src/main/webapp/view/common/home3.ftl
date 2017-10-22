<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>首页-spec</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/personal_index.css">
</head>
<body>
<!-- 引入公共头部 -->
<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
		
			<#include '/common/left.ftl' /> 
						
			<div class="content_mid fl">
			
				<!-- 教管员 -->
				<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code == 'Role_7' || Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code == 'ROLE_04'>
				<div class="my_paper one_module fl">
					<div class="my_title clearfix">
						<span class="fl green_back"></span>
						<a href="${basePath!''}/exam/online/manage/list/newexam.htm"><h3 class="fl green_color">我的卷子</h3></a>
					</div>
					<div class="pd">
						<div class="back_img go_fabu">
							<a href="${basePath!''}/exam/online/manage/list/newexam.htm"><h3>去发布<span>${eiv?size!'0'}</span><i>已发布卷子</i></h3></a>
						</div>

						<div class="xiugai">
							<div class="clearfix hr">
								<h3 class="fl">最近修改</h3>
								<span class="fr"></span>
							</div>
							<ul class="show_list">
							<#if eiv?? && eiv?size != 0>
								<#list eiv as ei>
									<#if ei_index &lt; 7>
										<li class="clearfix"><p class="fl">${ei.examName!''}</p></li>
									</#if>
								</#list>
							<#else>
								暂无试卷信息~~
							</#if>
							</ul>
						</div>
					</div>
				</div>
				<div class="my_paper one_module fl">
					<div class="my_title clearfix">
						<span class="fl blue_back"></span>
						<h3 class="fl blue_color">测试管理</h3>
					</div>
					<div class="pd">
						<div class="back_img go_question">
							<a href="${basePath!''}/evaluate/eva/create.htm?"><h3>去发布<span>${ess?size}</span><i>已发布测评</i></h3></a>
						</div>

						<div class="xiugai">
							<div class="clearfix hr">
								<a href="${basePath!''}/evaluate/eva/create.htm"><h3 class="fl">最新发布</h3></a>
								<span class="fr"></span>
							</div>
							<ul class="show_list">
							<#if ess?? && ess?size != 0>
							<#list ess as es>
								<li class="clearfix"><p class="fl">${es.name!''}</p></li>
							</#list>
							<#else>
								暂无测评信息!
							</#if>
							</ul>
						</div>
					</div>
				</div>
				</#if>
				
				
				<!-- 老师 -->
				<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code == 'ROLE_09'>
				<div class="my_paper one_module fl">
					<div class="my_title clearfix">
						<span class="fl green_back"></span>
						<h3 class="fl green_color">我的卷子</h3>
					</div>
					<div class="pd">
						<div class="back_img go_fabu">
							<a href="${basePath!''}/exam/online/manage/list/newexam.htm"><h3>去发布<span>${eiv?size!'0'}</span><i>已发布卷子</i></h3></a>
						</div>

						<div class="xiugai">
							<div class="clearfix hr">
								<h3 class="fl">最近修改</h3>
								<span class="fr"></span>
							</div>
							<ul class="show_list">
							<#if eiv?? && eiv?size != 0>
								<#list eiv as ei>
									<#if ei_index &lt; 7>
										<li class="clearfix"><p class="fl">${ei.examName!''}</p></li>
									</#if>
								</#list>
							<#else>
								暂无试卷信息~~
							</#if>
							</ul>
						</div>
					</div>
				</div>
				
				<div class="my_paper one_module fl">
					<div class="my_title clearfix">
						<span class="fl blue_back"></span>
						<h3 class="fl blue_color">我的回答</h3>
					</div>
					<div class="pd">
						<div class="back_img go_question">
							<a href="${basePath!''}/interlocution/ask/list.htm"><h3>去广场<span>${ipb.rows!'0'}</span><i>已回答问题</i></h3></a>
						</div>

						<div class="xiugai">
							<div class="clearfix hr">
								<h3 class="fl">最近修改</h3>
								<span class="fr"></span>
							</div>
							<ul class="show_list">
							<#if ipb.list?? && ipb.list?size != 0>
								<#list ipb.list as il>
									<li class="clearfix"><p class="fl">${il.interlocutionAskVo.title!''}</p><span class="fr"><a href="${basePath!''}/interlocution/ask/detail.htm?id=${il.interlocutionAskVo.id!''}">查看详情</a></span></li>
								</#list>
							<#else>
								暂无问答信息~~
							</#if>
							</ul>
						</div>
					</div>
				</div>
				</#if>
				
				
				<!-- 家长 与 学生 -->
				<#if Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.code == 'ROLE_11'>
				<div class="my_paper one_module fl">
					<div class="my_title clearfix">
						<span class="fl green_back"></span>
						<h3 class="fl green_color">我的卷子</h3>
					</div>
					<div class="pd">
						<div class="back_img go_fabu">
							<a href="${basePath!''}/exam/online/student/list.htm?isSubmit=0"><h3>去考试<span>${epb.rows!'0'}</span><i>已发布卷子</i></h3></a>
						</div>

						<div class="xiugai">
							<div class="clearfix hr">
								<h3 class="fl">最近修改</h3>
								<span class="fr"></span>
							</div>
							<ul class="show_list">
								<#if epb.mlist?? && epb.mlist?size != 0>
									<#list epb.mlist as ml>
										<li class="clearfix"><p class="fl">${ml.detail_name!''}</p></li>
									</#list>
								<#else>
									暂无考试信息~~
								</#if>
							</ul>
						</div>
					</div>
				</div>
				<div class="my_paper one_module fl">
					<div class="my_title clearfix">
						<span class="fl blue_back"></span>
						<h3 class="fl blue_color">我的回答</h3>
					</div>
					<div class="pd">
						<div class="back_img go_question">
							<a href="${basePath!''}/interlocution/ask/list.htm"><h3>去广场<span>${ipb.rows!'0'}</span><i>已回答问题</i></h3></a>
						</div>

						<div class="xiugai">
							<div class="clearfix hr">
								<h3 class="fl">最近修改</h3>
								<span class="fr"></span>
							</div>
							<ul class="show_list">
							<#if ipb.list?? && ipb.list?size != 0>
								<#list ipb.list as il>
									<li class="clearfix"><p class="fl">${il.interlocutionAskVo.title!''}</p><span class="fr"><a href="${basePath!''}/interlocution/ask/detail.htm?id=${il.interlocutionAskVo.id!''}">查看详情</a></span></li>
								</#list>
							<#else>
								暂无问答信息~~
							</#if>
							</ul>
						</div>
					</div>
				</div>
				</#if>
				
				<!-- 
				<div class="my_paper one_module mr_0 fl">
					<div class="my_title clearfix">
						<span class="fl mo_back"></span>
						<h3 class="fl mo_color">消息</h3>
					</div>
					<div class="pd">
						<div class="back_img go_msg">
							<h3>清空<span>50</span><i>待查看消息</i></h3>
						</div>

						<div class="xiugai">
							<div class="clearfix hr">
								<h3 class="fl">最新消息</h3>
								<span class="fr"></span>
							</div>
							<ul class="show_list">
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考2016年第一学期数学第一次月考2016年第一学期数学第一次月考2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="my_paper one_module fl">
					<div class="my_title clearfix">
						<span class="fl red_back"></span>
						<h3 class="fl red_color">自适应测试</h3>
					</div>
					<div class="pd">
						<div class="back_img go_test">
							<h3>去发布<span>2</span><i>已发布测试</i></h3>
						</div>

						<div class="xiugai">
							<div class="clearfix hr">
								<h3 class="fl">最近发布</h3>
								<span class="fr"></span>
							</div>
							<ul class="show_list">
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考2016年第一学期数学第一次月考2016年第一学期数学第一次月考2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
								<li class="clearfix"><p class="fl">2016年第一学期数学第一次月考</p><span class="fr">查看详情</span></li>
							</ul>
						</div>
					</div>
				</div>
				-->

			</div>

			</div>

		</div>
	</div>
	
		
	
	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>
	
	
	
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>

<script type="text/javascript">
	$(function(){

		//导航选中样式
		$('.head_top ul').on('click','li',function(){
			$('.head_top li').removeClass('active')
			$(this).addClass('active');
		})

		//记住密码 选中样式
		$('label.jizhu').click(function(){
			if($(this).hasClass('check')){
				$(this).removeClass('check');
				$(this).addClass('remeb');
				return false;
			}else{
				$(this).addClass('check');
				$(this).removeClass('remeb');
				return false;
			}
		})
	})

</script>
	
</body>
</html>