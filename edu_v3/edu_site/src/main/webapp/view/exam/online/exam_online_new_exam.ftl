<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>考试管理-新建考试</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/exam_manage_addone.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/new_exam.css">
</head>
<body>

	<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<form action="${basePath!''}/exam/online/manage/list/save.htm" method="post" onsubmit="return toVaild()"> 
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>考试管理>新增考试</h3>
					</div>
					<p class="back fr" onClick="history.go(-1)">返回上级</p>
				</div>
				<div class="add_name">
					<input type="text" placeholder="请输入试卷名称" name="examName" id="examName">
				</div>
				<h3 class="exam_set">考试设置</h3>
				<div class="exam_detail">
					<div class="choice_type clearfix">
						<span class="fl">考试类型：</span>
						<ul class="fl kaoshi_type" >
						<#assign keys = examTypeMap?keys/>
						  <#if keys??>
							  <#list keys as key> 
								  <#if key_index == 0>
								  	<li onclick ="examType(${key!''},this)"  class="active">${examTypeMap["${key!''}"]}</li>
								  <#else>
								  	<li onclick ="examType(${key!''},this)">${examTypeMap["${key!''}"]}</li>
								  </#if>
						      </#list>
					      </#if>
						</ul>
						<input type = "hidden" value ="${examTypeId}" id="examType" name ="examType"/>
					</div>
					<div class="exam_way">
						<span class="fl">考试方式：</span>
						<label class="lb_1"><input type="radio" name="examMethod" checked  value ="0"><i>线上考试</i></label>
						<label><input type="radio" name="examMethod" value ="1"><i>线下纸笔考试</i></label>
					</div>
					<div class="choice_grade">
						<span>选择年级：</span>
						<select name = "gradeId">
						<#if role == 0>
							<#list baseTeacherClassesVoList as baseTeacherClassesVo>
							 <option value="${baseTeacherClassesVo.baseGradeVo.id}">${baseTeacherClassesVo.baseGradeVo.name}</option> 
							</#list>
						<#else>
							<#list baseGradeVoList as baseGradeVo>
							 <option value="${baseGradeVo.id}">${baseGradeVo.name}</option> 
							</#list>
						</#if>
							
						</select>
					</div>
					
					<div class="test_time clearfix">
						<span class="fl">考试时间：</span>
						<div class="time_box fl">
							<p class="kssj">
								<span>开始时间：</span>
								<input class="date" type="text" id = "start" name = "startTime" value="">
								<span>结束时间：</span>
								<input class="clock" type="text" id = "end" name = "endTime" value="">
							</p>
						</div>
					</div>
					<div class="test_intreduce clearfix">
						<span class="fl">导考信息：</span>
						<textarea class="fl" placeholder="请输入导考信息" name = "examDesc"></textarea>
					</div>
				</div>
				
				<div class="baocun">
					<button class="bc" type="submit">保存</button>
					<a href="javascript:history.back(-1)"><button type="button" class="qx">取消</button></a>
				</div>

			</div>
		</form>
		</div>
	</div>

	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>
	
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<script src="${basePath!''}/js/laydate/laydate.js"></script>
	
</body>

<script type="text/javascript">
	$(function(){
		//layData日期选择
		var start = {
		  elem: '#start',
		  format: 'YYYY-MM-DD hh:mm:ss',
		  min: laydate.now(+1), //设定最小日期为当前日期
		  max: '2099-06-16 23:59:59', //最大日期
		  istime: true,
		  istoday: false,
		  choose: function(datas){
		     end.min = datas; //开始日选好后，重置结束日的最小日期
		     end.start = datas //将结束日的初始值设定为开始日
		  }
		};
		var end = {
		  elem: '#end',
		  format: 'YYYY-MM-DD hh:mm:ss',
		  min: laydate.now(+1),
		  max: '2099-06-16 23:59:59',
		  istime: true,
		  istoday: false,
		  choose: function(datas){
		    start.max = datas; //结束日选好后，重置开始日的最大日期
		  }
		};
		laydate(start);
		laydate(end);
	});

	function examType(obj,ob){
	 	$(ob).addClass("active");
	 	$(ob).siblings().removeClass(); 
	 	$("#examType").val(obj);
	} 
	
function toVaild(){
 	if(!$.trim($("#examName").val())){
        alert('考试名称不能为空！');
        return false;
    }
    if(!$.trim($("#start").val())){
        alert('考试开始时间不能为空！');
        return false;
    }
    if(!$.trim($("#end").val())){
        alert('考试结束时间不能为空！');
        return false;
    }
    if($('input[type=radio][name=examType]:checked').val() == "0"){
    	if($('input[name="papercheck"]:checked').length == 0){
    		alert('请选择相应的考试试卷，若没有试卷，请先新建试卷！');
        	return false;
    	}
    }
 }
</script>
</html>