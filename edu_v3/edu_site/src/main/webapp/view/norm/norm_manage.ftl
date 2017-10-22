<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>常模管理</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/norm_manage.css">
</head>
<body>
	<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<#include '/common/left.ftl' /> 
			
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>常模管理</h3>
					</div>
				</div>
				<div class="check_norm">
					<div class="create_norm clearfix">
						<button class="fr"><a href = "${basePath!''}/norm/add.htm"><span>+</span>新建常模</a></button>
					</div>
					<div class="klass_sub">
						<span>创建时间：</span>
						<input class="date" type="text" id = "start" name = "startTime" <#if search??>value="${search.startTime?string('yyyy-MM-dd HH:mm:ss')!''}"</#if> style="width:140px;">
						<span>至：</span>
						<input class="clock" type="text" id = "end" name = "endTime" <#if search??>value="${search.endTime?string('yyyy-MM-dd HH:mm:ss')!''}"</#if> style="width:140px;">
						
						<span class="sub">年级：</span>
						<select class="xueke" id="gradeId">
							<#list baseGradeVoList as baseGradeVo>
							 <option <#if search.gradeId?? && baseGradeVo.id == search.gradeId> selected = "selected"</#if> value="${baseGradeVo.id}">${baseGradeVo.name}</option> 
							</#list>
						</select>
						<span class="work_name">名称：</span>
						<input type="text" name="" placeholder="请输入常模名称搜索" id="normName">
						<button class="check fr" onClick="search_norm('search','0')">查询</button>
					</div>
				</div>

				<div class="norm_list">
					<div class="list_title clearfix">
						<span class="norm_name">常模名称</span>
						<span class="test_name">考试名称</span>
						<span class="create_time">创建时间</span>
						<span class="creater">创建者</span>
						<span class="operation">操作</span>
					</div>
					<#if pb.list?? && pb.list?size != 0>
						<#list pb.list as normDefinitionVo>
							<ul class="list_item clearfix">
								<li>
									<span class="norm_name">${normDefinitionVo.normName!''}</span>
									<span class="test_name">${normDefinitionVo.examInfoVo.examName!''}</span>
									<span class="create_time">${normDefinitionVo.createTime?date!''}</span>
									<span class="creater">${normDefinitionVo.createName!''}</span>
									<span class="operation"><i class="check_it"><a style="color: #00ada7;" href="${basePath!''}/norm/list/view.htm?defId=${normDefinitionVo.id!''}&normName=${normDefinitionVo.normName!''}&calculationMethod=${normDefinitionVo.calculationMethod!''}">查看</a></i><i onclick="deleteNorm(${normDefinitionVo.id!''})" class="delete">删除</i></span>
								</li>
							</ul>
						</#list>
					</#if>
					<!-- 分页 -->
					<#if (pb.totalPages>0) >
					<div class="page_list clearfix" id="demo2">
						<div class="mids fr">
							<ul class="page_num clearfix">
							   <#if pb.pageNo != 1>
							   	  <li onClick="search_norm('page','${pb.firstPageNo!''}')" >首页</li>
	              	              <li onClick="search_norm('page','${pb.prePageNo!''}')" >上一页</li>
	                           </#if>
	                            <#list pb.startNo..pb.endNo as index>
	              					<#if index == pb.pageNo>
	              						<li class="active"   onClick="search_norm('page','${pb.pageNo}')">${pb.pageNo}</li>
	              					<#else>
	              						<li  onClick="search_norm('page','${index}')">${index}</li>
	              					</#if>
				  				</#list>
				  				
				  				 <#if pb.pageNo != pb.totalPages>
									<li onClick="search_norm('page','${pb.nextPageNo!''}')">下一页</li>
									<li onClick="search_norm('page','${pb.lastPageNo!''}')">未页</li>
	              				</#if>
	              				<li>${pb.pageNo}/${pb.totalPages}</li>
	              				<li>共${pb.rows}条记录，分 ${pb.totalPages} 页</li>
							</ul>
						</div>
					</div>
					</#if>
					
				</div>

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
<script type="text/javascript">
$(function(){
	//layData日期选择
	var start = {
	  elem: '#start',
	  format: 'YYYY-MM-DD hh:mm:ss',
	  min: '1900-01-01 00:00:00', //设定最小日期为当前日期
	  max: $("#end").val(), //最大日期
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
	  min: $("#start").val(),
	  max: '2099-06-16 23:59:59',
	  istime: true,
	  istoday: false,
	  choose: function(datas){
	    start.max = datas; //结束日选好后，重置开始日的最大日期
	  }
	};
	laydate(start);
	laydate(end);
});

function search_norm(obj,ob){
	if(!$.trim($("#start").val())){
        alert('创建开始时间不能为空！');
        return false;
    }
    if(!$.trim($("#end").val())){
        alert('创建结束时间不能为空！');
        return false;
    }
 	var normName = $("#normName").val();
 	var gradeId = $("#gradeId").val();
 	var startTime = $("#start").val();
 	var endTime = $("#end").val();
 	var url = "${basePath!''}/norm/list.htm?";
 	if(obj == 'search'){
		var data = "normName="+normName+"&gradeId="+gradeId+"&startTime="+startTime+"&endTime="+endTime;
	 	window.location.href=url+data;
 	}else{
 		var data = "examType="+examType+"&subjectId="+subjectId+"&gradeId="+gradeId+"&paperName="+paperName+"&pageNo="+ob;
	 	window.location.href=url+data;
 	}
}

function deleteNorm(id){
	if(!confirm('是否删除该常模?')){
		return false;
    }
    $.ajax({  
			type:'post',  
		    url:'${basePath!''}/norm/list/delete.htm', 
		    data:{'id':id}, 
		    success:function(data){ 
		    	document.location.reload(); 
		    	alert("删除成功！");
		    },
		    error: function(){
            	alert("删除失败！");
            } 
	 	});
}
</script>	
</body>
</html>