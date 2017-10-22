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
						<span></span>
						<h3>测评管理&gt;新建测评管理</h3>
					</div>
				</div> -->
				<div class="nav_list">
					<ul class="paper_list operation clearfix">
						<li id="all"  value="" >全部</li>
						<li id="unDeal"value="1">待发布</li>
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
											<#if evaluateEvaIssueVo.status=='1'><span class="ts_operation" <#if evaluateEvaIssueVo.evaluateEvaDetailVo.evaObject=='3'>name='1'<#else>name='2'</#if> value=${evaluateEvaIssueVo.evaluateEvaDetailVo.id!''} id=${evaluateEvaIssueVo.id!''} evaObject=${evaluateEvaIssueVo.evaluateEvaDetailVo.evaObject!''} >去发布</span><#elseif evaluateEvaIssueVo.status=='2'><span class="ts_operation1">发布完成</span><#else><span class="ts_operation1">未完成发布</span></#if>
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
					<h3>选择测评</h3>
					<div class="test_msg_list">
						<ul class="cpxx">
							<#if baseClassesVoList?? && baseClassesVoList?size!=0>
								<#list baseClassesVoList as baseClassesVo>
									<li>
										<label><input type="checkbox" name="classes_list" value=${baseClassesVo.id!''}><span>${baseClassesVo.name!''}</span></label></li>
									</li>
								</#list>
							</#if>		
						</ul>
					</div>
					<div class="baocun">
						<button class="bc">发布</button>
					</div>
				</div>

				<!-- 问卷弹窗 -->
				<div class="layer_select">
					<h3 class="select_paper_title">选择问卷</h3>
					<div class="select_paper_ope ">
						<div class="line_one clearfix">
							<div class="choice_zhibiao fl">
								<span>学历：</span>
								<select id="degree">
									<option value="">全部</option>
									<option value="1">大专</option>
									<option value="2">本科</option>
									<option value="3">硕士</option>
									<option value="4">博士</option>
									<option value="5">博士后</option>
								</select>
							</div>
							<div class="paper_name_check fr">
								<span>教师姓名：</span>
								<input type="text" id="teacherName" name="">
								<button onClick="query_teacher()">查询</button>
							</div>
						</div>
						<div class="nav_lists">
							
						</div>
						<div class="contain">
							
						</div>
					</div>
					<div class="baocun">
						<button class="bc">确 定</button>
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
	var evaDetailId = null;
	var evaIssueId = null;
	var evaObject = null;
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
		query_teacher();
	})
	$('.ts_operation').on('click',function(){
		evaDetailId = $(this).attr('value');
		evaIssueId = $(this).attr('id');
		evaObject = $(this).attr('evaObject');
		if($(this).attr('name')=='2'){
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
			  		save_issueList();
			  		update_status();
			  		layer.close(layers);
			  		window.location.reload();
			  	})
			  }
			})
		}else{
			var lay_open = layer.open({
			  type: 1,
			  title: false,
			  area: ['1100px','640px'],
			  // skin: 'layui-layer-nobg', //没有背景色
			  shadeClose: true,
			  content: $('.layer_select'),
			  success:function(dom){
			  	console.log(dom);
			  	var confirm = dom.find('.bc');	//确定按钮
	
			  	//关闭
			  	confirm.on('click',function(){
			  		save_issueList1();
			  		update_status();
			  		layer.close(lay_open);
			  		window.location.reload();
			  	})
			  }
	
			});
		}
		
	})
	
	//教师列表的全选和全取消
	function checkOrCancel(){
		$("#checkAll").click(function() {
			$("input[name='teacher_list']").prop("checked",this.checked); 
			
		})
	}	
	
	//更新教师列表
	function query_teacher(){
		var teacher_list = "";
		var degree = $("#degree").val();
		var teacherName = $("#teacherName").val();
		var html = '<label>'+
						'<input type="checkbox" name="wj" id="checkAll" >'+
						'<span class="wenjuan_name">老师姓名</span>'+
					'</label>'+
					'<span class="use_count">性别</span>'+
					'<span class="ans_count">工龄</span>'+
					'<span class="create">学历</span>'+
					'<span class="update">电话</span>';
					
		$(".nav_lists").html(html);
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/base/teacher/listbysearch.htm?',
			data:{'degree':degree,'name':teacherName,'delflag':'0'}, 
			async: false,
			success:function(data){  
				var teacherList = $.extend(true, [], data);
				if(teacherList!=null && teacherList.length>0){
					for(var i in teacherList){
						var degreeStr = "";
						if(teacherList[i].degree=='1'){
							degreeStr = "大专";
						}else if(teacherList[i].degree=='2'){
							degreeStr = "本科";
						}else if(teacherList[i].degree=='3'){
							degreeStr = "硕士";
						}else if(teacherList[i].degree=='4'){
							degreeStr = "博士";
						}else if(teacherList[i].degree=='5'){
							degreeStr = "博士后";
						}
						if(teacherList[i].phone==null){
							teacherList[i].phone="-";
						}
						teacher_list +=  '<div class="wenjuan_one">'+
											'<label>'+
												'<input type="checkbox" name="teacher_list" value='+teacherList[i].userId+'>'+
												'<span class="wenjuan_name">'+teacherList[i].name+'</span>'+
											'</label>'+
											'<span class="use_count"><#if '+teacherList[i].sex+'=='1'>男<#else>女</#if></span>'+
											'<span class="ans_count">'+teacherList[i].workeAge+'</span>'+
											'<span class="create">'+degreeStr+'</span>'+
											'<span class="update">'+teacherList[i].phone+'</span>'+
										'</div>';
					}
				}else{
					teacher_list = '<h1 class="answer_msg"><img src="${basePath!''}/images/no-content.png"><br>还没有问卷，先去添加问卷吧！</h1>'
				}
				
				$(".contain").html(teacher_list);	
				checkOrCancel();	
			}  
		});
	}
	
	//保存发布班级列表信息
	function save_issueList(){
		var school_id = null;
		<#if schoolId??>
			school_id = ${schoolId};
		</#if>
		$('input[name="classes_list"]:checked').each(function(){   
			$.ajax({  
				type:'post',  
				url:'${basePath!''}/evaluate/issueList/list/save.htm?', 
				data:{'evaDetailId':evaDetailId,'evaIssueId':evaIssueId,'schoolId':school_id,'classesId':$(this).val(),'evaObject':evaObject}, 
				async: false,
				success:function(data){}						    	
			});   
		});
		
	}
	
	//保存发布教师列表信息
	function save_issueList1(){
		var school_id = null;
		<#if schoolId??>
			school_id = ${schoolId};
		</#if>
		$('input[name="teacher_list"]:checked').each(function(){   
			$.ajax({  
				type:'post',  
				url:'${basePath!''}/evaluate/issueList/list/save.htm?', 
				data:{'evaDetailId':evaDetailId,'evaIssueId':evaIssueId,'schoolId':school_id,'userId':$(this).val(),'evaObject':evaObject}, 
				async: false,
				success:function(data){}						    	
			});  
		});
	}
	
	//更新发布状态
	function update_status(){
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
