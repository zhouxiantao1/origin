<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>考试管理-在线考试</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/auto_test.css">
</head>
<style type="text/css">
	.three{
		margin-left: 80px;
	}
	.three span{
		margin-left: 30px;
	}
	.detail{
		border-top:1px solid #e5e5e5;
	}
</style>
<body>
	<#include '/common/top.ftl' />
	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
			
				<div class="nav_list">
					<ul class="paper_list clearfix">
					<#if search.isSubmit == '0'>
						<li class="active"><a href="${basePath!''}/exam/online/student/list.htm?isSubmit=0">未完成</a></li>
						<li><a href="${basePath!''}/exam/online/student/list.htm?isSubmit=1">已完成</a></li>
					<#else>
						<li><a href="${basePath!''}/exam/online/student/list.htm?isSubmit=0">未完成</a></li>
						<li class="active"><a href="${basePath!''}/exam/online/student/list.htm?isSubmit=1">已完成</a></li>
					</#if>
					</ul>
					<div class="condition_list">
						<div class="grade_choice clearfix">
							<span class="subject fl">学科：</span>
							<ul id ="subjectId" class="clearfix fl">
								<#list baseSubjectVoList as baseSubjectVo>
								<li onClick="search_myexam('subject',${baseSubjectVo.id!''},${search.isSubmit!'0'})" <#if search.subjectId?? && baseSubjectVo.id == search.subjectId> class="active" </#if> value="${baseSubjectVo.id!''}">${baseSubjectVo.name!''}</li>
								</#list>
							</ul>
						</div>
						<div class="grade_choice clearfix">
							<span class="test_type fl">考试类型：</span>
							<ul id ="examType" class="clearfix fl">
							<#assign  keys=examTypeMap?keys/>
							  <#if keys??>
							  <#list keys as key> 
								  <li onClick="search_myexam('examType',${key!''},${search.isSubmit!'0'})" <#if search.examType?? && key == search.examType> class="active" </#if> value="${key!''}">${examTypeMap["${key!''}"]}</li>
						      </#list>
						      </#if>
						     </ul>
						</div>
						<div class="slide_tab">
							<div class="test_name clearfix">
								<span class="fl">考试名称：</span>
								<label><input type="text" id ="examName" placeholder="输入考试名称查询" value=${search.examName!''}><i onClick="search_myexam('examName','0',${search.isSubmit!'0'})" class="iconfont">&#xe741;</i></label>
							</div>
						</div>
					</div>
					<div class="bd_2"><b class="show_hide"></b></div>
				</div>
				
				<#if pb.list?? && pb.list?size != 0>
					<#list pb.list as examStudent>
					<#if examStudent??>
						<div class="list_one">
							<div class="top_list clearfix">
								<#if examStudent.examInfoVo.startTime?? && examStudent.examInfoVo.endTime??>
									<p class="time">${examStudent.examInfoVo.startTime?date} ~ ${examStudent.examInfoVo.endTime?date}</p>
								</#if>
								
								<p class="school">${examStudent.examInfoVo.examName!''}</p>
								<p class="three"><span>年级:<#if examStudent.examInfoVo.bgv??>${examStudent.examInfoVo.bgv.name!''}</#if></span><span>考试类型：${examStudent.examInfoVo.examTypeName!''}</span></p>
								<#if examStudent.examInfoVo.endTime?? && examStudent.examInfoVo.startTime?? && search.isSubmit == '0' && examStudent.examInfoVo.endTime?datetime gt .now?datetime  && .now?datetime gt examStudent.examInfoVo.startTime?datetime>
									<p class="status fr">状态：进行中</p>
								<#elseif examStudent.examInfoVo.startTime?? && search.isSubmit == '0' && examStudent.examInfoVo.startTime?datetime gt .now?datetime>
									<p class="status fr">状态：未开始</p>
								<#else>
									<p class="status fr">状态：已结束</p>
								</#if>
							</div>
							<#if examStudent.examInfoVo.examDetailVoList??>
								<#list examStudent.examInfoVo.examDetailVoList as examDetailVo>
								<div class="detail clearfix">
									<#if search.isSubmit == '0' && .now?datetime gt examDetailVo.startTime?datetime && examDetailVo.endTime?datetime gt .now?datetime>
										<p class="fl some"><span>${examDetailVo.papersInfoVo.bsb.name}</span><span>${examDetailVo.startTime?string("yyyy-MM-dd HH:mm:ss")} ~ ${examDetailVo.endTime?string("yyyy-MM-dd HH:mm:ss")}</span><span>${examDetailVo.detailName}</span><span>总分：${examDetailVo.papersInfoVo.totalScore}</span><span>时长：${examDetailVo.papersInfoVo.testTime}分钟</span></p>
										<p class="start_do fr"><a href="${basePath!''}/exam/online/student/list/exam.htm?examId=${examInfoMap['${key}'].id}&paperId=${examDetailVo.paperId}&detailId=${examDetailVo.id}"><button>进入考试</button></a></p>
									<#elseif search.isSubmit == '0' && examDetailVo.startTime?datetime gt .now?datetime>
										<p class="fl some"><span>${examDetailVo.papersInfoVo.bsb.name}</span><span>${examDetailVo.startTime?string("yyyy-MM-dd HH:mm:ss")} ~ ${examDetailVo.endTime?string("yyyy-MM-dd HH:mm:ss")}</span><span>${examDetailVo.detailName}</span><span>总分：${examDetailVo.papersInfoVo.totalScore}</span><span>时长：${examDetailVo.papersInfoVo.testTime}分钟</span></p>
										<p class="start_do fr"><button disabled="disabled" style="background:#e5e5e5;color:#505050;">未开始考试</button></p>
									<#elseif search.isSubmit == '0' && .now?datetime gt examDetailVo.endTime?datetime >
										<p class="fl some"><span>${examDetailVo.papersInfoVo.bsb.name}</span><span>${examDetailVo.startTime?string("yyyy-MM-dd HH:mm:ss")} ~ ${examDetailVo.endTime?string("yyyy-MM-dd HH:mm:ss")}</span><span>${examDetailVo.detailName}</span><span>总分：${examDetailVo.papersInfoVo.totalScore}</span><span>时长：${examDetailVo.papersInfoVo.testTime}分钟</span></p>
										<p class="start_do fr"><button disabled="disabled" style="background:#e5e5e5;color:#505050;">未参加考试</button></p>
									<#elseif search.isSubmit == '1'>
										<p class="fl some"><span>${examDetailVo.papersInfoVo.bsb.name}</span><span>${examDetailVo.startTime?string("yyyy-MM-dd HH:mm:ss")} ~ ${examDetailVo.endTime?string("yyyy-MM-dd HH:mm:ss")}</span><span>${examDetailVo.detailName}</span><span>总分：${examDetailVo.papersInfoVo.totalScore}</span><span>时长：${examDetailVo.papersInfoVo.testTime}分钟</span></p>
										<p class="start_do fr"><a href="${basePath!''}/exam/online/student/list/toview.htm?examId=${examStudent.examInfoVo.id}&paperId=${examDetailVo.paperId}&detailId=${examDetailVo.id}"><button>查看答案</button></a></p>
									</#if>
								</div>
								</#list>
							</#if>
						</div>
						</#if>
					</#list>
				</#if>
				
				<!-- 分页 -->
				<#if (pb.totalPages>0) >
				<div class="page_list clearfix" id="demo2">
					<div class="mids fr">
						<ul class="page_num clearfix">
						   <#if pb.pageNo != 1>
						   	  <li onClick="search_myexam('page','${pb.firstPageNo!''}',${search.isSubmit!'0'})" >首页</li>
              	              <li onClick="search_myexam('page','${pb.prePageNo!''}',${search.isSubmit!'0'})" >上一页</li>
                           </#if>
                            <#list pb.startNo..pb.endNo as index>
              					<#if index == pb.pageNo>
              						<li class="active" onClick="search_myexam('page','${pb.pageNo}',${search.isSubmit!'0'})">${pb.pageNo}</li>
              					<#else>
              						<li  onClick="search_myexam('page','${index}',${search.isSubmit!'0'})">${index}</li>
              					</#if>
			  				</#list>
			  				
			  				 <#if pb.pageNo != pb.totalPages>
								<li onClick="search_myexam('page','${pb.nextPageNo!''}',${search.isSubmit!'0'})">下一页</li>
								<li onClick="search_myexam('page','${pb.lastPageNo!''}',${search.isSubmit!'0'})">未页</li>
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
	
</body>
<script src="${basePath!''}/js/jquery.min.js"></script>
<script type="text/javascript">
	//收起检索菜单
	$('.show_hide').click(function(){
		$(this).toggleClass('active');
		$('.slide_tab').slideToggle(600);
	})
	
	//格式时间
	function timestampformat(timestamp) {
	    return (new Date(timestamp)).format("yyyy-MM-dd");
	}
	
	//查询我的考试
	function search_myexam(type,ob,isSubmit){
		var examType = $('#examType li.active').attr('value');
		var subjectId = $('#subjectId li.active').attr('value');
	 	var examName = $.trim($('#examName').val());
	 	var url = "${basePath!''}/exam/online/student/list.htm?";
	 	if(type == 'subject'){
	 		var data = "examType="+examType+"&subjectId="+ob+"&examName="+examName+"&isSubmit="+isSubmit;
		 	window.location.href=url+data;
	 	}else if(type == 'examType'){
	 		var data = "examType="+ob+"&subjectId="+subjectId+"&examName="+examName+"&isSubmit="+isSubmit;
		 	window.location.href=url+data;
	 	}else if(type == 'examName'){
	 		var data = "examType="+examType+"&subjectId="+subjectId+"&examName="+examName+"&isSubmit="+isSubmit;
		 	window.location.href=url+data;
	 	}else{
	 		var data = "examType="+examType+"&subjectId="+subjectId+"&examName="+examName+"&pageNo="+ob+"&isSubmit="+isSubmit;
		 	window.location.href=url+data;
	 	}
 	}
</script>
</html>