<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理-分析报告-个人</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/analysis_report_personal.css">
</head>
<body>
	
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' />


	<div class="content_contain">
		<div class="content">
			<#include '/common/left.ftl' />
			
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>测评管理&gt;分析报告</h3>
					</div>
					<p class="back fr" onClick="back_list()">返回</p>
				</div>

				<div class="some_content">
					<div class="export_report clearfix"><span>导出分析报告</span></div>
					<h2 class="report_title">广州市教育质量阳光评价调查问卷分析报告</h2>
					<div class="report_detail">
						<span>姓名：胡小哲</span>
						<span>学号：201509010023A01</span>
						<span>学校：广州市第二中学</span>
						<span>班级：八年级（1）班</span>
					</div>
					<div class="total_analysis">
						<h3 class="tit">综合得分分析</h3>
						<div class="show_pic clearfix">
							<div class="imgs fl"><img src="${basePath!''}/images/score.png"></div>
							<div id="analysis_pic" class="fl"></div>
						</div>
					</div>

					<div class="total_list">
						<h3 class="tit">评价维度和关键指标得分列表</h3>
						<table>
							<tr>
								<th>评价维度</th>
								<th>维度成绩</th>
								<th>关键指标</th>
								<th>指标得分</th>
								<th>总体得分</th>
								<th>个人得分率</th>
								<th>总体得分率</th>
							</tr>
							<tr>
								<td rowspan="4">品德与社会化水平</td>
								<td rowspan="4">90</td>
								<td>道德品质</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>社会责任</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>国家认同</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>国际理解</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>

							<tr>
								<td rowspan="3">身心发展水平</td>
								<td rowspan="3">60</td>
								<td>学会学习</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>知识技能方法</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>科技与人文素养</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>

							<tr>
								<td rowspan="3">学业发展水平</td>
								<td rowspan="3">60</td>
								<td>身体健康</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>心理健康</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>自我管理</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>


							<tr>
								<td rowspan="4">兴趣特长潜能</td>
								<td rowspan="4">60</td>
								<td>审美修养</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>爱好特长</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/down.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/down.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>实践能力</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>创新意识</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>

							<tr>
								<td rowspan="4">学业负担状况</td>
								<td rowspan="4">60</td>
								<td>学习时间</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>课业质量</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>课业难度</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>学习压力</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>

							<tr>
								<td rowspan="4">对学校的认同</td>
								<td rowspan="4">60</td>
								<td>文化认同</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>教学方式</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>师生关系</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
							<tr>
								<td>学校关系</td>
								<td>30</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div>	</td>
								<td>0.85</td>
								<td><div class="img">27	<img src="${basePath!''}/images/up.png" alt="">	</div></td>
							</tr>
						</table>
						<div class="explain">
							<span>说明：</span>
							<span><img src="${basePath!''}/images/up.png"> 高于该项分值</span>
							<span><img src="${basePath!''}/images/down.png"> 低于该项分值</span>
						</div>
					</div>

					<div class="total_grade">
						<h3 class="tit">维度成绩统计图</h3>
						<div id="pic"></div>
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
	var myChart = echarts.init(document.getElementById('pic'));
	var myCharts = echarts.init(document.getElementById('analysis_pic'));
	var option = {
	    title: {
	        // text: '未来一周气温变化',
	        // subtext: '纯属虚构'
	    },
	    tooltip: {
	        trigger: 'axis'
	    },
	    // legend: {
	    //     data:['最高气温','最低气温']
	    // },
	    toolbox: {
	        show: true,
	        feature: {
	            dataZoom: {
	                yAxisIndex: 'none'
	            },
	            dataView: {readOnly: false},
	            magicType: {type: ['line', 'bar']},
	            restore: {},
	            saveAsImage: {}
	        }
	    },
	    xAxis:  {
	        type: 'category',
	        boundaryGap: false,
	        data: ['道德与社会化水平','学业发展水平','身心发展水平','兴趣特长潜能','学业负担状况','对学校的认同']
	    },
	    yAxis: {
	        type: 'value',
	        axisLabel: {
	            formatter: '{value}'
	        }
	    },
	    series: [
	        {
	            // name:'最高气温',
	            type:'line',
	            data:[90, 60, 80, 85, 70, 65]
	            
	        }
	    ]
	};

	var options = {
	    // title: {
	    //     text: '基础雷达图'
	    // },
	    tooltip: {},
	    // legend: {
	    //     data: ['预算分配（Allocated Budget）', '实际开销（Actual Spending）']
	    // },
	    radar: {
	        // shape: 'circle',
	        indicator: [
	           { name: '兴趣特长潜能', max: 100},
	           { name: '学业负担状况', max: 100},
	           { name: '堆雪愛哦的认同', max: 100},
	           { name: '身心发展水平', max: 100},
	           { name: '学业发展水平', max: 100},
	           { name: '品德与社会化水平', max: 100}
	        ]
	    },
	    series: [{
	        // name: '预算 vs 开销（Budget vs spending）',
	        type: 'radar',
	        // areaStyle: {normal: {}},
	        data : [
	            {
	                value : [85, 70, 65, 80, 60, 90],
	                // name : '预算分配（Allocated Budget）'
	            }
	        ]
	    }]
	};

	myChart.setOption(option);
	myCharts.setOption(options);
	
	//返回
	function back_list(){
		window.location.href="${basePath!''}/evaluate/eva/list.htm?";
	}
</script>
	
</body>
</html>