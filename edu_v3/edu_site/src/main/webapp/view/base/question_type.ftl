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
						<a onClick="javascript:window.location.href='${basePath!''}/question/type/create.htm'"> <img src="${basePath!''}/images/形状-4.png"> <i>新增题型管理</i></a>
					</div>
				</div>
				<div class="all_content">
					<div class="operation clearfix">
						<p id="staff" onClick="javascript:window.location.href='${basePath!''}/base/grade/list.htm'">年级管理</p>
						<p id="teacher" onClick="javascript:window.location.href='${basePath!''}/base/subject/list.htm'">学科管理</p>
						<p id="staff" class="active">题型管理</p>
						<p id="teacher" onClick="javascript:window.location.href='${basePath!''}/base/catalog/list.htm'">教材管理</p>
						<p id="teacher" onClick="javascript:window.location.href='${basePath!''}/base/knowledge/list.htm'">知识点管理</p>
						<!-- <div class="mingti fr">
							<button onClick="javascript:window.location.href='${basePath!''}/question/type/create.htm'"> <i>+</i> 新增</button>
						</div> -->
					</div>
					<div class="klass_sub">
						<span class="sub">学科：</span>
						<select id="subjectId">
							<option value="">全部</option>
							<option value="1">语文</option>
							<option value="2">数学</option>
							<option value="3">英语</option>
							<option value="4">物理</option>
							<option value="5">化学</option>
							<option value="6">生物</option>
							<option value="7">历史</option>
							<option value="8">政治</option>
							<option value="9">地理</option>
							<option value="10">小学奥数</option>
							<option value="11">科学</option>	
						</select>
						
						<span class="work_name">题型名称：</span>
						<input type="text" id="typeName" placeholder="输入题型名称">
						<button class="check fr" onClick="search_ask('query','1')">查询</button>
					</div>
					<div class="staff_list_contain">
						<div class="list_one clearfix">
							<p class="fl catalog_one">题型名称</p>
							<p class="fl catalog_towe" >学科</p>
							<p class="fl catalog_towe" >是否客观题</p>
							<p class="fl catalog_towe" >阅卷机制</p>
							<p class="fl staff_towe">操作</p>
						</div>
					</div>
					
					<#if pb.list?? && pb.list?size!=0>
						<#list pb.list as questionTypeVo>
							<div class="staff_list_contain">
								<div class="some_detail clearfix">
									<p class="fl catalog_one2"><#if questionTypeVo.typeName??>${questionTypeVo.typeName!''}<#else>-</#if></p>
									<p class="fl catalog_towe" ><#if questionTypeVo.subjectId??>
										<#if questionTypeVo.subjectId==1>语文
										<#elseif questionTypeVo.subjectId==2>数学
										<#elseif questionTypeVo.subjectId==3>英语
										<#elseif questionTypeVo.subjectId==4>物理
										<#elseif questionTypeVo.subjectId==5>化学
										<#elseif questionTypeVo.subjectId==6>生物
										<#elseif questionTypeVo.subjectId==7>历史
										<#elseif questionTypeVo.subjectId==8>政治
										<#elseif questionTypeVo.subjectId==9>地理
										<#elseif questionTypeVo.subjectId==10>小学奥数
										<#elseif questionTypeVo.subjectId==11>科学
										<#else>-</#if></#if>
									</p>
									<p class="fl catalog_towe" >
										<#if questionTypeVo.isObjective??>
											<#if questionTypeVo.isObjective=='0'>否<#elseif questionTypeVo.isObjective=='1'>是<#else>-</#if>
										</#if>
									</p>
									<p class="fl catalog_towe" >
										<#if questionTypeVo.markingCode??>
											<#if questionTypeVo.markingCode=='0'>非机器阅卷
											<#elseif questionTypeVo.markingCode=='1'>选择题
											<#elseif questionTypeVo.markingCode=='2'>多选题
											<#elseif questionTypeVo.markingCode=='3'>填空题
											<#elseif questionTypeVo.markingCode=='4'>多填空题
											<#elseif questionTypeVo.markingCode=='5'>判断题
											<#else>-</#if>
										</#if>
									</p>
									<p class="fl staff_three1"><span >查看</span></p>
									
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
			$('#subjectId').val(${search.subjectId!''});
			$('#typeName').val('${search.typeName!''}');
		</#if>	
		
	})
	
	
	//组装跳转
	function search_ask(type,id){
		var data = "";
		var url = "${basePath!''}/question/type/list.htm?";
		var subjectId = $('#subjectId').val();
		var name = $('#typeName').val();
		
		if(subjectId!=null && subjectId!=''){
			data += "&subjectId="+subjectId;
		}
		if(name!=null && name!=''){
			data += "&typeName="+name;
		}
		if(type == 'page'){
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
	}
</script>
</body>
</html>