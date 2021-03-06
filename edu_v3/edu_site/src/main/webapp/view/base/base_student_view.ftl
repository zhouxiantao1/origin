<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理-新建单次测评问卷</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_manage_addone.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/add_single_test.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/popup.css">
</head>
<style type="text/css">
	.mid{
		min-height: 760px;
	}
</style>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>基础信息&gt;新增人员</h3>
					</div>
					<p class="back fr" onclick="back_list()">返回上级</p>
				</div>

				<div class="add_name">
					
				</div>

				<h3 class="exam_set">学生信息</h3>
				<div class="exam_detail">
					<div class="test_name">
						<span>学生姓名：</span><i><#if baseStudentVo??>${baseStudentVo.name!''}</#if></i>
					</div>
					
					<div class="test_name">
						<span>登录名：</span><i><#if securityUser??>${securityUser.code!''}</#if></i>
					</div>

					<div class="test_name">
						<span>身份证号：</span><i><#if baseStudentVo??>${baseStudentVo.idNum!''}</#if></i>
					</div>
					
					<div class="test_name">
						<span>学籍号：</span><i><#if baseStudentVo??>${baseStudentVo.number!''}</#if></i>
					</div>
					<div class="test_way clearfix">
						<span class="fl">性别：</span><i><#if baseStudentVo??><#if baseStudentVo.sex=='1'>男<#elseif baseStudentVo.sex=='2'>女<#else></#if></#if></i>
					</div>
					
					
					<div class="test_object clearfix">
						<span class="fl">所属学校：</span><i><#if baseStudentVo.baseSchoolVo??>${baseStudentVo.baseSchoolVo.name!''}</#if></i>
					</div>
					
					<div class="test_object clearfix">
						<span class="fl">所属班级：</span><i><#if baseStudentVo.baseClassesVo??>${baseStudentVo.baseClassesVo.name!''}</#if></i>
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
<script src="${basePath!''}/js/laydate/laydate.js"></script>
<script src="${basePath!''}/layer/layer.js"></script> 
<script src="${basePath!''}/js/common.js"></script>
<script type="text/javascript">

	//返回列表
	function back_list(){
		window.location.href="${basePath!''}/base/student/list.htm?";
	}
	

</script>
</body>
</html>
