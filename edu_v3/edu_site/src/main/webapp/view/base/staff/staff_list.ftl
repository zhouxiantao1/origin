<!DOCTYPE html>  
<#assign basePath=request.contextPath>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>新增管理者</title>
</head>
<body>

<!-- 新增管理者 -->
<form action="${basePath!''}/base/staff/save.htm" method="post">
		 管理者类型：<select id="type" name = "type" onchange="fill()" >
		 	<option >请选择</option> 
		 	<option value="1">市教管员</option> 
			<option value="2">市教研员</option> 
			<option value="3">区教管员</option>
			<option value="4">区教研员</option>
			<option value="5">校教管员</option>
			<option value="6">校教研员</option>
			<option value="7">校长</option>
		</select>&nbsp 
		 选择区域：<select id="areaId" name = "areaId" onchange="fillSchool()">
		</select>&nbsp
		  选择学校：<select id="schoolId" name = "schoolId" onchange="fillClasses()" >
		</select>&nbsp
		 姓名：<input type="text" name="name">&nbsp
		 性别：<select id="sex" name="sex">
			<option value="1">男</option> 
			<option value="2">女</option>
		</select>&nbsp
		 电话：<input type="text" name="phone">&nbsp
		邮箱：<input type="text" name="email">&nbsp
		<button type="submit" >保存</button>
       
</form>
</body>
<!-- jQuery -->
<script src00="${basePath!''}/js/jquery.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/jquery/dist/jquery.min.js"></script>
</html>
<script>

	function fill(){
		if($("#type").val()=='1'||$("#type").val()=='2'){
				$("#schoolId").hide();
				var html = ''; 
		         $.ajax({  
		          type:'get',  
		          url:'${basePath!''}/base/area/listbyparentid.htm', 
		          data:{'parentId':0}, 
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
		}else{
			var html = ''; 
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
		       if($("#type").val()=='5'||$("#type").val()=='6'||$("#type").val()=='7'){
		       		fillSchool()
		       		$("#schoolId").show();	       
		       }else{
		       		$("#schoolId").hide();		
		       }
		}
	}
	
	$(function(){
		$("#schoolId").hide(); 
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
