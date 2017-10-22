<!DOCTYPE html>  
<#assign basePath=request.contextPath>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>新增班级</title>
</head>
<body>

<!-- 新增班级 -->
<form action="${basePath!''}/base/classes/save.htm" method="post"> 
		 选择区域：<select id="areaId" name = "areaId" onchange="fillSchool()">
		</select>
		  选择学校：<select id="schoolId" name = "schoolId">
		</select>
		  选择年级：<select id="gradeId" name="gradeId">
		</select>
		班级名称：<input type="text" name="name">
		<button type="submit" >保存班级</button>
       
</form>
</body>
<!-- jQuery -->
<script src00="${basePath!''}/js/jquery.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/jquery/dist/jquery.min.js"></script>
</html>
<script>	
	$(function(){
		
		var html1 = '';
		var html2 = '';
		  
       $.ajax({  
          type:'get',  
          url:'${basePath!''}/base/grade/listbysearch.htm',  
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html1 += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#gradeId").html(html1);
			
			    }                
          }  
       });
       
       $.ajax({  
          type:'get',  
          url:'${basePath!''}/base/area/listbyparentid.htm', 
          data:{'parentId':1}, 
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html2 += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#areaId").html(html2);
			
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
