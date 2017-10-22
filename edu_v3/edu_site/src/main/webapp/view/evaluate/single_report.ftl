<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理-分析报告-老师</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/analysis_report_teacher.css">

</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>测评管理&gt;分析报告</h3>
					</div>
					<p class="back fr" onClick="back_list()">返回上级</p>
				</div>

				<div class="some_content">
					<div class="export_report clearfix"><span>导出分析报告</span></div>
					<h2 class="report_title">教育质量阳光平价调查问卷（高中）</h2>
					<p class="tips">本问卷可以帮助你了解自己的学习情况，学习短板，以及自己的学习方法是否正确。能承受的学习压力和难度。本问卷调查不要求署名，请放心并真实填写。</p>
					<div class="report_detail">
						<span>姓名：胡小哲</span>
						<span>学号：201509010023A01</span>
						<span>学校：广州市第二中学</span>
						<span>班级：八年级（1）班</span>
					</div>
					<div class="select_area">
						<span>请选择区域：</span>
						<select>
							<option>请选择市</option>
							<option>广州市</option>
							<option>佛山市</option>
						</select>
						<select>
							<option>请选择区</option>
							<option>天河区</option>
							<option>白云区</option>
						</select>
						<select>
							<option>请选择学校</option>
							<option>清华大学</option>
							<option>佛山市</option>
						</select>
						<select>
							<option>请选择班级</option>
							<option>高一1班</option>
							<option>高一2班</option>
						</select>
					</div>

					<div class="ans_object clearfix">
						<h3>问卷对象性别分布</h3>
						<div class="picture fl">
							<div class="picman clearfix">
								<span class="fl"><img src="${basePath!''}/images/worman.png"></span>
								<span class="fl"><img src="${basePath!''}/images/man.png"></span>
							</div>
							<div class="bar clearfix">
								<span class="worman_bar fl">40%</span>
								<span class="man_bar fl">60%</span>
							</div>
						</div>
						<div class="fr count_many">
							<p class="ans_count">答题人数：<span>3160</span>人</p>
							<p class="worman">
								<i></i> 女性 <span>1264</span>人
							</p>
							<p class="man">
								<i></i> 男性 <span>1896</span>人
							</p>
						</div>
					</div>

					<div class="test_obj_ana clearfix">
						<h3>测评对象区域分布</h3>
						<div class="tab fl">
							<table>
								<tr>
									<td>区域</td>
									<td>参测人数</td>
									<td>比例</td>
								</tr>
								<tr>
									<td>海珠区</td><td>208</td><td>12.83%</td>
								</tr>
								<tr>
									<td>天河区</td><td>208</td><td>12.83%</td>
								</tr>
								<tr>
									<td>越秀区</td><td>208</td><td>12.83%</td>
								</tr>
								<tr>
									<td>白云区</td><td>208</td><td>12.83%</td>
								</tr>
								<tr>
									<td>番禺区</td><td>208</td><td>12.83%</td>
								</tr>
								<tr>
									<td>南沙区</td><td>208</td><td>12.83%</td>
								</tr>
								<tr>
									<td>萝岗区</td><td>208</td><td>12.83%</td>
								</tr>
								<tr>
									<td>花都区</td><td>208</td><td>12.83%</td>
								</tr>
							</table>
						</div>
						<div class="map fl">
							<img src="${basePath!''}/images/map.png">
						</div>
					</div>

					<div class="what_you_like">
						<h3>第1题：你喜欢的学科有哪些？</h3>
						<div id="like_sub" class="like_sub"></div>
					</div>
					<div class="study_time">
						<h3>第2题：你每天自主学习的时间？</h3>
						<table>
							<tr>
								<td>选项</td><td>选择人数</td><td>所占比例（大约）</td>
							</tr>
							<tr>
								<td>A.30分钟</td><td>15人</td><td>50%</td>
							</tr>
							<tr>
								<td>B.3小时</td><td>15人</td><td>50%</td>
							</tr>
							<tr>
								<td>C.30分钟</td><td>15人</td><td>50%</td>
							</tr>
							<tr>
								<td>D.30分钟</td><td>15人</td><td>50%</td>
							</tr>
						</table>
					</div>
					<div class="study_time">
						<h3>第3-7题题：矩阵量表题</h3>
						<table>
							<tr>
								<td>题目序号</td><td>选项1</td><td>选项2</td><td>选项3</td><td>选项4</td><td>选项5</td><td>选项6</td><td>选项7</td><td>平均分</td>
							</tr>
							<tr>
								<td>3</td><td>1人</td><td>2人</td><td>3人</td><td>1人</td><td>0人</td><td></td><td></td><td></td>
							</tr>
							<tr>
								<td>4</td><td>1人</td><td>2人</td><td>3人</td><td>1人</td><td>0人</td><td></td><td></td><td></td>
							</tr>
							<tr>
								<td>5</td><td>1人</td><td>2人</td><td>3人</td><td>1人</td><td>0人</td><td></td><td></td><td></td>
							</tr>
							<tr>
								<td>6</td><td>1人</td><td>2人</td><td>3人</td><td>1人</td><td>0人</td><td></td><td></td><td></td>
							</tr>
							<tr>
								<td>7</td><td>1人</td><td>2人</td><td>3人</td><td>1人</td><td>0人</td><td></td><td></td><td></td>
							</tr>
						</table>
						<div id="matrix" class="matrix"></div>
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
<script src="${basePath!''}/js/placeholder.js"></script>
<script src="${basePath!''}/js/echarts.min.js"></script>

<script type="text/javascript">
	$(function(){
		$('.export_report').hide();
		
		var myChart = echarts.init(document.getElementById('like_sub'));
		var myCharts = echarts.init(document.getElementById('matrix'));
		var option = {
		    // title : {
		    //     text: '某站点用户访问来源',
		    //     subtext: '纯属虚构',
		    //     x:'center'
		    // },
		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },
		    
		    series : [
		        {
		            name: '访问来源',
		            type: 'pie',
		            radius : '55%',
		            center: ['50%', '60%'],
		            data:[
		                {value:10, name:'选择英语'},
		                {value:30, name:'选择化学'},
		                {value:35, name:'选择数学'},
		                {value:25, name:'选择物理'}
		            ],
		            itemStyle: {
		                emphasis: {
		                    shadowBlur: 10,
		                    shadowOffsetX: 0,
		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
		                },
		                normal: {
	                        label: {
	                            show: true,
	                            position: 'top',
	                          	formatter: '{a} {c}%'
	                            // formatter: '{b}\n{c}'
	                        }
	                    }
		            }
		        }
		    ]
		};

		var options = {
		    // title: {
		    //     text: '世界人口总量',
		    //     subtext: '数据来自网络'
		    // },
		    color:['#00ada7'],
		    tooltip: {
		        trigger: 'axis',
		        axisPointer: {
		            type: 'shadow'
		        }
		    },
		    // legend: {
		    //     data: ['2011年', '2012年']
		    // },
		    grid: {
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis: {
		    	show:false,
		        // type: 'value',
		        max:100,
		        // boundaryGap: [0, 0.01]
		    },
		    yAxis: {
		        type: 'category',
		        data: ['1.非常不符合','2.比较不符合','3.不确定','4.比较符合','5.完全符合'],
		        nameTextStyle: {
		        	color:'#333',
		        	fontSize:16
		        },
		        nameGap:60
		    },
		    series: [
		        {
		            // name: '2011年',
		            type: 'bar',
		            data: [10, 12, 48, 17, 13,],
		            itemStyle: {
		                 normal: {
		                     label: {
		                         show: true,
		                         formatter: '{c} (%)',
		                         textStyle: {
		                             color: '#fff'
		                         }
		                     }
		                 }
		             }
		        }
		    ]
		};

		myChart.setOption(option);
		myCharts.setOption(options);
	})
	
	//返回列表页面
	function back_list(){
		window.location.href="${basePath!''}/evaluate/eva/list.htm";
	}
</script>
	
</body>
</html>