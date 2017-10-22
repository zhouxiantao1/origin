<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>首页-spec</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="-1">	
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/home_page.css">
</head>
<body>

	<div class="header">
		<div class="head_top clearfix">
			<h1><img src="${basePath!''}/images/logo1.png"></h1>
			<ul class="fl clearfix">
				<li class="active"><a  href="${basePath!''}/home.htm">首页</a></li>
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
			<div class="fr show_head">
				<img src="${basePath!''}/images/head_round.png" alt="">
				<div class="set">
					<p class="object"><span class='role_name'>${Session.SPRING_SECURITY_CONTEXT.authentication.principal.role.name!'xxx'}</span></p>
					<p class="my_set"><em></em>个人中心</p>
					<p class="quiet"><em></em><a href="${basePath}/log/operation/list.htm">操作日志</a></p>
					<p class="quiet"><em></em><a href="${basePath}/j_spring_security_logout">退出登录</a></p>
					<div class="arr"></div>
				</div>
			</div>
		</div>
	</div>

	<div class="contain_main">

		<div class="login_banner clearfix">
			<div class="banner">
				<img src="${basePath!''}/images/banner5.png" alt="">
			</div>
			
		</div>
		
		<!-- 题库 -->
		<div class="module top_68">
			<div class="module_tiku clearfix">
				<div class="img_tiku fl">
					<img src="${basePath!''}/images/new/题库.png" alt="">
				</div>
				<div class="content_tiku fr">
					<a><h2>题库</h2></a>
					<p>海量一线真题，覆盖K12各学科知识点，</p>
					<p>可结合课标教材进行自主命题，采用STR-C</p>
					<p>多封层方法对题目曝光率进行控制，</p>
					<p>为优质教学提供优质试题</p>
					<button></button>
				</div>
			</div>
		</div>
		
		<!-- 自适应测验 -->
		<div class="module_at">
			<div class="box">
				<div class="module_auto_test clearfix">
					<div class="content_tiku fl">
						<h2 class="auto">自适应测验</h2>
						<p>基于CAT理论进行测试，</p>
						<p>一句认知诊断和等值分析理论判断学生学习情况</p>
						<p>精确收集每个学生学业数据，</p>
						<p>为个性化教学提供依据</p>
						<button></button>
					</div>
					<div class="img_tiku fr">
						<img src="${basePath!''}/images/new/自适应测验.png" alt="">
					</div>
				</div>
			</div>
		</div>

		<!-- 在线作业 -->
		<div class="module">
			<div class="module_tiku clearfix">
				<div class="img_tiku fl">
					<img src="${basePath!''}/images/new/在线作业.png" alt="">
				</div>
				<div class="content_tiku fr">
					<h2 class="online">在线作业</h2>
					<p>结合题库一键发布，</p>
					<p>系统自动批改生成静茹去作业报告，减轻教</p>
					<p>师教学负担，实现智能化教学</p>
					<button></button>
				</div>
			</div>
		</div>

		<!-- 在线测评 -->
		<div class="module_at">
			<div class="box">
				<div class="module_auto_test clearfix">
					<div class="content_tiku fl">
						<h2 class="online_test">在线测评</h2>
						<p>以国家标准指标为框架，</p>
						<p>可自定义综合评价指标，进行多维度测评，</p>
						<p>提供准确真实的测评数据，</p>
						<p>专业详细的测评报告</p>
						<button></button>
					</div>
					<div class="img_tiku fr">
						<img src="${basePath!''}/images/new/在线测评.png" alt="">
					</div>
				</div>
			</div>
		</div>

		<!-- 统计分析 -->
		<div class="module tongjifenxi">
			<div class="module_tiku clearfix">
				<div class="img_tiku fl">
					<img src="${basePath!''}/images/new/统计分析.png" alt="">
				</div>
				<div class="content_tiku fr">
					<h2 class="analysis">统计分析</h2>
					<p>多层级专业统计分析，</p>
					<p>可视化数据报告，全面了解整体和个人学习情况，</p>
					<p>为教学提供可靠的参考数据，真正实现因人施教</p>
					<button></button>
				</div>
			</div>
		</div>

	</div>

	<div class="foot">
		<div class="foot_content">
			<span>Copyright © 华南师范大学人才测评与考试研究所  </span>
			<span>水晶球教育信息有限公司</span>
			<span>广东省心理学会</span>
			<span>粤ICP备05086172</span>
		</div>
	</div>

<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<script src="${basePath!''}/layer/layer.js"></script>

<script type="text/javascript">
	$(function(){
		//导航选中样式
		$('.head_top ul').on('click','li',function(){
			$(this).addClass('active').siblings().removeClass('active');
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
	
	function changeImage() {
		var imgsrc = document.getElementById("imgObj");
		var oldsrc = imgsrc.src;
		var newsrc = changeImageUrl(oldsrc);
		imgsrc.src = newsrc;
	};

	//添加時間戳，避免瀏覽器使用緩存
	function changeImageUrl(url) {
		var timestamp = (new Date()).valueOf();
		var postion = url.indexOf("?");
		if (postion >= 0) {
			var suburl = url.substr(0, postion);
			url = suburl + "?timestamp=" + timestamp;
		} else {
			url = url + "?timestamp=" + timestamp;
		}

		return url;
	};

</script>
	
</body>
</html>