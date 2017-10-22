<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>自适应测试-能力分析报告</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/ability_analysis.css">
</head>
<body>

	<!-- 引入公共头部 -->
<#include '/common/top.ftl' />
<input type="hidden" id="adaptationId" value="<#if vo??>${vo.id!''}</#if>"/>
	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c">
						<h3>自适应测试>能力值分析报告</h3>
					</div>
					<p class="back fr" onClick="javascript :history.back(-1);">返回上级</p>
				</div>

				<div class="export_report clearfix">
					<button>导出分析报告</button>
				</div>

				<#if vo?? && eauv??>
				<div class="content_mid">
					<div class="reduce">
						测验名称：<span>${vo.name!''}</span>
						测验学科：<span>${vo.bsv.name!''}</span>
						测验状态：<span><#if eauv.status=='0'>测试中</#if> <#if eauv.status=='1'>已完成测试</#if> <#if eauv.status=='2'>测试中止</#if></span>
						完成时间：<span>${eauv.answerFinalTime?string("yyyy-MM-dd HH:mm:ss")}</span>
					</div>
					<div class="drew clearfix">
						<div class="pic_one">
							综合评估:<span id="evaluation_span"></span>
						</div>
						<div class="pic_two" id="pic_two"></div>
					</div>

					<div class="knowledge">
						<h3 style="font-size: 15px;">知识能力掌握情况分析表</h3>
						<table>
							<tr class="tit">
								<td class="renzhi" rowspan="2">
									<div class="bias">
										<p class="p1">认知水平</p>
										<p class="p2">知识模块</p>
									</div>
								</td>
								<td rowspan="2">知道</td>
								<td rowspan="2">领会</td>
								<td rowspan="2">应用</td>
								<td rowspan="2">分析</td>
								<td rowspan="2">综合</td>
								<td rowspan="2">评价</td>
								<td colspan="2">知识模块掌握程度</td>
							</tr>
							<tr class="tit">
								<td>掌握程度</td><td>标识</td>
							</tr>
							<tbody id="report_tbody">
								<tr style="height: 150px;"><td colspan="9">正在生成报告，请稍等!</td></tr>
							</tbody>
						</table>
						<div class="explain">
							<i>说明：</i>
							<span class="first_span">×&nbsp;表示尚未掌握</span>
							<span>√&nbsp;表示已掌握</span>
							<span>-&nbsp;表示尚未考察</span>
							<span>?&nbsp;表示有待进一步考察</span>
						</div>
					</div>
				</div>
				<#else>
					<div class="content_mid">
						<h1 class="tips_msg"><img src="/edu_site/images/no-content.png"><br>系统无法为您匹配到此次测试报告内容！！！</h1>
					</div>
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
	<script src="${basePath!''}/js/echarts.min.js"></script>
	<script type="text/javascript">
	
	
		$(function(){
			$('.klass').on('click',function(){
				$(this).find('i').toggleClass('close');
				$(this).next('ul').toggle();
			})

			$('.student').on('click','li',function(){
				$('.student li').removeClass('active');
				$(this).addClass('active');
			})
			
			
			loadExamAdaptationReport();
			
			function loadExamAdaptationReport(){
			
				if($('#adaptationId').val()!=''){
				
					$.ajax({  
			          type:'get',  
			          url:'${basePath!''}/exam/adaptation/report/get.htm',  
			          data:{'adaptationId':$('#adaptationId').val()},
			          success:function(data){  
			          
			          	  $('#report_tbody').empty();
			          	  
			          	  var html = "";
			          	  
			          	  if(data.earvo.earvs.length > 0){
			          	  	for(var i=0;i<data.earvo.earvs.length;i++){
				          	  	html +='<tr>';
								html +='<td>'+data.earvo.earvs[i].bkv.name+'</td>';
								html +='<td>'+data.earvo.earvs[i].bloom1+'</td>';
								html +='<td>'+data.earvo.earvs[i].bloom2+'</td>';
								html +='<td>'+data.earvo.earvs[i].bloom3+'</td>';
								html +='<td>'+data.earvo.earvs[i].bloom4+'</td>';
								html +='<td>'+data.earvo.earvs[i].bloom5+'</td>';
								html +='<td>'+data.earvo.earvs[i].bloom6+'</td>';
								html +='<td>'+(data.earvo.earvs[i].masterProgram*100).toFixed(2)+'%</td>';
								html +='<td>'+data.earvo.earvs[i].ident+'</td>';
								html +='</tr>';
				          	}
				          	
				          	html +='<tr>';
							html +='<td>综合评估</td>';
							html +='<td>'+(parseFloat(data.earvo.bloom1)).toFixed(2)+'%</td>';
							html +='<td>'+(parseFloat(data.earvo.bloom2)).toFixed(2)+'%</td>';
							html +='<td>'+(parseFloat(data.earvo.bloom3)).toFixed(2)+'%</td>';
							html +='<td>'+(parseFloat(data.earvo.bloom4)).toFixed(2)+'%</td>';
							html +='<td>'+(parseFloat(data.earvo.bloom5)).toFixed(2)+'%</td>';
							html +='<td>'+(parseFloat(data.earvo.bloom6)).toFixed(2)+'%</td>';
							html +='<td>'+(data.earvo.masterProgram*100).toFixed(2)+'%</td>';
							html +='<td>'+data.earvo.ident+'</td>';
							html +='</tr>';
							
							$('#evaluation_span').html(data.earvo.ident);
							
			          	  }else{
			          	  	html += '<tr style="height: 150px;"><td colspan="9">未找到自适应测试报告内容!</td></tr>';
			          	  }
			          	  
			          	  $('#report_tbody').append(html);
			          	  
			          	  loadExamAdaptationReportChart(data.indicator,data.value);
			          	  
			          }  
			    	});  
			    	
		    	}else{
		    		alert('系统无法为您匹配到此次测试报告内容');
		    	}
			
			}
			
			
			function loadExamAdaptationReportChart(indicator,value){
			
				
				var myChart = echarts.init(document.getElementById('pic_two'));
				option = {
				    
				    tooltip: {},
				    radar: {
				        name:{
				        	textStyle:{
				        		color:['#95d3d1']
				        	}
				        },
				        indicator: indicator
				    },
				    series: [{
				        name: '预算 vs 开销（Budget vs spending）',
				        type: 'radar',
				        label: {
	                        normal: {
	                            show: true,
	                            formatter:function(params) {
	                                return params.value;
	                            }
	                        }
	                    },
				        data : [
				            {
				                value : value,
				                name : '预算分配（Allocated Budget）',
				                areaStyle: {
			                        normal: {
			                            opacity: 0.9,
			                            color: new echarts.graphic.RadialGradient(0.5, 0.5, 1, [
			                                {
			                                    color: '#B8D3E4',
			                                    offset: 0
			                                },
			                                {
			                                    color: '#72ACD1',
			                                    offset: 1
			                                }
			                            ])
			                        }
			                    }
				            }
				        ]
				    }]
				};
	
				myChart.setOption(option);
			
			}

			
		})
	</script>
	
</body>
</html>