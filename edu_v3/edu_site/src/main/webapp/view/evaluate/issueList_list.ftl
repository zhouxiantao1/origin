<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理-在线问卷调查</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/online_respond.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/online_question_survey.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>测评管理&gt;在线问卷调查</h3>
					</div>
					<p class="back fr"><a href="javascript:history.back(-1)">返回上级</a></p>
				</div>

				<div class="all_content">
					<div class="operation clearfix">
						<p id="all" >全部</p>
						<p id="undeal">待完成</p>
						<p id="deal" >已完成</p>
						<p id="unfinsh" >未完成</p>
					</div>
				</div>	
				<div class="finish_list">
					
					
					<#if pb.list?? && pb.list?size!=0>
						<#list pb.list as evaluateIssueListVo>
							<#if evaluateIssueListVo.evaluateEvaDetailVo??>
								
								<#assign status=0>
								<#if evaluateAnswerVoList?? && evaluateAnswerVoList?size!=0>
									<#list evaluateAnswerVoList as evaluateAnswerVo>
										<#if evaluateAnswerVo.evaDetailId==evaluateIssueListVo.evaDetailId>
											<#if evaluateAnswerVo.status?? && evaluateAnswerVo.status=='1'>
												<#assign status=1>
											<#else>
												<#assign status=2>
											</#if>	
										</#if>
									</#list>
								</#if>
								<div class="list_one">
									<div class="list_title clearfix">
										<span class="test_name tit fl">${evaluateIssueListVo.evaluateEvaDetailVo.name!''}</span>
										<span class="fr">截止时间<i>${evaluateIssueListVo.evaluateEvaDetailVo.endTime?string("yyyy-MM-dd")}</i></span>
									</div>
									<div class="list_content clearfix">
										<p class="fl test_name"><span>题数：${evaluateIssueListVo.questionNum!''}</span><span>状态：<#if status==0>待完成<#elseif status==1>已完成<#else>未完成</#if></span></p>
										<#if  status==0>
											<button class="fr start" onclick="go_anwser(${evaluateIssueListVo.id!''},${evaluateIssueListVo.evaDetailId!''})">开始答卷</button>
										<#elseif  status==1>
											<button class="fr start" onClick="go_report()">查看报告</button>
										<#else>
											<i class="fr start">开始答卷</i>
										</#if>
									</div>
								</div>
							</#if>	
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
					window.location.href="${basePath!''}/evaluate/eva/list.htm?";
				}else if($(this).attr("id")=='undeal'){
					window.location.href="${basePath!''}/evaluate/eva/list.htm?type=1";
				}else if($(this).attr("id")=='deal'){
					window.location.href="${basePath!''}/evaluate/eva/list.htm?type=2";
				}else if($(this).attr("id")=='unfinsh'){
					window.location.href="${basePath!''}/evaluate/eva/list.htm?type=3";
				}
			})
			<#if type??>
				var type = ${type!''};
			<#else>
				var type = '4';
			</#if>
			if(type=='1'){
				$("#undeal").addClass('active');
			}else if(type=='2'){
				$("#deal").addClass('active');
			}else if(type=='3'){
				$("#unfinsh").addClass('active');
			}else{
				$("#all").addClass('active');
			}
		})
		
		//分页查询
		function search_page(type,id){
			var url = "${basePath!''}/evaluate/eva/list.htm?";
			var data = "";
			<#if type??>
				data += "&type="+${type!''};
			</#if>
			var issueListName = $('#issueListName').val();	
			if(issueListName!=null && issueListName!=''){
				data += "&issueListName="+issueListName;
			}
			if(type=='page'){
				data += "&pageNo="+id;
			}
			window.location.href=url+data;
		}
		
		function go_anwser(issueListId,evaDetailId){
			window.location.href="${basePath!''}/evaluate/answer/detail.htm?evaDetailId="+evaDetailId+"&issueListId="+issueListId;
		}
		
		//查看报告
		function go_report(){
			window.location.href="${basePath!''}/evaluate/issueList/report.htm?";
		}
</script>
</body>
</html>