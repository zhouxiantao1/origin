<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>问卷量表库-指标体系管理</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
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
						<li><a href="${basePath!''}/evaluate/paper/list.htm">问卷管理</a></li>
						<li class="active">指标体系管理</li>
					</ul>
					<div class="fr new_zhibiao" onclick="go_create()"><img src="${basePath!''}/images/形状-4.png"><i>新增指标体系</i></div>
				</div>
				
				
				<div class="all_content">
					<div class="operation clearfix">
						<p id="all" value=3>全部</p>
						<p id="undeal" value=1>通用指标</p>
						<p id="deal" value=2>自定义指标</p>
					</div>
				</div>
				
				<div class="paper_list_contain">
					<div class="list_one clearfix">
						<p class="fl one">指标体系名称</p>
						<p class="fl towe">使用次数</p>
						<p class="fl towe">创建者</p>
						<p class="fl towe">创建时间</p>
						<p class="fl towe">操作</p>
					</div>
				</div>
				<#if pageBean.list?? && pageBean.list?size!=0>
					<#list pageBean.list as evaluateIndicatorVo>
						<div class="paper_list_contain">
							<div class="some_detail clearfix">
								<p class="fl one">${evaluateIndicatorVo.name!''}</p>
								<p class="fl towe">${evaluateIndicatorVo.useNum!''}</p>
								<p class="fl towe">${evaluateIndicatorVo.createName!''}</p>
								<p class="fl towe"><#if evaluateIndicatorVo.createTime??>${evaluateIndicatorVo.createTime?string("yyyy-MM-dd")}</#if></p>
								<p class="fl three"><span onClick="query_view(${evaluateIndicatorVo.id!''})">查看</span>&nbsp<#if evaluateIndicatorVo.useNum==0 && evaluateIndicatorVo.type=='2'><span onClick="delete_indicator(${evaluateIndicatorVo.id!''})">删除</span><#else><span1>删除</span1></#if></p>	
								
							</div>
						</div>
					</#list>
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

			<!-- 右侧边栏 -->
			<div class="content_right fr">
				<p class="hr"></p>
				<form>
					<div class="form_div">
						<i><!-- <img src="${basePath!''}/images/搜索(1).png"> --></i>
						<input type="text" name="" placeholder="搜索...">
					</div>
				</form>
				<p class="hr"></p>
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
	
		$('.operation').on('click','p',function(){
				$('.operation p').removeClass('active');
				$(this).addClass('active');
				if($(this).attr("id")=='all'){
					window.location.href="${basePath!''}/evaluate/indicator/list.htm?type=3";
				}else if($(this).attr("id")=='undeal'){
					window.location.href="${basePath!''}/evaluate/indicator/list.htm?type=1";
				}else if($(this).attr("id")=='deal'){
					window.location.href="${basePath!''}/evaluate/indicator/list.htm?type=2";
				}
			})
			<#if type??>
				var type = ${type!''};
			<#else>
				var type = 3;
			</#if>
			if(type==1){//通用
				$("#undeal").addClass('active');
			}else if(type==2){//自定义
				$("#deal").addClass('active');
			}else{
				$("#all").addClass('active');
			}
	})
	function go_create(){
		window.location.href="${basePath!''}/evaluate/indicator/create.htm?";
	}
	
	//删除
	function delete_indicator(id){
		$.ajax({  
			type:'post',  
		    url:'${basePath!''}/evaluate/indicator/listbyid/update.htm?', 
		    data:{'id':id,'delflag':'1'}, 
		    success:function(data){  
		    	window.location.reload();
		    }  
	 	});
	}
	
	//查看
	function query_view(id){
		window.location.href="${basePath!''}/evaluate/indicator/view.htm?indicatorId="+id;
	}
	
	//分页查询
	function search_page(type,id){
		var url = "${basePath!''}/evaluate/indicator/list.htm?";
		var data = "";
		<#if type??>
			data +="&type=${type!''}";
		</#if>
		if(type=='page'){
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
	}
</script>

</body>
</html>