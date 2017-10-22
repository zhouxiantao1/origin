<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>在线作业-作业管理</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/work_manage.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<!-- <div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>在线作业&gt;作业管理</h3>
					</div>
				</div> -->
				<div class="nav_list">
					<ul class="paper_list clearfix">
						<li class="active">作业管理</li>
					</ul>
				</div>
				
				<div class="all_content">
					<div class="operation clearfix">
						<p id="all" value=3>全部</p>
						<p id="deal" value=1>已完成</p>
						<p id="unfinish" value=2>未完成</p>
					</div>
				</div>	
				<div class="klass_sub">
					
					<span class="work_name">作业名称：</span>
					<input type="text" id="homeworkName" placeholder="输入作业名称">
					<button class="check fr" onClick="queryHomework()">查询</button>
				</div>
				
				<div>	
					<#if pageBean.list?? && pageBean.list?size != 0>
						<#list pageBean.list as WorkHomeworkClassesVo>
						
							<#assign isCollect='0'>
							<#if workAnswerVoList?? && workAnswerVoList?size != 0>
								<#list workAnswerVoList as vo>
									<#if vo.homeworkId == WorkHomeworkClassesVo.homeworkId>
										<#if vo.status??&&vo.status=='1'>
											<#assign isCollect='1'>
										<#else>
											<#assign isCollect='2'>
										</#if>
									</#if>
								</#list>
							</#if>
							
							<div class='work_list'>
									<div class='work_title clearfix'>
										<p class='tit fl'><#if WorkHomeworkClassesVo.workHomeworkVo??>${WorkHomeworkClassesVo.workHomeworkVo.title!''}<#else>&nbsp</#if></p>
										<p class='status fl'>状态：<#if isCollect=='0'>待完成<#elseif isCollect=='1'>已完成<#else>未完成</#if><span></span></p>
										<p class='create_time fr'>结束时间：<#if WorkHomeworkClassesVo.workHomeworkVo?? && WorkHomeworkClassesVo.workHomeworkVo.endTime??>${WorkHomeworkClassesVo.workHomeworkVo.endTime?string("yyyy-MM-dd HH:mm:ss")}</#if><span></span></p>
									</div>
									<div class='work_content clearfix'>
										<p class='tit fl'><span>题数：<#if WorkHomeworkClassesVo.workHomeworkVo??>${WorkHomeworkClassesVo.workHomeworkVo.qtnNum!''}</#if></span><span>班级：<#if WorkHomeworkClassesVo.baseClassesVo??>${WorkHomeworkClassesVo.baseClassesVo.name!''}</#if></span><span>学科：<#if WorkHomeworkClassesVo.workHomeworkVo??>${WorkHomeworkClassesVo.workHomeworkVo.baseSubjectVo.name!''}</#if></span></p>
										<p class='delete fr' onClick="go_view(${isCollect},${WorkHomeworkClassesVo.homeworkId!''})"><#if isCollect=='0'>进入作答<#else>查看答案</#if></p>
									</div>
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
		<#if status??>
			$("#status").val(${status!''});
		</#if>
		<#if title??>
			$("#homeworkName").val('${title!''}');
		</#if>
		
		$('.operation').on('click','p',function(){
			$('.operation p').removeClass('active');
			$(this).addClass('active');
			if($(this).attr("id")=='all'){
				window.location.href="${basePath!''}/work/homework/list.htm?status=3";
			}else if($(this).attr("id")=='undeal'){
				window.location.href="${basePath!''}/work/homework/list.htm?status=0";
			}else if($(this).attr("id")=='deal'){
				window.location.href="${basePath!''}/work/homework/list.htm?status=1";
			}else if($(this).attr("id")=='unfinish'){
				window.location.href="${basePath!''}/work/homework/list.htm?status=2";
			}
		})
		<#if status??>
			var status = ${status!''};
		<#else>
			var status = 3;
		</#if>
		if(status==0){
			$("#undeal").addClass('active');
		}else if(status==1){
			$("#deal").addClass('active');
		}else if(status==2){
			$("#unfinish").addClass('active');
		}else{
			$("#all").addClass('active');
		}
	});
	
	
	function go_view(num,homeworkId){
		if(num=='0'){
			answerHomework(homeworkId);
		}else{
			answerViewHomework(homeworkId);
		}		
	}
	
	function queryHomework(){
		var url ="${basePath!''}/work/homework/list.htm?";
		var homeworkName = $("#homeworkName").val();
		var data = "status="+$(".operation").children('.active').attr('value');
		if(homeworkName!=''&& homeworkName!=null){
			data += "&title="+$("#homeworkName").val();
		}
		window.location.href=url+data;
	}
	
	//分页查询
	function search_page(type,id){
		var url ="${basePath!''}/work/homework/list.htm?";
		var homeworkName = $("#homeworkName").val();
		var data = "status="+$(".operation").children('.active').attr('value');
		if(homeworkName!=''&& homeworkName!=null){
			data += "&title="+$("#homeworkName").val();
		}
		if(type == 'page'){
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
	}
	
	function answerHomework(homeworkId){
		var url ="${basePath!''}/work/homework/answer.htm?";
		var data = "id="+homeworkId;
		window.location.href=url+data;
	}
	
	function answerViewHomework(homeworkId){
		var url ="${basePath!''}/work/homework/answer/view.htm?";
		var data = "id="+homeworkId;
		window.location.href=url+data;
	}
	
	//返回
	function back_list(){
		window.location.href="${basePath!''}/work/homework/list.htm";
	}
</script>	
</body>
</html>