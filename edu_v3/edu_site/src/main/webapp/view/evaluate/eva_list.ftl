<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/testManage.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="nav_list clearfix">
					<ul class="fl paper_list operation clearfix ">
						<li id="all" value="4">全部</li>
						<li id="unDeal" value="1">未开始</li>
						<li id="deal" value="2">进行中</li>
						<li id="finish" value="3">已结束</li>
					</ul>
					<div class="fr new_zhibiao"><a href="${basePath!''}/evaluate/eva/create.htm"><img src="${basePath!''}/images/形状-4.png"> <i>新建测评</i></a></div>
				</div>

				<div class="list">
					<#if pageBean.list?? && pageBean.list?size!=0>
						<#list pageBean.list as EvaluateEvaVo>
							<div class="list_2">
								<div class="list_reduce clearfix">	
									<p class="title fl">${EvaluateEvaVo.name!''}</p>
									<p class="time fl">${EvaluateEvaVo.startTime?string("yyyy-MM-dd")} <i>~</i> ${EvaluateEvaVo.endTime?string("yyyy-MM-dd")}</p>
									<p class="status1 fl"><#if EvaluateEvaVo.status=='1'>未开始<#elseif EvaluateEvaVo.status=='2'>进行中<#else>已结束</#if></p>
									<#if EvaluateEvaVo.status=='3'><p class="edit fr" onClick="eva_report()">查看报告</p><#else><p class="edit1 fr">查看报告</p></#if>
								</div>
								<#if EvaluateEvaVo.evaluateEvaDetailVoList?? && EvaluateEvaVo.evaluateEvaDetailVoList?size!=0>
									<#list EvaluateEvaVo.evaluateEvaDetailVoList as evaluateEvaDetailVo>
										<div class="list_item clearfix">
											<p class="time fl">${evaluateEvaDetailVo.name!''}</p>
											<p class="address fl"><#if evaluateEvaDetailVo.type??><#if evaluateEvaDetailVo.type=='0'>线上问卷<#else>线下问卷</#if></#if></p>
											<p class="create fl">问卷对象：<#if evaluateEvaDetailVo.evaObject??><#if evaluateEvaDetailVo.evaObject=='1'>学生<#elseif evaluateEvaDetailVo.evaObject=='2'>家长<#elseif evaluateEvaDetailVo.evaObject=='3'>老师<#else>校长</#if></#if></p>
											<p class="status fl"><#if evaluateEvaDetailVo.status??><#if evaluateEvaDetailVo.status=='1'>未开始<#elseif evaluateEvaDetailVo.status=='2'>进行中<#else>已结束</#if></#if></p>
											<#if evaluateEvaDetailVo.status=='3'><p class="edit"><span onClick="go_report()">查看报告<span></p><#elseif evaluateEvaDetailVo.status=='2'><p class="edit"><span onClick="go_view(${evaluateEvaDetailVo.id!''})">查看</span><span1>删除</span1></p><#else><p class="edit"><span onClick="go_view(${evaluateEvaDetailVo.id!''})">查看</span><span onClick="delete_evaDetail(${evaluateEvaDetailVo.id!''})">删除</span></p></#if>
										</div>
									</#list>
								</#if>
								<#if EvaluateEvaVo.status=='3'>
								<#else>
									<div class="add_more clearfix">
										<p class="fl" onclick="go_evaDetail(${EvaluateEvaVo.id!''})">+ 新增单次测评</p>
									</div>
								</#if>
								
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
				<!-- 分页 -->
			</div>

			<div class="content_right fr">
				<p class="hr"></p>
				<form>
					<div class="form_div">
						<i></i>
						<input type="text" name="" placeholder="搜索...">
					</div>
				</form>
				<p class="hr"></p>

				<h3>筛选</h3>
				<div class="shaixuan">
					<p><i>测评对象</i><span>全部</span></p>
					<p><i>学段</i><span>通用</span></p>
					<p><i>测评名称</i><input type="text" placeholder="请输入测评名称"></p>
				</div>

				<p class="hr m_top"></p>

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
	
		$('.content_right').hide();
	
		$('.operation').on('click','li',function(){
			$('.operation li').removeClass('active');
			$(this).addClass('active');
			if($(this).attr("id")=='all'){
				window.location.href="${basePath!''}/evaluate/eva/list.htm?";
			}else if($(this).attr("id")=='unDeal'){
				window.location.href="${basePath!''}/evaluate/eva/list.htm?status=1";
			}else if($(this).attr("id")=='deal'){
				window.location.href="${basePath!''}/evaluate/eva/list.htm?status=2";
			}else if($(this).attr("id")=='finish'){
				window.location.href="${basePath!''}/evaluate/eva/list.htm?status=3";
			}
		})
		<#if status??>
			var status = ${status!''};
		</#if>
		if(status=='1'){
			$("#unDeal").addClass('active');
		}else if(status=='2'){
			$("#deal").addClass('active');
		}else if(status=='3'){
			$("#finish").addClass('active');
		}else{
			$("#all").addClass('active');
		}
		
	})
	//跳转到测评明细新增页面
	function go_evaDetail(evaId){
		var url = "${basePath!''}/evaluate/evaDetail/create.htm?";
		var data = "evaId="+evaId;
		window.location.href=url + data;
	}
	
	//跳转到测评新增页面
	function go_evaCreate(){
		window.location.href="${basePath!''}/evaluate/eva/create.htm?";
	}
	
	//查询跳转
	function search_page(type,id){
		var url = "${basePath!''}/evaluate/eva/list.htm?";
		var data = "";
		<#if status??>
			data +="&status="+${status!''}
		</#if> 
		if(type=='page'){
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
	}
	
	//跳转到报告页面
	function go_report(){
		window.location.href="${basePath!''}/evaluate/evaDetail/report.htm?";
	}
	
	//跳转到查看页面
	function go_view(id){
		window.location.href="${basePath!''}/evaluate/evaDetail/edit.htm?id="+id;
	}
	
	//跳转到报告页面
	function eva_report(){
		window.location.href="${basePath!''}/evaluate/eva/report.htm?";
	}	
	
	//逻辑删除
	function delete_evaDetail(id){
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/evaluate/evaDetail/listbyid/update.htm?',
			data:{'delflag':'1','id':id}, 
			async: false,
			success:function(data){  
				if(data!=0){
					alert("删除成功！");
					window.location.reload();
				}
			}  
		});	
	}
			
</script>
</body>
</html>