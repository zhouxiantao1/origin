<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>考试管理-新增单科考试</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/exam_manage_addone.css">
</head>
<body>
	<#include '/common/top.ftl' />
	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<form action="${basePath!''}/exam/online/examdetail/list/online/save.htm" method="post" onsubmit="return toVaild()"> 
					<div class="add_name">
						<input type="text" placeholder="请输入考试名称" name = "detailName" id = "detailName">
					</div>
					<h3 class="exam_set">考试设置</h3>
					<div class="exam_detail">
						<div class="exam_sub clearfix exam_way">
							<span class="fl">选择学科：</span>
							<ul class="clearfix">
							<#if role == 0>
								<#if subjctList?? && subjctList?size != 0>
									<#list subjctList as baseTeacherClassesVo>
										<#if baseTeacherClassesVo_index == 0>
											<li onclick ="subjectChoose(${baseTeacherClassesVo.baseSubjectVo.id},this)"  class="active">${baseTeacherClassesVo.baseSubjectVo.name}</li>
										  <#else>
											<li onclick ="subjectChoose(${baseTeacherClassesVo.baseSubjectVo.id},this)">${baseTeacherClassesVo.baseSubjectVo.name}</li>
										  </#if>
									</#list>
								</#if>
							<#else>
								<#list baseSubjectVoList as baseSubjectVo>
									<#if baseSubjectVo_index == 0>
										<li onclick ="subjectChoose(${baseSubjectVo.id},this)"  class="active">${baseSubjectVo.name}</li>
									  <#else>
										<li onclick ="subjectChoose(${baseSubjectVo.id},this)">${baseSubjectVo.name}</li>
									  </#if>
								</#list>
							</#if>
							</ul>
							<input id = "subjectId" name = "subjectId" type = "hidden" value = "${subjectId}"/>
							<input id = "gradeId" name = "gradeId" type = "hidden" value = "${examInfoVo.gradeId!''}"/>
							<input id = "examId" name = "examId" type = "hidden" value = "${examInfoVo.id!''}"/>
							<input id = "examType" type = "hidden" value = "${examInfoVo.examType!''}"/>
							<input id = "examMethod" name = "examMethod" type = "hidden" value = "${examInfoVo.examMethod!''}"/>
							<input id = "paperId" name = "paperId" type = "hidden" value = ""/>
						</div>
						<div class="test_time clearfix">
							<span class="fl">考试时间：</span>
							<div class="time_box fl">
								<p class="kssj">
									<span>考试时间：</span>
									<input class="date" type="text" name="startTime" value="" id="start">
									<input class="clock" type="text" name="endTime" value="" id ="end">
									<input type="hidden" id="startTime" value=${examInfoVo.startTime?string("yyyy-MM-dd HH:mm:ss")}>
									<input type="hidden" id="endTime" value=${examInfoVo.endTime?string("yyyy-MM-dd HH:mm:ss")}>
								</p>
							</div>
						</div>
						<div class="test_msg clearfix">
							<span class="fl">导考信息：</span>
							<textarea class="msg fl" placeholder="请输入导考信息" name = "examDesc"></textarea>
						</div>
					</div>
					<#if examInfoVo.examMethod == "0">
					<div>
						<div class="select_paper clearfix">
							<p onclick = "queryPapersByName('',1)">选择试卷<span class="tips_span">（点击此处，选择相应试卷。）</span></p>
							<div id = "select_paper"></div>
						</div>
						<div class="paper_names">
							<div id="level" class="add_name" style="margin-bottom:15px;margin-top:40px;">
								<div>参考区域：</div>
								<#if role == 0>
									<#if baseTeacherClassesVoList?? && baseTeacherClassesVoList?size != 0>
										<#list baseTeacherClassesVoList as baseTeacherClassesVo> 
											<div class="info-item" style="float:left;width:260px;">
												<input checked ="checked" style="width:20px;" name="classId" type="checkbox" value="${baseTeacherClassesVo.baseClassesVo.id}"/><span>${baseTeacherClassesVo.baseClassesVo.name}</span>
											</div>
										</#list>
									</#if>
								<#elseif role == 1>
								 <#if regionList?? && regionList?size != 0>
									 <#list regionList as region> 
										<div class="info-item" style="float:left;width:200px;">
											<input checked ="checked" style="width:20px;" name="regionId" type="checkbox" value="${region.id}"/><span>${region.name}</span>
										</div>
									</#list>
								   </#if>
								<#elseif role == 2>
								 <#if schoolList?? && schoolList?size != 0>
									 <#list schoolList as school> 
										<div class="info-item" style="float:left;width:200px;">
											<input checked ="checked" style="width:20px;" name="schoolId" type="checkbox" value="${school.baseSchoolVo.id}"/><span>${school.baseSchoolVo.name}</span>
										</div>
									</#list>
								   </#if>
								<#elseif role == 3>
								 <#if classList?? && classList?size != 0>
									 <#list classList as classes> 
										<div class="info-item" style="float:left;width:200px;">
											<input checked ="checked" style="width:20px;" name="classId" type="checkbox" value="${classes.id}"/><span>${classes.name}</span>
										</div>
									</#list>
								 </#if>
								</#if>
							</div>
							<br/>
							<br/>
							<button class="check" type ="submit">保存</button>
							<button class="check"><a href="javascript:history.back(-1)">取消</a></button>
						</div>
					</div>
					<#else>
					<div>
						<div class="paper_name">
							<button class="check" type ="submit">保存</button>
							<button class="check">取消</button>
						</div>
					</div>
					</#if>
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
<script src="${basePath!''}/js/laydate/laydate.js"></script>
</body>
<script type="text/javascript">
$(function(){
	//layData日期选择
	var start = {
	  elem: '#start',
	  format: 'YYYY-MM-DD hh:mm:ss',
	  min: $("#startTime").val(), //设定最小日期为当前日期
	  max: $("#endTime").val(), //最大日期
	  istime: true,
	  istoday: false,
	  choose: function(datas){
	     end.min = datas; //开始日选好后，重置结束日的最小日期
	     end.start = datas //将结束日的初始值设定为开始日
	  }
	};
	var end = {
	  elem: '#end',
	  format: 'YYYY-MM-DD hh:mm:ss',
	  min: $("#startTime").val(),
	  max: $("#endTime").val(),
	  istime: true,
	  istoday: false,
	  choose: function(datas){
	    start.max = datas; //结束日选好后，重置开始日的最大日期
	  }
	};
	laydate(start);
	laydate(end);
});

Date.prototype.format = function(format) {
    var o = {
        "M+": this.getMonth() + 1,
        // month
        "d+": this.getDate(),
        // day
        "h+": this.getHours(),
        // hour
        "m+": this.getMinutes(),
        // minute
        "s+": this.getSeconds(),
        // second
        "q+": Math.floor((this.getMonth() + 3) / 3),
        // quarter
        "S": this.getMilliseconds()
        // millisecond
    };
    if (/(y+)/.test(format) || /(Y+)/.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
        }
    }
    return format;
};

function timestampformat(timestamp) {
    return (new Date(timestamp)).format("yyyy-MM-dd");
} 

function queryPapersByName(page,pageNo){
	var paperName = $('#paperName').val();
	$("#select_paper").html("");
	flag = true;
	queryPapers(paperName,pageNo);
}

var flag = true;
function queryPapers(paperName,pageNo){
	if(flag){
		$.ajax({  
				type:'get',  
			    url:'${basePath!''}/exam/online/examdetail/ajaxQueryPapers.htm',
			    data:{'subjectId':$('#subjectId').val(),'gradeId':$('#gradeId').val(),'paperName':paperName,'examType':$('#examType').val(),'pageNo':pageNo},
			    async: false,
			    success:function(data){  
			    var Curedata = $.extend(true, [], data); 
			   	 if (Curedata != null) {
			   		 var choosePaperHtml ='<div class="paper_name">'
						+'<span class="sjmc">试卷名称：</span><input class="pp_name" type="text" id="paperName">'
						+'<button class="check" onclick="queryPapersByName()">查询</button>'
					+'</div>'
					+'<div class="paper_list">'
						+'<div class="list_reduce">'
							+'<input disabled="disabled" type="checkbox"/>'
							+'<span class="p_name">试卷名称</span>'
							+'<span class="grade">年级</span>'
							+'<span class="subject">学科</span>'
							+'<span class="total">题目数</span>'
							+'<span class="total">试卷总分</span>'
							+'<span class="people">命题人</span>'
							+'<span class="create">创建时间</span>'
						+'</div>';
						var paperHtml ="";
							for(var i = 0; i<Curedata.list.length;i++){
								paperHtml += '<div class="paper_one">'
									+'<input name="papercheck" onclick="checkedThis(this);" type="checkbox" value ="'+Curedata.list[i].id+'"/>'
									+'<span class="p_name">'+Curedata.list[i].paperName+'</span>'
									+'<span class="grade">'+Curedata.list[i].bgv.name+'</span>'
									+'<span class="subject">'+Curedata.list[i].bsb.name+'</span>'
									+'<span class="total">'+Curedata.list[i].totalQuantity+'</span>'
									+'<span class="total">'+Curedata.list[i].totalScore+'</span>'
									+'<span class="people">'+Curedata.list[i].createName+'</span>'
									+'<span class="create">'+timestampformat(Curedata.list[i].createTime)+'</span>'
								+'</div>';
							}
						
						var pageHtml ="";
						if(Curedata.totalPages>0){
							if(Curedata.pageNo != 1){
								pageHtml += '<li onClick="queryPapersByName(\'page\','+Curedata.firstPageNo+')" >首页</li>'
								+'<li onClick="queryPapersByName(\'page\','+Curedata.prePageNo+')" >上一页</li>';
							}
							for(var index = 1; index <= Curedata.endNo; index++){
								if (index == Curedata.pageNo){
									pageHtml += '<li class="active" onClick="queryPapersByName(\'page\','+Curedata.pageNo+')">'+Curedata.pageNo+'</li>';
								}else{
									pageHtml += '<li  onClick="queryPapersByName(\'page\','+index+')">'+index+'</li>';
								}
							}
							if(Curedata.pageNo != Curedata.totalPages){
								pageHtml += '<li onClick="queryPapersByName(\'page\','+Curedata.nextPageNo+')">下一页</li>'
								+'<li onClick="queryPapersByName(\'page\','+Curedata.lastPageNo+')">未页</li>';
							}	
		      				pageHtml += '<li style ="width:50px;">'+Curedata.pageNo+'/'+Curedata.totalPages+'</li>'
		      				+'<li style ="width:150px;">共'+Curedata.rows+'条记录，分'+Curedata.totalPages+' 页</li>';
						}
						var endHtml = '</div>'
						+'<div class="mids fr" style="margin-top:10px;">'
							+'<ul class="page_num clearfix">'
								+pageHtml
							+'</ul>'
						+'</div>';
						$("#select_paper").append(choosePaperHtml+paperHtml+endHtml);
						$("#paperId").val(Curedata.list[0].id);
					}else{
						$("#select_paper").append("暂无卷子~~");
					}
			    }  
		 	});
	}
	flag = false;
}

function checkedThis(obj){ 
   var boxArray = document.getElementsByName(obj.name); 
   for(var i=0;i<=boxArray.length-1;i++){ 
        if(boxArray[i]==obj && obj.checked){ 
           boxArray[i].checked = true; 
        }else{ 
           boxArray[i].checked = false; 
        } 
   } 
   $("#paperId").val($(obj).val());
} 
    
function subjectChoose(obj,ob){
 	$(ob).addClass("active");
 	$(ob).siblings().removeClass(); 
 	$("#subjectId").val(obj);
 	var examMethod = $("#examMethod").val();
 	if(examMethod == "0"){
 		queryPapersByName();
 	}
 }
 
 function toVaild(){
 	if(!$.trim($("#detailName").val())){
        alert('考试名称不能为空！');
        return false;
    }
    if(!$.trim($("#start").val())){
        alert('考试开始时间不能为空！');
        return false;
    }
    if(!$.trim($("#end").val())){
        alert('考试结束时间不能为空！');
        return false;
    }
    var examMethod = $("#examMethod").val();
    if(examMethod == "0"){
    	if($('input[type=radio][name=examType]:checked').val() == "0"){
	    	if($('input[name="papercheck"]:checked').length == 0){
	    		alert('请选择相应的考试试卷，若没有试卷，请先新建试卷！');
	        	return false;
	    	}
	    }
	    if($('input[name="regionId"]:checked').length == 0 && $('input[name="schoolId"]:checked').length == 0 && $('input[name="classId"]:checked').length == 0){
			alert('参考区域必须选择！');
	    	return false;
		}
    }
    
 }
</script>
</html>
