<!DOCTYPE html>  
<#assign basePath=request.contextPath>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>新增老师</title>
</head>
<body>

<!-- 新增老师 -->
<form action="${basePath!''}/base/teacher/save.htm" method="post"> 
		 选择区域：<select id="areaId" name = "areaId" onchange="fillSchool()">
		</select>&nbsp
		  选择学校：<select id="schoolId" name = "schoolId" onchange="fillClasses()">
		</select>&nbsp
		老师姓名：<input type="text" name="name">&nbsp
		性别：<select id="sex" name="sex">
			<option value="1">男</option> 
			<option value="2">女</option>
		</select>&nbsp
		年龄：<input type="text" name="age">&nbsp
		学历：<select id="degree" name="degree">
			<option value="1">大专</option> 
			<option value="2">本科</option>
			<option value="3">硕士</option> 
			<option value="4">博士</option>
			<option value="4">博士后</option>
		</select>&nbsp
		工龄：<input type="text" name="workeAge">&nbsp
		电话：<input type="text" name="phone">&nbsp
		邮箱：<input type="text" name="email">&nbsp
		<button type="submit" >保存老师</button>
       
</form>
</body>
<!-- jQuery -->
<script src00="${basePath!''}/js/jquery.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/jquery/dist/jquery.min.js"></script>
</html>
<script>	
	$(function(){
		var html = '';
		var html1 = '';
		var html2 = '';
		  
         $.ajax({  
          type:'get',  
          url:'${basePath!''}/base/area/listbyparentid.htm', 
          data:{'parentId':1}, 
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#areaId").html(html);
			
			    }                
          }  
       });
       
       
	});
	
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
       
</script>
