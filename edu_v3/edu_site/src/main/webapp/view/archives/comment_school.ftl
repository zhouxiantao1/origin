<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>学业档案-学校表现</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/xueye_record_exp.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>学业档案&gt;学校表现</h3>
					</div>
					<p class="back fr" onclick="back_list()">返回上级</p>
				</div>

				<div class="biaoxian">
					<div class="personal">
						姓名：<span>${baseStudentVo.name!''}</span>
						学号：<span>${baseStudentVo.number!''}</span>
						学校：<span>${baseSchoolVo.name!''}</span>
						班级：<span><#if baseStudentVo.baseClassesVo??>${baseStudentVo.baseClassesVo.name!''}</#if></span>
						<#if isTeacher??><button onclick="create_comment(${baseStudentVo.id!''})">+ 添加评价</button></#if>
					</div>
					<div class="per_list">
						<div class="list_title">
							<span class="name">名称</span>
							<span>评价老师</span>
							<span>任教学科</span>
							<span>评价时间</span>
							<span class="evaluate">评价</span>
						</div>
						<#if pb.list?? && pb.list?size!=0>
							<#list pb.list as archivesCommentVo>
								<div class="list_content">
									<span class="name">${archivesCommentVo.title!''}</span>
									<span>${archivesCommentVo.teacherName!''}</span>
									<span><#if archivesCommentVo.baseSubjectVo??>${archivesCommentVo.baseSubjectVo.name!''}</#if></span>
									<span>${archivesCommentVo.createTime?string("yyyy-MM-dd")}</span>
									<span class="evaluate" onclick="view_comment(${archivesCommentVo.id!''})">查看评价</span>
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
	//新增评价
	function create_comment(studentId){
		window.location.href="${basePath!''}/archives/comment/create.htm?studentId="+studentId;
	}
	
	//查看评价
	function view_comment(id){
		window.location.href="${basePath!''}/archives/comment/view.htm?id="+id+"&studentId="+${baseStudentVo.id!''};
	}
	
	//返回
	function back_list(){
		window.location.href="${basePath!''}/archives/comment/stulist.htm?id="+${baseStudentVo.id!''};
	}
	
</script>	
</body>
</html>