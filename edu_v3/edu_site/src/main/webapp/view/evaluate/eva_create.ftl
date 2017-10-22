<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理-新建测评管理</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_manage_addone.css">
</head>

<style type="text/css">
	.baocun{
		margin:20px;
		text-align: center;
	}
	.baocun button{
		display: inline-block;
		width:120px;
		height:32px;
		background:#0075b1;
		margin-right: 10px;
		color:#fff;
		cursor: pointer;
	}
	.baocun button.qx{
		background:#ccc;
	}
</style>
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
					<n style="color:#f90202">*</n><input type="text" id="eva_name" placeholder="请输入测评名称">
				</div>

				<h3 class="exam_set">测评设置</h3>
				<div class="exam_detail">
			
					<div class="test_time clearfix">
						<span class="fl"><n style="color:#f90202">*</n>考试时间：</span>
						<div class="time_box fl">
							<p class="kssj">
								<span><n style="color:#f90202">*</n>开始时间：</span>
								<input class="laydate-icon date" id="start" type="text" name="testStartTime">
								<span><n style="color:#f90202">*</n>结束时间：</span>
								<input  class="laydate-icon clock" id="end" type="text" name="testEndTime">
							</p>
						</div>
					</div>

					<div class="test_intreduce clearfix">
						<span class="fl">测评简介：</span>
						<textarea class="fl daokao" id="eva_introduction" placeholder="请输入考试简介"></textarea>
					</div>

					<div class="test_msg clearfix">
						<span class="fl">注意事项：</span>
						<textarea class="msg fl" id="eva_remake"></textarea>
					</div>

			</div>

			<div class="baocun">
				<button class="bc" onclick="save_eva()">保存</button>
				<button class="qx" onclick="back_evaList()">取消</button>
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
<script src="${basePath!''}/js/common.js"></script>

<script type="text/javascript">
	// 时间控件加载
	addDate('#start','#end');
	
	//提示信息
	function message(){
		var str = "";
		var name = $('#eva_name').val();
		if(name==null||name==""){
			str += "测评名称"+",";
		}
		var start = $("#start").val();
		var end = $("#end").val();
		if(start=="" || start==null || end=="" || end==null){
			str += "测评时间"+",";
		}
		if(str!=""&&str!=null){
			str.substring(0,str.length-1);
			str +="是必填的！"
		}
		
		return str;
	}
	
	//保存测评
	function save_eva(){
		var msg = message();
		if(msg!=null && msg!=""){
			alert(msg);
		}else{
			$.ajax({  
				type:'post',  
				url:'${basePath!''}/evaluate/eva/list/save.htm?',
				data:{'name':$("#eva_name").val(),'introduction':$("#eva_introduction").val(),'startTime':$("#start").val(),'endTime':$("#end").val(),'status':'1','remake':$("#eva_remake").val()}, 
				async: false,
				success:function(data){  
					window.location.href="${basePath!''}/evaluate/eva/list.htm?";				
				}  
			});
		}
		
	}
	
	//返回到测评列表
	function back_evaList(){
		window.location.href="${basePath!''}/evaluate/eva/list.htm?";
	}
</script>
</body>
</html>