<!DOCTYPE html>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>答疑中心-我的回答</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/answer_center.css">
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
						<@security.authorize url="/interlocution/answerAsk/list.htm"><li class="active" >我的回答</li></@security.authorize>
						<@security.authorize url="/interlocution/concern/list.htm"><li class="go_list" id="concernList">我的关注</li></@security.authorize>
						<@security.authorize url="/interlocution/report/list.htm"><li class="go_list" id="reportList">举报管理</li></@security.authorize>
					</ul>
					<div class="condition_list">
						<div class="grade clearfix">
							<span class="fl">年级：</span>
							<ul class="clearfix fl" >
								<li onClick="search_ask('grade','')" <#if !search.gradeId??>class="active"</#if>>全部</li>
								<#if baseGradeVoList?? && baseGradeVoList?size!=0>
									<#list baseGradeVoList as baseGradeVo>
										<li onClick="search_ask('grade',${baseGradeVo.id!''})" grade_id="${baseGradeVo.id!''}" <#if search.gradeId?? && baseGradeVo.id == search.gradeId> class="active"</#if>>${baseGradeVo.name!''}</li>
									</#list>
								</#if>
							</ul>
						</div>
						<div class="subject_choice clearfix">
							<span class="fl">学科：</span>
							<ul class="clearfix fl">
								<li onClick="search_ask('subject','')" <#if !search.subjectId??>class="active"</#if>>全部</li>
								<#if baseSubjectVoList?? && baseSubjectVoList?size!=0>
									<#list baseSubjectVoList as baseSubjectVo>
										<li onClick="search_ask('subject',${baseSubjectVo.id!''})" subject_id="${baseSubjectVo.id!''}" <#if search.subjectId?? && baseSubjectVo.id == search.subjectId> class="active"</#if>>${baseSubjectVo.name!''}</li>
									</#list>
								</#if>
							</ul>
						</div>
					</div>
				</div>
				

				<!-- <div class="subject">
					<div class="grade clearfix">
						<span class="fl">年级：</span>
						<ul class="clearfix fl" >
							<li onClick="search_ask('grade','')" <#if !search.gradeId??>class="active"</#if>>全部</li>
							<#if baseGradeVoList?? && baseGradeVoList?size!=0>
								<#list baseGradeVoList as baseGradeVo>
									<li onClick="search_ask('grade',${baseGradeVo.id!''})" grade_id="${baseGradeVo.id!''}" <#if search.gradeId?? && baseGradeVo.id == search.gradeId> class="active"</#if>>${baseGradeVo.name!''}</li>
								</#list>
							</#if>
						</ul>
					</div>
					<div class="subject_choice clearfix">
						<span class="fl">学科：</span>
						<ul class="clearfix fl">
							<li onClick="search_ask('subject','')" <#if !search.subjectId??>class="active"</#if>>全部</li>
							<#if baseSubjectVoList?? && baseSubjectVoList?size!=0>
								<#list baseSubjectVoList as baseSubjectVo>
									<li onClick="search_ask('subject',${baseSubjectVo.id!''})" subject_id="${baseSubjectVo.id!''}" <#if search.subjectId?? && baseSubjectVo.id == search.subjectId> class="active"</#if>>${baseSubjectVo.name!''}</li>
								</#list>
							</#if>
						</ul>
					</div>
				</div> -->


				<div class="all_question">
					<ul id="ask_list">
						<#if pageBean.list?? && pageBean.list?size!=0>
							<#list pageBean.list as interlocutionAnswerAskVo>
								<#if interlocutionAnswerAskVo.interlocutionAskVo?? >
									<li class="clearfix">
										<dl class="fl">
											<dt class="head"><img src="${basePath!''}/images/no-content.png"></dt>
											<dd class="name">${interlocutionAnswerAskVo.interlocutionAskVo.createName!''}</dd>
										</dl>
										<div class="qus_detail fl">
											<p class="tit" onclick="go_ask_detail(${interlocutionAnswerAskVo.interlocutionAskVo.id!''})">${interlocutionAnswerAskVo.interlocutionAskVo.title!''}<span class="fr"><#if interlocutionAnswerAskVo.interlocutionAskVo.createTime??>${interlocutionAnswerAskVo.interlocutionAskVo.createTime?string("yyyy-MM-dd")}</#if></span></p>
											<p >${interlocutionAnswerAskVo.interlocutionAskVo.content!''}</p>
											<div class="detail clearfix">
												<p class="fl"><grade>【<#if interlocutionAnswerAskVo.interlocutionAskVo.baseGradeVo??>${interlocutionAnswerAskVo.interlocutionAskVo.baseGradeVo.name!''}</#if><#if interlocutionAnswerAskVo.interlocutionAskVo.baseSubjectVo??>${interlocutionAnswerAskVo.interlocutionAskVo.baseSubjectVo.name!''}</#if>】</grade><#if interlocutionAnswerAskVo.isConcren==0><span onclick="save_concern('concern_save',${interlocutionAnswerAskVo.interlocutionAskVo.id!''})">+关注</span><#else><span onclick="save_concern('concern_update',${interlocutionAnswerAskVo.interlocutionAskVo.id!''})">已关注</span></#if><ans>回答(${interlocutionAnswerAskVo.interlocutionAskVo.answerNum!''})</ans></p>
												<!-- <b class="fr"><#if interlocutionAnswerAskVo.interlocutionAskVo.isReport==0><span onclick="save_concern('report_save',${interlocutionAnswerAskVo.interlocutionAskVo.id!''})">举报</span><#else><span onclick="save_concern('report_update',${interlocutionAnswerAskVo.interlocutionAskVo.id!''})">已举报</span></#if></b> -->
											</div>
										</div>
									</li>
								</#if>
							</#list>
						<#else>
							<h1 class="answer_msg"><img src="${basePath!''}/images/no-content.png"><br>暂无信息！！！</h1>
						</#if>
					</ul>
				</div>
	
			<!-- 分页 -->
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
</body>
<!-- jQuery -->
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
</html>
<script type="text/javascript">
	
	 $(function(){
	 	$('.paper_list').on('click','li',function(){
			if($(this).attr('id')=='reportList'){
				window.location.href="${basePath!''}/interlocution/report/list.htm?";
			}else if($(this).attr('id')=='askList'){
				window.location.href="${basePath!''}/interlocution/ask/list.htm?";
			}else if($(this).attr('id')=='concernList'){
				window.location.href="${basePath!''}/interlocution/concern/list.htm?";
			}else if($(this).attr('id')=='personAskList'){
				window.location.href="${basePath!''}/interlocution/ask/person/list.htm?";
			}
		})
	 })
	 
	 //获取url参数
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	 
	 //组装查询跳转url
	function search_ask(type,id){
		var data = "";
		var url = "${basePath!''}/interlocution/answerAsk/list.htm?";
		var gradeId =GetQueryString("gradeId");
		var subjectId =GetQueryString("subjectId");
		
		if(type=='grade'){
			gradeId = id;			
		}else if(type == 'subject'){
			subjectId = id;
		}
		if(gradeId!=''&& gradeId!=null){
			data += "&gradeId="+gradeId;
		}
		if(subjectId!='' && subjectId!=null){
			data += "&subjectId="+subjectId;
		}
		if(type == 'page'){
		
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
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
						var data = "id="+id+"&status=2";
						window.location.href=url+data;
				}else{
						alert('添加浏览次数失败！');
				}
			}  
		});
	}
	
	function save_concern(type,id){
		if(type=='concern_save'){
			//保存关注信息
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/concern/list/save.htm?', 
				data:{'askId':id,'type':'1'},
				async:false,
				success:function(data){  
					if(data!=0){
							window.location.reload(); 
					}else{
							alert('关注失败！');
					}
				}  
			});
		}else if(type=='concern_update'){
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/concern/listbysearch/delete.htm?', 
				data:{'askId':id,'type':'1'}, //问题ID 
				async:false,
				success:function(data){  
					if(data!=0){
							window.location.reload(); 
					}else{
							alert('取消关注失败！');
					}
				}  
			});
		}else if(type=='report_save'){
			
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/report/list/save.htm?', 
				data:{'askId':id,'type':'0','isAddNum':1},
				async:false,
				success:function(data){
					if(data!=0){
							alert('添加举报成功！');
					}
				}  
			});
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/concern/list/save.htm?', 
				data:{'askId':id,'type':'3'},
				async:false,
				success:function(data){  
					if(data!=0){
							window.location.reload(); 
					}else{
							alert('举报失败！');
					}
				}  
			});
		}else if(type=='report_update'){
			
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/report/list/save.htm?', 
				data:{'askId':id,'type':'0','isAddNum':0},
				async:false,
				success:function(data){
					if(data!=0){
							alert('减去举报成功！');
					}
				}  
			});
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/interlocution/concern/listbysearch/delete.htm?', 
				data:{'askId':id,'type':'3'}, //问题ID 
				async:false,
				success:function(data){  
					if(data!=0){
							window.location.reload(); 
					}else{
							alert('取消关注举报！');
					}
				}  
			});
		}	
	}
</script>

