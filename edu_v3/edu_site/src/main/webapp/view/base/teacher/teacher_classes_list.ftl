<!DOCTYPE html>  
<#assign basePath=request.contextPath>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>关联老师任教科目班级</title>
</head>
<body>

<!-- 关联老师任教科目班级 -->
<form action="${basePath!''}/base/teacher/classes/save.htm" method="post"> 
		 选择区域：<select id="areaId" name = "areaId" onchange="fillSchool()">
		</select>&nbsp
		  选择学校：<select id="schoolId" name = "schoolId" onchange="fillTeacher()"> 
		</select>&nbsp
		  选择老师：<select id="teacherId" name="teacherId">
		</select>&nbsp
		选择班级：<select id="classesId" name="classesId">
		</select>&nbsp
		选择学科：<select id="subjectId" name="subjectId">
		</select>&nbsp
		选择年级：<select id="gradeId" name="gradeId">
		</select>&nbsp
		是否是班主任：<select id="isIncharge" name="isIncharge">
			<option value="0">否</option> 
			<option value="1">是</option> 
		</select>&nbsp
		<button type="submit" >保存</button>
       
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
 
       $.ajax({  
          type:'get',  
          url:'${basePath!''}/base/subject/listbysearch.htm', 
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html1 += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#subjectId").html(html1);
			
			    }                
          }  
       });
       
         $.ajax({  
          type:'get',  
          url:'${basePath!''}/base/grade/listbysearch.htm', 
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html2 += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#gradeId").html(html2);
			
			    }                
          }  
       });
       
	});
	
	function fillSchool(){
		var html = "<option>请选择</option>";
		
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
       
       function fillTeacher(){
		var html = '';
		var html1 = '';
		
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/teacher/listbysearch.htm',  
          data:{'schoolId':$("#schoolId").val()},
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#teacherId").html(html);
			
			    }                
          }  
       });
       
       $.ajax({  
          type:'get',  
          url:'${basePath!''}/base/classes/listbysearch.htm',  
          data:{'schoolId':$("#schoolId").val()},
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			            html1 += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			        }	
			        $("#classesId").html(html1);
			
			    }                
          }  
       });
       
		}
</script>
