<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>404页面</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/err.css">
</head>
<style type="text/css">

	.contain .content{
		background:url(${basePath!''}/images/not_find.png) no-repeat center center;
		background-size:100% 100%;
	}
	
</style>
<body>
	<div class="contain">
		<div class="content">
			<div class="msg">
				<p class="err_msg">很抱歉，出错了，程序暂时无法处理您的访问请求，稍后再刷新试试吧~</p>
				<div class="back_operation">
					<button class="back_one" onclick="javascript:history.back(-1);">返回上一页</button>
					<button class="back_index" onclick="javascript:location.href='${basePath!''}/home.htm'">首页</button>
				</div>
			</div>
		</div>
		
	</div>
</body>
</html>