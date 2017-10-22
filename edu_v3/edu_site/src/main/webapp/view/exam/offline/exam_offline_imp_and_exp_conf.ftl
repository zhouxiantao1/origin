<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>考试管理-导入成绩</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/exam_manage_daoru.css">
</head>
<body>
	<#include '/common/top.ftl' />
	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>考试管理&gt;导入试卷配置</h3>
					</div>
					<p class="back fr"><a href="javascript:history.back(-1)">返回上级</a></p>
				</div>
				
				<form id="subform" method="post" enctype="multipart/form-data">
				<div class="report">
					<h3 class="title">${examName}</h3>
					<div class="situation clearfix">
						<p class="exam_area">考试名称：<span>${examDetailVo.detailName}</span></p>
						<p class="test_type">考试方式：<span><#if examMethod == "0">线上考试<#else>线下考试</#if></span></p>
						<p class="grade">年级：<span>${examDetailVo.bgv.name}</span></p>
						<p class="time_long">学科：<span>${examDetailVo.bsb.name}</span></p>
						<p class="exam_type">考试类型：<span>期中考</span></p>
						<input type = "hidden" value = "${examDetailVo.bsb.name}" id ="subjectName" name ="subjectName" />
						<input type = "hidden" value = "${examDetailVo.bgv.name}" id ="gradeName" name ="gradeName"/>
						<input type = "hidden" value = "${examDetailVo.gradeId}" id ="gradeId" name ="gradeId"/>
						<input type = "hidden" value = "${examDetailVo.subjectId}" id ="subjectId" name ="subjectId"/>
						<input type = "hidden" value = "${examDetailVo.id}" id ="examDetailId" name ="examDetailId"/>
						<input type = "hidden" value = "${examDetailVo.examId}" id ="examId" name ="examId"/>
					</div>
					<div class="insert_file">
						<p class="explain">本次考试为线下考试，尚未录入试卷配置，可下载Exce模板录入后导入试卷配置，如有模板可直接导入</p>
						<div class="operation">
							<input id="excel_file" type="file" name="filename" accept="xlsx" size="80" />
        					<input class="select" id="excel_button" type="button" value="导入Excel" onclick="btnAdd()"/>
							<div class="clearfix method">
								<span class="support">支持 <i>Excel格式</i></span>
								<span class="excel"><a style="color: #0075b1;" href="#" onclick = "downLoadTemplate()">下载Excel模板</a></span>
							</div>
						</div>
					</div>
				</div>
				</form>

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
<script type="text/javascript">
function check() {
    var excel_file = $("#excel_file").val();
    if (excel_file == "" || excel_file.length == 0) {
        alert("请选择文件路径！");
        return false;
    } else {
        return true;
    }
}

function btnAdd() {
	 check();
	 var formData = new FormData($("#subform")[0]);
	 $.ajax({
	  url: "${basePath!''}/exam/offline/paperconf/batchimport.htm",
	  type: "POST",
	  data: formData,
	  contentType: false, //必须false才会避开jQuery对 formdata 的默认处理 XMLHttpRequest会对 formdata 进行正确的处理 
	  processData: false, //必须false才会自动加上正确的Content-Type
	  success: function (data) {
	   alert(data.msg);
	  },
	  error: function(data){
        alert("批量导入EXCEL失败！");
      }
 });
}

function downLoadTemplate(){
	var subjectName = $('#subjectName').val();
    var gradeName = $('#gradeName').val();
 	var gradeId = $('#gradeId').val();
 	var subjectId = $('#subjectId').val();
 	var url = '${basePath!''}/exam/offline/paperconf/paperconfdownload.htm?';
 	var data = "subjectName="+subjectName+"&gradeName="+gradeName+"&gradeId="+gradeId+"&subjectId="+subjectId;
	window.location.href=url+data;
}
</script>	
</body>
</html>