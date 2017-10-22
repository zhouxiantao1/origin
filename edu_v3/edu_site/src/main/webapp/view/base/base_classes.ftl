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
						<@security.authorize url="/base/school/list.htm"><li class="active">学校管理</li></@security.authorize>
						<@security.authorize url="/base/grade/list.htm"><li onClick="javascript:window.location.href='${basePath!''}/base/grade/list.htm'">基础数据管理</li></@security.authorize>
					</ul>
					<div class="new_zhibiao fr">
						<a onClick="javascript:window.location.href='${basePath!''}/base/classes/create.htm'"> <img src="${basePath!''}/images/形状-4.png"> <i>新增管理</i></a>
					</div>
				</div>

				<div class="all_content">
					<div class="operation clearfix">
						<p id="staff" onClick="javascript:window.location.href='${basePath!''}/base/school/list.htm'">学校管理</p>
						<p id="teacher" class="active">班级管理</p>
						<!-- <div class="mingti fr">
							<button onClick="javascript:window.location.href='${basePath!''}/base/classes/create.htm'"> <i>+</i> 新增</button>
						</div> -->
					</div>
					<div class="klass_sub">
						<span>区域：</span>	
						<select id="areaId" onChange="fillSchool()">
							<option value="">全部</option>
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
						<span class="sub">学校：</span>
						<select id="schoolId">
							<option value="">全部</option>
						</select>
						<span class="work_name">班级名称：</span>
						<input type="text" id="classesName" placeholder="输入姓名">
						<button class="check fr" onClick="search_ask('query','1')">查询</button>
					</div>
					<div class="staff_list_contain">
						<div class="list_one clearfix">
							<p class="fl school_towe">班级名称</p>
							<p class="fl school_towe" >学校</p>
							<p class="fl school_towe">操作</p>
						</div>
					</div>
					
					<#if pageBean.list?? && pageBean.list?size!=0>
						<#list pageBean.list as baseClassesVo>
							<div class="staff_list_contain">
			
								<div class="some_detail clearfix">
									<p class="fl school_towe">${baseClassesVo.name!''}</p>
									<p class="fl school_towe" ><#if baseClassesVo.baseSchoolVo??>${baseClassesVo.baseSchoolVo.name!''}<#else>-</#if></p>
									<p class="fl school_three1"><span >查看</span></p>
									
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
			$('#classesName').val('${search.name!''}');
		</#if>
		
	})
	
	function fillSchool(){
		var html = '<option value="">全部</option>';
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/school/listbyareaid.htm',  
          data:{'areaId':$("#areaId").val()},
          async:false,
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#schoolId").html(html);
			
			    }                
          }  
       });
	}
	
	//组装跳转
	function search_ask(type,id){
		var data = "";
		var url = "${basePath!''}/base/classes/list.htm?";
		var name = $('#classesName').val();
		var areaId = $('#areaId').val();
		var schoolId = $('#schoolId').val();
		
		if(areaId!=null && areaId!=''){
			data += "&areaId="+areaId;
		}
		if(schoolId!=null && schoolId!=''){
			data += "&schoolId="+schoolId;
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