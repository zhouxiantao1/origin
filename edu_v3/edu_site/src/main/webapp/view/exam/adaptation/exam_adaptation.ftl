<!DOCTYPE html>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>自适应测试</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="-1">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/auto_control.css">
</head>
<body>

<!-- 引入公共头部 -->
<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">

				<div class="ce_nanage clearfix">
					<div class="contain_c">
						<h3>自适应测试</h3>
					</div>
					<@security.authorize url="/exam/adaptation/save/page.htm">
						<div class="fr new_zhibiao"  onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/save/page.htm'"><img src="${basePath!''}/images/形状-4.png"> <i>发布新的测验</i></div>
					</@security.authorize>
				</div>

				<!-- <div class="ce_nanage clearfix">
					<div class="contain_c">
						<span></span>
						<h3>自适应测试</h3>
					</div>
					<@security.authorize url="/exam/adaptation/save/page.htm">
						<div class="fr new_zhibiao"  onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/save/page.htm'"><img src="${basePath!''}/images/形状-4.png"> <i>发布新的测验</i></div>
					</@security.authorize>
				</div> -->

				<#if pb.list?? && pb.list?size != 0>
				<#list pb.list as ea>
				<div class="paper_list_contain">
					<div class="list_one clearfix">
						<p class="fl first">${ea.testStartTime?string("YYYY-MM-dd hh:mm:ss" )}<i>~</i>${ea.testEndTime?string("YYYY-MM-dd hh:mm:ss")}</p>
						<p class="fl">${ea.name!''}</p>
						<p class="fr status">状态:<#if ea.status=='0'>未开始</#if><#if ea.status == '1'>进行中</#if><#if ea.status=='2'>已结束</#if></p>
					</div>

					<div class="some_detail clearfix">
						<p class="fl count clearfix">
							<span>学段:<#if ea.bs??>${ea.bs.name!''}</#if></span><span>年级:<#if ea.bgv??>${ea.bgv.name!''}</#if></span><span>学科:<#if ea.bsv??>${ea.bsv.name!''}</#if></span><span>题数:${ea.num!''}</span><span>时长:${ea.duration!''}分钟</span>
						</p>
						<!-- <p class="right fr">能力值分析报告</p> -->
					</div>
				</div>
				</#list>
				<!-- 分页 -->
				<div class="page_list clearfix" id="demo2">
					<div class="mids fr">
						<ul class="page_num clearfix">
						   <#if pb.pageNo != 1>
						   	  <li onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/list.htm?pageNo=${pb.firstPageNo!''}'" >首页</li>
              	              <li onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/list.htm?pageNo=${pb.prePageNo!''}'" >上一页</li>
                           </#if>
                            <#list pb.startNo..pb.endNo as index>
              					<#if index == pb.pageNo>
              						<li class="active"   onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/list.htm?pageNo=${pb.pageNo!''}'">${pb.pageNo}</li>
              					<#else>
              						<li  onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/list.htm?pageNo=${index}'">${index}</li>
              					</#if>
			  				</#list>
			  				
			  				 <#if pb.pageNo != pb.totalPages>
								<li onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/list.htm?pageNo=${pb.nextPageNo!''}'">下一页</li>
								<li onClick="javascript:  location.href = '${basePath!''}/exam/adaptation/list.htm?pageNo=${pb.lastPageNo!''}'">未页</li>
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

			<!-- 右侧边栏 -->
			<#--
			<div class="content_right fr">
				<p class="hr"></p>
				<form>
					<div class="form_div">
						<i></i>
						<input type="text" name="" placeholder="搜索...">
					</div>
				</form>
				<p class="hr"></p>

				<h3>筛选</h3>
				<div class="shaixuan">
					<p><i>年级</i><span>全部</span></p>
					<p><i>学科</i><span>数学</span></p>
					<p><i>发布日期</i><span>2017-3-2</span></p>
				</div>

				<p class="hr m_top"></p>
			</div>
			-->
		</div>
	</div>

	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>
	

<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>

</body>
</html>