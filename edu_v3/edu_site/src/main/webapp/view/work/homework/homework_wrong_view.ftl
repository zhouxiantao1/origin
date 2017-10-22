<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>在线作业-预览练习</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/review_work.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>在线作业-预览练习</h3>
					</div>
					<p class="back fr" onClick="back_list()">返回上级</p>
				</div>
				
				<div class="work_detail">
					<h3>${wkv.title}</h3>
					<p class="wrong_view"><span class="sch">题数：${questionNum}</span><span class="high">作对题数：<i class="right_num">${rightNum!''}<img src="${basePath!''}/images/work_right.png"></i></span><span class="high">作错题数：<i class="wrong_num">${wrongNum!''}<img src="${basePath!''}/images/work_wrong.png"></i></span></p>

					<div class="topics">
						<#assign option_number="ABCDEFGHIJKLMNOPQRSTUVWXYZ"/>
						<#if workWorkQuestionVoList?? && workWorkQuestionVoList?size != 0>
							<#assign i=1>
							<#list workWorkQuestionVoList as workWorkQuestionVo>
								<div class="question_one">
									<div class="ques clearfix">
										<span class="fl wen">${i}.</span>
										<#assign i=i+1>
										<!-- 问题 -->
											<div class="question">
												<div class="answer">                                                            
													<#if workWorkQuestionVo.questionWareVo.qcd??>${workWorkQuestionVo.questionWareVo.qcd.title?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</#if>
													<p class="fl"><#if workWorkQuestionVo.questionWareVo.qcd.content??>${workWorkQuestionVo.questionWareVo.qcd.content?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</#if></p>
													<br/>
												</div>
												<div class="answer">
													<#if workWorkQuestionVo.questionWareVo.qods??>
														<#list workWorkQuestionVo.questionWareVo.qods as qod>
															<input type="radio" name=${workWorkQuestionVo.questionWareVo.id!''} value=${option_number?substring(qod_index,qod_index+1)} > ${option_number?substring(qod_index,qod_index+1)}. ${qod.content?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}<br/>
														</#list>
													</#if>
												</div>
											</div>
									</div>
									<!-- 判断作答答案是否正确 -->
									<#assign isRight='1'>
									<#if workAnswerDetailVoList?? && workAnswerDetailVoList?size!=0>
										<#list workAnswerDetailVoList as workAnswerDetailVo>
											<#if workAnswerDetailVo.questionId==workWorkQuestionVo.questionId && workAnswerDetailVo.isRight =='0'>
												<#assign isRight='0'>
											</#if>
										</#list>
									</#if>
									<!-- 答案 -->
									<!-- 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题  -->	
									<div class="right_ans clearfix">
										<#if workWorkQuestionVo.questionWareVo.avs??>
											<#list workWorkQuestionVo.questionWareVo.avs as av>
												<div class="answer">
													<div class="already_login">	
														<!-- 非客观题(直接展示）-->
														<#if workWorkQuestionVo.questionWareVo.qtv.markingCode == '0'>
															<p><span>【答案】${av.answerValue!''}</span><p>
														</#if>
														<#if workWorkQuestionVo.questionWareVo.qtv.markingCode == '1' || workWorkQuestionVo.questionWareVo.qtv.markingCode == '2'>
															<p><span>【答案】<#if workWorkQuestionVo.questionWareVo.qods??><#list workWorkQuestionVo.questionWareVo.qods as qod><#if qod.is_answer  == '1'>${option_number?substring(qod_index,qod_index+1)}</#if></#list></#if></span><#if isRight=='0'><green>正确</green><#else><red>错误</red></#if><p>
															
														</#if>
														<#if workWorkQuestionVo.questionWareVo.qtv.markingCode == '3' || workWorkQuestionVo.questionWareVo.qtv.markingCode == '4'>
															<p><span>【答案】<#if av.answerValue??><#list av.answerValue?split("|") as av>${av!''}&nbsp;</#list></#if></span><p>
														</#if>
														<#if workWorkQuestionVo.questionWareVo.qtv.markingCode == '5'>
														    <p><span>【答案】<#if av.answerValue??><#list av.answerValue?split("|") as av>${av_index+1} <#if av=='0'>√<#else>×</#if></#list></#if></span><p>
														</#if>
														<p><span>【解析】${av.answerDescription?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</p>
													</div>
												</div>
											</#list>
										</#if>
									</div>
							
								</div>
							</#list>
						</#if>

					</div>
					
					<div class="baocun">
						<button class="bc" onclick="do_agin()">继续练习</button>
						<button class="qx" onclick="back_list()">下次再做</button>
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
		<#if workAnswerDetailVoList?? && workAnswerDetailVoList?size!=0>
			<#list workAnswerDetailVoList as workAnswerDetailVo>
				$("input[name='${workAnswerDetailVo.questionId!''}'][value='${workAnswerDetailVo.answerContent!''}']").attr("checked",true); 
			</#list>
		</#if>
	})
	function back_list(){
		window.location.href="${basePath!''}/work/wrong/list.htm?";
	}
	
	function do_agin(){
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/work/wrong/enough.htm',  
          data:{'id':'${questionId!''}'},
          async: false,
          success:function(data){ 
       	  	 if(data!=0){
       	  	 	window.location.href="${basePath!''}/work/wrong/exercise.htm?id="+data+"&questionId=${questionId!''}";
       	  	 }else{
       	  	 	alert("题目数不够")
       	  	 }   	
          }
       })
	}
	
</script>	
</body>
</html>