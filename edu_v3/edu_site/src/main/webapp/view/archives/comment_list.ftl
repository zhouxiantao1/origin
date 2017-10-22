<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>学业档案</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/xueye_record.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">

			<div class="middle middle_1200 fl">
				<div class="nav_list">
					<ul class="paper_list clearfix">
						<li class="active">学业档案</li>
					</ul>
					<div class="condition_list">
						<div class="stage_choice clearfix">
							<span class="fl">学校：</span>
							<ul id="schoolId" class="fl">
								<li class="active"><#if baseSchoolVo??>${baseSchoolVo.name!''}</#if></li>
							</ul>
						</div>

						<div class="stage_choice clearfix">
							<span class="fl">年级：</span>
							<ul id="gradeId" class="fl">
								<li value="" <#if search.gradeId??><#else>class="active"</#if>>全部</li>
								<#if baseGradeVoList?? && baseGradeVoList?size!=0><#list baseGradeVoList as baseGradeVo>
								<li value=${baseGradeVo.id!''} <#if search.gradeId?? && search.gradeId==baseGradeVo.id>class="active"</#if> >${baseGradeVo.name!''}</li>
								</#list></#if>
							</ul>
						</div>

						<div class="stage_choice clearfix">
							<span class="fl">班级：</span>
							<ul id="classesId" class="fl">
								<li value="" <#if search.classesId??><#else>class="active"</#if>>全部</li>
								<#if baseClassesVoList?? && baseClassesVoList?size!=0><#list baseClassesVoList as baseClassesVo>
								<li value=${baseClassesVo.id!''} <#if search.classesId?? && search.classesId==baseClassesVo.id>class="active"</#if>>${baseClassesVo.name!''}</li>
								</#list></#if>
							</ul>
						</div>

						<div class="slide_tab">
							<div class="test_name clearfix">
								<span class="fl">姓名：</span>
								<label><input type="text" id="name" placeholder="输入作业名称"><i  onclick="query_list()" class="iconfont">&#xe741;</i></label>
							</div>
						</div>

					</div>
					<div class="bd_2"><b class="show_hide"></b></div>
				</div>

				<div class="xueye_list">
					<#if pb.list?? && pb.list?size!=0>
						<#list pb.list as baseStudentVo>
							<div class="list_one">
								<div class="original_msg clearfix">
									<div class="fl"><img src="${basePath!''}/images/no-content.png"><i>${baseStudentVo.name!''}</i>学号：<span>${baseStudentVo.number!''}</span><em><#if baseSchoolVo??>${baseSchoolVo.name!''}</#if></em><b><#if baseStudentVo.baseClassesVo??>${baseStudentVo.baseClassesVo.name!''}</#if></b></div>
									<p  class="color_07a fl" onclick="go_stuList(${baseStudentVo.id!''})">查看学业档案</p>
								</div>
							</div>
						</#list>
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
			
			
			<!-- 右侧边栏 -->
			<!-- <div class="content_right fr">
				<p class="hr"></p>
				<h3>筛选</h3>
				<div class="shaixuan">
					<p><i>学校</i><span><#if baseSchoolVo??>${baseSchoolVo.name!''}</#if></span></p>
					<p><i>年级</i><select id="gradeId"><option value="">全部</option><#if baseGradeVoList?? && baseGradeVoList?size!=0><#list baseGradeVoList as baseGradeVo><option value=${baseGradeVo.id!''} >${baseGradeVo.name!''}</option></#list></#if></select></p>
					<p><i>班级</i><select id="classesId"><option value="">全部</option><#if baseClassesVoList?? && baseClassesVoList?size!=0><#list baseClassesVoList as baseClassesVo><option value=${baseClassesVo.id!''} >${baseClassesVo.name!''}</option></#list></#if></select></p>
					<p><i>姓名</i><span><input type="text" id="name"></span></p>
				</div>
				<button class="confirm" onclick="query_list()">确定</button>
				<p class="hr m_top"></p>
			</div> -->

		</div>
	</div>
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<script type="text/javascript">
	$(function(){
		//收起检索菜单
		$('.show_hide').click(function(){
			$(this).toggleClass('active');
			$('.slide_tab').slideToggle(600);
		})
		
		$('#gradeId').on('click','li',function(){
			$('#gradeId li').removeClass('active');
			$(this).addClass('active');
			query_list();
			
		})
		
		$('#classesId').on('click','li',function(){
			$('#classesId li').removeClass('active');
			$(this).addClass('active');
			query_list();
		})
		
	
	})

	function go_stuList(studentId){
		window.location.href="${basePath!''}/archives/comment/stulist.htm?id="+studentId+"&type="+${type!''};
	}
	
	//分页查询
	function search_page(type,id){
		var url = "${basePath!''}/archives/comment/list.htm?";
		var data = "";
		<#if search.gradeId??>
			data = data + "&gradeId="+${search.gradeId!''};
		</#if>
		<#if search.classesId??>
			data = data + "&classesId="+${search.classesId!''};
		</#if>
		if(type=='page'){
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
	}
	
	//组装查询跳转
	function query_list(){
		var data = "";
		var gradeId = $("#gradeId").children('.active').val();
		var classesId = $("#classesId").children('.active').val();
		var name = $("#name").val();
		if(gradeId!=null && gradeId!=""){
			data = data + "&gradeId="+gradeId;
		}
		if(classesId!=null && classesId!=""){
			data = data + "&classesId="+classesId;
		}
		if(name!=null && name!=""){
			data = data + "&name="+name;
		}
		var url = "${basePath!''}/archives/comment/list.htm?"
		window.location.href= url + data;
	}
</script>	
</body>
</html>