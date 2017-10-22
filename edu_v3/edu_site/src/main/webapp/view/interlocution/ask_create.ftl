<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>答疑中心-问题广场-我要提问</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/i_need_question.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>问题广场&gt;我要提问</h3>
					</div>
					<a href="${basePath!''}/interlocution/ask/list.htm?" class="back fr">返回上级</a>
				</div>

				<div class="shuru_question clearfix">
					<!-- <span class="fl">请输入问题名称:</span> -->
					<input type="text" id="title" placeholder="请输入问题名称,不超过100字">
				</div>

				<div class="subject">
					<div class="grade clearfix">
						<span class="fl">年级：</span>
						<ul class="clearfix fl" id="grade_ul">
							<#if baseGradeVoList?? && baseGradeVoList?size!=0>
								<#list baseGradeVoList as baseGradeVo>
									<li grade_id="${baseGradeVo.id!''}">${baseGradeVo.name!''}</li>
								</#list>
							</#if>
						</ul>
					</div>
					<div class="subject_choice clearfix">
						<span class="fl">学科：</span>
						<ul class="clearfix fl" id="subject_ul">
							<#if baseSubjectVoList?? && baseSubjectVoList?size!=0>
								<#list baseSubjectVoList as baseSubjectVo>
									<li subject_id="${baseSubjectVo.id!''}">${baseSubjectVo.name!''}</li>
								</#list>
							</#if>
						</ul>
					</div>
				</div>

				<div class="set_question">
					<span>请描述问题详情:</span>
					<!-- 百度编辑器 -->
					<script type="text/plain" name='content' id='ue_editor'>
					</script>

					<div class="operation">
						<button class="commit" onClick="saveAsk()">提交</button>
						<button class="cancel" onClick="back_list()">取消</button>
					</div>

				</div>

			</div>

		</div>
	</div>

<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/UE/ueditor.config.js"></script>
<script src="${basePath!''}/js/UE/ueditor.all.js"></script>

<script type="text/javascript">
	
	$(function(){
		var ue = UE.getEditor('ue_editor');
		ue.ready(function() {//编辑器初始化完成再赋值  
            ue.setContent(content);  //赋值给UEditor  
        });
        
        //初始默认第一个值
        $('#grade_ul li:first').addClass('active');
        $('#subject_ul li:first').addClass('active');
        
       	//年级 
		$('#grade_ul').on('click','li',function(){
			$('#grade_ul li').removeClass('active');
			$(this).addClass('active');
		})
		
		//学科
		$('#subject_ul').on('click','li',function(){
			$('#subject_ul li').removeClass('active');
			$(this).addClass('active');
		})
		
	})
	
	
	//取消信息
	function back_list(){		
		window.location.href="${basePath!''}/interlocution/ask/list.htm"; 
		
	}
	
	//保存提问信息
	
	function saveAsk(){
		var content = UE.getEditor('ue_editor');
		var gradeId =$("#grade_ul").children('.active').attr('grade_id');
		var subjectId =$("#subject_ul").children('.active').attr('subject_id');
		
		if($("#title").val()==''){
			alert("请输入问题的名称！");
		}else if(content.getContent().length>1900){
			alert("问题内容过长！");
		}else{
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/ask/list/save.htm?', 
				data:{
						'title':$("#title").val(),       //标题
						'content':content.getContent(),	 //内容
						'subjectId':subjectId,	 //学科ID
						'gradeId':gradeId		    //年级ID
					  }, 
				success:function(data){  
					if(data!=0){
							window.location.href="${basePath!''}/interlocution/ask/list.htm"; 
					}else{
							alert('提交失败！');
					}
				}  
			});	
		}
		
	}
</script>
</body>
</html>