<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>答疑中心-问题详情</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/question_detail.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>答疑中心&gt;问题详情</h3>
					</div>
					<div class="back fr" onClick="back_list()">返回上级</div>
				</div>
				
				<div class="question_square">
					<div class="question clearfix">
						<dl class="fl">
							<dt><img src="${basePath!''}/images/no-content.png" title="头像"></dt>
							<dd>${interlocutionAskVo.createName!''}</dd>
						</dl>
						<div class="wenti fl">
							<span><#if interlocutionAskVo??>${interlocutionAskVo.content!''}</#if></span><p class="clearfix topic"><i><#if interlocutionAskVo.createTime??>${interlocutionAskVo.createTime?string("yyyy-MM-dd")}</#if></i></p>
							<p class="klass clearfix"><span>[<#if interlocutionAskVo??><#if interlocutionAskVo.baseGradeVo??>${interlocutionAskVo.baseGradeVo.name!''}</#if><#if interlocutionAskVo.baseSubjectVo??>${interlocutionAskVo.baseSubjectVo.name!''}</#if></#if>]</span></p>
						</div>
					</div>
					
					
					
					<div class="answers">
						<div class="huida">回答(<span>${interlocutionAskVo.answerNum!''}</span>)</div>
						<#if interlocutionAnswerAskVoList?? && interlocutionAnswerAskVoList?size!=0>
							<#list interlocutionAnswerAskVoList as interlocutionAnswerAskVo>
								<div class="answer clearfix">
									<dl class="fl">
										<dt><img src="${basePath!''}/images/no-content.png"  title="头像"></dt>
										<dd>${interlocutionAnswerAskVo.createName!''}</dd>
									</dl>
									<div class="daan fl">
										<span>${interlocutionAnswerAskVo.content!''}</span><p class="klass clearfix"><#if interlocutionAnswerAskVo.isReport==0><i onclick="save_concern('report_save',${interlocutionAnswerAskVo.id!''})">举报</i><#else><i onclick="save_concern('report_update',${interlocutionAnswerAskVo.id!''})">已举报</i></#if></p>
									</div>
								</div>
							</#list>
						</#if>
						
					
					<!-- 百度编辑器 -->
						<script type="text/plain" name='content' id='ue_editor'>
						</script>

						<div class="fabu">
							<button onclick="save_answer()">发布答案</button>
						</div>

					</div>
					

				</div>


			</div>

			

		<!-- 右侧边栏 -->


		</div>
	</div>

	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>

<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/UE/ueditor.config.js"></script>
<script src="${basePath!''}/js/UE/ueditor.all.js"></script>
<!-- <script src="${basePath!''}/js/UE/kityformula-plugin/addKityFormulaDialog.js"></script>
<script src="${basePath!''}/js/UE/kityformula-plugin/getKfContent.js"></script>
<script src="${basePath!''}/js/UE/kityformula-plugin/defaultFilterFix.js"></script> -->

<script type="text/javascript">
	$(function(){
		var ue = UE.getEditor('ue_editor');
		<#if status?? && status=='4'>
			$('#ue_editor').hide();
			$('.fabu').hide();
		</#if>
	})
	
	//返回
	function back_list(){
		<#if status??>
			<#if status=='1'>
				window.location.href="${basePath!''}/interlocution/ask/list.htm?";
			<#elseif status=='2'>
				window.location.href="${basePath!''}/interlocution/answerAsk/list.htm?";
			<#elseif status=='3'>
				window.location.href="${basePath!''}/interlocution/concern/list.htm?";
			<#elseif status=='5'>
				window.location.href="${basePath!''}/interlocution/ask/person/list.htm?";
			<#else>
				window.location.href="${basePath!''}/interlocution/report/list.htm?";
			</#if>
		<#else>
			window.location.href="${basePath!''}/interlocution/ask/list.htm?";
		</#if>
	}
	
	function save_answer(){
		var content = UE.getEditor('ue_editor');
		$.ajax({  
			type:'get',  
			url:'${basePath!''}/interlocution/answerAsk/list/save.htm?', 
			data:{
					'content':content.getContent(),	 //内容
					'askId':'${askId}'	 //答案ID
				  }, 
			success:function(data){  
				if(data!=0){
						window.location.href="${basePath!''}/interlocution/ask/detail.htm?id=${askId}"; 
				}else{
						alert('发布答案失败！');
				}
			}  
		});	
	}
	
	function save_concern(type,id){
		if(type=='report_save'){
			
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/report/list/save.htm?', 
				data:{'answerId':id,'type':'1','isAddNum':1},
				async:false,
				success:function(data){
					if(data!=0){
							alert('举报成功！');
					}
				}  
			});
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/concern/list/save.htm?', 
				data:{'answerAskId':id,'type':'4'},
				async:false,
				success:function(data){  
					if(data!=0){
							window.location.reload(); 
					}else{
							alert('举报失败！');
					}
				}  
			});
		}else if(type=='report_update'){
			
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/report/list/save.htm?', 
				data:{'answerId':id,'type':'1','isAddNum':0},
				async:false,
				success:function(data){
					if(data!=0){
							alert('取消举报成功！');
					}
				}  
			});
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/concern/listbysearch/delete.htm?', 
				data:{'answerAskId':id,'type':'4'}, //问题ID 
				async:false,
				success:function(data){  
					if(data!=0){
							window.location.reload(); 
					}else{
							alert('取消举报！');
					}
				}  
			});
		}
	}
</script>
	
</body>
</html>