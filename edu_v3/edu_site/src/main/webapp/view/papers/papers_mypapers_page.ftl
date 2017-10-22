<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>试卷管理-我的卷子</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/mypaper_manage.css">
</head>
<body>
	<#include '/common/top.ftl' />
	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="nav_list">
					<ul class="paper_list clearfix">
						<li class="active">我的卷子</li>
						<!--<li>命题组卷</li>-->
						<li><a href = "${basePath!''}/papers/intelligence/list.htm">智能组卷</a></li>
						<li><a href = "${basePath!''}/papers/manual/list.htm">手工组卷</a></li>
						<li><a href = "${basePath!''}/question/ware/save/page.htm">命题组卷</a></li>
					</ul>
					<div class="condition_list">
						<div class="grade_choice clearfix">
							<span class="fl">年级：</span>
							<ul id ="gradeId" class="fl">
							<#if role == 0>
								<#if baseHistoryGradeVoList?? && (baseHistoryGradeVoList?size > 0) >
									<#list baseHistoryGradeVoList as baseHistoryGradeVo>
									 <li onClick="search_mypapers('grade',${baseHistoryGradeVo.baseGradeVo.id!''})" value="${baseHistoryGradeVo.baseGradeVo.id!''}" <#if baseHistoryGradeVo.baseGradeVo.id == search.gradeId> class="active" </#if>>${baseHistoryGradeVo.baseGradeVo.name}</li> 
									</#list>
								</#if>
							<#else>
								<#if baseGradeVoList?? && (baseGradeVoList?size > 0) >
									<#list baseGradeVoList as baseGradeVo>
									 <li onClick="search_mypapers('grade',${baseGradeVo.id!''})" value="${baseGradeVo.id!''}" <#if baseGradeVo.id == search.gradeId> class="active" </#if>>${baseGradeVo.name}</li> 
									</#list>
								</#if>
							</#if>
							</ul>
						</div>

						<div class="grade_choice clearfix">
							<span class="subject fl">学科：</span>
							<ul id ="subjectId">
							<#if role == 0>
								<#if baseHistorySubjectVoList?? && (baseHistorySubjectVoList?size > 0) >
									<#list baseHistorySubjectVoList as baseHistorySubjectVo>
									 <li onClick="search_mypapers('subject',${baseHistorySubjectVo.baseSubjectVo.id!''})" value="${baseHistorySubjectVo.baseSubjectVo.id!''}" <#if baseHistorySubjectVo.baseSubjectVo.id == search.subjectId> class="active" </#if>>${baseHistorySubjectVo.baseSubjectVo.name}</li> 
									</#list>
								</#if>
							<#else>
								<#if baseSubjectVoList?? && (baseSubjectVoList?size > 0) >
									<#list baseSubjectVoList as baseSubjectVo>
									 <li onClick="search_mypapers('subject',${baseSubjectVo.id!''})" value="${baseSubjectVo.id!''}" <#if baseSubjectVo.id == search.subjectId> class="active" </#if>>${baseSubjectVo.name}</li> 
									</#list>
								</#if>	
							</#if>
							</ul>
						</div>

						<div class="grade_choice clearfix">
							<span class="test_type fl">考试类型：</span>
							<ul id ="examType">
							<#assign keys = examTypeMap?keys/>
							<#if keys??>
								<#list keys as key> 
							    	<li onClick="search_mypapers('examType',${key!''})" <#if key == search.examType> class="active" </#if> value="${key!''}">${examTypeMap["${key!''}"]}</li>
							    </#list>
						    </#if>
						    </ul>
						</div>
						
						<div class="slide_tab">
							<div class="test_name clearfix">
								<span class="fl">考试名称：</span>
								<label><input id="paperName" type="text" maxlength="30" placeholder="输入考试名称查询" value="${search.paperName!''}"><i onClick="search_mypapers('paperName','0')" class="iconfont">&#xe741;</i></label>
							</div>
						</div>

					</div>
					<div class="bd_2"><b class="show_hide"></b></div>
				</div>
				
				
				<#if pb.list?? && pb.list?size != 0>
					<#list pb.list as papersInfoVo>
						<div class="paper_list_contain">
							<div class="list_one">
								<div class="clearfix"><h3 class="fl">${papersInfoVo.paperName}</h3><p class="fr">创建时间：<span>${papersInfoVo.createTime}</span></p></div>
							</div>
							<div class="some_detail clearfix">
									<div class="left fl">
										<p>题目数：<span>${papersInfoVo.totalQuantity}</span></p>
										<p>年级：<span>${papersInfoVo.bgv.name}</span></p>
										<p>学科：<span>${papersInfoVo.bsb.name}</span></p>
									</div>
									<div class="right fr">
										<span><a href="${basePath!''}/papers/mypapers/list/preview.htm?paperId=${papersInfoVo.id}">查看试卷</a></span>
										<span><a href="#" onclick = "deleteMyPapers(${papersInfoVo.id})">删除</a></span>
									</div>
							</div>
						</div>
					</#list>
				</#if>
				<!-- 分页 -->
				<#if (pb.totalPages>0) >
				<div class="page_list clearfix" id="demo2">
					<div class="mids fr">
						<ul class="page_num clearfix">
						   <#if pb.pageNo != 1>
						   	  <li onClick="search_mypapers('page','${pb.firstPageNo!''}')" >首页</li>
              	              <li onClick="search_mypapers('page','${pb.prePageNo!''}')" >上一页</li>
                           </#if>
                            <#list pb.startNo..pb.endNo as index>
              					<#if index == pb.pageNo>
              						<li class="active" onClick="search_mypapers('page','${pb.pageNo}')">${pb.pageNo}</li>
              					<#else>
              						<li  onClick="search_mypapers('page','${index}')">${index}</li>
              					</#if>
			  				</#list>
			  				
			  				 <#if pb.pageNo != pb.totalPages>
								<li onClick="search_mypapers('page','${pb.nextPageNo!''}')">下一页</li>
								<li onClick="search_mypapers('page','${pb.lastPageNo!''}')">未页</li>
              				</#if>
              				<li>${pb.pageNo}/${pb.totalPages}</li>
              				<li>共${pb.rows}条记录，分 ${pb.totalPages} 页</li>
						</ul>
					</div>
				</div>
				</#if>
				
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
	//收起检索菜单
	$('.show_hide').click(function(){
		$(this).toggleClass('active');
		$('.slide_tab').slideToggle(600);
	})
 
	//删除试卷
 	function deleteMyPapers(paperId){
	 	if(!confirm('是否删除该卷子?')){
			return false;
	    }
		$.ajax({  
			type:'post',  
		    url:'${basePath!''}/papers/mypapers/list/delete.htm', 
		    data:{'paperId':paperId}, 
		    success:function(data){ 
		    	if(data == 0){
		    		alert("该试卷发布过，不能删除！");
		    	}else{
		    		document.location.reload(); 
		    		alert("删除成功！");
		    	}
		    },
		    error: function(){
            	alert("删除失败！");
            } 
	 	});
 	}
 
	//根据条件查询试卷
	function search_mypapers(type,ob){
		var examType = $('#examType li.active').attr('value');
		var subjectId = $('#subjectId li.active').attr('value');
		var gradeId = $('#gradeId li.active').attr('value');
	 	var paperName = $("#paperName").val();
	 	var url = "${basePath!''}/papers/mypapers/list.htm?";
	 	if(type == 'grade'){
			var data = "examType="+examType+"&subjectId="+subjectId+"&gradeId="+ob+"&paperName="+paperName;
		 	window.location.href=url+data;
	 	}else if(type == 'subject'){
	 		var data = "examType="+examType+"&subjectId="+ob+"&gradeId="+gradeId+"&paperName="+paperName;
		 	window.location.href=url+data;
	 	}else if(type == 'examType'){
	 		var data = "examType="+ob+"&subjectId="+subjectId+"&gradeId="+gradeId+"&paperName="+paperName;
		 	window.location.href=url+data;
	 	}else if(type == 'paperName'){
	 		var data = "examType="+examType+"&subjectId="+subjectId+"&gradeId="+gradeId+"&paperName="+paperName;
		 	window.location.href=url+data;
	 	}else{
	 		var data = "examType="+examType+"&subjectId="+subjectId+"&gradeId="+gradeId+"&paperName="+paperName+"&pageNo="+ob;
		 	window.location.href=url+data;
	 	}
	}
 </script>
</body>
</html>