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
						<li class="active">人员管理</li>
						<li onClick="javascript:window.location.href='${basePath!''}/base/school/list.htm'">学校管理</li>
						<li onClick="javascript:window.location.href='${basePath!''}/base/grade/list.htm'">基础数据管理</li>
					</ul>
					<div class="new_zhibiao fr">
						<a onClick="jjavascript:window.location.href='${basePath!''}/base/staff/create.htm'"> <img src="${basePath!''}/images/形状-4.png"> <i>新增人员管理</i></a>
					</div>
				</div>
				
				<div class="all_content">
					<div class="operation clearfix">
						<p id="staff" class="active">管理员</p>
						<p id="teacher" onClick="javascript:window.location.href='${basePath!''}/base/teacher/list.htm'">教师管理</p>
						<p id="student" onClick="javascript:window.location.href='${basePath!''}/base/student/list.htm'">学生管理</p>
						<p id="parent" onClick="javascript:window.location.href='${basePath!''}/base/parent/list.htm'">家长管理</p>
						<!-- <div class="mingti fr">
							<button onClick="javascript:window.location.href='${basePath!''}/base/staff/create.htm'"> <i>+</i> 新增</button>
						</div> -->
					</div>
					
					<div class="klass_sub">
						<span>区域：</span>	
						<select id="areaId">
							<option value="">全部</option>
							<option value=1>广州市</option>
							<option value=2>荔湾区</option>
						  	<option value=3>越秀区</option>
						  	<option value=4>海珠区</option>
						  	<option value=5>天河区</option>
						  	<option value=6>白云区</option>
						  	<option value=7>黄埔区</option>
						  	<option value=8>番禺区</option>
						  	<option value=9>花都区</option>
						  	<option value=10>南沙区</option>
						  	<option value=11>从化区</option>
						  	<option value=12>增城区</option>
						</select>
						<span class="sub">类型：</span>
						<select id="type" >
							<option value="">全部</option>
							<option value=1>市教管员</option>
							<option value=2>市教研员</option>
							<option value=3>区教管员</option>
							<option value=4>区教研员</option>
							<option value=5>校教管员</option>
							<option value=6>校教研员</option>
							<option value=7>校长</option>
						</select>
						<span class="work_name">姓名：</span>
						<input type="text" id="staffName" placeholder="输入姓名">
						<button class="check fr" onClick="search_ask('query','1')">查询</button>
					</div>
					
					<div class="staff_list_contain">
						<div class="list_one clearfix">
							<p class="fl staff_towe">姓名</p>
							<p class="fl staff_towe" >类型</p>
							<p class="fl staff_towe">区域</p>
							<p class="fl staff_towe">学校</p>
							<p class="fl staff_towe">操作</p>
						</div>
					</div>
					
					<#if pageBean.list?? && pageBean.list?size!=0>
						<#list pageBean.list as baseStaffVo>
							<div class="staff_list_contain">
			
								<div class="some_detail clearfix">
									<p class="fl staff_towe">${baseStaffVo.name!''}</p>
									<p class="fl staff_towe" ><#if baseStaffVo.type=='1'>市教管员<#elseif baseStaffVo.type=='2'>市教研员<#elseif baseStaffVo.type=='3'>区教管员<#elseif baseStaffVo.type=='4'>区教研员<#elseif baseStaffVo.type=='5'>校教管员<#elseif baseStaffVo.type=='6'>校教研员<#elseif baseStaffVo.type=='7'>校长<#else>-</#if></p>
									<p class="fl staff_towe">${baseStaffVo.baseAreaVo.name!''}</p>
									<p class="fl staff_towe"><#if baseStaffVo.baseSchoolVo??>${baseStaffVo.baseSchoolVo.name!''}<#else>-</#if></p>
									<p class="fl staff_three"><span onClick="go_view(${baseStaffVo.id!''})">查看</span></p>
									
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
		<#if search??>	
			$('#areaId').val(${search.areaId!''});
			$('#typeId').val(${search.type!''});
			$('#staffName').val('${search.name!''}');
		</#if>	
		
	})
	
	function go_view(id){
		window.location.href="${basePath!''}/base/staff/view.htm?id="+id;
	}
	
	//组装跳转
	function search_ask(type,id){
		var data = "";
		var url = "${basePath!''}/base/staff/list.htm?";
		var areaId = $('#areaId').val();
		var typeId = $('#type').val();
		var staffName = $('#staffName').val();
		 
		if(type == 'page'){
			data += "&pageNo="+id;
		}

		if(areaId!=null && areaId!=''){
			data += "&areaId="+areaId;
		}
		if(typeId!=null && typeId!=''){
			data += "&type="+typeId;
		}
		if(staffName!=null && staffName!=''){
			data += "&name="+staffName;
		}		
		
		window.location.href=url+data;
	}
</script>
</body>
</html>