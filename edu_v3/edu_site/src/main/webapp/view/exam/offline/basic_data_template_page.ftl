<!DOCTYPE html>  
<html lang="en">
<head>
<#assign basePath=request.contextPath>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Elite CRM Admin Template - CRM admin dashboard web app kit</title>
</head>
<body>
<div id="level" class="level">
	<select id="sel_city" class="sel_">
	  <option value="0">广州市</option>
	</select>
	
	<select id="sel_region" class="sel_" change="javascript:regionChange()">
	  <option value="0">请选择区</option>
	  <#assign  keys=regionMap?keys/>
	  <#if keys??>
		 <#list keys as key> 
      		<option value="${key!''}">${regionMap["${key!''}"]}</option>  
     	</#list>
      </#if>
	</select>
	
	<select id="sel_school" class="sel_" change="javascript:schoolChange()">
	  <option value="0">请选择学校</option>
	  <#assign  keys=schoolMap?keys/>
	  <#if keys??>
	  <#list keys as key> 
      	<option value="${key!''}">${schoolMap["${key!''}"]}</option>  
      </#list>
      </#if>
	</select>
	
	<select id="sel_class" class="sel_">
	  <option value="0">请选择班级</option>
	  <#assign  keys=classMap?keys/>
	  <#if keys??>
	  <#list keys as key> 
      	<option value="${key!''}">${classMap["${key!''}"]}</option>  
      </#list>
      </#if>
	</select>
</div>
<div>
<a href="basicdatadownload.htm">下载Exel模板</a>
<form action="batchimport.htm" method="post" enctype="multipart/form-data" onsubmit="return check();">
    <div style="margin: 30px;">
        <input id="excel_file" type="file" name="filename" accept="xlsx" size="80" />
        <input id="excel_button" type="submit" value="导入Excel" />
        <input name = "examCode" value = "1" type="hidden"/>
		<input name = "districtCode" value = "1" type="hidden"/>
		<input name = "schoolCode" value = "1" type="hidden"/>
		<input name = "classCode" value = "1" type="hidden"/>
		<input name = "subjectCode" value = "1" type="hidden"/>
		<input name = "subjectName" value = "语文" type="hidden"/>
    </div>
</form>
</div>

<script type="text/javascript">
$(document).ready(function(e) {
	function check() {
        var excel_file = $("#excel_file").val();
        if (excel_file == "" || excel_file.length == 0) {
            alert("请选择文件路径！");
            return false;
        } else {
            return true;
        }
    }
    
    fillSchool();
    fillClass();
    
    $("#region").change(function(){
        fillSchool();
        fillClass();
    })
    $("#school").change(function(){
		fillClass();
    })
    
    
    function fillSchool(){ 
        var type = $("#sel_region").val();
	    var html = "";
	    var CommitUrl = "../regionType.do?id=" + type;
	    $.ajax({
			type : "POST",
			contentType : "application/json",
			url : CommitUrl,
			dataType : 'json',
			success : function(result) {
			    var Curedata = $.extend(true, [], result);
			    if (Curedata.school != null) {
			        for ( var i = 0; i < Curedata.school.length; i++) {
			            html += "<option value='"+Curedata.school[i].id+"'>"+ Curedata.school[i].schoolName
			                    + "</option>";
			        }
			        $("#sel_school").empty();
			        $(html).appendTo("#sel_school");
			
			    }
			    }
		});
    }
    
    function fillClass(){ 
        var type = $("#sel_class").val();
	    var html = "";
	    var CommitUrl = "../schoolType.do?id=" + type;
	    $.ajax({
			type : "POST",
			contentType : "application/json",
			url : CommitUrl,
			dataType : 'json',
			success : function(result) {
			    var Curedata = $.extend(true, [], result);
			    if (Curedata.class != null) {
			        for ( var i = 0; i < Curedata.class.length; i++) {
			            html += "<option value='"+Curedata.class[i].id+"'>"+ Curedata.class[i].className
			                    + "</option>";
			        }
			        $("#sel_class").empty();
			        $(html).appendTo("#sel_class");
			
			    }
			    }
		});
    }
       
});
</script>
</body>
</html>
