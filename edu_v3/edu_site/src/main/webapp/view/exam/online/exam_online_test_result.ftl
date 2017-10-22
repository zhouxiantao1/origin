<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>考试管理-交卷结果</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_manage_result.css">
</head>
<body>
	<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<#include '/common/left.ftl' /> 
			
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>考试管理&gt;交卷结果</h3>
					</div>
				</div>

				<h2 class="test_name">${detailName}</h2>
				<h3 class="finish_test">恭喜你完成本次考试！</h3>
				<div class="know"><a href = "${basePath!''}/exam/online/student/list.htm?is_completed=0"><button>知道了</button></a></div>

				<div class="another_test">
					<h3>其他考试</h3>
					<ul>
					<#assign  keys = examInfoMap?keys/>
				    <#if keys??>
				    <#list keys as key> 
					<#list examInfoMap[key].examDetailVoList as examDetailVo>
						<#if .now?datetime gt examDetailVo.startTime?datetime && examDetailVo.endTime?datetime gt .now?datetime>
							<li class="clearfix"><span class="fl">${examDetailVo.detailName}</span><a class="fr" href="${basePath!''}/exam/online/student/list/exam.htm?examId=${examInfoMap['${key}'].id}&paperId=${examDetailVo.paperId}&detailId=${examDetailVo.id}"><button class="fr">进入考试</button></a></li>
						</#if>
					</#list>
					</#list>
					</#if>
					</ul>
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
</body>
</html>