<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理-问卷调查-作答</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_answer.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_manage_answer.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>测评管理&gt;问卷调查&gt;作答</h3>
					</div>
					<p class="back fr" onclick="back_list()">返回上级</p>
				</div>

				<h2 class="test_name">${evaluatePaperVo.title!''}</h2>
				
				<div class="respondence_area">	
					<div class="zuoda show_scroll">
						<#if evaluatePaperQuestionVoList?? && evaluatePaperQuestionVoList?size!=0 >
							<#list evaluatePaperQuestionVoList as evaluatePaperQuestionVo>
								<div class="first_paper">
									<p class="one clearfix"><span class="fl">${evaluatePaperQuestionVo.sort!''}. ${evaluatePaperQuestionVo.content!''}</span><label class="fr lb"><#if evaluatePaperQuestionVo.type=='1'><img src="${basePath!''}/images/radio.png"> <i>单选题</i><#elseif evaluatePaperQuestionVo.type=='2'><img src="${basePath!''}/images/checkbox.png"> <i>多选题</i></label><#else></#if></label></p>
									<#if evaluatePaperQuestionVo.evaluateSelectionVoList?? && evaluatePaperQuestionVo.evaluateSelectionVoList?size!=0>
										<#list evaluatePaperQuestionVo.evaluateSelectionVoList as evaluateSelectionVo>
											<#if evaluatePaperQuestionVo.type=='1'>
												<p class="qu_1">
													<label class="lb_1"><input type="radio" name=${evaluatePaperQuestionVo.sort!''} value=${evaluateSelectionVo.selectNum!''} onclick="save_checked('1',${evaluatePaperQuestionVo.sort!''})"><span>${evaluateSelectionVo.selectNum!''}. ${evaluateSelectionVo.content!''}</span></label>
												</p>
											<#elseif evaluatePaperQuestionVo.type=='2'>
												<p class="qu_1">
													<label class="lb_1"><input type="checkbox" name=${evaluatePaperQuestionVo.sort!''} value=${evaluateSelectionVo.selectNum!''} onclick="save_checked('2',${evaluatePaperQuestionVo.sort!''})"><span>${evaluateSelectionVo.selectNum!''}. ${evaluateSelectionVo.content!''}</span></label>
												</p>
											<#else></#if>
										</#list>
									</#if>
								</div>
							</#list>
						</#if>
						
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
<script type="text/javascript">

	//返回列表
	function back_list(){
		window.location.href="${basePath!''}/evaluate/paper/list.htm";
	}

</script>
</body>
</html>