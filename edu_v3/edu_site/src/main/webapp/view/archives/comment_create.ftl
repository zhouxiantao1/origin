<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>学业档案-添加评价</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/xueye_check_evaluate.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>学业档案&gt;添加评价</h3>
					</div>
					<p class="back fr" onclick="back_list()">返回上级</p>
				</div>

				<div class="message">
					<p class=my_msg> 
						<span class="name">姓名：${baseStudentVo.name!''}</span>
						<span class="xuehao">学号：201509010023A01</span>
						<span class="school">学校：${baseSchoolVo.name!''}</span>
						<span class="klass">班级：<#if baseStudentVo.baseClassesVo??>${baseStudentVo.baseClassesVo.name!''}</#if></span>
					</p>
					
				</div>
				<h3 class="semester">学期评价表</h3>
				<table class="semester_tab">
					<tr>
						<td class="tit">学期成绩表现评价</td>
						<td class="content_1"><textarea id="scoreRemake" placeholder="添加成绩表现评价，限500字"></textarea></td>
					</tr>
					<tr>
						<td class="tit">学期操行表现评价</td>
						<td class="content_1"><textarea id="actionRemake" placeholder="添加操行表现评价，限500字"></textarea></td>
					</tr>
					<tr>
						<td class="tit">学期奖励和荣誉纪录</td>
						<td class="content_1"><textarea id="honorRemark" placeholder="添加奖励和荣誉纪录，限500字"></textarea></td>
					</tr>
					<tr>
						<td class="tit">学习指导和寄语</td>
						<td class="content_1"><textarea id="guideRemake" placeholder="添加学习指导和寄语，限500字"></textarea></td>
					</tr>
				</table>

				<div class="operation">
					<button class="confirm" onclick="save_comment(${baseStudentVo.id!''})">保存</button> 
					<button class="cancel" onclick="back_list()">取消</button>
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
	function save_comment(studentId){
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/archives/comment/list/save.htm?',
			data:{
					'scoreRemake':$("#scoreRemake").val(),
					'actionRemake':$("#actionRemake").val(),
					'honorRemark':$("#honorRemark").val(),
					'guideRemake':$("#guideRemake").val(),
					'studentId':${baseStudentVo.id!''},
					'classesId':${baseStudentVo.classesId!''}
				}, 
			async: false,
			success:function(data){  
				window.location.href="${basePath!''}/archives/comment/expression.htm?studentId="+studentId;				
			}  
		});
	}
	
	//返回
	function back_list(){
		window.location.href="${basePath!''}/archives/comment/expression.htm?studentId="+${baseStudentVo.id!''};
	}
</script>		
</body>
</html>