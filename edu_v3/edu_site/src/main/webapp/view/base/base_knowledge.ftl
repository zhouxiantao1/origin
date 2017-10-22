<!DOCTYPE html>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>基础信息-管理人员</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/report_manage.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/wenjuan_biaoku.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 
	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="nav_list clearfix">
					<ul class="paper_list fl clearfix">
						<li onClick="javascript:window.location.href='${basePath!''}/base/staff/list.htm'">人员管理</li>
						<@security.authorize url="/base/school/list.htm"><li onClick="javascript:window.location.href='${basePath!''}/base/school/list.htm'">学校管理</li></@security.authorize>
						<@security.authorize url="/base/grade/list.htm"><li class="active">基础数据管理</li></@security.authorize>
					</ul>
					<div class="new_zhibiao fr">
						<a onClick="javascript:window.location.href='${basePath!''}/base/knowledge/create.htm?'"> <img src="${basePath!''}/images/形状-4.png"> <i>新增知识点</i></a>
					</div>
				</div>

				<div class="all_content">
					<div class="operation clearfix">
						<p id="staff" onClick="javascript:window.location.href='${basePath!''}/base/grade/list.htm'">年级管理</p>
						<p id="teacher" onClick="javascript:window.location.href='${basePath!''}/base/subject/list.htm'">学科管理</p>
						<p id="staff" onClick="javascript:window.location.href='${basePath!''}/question/type/list.htm'">题型管理</p>
						<p id="teacher" onClick="javascript:window.location.href='${basePath!''}/base/catalog/list.htm'">教材管理</p>
						<p id="teacher" class="active">知识点管理</p>
						<!-- <div class="mingti fr">
							<button onClick="javascript:window.location.href='${basePath!''}/base/knowledge/create.htm?'"> <i>+</i> 新增</button>
						</div> -->
					</div>
					<div class="klass_sub">
						<span>学段：</span>	
						<select id="stageId" onChange="fillSchool()">
							<option value="">全部</option>
							<option value="1">小学</option>
							<option value="2">初中</option>
							<option value="3">高中</option>
						</select>
						<span class="sub">学科：</span>
						<select id="subjectId">
							<option value="">全部</option>
							<#if baseSubjectVos?? && baseSubjectVos?size!=0>
								<#list baseSubjectVos as baseSubjectVo>
									<option value=${baseSubjectVo.id!''}>${baseSubjectVo.name!''}</option>
								</#list>
							</#if>
						</select>
						
						<span class="work_name">知识点名称：</span>
						<input type="text" id="knowledgeName" placeholder="输入教材名称">
						<button class="check fr" onClick="search_ask('query','1')">查询</button>
					</div>
					<div class="staff_list_contain">
						<div class="list_one clearfix">
							<p class="fl catalog_one">知识模块名称</p>
							<p class="fl catalog_towe" >学段</p>
							<p class="fl catalog_towe" >学科</p>
							<p class="fl catalog_towe" >年级</p>
							<p class="fl staff_towe">操作</p>
						</div>
					</div>
					
					<#if pb.list?? && pb.list?size!=0>
						<#list pb.list as baseKnowledgeVo>
							<div class="staff_list_contain" >
								<div class="some_detail clearfix">
									<p class="fl catalog_one2" >${baseKnowledgeVo.name!''}</p>
									<p class="fl catalog_towe" ><#if baseKnowledgeVo.baseStageVo??>${baseKnowledgeVo.baseStageVo.name!''}<#else>-</#if></p>
									<p class="fl catalog_towe" ><#if baseKnowledgeVo.baseSubjectVo??>${baseKnowledgeVo.baseSubjectVo.name!''}<#else>-</#if></p>
									<p class="fl catalog_towe" >-</p>
									<p class="fl staff_three"><button onClick="go_edit(${baseKnowledgeVo.id!''})">编辑</button></p>
									
								</div>
								<div id="catalog_${baseKnowledgeVo.id!''}"></div>
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
						   	  <li onClick="search_ask('page','${pageBean.firstPageNo!''}')" >首页</li>
              	              <li onClick="search_ask('page','${pageBean.prePageNo!''}')" >上一页</li>
                           </#if>
                            <#list pageBean.startNo..pageBean.endNo as index>
              					<#if index == pageBean.pageNo>
              						<li class="active"   onClick="search_ask('page','${pageBean.pageNo}')">${pageBean.pageNo}</li>
              					<#else>
              						<li  onClick="search_ask('page','${index}')">${index}</li>
              					</#if>
			  				</#list>
			  				
			  				 <#if pageBean.pageNo != pageBean.totalPages>
								<li onClick="search_ask('page','${pageBean.nextPageNo!''}')">下一页</li>
								<li onClick="search_ask('page','${pageBean.lastPageNo!''}')">未页</li>
              				</#if>
              				<li>${pageBean.pageNo}/${pageBean.totalPages}</li>
              				<li>共${pageBean.rows}条记录，分 ${pageBean.totalPages} 页</li>
						</ul>
					</div>	
				</div>
				
			</div>

		<!-- 右侧边栏 -->


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
		<#if search??>	
			$('#stageId').val(${search.stageId!''});
			$('#subjectId').val('${search.subjectId!''}');
			$('#knowledgeName').val('${search.name!''}');
		</#if>	
		
	})
	
	function go_edit(id){
		window.location.href = "${basePath!''}/base/knowledge/edit.htm?id="+id;
	}
	
	//组装跳转
	function search_ask(type,id){
		var data = "";
		var url = "${basePath!''}/base/knowledge/list.htm?";
		var subjectId = $('#subjectId').val();
		var stageId = $('#stageId').val();
		var name = $('#knowledgeName').val();
		if(subjectId!=null && subjectId!=''){
			data += "&subjectId="+subjectId;
		}
		if(stageId!=null && stageId!=''){
			data += "&stageId="+stageId;
		}
		if(name!=null && name!=''){
			data += "&name="+name;
		}
		if(type == 'page'){
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
	}
</script>
</body>
</html>