<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>问卷量表库-新增指标体系</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/target_system.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>问卷量表库&gt;新增指标体系</h3>
					</div>
					<p class="back fr" onclick="history.go(-1)">返回上级</p>
				</div>

				<div class="basic_msg">
					<h3>录入指标体系内容</h3>
					<div class="custom_commin">
						<label class="active"><input type="radio" name="custom_commin" checked="checked" value="1"><i>通用指标体系</i></label>
						<label><input type="radio" name="custom_commin" value="2"><i>自定义指标体系</i></label>
					</div>
					<div class="basic clearfix">
						<div class="add_title">
							<span>指标体系名称：</span><input type="text" name="" id="name" placeholder="请输入指标体系名称">
						</div>
						<div class="add_reduces">
							<span>指标体系介绍：</span><textarea id="content" placeholder="添加问卷介绍（可不填），限500字"></textarea>
						</div>
					</div>

					<div class="queding">
						<button class="confirm" onclick="save_indicator()">下一步</button>
						<button class="cancel" onClick="return_list()">取消</button>
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
<script type="text/javascript">
	$(function(){
		$('.custom_commin label').on('click',function(){
			if($(this).find('input:checked')){
				$('.custom_commin label').removeClass('active');
				$(this).addClass('active');
			}
		})
	})
	var indicatorId =null;
	
	function save_indicator(){
		var typeValue = $("input[name='custom_commin']:checked").attr("value");
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/evaluate/indicator/list/save.htm?', 
		    data:{'name':$("#name").val(),'content':$("#content").val(),'parentId':0,'delflag':'1','type':typeValue}, 
		    success:function(data){  
		    	if(data!=0){
		    		var url = "${basePath!''}/evaluate/indicator/create/level.htm?";
		    		var data1 = "indicatorId="+data;
		    		indicatorId = data;
		    		window.location.href=url+data1;
		    	}else{
		    		alert('添加失败！');
		    	}
		    }  
	 	});
	}
	
	
	
	function return_list(){
		window.location.href="${basePath!''}/evaluate/indicator/list.htm?";
	}

</script>
</body>
</html>