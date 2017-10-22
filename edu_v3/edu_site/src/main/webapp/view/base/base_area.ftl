<!DOCTYPE html>
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
						<li>人员管理</li>
						<li class="active">学校管理</li>
					</ul>
					<div class="new_zhibiao fr">
						<a onClick="avascript:window.location.href='${basePath!''}/base/staff/create.htm'"> <img src="${basePath!''}/images/形状-4.png"> <i>新增管理</i></a>
					</div>
				</div>
				

				<div class="all_content">
					<div class="operation clearfix">
						<p id="staff" class="active">学校管理</p>
						<p id="teacher" onClick="javascript:window.location.href='${basePath!''}/base/teacher/list.htm'">教师管理</p>
						<p id="student" onClick="javascript:window.location.href='${basePath!''}/base/student/list.htm'">学生管理</p>
						<p id="parent" onClick="javascript:window.location.href='${basePath!''}/base/parent/list.htm'">家长管理</p>
						<!-- <div class="mingti fr">
							<button onClick="javascript:window.location.href='${basePath!''}/base/staff/create.htm'"> <i>+</i> 新增</button>
						</div> -->
					</div>
					
					<div class="staff_list_contain">
						<div class="list_one clearfix">
							<p class="fl staff_towe">区域名称</p>
							<p class="fl staff_towe" >类型</p>
							<p class="fl staff_towe">区域</p>
							<p class="fl staff_towe">学校</p>
							<p class="fl staff_towe">操作</p>
						</div>
					</div>
					
					<#if pageBean.list?? && pageBean.list?size!=0>
						<#list pageBean.list as baseAreaVo>
							<div class="staff_list_contain">
			
								<div class="some_detail clearfix">
									<p class="fl staff_towe">${baseAreaVo.name!''}</p>
									<p class="fl staff_towe" ><#if baseAreaVo.level?? && baseAreaVo.level==1>市级<#elseif baseAreaVo.level==2>区级<#else>-</#if></p>
									<p class="fl staff_towe">1</p>
									<p class="fl staff_towe">1</p>
									<p class="fl staff_three"><span >查看</span></p>
									
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
			
		
	})
	
	
	//组装跳转
	function search_ask(type,id){
		var data = "";
		var url = "${basePath!''}/interlocution/report/list.htm?";
		var status = $(".operation").children('.active').attr('id');
		if(status=='undeal'){
			data += "&status="+0;
		}
		if(status=='udeal'){
			data += "&status="+1;
		}
		
		if(type == 'page'){
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
	}
</script>
</body>
</html>