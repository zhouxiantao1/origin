<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>在线作业-布置作业</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/online_work.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="nav_list">
					<ul class="paper_list clearfix">
						<li><a href="${basePath!''}/work/homework/list.htm">作业管理</a></li>
						<li class="active">布置作业</li>
					</ul>
				</div>
				
				<div class="set">
					<div class="gray">
						<div class="select_sub">
							<div class="select_klass">
								<span>选择年级：</span>
								<select id="gradeId"  onchange="grade()">
									<#if teacherClassesVoList?? && teacherClassesVoList?size != 0>
										<#list teacherClassesVoList as teacherClassesVo>
								   			<option value = ${teacherClassesVo.gradeId!''}>${teacherClassesVo.baseGradeVo.name!''}</option>
										</#list>
									</#if>
								</select>
							</div>
							<div class="select_subject">
								<span>选择学科：</span>
								<select id="subjectId"  onchange="subject()">
								</select>
							</div>
							<div class="select_klass" id="classes">
								<span>选择班级：</span>
							</div>
							

							<div class="select_textbook">
								<span>选择版本：</span>
								<select id ="versionId" onchange="version()">
									<#if baseVersionVoList?? && baseVersionVoList?size != 0>
										<#list baseVersionVoList as baseVersionVo>
								   			<option value = ${baseVersionVo.id!''}>${baseVersionVo.name!''}</option>
										</#list>
									</#if>
								</select>
							</div>
							<div class="select_textbook">
								<span>选择教材：</span>
								<select id ="catalogId" onchange="getCatalogId()">
								</select>
							</div>
							<div class="finish_time">
								<span>截止时间：</span>
								<input  class="laydate-icon clock" id="end" type="text" name="testEndTime">
								<em id="time_msg" style="display:none"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">请选择截止时间</i></em>
							</div>
							<div class="grade_set">
								<span>评分设置：</span>
								A：<select disabled="disabled">
									<option>正确率80%以上</option>
								</select>
								B：<select disabled="disabled">
									<option>正确率70%-79%</option>
								</select>
								C：<select disabled="disabled">
									<option>正确率60%-69%</option>
								</select>
								D：<select disabled="disabled">
									<option>正确率60%以下</option>
								</select>
							</div>
						</div>
					</div>
					
					<div class="work">
						<div class="work_title">
							<span>作业标题：</span>
							<input type="text" id="title" placeholder="填写标题">
							<em id="title_msg" style="display:none"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">不可以为空</i></em>
						</div>

						<div class="work_content clearfix">
							<span class="fl">作业内容：</span>
							<ul class="clearfix fl">
								<li class="hide_this"  style="display:none">作业命题</li>
								<li class="hide_this"  style="display:none">从作业集中选择</li>
								<li onClick="goSelectQuestion()">从作业题库中选题</li>
							</ul>
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
		grade();
		updateCatalog();  
		$('.hide_this').hide();
		
		//消息显示和隐藏
		$('#title').focus(function(){
			$('#title_msg').hide();
		})
		$('#title').blur(function(){
			var title = $('#title').val();
			if(title==null || title==""){
				$('#title_msg').show();
			}	
		})
		
		$('#end').focus(function(){
			$('#time_msg').hide();
		})
		
		$('input[name="classesId"]').click(function(){
			$('#classes_msg').hide();	
		})
		
	});
	
	// 时间控件加载
	 addDate('#end');
	
	function grade(){
		updateSubject()//学科
		updateClasses(); //更新班级
		updateCatalog(); //更新版本目录
	}
	
	function subject(){
		updateClasses();
		updateCatalog();
	}
	
	function version(){
		updateCatalog();
	}
	
	//更新学科
	function updateSubject(){
		 var html2 = '';
		 $.ajax({  
          type:'get',  
          url:'${basePath!''}/base/teacher/classes/listbysearch.htm',  
          data:{'gradeId':$("#gradeId").val(),'teacherId':'${teacherId!''}','group':'3'},
          async: false,
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			        	var subject = $.extend(true, [], Curedata[i].baseSubjectVo);
			        	var classes = $.extend(true, [], Curedata[i].baseClassesVo);

			            html2 += "<option value='"+subject.id+"'>"+ subject.name
			                    + "</option>"; 
			        }
			        	
			        $("#subjectId").html(html2);
			    }                
          }  
       });
	}
	//更新班级
	function updateClasses(){
		 var html1 = '<span>选择班级：</span>';
		 var html2 = '';
		 $.ajax({  
          type:'get',  
          url:'${basePath!''}/base/teacher/classes/listbysearch.htm',  
          data:{'gradeId':$("#gradeId").val(),'subjectId':$("#subjectId").val(),'teacherId':'${teacherId!''}','group':'2'},
          async: false,
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			        	var subject = $.extend(true, [], Curedata[i].baseSubjectVo);
			        	var classes = $.extend(true, [], Curedata[i].baseClassesVo);
			        	
			            html1 += "<label><input type='checkbox' name='classesId' id='classesId"+i+"' value= "+classes.id+"><i>"+classes.name+"</i></label>";
			            html2 += "<option value='"+subject.id+"'>"+ subject.name
			                    + "</option>"; 
			        }
			        html1 += "<em id='classes_msg' style='display:none'><img src='${basePath!''}/images/warning_msg.png' class='warning_msg'><i class='err_msg'>请选择班级</i></em>";	
			        $("#classes").html(html1);
			    }                
          }  
       });
	}
	
	//更新版本
	function updateCatalog(){
		var html = '';
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/catalog/listbysearch.htm',  
          data:{'subjectId':$("#subjectId").val(),'gradeId':$("#gradeId").val(),'versionId':$("#versionId").val()},
          async: false,
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>"; 
			        }	
			        $("#catalogId").html(html);
			    }                
          }  
       });
	}
	
	//提示信息
	function message(){
		var checks =1;
		$('input[name="classesId"]:checked').each(function(){   
			checks =2;    
		});
		var str = "";
		if(checks==1){
			var str = "1";
			$('#classes_msg').show();
		}
		var endTime = $('#end').val();
		if(endTime==null||endTime==""){
			var str = "1";
			$('#time_msg').show();
		}
		var title = $("#title").val();
		if(title=="" || title==null){
			var str = "1";
			$('#title_msg').show();
		}
		return str;
	}
	
	//保存作业信息并去到选题页面
	function goSelectQuestion(){
		var classesIds = "";
		var homeworkId = "";
		var msg = message();
		if(msg!=null && msg!=""){}else{
		
			$.ajax({  
			type:'get',  
		    url:'${basePath!''}/work/homework/list/save.htm?', 
		    data:{'title':$("#title").val(),'subjectId':$("#subjectId").val(),'gradeId':$("#gradeId").val(),'classesId':classesIds,'endTime':$('#end').val(),'type':'1'}, 
		    async: false, 
			success:function(data){  
					if(data!=0){
							$('input[name="classesId"]:checked').each(function(){   
								$.ajax({  
										type:'get',  
									    url:'${basePath!''}/work/homework/classes/list/save.htm?', 
									    data:{'homeworkId':data,'classesId':$(this).val()}, 
									    async: false,
									    success:function(data){  
									    	
									    }  
								 	});	    
							});
							
					    	homeworkId = data;
					    	var catalogId = $("#catalogId").val();
					    	if(catalogId==null){
					    		catalogId = "";
					    	}
					    	var url = "${basePath!''}/work/homework/select.htm?";
							var data = "catalogId="+catalogId+"&subjectId="+$("#subjectId").val()
										+"&homeworkId="+homeworkId+"&gradeId="+$("#gradeId").val()+"&stageId="+${stageId!''};
							window.location.href=url+data;
					 }
				}  
			});
		}
		
	}
</script>

</body>
</html>