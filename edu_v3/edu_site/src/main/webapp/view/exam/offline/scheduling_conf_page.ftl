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
<div>
<input type="button" value="生成分析报告" onclick = "startscheduling()" />
运行状态：<span id="msg">${msg}</span>
</div>
</body>
<!-- jQuery -->
<script src00="${basePath!''}/js/jquery.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/jquery/dist/jquery.min.js"></script>
<script type="text/javascript">
function startscheduling(){ 
    $.ajax({  
          type:'get',  
          url:'${basePath!''}/exam/offline/schedulingconf/startscheduling.htm', 
          data:{'examCode':1,'examRange':1}, 
          dataType:"json",
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        $("#msg").html(Curedata.msg);
			    }                
          }  
       });
}
</script>
</html>
