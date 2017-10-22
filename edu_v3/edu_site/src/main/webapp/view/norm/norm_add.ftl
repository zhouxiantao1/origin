<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>常模管理-新建常模</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/add_norm.css">
<body>
	<#include '/common/top.ftl' />
	<div class="content_contain">
		<div class="content">
			<#include '/common/left.ftl' />
			
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>常模管理&gt;新建常模</h3>
					</div>
					<p class="back fr"><a href="javascript:history.back(-1)">返回</a></p>
				</div>
				<h3 class="exam_set">常模设置</h3>
				<form action="${basePath!''}/norm/save.htm" method="post" onsubmit="return toVaild()"> 
					<div class="exam_detail">
						<div class="test_name">
							<span>常模名称：</span>
							<input type="text" name ="normName" placeholder="请输入常模名称">
						</div>
						<div class="norm_year clearfix">
							<span class="fl">选择年级：</span>
							<select id="grade_select" name = "gradeId">
								<#list baseGradeVoList as baseGradeVo>
								 <option value="${baseGradeVo.id}">${baseGradeVo.name}</option> 
								</#list>
							</select>
						</div>
						<div class="choice_test clearfix">
							<span class="fl">选择考试：</span>
							<select id="exam_select" name = "examId">
								<#list examInfoVoList as examInfoVo>
								 <option value="${examInfoVo.id}">${examInfoVo.examName}</option> 
								</#list>
							</select>
						</div>
						<div class="test_way clearfix">
							<span class="fl">计算方式：</span>
							<label><input type="radio" name="calculationMethod" checked value="0"><i>标准分数</i></label>
							<label><input type="radio" name="calculationMethod" value="1"><i>百分位</i></label>
						</div>
						<div class="test_intreduce clearfix">
							<span class="fl">常模使用说明：</span>
							<textarea name ="normDesc" class="fl daokao" placeholder="请输入该常模的使用说明或者注释等内容。（可不填，限500字）"></textarea>
						</div>
					</div>
					<div class="baocun_1">
						<button class="bc">保存</button>
						<button class="qx"><a href="javascript:history.back(-1)">取消</a></button>
					</div>
				</form>
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
<!-- <script src="${basePath!''}/js/laydate/laydate.js"></script> -->
<script src="${basePath!''}/layer/layer.js"></script>
<script type="text/javascript">
	// 时间控件加载
	// addDate('#start','#end');

	$('.add_one').on('click',function(){
		var lay_open = layer.open({
		  type: 1,
		  title: false,
		  area: ['1100px','640px'],
		  // skin: 'layui-layer-nobg', //没有背景色
		  shadeClose: true,
		  content: $('.layer_select'),
		  success:function(dom){
		  	console.log(dom);
		  	var confirm = dom.find('.bc');	//确定按钮

		  	//关闭
		  	confirm.on('click',function(){
		  		layer.close(lay_open);
		  	})
		  }

		});
	})

	$('.ts_operation').on('click',function(){
		var layers = layer.open({
		  type: 1,
		  title: false,
		  area: ['600px','380px'],
		  // skin: 'layui-layer-nobg', //没有背景色
		  shadeClose: true,
		  content: $('.layer_open'),
		  success:function(dom){
		  	console.log(dom);
		  	var confirm = dom.find('.bc');	//确定按钮

		  	//关闭
		  	confirm.on('click',function(){
		  		layer.close(layers);
		  	})
		  }
		})
	})
	
	//年级改变，重新获取同步章节及章节内容
	$("select#grade_select").change(function(){
		// 学科信息
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/norm/examlist.htm', 
		    data:{'gradeId':$(this).val()}, 
		    async: false,
		    success:function(data){  
		    	var exam_html = "";
		    	for(var i = 0;i<data.length;i++){
		    		exam_html += '<option value="'+ data[i].id+'">'+data[i].examName+'</option>';
		    	}
		    	$('#exam_select').html(exam_html);
		    }  
	 	});
	});

</script>
</body>
</html>
