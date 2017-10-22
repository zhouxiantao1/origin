<!DOCTYPE html>  
<#assign basePath=request.contextPath>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>新增学校</title>
</head>
<body>

<!-- 新增学校 -->
<form action="${basePath!''}/base/school/save.htm" method="post">  
                         学校名称：<input type="text" name="name">&nbsp</br></br>
                         选择区域：<select name="areaId">
  				<option value ="2">荔湾区</option>
  				<option value ="3">越秀区</option>
 				<option value="4">海珠区</option>
  				<option value="5">天河区</option>
  				<option value="6">白云区</option>
  				<option value="7">黄埔区</option>
  				<option value="8">番禺区</option>
  				<option value="9">花都区</option>
  				<option value="10">南沙区</option>
  				<option value="11">从化区</option>
  				<option value="12">增城区</option>
		</select>
        <button type="submit" >保存学校</button>
</form>
</body>
</html>