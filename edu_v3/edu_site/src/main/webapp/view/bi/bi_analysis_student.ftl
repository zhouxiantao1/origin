<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>统计分析-学生</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/analysis_city.css">
</head>
<body>
	<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>统计分析>分析报告</h3>
					</div>
					<p class="back fr"><a href="javascript:history.back(-1)">返回上级</a></p>
				</div>
				
				<div class="container">
					<div class="grade_show">
						<!--<div class="export clearfix"><button class="fr">导出分析报告</button></div>-->
						<h2 class="grade_name">${examInfoVo.examName}个人分析诊断报告</h2>
						<div class="grade_type">
							<span><#if examInfoVo.examMethod == "0">线上考试<#else>线下考试</#if></span>
							<span><#if examInfoVo.examType == "1">单元考<#elseif examInfoVo.examType == "2">月考<#elseif examInfoVo.examType == "3">期中考<#elseif examInfoVo.examType == "4">期末考<#else>市级考试</#if></span>
							<span>年级：${examInfoVo.bgv.name}</span>
							<span>报告范围：个人</span>
						</div>
					</div>

					<div class="report clearfix">
						<!-- 左侧导航 -->
						<div class="report_list fl">
							<p class="title">自定义报告（勾选所需报告内容）</p>
							<p class="nav">报告导航</p>
							<ul>
								<li>
									<label  idx='1' class="part_father"><input checked type="checkbox" name=""><span>1 考试概况分析</span></label>
									<ul>
										<li><label idx='11'><input type="checkbox" checked name=""><span>1.1 各科考试概况</span></label></li>
										<li><label idx='12'><input type="checkbox" checked name=""><span>1.2 常模分数</span></label></li>
										<li><label idx='13'><input type="checkbox" checked name=""><span>1.3 科学课优劣势分析</span></label></li>
										
									</ul>
								</li>
								<li>
									<label idx='2' class="part_father"><input type="checkbox" name=""><span>2 各科成绩详细分析</span></label>
									<ul>
										<#if biStudentSurveyMap??>
											<#list biStudentSurveyMap as bssm>
								                <li>
													<label idx='2${bssm_index +1}' class="part_father"><input type="checkbox" name=""><span>2.${bssm_index +1} ${bssm.subject_name!''}学科分析</span></label>
													<ul>
														<li><label idx='2${bssm_index +1}1'><input type="checkbox" name=""><span>2.${bssm_index +1}.1 各知识模块掌握情况分析</span></label></li>
														<li><label idx='2${bssm_index +1}2'><input type="checkbox" name=""><span>2.${bssm_index +1}.2 各题型得分情况分析</span></label></li>
														<li><label idx='2${bssm_index +1}3'><input type="checkbox" name=""><span>2.${bssm_index +1}.3 各认知层次得分情况分析</span></label></li>
													</ul>
												</li>
							                </#list>
						                </#if>
									</ul>
								</li>
								
							</ul>
						</div>

						<!-- 内容区域  -->
						<div class="show_report fr">

							<!-- 第一章节 -->
							<div id="part1">
								<h2>1.学生考试概况分析</h2>
								<div class="part_content" id="part11">
									<h3>1.1 各科考试概况</h3>
							        <p>根据学生梁君贤在2016广州市学业统考中的表现，梁君贤在本次考试中的总分及各科的成绩如表1所示，与所在班级、学校、所属区域及全市的平均分相比，除数学外，各科成绩均高于全校平均分、全区平均分和全市平均分。 </p>
							        <p class="tip">表1学生各科考试分数汇总表</p>
							        <table class="max-table">
							            <tbody>
							            <tr class="max-bg-blue">
							                <td rowspan="2">科目</td>
							                <td colspan="2">个人情况</td>
							                <td colspan="8">总体对比</td>
							                <td rowspan="2">满分值</td>
							            </tr>
							            <tr class="max-bg-blue">
							                <td>原始分</td>
							                <td>得分率</td>
							                <td colspan="2">班级均分</td>
							                <td colspan="2">全校均分</td>
							                <td colspan="2">全区均分</td>
							                <td colspan="2">全市均分</td>
							            </tr>
							            <#if biStudentSurveyMap??>
											<#list biStudentSurveyMap as bssm> 
								                <tr>
								                    <td class="max-bg-blue">${bssm.subject_name!''}</td>
									                <td>${bssm.original_score!''}</td>
									                <td>${bssm.scoring_rate!''}</td>
									                <td>${bssm.class_average!''}</td>
									                <td><#if bssm.is_high_class_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
									                <td>${bssm.school_average!''}</td>
									                <td><#if bssm.is_high_school_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
									                <td>${bssm.region_average!''}</td>
									                <td><#if bssm.is_high_region_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
									                <td>${bssm.city_average!''}</td>
									                <td><#if bssm.is_high_city_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
									                <td>${bssm.full_score!''}</td>
								                </tr>
							                </#list>
						                </#if>
							            </tbody>
							        </table>
								</div>

								<div class="part_content" id="part12">
									<h3>1.2  常模分数 </h3>
							        <p>下表是学生在总分和各学科上的原始分及常模分数。其中，标准分是对原始分进行统计学线性转换后的分数，
							            在满分值相同的科目之间具有等价性，可以直接进行对比。百分位数代表学生在全市考生中的相对位置，
							            代表该学生的成绩高于全市学生的百分比例。由下表可知，该生语文、英语、物理、化学均高于全市90%的学生，
							            生物高于全市78.81%的学生，数学仅高于全市67.48%的学生。 </p>
							        <p class="tip">表2 学生各科常模分数对照表</p>
							        <table class="max-table">
							            <tbody>
							            <tr class="max-bg-blue">
							                <td rowspan="2">科目</td>
							                <td rowspan="2">原始分</td>
							                <td colspan="2">常模分数</td>
							            </tr>
							            <tr class="max-bg-blue">
							                <td>标准分</td>
							                <td>百分位数</td>
							            </tr>
							             <#if biStudentSurveyMap??>
											<#list biStudentSurveyMap as bssm> 
								                <tr>
									                <td class="max-bg-blue">${bssm.subject_name!''}</td>
									                <td>${bssm.original_score!''}</td>
									                <td>${bssm.standard_score!''}</td>
									                <td>${bssm.percentile!''}</td>
								                </tr>
							                </#list>
						                </#if>
							            </tbody>
							        </table>
								</div>
								<div class="part_content" id="part13">
									<h3>1.3 各学科优劣势分析</h3>
							        <p>从下图中该生在各科相对优劣势雷达图可知，语文、化学、英语、物理是该生的优势学科，数学和生物是该生的弱势学科。
							            在学习时应该注意合理分配各学科学习时间，均衡发展。 </p>
							        <!--<h2 style="text-align: center;margin-bottom: 10px;">该生各科相对优劣势雷达图</h2>-->
							        <div id="chart_1" class="chart_1"></div>
							        <p class="tip">图1 该生各科相对优劣势雷达图</p>
        							<p class="tip">注：图中各科相对优劣势数据采用学生各科在总体中的百分位数</p>
								</div>
							</div>
							<#assign opt = 1 >
							<!-- 第二章节 -->
							<div id="part2">
							<h2>2.各科成绩详细分析</h2>
							<#if biStudentSurveyMap??>
								<#list biStudentSurveyMap as bssm>
									<div class="yuwen" id="part2${bssm_index +1}">
										<h3>2.${bssm_index +1} ${bssm.subject_name!''}</h3>
										<div class="yuwen_1" id="part2${bssm_index +1}1">
											<h4>2.${bssm_index +1}.1 各知识模块掌握情况分析</h4>
											<p class="tip">表3 ${bssm.subject_name!''}各知识模块得分分析</p>
											<table class="max-table">
												<tbody>
												<tr class="max-bg-blue">
													<td rowspan="2">知识模块</td>
													<td colspan="2">个人情况</td>
													<td colspan="8">总体对比</td>
													<td rowspan="2">满分值</td>
												</tr>
												<tr class="max-bg-blue">
													<td>分数</td>
													<td>得分率</td>
													<td colspan="2">班级均分</td>
													<td colspan="2">全校均分</td>
													<td colspan="2">全区均分</td>
													<td colspan="2">全市均分</td>
												</tr>
												<#if biStudentPointMap??>
													<#list biStudentPointMap as bspm>
														<#if bspm.subject_id = bssm.subject_id>
															<tr>
																<td class="max-bg-blue">${bspm.point_name}</td>
																<td>${bspm.score}</td>
																<td>${bspm.scoring_rate}</td>
																<td>${bspm.class_average}</td>
																<td><#if bspm.is_high_class_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bspm.school_average}</td>
																<td><#if bspm.is_high_school_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bspm.region_average}</td>
																<td><#if bspm.is_high_region_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bspm.city_average}</td>
																<td><#if bspm.is_high_city_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bspm.full_score}</td>
															</tr>
														</#if>
													</#list>
												</#if>
												</tbody>
											</table>
											<#assign opt = opt + 1 >
											<div id="chart_${opt}" class="chart_${opt}"></div>
											<p class="tip">图2 ${bssm.subject_name!''}各知识模块得分率对比图</p>
										</div>
										<div class="yuwen_2" id="part2${bssm_index +1}2">
											<h4>2.${bssm_index +1}.2 各题型得分情况分析</h4>
											<p class="tip">表4 ${bssm.subject_name!''}各题型得分分析</p>
											<table class="max-table">
												<tbody>
												<tr class="max-bg-blue">
													<td rowspan="2">题型</td>
													<td colspan="2">个人情况</td>
													<td colspan="8">总体对比</td>
													<td rowspan="2">满分值</td>
												</tr>
												<tr class="max-bg-blue">
													<td>分数</td>
													<td>得分率</td>
													<td colspan="2">班级均分</td>
													<td colspan="2">全校均分</td>
													<td colspan="2">全区均分</td>
													<td colspan="2">全市均分</td>
												</tr>
												<#if biStudentQuestionTypeMap??>
													<#list biStudentQuestionTypeMap as bsqtm>
														<#if bsqtm.subject_id = bssm.subject_id>
															<tr>
																<td class="max-bg-blue">${bsqtm.type_name}</td>
																<td>${bsqtm.score}</td>
																<td>${bsqtm.scoring_rate}</td>
																<td>${bsqtm.class_average}</td>
																<td><#if bsqtm.is_high_class_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bsqtm.school_average}</td>
																<td><#if bsqtm.is_high_school_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bsqtm.region_average}</td>
																<td><#if bsqtm.is_high_region_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bsqtm.city_average}</td>
																<td><#if bsqtm.is_high_city_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bsqtm.full_score}</td>
															</tr>
														</#if>
													</#list>
												</#if>
												</tbody>
											</table>
											<#assign opt = opt + 1 >
											<div id="chart_${opt}" class="chart_${opt}"></div>
											<p class="tip">图3 ${bssm.subject_name!''}各题型得分率对比图</p>
										</div>
										<div class="yuwen_3" id="part2${bssm_index +1}3">
											<h4>2.${bssm_index +1}.3 各认知层次得分情况分析</h4>
											<p class="tip">表5 ${bssm.subject_name!''}各认知层次得分分析</p>
											<table class="max-table">
												<tbody>
												<tr class="max-bg-blue">
													<td rowspan="2">认知层次</td>
													<td colspan="2">个人情况</td>
													<td colspan="8">总体对比</td>
													<td rowspan="2">满分值</td>
												</tr>
												<tr class="max-bg-blue">
													<td>分数</td>
													<td>得分率</td>
													<td colspan="2">班级均分</td>
													<td colspan="2">全校均分</td>
													<td colspan="2">全区均分</td>
													<td colspan="2">全市均分</td>
												</tr>
												<#if biStudentAbilityMap??>
													<#list biStudentAbilityMap as bsam>
														<#if bsam.subject_id = bssm.subject_id>
															<tr>
																<td class="max-bg-blue">${bsam.ability_name}</td>
																<td>${bsam.score}</td>
																<td>${bsam.scoring_rate}</td>
																<td>${bsam.class_average}</td>
																<td><#if bsam.is_high_class_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bsam.school_average}</td>
																<td><#if bsam.is_high_school_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bsam.region_average}</td>
																<td><#if bsam.is_high_region_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bsam.city_average}</td>
																<td><#if bsam.is_high_city_average == "0"><img src="${basePath!''}/images/down.png" alt=""><#else><img src="${basePath!''}/images/up.png" alt=""></#if></td>
																<td>${bsam.full_score}</td>
															</tr>
														</#if>
													</#list>
												</#if>
												</tbody>
											</table>
											<#assign opt = opt + 1 >
											<div id="chart_${opt}" class="chart_${opt}"></div>
											<p class="tip">图4 ${bssm.subject_name!''}各认知层次得分率对比图</p>
										</div>
									</div>
									
								</#list>
							</#if>
							</div>
						</div>
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

		var checkLabel = $('.report_list label');
		var checkInput = checkLabel.find('input');
		//左侧菜单 控制右侧显示
		checkLabel.on('click',function(){
			var self = $(this);
			if($(this).hasClass('part_father')){
				if($(this).children('input').prop('checked') == true){
					$(this).next('ul').find(':checkbox').prop('checked',true);
					var allIdx = $(this).next('ul').find('label');
					var thisIdx = $(this).attr('idx');

					$('#part' + thisIdx).show();
					allIdx.each(function(index,item){
						var count = $(this).attr('idx');
						$('#part' + count).show();
					})
					
				}else{
					$(this).next('ul').find(':checkbox').prop('checked',false);
					var allIdx = $(this).next('ul').find('label');
					var thisIdx = $(this).attr('idx');
					console.log(thisIdx)
					$('#part' + thisIdx).hide();

					allIdx.each(function(index,item){
						var count = $(this).attr('idx');
						$('#part' + count).hide();
					})
				}
			}else{
				if(self.children('input').prop('checked') == true){
					var idx = self.attr('idx');
					$('#part' + idx).show();
				}else{
					var idx = self.attr('idx');
					console.log(idx);
					$('#part' + idx).hide();
				}
			}
				

		})

		

		$.ajax({  
	          type:'get',  
	          url:'${basePath!''}/bi/analysis/ajaxQueryAnalysisReport.htm',  
	          data:{'examId':43,'classId':$('#classId').val()},
	          success:function(data){
				var def = new Array();
				var indicator = new Array();
				var chart_num = new Array();
				if(data.biStudentSurveyMap.length > 0){
	          	  	for(var i=0;i<data.biStudentSurveyMap.length*3+1;i++){
	          	  		var temp = "chart_"+(i+1);
	          	  		window[temp] = echarts.init(document.getElementById(temp));
	          	  		chart_num[i] = window[temp];
	          	  		console.log(window[temp]);
	          	  	}
	          	}
				if(data.biStudentSurveyMap.length > 0){
	          	  	for(var i=0;i<data.biStudentSurveyMap.length;i++){
	          	  		if(data.biStudentSurveyMap[i].subject_id != '-999'){
	          	  			def[i] = data.biStudentSurveyMap[i].original_score;
	          	  			indicator[i] = { text:data.biStudentSurveyMap[i].name, max: 150 };
	          	  		}
	          	  	}
			    }
				var chart_1_option = {
					color:['rgb(79,129,189)'],
					radar: [
						{
							indicator: indicator,
							center: ['50%', '50%'],
							radius: 120
						}
					],
					series: [
						{
							name: '成绩单',
							type: 'radar',
							data: [
								{
									value: def,
									name: '梁君贤',
									label: {
										normal: {
											show: true,
											formatter:function(params) {
												return params.value;
											}
										}
									}
								},
							]
						}
					]
				}
				chart_1.setOption(chart_1_option);
				
				var chart_index = 1;//下标
				if(data.biStudentSurveyMap.length > 0){
					for(var i=0;i<data.biStudentSurveyMap.length;i++){
						var point_name = new Array();
						var student_rate = new Array();
						var school_rate = new Array();
						var region_rate = new Array();
						var city_rate = new Array();
						var index = 0;//下标
						for(var j=0;j<data.biStudentPointMap.length;j++){
							if(data.biStudentSurveyMap[i].subject_id == data.biStudentPointMap[j].subject_id){
								point_name[index] = data.biStudentPointMap[j].point_name;
								student_rate[index] = data.biStudentPointMap[j].scoring_rate;
								school_rate[index] = data.biStudentPointMap[j].school_average;
								region_rate[index] = data.biStudentPointMap[j].region_scoring_rate;
								city_rate[index] = data.biStudentPointMap[j].city_scoring_rate;
								index++;
							}
						}
						chart_index++;
						var temp_option = "chart_"+chart_index+"_option";
						window[temp_option] = {
							title: {
				
							},
							tooltip: {
								trigger: 'axis'
							},
							legend: {
								orient:'vertical',
								top:'center',
								right:0,
								data: ['该生','全校','全区','全市']
							},
							grid: {
								left: '3%',
								right: 80,
								bottom: '3%',
								containLabel: true
							},
							toolbox: {
								feature: {
									saveAsImage: {}
								}
							},
							xAxis: {
								type: 'category',
								nameLocation:'middle',
								data: point_name,
				
							},
							yAxis: {
								type: 'value'
							},
							series: [
								{
									name:'该生',
									type:'line',
									color:['rgb(79,129,189)'],
									symbol:'diamond',
									symbolSize:15,
									data:student_rate
								},
								{
									name:'全校',
									type:'line',
									color:['rgb(192,80,77)'],
									symbol:'rect',
									symbolSize:15,
									data:school_rate
								},
								{
									name:'全区',
									type:'line',
									color:['rgb(155,187,89)'],
									symbol:'triangle',
									symbolSize:15,
									data:region_rate
								},
								{
									name:'全市',
									type:'line',
									color:['rgb(128,100,162)'],
									symbol:'pin',
									symbolSize:15,
									data:city_rate
								}
							]
						}
						chart_num[chart_index-1].setOption(window[temp_option]);
						
						var type_name = new Array();
						var student_type_rate = new Array();
						var school_type_rate = new Array();
						var region_type_rate = new Array();
						var city_type_rate = new Array();
						var index = 0;//下标
						for(var j=0;j<data.biStudentQuestionTypeMap.length;j++){
							if(data.biStudentSurveyMap[i].subject_id == data.biStudentQuestionTypeMap[j].subject_id){
								type_name[index] = data.biStudentQuestionTypeMap[j].type_name;
								student_type_rate[index] = data.biStudentQuestionTypeMap[j].scoring_rate;
								school_type_rate[index] = data.biStudentQuestionTypeMap[j].school_average;
								region_type_rate[index] = data.biStudentQuestionTypeMap[j].region_scoring_rate;
								city_type_rate[index] = data.biStudentQuestionTypeMap[j].city_scoring_rate;
								index++;
							}
						}
						chart_index++;
						temp_option = "chart_"+chart_index+"_option";
						window[temp_option] = {
							tooltip: {
								trigger: 'axis'
							},
							legend: {
								orient:'vertical',
								top:'center',
								right:0,
								data: ['该生','全校','全区','全市']
							},
							grid: {
								left: '3%',
								right: 80,
								bottom: '3%',
								containLabel: true
							},
							toolbox: {
								feature: {
									saveAsImage: {}
								}
							},
							xAxis: {
								type: 'category',
								nameLocation:'middle',
								data: type_name
							},
							yAxis: {
								type: 'value'
							},
							series: [
								{
									name:'该生',
									type:'line',
									color:['rgb(79,129,189)'],
									symbol:'diamond',
									symbolSize:15,
									data:student_type_rate
								},
								{
									name:'全校',
									type:'line',
									color:['rgb(192,80,77)'],
									symbol:'rect',
									symbolSize:15,
									data:school_type_rate
								},
								{
									name:'全区',
									type:'line',
									color:['rgb(155,187,89)'],
									symbol:'triangle',
									symbolSize:15,
									data:region_type_rate
								},
								{
									name:'全市',
									type:'line',
									color:['rgb(128,100,162)'],
									symbol:'pin',
									symbolSize:15,
									data:city_type_rate
								}
							]
						}
						chart_num[chart_index-1].setOption(window[temp_option]);
						
						var ability_name = new Array();
						var student_ability_rate = new Array();
						var school_ability_rate = new Array();
						var region_ability_rate = new Array();
						var city_ability_rate = new Array();
						var index = 0;//下标
						for(var j=0;j<data.biStudentAbilityMap.length;j++){
							if(data.biStudentSurveyMap[i].subject_id == data.biStudentAbilityMap[j].subject_id){
								ability_name[index] = data.biStudentAbilityMap[j].ability_name;
								student_ability_rate[index] = data.biStudentAbilityMap[j].scoring_rate;
								school_ability_rate[index] = data.biStudentAbilityMap[j].school_average;
								region_ability_rate[index] = data.biStudentAbilityMap[j].region_scoring_rate;
								city_ability_rate[index] = data.biStudentAbilityMap[j].city_scoring_rate;
								index++;
							}
						}
						chart_index++;
						temp_option = "chart_"+chart_index+"_option";
						window[temp_option] = {
							tooltip: {
								trigger: 'axis'
							},
							legend: {
								orient:'vertical',
								top:'center',
								right:0,
								data: ['该生','全校','全区','全市']
							},
							grid: {
								left: '3%',
								right: 80,
								bottom: '3%',
								containLabel: true
							},
							toolbox: {
								feature: {
									saveAsImage: {}
								}
							},
							xAxis: {
								type: 'category',
								nameLocation:'middle',
								data: ability_name
							},
							yAxis: {
								type: 'value'
							},
							series: [
								{
									name:'该生',
									type:'line',
									color:['rgb(79,129,189)'],
									symbol:'diamond',
									symbolSize:15,
									data:student_ability_rate
								},
								{
									name:'全校',
									type:'line',
									color:['rgb(192,80,77)'],
									symbol:'rect',
									symbolSize:15,
									data:school_ability_rate
								},
								{
									name:'全区',
									type:'line',
									color:['rgb(155,187,89)'],
									symbol:'triangle',
									symbolSize:15,
									data:region_ability_rate
								},
								{
									name:'全市',
									type:'line',
									color:['rgb(128,100,162)'],
									symbol:'pin',
									symbolSize:15,
									data:city_ability_rate
								}
							]
						}
						chart_num[chart_index-1].setOption(window[temp_option]);
						
					}
				}
		    
	    	}
		});
		


	})

</script>

</body>
</html>