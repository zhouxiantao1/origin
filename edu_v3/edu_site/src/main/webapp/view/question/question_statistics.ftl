<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>题库-统计</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
</head>
<style type="text/css">
	.subject_detail{
		border:1px solid #ccc;
		margin:30px 20px 20px;
		padding:40px 8%;
	}
	.subject_detail{
		line-height: 30px;
		font-size: 14px;
		color:#333;
	}
	.left_data{
		margin-left: 10%;
		font-size: 12px;
	}
	.subject_detail .total span{
		font-weight: 900;
	}
	#sub_pic{
		width:650px;
		height: 220px;
	}

	.two_pic{
		margin:0 20px 30px;
	}
	.two_pic .pic_left,.two_pic .pic_mid,.two_pic .pic_right{
		width:32%;
		margin-right: 1.6%;
		border:1px solid #ccc;
		height:280px;
	}
	.two_pic .pic_right{
		margin-right: 0;
	}
	.two_pic .pic_left h3,.two_pic .pic_mid h3,.two_pic .pic_right h3{
		margin:20px 0 0 20px;
	}
	#grade_pic,#tiku_pic,#subject_pic{
		width:100%;
		height: 240px;
	}
</style>
<body>

<!-- 引入公共头部 -->
<#include '/common/top.ftl' />		

<div class="content_contain">
	<div class="content">
		<div class="mid fl">
			<div class="ce_nanage clearfix">
				<div class="contain_c fl">
					<h3>题库>试题统计</h3>
				</div>
				<p class="back fr" onClick="javascript :history.back(-1);">返回上级</p>
			</div>
			<div class="subject_detail clearfix">
				<div class="left_data fl">
					<p class="total">
						试题总数：<span id="question_count" style="font-size: 20px;font-weight: bold;">统计中...</span>
					</p>
					<p class="today_set">
						今日命题：<span id="question_today_count">统计中...</span>
					</p>
					<p class="not_allot">
						待分配审核：<span id="question_status_0">统计中...</span>
					</p>
					<p class="not_allot2">
						待审核：<span id="question_status_1">统计中...</span>
					</p>
					<p class="shenhe_success">
						审核通过：<span id="question_status_2">统计中...</span>
					</p>
					<p class="shenhe_faild">
						审核失败：<span id="question_status_3">统计中...</span>
					</p>
				</div>

				<div class="fr" id="sub_pic">
					
				</div>
			</div>

			<div class="two_pic clearfix">
			
				<div class="pic_left fl">
					<h3>按题库</h3>
					<div id="tiku_pic"></div>
				</div>
				
				<div class="pic_mid fl">
					<h3>按年级</h3>
					<div id="grade_pic"></div>
				</div>
				
				<div class="pic_right fl">
					<h3>按学科</h3>
					<div id="subject_pic"></div>
				</div>
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
<script src="${basePath!''}/js/echarts.min.js"></script>
<script type="text/javascript">
	$(function(){

		loading_base();
		loading_statistics_stage();
		loading_statistics_grade();
		loading_statistics_lib();
		loading_statistics_subject();
		
	})
	
	function loading_base(){
		
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/statistics/base/get.htm?timer='+ new Date().getTime(),  
          success:function(data){  
          	$('#question_status_0').html(0);
          	$('#question_status_1').html(0);
          	$('#question_status_2').html(0);
          	$('#question_status_3').html(0);
          	
          	$('#question_count').html(data.qc);
          	$('#question_today_count').html(data.qtc);
          	for(var i=0;i<data.qs.length;i++){
          		if(data.qs[i].check_status=='0'){
          			$('#question_status_0').html(data.qs[i].count);
          		}else if(data.qs[i].check_status=='1'){
          			$('#question_status_1').html(data.qs[i].count);
          		}else if(data.qs[i].check_status=='2'){
          			$('#question_status_2').html(data.qs[i].count);
          		}else if(data.qs[i].check_status=='3'){
          			$('#question_status_3').html(data.qs[i].count);
          		}
          	}
          	
          },
		  error: function(xhr,status,error) { 
		       if(error=='Forbidden'){
		       		alert('[获取基础统计信息]权限不足');
		       }else{
		       		alert('获取基础统计信息系统出错!');
		       }
			} 
    	});  
	
	}
	
	//获取学段统计信息
	function loading_statistics_stage(){
		
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/statistics/stage/get.htm?timer='+ new Date().getTime(),  
          success:function(data){  
          	loading_statistics_stage_chart(data);
          },
		  error: function(xhr,status,error) { 
		  	alert('获取学段统计信息出错!');
		  } 
    	});  
	
	}
	
	// 获取年级统计信息
	function loading_statistics_grade(){
		
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/statistics/grade/get.htm?timer='+ new Date().getTime(),  
          success:function(data){  
          	loading_statistics_grade_chart(data);
          },
		  error: function(xhr,status,error) { 
		  	alert('获取年级统计信息出错!');
		  } 
    	});  
	
	}
	
	function loading_statistics_subject(){
		
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/statistics/subject/get.htm?timer='+ new Date().getTime(),  
          success:function(data){  
          	loading_statistics_subject_chart(data);
          },
		  error: function(xhr,status,error) { 
		  	alert('获取年级统计信息出错!');
		  } 
    	});  
	
	}
	
	
	function loading_statistics_lib(){
		
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/statistics/lib/get.htm?timer='+ new Date().getTime(),  
          success:function(data){  
          	loading_statistics_lib_chart(data);
          },
		  error: function(xhr,status,error) { 
		  	alert('获取题库试题统计信息出错!');
		  } 
    	});  
	
	}
	
	
	
	function loading_statistics_stage_chart(data){
	
		var chart_01 = echarts.init(document.getElementById('sub_pic'));
		option_01 = {
		    title : {
		       // text: '南丁格尔玫瑰图',
		       // subtext: '纯属虚构',
		       // x:'center'
		    },
		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },
		    legend: {
		        x : 'center',
		        y : 'bottom',
		        data:['rose1','rose2','rose3','rose4','rose5','rose6','rose7','rose8']
		    },
		    toolbox: {
		        show : true,
		        feature : {
		            mark : {show: true},
		            dataView : {show: true, readOnly: false},
		            magicType : {
		                show: true,
		                type: ['pie', 'funnel']
		            },
		            restore : {show: true},
		            saveAsImage : {show: true}
		        }
		    },
		    calculable : true,
		    series : [
		        {
		            name:'面积模式',
		            type:'pie',
		            radius : [30, 110],
		            center : ['75%', '50%'],
		            roseType : 'area',
		            data:data
		        }
		    ]
		};
				
		chart_01.setOption(option_01);
	
	}
	
	function loading_statistics_grade_chart(data){
	
		var chart_02 = echarts.init(document.getElementById('grade_pic'));
		option_02 = {
		    title : {
		      //   text: '年级试题分布',
		         x:'center'
		    },
		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },
		    legend: {
		        orient: 'vertical',
		        left: 'left'
		    },
		    series : [
		        {
		            type: 'pie',
		            radius : '55%',
		            center: ['50%', '50%'],
		            data:data,
		            itemStyle: {
		                emphasis: {
		                    shadowBlur: 10,
		                    shadowOffsetX: 0,
		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
		                }
		            }
		        }
		    ]
		};
		chart_02.setOption(option_02);
	
	}
	
	
	function loading_statistics_subject_chart(data){
	
		var chart_04 = echarts.init(document.getElementById('subject_pic'));
		option_04 = {
		    title : {
		      //   text: '年级试题分布',
		         x:'center'
		    },
		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },
		    legend: {
		        orient: 'vertical',
		        left: 'left'
		    },
		    series : [
		        {
		            type: 'pie',
		            radius : '55%',
		            center: ['50%', '50%'],
		            data:data,
		            itemStyle: {
		                emphasis: {
		                    shadowBlur: 10,
		                    shadowOffsetX: 0,
		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
		                }
		            }
		        }
		    ]
		};
		chart_04.setOption(option_04);
	
	}
	
	function loading_statistics_lib_chart(data){
	
		var chart_03 = echarts.init(document.getElementById('tiku_pic'));
		option_03 = {
		    title : {
		       //  text: '题库试题分布',
		         x:'center'
		    },
		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },
		    legend: {
		        orient: 'vertical',
		        left: 'left'
		    },
		    series : [
		        {
		            type: 'pie',
		            radius : '55%',
		            center: ['50%', '50%'],
		            data:data,
		            itemStyle: {
		                emphasis: {
		                    shadowBlur: 10,
		                    shadowOffsetX: 0,
		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
		                }
		            }
		        }
		    ]
		};
		chart_03.setOption(option_03);
	
	}
</script>
