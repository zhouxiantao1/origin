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
	.mid{
		min-height: 760px;
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
						<h3>基础信息&gt;新增教师</h3>
					</div>
					<p class="back fr" onclick="back_list()">返回上级</p>
				</div>

				<div class="add_name">
					
				</div>

				<h3 class="exam_set">教师信息</h3>
				<div class="exam_detail">
					<div class="test_name">
						<span><n style="color:#f90202">*</n>老师姓名：</span>
						<input type="text" id="name" placeholder="请输入姓名">
						<em id="title_msg" style="display:none"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">姓名不可以为空</i></em>
					</div>
					
					<div class="test_name">
						<span><n style="color:#f90202">*</n>登录名：</span>
						<input type="text" id="loginName" placeholder="由3-18个英文、数字、点、减号、下划线组成">
						<em id="title_msg" style="display:none"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">登陆名不可以为空</i></em>
					</div>
					
					<div class="test_name">
						<span><n style="color:#f90202">*</n>密码：</span>
						<input type="text" id="passwork" placeholder="长度为6-16个字符,不能包含空格">
						<em id="title_msg" style="display:none"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">密码不可以为空</i></em>
					</div>
						<div class="test_name">
						<span>身份证号：</span>
						<input type="text" id="idNum" placeholder="长度为6-16个字符,不能包含空格">
						<em id="title_msg" style="display:none"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">密码不可以为空</i></em>
					</div>
					<div class="test_way clearfix">
						<span class="fl">性别：</span>
						<label><input type="radio" name="sex" checked value='0'><i>男</i></label>
						<label><input type="radio" name="sex" value='1'><i>女</i></label>
					</div>
					
					
					<div class="test_object clearfix">
						<span class="fl">所属区域：</span>
						<select id="areaId" onChange="fillSchool()">
							  <option value=2>荔湾区</option>
							  <option value=3>越秀区</option>
							  <option value=4>海珠区</option>
							  <option value=5>天河区</option>
							  <option value=6>白云区</option>
							  <option value=7>黄埔区</option>
							  <option value=8>番禺区</option>
							  <option value=9>花都区</option>
							  <option value=10>南沙区</option>
							  <option value=11>从化区</option>
							  <option value=12>增城区</option>
						</select>
					</div>
					
					<div class="test_object clearfix" id="school_hide">
						<span class="fl">所属学校：</span>
						<select id="schoolId">
						</select>
					</div>

				</div>

				<div class="baocun_1">
					<button class="click_me" onclick="save_teacher()">保存</button>
					<button class="qx" onclick="back_list()">取消</button>
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
		
		fillSchool();
		
		$('#staff_type').on('click','li',function(){
			$('#staff_type li').removeClass('active');
			$(this).addClass('active');
			var areaId = $(this).val();
			if(areaId==1 || areaId==2){
				cArea();
			}else if(areaId==3 || areaId==4){
				sArea();
			}else{
				sArea();
				$('#school_hide').show();
				fillSchool();
			}
		})
		
		
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
	})
	

	
	function save_teacher(){
		var name = $('#name').val();
		var loginName = $("#loginName").val();
		var passwork = $("#passwork").val();
		var idNum = $("#idNum").val();
		var areaId = $("#areaId").val();
		var schoolId = $("#schoolId").val();
		var sex = $("input[name='sex']:checked").attr("value");
	
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/base/teacher/list/save.htm', 
			data:{'name':name,'loginName':loginName,'passwork':passwork,'idNum':idNum,'areaId':areaId,'schoolId':schoolId,'sex':sex}, 
			async:false,
			success:function(data){  
				window.location.href="${basePath!''}/base/teacher/list.htm";
			}  
		});
	}
	
	//返回列表
	function back_list(){
		window.location.href="${basePath!''}/base/teacher/list.htm?";
	}
	
	function fillSchool(){
		var html = '';
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/school/listbyareaid.htm',  
          data:{'areaId':$("#areaId").val()},
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#schoolId").html(html);
			
			    }                
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
