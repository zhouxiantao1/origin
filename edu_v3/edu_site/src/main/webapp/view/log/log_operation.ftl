<!DOCTYPE html>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>系统操作日志管理</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/xueye_record_stu.css">
	<style type="text/css">
		table{
			width:100%;
		}
		
		thead{
			background: #e4e4e4;
			font-weight:bold;
		}
		tr{box-sizing: border-box;}
		td{
			color: #333;
		    padding: 16px 14px;
		    font-size:12px;
		    box-sizing: border-box;
		}
		input{	
			height: 30px;
			padding-left: 5px;
		}
		
		.check{
			font-size:12px;
		}
		
		.select_project span {
		   font-size:12px;
		}
		
		.middle {
		    width: 1130px;
		}
	</style>
</head>
<body>

<!-- 引入公共头部 -->
<#include '/common/top.ftl' />

<div class="content_contain">
	<div class="content">
		<div class="middle fl">
			<div class="ce_nanage clearfix">
				<div class="contain_c fl">
					<h3>系统管理&gt;操作日志管理</h3>
				</div>
				<p class="back fr"><a href="javascript:history.back(-1)">返回上级</a></p>
			</div>
				
			<div class="select_project">
				<span>帐号：</span><input type="text" value="<#if search.userCode??>${search.userCode!''}</#if>" id="userCode"/>
				<span>姓名：</span><input type="text" value="<#if search.userName??>${search.userName!''}</#if>" id="userName"/>
				<span>ip：</span><input type="text" value="<#if search.ip??>${search.ip!''}</#if>" id="ip"/>
				<button class="check" onclick="search_operation_log()">查询</button>
			</div>	
			
			<!-- 分页 -->
			<#if pb.list?? && pb.list?size != 0>
			
			<div class="grade_list">
			<table>
				<thead>
				<tr>
					<td>操作帐号</td>
					<td>操作人</td>
					<td>操作时间</td>
					<td>操作ip</td>
					<td>请求地址</td>
					<td>操作内容</td>
				</tr>
				</thead>
				<tbody>
				<#list pb.list as log>
				<tr>
					<td>${log.userCode!''}</td>
					<td><b>${log.userName!''}</b></td>
					<td>${log.operateTime?string("yyyy-MM-dd HH:mm:ss")}</td>
					<td>${log.ip!''}</td>
					<td>${log.operateUrl!''}</td>
					<td>${log.operateData!''}</td>
				</tr>
				</#list>
				</tbody>
			</table>
			</div>
			
			
			<div class="page_list clearfix" id="demo2">
				<div class="mids fr">
					<ul class="page_num clearfix">
					   <#if pb.pageNo != 1>
					   	  <li onClick="search_operation_log('${pb.firstPageNo!''}')" >首页</li>
          	              <li onClick="search_operation_log('${pb.prePageNo!''}')" >上一页</li>
                       </#if>
                        <#list pb.startNo..pb.endNo as index>
          					<#if index == pb.pageNo>
          						<li class="active"   onClick="search_operation_log('${pb.pageNo}')">${pb.pageNo}</li>
          					<#else>
          						<li  onClick="search_operation_log('${index}')">${index}</li>
          					</#if>
		  				</#list>
		  				
		  				 <#if pb.pageNo != pb.totalPages>
							<li onClick="search_operation_log('${pb.nextPageNo!''}')">下一页</li>
							<li onClick="search_operation_log('${pb.lastPageNo!''}')">未页</li>
          				</#if>
          				<li>${pb.pageNo}/${pb.totalPages}</li>
          				<li>共${pb.rows}条记录，分 ${pb.totalPages} 页</li>
					</ul>
				</div>
			</div>
				<#else>
					<h1 class="tips_msg"><img src="${basePath!''}/images/no-content.png"><br>暂无操作信息！！！</h1>
				</#if>
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

	function search_operation_log(pageNo){
		
		var userCode = $('#userCode').val();
		var userName = $('#userName').val();
		var ip = $('#ip').val();
		
		var url = "${basePath!''}/log/operation/list.htm?timer="+ new Date().getTime();
		var data = "";
		
		if(userCode != ''){
			data += "&userCode="+userCode;
		}
		
		if(userName !=''){
			data += "&userName="+userName;
		}
		
		if(ip !=''){
			data += "&ip="+ip;
		}
		
		if(pageNo != undefined){
			data += "&pageNo="+pageNo;
		}
		
		window.location.href=url+data;
				
		
	}
</script>


</body>
</html>