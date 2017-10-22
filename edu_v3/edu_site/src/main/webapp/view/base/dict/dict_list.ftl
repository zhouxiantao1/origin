<!DOCTYPE html>  
<#assign basePath=request.contextPath>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>字典工具新增</title>
</head>
<body>

<!-- 字典工具新增 -->
<form action="${basePath!''}/base/dict/save.htm" method="post">  
                         字典类型：<input type="text" name="type"></br></br>
                         标签：<input type="text" name="label"></br></br>
                         键值：<input type="text" name="value"></br></br>
                          排序：<input type="text" name="sort"></br></br>            
        <button type="submit" >保存</button>
</form>
</body>
</html>