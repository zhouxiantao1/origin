<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>问卷量表库-问卷管理</title>
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
						<li class="active">问卷管理</li>
						<li><a href="${basePath!''}/evaluate/indicator/list.htm">指标体系管理</a></li>	
					</ul>
					<div class="fr new_zhibiao" onclick="create_paper()"><img src="${basePath!''}/images/形状-4.png"> <i>新建问卷</i></div>
				</div>

				
				<div class="paper_list_contain">
					<div class="list_one clearfix">
						<p class="fl one">问卷标题</p>
						<p class="fl towe" >使用次数</p>
						<p class="fl towe">题目数</p>
						<p class="fl towe">创建时间</p>
						<p class="fl towe">操作</p>
					</div>
				</div>
				
				<#if pageBean.list?? && pageBean.list?size!=0>
					<#list pageBean.list as evaluatePaperVo>
						<div class="paper_list_contain">
		
							<div class="some_detail clearfix">
								<p class="fl one">${evaluatePaperVo.title!''}</p>
								<p class="fl towe" >${evaluatePaperVo.useNum!''}</p>
								<p class="fl towe">${evaluatePaperVo.questionNum!''}</p>
								<p class="fl towe">${evaluatePaperVo.createTime?string("yyyy-MM-dd")}</p>
								<p class="fl three"><span onClick="paper_view(${evaluatePaperVo.id!''})">查看</span>&nbsp<#if evaluatePaperVo.useNum==0><span onClick="paper_delete(${evaluatePaperVo.id!''})">删除</span><#else><span1>删除</span1></#if></p>
								
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
			
			<!-- 右侧边栏 -->
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
					<p><i>测评年份</i><span></span></p>
					<p><i>测评对象</i><span></span></p>
					<p><i>年级</i></p>
					<p><i>考试名称</i><input type="text" placeholder="请输入考试名称"></p>
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
	})

	function create_paper(){
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/evaluate/paper/list/save.htm?',
			data:{'delflag':'1'}, 
			async: false,
			success:function(data){  
				var url = "${basePath!''}/evaluate/paper/create.htm?";
				var data = "id="+data;
				window.location.href=url+data;
			}  
		});	
	}
	
	//问卷删除
	function paper_delete(id){
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/evaluate/paper/listbyid/update.htm?',
			data:{'id':id,'delflag':'1'}, 
			async: false,
			success:function(data){  
				window.location.reload();				
			}  
		});
	}
	
	//查看页面
	function paper_view(id){
		window.location.href="${basePath!''}/evaluate/paper/view.htm?id="+id;
	}
	
	//分页查询
	function search_page(type,id){
		var url = "${basePath!''}/evaluate/paper/list.htm?";
		var data = "";
		if(type=='page'){
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
	}
</script>
</body>
</html>