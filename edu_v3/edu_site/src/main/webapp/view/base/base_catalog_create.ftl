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
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/popup.css">
</head>
<style type="text/css">
	.mid{min-height: 760px;}
</style>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>基础信息&gt;新增教材管理</h3>
					</div>
					<p class="back fr" onclick="back_list()">返回上级</p>
				</div>

				<div class="add_name">
					
				</div>

				<h3 class="exam_set">教材信息</h3>
				<div class="exam_detail">
						
					<div class="test_object clearfix">
						<span1 class="fl">学段：</span1>
						<select id="stage" onChange="updateSubAndGra()">
							  <option value=1>小学</option>
							  <option value=2>初中</option>
							  <option value=3>高中</option>
						</select>
					</div>
					
					<div class="test_object clearfix">
						<span1 class="fl">年级：</span1>
						<select id="grade">
						</select>
					</div>
					
					<div class="test_object clearfix">
						<span1 class="fl">学科：</span1>
						<select id="subject" >
						</select>
					</div>
					
					<div class="test_object clearfix">
						<span1 class="fl">年份：</span1>
						<select id="year" >
							<#if baseYearVos?? && baseYearVos?size!=0>
								<#list baseYearVos as baseYearVo>
									 <option value=${baseYearVo.id!''}>${baseYearVo.name!''}</option>
								</#list>
							</#if>
						</select>
					</div>
					
					<div class="test_object clearfix">
						<span1 class="fl">学期：</span1>
						<select id="term">
							<option value=1>上册</option>
							<option value=2>下册</option>
						</select>
					</div>
					
					<div class="test_object clearfix">
						<span1 class="fl">版本：</span1>
						<select id="version" >
							<#if baseVersionVos?? && baseVersionVos?size!=0>
								<#list baseVersionVos as baseVersionVo>
									<option value=${baseVersionVo.id!''}>${baseVersionVo.name!''}</option>
								</#list>
							</#if>
						</select>
					</div>
					
					
					<div class="test_object">
						<span1><n style="color:#f90202">*</n>教材名称：</span1>
						<input type="text" id="name" placeholder="一百字以内">
						<em id="title_msg" style="display:none"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">姓名不可以为空</i></em>
					</div>

				</div>

				<div class="baocun_1">
					<button class="click_me" onClick="save_catalog()">保存</button>
					<button class="qx" onClick="back_list()">取消</button>
				</div>
				
				<div class="pop_shade">
					<!-- 完成问卷调查 -->
					<div class="pop" type='2' style="display: none">
						<h3 class="hand_success clearfix">新增测试成功 <span class="fr"></span></h3>
						<div class="finish">
							<h3><img src="${basePath!''}/images/right.png"></h3>
							<p class="tip_msg"></p>
							<p class="check_report">
								<span class="now_check">查看测评</span> | <span class="i_know">返回列表</span>
							</p>
						</div>
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

	$(function(){
		
		//消息显示和隐藏
		$('#evaDetail_name').focus(function(){
			$('#title_msg').hide();
		})
		$('#evaDetail_name').blur(function(){
			var evaDetail_name = $('#evaDetail_name').val();
			if(evaDetail_name==null || evaDetail_name==""){
				$('#title_msg').show();
			}	
		})
		
		$('#start').focus(function(){
			$('#start_msg').hide();
		})

		
		$('#end').focus(function(){
			$('#end_msg').hide();
		})
		

    	//关闭弹窗
    	$('.hand_success span,.i_know').click(function(){
    		$('.pop_shade').hide();
    	})
    	
    	fillGrade();
		fillSubject();
	})
	
	function updateSubAndGra(){
		fillGrade();
		fillSubject();
	}
	
	//返回列表
	function back_list(){
		window.location.href="${basePath!''}/base/catalog/list.htm?";
	}
	
	//年级
	function fillGrade(){
		var html = '';
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/grade/listbystageid.htm',  
          data:{'stageId':$("#stage").val()},
          async:false,
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#grade").html(html);
			    }                
          }  
       });
	}
	
	//学科
	 function fillSubject(){
		var html = '';
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/subject/listbystageid.htm',  
          data:{'stageId':$("#stage").val()},
          async:false,
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#subject").html(html);
			
			    }                
          }  
       });
	}
	
	//保存
	function save_catalog(){
		$.ajax({  
          type:'post',  
          url:'${basePath!''}/base/catalog/list/save.htm',  
          data:{
	          	'yearId':$("#year").val(),
	          	'stageId':$("#stage").val(),
	          	'subjectId':$("#subject").val(),
	          	'gradeId':$("#grade").val(),
	          	'termId':$("#term").val(),
	          	'versionId':$("#version").val(),
	          	'name':$("#name").val()
          	},
          async:false,
          success:function(data){  
        	  back_list();               
          }  
       });
	}
	
	//提示信息
	function message(){
		var str = "1";
		var name = $('#evaDetail_name').val();
		if(name==null||name==""){
			$('#title_msg').show();
			var str = "";
		}
		if(paperId==null||paperId==""){
			$('#paper_msg').show();
			var str = "";
		}
		var start = $("#start").val();
		var end = $("#end").val();
		if(start=="" || start==null){
			$('#start_msg').show();
			var str = "";
		}
		if(end=="" || end==null){
			$('#end_msg').show();
			var str = "";
		}
		return str;
	}
	 
	

</script>
</body>
</html>
