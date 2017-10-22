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
				<li class="active"><a href="javascript:void(0);">首页</a></li>
				<li><a href="javascript:void(0);">题库</a></li>
				<li><a href="javascript:void(0);">自适应测试</a></li>
				<li><a href="javascript:void(0);">阳光评价</a></li>
				<!-- <li><a href="javascript:void(0);">在线作业</a></li>
				<li><a href="javascript:void(0);">数据分析</a></li> -->
				<!-- <li><a href="javascript:void(0);">学业档案</a></li> -->
				<li><a href="javascript:void(0);">组卷管理</a></li>
				<li><a href="javascript:void(0);">考试管理</a></li>
				<li><a href="javascript:void(0);">统计分析</a></li>
			</ul>
			<button class="fr login_btn"></button>
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

	<div class="login_contain">
		<div class="login fl">
			<h2>账号密码登录</h2>
			<form id="loginform" action="j_spring_security_check" method="post">
				<label class="username"><input type="text" id="j_username"  name="j_username"   placeholder="请输入用户名"><i></i></label>
				<label class="password"><input type="password" id="j_password"	name="j_password" placeholder="请输入密码"><i></i></label>
				<div class="captcha clearfix">
					<input type="text" class="fl" placeholder="请输入验证码" id="j_validateCode"	name="j_validateCode" >
					<img id="imgObj" class="fr" alt="" title="换一张试试" src="${basePath!''}/generatevVerifyCode.htm?time=${.now?long}" onclick="changeImage()" align="middle" style="cursor:pointer;"/>
					<!-- <span onclick="changeImage()">换一张</span> -->
				</div>
				<div class="remember clearfix">
					<label class="remeb jizhu fl">
						<input type="checkbox" name=""><i>记住账号</i>
					</label>
				</div>
				<div class='err_msg'>
					<#if SPRING_SECURITY_LAST_EXCEPTION?? && SPRING_SECURITY_LAST_EXCEPTION.message??>
			        	<#if SPRING_SECURITY_LAST_EXCEPTION.message == 'Bad credentials'>
			        		<div class="form-group"><div class="col-xs-12"><div class="alert alert-danger">帐号密码错误！请核对后再操作 </div></div></div>
				     	<#else>
				     		<div class="form-group"><div class="col-xs-12"><div class="alert alert-danger">${SPRING_SECURITY_LAST_EXCEPTION.message!''} </div></div></div>
				     	</#if>
				    </#if>
			   	</div>
			   	<div class="loginbtn_contain">
					<input class="denglu" type="submit" name="" value="登 录">
				</div>
			</form>
			<span class="close_btn"></span>
		</div>
	</div>
	
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<script src="${basePath!''}/layer/layer.js"></script>

<script type="text/javascript">
	$(function(){
		//关闭登录弹窗
		$('.close_btn').click(function(){
			$('.login_contain').hide();
		})

		$('.login_btn').click(function(){
			$('.login_contain').show();
		})

		//导航选中样式
		$('.head_top ul').on('click','li',function(){
			layer.alert('请先登录', {
			  skin: 'layui-layer-molv' //样式类名
			  ,closeBtn: 0,
			  success:function(dom){
			  	$('.layui-layer-btn0').on('click',function(){
			  		$('.username input').focus();
			  	})
			  }
			});
			
			// $(this).addClass('active').siblings().removeClass('active');
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