<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>作业管理-作答</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/online_respond.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/popup.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>在线作业&gt;作答</h3>
					</div>
					<p class="back fr" onclick="back_list()">返回上级</p>
					<!--<div class="fr new_zhibiao next_time">下次再做</div>-->
					<div class="fr new_zhibiao new_submit">提交</div>
				</div>
			
				<h3 class="grade"><#if workHomeworkVo??>${workHomeworkVo.title!''}</#if></h3>
				<div class="zuoda">
					<#assign i=1>
					<#assign option_number="ABCDEFGHIJKLMNOPQRSTUVWXYZ"/>
					<#if workWorkQuestionVoList?? && workWorkQuestionVoList?size !=0>
						<#list workWorkQuestionVoList as workWorkQuestionVo>
							<#if workWorkQuestionVo.questionWareVo??>
								
								<!-- 问题 -->
								<div class="first_paper">                                                            
									<#if workWorkQuestionVo.questionWareVo.qcd??>${i}. ${workWorkQuestionVo.questionWareVo.qcd.title?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</#if>
									<p class="fl"><#if workWorkQuestionVo.questionWareVo.qcd.content??>${workWorkQuestionVo.questionWareVo.qcd.content?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</#if></p>
									
									<#assign i=i+1>
									<div class="answer">
											<#if workWorkQuestionVo.questionWareVo.qods??>
												<#assign j=0>
												<#list workWorkQuestionVo.questionWareVo.qods as qod>
													<p class="qu_1">
														<label class="lb_1"><input type="radio" name=${workWorkQuestionVo.questionWareVo.id!''} value=${option_number?substring(qod_index,qod_index+1)} questionNum=${j} questionType=${workWorkQuestionVo.questionWareVo.typeId!''}>${option_number?substring(qod_index,qod_index+1)}.${qod.content?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</span></label>
														<#assign j=j+1>
													</p>
												</#list>
											</#if>
									</div>
								</div>
							</#if>
						</#list>
					</#if>
					
				</div>
				
				<!--弹出框-->
				<div class="pop_shade">
					<div class="pop" type='2' style="display: none">
						<h3 class="hand_success clearfix">温馨提示<span class="fr"></span></h3>
						<div class="finish">
							<h3></h3>
							<p class="work_msg">您还有<i id="qtnNum"></i>道题目没作答</p>
							<p class="check_work">
								<span class="now_check">提交</span> | <span class="i_know">继续作答</span>
							</p>
						</div>
					</div>
				
				
				<!-- 作业提交成功 -->
				<div class="pop" type='4' style="display: none">
					<h3 class="hand_success clearfix">提交成功 <span class="fr" id="go_list"></span></h3>
					<div class="finish">
						<h3><img src="${basePath!''}/images/right.png"></h3>
						<p class="tip_msg">恭喜您完成本项作业！</p>
						
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
		var checks = document.getElementsByName("classesId");
		
		//关闭弹窗
    	$('.hand_success span,.i_know').click(function(){
    		$('.pop_shade').hide();
    	})
    	
    	//提交
    	$('.now_check').click(function(){
    		save_answer();
    		popup(4);
    	})
		
		$('.new_submit').on('click',function(){
			//获取已答题数
			var questionNum=0;
			<#if qtnNum??>
				questionNum = ${qtnNum!''}
			</#if>
			var answerNum = $("input[type='radio']:checked").length;
			if(questionNum==answerNum){
				save_answer();
				popup(4)
			}else{
				$('#qtnNum').html(questionNum-answerNum);
			 	popup(2)
			}
			
		})
		
		//返回列表
		$('#go_list').on('click',function(){
			window.location.href="${basePath!''}/work/homework/list.htm";
		})
		
	})
	
	//保存答案
	function save_answer(){
		//保存答案
			$.ajax({  
				type:'post',  
				url:'${basePath!''}/work/answer/list/save.htm?', 
				data:{
						'homeworkId':${workHomeworkVo.id!''},
						 'status':'1',
						 'type':'1'
						}, 
				success:function(data){
					//保存答案明细
					$("input[type='radio']:checked").each(function(){
						var content=$("input:radio[name='"+$(this).attr('name')+"']:checked").attr('value');
						var questionId=$(this).attr('name');
						var num=$("input:radio[name='"+$(this).attr('name')+"']:checked").attr('questionNum');
						var typeId=$("input:radio[name='"+$(this).attr('name')+"']:checked").attr('questionType');
						$.ajax({  
							type:'post',  
							url:'${basePath!''}/work/answerDetail/list/save.htm?', 
							async: false,
							data:{
								    'answerId':data,
								    'questionId':questionId,
								    'answerContent':content,
								    'questionType':typeId,
								    'homeworkId':${workHomeworkVo.id!''},
								    'selectNum':num
								   }, 
							success:function(data){}  
						});
					})
					correct(data);
					update_finish();
				}  
			});
	}
	
	//弹出提示框
	function popup(type){
    	$('.pop_shade').show();
    	var this_ele = $('.pop_shade').find('.pop[type='+ type +']');
    	this_ele.show().siblings().hide();	
    }
	
	//计算正确率
	function correct(id){
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/work/answer/updatebyid.htm?', 
			async: false,
			data:{'homeworkId':${workHomeworkVo.id!''},'id':id}, 
			success:function(data){}  
		});
	}
	
	//更新完成人数
	function update_finish(){
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/work/homework/listbyid/update.htm?', 
			async: false,
			data:{'id':${workHomeworkVo.id!''},'finishNum':1}, 
			success:function(data){}  
		});
	}
	
	//返回
	function back_list(){
		window.location.href="${basePath!''}/work/homework/list.htm";
	}
	
	
</script>	
</body>
</html>