<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理-新建单次测评问卷</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_manage_addone.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_issued_list.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">

			<div class="mid fl">
				<!-- <div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>测评管理&gt;新建测评管理</h3>
					</div>
				</div> -->
				<div class="nav_list">
					<ul class="paper_list operation clearfix">
						<li id="all"  value="0" >全部</li>
						<li id="unDeal" value="1">待发布</li>
						<li id="deal" value="2">已发布</li>
						<li id="unFinish" value="3">未发布</li>
					</ul>
				</div>
				<div class="test_manage">
					<div class="ts_title clearfix">
						<span class="ts_name">测评名称</span>
						<span class="ts_way">测评方式</span>
						<span class="ts_obj">测评对象</span>
						<span class="ts_status">状态</span>
						<span class="stop_time">截止时间</span>
						<span class="ts_operation">操作</span>
					</div>
					<ul class="ts_list clearfix">
						<#if pageBean.list?? && pageBean.list?size!=0>
							<#list pageBean.list as evaluateEvaIssueVo>
								<#if evaluateEvaIssueVo.evaluateEvaDetailVo??>
									<li class="one">
										<div class="contain_list clearfix">
											<span class="ts_name">${evaluateEvaIssueVo.evaluateEvaDetailVo.name!''}</span>
											<span class="ts_way"><#if evaluateEvaIssueVo.evaluateEvaDetailVo.type=='0'>线上<#else>线下</#if></span>
											<span class="ts_obj"><#if evaluateEvaIssueVo.evaluateEvaDetailVo.evaObject=='1'>学生<#elseif evaluateEvaIssueVo.evaluateEvaDetailVo.evaObject=='2'>家长<#elseif evaluateEvaIssueVo.evaluateEvaDetailVo.evaObject=='3'>教师<#else>校长</#if></span>
											<span class="ts_status"><#if evaluateEvaIssueVo.status=='1'>待发布<#elseif evaluateEvaIssueVo.status=='2'>已发布<#else>未发布</#if></span>
											<span class="stop_time">${evaluateEvaIssueVo.evaluateEvaDetailVo.endTime?string("yyyy-MM-dd")}</span>
											<#if evaluateEvaIssueVo.status=='1'><span class="ts_operation" value=${evaluateEvaIssueVo.evaluateEvaDetailVo.id!''} id=${evaluateEvaIssueVo.id!''} evaObject=${evaluateEvaIssueVo.evaluateEvaDetailVo.evaObject!''}>去发布</span><#elseif evaluateEvaIssueVo.status=='2'><span class="ts_operation1">发布完成</span><#else><span class="ts_operation1">未完成发布</span></#if>
										</div>
									</li>
								</#if>
							</#list>
						<#else>
							<h1 class="answer_msg"><img src="${basePath!''}/images/no-content.png"><br>暂无信息！！！</h1>
						</#if>
						
					</ul>
				</div>

				<!-- 测评的弹窗 -->
				<div class="layer_open">
					<h3>选择发布的学校</h3>
					<div class="test_msg_list">
						<ul class="cpxx">
							<#if baseSchoolVoList?? && baseSchoolVoList?size!=0>
								<#list baseSchoolVoList as baseSchoolVo>
									<li>
										<label><input type="checkbox" name="school_list" value=${baseSchoolVo.id!''}><span>${baseSchoolVo.name!''}</span></label>
									</li>
								</#list>
							</#if>		
						</ul>
					</div>
					<div class="baocun">
						<button class="bc">发布</button>
					</div>
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
		</div>
	</div>

	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>
	
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<!-- <script src="${basePath!''}/js/laydate/laydate.js"></script> -->
<script src="${basePath!''}/layer/layer.js"></script>
<script type="text/javascript">
	// 时间控件加载
	// addDate('#start','#end');

	$(function(){
		$('.operation').on('click','li',function(){
			$('.operation li').removeClass('active');
			$(this).addClass('active');
			if($(this).attr("id")=='all'){
				window.location.href="${basePath!''}/evaluate/eva/list.htm?";
			}else if($(this).attr("id")=='unDeal'){
				window.location.href="${basePath!''}/evaluate/eva/list.htm?status=1";
			}else if($(this).attr("id")=='deal'){
				window.location.href="${basePath!''}/evaluate/eva/list.htm?status=2";
			}else if($(this).attr("id")=='unFinish'){
				window.location.href="${basePath!''}/evaluate/eva/list.htm?status=3";
			}
		})
		<#if status??>
			var status = ${status!''};
		<#else>
			var status = 4;
		</#if>
		if(status=='1'){
			$("#unDeal").addClass('active');
		}else if(status=='2'){
			$("#deal").addClass('active');
		}else if(status=='3'){
			$("#unFinish").addClass('active');
		}else{
			$("#all").addClass('active');
		}
	})
	$('.ts_operation').on('click',function(){
		var evaDetailId = $(this).attr('value');
		var evaIssueId = $(this).attr('id');
		var evaObject = $(this).attr('evaObject');
		alert(evaObject);
		var layers = layer.open({
		  type: 1,
		  title: false,
		  area: ['600px','380px'],
		  // skin: 'layui-layer-nobg', //没有背景色
		  shadeClose: true,
		  content: $('.layer_open'),
		  success:function(dom){
		  	console.log(dom);
		  	var confirm = dom.find('.bc');	//确定按钮

		  	//关闭
		  	confirm.on('click',function(){
		  		save_eva_school(evaDetailId,evaIssueId,evaObject);
		  		layer.close(layers);
		  		window.location.reload();
		  	})
		  }
		})
	})
	function save_eva_school(evaDetailId,evaIssueId,evaObject){
		$('input[name="school_list"]:checked').each(function(){   
			var areaId = null;
			<#if areaId??>
				areaId = ${areaId!''};
			</#if>
			if(evaObject!=null &&　evaObject=='4'){
				$.ajax({  
					type:'post',  
					url:'${basePath!''}/evaluate/issueList/list/save.htm?', 
					data:{'evaDetailId':evaDetailId,'evaIssueId':evaIssueId,'schoolId':$(this).val(),'evaObject':evaObject}, 
					async: false,
					success:function(data){}						    	
				});
			}else{
				$.ajax({  
						type:'post',  
						url:'${basePath!''}/evaluate/evaIssue/list/save.htm?', 
						data:{'evaDetailId':evaDetailId,'areaId':${areaId!''},'schoolId':$(this).val(),'type':'1','status':'1'}, 
						async: false,
						success:function(data){ }						    	
				});
			}
				    
		});
		//更新发布状态
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/evaluate/evaIssue/listbyid/update.htm?', 
			data:{'id':evaIssueId,'status':'2'}, 
			async: false,
			success:function(data){}						    	
		}); 
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
</script>
</body>
</html>
