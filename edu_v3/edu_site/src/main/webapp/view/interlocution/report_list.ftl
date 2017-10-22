<!DOCTYPE html>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>答疑中心-举报管理</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/report_manage.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 
	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="nav_list">
					<ul class="paper_list clearfix">
						<li class="go_list" id="askList">问题广场</li>
						<@security.authorize url="/interlocution/ask/person/list.htm"><li class="go_list" id="personAskList">我的提问</li></@security.authorize>
						<@security.authorize url="/interlocution/answerAsk/list.htm"><li class="go_list" id="answerList" >我的回答</li></@security.authorize>
						<@security.authorize url="/interlocution/concern/list.htm"><li class="go_list" id="concernList" >我的关注</li></@security.authorize>
						<@security.authorize url="/interlocution/report/list.htm"><li class="active" id="reportList">举报管理</li></@security.authorize>
					</ul>
				</div>
				
				<div class="all_content">
					<div class="operation clearfix">
						<p id="all">全部举报</p>
						<p id="undeal">未处理</p>
						<p id="deal">已处理</p>
					</div>

					<div class="situation">
						<span class="ques">内容</span>
						<span class="report_count">举报类型</span>
						<span class="report_count">举报次数</span>
						<span class="manage_status">处理状态</span>
						<span class="manage_op">处理操作</span>
					</div>
				
					<div class="all_question">
						<#if pageBean.list?? && pageBean.list?size!=0>
							<#list pageBean.list as interlocutionReportVo>
									<div class="ques_one clearfix">
										<div class="left_msg clearfix fl">
											<#if interlocutionReportVo.type=='0'>
												<dl class="fl">
													<dt class="head"><img src="${basePath!''}/images/no-content.png"></dt>
													<dd class="name">${interlocutionReportVo.interlocutionAskVo.createName!''}</dd>
												</dl>
												<div class="qus_detail fl">
													<p class="tit" onClick="go_ask_detail(${interlocutionReportVo.askId!''})">${interlocutionReportVo.interlocutionAskVo.title!''}</p>
													<p >${interlocutionReportVo.interlocutionAskVo.content!''}</p>
													<div class="detail clearfix">
														<p class="fl">【<#if interlocutionReportVo.interlocutionAskVo.baseGradeVo??>${interlocutionReportVo.interlocutionAskVo.baseGradeVo.name!''}</#if>
														<#if interlocutionReportVo.interlocutionAskVo.baseSubjectVo??>${interlocutionReportVo.interlocutionAskVo.baseSubjectVo.name!''}</#if>】</p>
													</div>
												</div>
											<#else>
												<dl class="fl">
													<dt class="head"><img src="${basePath!''}/images/no-content.png"></dt>
													<dd class="name">${interlocutionReportVo.interlocutionAnswerAskVo.createName!''}</dd>
												</dl>
												<div class="qus_detail fl">
													<p1 class="tit" onClick="go_ask_detail(${interlocutionReportVo.interlocutionAnswerAskVo.interlocutionAskVo.id!''})">${interlocutionReportVo.interlocutionAnswerAskVo.content!''}</p1>
													<div class="detail clearfix">
														<#if interlocutionReportVo.interlocutionAnswerAskVo.interlocutionAskVo??>
															<p class="fl">【<#if interlocutionReportVo.interlocutionAnswerAskVo.interlocutionAskVo.baseGradeVo??>${interlocutionReportVo.interlocutionAnswerAskVo.interlocutionAskVo.baseGradeVo.name!''}</#if>
															<#if interlocutionReportVo.interlocutionAnswerAskVo.interlocutionAskVo.baseSubjectVo??>${interlocutionReportVo.interlocutionAnswerAskVo.interlocutionAskVo.baseSubjectVo.name!''}</#if>】</p>
														</#if>
													</div>
												</div>
											</#if>
										</div>
										<div class="chuli fl"><#if interlocutionReportVo.type=='0'>问题举报<#else>回答举报</#if></div>
										<div class="count fl">${interlocutionReportVo.reportNum!''}</div>
										<div class="chuli fl"><#if interlocutionReportVo.status=='1'>已处理<#else>未处理</#if></div>
										<div class="caozuo fr">
											<#if interlocutionReportVo.result??>
												<#if interlocutionReportVo.result=='0'>
													<p1>已关闭</p1>
												<#elseif interlocutionReportVo.result=='1'>
													<p1>已忽略</p1>
												<#else>
													<#if interlocutionReportVo.type=='0'>
														<p onclick="down_ask('ask',${interlocutionReportVo.id},${interlocutionReportVo.askId})">关闭问题</p>	
														<p onclick="ignore_ask(${interlocutionReportVo.id})">忽略问题</p>
													<#else>
														<p onclick="down_ask('answerAsk',${interlocutionReportVo.id},${interlocutionReportVo.answerId})">关闭回答</p>	
														<p onclick="ignore_ask(${interlocutionReportVo.id})">忽略回答</p>
													</#if>
												</#if>
											<#else>
												<#if interlocutionReportVo.type=='0'>
													<p onclick="down_ask('ask',${interlocutionReportVo.id},${interlocutionReportVo.askId})">关闭问题</p>	
													<p onclick="ignore_ask(${interlocutionReportVo.id})">忽略问题</p>
												<#else>
													<p onclick="down_ask('answerAsk',${interlocutionReportVo.id},${interlocutionReportVo.answerId})">关闭回答</p>		
													<p onclick="ignore_ask(${interlocutionReportVo.id})">忽略回答</p>
												</#if>		
											</#if>
											
										</div>
									</div>
								
							</#list>
						<#else>
							<h1 class="answer_msg"><img src="${basePath!''}/images/no-content.png"><br>暂无信息！！！</h1>
						</#if>
						
					</div>
					

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
		$('.operation').on('click','p',function(){
			$('.operation p').removeClass('active');
			$(this).addClass('active');
			if($(this).attr("id")=='all'){
				window.location.href="${basePath!''}/interlocution/report/list.htm?";
			}else if($(this).attr("id")=='undeal'){
				window.location.href="${basePath!''}/interlocution/report/list.htm?status=0";
			}else if($(this).attr("id")=='deal'){
				window.location.href="${basePath!''}/interlocution/report/list.htm?status=1";
			}
		})
		var status = GetQueryString("status");
		if(GetQueryString("status")==0){
			$("#undeal").addClass('active');
		}else if(GetQueryString("status")==1){
			$("#deal").addClass('active');
		}else{
			$("#all").addClass('active');
		}
		
		$('.paper_list').on('click','li',function(){
			if($(this).attr('id')=='askList'){
				window.location.href="${basePath!''}/interlocution/ask/list.htm?";
			}else if($(this).attr('id')=='answerList'){
				window.location.href="${basePath!''}/interlocution/answerAsk/list.htm?";
			}else if($(this).attr('id')=='concernList'){
				window.location.href="${basePath!''}/interlocution/concern/list.htm?";
			}else if($(this).attr('id')=='personAskList'){
				window.location.href="${basePath!''}/interlocution/ask/person/list.htm?";
			}
		})
		
		//$('.paper_list').on('click','li',function(){
		//	$('.paper_list li').removeClass('active');
		//	$(this).addClass('active');
		//})
		
		
	})
	
	//关闭问题
	function down_ask(type,id,askId){
		
		$.ajax({  
			type:'get',  
			url:'${basePath!''}/interlocution/report/listbyid/update.htm?', 
			data:{'id':id,'status':'1','result':'0'}, 
			async:false,
			success:function(data){  
				if(data!=0){
						window.location.reload(); 
				}else{
						alert('处理失败！');
				}
			}  
		});
		if(type=='ask'){
			$.ajax({  
			type:'get',  
				url:'${basePath!''}/interlocution/ask/listbyid/update.htm?', 
				data:{'id':askId,'delflag':'1'}, 
				async:false,
				success:function(data){  
					if(data!=0){
							alert('处理成功！');
							window.location.reload(); 
					}else{
							alert('处理失败！');
					}
				}  
			});
		}else{
			$.ajax({  
			type:'get',  
				url:'${basePath!''}/interlocution/answerAsk/listbyid/update.htm?', 
				data:{'id':askId,'delflag':'1'}, 
				async:false,
				success:function(data){  
					if(data!=0){
							alert('处理成功！');
							window.location.reload(); 
					}else{
							alert('处理失败！');
					}
				}  
			});
		}
		
	}
	
	//忽略问题
	function ignore_ask(id){
		$.ajax({  
			type:'get',  
			url:'${basePath!''}/interlocution/report/listbyid/update.htm?', 
			data:{'id':id,'status':'1','result':'1'}, 
			async:false,
			success:function(data){  
				if(data!=0){
						window.location.reload(); 
				}else{
						alert('处理失败！');
				}
			}  
		});
	}
	
	//获取url参数
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	
	//跳转到问题详情页面
	function go_ask_detail(id){
		//添加一次浏览次数
		$.ajax({  
			type:'get',  
			url:'${basePath!''}/interlocution/ask/updateReadnum.htm?', 
			data:{'id':id}, //问题ID 
			async:false,
			success:function(data){  
				if(data!=0){
						var url = "${basePath!''}/interlocution/ask/detail.htm?";
						var data = "id="+id+"&status=4";
						window.location.href=url+data;
				}else{
						alert('添加浏览次数失败！');
				}
			}  
		});
	}
	
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