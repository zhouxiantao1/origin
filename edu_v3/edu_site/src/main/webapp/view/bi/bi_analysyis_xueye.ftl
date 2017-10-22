<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>统计分析-学业考试分析</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/analysis_xueye.css">
</head>
<body>

	<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="nav_list">
					<ul class="paper_list clearfix">
						<li class="active">学业考试分析</li>
					</ul>
					<div class="condition_list">
						<div class="grade_choice clearfix">
							<span class="fl">年级：</span>
							<ul id="gradeId" class="clearfix fl">
								<#if search.examRange?? && search.examRange == "1">
									<#if baseHistoryGradeVoList?? && baseHistoryGradeVoList?size != 0>
										<#list baseHistoryGradeVoList as baseHistoryGradeVo>
											<li onClick="search_myexam('grade',${baseHistoryGradeVo.baseGradeVo.id!''})" <#if search.gradeId?? && baseHistoryGradeVo.baseGradeVo.id == search.gradeId> class="active" </#if> value="${baseHistoryGradeVo.baseGradeVo.id!''}">${baseHistoryGradeVo.baseGradeVo.name!''}</li>
										</#list>
									</#if>
								<#else>
									<#list baseGradeVoList as baseGradeVo>
										<li onClick="search_myexam('grade',${baseGradeVo.id!''})" <#if search.gradeId?? && baseGradeVo.id == search.gradeId> class="active"</#if> value="${baseGradeVo.id!''}">${baseGradeVo.name!''}</li>
									</#list>
								</#if>
							</ul>
						</div>
						
						<#if search.examRange?? && search.examRange == "1">
							<div class="grade_choice clearfix">
						     	<span class="fl">班级：</span>
								<ul id="classId" class="clearfix fl">
								<#if baseTeacherHistoryVoList?? && baseTeacherHistoryVoList?size != 0>
									<#list baseTeacherHistoryVoList as baseTeacherHistoryVo>
										  <li onClick="search_myexam('class',${baseTeacherHistoryVo.baseClassesVo.id!''})" onClick="search_myexam('search','0')" <#if search.classId?? && baseTeacherHistoryVo.baseClassesVo.id == search.classId> class="active" </#if> value="${baseTeacherHistoryVo.baseClassesVo.id!''}">${baseTeacherHistoryVo.baseClassesVo.name!''}</li>
								     </#list>
							     </#if>
							     </ul>
							 </div>
					     </#if>

						<div class="grade_choice clearfix">
							<span class="fl">考试类型：</span>
							<ul id="examType" class="clearfix fl">
								<#assign keys=examTypeMap?keys/>
								  <#if keys??>
								  <#list keys as key> 
									  <li onClick="search_myexam('examType',${key!''})" <#if search.examType?? && key == search.examType> class="active" </#if> value="${key!''}">${examTypeMap["${key!''}"]}</li>
							      </#list>
							      </#if>
							</ul>
						</div>

						<div class="slide_tab">
							<div class="test_name clearfix">
								<span class="fl">考试名称：</span>
								<label><input type="text" id ="examName"><i onClick="search_myexam('examName','0')" class="iconfont">&#xe741;</i></label>
							</div>
						</div>
					</div>
					<input id = "examRange" name = "examRange" type = "hidden" value = "${search.examRange!''}"/>
					<div class="bd_2"><b class="show_hide"></b></div>
				</div>

				<!-- 原先样式 -->
				<!-- <div class="klass_sub">
					<span>年级：</span>
					<select id ="gradeId">
					<#if search.examRange?? && search.examRange == "1">
						<#if baseHistoryGradeVoList?? && baseHistoryGradeVoList?size != 0>
							<#list baseHistoryGradeVoList as baseHistoryGradeVo>
								<option <#if search.gradeId?? && baseHistoryGradeVo.baseGradeVo.id == search.gradeId> selected = "selected"</#if> value="${baseHistoryGradeVo.baseGradeVo.id}">${baseHistoryGradeVo.baseGradeVo.name}</option>
							</#list>
						</#if>
					<#else>
						<#list baseGradeVoList as baseGradeVo>
							<option <#if search.gradeId?? && baseGradeVo.id == search.gradeId> selected = "selected"</#if> value="${baseGradeVo.id}">${baseGradeVo.name}</option>
						</#list>
					</#if>
					</select>
					<span class="test_type">考试类型：</span>
					<select id ="examType">
					<#assign  keys=examTypeMap?keys/>
					  <#if keys??>
					  <#list keys as key> 
						  <option <#if search.examType?? && key == search.examType> selected = "selected"</#if> value="${key}">${examTypeMap["${key!''}"]}</option>
				      </#list>
				      </#if>
				     </select>
				     <#if search.examRange?? && search.examRange == "1">
				     	<span class="test_type">班级：</span>
						<select id ="classId">
						<#if baseTeacherHistoryVoList?? && baseTeacherHistoryVoList?size != 0>
						<#list baseTeacherHistoryVoList as baseTeacherHistoryVo>
							  <option <#if search.classId?? && baseTeacherHistoryVo.baseClassesVo.id == search.classId> selected = "selected"</#if> value="${baseTeacherHistoryVo.baseClassesVo.id}">${baseTeacherHistoryVo.baseClassesVo.name}</option>
					     </#list>
					     </#if>
					     </select>
				     </#if>
					<span class="work_name" >考试名称：</span>
					<input type="text" id ="examName" placeholder="输入考试名称查询" value=${search.examName!''}>
					<input id = "examRange" name = "examRange" type = "hidden" value = "${search.examRange!''}"/>
					<button onClick="search_myexam('search','0')" class="check">查询</button>
				</div> -->

				<div>
				<#if pb.list?? && pb.list?size != 0>
					<#list pb.list as examStudent>
						<div class="analysis_xueye">
						<div class="list_reduce clearfix">
							<p class="time">${examStudent.examInfoVo.startTime?date}<i>~</i>${examStudent.examInfoVo.endTime?date}</p>
							<p class="address">${examStudent.examInfoVo.examName}</p>
							<p class="status">年级:${examStudent.examInfoVo.bgv.name}</p>
							<p class="status">考试类型:${examStudent.examInfoVo.examTypeName}</p>
							<p class="status">考试方式：<#if examStudent.examInfoVo.examMethod == "0">线上<#else>线下</#if></p>
							<p class="an_report"><a href ="#" onClick ="chek_analysis(${examStudent.examInfoVo.id});">分析报告</a></p>
						</div>
						<#if examStudent.examInfoVo.examDetailVoList?? && (examStudent.examInfoVo.examDetailVoList?size > 0) >
							<#list examStudent.examInfoVo.examDetailVoList as examDetailVo>
								<div class="list_item clearfix">
									<p class="time">${examDetailVo.bsb.name}<span>${examDetailVo.startTime?datetime}</span></p>
									<p class="address">${examDetailVo.detailName}</p>
									<#if examStudent.examInfoVo.examMethod == "0">
										<p class="create">总分：${examDetailVo.papersInfoVo.totalScore}</p>
										<p class="status">时长：${examDetailVo.papersInfoVo.testTime}分钟</p>
									<#else>
										<p class="create">&nbsp;</p>
										<p class="status">&nbsp;</p>
									</#if>
								</div>
							</#list>
						</#if>
						</div>
					</#list>
				</#if>
				</div>

				<!-- 分页 -->
				<#if (pb.totalPages>0) >
				<div class="page_list clearfix" id="demo2">
					<div class="mids fr">
						<ul class="page_num clearfix">
						   <#if pb.pageNo != 1>
						   	  <li onClick="search_myexam('page','${pb.firstPageNo!''}')" >首页</li>
              	              <li onClick="search_myexam('page','${pb.prePageNo!''}')" >上一页</li>
                           </#if>
                            <#list pb.startNo..pb.endNo as index>
              					<#if index == pb.pageNo>
              						<li class="active" onClick="search_myexam('page','${pb.pageNo}')">${pb.pageNo}</li>
              					<#else>
              						<li  onClick="search_myexam('page','${index}')">${index}</li>
              					</#if>
			  				</#list>
			  				
			  				 <#if pb.pageNo != pb.totalPages>
								<li onClick="search_myexam('page','${pb.nextPageNo!''}')">下一页</li>
								<li onClick="search_myexam('page','${pb.lastPageNo!''}')">未页</li>
              				</#if>
              				<li>${pb.pageNo}/${pb.totalPages}</li>
              				<li>共${pb.rows}条记录，分 ${pb.totalPages} 页</li>
						</ul>
					</div>
				</div>
				</#if>
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
</body>
<script type="text/javascript">
	//收起检索菜单
	$('.show_hide').click(function(){
		$(this).toggleClass('active');
		$('.slide_tab').slideToggle(600);
	})
	
	//根据条件查询考试
	function search_myexam(type,ob){
	 	var examType = $('#examType li.active').attr('value');
	 	var gradeId = $('#gradeId li.active').attr('value');
	 	var examName = $.trim($("#examName").val());
	 	var examRange = $("#examRange").val();
	 	//考试范围为1时，登录人为老师，查看分析报告需要确认看哪个班级的报告
	 	if(examRange == "1"){
	 		if(type == 'class'){
	 			var url = "${basePath!''}/bi/analysis/list.htm?classId="+ob+"&";
	 			var data = "examType="+examType+"&gradeId="+gradeId+"&examName="+examName;
		 		window.location.href=url+data;
	 		}else{
	 			var classId = $('#classId li.active').attr('value');
	 			var url = "${basePath!''}/bi/analysis/list.htm?classId="+classId+"&";
	 		}
	 	}else{
	 		var url = "${basePath!''}/bi/analysis/list.htm?";
	 	}
	 	
	 	if(type == 'grade'){
		 	var data = "examType="+examType+"&gradeId="+ob+"&examName="+examName;
		 	window.location.href=url+data;
	 	}else if(type == 'examType'){
	 		var data = "examType="+ob+"&gradeId="+gradeId+"&examName="+examName;
		 	window.location.href=url+data;
	 	}else if(type == 'examName'){
	 		var data = "examType="+examType+"&gradeId="+gradeId+"&examName="+examName;
		 	window.location.href=url+data;
	 	}else if(type == 'page'){
	 		var data = "examType="+examType+"&gradeId="+gradeId+"&examName="+examName+"&pageNo="+ob;
		 	window.location.href=url+data;
	 	}
 	}
 	
 	//同步班级信息
 	$("ul#gradeId").change(function(){
 		var gradeId = $('#gradeId li.active').attr('value');
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/bi/analysis/listbysearch.htm', 
		    data:{'gradeId':gradeId}, 
		    success:function(data){  
		    	var class_html = "";
		    	for(var i = 0;i<data.length;i++){
		    		class_html += '<li value="'+ data[i].baseClassesVo.id+'">'+data[i].baseClassesVo.name+'</li>';
		    	}
		    	$('#classId').html(class_html);
		    }  
	 	});
	});
	
	//查看分析报告
	function chek_analysis(examId){
		var examRange = $("#examRange").val();
	 	if(examRange == "1"){
	 		var classId = $('#classId li.active').attr('value');
	 		window.location.href="${basePath!''}/bi/analysis/list/report.htm?examId="+examId+"&classId="+classId;
	 	}else{
	 		window.location.href="${basePath!''}/bi/analysis/list/report.htm?examId="+examId+"&classId=";
	 	}
	 	
 	}
	
</script>
</html>