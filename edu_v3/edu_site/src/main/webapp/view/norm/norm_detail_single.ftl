<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>常模管理-常模详情</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/norm_detail_single.css">
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
						<h3>常模详情</h3>
					</div>
					<p class="back fr"><a href="javascript:history.back(-1)">返回</a></p>
				</div>
				
				<div class="norm_content">
					<div class="grade_show">
						<!--<div class="export clearfix"><button class="fr">导出常模</button></div>-->
						<h2 class="grade_name">${search.normName}</h2>
						<div class="tab_show">
							<table class="tab_list">
								<#if search.calculationMethod?? && search.calculationMethod =="0">
									<tr>
										<td colspan="3" class="first_title">常模标准分对照表</td>
									</tr>
									<tr class="title_name">
										<td>科目名称</td><td>原始分</td><td>标准分常模分数</td>
									</tr>
									<#list normCompareVoList as normCompareVo>
										<tr class="title_name">
											<td>${normCompareVo.examDetailVo.bsb.name}</td><td>${normCompareVo.originalScore}</td><td>${normCompareVo.standardScore}</td>
										</tr>
									</#list>
								<#else>
									<tr>
										<td colspan="3" class="first_title">常模百分位对照表</td>
									</tr>
									<tr class="title_name">
										<td>科目名称</td><td>原始分</td><td>百分位常模分数</td>
									</tr>
									<#list normCompareVoList as normCompareVo>
										<tr class="title_name">
											<td>${normCompareVo.examDetailVo.bsb.name}</td><td>${normCompareVo.originalScore}</td><td>${normCompareVo.normPercent}</td>
										</tr>
									</#list>
								</#if>
							</table>
						</div>
					</div>

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