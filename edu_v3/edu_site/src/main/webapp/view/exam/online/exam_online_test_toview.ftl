<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>考试管理-作答</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/online_respond.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_manage_respond.css">
</head>
<body>
	<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>考试管理&gt;查看答卷</h3>
					</div>
					<p class="back fr"><a href="javascript:history.back(-1)">返回上级</a></p>
				</div>
				<h2 class="test_name">${examInfoVo.examName}</h2>
				<div class="respondence_area">
					<#assign lastUpdated = examDetailVo.endTime?date/>
					<input type = "hidden" id = "jstime" value="${lastUpdated?string('yyyy/MM/dd HH:mm:ss')}"/>
					<input type = "hidden" id = "paperId" value="${papersInfoVo.id}"/>
					<input type = "hidden" id = "detailId" value="${examDetailVo.id}"/>
					<input type = "hidden" id = "examId" value="${examInfoVo.id}"/>
					<span>考试时间：${papersInfoVo.testTime}分钟   试卷总分：${papersInfoVo.totalScore}分<h3 class="grade">${examDetailVo.detailName}</h3></span>
					<#assign option_number="ABCDEFGHIJKLMNOPQRSTUVWXYZ"/>
					<div class="zuoda show_scroll question-list">
						<#list papersDetailVoList as papersDetailVo>
							<p>第${(papersDetailVo_index+1)?replace('1','一')?replace('2','二')?replace('3','三')?replace('4','四')?replace('5','五')?replace('6','六')?replace('7','七')?replace('8','八')?replace('9','九')?replace('0','零')}部分：${papersDetailVo.questionTypeVo.typeName}（${papersDetailVo.quQuantity}题，每题${papersDetailVo.quScore}分）</p>
							<#list papersDetailVo.papersQuestionVoList as papersQuestionVo>
							<div class="question-item">
								<p>
									<span>组卷次数:${papersQuestionVo.questionWareVo.testTimes}</span>
									<span>难度：${papersQuestionVo.questionWareVo.difficulty}</span>
									<span>知识点：
									<#list papersQuestionVo.questionWareVo.knowledgeNames as knowledgeName>
										${knowledgeName} 
									</#list>
									</span>
									<span class="fr score">分值<input readonly="readonly" type="text" value="${papersDetailVo.quScore}"></span>
								</p>
								
								<!-- 问题 -->
								<div class="question">             
									<#if papersQuestionVo.questionWareVo.qcd??>${papersQuestionVo.questionWareVo.qcd.title?replace('other.koo6.com','video.koo6.com')}</#if>
									<#if papersQuestionVo.questionWareVo.qcd.content??>${papersQuestionVo.questionWareVo.qcd.content?replace('other.koo6.com','video.koo6.com')}</#if>
									<br/>
									<#if papersQuestionVo.questionWareVo.qods??>
										<#list papersQuestionVo.questionWareVo.qods as qod>
											<#if papersQuestionVo.options == qod_index+1+"">
												<input disabled="disabled" checked name="${papersQuestionVo.questionWareVo.id}" type="radio" value="${qod_index+1}" />${(qod_index+1)?replace('1','A')?replace('2','B')?replace('3','C')?replace('4','D')}. ${qod.content?replace('other.koo6.com','video.koo6.com')}<br/>
											<#else>
												<input disabled="disabled" name="${papersQuestionVo.questionWareVo.id}" type="radio" value="${qod_index+1}" />${(qod_index+1)?replace('1','A')?replace('2','B')?replace('3','C')?replace('4','D')}. ${qod.content?replace('other.koo6.com','video.koo6.com')}<br/>
											</#if>
										</#list>
									</#if>
								</div>
								<!-- 答案 -->
								<!-- 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题  -->
								<#if papersQuestionVo.questionWareVo.avs??>
									<#list papersQuestionVo.questionWareVo.avs as av>
										<div class="answer">
											<div class="already_login">	
												<!-- 非客观题(直接展示）-->
												<#if papersQuestionVo.questionWareVo.qtv.markingCode == '0'>
													<p><span>【答案】${av.answerValue!''}</span><p>
												</#if>
												<#if papersQuestionVo.questionWareVo.qtv.markingCode == '1' || papersQuestionVo.questionWareVo.qtv.markingCode == '2'>
													<p><span>【答案】<#if papersQuestionVo.questionWareVo.qods??><#list papersQuestionVo.questionWareVo.qods as qod><#if qod.is_answer  == '1'>${option_number?substring(qod_index,qod_index+1)}</#if></#list></#if></span><#if papersQuestionVo.isWrong == '0'>正确<#else>错误</#if><p>
												</#if>
												<#if papersQuestionVo.questionWareVo.qtv.markingCode == '3' || papersQuestionVo.questionWareVo.qtv.markingCode == '4'>
													<p><span>【答案】<#if av.answerValue??><#list av.answerValue?split("|") as av>${av!''}&nbsp;</#list></#if></span><p>
												</#if>
												<#if papersQuestionVo.questionWareVo.qtv.markingCode == '5'>
												    <p><span>【答案】<#if av.answerValue??><#list av.answerValue?split("|") as av>${av_index+1} <#if av=='0'>√<#else>×</#if></#list></#if></span><p>
												</#if>
												<p><span>【解析】${av.answerDescription!''}</p>
											</div>
										</div>
									</#list>
								</#if>
								
							</div>
							</#list>
						</#list>
					</div>
					
					<div class="height_fill"></div>
					<div class="posi">
						<div class="show_sheet">
							<p class="shou"> <i>收起答题卡</i><img src="${basePath!''}/images/down_arr.png" alt=""></p>
							<p class='show'> <i>展开答题卡</i><img src="${basePath!''}/images/down_arr.png" alt=""></p>
						</div>
						<div class="answer_sheet">
							<p class="tag">
								<span class="answered"></span>正确
								<span class="now"></span>错误
							</p>
							<ul class="card">
							<#assign var = 0 >  
							<#list papersDetailVoList as papersDetailVo>
								<#list papersDetailVo.papersQuestionVoList as papersQuestionVo>
								<#assign var = var + 1 > 
									<#if papersQuestionVo.isWrong == '0'>
										<li><span class="numb answered">${var}</span><span class="daan answered"><#if papersQuestionVo.options?? && papersQuestionVo.options!= ''>${option_number?substring(papersQuestionVo.options?number-1,papersQuestionVo.options?number)}</#if></span></li>
									<#else>
										<li><span class="numb now">${var}</span><span class="daan now"><#if papersQuestionVo.options?? && papersQuestionVo.options!= ''>${option_number?substring(papersQuestionVo.options?number-1,papersQuestionVo.options?number)}</#if></span></li>
									</#if>
								</#list>
							</#list>
							</ul>
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
<script type="text/javascript">
	$(function(){
		$('.show_sheet').on('click','.shou',function(){
			$('.answer_sheet').slideUp(700);
			$(this).hide().siblings().show();
		})
		$('.show_sheet').on('click','.show',function(){
			$('.answer_sheet').slideDown(700);
			$(this).hide().siblings().show();
		})
	}) 
	
	
</script>
</body>
</html>