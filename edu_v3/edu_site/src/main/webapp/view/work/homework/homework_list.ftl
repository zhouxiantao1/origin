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
						<li><a href="${basePath!''}/work/homework/set.htm">布置作业</a></li>
					</ul>
					<div class="condition_list">
						<div class="stage_choice clearfix">
							<span class="fl">班级：</span>	
							<ul id="classesId" class="fl">
								<li value="" <#if classesId??><#else>class="active"</#if>>全部</li>
								<#if classesVoList?? && classesVoList?size != 0>
									<#list classesVoList as teacherClasses>
										<li value=${teacherClasses.baseClassesVo.id} <#if classesId?? && classesId==teacherClasses.baseClassesVo.id>class="active"</#if>>${teacherClasses.baseClassesVo.name}</li>
									</#list>
								</#if>
							</ul>
						</div>
						<div class="stage_choice clearfix">
							<span class="sub fl">学科：</span>
							<ul id="subjectId" class="fl">
								<li value="" <#if subjectId??><#else>class="active"</#if>>全部</li>
								<#if subjectVoList?? && subjectVoList?size != 0>
									<#list subjectVoList as teacherClasses>
										<li value=${teacherClasses.baseSubjectVo.id} <#if subjectId?? && subjectId==teacherClasses.baseSubjectVo.id>class="active"</#if>>${teacherClasses.baseSubjectVo.name}</li>
									</#list>
								</#if>
							</ul>
						</div>
						<div class="slide_tab">
							<div class="test_name clearfix">
								<span class="fl">考试名称：</span>
								<label><input type="text" id="homeworkName" placeholder="输入作业名称"><i  onClick="search_page()" class="iconfont">&#xe741;</i></label>
							</div>
						</div>
					</div>
					<div class="bd_2"><b class="show_hide"></b></div>
				</div>
				
<!-- 
				<div class="klass_sub">
					<span>班级：</span>	
					<select id="classesId">
						<option value="">全部</option>
						<#if classesVoList?? && classesVoList?size != 0>
							<#list classesVoList as teacherClasses>
								<option value=${teacherClasses.baseClassesVo.id} >${teacherClasses.baseClassesVo.name}</option>
							</#list>
						</#if>
					</select>
					<span class="sub">学科：</span>
					<select id="subjectId" >
						<option value="">全部</option>
						<#if subjectVoList?? && subjectVoList?size != 0>
							<#list subjectVoList as teacherClasses>
								<option value=${teacherClasses.baseSubjectVo.id} >${teacherClasses.baseSubjectVo.name}</option>
							</#list>
						</#if>
					</select>
					<span class="work_name">作业名称：</span>
					<input type="text" id="homeworkName" placeholder="输入作业名称">
					<button class="check fr" onClick="search_page()">查询</button>
				</div> -->
				
				<#if pageBean.list?? && pageBean.list?size != 0>
					<#list pageBean.list as workHomeworkVo>
						<div class="work_list">
							<div class="work_title clearfix">
								<p class="tit fl"><#if workHomeworkVo.title??>${workHomeworkVo.title!''}<#else>&nbsp</#if></p>
								<p class="status fl">状态：<span><#if workHomeworkVo.status='0'>未开始<#elseif workHomeworkVo.status='1'>进行中<#elseif workHomeworkVo.status='2'>已结束</#if></span></p>
								<p class="create_time fr">创建时间：<span><#if workHomeworkVo.createTime??>${workHomeworkVo.createTime?string("yyyy/MM/dd HH:mm:ss")}</#if></span></p>
							</div>
							<div class="work_content clearfix">
								<p class="tit fl"><span>题目数:${workHomeworkVo.qtnNum!''}</span><span>截止时间：<#if workHomeworkVo.endTime??>${workHomeworkVo.endTime?string("yyyy-MM-dd HH:mm:ss")}</#if></span><span>完成人数：${workHomeworkVo.finishNum!''}人</span></p>
								<#if workHomeworkVo.finishNum?? && workHomeworkVo.finishNum==0><p1>未有人完成</p1><#else><p class="check_status fl" onclick="view_finish('${workHomeworkVo.id!''}')">查看完成情况</p></#if>
								<p class="delete fr" onClick="view_work('${workHomeworkVo.id!''}')">预览作业</p>
							</div>
						</div>
					</#list>
				
				<#else>
					<h1 class="answer_msg"><img src="${basePath!''}/images/no-content.png"><br>暂无信息！！！</h1>
				</#if>
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
		//收起检索菜单
		$('.show_hide').click(function(){
			$(this).toggleClass('active');
			$('.slide_tab').slideToggle(600);
		})
		
		$('#classesId').on('click','li',function(){
			$('#classesId li').removeClass('active');
			$(this).addClass('active');	
			search_page();
		})
		
		$('#subjectId').on('click','li',function(){
			$('#subjectId li').removeClass('active');
			$(this).addClass('active');
			search_page();
		})
		
		$("#classesId").val(${classesId!''});
		$("#subjectId").val(${subjectId!''});
		$("#homeworkName").val(${title!''});
	})
		function queryHomework(){
			var url ="${basePath!''}/work/homework/list.htm?";
			var data = "subjectId="+$("#subjectId").val()+"&classesId="+$("#classesId").val()+"&title="+$("#homeworkName").val();
			window.location.href=url+data;
		}
		//查看作业
		function view_work(id){
			window.location.href="${basePath!''}/work/homework/view.htm?id="+id;
		}
		//查看完成情况
		function view_finish(homeworkId){
			window.location.href="${basePath!''}/work/homework/finish.htm?homeworkId="+homeworkId;
		}
		//分页查询
		function search_page(type,id){
			var data = "";
			var subjectId = $("#subjectId").children('.active').val();
			var classesId = $("#classesId").children('.active').val();
			var title = $("#homeworkName").val();
			//var data = "&subjectId="+$("#subjectId").val()+"&classesId="+$("#classesId").val()+"&title="+$("#homeworkName").val();
			var url = "${basePath!''}/work/homework/list.htm?";
			if(subjectId!=null && subjectId!=''){
				data += "&subjectId="+subjectId;
			}
			if(classesId!=null && classesId!=''){
				data += "&classesId="+classesId;
			}
			if(title!=null && title !=''){
				data += "&title="+title;
			}
			if(type == 'page'){
				data += "&pageNo="+id;
			}
			window.location.href=url+data;
		}
	
</script>	
</body>
</html>