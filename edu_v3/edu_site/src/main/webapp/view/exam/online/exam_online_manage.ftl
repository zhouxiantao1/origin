<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>考试管理</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/exam_manage.css">
</head>
<body>
	<#include '/common/top.ftl' />
	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="nav_list">
					<div class="one_line clearfix">
						<ul class="paper_list clearfix fl">
							<#if progress == "0">
								<li progress ="0" onclick = "queryExam(0)" class="active">全部</li>
								<li progress ="1" onclick = "queryExam(1)">进行中</li>
								<li progress ="2" onclick = "queryExam(2)">未开始</li>
								<li progress ="3" onclick = "queryExam(3)">已结束</li>
							<#elseif progress == "1">
								<li progress ="0" onclick = "queryExam(0)">全部</li>
								<li progress ="1" onclick = "queryExam(1)" class="active">进行中</li>
								<li progress ="2" onclick = "queryExam(2)">未开始</li>
								<li progress ="3" onclick = "queryExam(3)">已结束</li>
							<#elseif progress == "2">
								<li progress ="0" onclick = "queryExam(0)">全部</li>
								<li progress ="1" onclick = "queryExam(1)">进行中</li>
								<li progress ="2" onclick = "queryExam(2)" class="active">未开始</li>
								<li progress ="3" onclick = "queryExam(3)">已结束</li>
							<#else>
								<li progress ="0" onclick = "queryExam(0)">全部</li>
								<li progress ="1" onclick = "queryExam(1)">进行中</li>
								<li progress ="2" onclick = "queryExam(2)">未开始</li>
								<li progress ="3" onclick = "queryExam(3)" class="active">已结束</li>
							</#if>
						</ul>
						<div class="fr new_zhibiao"><a href="${basePath!''}/exam/online/manage/list/newexam.htm"><img src="${basePath!''}/images/形状-4.png"> <i>新建考试</i></a></div>
					</div>
				</div>
				
				<form  id="formId" action="${basePath!''}/exam/online/manage/list.htm" method="post"> 
					<div class="list">
						<#if pb.list?? && pb.list?size != 0>
							<#list pb.list as examInfoVo>
								<div class="list_1">
									<div class="list_reduce clearfix">
										<input class="fl" type="checkbox" name="">
										<p class="time fl">${examInfoVo.startTime?date}<i>~</i>${examInfoVo.endTime?date}</p>
										<p class="address fl">${examInfoVo.examName}</p>
										<p class="test_way fl">考试类型:${examInfoVo.examTypeName}</p>
										<p class="klass fl">年级:<span>${examInfoVo.bgv.name}</span></p>
										<p class="status fl"><span class="fl">考试方式：<#if examInfoVo.examMethod == "0">线上<#else>线下</#if></span></p>
										<#if (.now?datetime gt examInfoVo.endTime?datetime)>
											<p class="klass fl"><a style="color:#0075b1;" href="#" onclick = "startscheduling(${examInfoVo.id},${examInfoVo.examRange},'${examInfoVo.endTime?datetime}','${examInfoVo.examMethod}')">生成分析报告</a></p>
										</#if>
									</div>
									<#if examInfoVo.examDetailVoList?? && (examInfoVo.examDetailVoList?size > 0) >
										<#list examInfoVo.examDetailVoList as examDetailVo>
											<div class="subject_test">
												<p class="subject_time clearfix"><span class="fl">${examDetailVo.bsb.name}</span><span class="fr">${examDetailVo.startTime?string('yyyy-MM-dd HH:mm:ss')}</span></p>
												<p class="detail_name clearfix"><span class="fl">${examDetailVo.detailName}</span></p>
												<#if examInfoVo.examMethod == "1">
													<p class="long clearfix" ><span style="width:100px;">&nbsp;</span></p>
												<#else>
													<p class="long clearfix"><span class="fl">时长:${examDetailVo.papersInfoVo.testTime}分钟</span><span class="fr">总分:${examDetailVo.papersInfoVo.totalScore}</span></p>
												</#if>
												<#if examInfoVo.examMethod == "0">
													<#if (examDetailVo.startTime?datetime gt .now?datetime)>
													<p class="status">状态：未进行</p>
													<#elseif (.now?datetime gt examDetailVo.endTime?datetime)>
													<p class="status">状态：已结束</p>
													<#else>
													<p class="status">状态：进行中</p>
													</#if>
												<#else>
													<p class="status"><a style="color:#0075b1;" href="${basePath!''}/exam/offline/paperconf/list.htm?examName=${examInfoVo.examName}&examDetailId=${examDetailVo.id}&examTypeName='${examInfoVo.examTypeName}&examMethod='${examInfoVo.examMethod}'">试卷配置</a></p>
													<p class="status"><a style="color:#0075b1;" href="${basePath!''}/exam/offline/basicdata/list.htm?examName=${examInfoVo.examName}&examDetailId=${examDetailVo.id}&gradeId=${examInfoVo.bgv.id}&examTypeName='${examInfoVo.examTypeName}'&examMethod='${examInfoVo.examMethod}'">成绩</a></p>
												</#if>
											</div>
										</#list>
									</#if>
									<div class="add_more clearfix">
										<#if (examInfoVo.startTime?datetime gt .now?datetime)>
											<a style="color:#0075b1;" href="${basePath!''}/exam/online/examdetail/list.htm?id=${examInfoVo.id}&gradeId=${examInfoVo.bgv.id}&examType=${examInfoVo.examType}&examMethod=${examInfoVo.examMethod}&startTime=${examInfoVo.startTime?string('yyyy-MM-dd HH:mm:ss')}&endTime=${examInfoVo.endTime?string('yyyy-MM-dd HH:mm:ss')}"><p class="fl">+ 新增单科考试</p></a>
										</#if>
									</div>
								</div>
							</#list>
						</#if>
						<input type = "hidden" id="progress" name="progress" value=""/>
					</div>
				</form>
				
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
	
</body>

<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>

<script type="text/javascript">

//查询考试
function queryExam(obj){
	$("#progress").val(obj);
	$("#formId").submit();
}

//根据条件查询考试
function search_myexam(type,ob){
 	var progress = $('.one_line ul li.active').attr('progress');
	window.location.href="${basePath!''}/exam/online/manage/list.htm?progress="+progress+"&pageNo="+ob;
}

//生成分析报告
function startscheduling(examId,examRange,endTime,examMethod){
	var urlt ="";
	if(examMethod == "0"){
		urlt = '${basePath!''}/exam/online/schedulingconf/startscheduling.htm';
	}else{
		urlt = '${basePath!''}/exam/offline/schedulingconf/startscheduling.htm';
	}
	$.ajax({  
      type:'get',  
      url:urlt, 
      data:{'examId':examId,'examRange':examRange,'endTime':endTime}, 
      success:function(data){  
    	var Curedata = $.extend(true, [], data);      	  
		if (Curedata != null) {
		    alert(Curedata.msg);
		}                
      }  
	});
}
</script>

</html>