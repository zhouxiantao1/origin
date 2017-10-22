<!DOCTYPE html>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>答疑中心-问题广场</title>
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
						<li class="active" >问题广场</li>
						<@security.authorize url="/interlocution/ask/person/list.htm"><li class="go_list" id="personAskList">我的提问</li></@security.authorize>
						<@security.authorize url="/interlocution/answerAsk/list.htm"><li class="go_list" id="answerList">我的回答</li></@security.authorize>
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

				<div class="choice_way clearfix">
					<button  <#if search.type==0>class="new_upload fl"<#else>class="review fl"</#if>  onClick="search_ask('type','0')">最新上传</button>
					<button  <#if search.type==1>class="new_upload"<#else>class="review"</#if>  onClick="search_ask('type','1')">浏览最多</button>
					<div class="mingti fr">
						<@security.authorize url="/interlocution/ask/create.htm"><button onClick="javascript:window.location.href='${basePath!''}/interlocution/ask/create.htm'"> <i>+</i> 我要提问</button></@security.authorize>
					</div>
				</div>
				

				<div class="all_question">
					<ul id="ask_list">
						<#if pageBean.list?? && pageBean.list?size!=0>
							<#list pageBean.list as interlocutionAskVo>
								<li class="clearfix">
									<dl class="fl">
										<dt class="head"><img src="${basePath!''}/images/no-content.png"></dt>
										<dd class="name">${interlocutionAskVo.createName!''}</dd>
									</dl>
									<div class="qus_detail fl">
										<p class="tit" onclick="go_ask_detail(${interlocutionAskVo.id!''})">${interlocutionAskVo.title!''}<span class="fr"><#if interlocutionAskVo.createTime??>${interlocutionAskVo.createTime?string("yyyy-MM-dd")}</#if></span></p>
										<p ><#if interlocutionAskVo.content??>${interlocutionAskVo.content!''}<#else><p>&nbsp</p></#if></p>
										<div class="detail clearfix">
											<p class="fl"><grade>【<#if interlocutionAskVo.baseGradeVo??>${interlocutionAskVo.baseGradeVo.name!''}</#if><#if interlocutionAskVo.baseSubjectVo??>${interlocutionAskVo.baseSubjectVo.name!''}</#if>】</grade><@security.authorize url="/interlocution/concern/list/save.htm"><#if interlocutionAskVo.isConcren==0><span onclick="save_concern('concern_save',${interlocutionAskVo.id!''})">+关注</span><#else><span onclick="save_concern('concern_update',${interlocutionAskVo.id!''})">已关注</span></#if></@security.authorize><ans>回答(${interlocutionAskVo.answerNum!''})</ans></p>
											<b class="fr"><#if interlocutionAskVo.isReport==0><span onclick="save_concern('report_save',${interlocutionAskVo.id!''})">举报</span><#else><span onclick="save_concern('report_update',${interlocutionAskVo.id!''})">已举报</span></#if></b>
										</div>
									</div>
								</li>
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
			}else if($(this).attr('id')=='answerList'){
				window.location.href="${basePath!''}/interlocution/answerAsk/list.htm?";
			}else if($(this).attr('id')=='concernList'){
				window.location.href="${basePath!''}/interlocution/concern/list.htm?";
			}else if($(this).attr('id')=='personAskList'){
				window.location.href="${basePath!''}/interlocution/ask/person/list.htm?";
			}
		})
	 })
	 
	 //组装查询跳转url
	function search_ask(type,id){
		var data = "";
		var url = "${basePath!''}/interlocution/ask/list.htm?";
		var gradeId =${gradeId!''}+"";
		var subjectId =${subjectId!''}+"";
		
		if(type=='grade'){
			gradeId = id;			
		}else if(type == 'subject'){
			subjectId = id;
		}
		if(gradeId!=''){
			data += "&gradeId="+gradeId;
		}
		if(subjectId!=''){
			data += "&subjectId="+subjectId;
		}
		if(type=='type'){
			data += "&type="+id;
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
						var data = "id="+id+"&status=1";
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

