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
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/add_single_test.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>测评管理&gt;新建测评管理</h3>
					</div>
					<p class="back fr" onclick="back_evaList()">返回上级</p>
				</div>

				<div class="add_name">
					
				</div>

				<h3 class="exam_set">测评设置</h3>
				<div class="exam_detail">
					<div class="test_name">
						<span>测评名称：</span>
						<input type="text" id="evaDetail_name" disabled="disabled">
					</div>

					<div class="test_object clearfix">
						<span class="fl">所属学段：</span>
						<ul class="fl clearfix" id="eva_stageId">
							<li value=1>小学</li>
							<li value=2>普通初中</li>
							<li value=3>普通高中</li>
						</ul>
					</div>
					
					<div class="test_object clearfix">
						<span class="fl">测评对象：</span>
						<ul class="fl clearfix" id="eva_object">
							<li value='1'>学生</li>
							<li value='2'>家长</li>
							<li value='3'>教师</li>
							<li value='4'>校长</li>
						</ul>
					</div>
					<div class="test_way clearfix">
						<span class="fl">问卷方式：</span>
						<#if evaluateEvaDetailVo.type??>
							<#if evaluateEvaDetailVo.type=='0'>
								<label><i>线上问卷</i></label>
							<#else>
								<label><i>线下纸笔问卷</i></label>
							</#if>
						</#if>
					</div>
					
					<div class="test_object clearfix">
						<span class="fl">发布区域：</span>
						<ul class="fl clearfix" id="eva_area">
							<li value='2'>荔湾区</li>
							<li value='3'>越秀区</li>
							<li value='4'>海珠区</li>
							<li value='5'>天河区</li>
							<li value='6'>白云区</li>
							<li value='7'>黄埔区</li></br></br>
							<li value='8'>番禺区</li>
							<li value='9'>花都区</li>
							<li value='10'>南沙区</li>
							<li value='11'>从化区</li>
							<li value='12'>增城区</li>
						</ul>
					</div>
					
					<div class="select_wenjuan">
						<span>选择问卷：</span>
						<p class="show_select"></p>
					</div>
						
					<div class="test_time clearfix">
						<span class="fl">测评时间：</span>
						<div class="time_box fl">
							<p class="kssj">
								<span>开始时间：</span>
								<span1>${evaluateEvaDetailVo.startTime?string("yyyy-MM-dd HH:mm:ss")}</span1>
								<span>结束时间：</span>
								<span1>${evaluateEvaDetailVo.endTime?string("yyyy-MM-dd HH:mm:ss")}</span1>
							</p>
						</div>
					</div>

					<div class="test_intreduce clearfix">
						<span class="fl">测评简介：</span>
						<textarea class="fl daokao" id="evaDetail_introduction" disabled="disabled"></textarea>
					</div>

					<div class="test_msg clearfix">
						<span class="fl">注意事项：</span>
						<textarea class="msg fl" id="evaDetail_remake" disabled="disabled"></textarea>
					</div>

				</div>

				
			
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
<script src="${basePath!''}/js/laydate/laydate.js"></script>
<script src="${basePath!''}/layer/layer.js"></script> 
<script src="${basePath!''}/js/common.js"></script>
<script type="text/javascript">
	var eveObject = 1;
	var stageId = 1;
	var areaList = new Array();
	var paperId =null; //问卷id
	$(function(){
		//赋值
		<#if evaluateEvaDetailVo.introduction??>
			$("#evaDetail_introduction").val('${evaluateEvaDetailVo.introduction!''}')
		</#if>
		<#if evaluateEvaDetailVo.remake??>
			$("#evaDetail_remake").val('${evaluateEvaDetailVo.remake!''}')
		</#if>
		<#if evaluateEvaDetailVo.name??>
			$("#evaDetail_name").val('${evaluateEvaDetailVo.name!''}')
		</#if>
		<#if evaluateEvaDetailVo.type??>
			<#if evaluateEvaDetailVo.type=='0'>
				$("input[name='way']:checked").attr("value","0")
			<#else>
				$("input[name='way']:checked").attr("value","1")
			</#if>
		</#if>
		
		<#if evaluatePaperVo??>
			$('.show_select').html('${evaluatePaperVo.title!''}');
		</#if>
		
		<#if evaluateEvaIssueVoList?? && evaluateEvaIssueVoList?size!=0>
			<#list evaluateEvaIssueVoList as evaluateEvaIssueVo>
				$('#eva_area li').each(function(){
					<#if evaluateEvaIssueVo.areaId??>
						var area = ${evaluateEvaIssueVo.areaId!''};
						if(area==$(this).val()){
							$(this).addClass('active');
						}
					</#if>	
				});

			</#list>
		</#if>
		
		$('#eva_object li').each(function(){
			<#if evaluateEvaDetailVo.evaObject??>
				var evaObject = ${evaluateEvaDetailVo.evaObject!''};
				if(evaObject==$(this).val()){
					$(this).addClass('active');
				}
			</#if>	
		});
		
		$('#eva_stageId li').each(function(){
			<#if evaluateEvaDetailVo.stageId??>
				var stageId = ${evaluateEvaDetailVo.stageId!''};
				if(stageId==$(this).val()){
					$(this).addClass('active');
				}
			</#if>	
		});
		
	})
	
	
	
	
	
	//返回列表页面
	function back_evaList(){
		window.location.href="${basePath!''}/evaluate/eva/list.htm?";
	}
	

</script>
</body>
</html>
