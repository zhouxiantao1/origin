<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>学业档案-学生</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/xueye_record_stu.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>学业档案&gt;学生</h3>
						
					</div>
					<#if type??><p class="back fr" onclick="back_list()">返回上级</p></#if>
				</div>

				<div class="message">
					<div class="geren clearfix">
						<img src="${basePath!''}/images/no-content.png"><span class="name">${baseStudentVo.name!''}</span>
						<span class="xh">学号：${baseStudentVo.number!''}</span>
						<span class="grade">${baseSchoolVo.name!''}</span>
						<span class="grade"><#if baseStudentVo.baseClassesVo??>${baseStudentVo.baseClassesVo.name!''}</#if></span>
					</div>
					<div class="behavior clearfix">
						<span class="name" onclick="go_school_exp(${baseStudentVo.id!''})">学校表现</span>
						<span class="xh" id="zhonghe">考试综合分析</span>
						<span  class="analysis">学生综合水平诊断分析</span>
					</div>
				</div>

				<div class="select_project">
					<span>年级：</span><select id="gradeId"><option value="">全部</option><#if baseGradeVoList?? && baseGradeVoList?size!=0><#list baseGradeVoList as baseGradeVo><option value=${baseGradeVo.id!''}>${baseGradeVo.name!''}</option></#list></#if></select>
					<span>考试类型：</span><select id="examType">
						<option value="">全部</option>
						<option value="1">单元考</option>
						<option value="2">月考</option>
						<option value="3">期中考</option>
						<option value="4">期末考</option>
						<option value="5">市级考试</option>
					</select>
					<button class="check" onClick="search_page('search','0')">查询</button>
				</div>

				<div class="grade_list">
					<#if pageBean.list?? && pageBean.list?size != 0>
						<#list pageBean.list as examStudentVo>
							<div class="analysis_xueye">
							<div class="list_reduce clearfix">
								<p class="time">${examStudentVo.examInfoVo.examName}</p>
								<p class="address_a">${examStudentVo.examInfoVo.startTime?date}<i>~</i>${examStudentVo.examInfoVo.endTime?date}</p>	
								<p class="status_a">年级:${examStudentVo.examInfoVo.bgv.name}</p>
								<p class="address">考试类型:${examStudentVo.examInfoVo.examTypeName}</p>
								<p class="an_report"><a href ="${basePath!''}/bi/analysis/list/report.htm">分析报告</a></p>
							</div>
							<#if examStudentVo.examInfoVo.examDetailVoList?? && (examStudentVo.examInfoVo.examDetailVoList?size > 0) >
								<#list examStudentVo.examInfoVo.examDetailVoList as examDetailVo>
								<div class="list_item clearfix">
									<p class="address">${examDetailVo.detailName}</p>
									<p class="time">${examDetailVo.bsb.name}</p>
									<p class="time"><span>${examDetailVo.startTime?datetime}</span></p>
									<#if examStudentVo.examInfoVo.examMethod == "0">
										<p class="time">总分：${examDetailVo.papersInfoVo.totalScore}</p>
										<p class="time">时长：${examDetailVo.papersInfoVo.testTime}分钟</p>
									<#else>
										<p class="time">&nbsp;</p>
										<p class="time">&nbsp;</p>
									</#if>
									<p class="time">考试方式：<#if examStudentVo.examInfoVo.examMethod == "0">线上<#else>线下</#if></p>
									<#if examStudentVo.examInfoVo.examMethod == "0">
										<p class="time_a" onClick="paper_view(${examDetailVo.examId!''},${examDetailVo.paperId!''},${examDetailVo.id!''})">查看试卷</p>
									<#else>
										<p class="time_b" onClick="paper_view(${examDetailVo.examId!''},${examDetailVo.paperId!''},${examDetailVo.id!''})">查看试卷</p>
									</#if>
								</div>
								</#list>
							</#if>
							</div>
						</#list>
					<#else>
						<h1 class="answer_msg"><img src="${basePath!''}/images/no-content.png"><br>暂无信息！！！</h1>
					</#if>
					
				</div>
				<!-- 分页 -->
				<div class="page_list clearfix" id="demo2">
					<div class="mids fr">
						<ul class="page_num clearfix">
						   <#if pageBean.pageNo != 1>
						   	  <li onClick="search_page('page','${pageBean.firstPageNo!''}')" >首页</li>
              	              <li onClick="search_page('page','${pageBean.prePageNo!''}')" >上一页</li>
                           </#if>
                            <#list pageBean.startNo..pageBean.endNo as index>
              					<#if index == pageBean.pageNo>
              						<li class="active"   onClick="search_page('page','${pageBean.pageNo}')">${pageBean.pageNo}</li>
              					<#else>
              						<li  onClick="search_page('page','${index}')">${index}</li>
              					</#if>
			  				</#list>
			  				
			  				 <#if pageBean.pageNo != pageBean.totalPages>
								<li onClick="search_page('page','${pageBean.nextPageNo!''}')">下一页</li>
								<li onClick="search_page('page','${pageBean.lastPageNo!''}')">未页</li>
              				</#if>
              				<li>${pageBean.pageNo}/${pageBean.totalPages}</li>
              				<li>共${pageBean.rows}条记录，分 ${pageBean.totalPages} 页</li>
						</ul>
					</div>	
				</div>
				<!-- 分页 -->
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
	 	$('#zhonghe').hide();
	 	$('.analysis').hide();
	 	<#if examStudentSearch?? && examStudentSearch.examType??>
	 		$('#examType').val(${examStudentSearch.examType!''});
	 	</#if>
	 	<#if examStudentSearch?? && examStudentSearch.gradeId??>
	 		$('#gradeId').val(${examStudentSearch.gradeId!''});
	 	</#if>
	 })
	
	//查询
	function search_page(type,id){
	 	var examType = $("#examType").val();
	 	var gradeId = $("#gradeId").val();
	 	var examName = "";
	 	<#if status??>
	 		var url = "${basePath!''}/archives/comment/stulist.htm?id=${search.id!''}";
	 	<#else>	
	 		var url = "${basePath!''}/archives/comment/list.htm?";
	 	</#if>
	 	var data = "";
		if(examName != ''){
		 	data +="&examName="+examName;
		} 	
		if(examType != ''){
		 	data +="&examType="+examType;
		}
		if(gradeId != ''){
		 	data +="&gradeId="+gradeId;
		}
		 	
		//分页查询
	 	if(type=='page'){
			data += "&pageNo="+id;
		}
	 	window.location.href=url+data;
 	}
	
	function go_school_exp(studentId){
		window.location.href="${basePath!''}/archives/comment/expression.htm?studentId="+studentId;
	}
	
	//查看试卷
	function paper_view(examId,paperId,detailId){
		var data = "examId="+examId+"&paperId="+paperId;
		<#if baseStudentVo?? && baseStudentVo.number??>
			data += "&studentNum=${baseStudentVo.number!''}";
		</#if>
		data +="&detailId="+detailId;
		var url = "${basePath!''}/archives/comment/paper/view.htm?";
		
		window.location.href=url+data;
	}
	
	//返回
	function back_list(){
		window.location.href="${basePath!''}/archives/comment/list.htm?";
	}
</script>	
</body>
</html>