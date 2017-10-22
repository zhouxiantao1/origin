<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>自适应测试-自适应测验列表</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="-1">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/auto_test.css">
</head>
<body>
<input type="hidden" id="status" value="${search.status!''}">
<input type="hidden" id="subjectId" value="${search.subjectId!''}">
	<!-- 引入公共头部 -->
<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<!-- <div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>自适应测试&gt;我的自适应测试</h3>
					</div>
					<p class="back fr"  onClick="javascript :history.back(-1);">返回上级</p>
				</div> -->
				<div class="nav_list">
					<ul class="paper_list clearfix">
						<li status='0' <#if search.status == '0'>class="active"</#if> onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/my/page.htm?status=0'">未完成</li>
						<li status='1' <#if search.status == '1'>class="active"</#if> onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/my/page.htm?status=1'">已完成</li>
					</ul>

					<div class="condition_list">
						<div class="choice_sub clearfix">
							<span>选择学科：</span>
							<ul class="clearfix" id="subject_choice">
								<!-- 学科  -->
								<#if search.subjectId??>
									<#if bsvs?? && bsvs?size != 0>
										<#list bsvs as bsv>
											<li  onClick="search_my_exam_adaptaion('subject',${bsv.id!''})" subject_id="${bsv.id!''}" <#if bsv.id == search.subjectId> class="active"</#if>>${bsv.name!''}</li>
										</#list>
									<#else>
										<li>暂无学科信息</li>
									</#if>
								</#if>
							</ul>
						</div>
					</div>	

				</div>
				

				

				<#if pb.mlist?? && pb.mlist?size != 0>
				<#list pb.mlist as ea>
				<div class="list_one">
					<div class="top_list clearfix">
						<p class="time">${ea.test_start_time?string("YYYY-MM-dd hh:mm:ss" )}<i>~</i>${ea.test_end_time?string("YYYY-MM-dd hh:mm:ss")}</p>
						<p class="school">${ea.name!''}</p>
						<p class="status fr">状态:
						  	<#if ea.test_start_time?datetime &gt; .now?datetime && ea.test_end_time?datetime &gt; .now?datetime>未开始</#if>
						  	<#if ea.test_start_time?datetime &lt; .now?datetime && ea.test_end_time?datetime &gt;= .now?datetime>进行中</#if>
        					<#if ea.test_start_time?datetime &lt; .now?datetime && ea.test_end_time?datetime &lt; .now?datetime>已结束</#if>
						</p>
					</div>

					<div class="detail clearfix">                                  
						<p class="fl some"><span>学段:${ea.stage_name!''}</span><span>年级:${ea.grade_name!''}</span><span>学科:${ea.subject_name!''}</span><span>题数:${ea.num!''}</span><span>时长:${ea.duration!''}分钟</span></p>
						
						<p class="start_do fr">
						<#if ea.status??>
							<#if ea.status == '0'>
							
								<#if ea.test_start_time?datetime &gt; .now?datetime && ea.test_end_time?datetime &gt; .now?datetime>
									<p class="end_close fr"><button>未开始</button></p>
								</#if>
							  	<#if ea.test_start_time?datetime &lt; .now?datetime && ea.test_end_time?datetime &gt;= .now?datetime>
							  		<button onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/answer/page.htm?&id=${ea.id!''}&stageId=<#if ea.bs??>${ea.bs.id!''}</#if>'">继续测试</button>
							  	</#if>
	        					<#if ea.test_start_time?datetime &lt; .now?datetime && ea.test_end_time?datetime &lt; .now?datetime>
	        						<p class="end_close fr"><button>已结束</button></p>
								</#if>
							</#if>
							<#if ea.status == '1' || ea.status == '2'>
								<p class="end_close fr"><button  onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/report/page.htm?adaptationId=${ea.id!''}'">查看报告</button></p>
							</#if>
						<#else>
							<button onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/answer/page.htm?&id=${ea.id!''}&stageId=<#if ea.bs??>${ea.bs.id!''}</#if>'">开始测试</button>
						</#if>
						</p>
						
					</div>
				</div>
				</#list>
				
				<!-- 分页 -->
				<div class="page_list clearfix" id="demo2">
					<div class="mids fr">
						<ul class="page_num clearfix">
						   <#if pb.pageNo != 1>
						   	  <li onClick="search_my_exam_adaptaion('page','${pb.firstPageNo!''}')" >首页</li>
              	              <li onClick="search_my_exam_adaptaion('page','${pb.prePageNo!''}')" >上一页</li>
                           </#if>
                            <#list pb.startNo..pb.endNo as index>
              					<#if index == pb.pageNo>
              						<li class="active"   onClick="search_my_exam_adaptaion('page','${pb.pageNo}')">${pb.pageNo}</li>
              					<#else>
              						<li  onClick="search_my_exam_adaptaion('page','${index}')">${index}</li>
              					</#if>
			  				</#list>
			  				
			  				 <#if pb.pageNo != pb.totalPages>
								<li onClick="search_my_exam_adaptaion('page','${pb.nextPageNo!''}')">下一页</li>
								<li onClick="search_my_exam_adaptaion('page','${pb.lastPageNo!''}')">未页</li>
              				</#if>
              				<li>${pb.pageNo}/${pb.totalPages}</li>
              				<li>共${pb.rows}条记录，分 ${pb.totalPages} 页</li>
						</ul>
					</div>
				</div>
				<#else>
					<h1 class="tips_msg"><img src="${basePath!''}/images/no-content.png"><br>暂无自适应测试~~</h1>
				</#if>

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
<script>

	//组装查询跳转url
	function search_my_exam_adaptaion(type,id){
	
		var url = "${basePath!''}/exam/adaptation/my/page.htm?status="+$('#status').val();
		var data = "";
		if(type == 'subject'){
		
			data = data + "&subjectId="+id;
			
		}else if(type == 'page'){
		
			data = data + "&subjectId="+$('#subjectId').val()+"&pageNo="+id;
			
		}
		window.location.href=url+data;
	
	}
</script>

	
</body>
</html>