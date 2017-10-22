<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>统计分析-市级</title>
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
						<!-- <div class="export clearfix"><button class="fr">导出分析报告</button></div> -->
						<h2 class="grade_name">2016年广州市学业考试市级分析诊断报告</h2>
						<!-- <div class="grade_type">
							<span>线上考试</span>
							<span>市级考试</span>
							<span>年级：高二</span>
							<span>报告范围：天河区</span>
						</div> -->
					</div>

					<div class="report clearfix">
						<!-- 左侧导航 -->
						<div class="report_list fl">
							<p class="title">自定义报告（勾选所需报告内容）</p>
							<p class="nav">报告导航</p>
							<ul>
								<li>
									<label idx='1' class="part_father"><input checked type="checkbox" name=""><span>1 考试概况分析</span></label>
									<ul>
										<li><label idx='11'><input checked type="checkbox" name=""><span>1.1 试卷质量分析</span></label></li>
										<li><label idx='12'><input checked  type="checkbox" name=""><span>1.2 考试基本情况</span></label></li>
										<li><label idx='13'><input  checked type="checkbox" name=""><span>1.3 各水平等级学生分析</span></label></li>
										<li><label idx='14'><input checked  type="checkbox" name=""><span>1.4 各校考试情况分析</span></label></li>
									</ul>
								</li>

								<li>
									<label idx='2' class="part_father"><input type="checkbox" name=""><span>2 语文学科分析</span></label>
									<ul>
										<li>
											<label idx='21'  class="part_father"><input type="checkbox" name=""><span>2.1 命题质量分析</span></label>
											<ul>
												<li><label idx='211'><input type="checkbox" name=""><span>2.1.1 全卷质量分析</span></label></li>
												<li><label idx='212'><input type="checkbox" name=""><span>2.1.2 各实体详细分析</span></label></li>
												<li><label idx='212'><input type="checkbox" name=""><span>2.1.3 各认知层次得分情况分析</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='22'  class="part_father"><input type="checkbox" name=""><span>2.2 学科得分分析</span></label>
											<ul>
												<li><label idx='221'><input type="checkbox" name=""><span>2.2.1 各知识点得分情况</span></label></li>
												<li><label idx='222'><input type="checkbox" name=""><span>2.2.2 各任职层次得分情况</span></label></li>
												<li><label idx='223'><input type="checkbox" name=""><span>2.2.3 各题得分情况</span></label></li>
												<li><label idx='224'><input type="checkbox" name=""><span>2.2.4 各区得分情况</span></label></li>
											</ul>
										</li>
										
									</ul>
								</li>

								<li>
									<label idx='3' class="part_father"><input type="checkbox" name=""><span>3 数学学科分析</span></label>
									<ul>

										<li>
											<label idx='31'  class="part_father"><input type="checkbox" name=""><span>3.1 命题质量分析</span></label>
											<ul>
												<li><label idx='311'><input type="checkbox" name=""><span>3.1.1 全卷质量分析</span></label></li>
												<li><label idx='312'><input type="checkbox" name=""><span>3.1.2 各试题详细分析</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='32'  class="part_father"><input type="checkbox" name=""><span>3.2 学科得分分析</span></label>
											<ul>
												<li><label idx='321'><input type="checkbox" name=""><span>3.2.1 各知识点得分情况</span></label></li>
												<li><label idx='322'><input type="checkbox" name=""><span>3.2.2 各认知层次得分情况</span></label></li>
												<li><label idx='323'><input type="checkbox" name=""><span>3.2.3 各题得分情况</span></label></li>
												<li><label idx='324'><input type="checkbox" name=""><span>3.2.4 各区得分情况</span></label></li>
											</ul>

										</li>
									</ul>
								</li>

								<li>
									<label idx='4' class="part_father"><input type="checkbox" name=""><span>4 英语学科分析</span></label>
									<ul>
										
										<li>
											<label idx='41'><input type="checkbox" name=""><span>4.1 命题质量分析</span></label>
											<ul>
												<li><label idx='411'><input type="checkbox" name=""><span>4.1.1 全卷质量分析</span></label></li>
												<li><label idx='412'><input type="checkbox" name=""><span>4.1.2 各实体详细分析</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='42'><input type="checkbox" name=""><span>4.2 学科的分分析</span></label>
											<ul>
												<li><label idx='421'><input type="checkbox" name=""><span>4.2.1 各知识点得分情况</span></label></li>
												<li><label idx='422'><input type="checkbox" name=""><span>4.2.2 各认知层次得分情况</span></label></li>
												<li><label idx='423'><input type="checkbox" name=""><span>4.2.3 各题得分情况</span></label></li>
												<li><label idx='424'><input type="checkbox" name=""><span>4.2.4 各区得分情况</span></label></li>
											</ul>
										</li>
									</ul>
								</li>
								<li>
									<label idx='5' class="part_father"><input type="checkbox" name=""><span>5 物理学科分析</span></label>
									<ul>
										
										<li>
											<label idx='51'><input type="checkbox" name=""><span>5.1 命题质量分析</span></label>
											<ul>
												<li><label idx='511'><input type="checkbox" name=""><span>5.1.1 全卷质量分析</span></label></li>
												<li><label idx='512'><input type="checkbox" name=""><span>5.1.2 各实体详细分析</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='52'><input type="checkbox" name=""><span>5.2 学科的分分析</span></label>
											<ul>
												<li><label idx='521'><input type="checkbox" name=""><span>5.2.1 各知识点得分情况</span></label></li>
												<li><label idx='522'><input type="checkbox" name=""><span>5.2.2 各认知层次得分情况</span></label></li>
												<li><label idx='523'><input type="checkbox" name=""><span>5.2.3 各题得分情况</span></label></li>
												<li><label idx='524'><input type="checkbox" name=""><span>5.2.4 各区得分情况</span></label></li>
											</ul>
										</li>
									</ul>
								</li>
								<li>
									<label idx='6' class="part_father"><input type="checkbox" name=""><span>6 化学学科分析</span></label>
									<ul>
										
										<li>
											<label idx='61'><input type="checkbox" name=""><span>6.1 命题质量分析</span></label>
											<ul>
												<li><label idx='611'><input type="checkbox" name=""><span>6.1.1 全卷质量分析</span></label></li>
												<li><label idx='612'><input type="checkbox" name=""><span>6.1.2 各实体详细分析</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='62'><input type="checkbox" name=""><span>6.2 学科的分分析</span></label>
											<ul>
												<li><label idx='621'><input type="checkbox" name=""><span>6.2.1 各知识点得分情况</span></label></li>
												<li><label idx='622'><input type="checkbox" name=""><span>6.2.2 各认知层次得分情况</span></label></li>
												<li><label idx='623'><input type="checkbox" name=""><span>6.2.3 各题得分情况</span></label></li>
												<li><label idx='624'><input type="checkbox" name=""><span>6.2.4 各区得分情况</span></label></li>
											</ul>
										</li>
									</ul>
								</li>
								<li>
									<label idx='7' class="part_father"><input type="checkbox" name=""><span>7 生物学科分析</span></label>
									<ul>
										
										<li>
											<label idx='71'><input type="checkbox" name=""><span>7.1 命题质量分析</span></label>
											<ul>
												<li><label idx='711'><input type="checkbox" name=""><span>7.1.1 全卷质量分析</span></label></li>
												<li><label idx='712'><input type="checkbox" name=""><span>7.1.2 各实体详细分析</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='72'><input type="checkbox" name=""><span>7.2 学科的分分析</span></label>
											<ul>
												<li idx='721'><label><input type="checkbox" name=""><span>7.2.1 各知识点得分情况</span></label></li>
												<li><label idx='722'><input type="checkbox" name=""><span>7.2.2 各认知层次得分情况</span></label></li>
												<li><label idx='723'><input type="checkbox" name=""><span>7.2.3 各题得分情况</span></label></li>
												<li><label idx='724'><input type="checkbox" name=""><span>7.2.4 各区得分情况</span></label></li>
											</ul>
										</li>
									</ul>
								</li>
								<li>
									<label  idx='8'><input type="checkbox" name=""><span>附录</span></label>
								</li>
							</ul>

						</div>

						<!-- 内容区域  -->
						<div class="show_report fr">

							<!-- 第一章节 -->
							<div id="part1">
								<h2>1.考试概况分析</h2>
								<div class="part_content" id="part11">
									<h3>1.1各科考试概况</h3>
									<p>2016年广州市学业考试的六个科目的试卷难度、区分度、信度如表1所示。其中，难度表示试卷的难易程度，难度值越高表示该学科试卷越简单；区分度表示该学科试卷有效低鉴别能力高和能力低的考生的程度，数值越高表示该学科的区分能力越强；信度是反映考试一致性程度的指标，数值越高代表试卷的信度越好。</p>

									<!--1.1 表1-->
						            <div id="biao1" class="reportTable">
						                <p class="tacenter">表1 各科试卷质量分析</p>
						                <table class="max-table">
							                <tbody>
							                <tr class="max-bg-blue">
							                    <td>学科</td>
							                    <td>难度</td>
							                    <td>区分度</td>
							                    <td>信度</td>
							                </tr>
							               	 <#if biCitySurveyVoMap??>
													<#list biCitySurveyVoMap as bcsv> 
										                <tr>
										                    <td class="max-bg-blue">${bcsv.subject_name!''}</td>
										                    <td>0.60</td>
										                    <td>0.21</td>
										                    <td>0.72</td>
										                </tr>
									                </#list>
								                </#if>
							               </tbody>
							            </table>
						            </div>
								</div>

								<div class="reportTable" id="part12">
						            <h3>1.2 各水平等级学生分布</h3>
						            <p>广州市天河区高三年级共1486人参加了2016年广州市学业考试，全市在本次考试中的表现，如表2所示。</p>
						            <p class="tacenter">表2天河区各科分数汇总表</p>
						            <table class="max-table">
						                <tbody>
						                <tr class="max-bg-blue">
						                    <td>学科</td>
						                    <td>实考人数</td>
						                    <td>平均分</td>
						                    <td>标准差</td>
						                    <td>最高分</td>
						                    <td>最低分</td>
						                    <td colspan="2">市均分</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">总分</td>
						                    <td>1486</td>
						                    <td>437.89</td>
						                    <td>86.21</td>
						                    <td>647.5</td>
						                    <td>160</td>
						                    <td>472.30</td>
						                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">语文</td>
						                    <td>1486</td>
						                    <td>91.14</td>
						                    <td>12.53</td>
						                    <td>123</td>
						                    <td>3</td>
						                    <td>90.32</td>
						                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">数学</td>
						                    <td>1483</td>
						                    <td>82.42</td>
						                    <td>19.95</td>
						                    <td>130</td>
						                    <td>10</td>
						                    <td>82.57</td>
						                    <td><img src="${basePath!''}/images/down.png" alt=""></td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">英语</td>
						                    <td>1486</td>
						                    <td>77.39</td>
						                    <td>22.82</td>
						                    <td>22.82</td>
						                    <td>15</td>
						                    <td>77.20</td>
						                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">物理</td>
						                    <td>1486</td>
						                    <td>64.23</td>
						                    <td>17.98</td>
						                    <td>100</td>
						                    <td>11</td>
						                    <td>62.57</td>
						                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">化学</td>
						                    <td>1486</td>
						                    <td>62.8</td>
						                    <td>17.30</td>
						                    <td>97</td>
						                    <td>6</td>
						                    <td>62.17</td>
						                    <td><img src="${basePath!''}/images/down.png" alt=""></td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">生物</td>
						                    <td>1486</td>
						                    <td>77.39</td>
						                    <td>22.82</td>
						                    <td>22.82</td>
						                    <td>15</td>
						                    <td>77.20</td>
						                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                </tr>
						                </tbody>
						            </table>
						            <p class="tacenter">表3总分各分数段人数分布</p>
						            <table class="max-table">
						                <tbody>
						                <tr class="max-bg-blue">
						                    <td>分数段</td>
						                    <td>人数</td>
						                    <td>所占比例</td>
						                    <td>累计比例</td>
						                    <td>分数段</td>
						                    <td>人数</td>
						                    <td>所占比例</td>
						                    <td>累计比例</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">0-10</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">380-390</td>
						                    <td>31</td>
						                    <td>2.09%</td>
						                    <td>22.72%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">10-20</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">390-400</td>
						                    <td>48</td>
						                    <td>3.24%</td>
						                    <td>25.96%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">20-30</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">400-410</td>
						                    <td>59</td>
						                    <td>3.98%</td>
						                    <td>29.94%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">30-40</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">410-420</td>
						                    <td>68</td>
						                    <td>4.59%</td>
						                    <td>34.52%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">40-50</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">420-430</td>
						                    <td>67</td>
						                    <td>4.52%</td>
						                    <td>39.04%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">50-60</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">430-440</td>
						                    <td>62</td>
						                    <td>4.1%</td>
						                    <td>43.22%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">60-70</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">440-450</td>
						                    <td>75</td>
						                    <td>5.06%</td>
						                    <td>48.28%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">70-80</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">450-460</td>
						                    <td>79</td>
						                    <td>5.33%</td>
						                    <td>53.61%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">80-90</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">460-470</td>
						                    <td>80</td>
						                    <td>5.39%</td>
						                    <td>59.00%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">90-100</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">470-480</td>
						                    <td>76</td>
						                    <td>5.12%</td>
						                    <td>64.13%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">100-110</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">480-490</td>
						                    <td>65</td>
						                    <td>4.82%</td>
						                    <td>68.51%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">110-120</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">490-500</td>
						                    <td>56</td>
						                    <td>3.78%</td>
						                    <td>72.79%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">120-130</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">500-510</td>
						                    <td>70</td>
						                    <td>4.72%</td>
						                    <td>77.01%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">10-20</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">510-520</td>
						                    <td>59</td>
						                    <td>3.98%</td>
						                    <td>80.98%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">130-140</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">520-530</td>
						                    <td>53</td>
						                    <td>3.57%</td>
						                    <td>84.56%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">140-150</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">530-540</td>
						                    <td>29</td>
						                    <td>1.96%</td>
						                    <td>86.51%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">150-160</td>
						                    <td>0</td>
						                    <td>0.07%</td>
						                    <td>0.07%</td>
						                    <td class="max-bg-blue">540-550</td>
						                    <td>31</td>
						                    <td>2.09%</td>
						                    <td>22.72%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">160-170</td>
						                    <td>0</td>
						                    <td>0.07%</td>
						                    <td>0.13%</td>
						                    <td class="max-bg-blue">550-560</td>
						                    <td>70</td>
						                    <td>4.72%</td>
						                    <td>77.01%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">170-180</td>
						                    <td>0</td>
						                    <td>0.07%</td>
						                    <td>0.07%</td>
						                    <td class="max-bg-blue">560-570</td>
						                    <td>31</td>
						                    <td>2.09%</td>
						                    <td>22.72%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">180-190</td>
						                    <td>0</td>
						                    <td>0.07%</td>
						                    <td>0.10%</td>
						                    <td class="max-bg-blue">570-580</td>
						                    <td>70</td>
						                    <td>4.72%</td>
						                    <td>77.01%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">190-200</td>
						                    <td>0</td>
						                    <td>0.00%</td>
						                    <td>0.00%</td>
						                    <td class="max-bg-blue">580-590</td>
						                    <td>31</td>
						                    <td>2.09%</td>
						                    <td>22.72%</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">200-210</td>
						                    <td>0</td>
						                    <td>0.20%</td>
						                    <td>0.47%</td>
						                    <td class="max-bg-blue">590-600</td>
						                    <td>70</td>
						                    <td>4.72%</td>
						                    <td>77.01%</td>
						                </tr>
						                </tbody>
						            </table>
						            
						            <div id="chart_01" class="chart_01"></div>
						            <p class="tacenter">图1总分分数段分布对比图</p>

	            				</div>

	            				<div class="reportTable" id="part13">
	            					<h3>1.3各水平等级学生分析</h3>
	            					<p>不同水平等级的学生，学习过程会有所区别。对不同水平等级的学生的考试表现进行诊断性的评价，有助于了解各水平等级学生学习的差异，帮助班主任及任课老师对各水平等级的学生做出有针对性的教学指导，从而提高教学效率。</p>
						            <p>根据教育测量理论，学生的考试成绩一般服从正态分布，根据全市所有学生本次考试总分的平均分及标准差，各等级划分如表2所示：</p>
						            <p class="tip">表3水平等级划分规则</p>
						            <table border="1">
					                    <thead>
					                    <tr class="max-bg-blue">
					                        <th>等级</th>
					                        <th>划分规则</th>
					                        <th>等级分数</th>
					                    </tr>
					                    </thead>
					                    <tbody>
					                    <tr>
					                        <td class="max-bg-blue">A等级</td>
					                        <td>X≥<img src="${basePath!''}/images/x.png">+1.28S</td>
					                        <td>X≥569</td>
					                    </tr>
					                    <tr>
					                        <td class="max-bg-blue">B等级</td>
					                        <td><img src="${basePath!''}/images/x.png">+0.43S≤X＜<img src="${basePath!''}/images/x.png">+1.28S</td>
					                        <td>487≤X＜569</td>
					                    </tr>
					                    <tr>
					                        <td class="max-bg-blue">C等级</td>
					                        <td><img src="${basePath!''}/images/x.png">-0.43S≤X＜<img src="${basePath!''}/images/x.png">+0.43S</td>
					                        <td>1403≤X＜487</td>
					                    </tr>
					                    <tr>
					                        <td class="max-bg-blue">D等级</td>
					                        <td><img src="${basePath!''}/images/x.png">-1.28S≤X＜<img src="${basePath!''}/images/x.png">-0.43S</td>
					                        <td>321≤X＜403</td>
					                    </tr>
					                    <tr>
					                        <td class="max-bg-blue">E等级</td>
					                        <td>X＜<img src="${basePath!''}/images/x.png">-1.28S</td>
					                        <td>X＜321</td>
					                    </tr>
					                    </tbody>
					                </table>
					                <div class="beizhu">
					                    <span>注：表中X表示学生总分，<img src="${basePath!''}/images/x.png">表示全市学生总分的平均分，S表示全市学生总分的标准差。</span>
					                </div>

						            <p>根据上述水平等级划分规则，广州市天河区各水平等级学生分布如图2所示：</p>
						            <div id="scorePic2" class="scorePic2"></div>


						            <p class="tip">图2本区各水平等级分布图</p>
						            <p>从图5可知，在本次考试中，广州市天河区学生总体上处于中上等 ，但处于A等级的学生较少，拔尖生不足。</p>

						            <div id="scorePic3" class="scorePic3"></div>
						            <p class="tip">图3 各水平等级分布与全市对比图</p>
						            <p>下图中，各等级学生如果在某科目上得分率显著大于其他科目，则说明该科目是本次考试拉开学生总分差距的关键科目。</p>
						      
	            				</div>
	            				<div class="reportTable" id="part14">
	            					<h3>1.4各校考试情况分析</h3>
						            <p class="tip">表5各校考试情况 </p>
						            <table class="max-table">
						                <tbody>
						                <tr class="max-bg-blue">
						                    <td>区域</td>
						                    <td>人数</td>
						                    <td>总分</td>
						                    <td>语文</td>
						                    <td>数学</td>
						                    <td>英语</td>
						                    <td>物理</td>
						                    <td>化学</td>
						                    <td>生物</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">市直属</td>
						                    <td>4018</td>
						                    <td>537.14</td>
						                    <td>103.2</td>
						                    <td>100.7</td>
						                    <td>106.24</td>
						                    <td>77.08</td>
						                    <td>73.87</td>
						                    <td>75.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">越秀区</td>
						                    <td>2304</td>
						                    <td>236.1</td>
						                    <td>93..97</td>
						                    <td>254</td>
						                    <td>85.334</td>
						                    <td>65.78</td>
						                    <td>96.68</td>
						                    <td>64.2</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">天河区</td>
						                    <td>1559</td>
						                    <td>635.14</td>
						                    <td>103.2</td>
						                    <td>98.7</td>
						                    <td>106.24</td>
						                    <td>77.08</td>
						                    <td>73.87</td>
						                    <td>75.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">荔湾区</td>
						                    <td>1618</td>
						                    <td>635.14</td>
						                    <td>104.2</td>
						                    <td>89</td>
						                    <td>106.24</td>
						                    <td>72.08</td>
						                    <td>73.87</td>
						                    <td>75.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">萝岗区</td>
						                    <td>1320</td>
						                    <td>537.14</td>
						                    <td>103.2</td>
						                    <td>100.7</td>
						                    <td>106.24</td>
						                    <td>77.08</td>
						                    <td>73.87</td>
						                    <td>75.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">番禺区</td>
						                    <td>4332</td>
						                    <td>85.34</td>
						                    <td>103.2</td>
						                    <td>98.7</td>
						                    <td>106.24</td>
						                    <td>58.08</td>
						                    <td>73.87</td>
						                    <td>75.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">增城区</td>
						                    <td>2216</td>
						                    <td>425.6</td>
						                    <td>103.2</td>
						                    <td>98.7</td>
						                    <td>106.24</td>
						                    <td>79.08</td>
						                    <td>73.87</td>
						                    <td>75.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">黄浦区</td>
						                    <td>1763</td>
						                    <td>537.14</td>
						                    <td>103.2</td>
						                    <td>100.7</td>
						                    <td>106.24</td>
						                    <td>77.08</td>
						                    <td>73.87</td>
						                    <td>75.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">海珠区</td>
						                    <td>2026</td>
						                    <td>63.5</td>
						                    <td>105</td>
						                    <td>98</td>
						                    <td>78</td>
						                    <td>77.08</td>
						                    <td>98.36</td>
						                    <td>75.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">花都区</td>
						                    <td>1319</td>
						                    <td>537.14</td>
						                    <td>100.2</td>
						                    <td>100.7</td>
						                    <td>106.24</td>
						                    <td>105.08</td>
						                    <td>69.87</td>
						                    <td>77.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">白云区</td>
						                    <td>2365</td>
						                    <td>365.14</td>
						                    <td>103.2</td>
						                    <td>120.7</td>
						                    <td>106.24</td>
						                    <td>77.08</td>
						                    <td>73.87</td>
						                    <td>75.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">从化区</td>
						                    <td>4025</td>
						                    <td>320.14</td>
						                    <td>102.2</td>
						                    <td>98</td>
						                    <td>106.24</td>
						                    <td>58.08</td>
						                    <td>73.87</td>
						                    <td>77.98</td>
						                </tr>
						                <tr>
						                    <td class="max-bg-blue">南沙区</td>
						                    <td>236</td>
						                    <td>444</td>
						                    <td>95.6</td>
						                    <td>80.6</td>
						                    <td>10.6</td>
						                    <td>47.8</td>
						                    <td>73.87</td>
						                    <td>85.98</td>
						                </tr>


						                </tbody>
						            </table>
						            <!--表6-->
						            <p class="tip">表6各区各等级学生所占百分比</p>
						            <table class="max-table">
						                <tbody>
						                <tr class="max-bg-blue">
						                    <td>区域</td>
						                    <td>A</td>
						                    <td>B</td>
						                    <td>C</td>
						                    <td>D</td>
						                    <td>E</td>
						                </tr>

						                <tr>
						                    <td class="max-bg-blue">全市</td>
						                    <td>8.82%</td>
						                    <td>27.93%</td>
						                    <td>32.19%</td>
						                    <td>19.56%</td>
						                    <td>11.50%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">市直属</td>
						                    <td>33.28%</td>
						                    <td>47.64%</td>
						                    <td>15.63%</td>
						                    <td>2.89%</td>
						                    <td>2.89%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">越秀区</td>
						                    <td>6.12%</td>
						                    <td>35.89%</td>
						                    <td>36.76%</td>
						                    <td>16.19%</td>
						                    <td>5.03%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">天河区</td>
						                    <td>7.06%</td>
						                    <td>30.47%</td>
						                    <td>35.15%</td>
						                    <td>19.05%</td>
						                    <td>8.27%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">荔湾区</td>
						                    <td>4.76%</td>
						                    <td>26.76%</td>
						                    <td>41.53%</td>
						                    <td>21.76%</td>
						                    <td>5.19%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">萝岗区</td>
						                    <td>3.26%</td>
						                    <td>28.33%</td>
						                    <td>39.70%</td>
						                    <td>20.53%</td>
						                    <td>8.18%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">番禺区</td>
						                    <td>6.07%</td>
						                    <td>27.31%</td>
						                    <td>31.21%</td>
						                    <td>20.15%</td>
						                    <td>15.26%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">增城区</td>
						                    <td>5.76%</td>
						                    <td>21.76%</td>
						                    <td>41.36%</td>
						                    <td>22.76%</td>
						                    <td>5.19%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">黄浦区</td>
						                    <td>11.06%</td>
						                    <td>22.47%</td>
						                    <td>35.56%</td>
						                    <td>19.05%</td>
						                    <td>8.27%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">海珠区</td>
						                    <td>36.28%</td>
						                    <td>22.64%</td>
						                    <td>12.63%</td>
						                    <td>2.56%</td>
						                    <td>2.55%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">花都区</td>
						                    <td>9.82%</td>
						                    <td>12.93%</td>
						                    <td>36.59%</td>
						                    <td>25.56%</td>
						                    <td>7.50%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">白云区</td>
						                    <td>15.28%</td>
						                    <td>25.64%</td>
						                    <td>4.33%</td>
						                    <td>2.56%</td>
						                    <td>1.33%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">从化区</td>
						                    <td>23.18%</td>
						                    <td>12.3%</td>
						                    <td>5.33%</td>
						                    <td>6.25%</td>
						                    <td>3.56%</td>

						                </tr>
						                <tr>
						                    <td class="max-bg-blue">南沙区</td>
						                    <td>10.6%</td>
						                    <td>20.64%</td>
						                    <td>5.33%</td>
						                    <td>36.56%</td>
						                    <td>2.33%</td>
						                </tr>

						                </tbody>
						            </table>
	            				</div>

							</div>

							<!-- 第二章节 -->	
							<!--2 各科详细分析-->
						    <div id="part_2">
								<!--语文-->
						        <div class="yuwen" id="part2">
						            <h2>2 语文学科分析</h2>

						            <!-- 语文第一部分 -->
					            	<div class="two_one" id="part21">
							            <h3>2.1 命题质量分析</h3>
							            <div class="two_one_one" id="part211">
								            <h4>2.1.1 全卷质量分析</h4>
								            <!--表7-->
								            <p class="tip">表7试卷质量分析</p>
								            <!--试卷质量分析-->
								            <div id="yuwenQuality"></div>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试卷</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                    <td>信度</td>
								                    <td>峰度</td>
								                    <td>偏度</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">全卷</td>
								                    <td>0.60</td>
								                    <td>0.74</td>
								                    <td>0.72</td>
								                    <td>0.87</td>
								                    <td>-0.52</td>

								                </tr>
								                </tbody>
								            </table>
								            <div class="beizhu">
								                注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。
								            </div>

								            <div id="chart_02" class="chart_02"></div>
								            <p class="tip">图4全市语文得分分布图</p>
								        </div>

								        <div class="two_one_two" id='part212'>
								        	<h4>2.1.2 各试题详细分析</h4>
								            <!--表8-->
								            <p class="tip">表8语文各小题质量分析</p>

								            <!--语文各小题质量分析-->
								            <div id="yuwenquestionAnalysistpl"></div>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试题</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择1</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择2</td>
								                    <td>0.70</td>
								                    <td>0.29</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择3</td>
								                    <td>0.62</td>
								                    <td>0.57</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择4</td>
								                    <td>0.83</td>
								                    <td>0.24</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择5</td>
								                    <td>0.44</td>
								                    <td>0.17</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择6</td>
								                    <td>0.68</td>
								                    <td>0.31</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择7</td>
								                    <td>0.83</td>
								                    <td>0.30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择8</td>
								                    <td>0.61</td>
								                    <td>0.43</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择12</td>
								                    <td>0.75</td>
								                    <td>0.38</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择13</td>
								                    <td>0.53</td>
								                    <td>0.44</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">9(1)</td>
								                    <td>0.87</td>
								                    <td>0.19</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">9(2)_1</td>
								                    <td>0.23</td>
								                    <td>0.24</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">9(2)_2</td>
								                    <td>0.62</td>
								                    <td>0.37</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">10_1</td>
								                    <td>0.26</td>
								                    <td>0.19</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">10_2</td>
								                    <td>0.33</td>
								                    <td>0.26</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">11</td>
								                    <td>0.69</td>
								                    <td>0.46</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">14</td>
								                    <td>0.44</td>
								                    <td>0.31</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">15</td>
								                    <td>0.54</td>
								                    <td>0.17</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">16-19</td>
								                    <td>0.59</td>
								                    <td>0.20</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">17-20</td>
								                    <td>0.35</td>
								                    <td>0.21</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">18-21</td>
								                    <td>0.39</td>
								                    <td>0.18</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">22</td>
								                    <td>0.48</td>
								                    <td>0.20</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">23</td>
								                    <td>0.65</td>
								                    <td>0.22</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">24</td>
								                    <td>0.68</td>
								                    <td>0.10</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图5-->
								            <div id="chart_03" class="chart_03"></div>
								            <p class="tip">图5题目难度分布</p>
								        </div>

								        <div class="two_one_three" id="part213">
								        	<h4>2.1.3 各认知层次得分情况分析</h4>
								            <p class="tip">为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>
								            <!--图6-->
								            <!--<div id="scorePic6" style="height:450px;border:1px solid #ccc;"></div>-->
								            <div class="imgs"><img src="${basePath!''}/images/fenxi2.png" alt="" height="400" style="display:block;margin:20px auto;">
								            </div>
								            <p class="tip">图6题目质量综合评价图</p>
								            <p class="tip">根据本次语文考试各题的难度和区分度，绘制各题的散点图如下，图中落在中间靠上的题目，综合质量较高。</p>
								           <!--图7-->
								            <div id="scorePic7" class="imgs">
								                <img src="${basePath!''}/images/fenxi1.png" alt="">
								            </div>
								            <p class="tip">图7题目难度区分度散点图</p>
								            <!--图8-->
								            <div id="scorePic8" class="scorePic8"></div>
								            <p class="tip">图8选择1难度分布图</p>
											 <!--图9-->
								            <div id="scorePic9" class="scorePic9"></div>
								            <p class="tip">图9选择2难度分析题</p>

								            <!--图10-->
								            <div id="scorePic10" class="scorePic10"></div>
								            <p class="tip">图10选择3难度分布图</p>

								        </div>			

							        </div>

							        <!-- 语文第二部分 -->
					            	<div class="two_two" id="part22">
					            		<h3>2.2 学科得分分析</h3>
										<div class="two_two_one" id="part221">
											<h4>2.2.1 各知识点得分情况</h4>
								            <p class="tip">表9语文各知识模块得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>知识模块</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">古诗词阅读</td>
								                    <td>6.24</td>
								                    <td>0.50</td>
								                    <td>15</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">文言文阅读</td>
								                    <td>6.34</td>
								                    <td>0.70</td>
								                    <td>26</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">现代文阅读</td>
								                    <td>15.26</td>
								                    <td>0.70</td>
								                    <td>25</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">写作</td>
								                    <td>6.24</td>
								                    <td>0.55</td>
								                    <td>24</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">语言知识和运用</td>
								                    <td>14.24</td>
								                    <td>0.65</td>
								                    <td>30</td>
								                </tr>

								                </tbody>
								            </table>
								            <!--图12-->
								            <div id="chart_05" class="chart_05"></div>
								            <p class="tip">图12语文各知识模块得分率对比图</p>
										</div>

										<div class="two_two_two" id="part222">
											<h4>2.2.2 各认知层次得分情况</h4>
								            <p class="tip">表10语文各认知层次得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>认知层次</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">识记</td>
								                    <td>30.46</td>
								                    <td>0.64</td>
								                    <td>42</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">理解</td>
								                    <td>35.46</td>
								                    <td>0.74</td>
								                    <td>45</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">运用</td>
								                    <td>41.096</td>
								                    <td>0.56</td>
								                    <td>58</td>
								                </tr>
								                </tbody>
								            </table>
								            <div id="chart_06" class="chart_06"></div>
								            <p class="tip">图13语文各认知层次得分率对比图</p>

										</div>

										<div class="two_two_three" id="part223">
											<h4>2.2.3 各题得分情况</h4>
									        <!--b表11-->
									        <p class="tip">表11语文各题型得分情况</p>
									        <table class="max-table">
									            <tbody>
									            <tr class="max-bg-blue">
									                <td>题型</td>
									                <td>平均分</td>
									                <td>得分率</td>
									                <td>满分值</td>
									            </tr>
									            <tr>
									                <td class="max-bg-blue">选择题</td>
									                <td>21.46</td>
									                <td>0.45</td>
									                <td>47</td>
									            </tr>

									            <tr>
									                <td class="max-bg-blue">简答题</td>
									                <td>35.46</td>
									                <td>0.74</td>
									                <td>45</td>
									            </tr>

									            <tr>
									                <td class="max-bg-blue">作文题</td>
									                <td>41.09</td>
									                <td>0.68</td>
									                <td>60</td>
									            </tr>
									            </tbody>
									        </table>
									        <!--图14-->

									        <div id="chart_07" class="chart_07"></div>

										</div>	

										<div class="two_two_four" id="part224">
											<h4>2.2.4 各区得分情况</h4>
								                <!--表12-->
								            <p class="tip">表12语文各区得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>区域</td>
								                    <td>人数</td>
								                    <td>平均分</td>
								                    <td>标准差</td>
								                    <td>最高分</td>
								                    <td>最低分</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">市直属</td>
								                    <td>4018</td>
								                    <td>103.27</td>
								                    <td>9.72</td>
								                    <td>131</td>
								                    <td>33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">越秀区</td>
								                    <td>2304</td>
								                    <td>93.97</td>
								                    <td>11.08</td>
								                    <td>127</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">天河区</td>
								                    <td>1559</td>
								                    <td>101.57</td>
								                    <td>8.42</td>
								                    <td>135</td>
								                    <td>50</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">黄浦区</td>
								                    <td>1852</td>
								                    <td>105.6</td>
								                    <td>8.72</td>
								                    <td>135</td>
								                    <td>42</td>
								                </tr>
								                <!--<tr>-->
								                    <!--<td class="max-bg-blue">市直属</td>-->
								                    <!--<td>1528</td>-->
								                    <!--<td>103.27</td>-->
								                    <!--<td>9.72</td>-->
								                    <!--<td>131</td>-->
								                    <!--<td>33</td>-->
								                <!--</tr>-->
								                <tr>
								                    <td class="max-bg-blue">萝岗区</td>
								                    <td>4332</td>
								                    <td>89.03</td>
								                    <td>13.72</td>
								                    <td>122</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">荔湾区</td>
								                    <td>1428</td>
								                    <td>103.27</td>
								                    <td>9.72</td>
								                    <td>131</td>
								                    <td>33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">番禺区</td>
								                    <td>2227</td>
								                    <td>101.27</td>
								                    <td>8.88</td>
								                    <td>140</td>
								                    <td>22</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">海珠区</td>
								                    <td>4332</td>
								                    <td>89.03</td>
								                    <td>13.72</td>
								                    <td>122</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">花都区</td>
								                    <td>1206</td>
								                    <td>105.27</td>
								                    <td>8.78</td>
								                    <td>135</td>
								                    <td>40</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">增城区</td>
								                    <td>1037</td>
								                    <td>103.27</td>
								                    <td>8.72</td>
								                    <td>135</td>
								                    <td>44</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">白云区</td>
								                    <td>5624</td>
								                    <td>105.27</td>
								                    <td>872</td>
								                    <td>128</td>
								                    <td>36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">从化区</td>
								                    <td>2356</td>
								                    <td>98.8</td>
								                    <td>8.72</td>
								                    <td>140</td>
								                    <td>35</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">南沙区</td>
								                    <td>1235</td>
								                    <td>123.5</td>
								                    <td>7.99</td>
								                    <td>131</td>
								                    <td>45</td>
								                </tr>

								                </tbody>
								            </table>
										</div>

					            	</div>

					            </div>

					            <!--数学-->
						        <div class="shuxue" id="part3">
						            <h2>3 数学学科分析</h2>
						            <!-- 数学第一部分 -->
					            	<div class="three_one" id="part31">
										<h3>3.1 命题质量分析</h3>
							            <div class="three_one_one" id="part311">
								            <h4>3.1.1 全卷质量分析</h4>
								            <!--表13-->
								            <p class="tip">表13数学全卷质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试卷</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                    <td>信度</td>
								                    <td>峰度</td>
								                    <td>偏度</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">全卷</td>
								                    <td>0.55</td>
								                    <td>0.34</td>
								                    <td>0.82</td>
								                    <td>0.56</td>
								                    <td>-0.45</td>
								                </tr>
								                </tbody>
								            </table>
								            <div class="beizhu">
								                注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。
								            </div>
								            <!--图15-->
								            <div id="chart_21" class="chart_21"></div>
								            <p class="tip">图15全市数学得分分布图</p>
								        </div>
								        <div class="three_one_two" id="part312">
								        	<h4>3.1.2 各试题详细分析</h4>
								            <!--表14-->
								            <p class="tip">表14各题质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试题</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择1</td>
								                    <td>0.94</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择2</td>
								                    <td>0.95</td>
								                    <td>0.11</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择3</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择4</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择5</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择6</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择7</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择8</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">9-13_1</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">9-13_2</td>
								                    <td>0.51</td>
								                    <td>0.64</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">9-13_3</td>
								                    <td>0.89</td>
								                    <td>0.34</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">9-13_4</td>
								                    <td>0.55</td>
								                    <td>0.53</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">9-13_5</td>
								                    <td>0.42</td>
								                    <td>0.44</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">14-15</td>
								                    <td>0.56</td>
								                    <td>0.33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">16_1</td>
								                    <td>0.65</td>
								                    <td>0.77</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">16_2</td>
								                    <td>0.55</td>
								                    <td>0.75</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">17_1</td>
								                    <td>0.56</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">17_2</td>
								                    <td>0.52</td>
								                    <td>0.63</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">18_1</td>
								                    <td>0.56</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">18_2</td>
								                    <td>0.32</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">19_1</td>
								                    <td>0.64</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">19_2</td>
								                    <td>0.66</td>
								                    <td>0.75</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">20_1</td>
								                    <td>0.56</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">20_2</td>
								                    <td>0.22</td>
								                    <td>0.89</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">20_3</td>
								                    <td>0.32</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">21_1</td>
								                    <td>0.69</td>
								                    <td>0.77</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">21_2</td>
								                    <td>0.45</td>
								                    <td>0.63</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">21_3</td>
								                    <td>0.85</td>
								                    <td>0.45</td>
								                </tr>


								                </tbody>
								            </table>
								            <!--图16-->
								            <div id="chart2_16" class="chart2_16"></div>
								            <p class="tip">图16题目难度分布</p>
								            <!--图17-->
								            <p class="tip">根据本次数学考试各题的难度和区分度，绘制各题的散点图如下，图中落在中间靠上的题目，综合质量较高。</p>
								            <div class="imgs"><img src="${basePath!''}/images/mathdiff1.png" alt=""></div>
								            <p class="tip">图17题目质量综合评价图</p>
								            <!--图18-->
								            <div class="imgs"><img src="${basePath!''}/images/mathdidd2.png" alt=""></div>
								            <p class="tip">图18题目难度区分度散点图</p>

								            <!--图19-->
								            <div id="scorePic2_19" class="scorePic2_19"></div>
								            <p class="tip">图19选择1难度分布图</p>
								            <!--图20-->
								            <div id="scorePic2_20" class="scorePic2_20"></div>
								            <p class="tip">图20选择2难度分析题</p>
								            <!--图21-->
								            <div id="scorePic2_21" class="scorePic2_21"></div>
								            <p class="tip">图21选择3难度分布图</p>
								        </div>

					            	</div>

					            	<div class="three_two" id="part32">
										<h3>3.2 学科得分分析</h3>
							            <div class="three_two_one" id="part321">
								            <h4>3.2.1 各知识点得分情况</h4>
								            <!--表15-->
								            <p class="tip">表15数学各知识模块得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>知识模块</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">复数</td>
								                    <td>6.24</td>
								                    <td>0.50</td>
								                    <td>15</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">函数与导数</td>
								                    <td>8.63</td>
								                    <td>0.65</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">常用逻辑用语</td>
								                    <td>7.19</td>
								                    <td>0.70</td>
								                    <td>25</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">立体几何</td>
								                    <td>4.36</td>
								                    <td>0.45</td>
								                    <td>12</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">排列组合、概率与统计</td>
								                    <td>5.33</td>
								                    <td>0.53</td>
								                    <td>25</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">平面解析几何</td>
								                    <td>6.45</td>
								                    <td>0.60</td>
								                    <td>25</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">平面向量与三角</td>
								                    <td>5.24</td>
								                    <td>0.55</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">数列、推理与证明</td>
								                    <td>4.48</td>
								                    <td>0.53</td>
								                    <td>45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">算法初步</td>
								                    <td>4.16</td>
								                    <td>0.42</td>
								                    <td>10</td>
								                </tr>

								                </tbody>
								            </table>
								            <!--图23-->
								            <div id="chart2_23" class="chart2_23"></div>
								            <p class="tip">图23数学各知识模块得分率对比图</p>
								        </div>

								        <div class="three_two_two" id="part322">
								        	<h4>3.2.2 各认知层次得分情况</h4>
								            <!--表16-->
								            <p class="tip">表16数学各认知层次得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>认知层次</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">理解</td>
								                    <td>30.46</td>
								                    <td>0.65</td>
								                    <td>42</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">推理</td>
								                    <td>35.46</td>
								                    <td>0.43</td>
								                    <td>45</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">应用</td>
								                    <td>41.096</td>
								                    <td>0.8</td>
								                    <td>58</td>
								                </tr>
								                </tbody>
								            </table>
								            <div id="chart2_24" class="chart2_24"></div>
								            <p class="tip">图13语文各认知层次得分率对比图</p>
								        </div>	

								        <div class="three_two_three" id="part323">
								        	<h4>3.2.3 各题得分情况</h4>
								            <!--b表17    -->
								            <p class="tip">表17数学各题型得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>题型</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择题</td>
								                    <td>28.79</td>
								                    <td>0.48</td>
								                    <td>47</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">填空题</td>
								                    <td>35.46</td>
								                    <td>0.73</td>
								                    <td>45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选做题</td>
								                    <td>41.09</td>
								                    <td>0.90</td>
								                    <td>60</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">解答题</td>
								                    <td>41.09</td>
								                    <td>0.67</td>
								                    <td>60</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图14-->

								            <div id="chart2_25" class="chart2_25"></div>
								            <p class="tip">图14语文各题型得分率对比图</p>
										</div>

										<div class="three_two_four" id="part324">
											<h4>3.2.4 各区得分情况</h4>
								            <!--表18-->
								            <p class="tip">表18数学各区得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>区域</td>
								                    <td>人数</td>
								                    <td>平均分</td>
								                    <td>标准差</td>
								                    <td>最高分</td>
								                    <td>最低分</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">市直属</td>
								                    <td>4018</td>
								                    <td>100.7</td>
								                    <td>16.55</td>
								                    <td>131</td>
								                    <td>33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">越秀区</td>
								                    <td>2304</td>
								                    <td>88.97</td>
								                    <td>18.08</td>
								                    <td>138</td>
								                    <td>5</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">天河区</td>
								                    <td>1559</td>
								                    <td>85.4</td>
								                    <td>17.14</td>
								                    <td>135</td>
								                    <td>23</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">黄浦区</td>
								                    <td>1852</td>
								                    <td>84.73</td>
								                    <td>8.72</td>
								                    <td>135</td>
								                    <td>10</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">萝岗区</td>
								                    <td>4332</td>
								                    <td>89.03</td>
								                    <td>13.72</td>
								                    <td>122</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">荔湾区</td>
								                    <td>1428</td>
								                    <td>103.27</td>
								                    <td>9.72</td>
								                    <td>131</td>
								                    <td>33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">番禺区</td>
								                    <td>2227</td>
								                    <td>101.27</td>
								                    <td>8.88</td>
								                    <td>140</td>
								                    <td>22</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">海珠区</td>
								                    <td>4332</td>
								                    <td>89.03</td>
								                    <td>13.72</td>
								                    <td>122</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">花都区</td>
								                    <td>1206</td>
								                    <td>105.27</td>
								                    <td>8.78</td>
								                    <td>135</td>
								                    <td>4</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">增城区</td>
								                    <td>1037</td>
								                    <td>103.27</td>
								                    <td>8.72</td>
								                    <td>135</td>
								                    <td>2</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">白云区</td>
								                    <td>5624</td>
								                    <td>105.27</td>
								                    <td>872</td>
								                    <td>128</td>
								                    <td>36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">从化区</td>
								                    <td>2356</td>
								                    <td>98.8</td>
								                    <td>8.72</td>
								                    <td>140</td>
								                    <td>35</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">南沙区</td>
								                    <td>1235</td>
								                    <td>100.5</td>
								                    <td>8.99</td>
								                    <td>150</td>
								                    <td>45</td>
								                </tr>

								                </tbody>
								            </table>
										</div>

								    </div>

					            </div>

					            <!--英语-->
						        <div class="yingyu" id="part4">
						            <h2>4 英语学科分析</h2>
						            <!-- 英语第一部分 -->
					            	<div class="four_one" id="part41">
										<h3>4.1 命题质量分析</h3>
							            <div class="four_one_one" id="part411">
								            <h4>4.1.1 全卷质量分析</h4>
								            <!--表19-->
								            <p class="tip">表19英语全卷质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试卷</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                    <td>信度</td>
								                    <td>峰度</td>
								                    <td>偏度</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">全卷</td>
								                    <td>0.51</td>
								                    <td>0.43</td>
								                    <td>0.90</td>
								                    <td>-0.57</td>
								                    <td>-0.21</td>
								                </tr>
								                </tbody>
								            </table>
								            <div class="beizhu">
								                注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。
								            </div>
								            <!--图15-->
								            <div id="chart3_26" class="chart3_26"></div>
								            <p class="tip">图26全市英语得分分布图</p>
								        </div>

								        <div class="four_one_two" id="part412">
								        	<h4>4.1.2 各试题详细分析</h4>
								            <!--表14-->
								            <p class="tip">表20各题质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试题</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择1</td>
								                    <td>0.94</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择2</td>
								                    <td>0.95</td>
								                    <td>0.11</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择3</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择4</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择5</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择6</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择7</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择8</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择9</td>
								                    <td>0.34</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择10</td>
								                    <td>0.51</td>
								                    <td>0.64</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择11</td>
								                    <td>0.89</td>
								                    <td>0.34</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择12</td>
								                    <td>0.55</td>
								                    <td>0.53</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择13</td>
								                    <td>0.42</td>
								                    <td>0.44</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择14</td>
								                    <td>0.56</td>
								                    <td>0.33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择15</td>
								                    <td>0.65</td>
								                    <td>0.77</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择26</td>
								                    <td>0.55</td>
								                    <td>0.75</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择27</td>
								                    <td>0.56</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择28</td>
								                    <td>0.52</td>
								                    <td>0.63</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择29</td>
								                    <td>0.56</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择30</td>
								                    <td>0.32</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择31</td>
								                    <td>0.64</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择32</td>
								                    <td>0.66</td>
								                    <td>0.75</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择33</td>
								                    <td>0.56</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择34</td>
								                    <td>0.22</td>
								                    <td>0.89</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择35</td>
								                    <td>0.32</td>
								                    <td>0.36</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择36</td>
								                    <td>0.69</td>
								                    <td>0.77</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择37</td>
								                    <td>0.45</td>
								                    <td>0.63</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择38</td>
								                    <td>0.23</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择39</td>
								                    <td>0.85</td>
								                    <td>0.33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择40</td>
								                    <td>0.11</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择41</td>
								                    <td>0.85</td>
								                    <td>0.42</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择42</td>
								                    <td>0.36</td>
								                    <td>0.12</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择43</td>
								                    <td>0.45</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择44</td>
								                    <td>0.86</td>
								                    <td>0.89</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择45</td>
								                    <td>0.45</td>
								                    <td>0.46</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择46</td>
								                    <td>0.45</td>
								                    <td>0.40</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择47</td>
								                    <td>0.39</td>
								                    <td>0.21</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择48</td>
								                    <td>0.36</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择49</td>
								                    <td>0.45</td>
								                    <td>0.23</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择50</td>
								                    <td>0.25</td>
								                    <td>0.33</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">1_16</td>
								                    <td>0.56</td>
								                    <td>0.35</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">1_17</td>
								                    <td>0.75</td>
								                    <td>0.63</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">1_18</td>
								                    <td>0.78</td>
								                    <td>0.22</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">1_19</td>
								                    <td>0.85</td>
								                    <td>0.45</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">1_20</td>
								                    <td>0.21</td>
								                    <td>0.56</td>
								                </tr>

								                </tbody>
								            </table>
								            <!--图27-->
								            <div id="chart3_27" class="chart3_27"></div>
								            <p class="tip">图27题目难度分布</p>
								            <!--图27-->
								            <p class="tip">根据本次英语考试各题的难度和区分度，绘制各题的散点图如下，图中落在中间靠上的题目，综合质量较高。</p>
								            <div class="imgs"><img src="${basePath!''}/images/mathdiff1.png" alt=""></div>
								            <p class="tip">图28题目质量综合评价图</p>
								            <!--图28-->
								            <div class="imgs"><img src="${basePath!''}/images/mathdidd2.png" alt=""></div>
								            <p class="tip">图29题目难度区分度散点图</p>

								            <!--图30-->
								            <div id="scorePic3_30" class="scorePic3_30"></div>

								            <!--图31-->
								            <div id="scorePic3_31" class="scorePic3_31"></div>
								            <p class="tip">图31选择2难度分析题</p>
								            <!--图32-->
								            <div id="scorePic3_32" class="scorePic3_32"></div>
								            <p class="tip">图32选择3难度分布图</p>

								        </div>

								    </div>

								    <!-- 英语第二部分 -->
					            	<div class="four_two" id="part42">
										<h3>4.2 学科得分分析</h3>
							            <div class="four_two_one">
								            <h4>4.2.1 各知识点得分情况</h4>
								            <!--表15-->
								            <p class="tip">表21英语各知识模块得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>知识模块</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">听说</td>
								                    <td>5.24</td>
								                    <td>0.63</td>
								                    <td>15</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">写作</td>
								                    <td>7.98</td>
								                    <td>0.51</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">语言知识及运用</td>
								                    <td>6.33</td>
								                    <td>0.45</td>
								                    <td>28</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">阅读</td>
								                    <td>4.36</td>
								                    <td>0.61</td>
								                    <td>12</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图34-->
								            <div id="chart3_34" class="chart3_34"></div>
											<p class="tip">图34英语各知识模块得分率对比图</p>
								        </div>
										
										<div class="four_two_two">
											<h4>4.2.2 各认知层次得分情况</h4>
								            <!--表22-->
								            <p class="tip">表22英语各认知层次得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>认知层次</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">识记</td>
								                    <td>30.46</td>
								                    <td>0.62</td>
								                    <td>42</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">理解</td>
								                    <td>35.46</td>
								                    <td>0.52</td>
								                    <td>45</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">运用</td>
								                    <td>41.096</td>
								                    <td>0.48</td>
								                    <td>58</td>
								                </tr>
								                </tbody>
								            </table>
								            <div id="chart3_35" class="chart3_35"></div>
								            <p class="tip">图35英语各认知层次得分率对比图</p>
										</div>

										<div class="four_two_three">
											<h4>4.2.3 各题得分情况</h4>
								            <!--b表23    -->
								            <p class="tip">表23英语各题型得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>题型</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择题</td>
								                    <td>45.409</td>
								                    <td>0.57</td>
								                    <td>47</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">填空题</td>
								                    <td>5.38</td>
								                    <td>0.36</td>
								                    <td>45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">作文题</td>
								                    <td>20.53</td>
								                    <td>0.51</td>
								                    <td>60</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">口语题</td>
								                    <td>9.49</td>
								                    <td>0.63</td>
								                    <td>60</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图36-->

								            <div id="chart3_36" class="chart3_36"></div>
								            <p class="tip">图36英语各题型得分率对比图</p>
										</div>

										<div class="four_two_four">
											<h4>4.2.4 各区得分情况</h4>
								            <!--表18-->
								            <p class="tip">表24英语各区得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>区域</td>
								                    <td>人数</td>
								                    <td>平均分</td>
								                    <td>标准差</td>
								                    <td>最高分</td>
								                    <td>最低分</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">市直属</td>
								                    <td>4018</td>
								                    <td>106.24</td>
								                    <td>17.29</td>
								                    <td>142</td>
								                    <td>28</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">越秀区</td>
								                    <td>2304</td>
								                    <td>85.33</td>
								                    <td>20.67</td>
								                    <td>134</td>
								                    <td>17.5</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">天河区</td>
								                    <td>1559</td>
								                    <td>82.73</td>
								                    <td>22.61</td>
								                    <td>137</td>
								                    <td>15</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">黄浦区</td>
								                    <td>1852</td>
								                    <td>81.13</td>
								                    <td>19.49</td>
								                    <td>131</td>
								                    <td>26.5</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">萝岗区</td>
								                    <td>4332</td>
								                    <td>77.78</td>
								                    <td>21.64</td>
								                    <td>132.5</td>
								                    <td>18</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">荔湾区</td>
								                    <td>1428</td>
								                    <td>103.27</td>
								                    <td>9.72</td>
								                    <td>131</td>
								                    <td>33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">番禺区</td>
								                    <td>2227</td>
								                    <td>101.27</td>
								                    <td>8.88</td>
								                    <td>140</td>
								                    <td>22</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">海珠区</td>
								                    <td>4332</td>
								                    <td>89.03</td>
								                    <td>13.72</td>
								                    <td>122</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">花都区</td>
								                    <td>1206</td>
								                    <td>105.27</td>
								                    <td>8.78</td>
								                    <td>135</td>
								                    <td>4</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">增城区</td>
								                    <td>1037</td>
								                    <td>103.27</td>
								                    <td>8.72</td>
								                    <td>135</td>
								                    <td>2</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">白云区</td>
								                    <td>5624</td>
								                    <td>71.01</td>
								                    <td>25.74</td>
								                    <td>133</td>
								                    <td>9</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">从化区</td>
								                    <td>2356</td>
								                    <td>69.49</td>
								                    <td>22.76</td>
								                    <td>130.5</td>
								                    <td>14</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">南沙区</td>
								                    <td>398</td>
								                    <td>61.91</td>
								                    <td>24.82</td>
								                    <td>129.5</td>
								                    <td>12</td>
								                </tr>

								                </tbody>
								            </table>
										</div>
								    </div>
								</div>

								<!--物理-->
						        <div class="wuli" id="part5">
						            <h2>5 物理学科分析</h2>
						            <!-- 物理第一部分 -->
					            	<div class="five_one" id="part51">
										<h3>5.1 命题质量分析</h3>
							            <div class="five_one_one" id="part511">
											<h4>5.1.1 全卷质量分析</h4>
								            <!--表25-->
								            <p class="tip">表25物理全卷质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试卷</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                    <td>信度</td>
								                    <td>峰度</td>
								                    <td>偏度</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">全卷</td>
								                    <td>0.63</td>
								                    <td>0.46</td>
								                    <td>0.85</td>
								                    <td>-0.56</td>
								                    <td>-0.33</td>
								                </tr>
								                </tbody>
								            </table>
								            <div class="beizhu">
								                注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。
								            </div>
								            <!--图37-->
								            <div id="chart4_37" class="chart4_37"></div>
								            <p class="tip">图37全市物理得分分布图</p>

							            </div>
										
							            <div class="five_one_two" id="part512">
								            <h4>5.1.2 各试题详细分析</h4>
								            <!--表14-->
								            <p class="tip">表26各题质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试题</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                </tr>
								                    <tr><td class="max-bg-blue">选择13</td>
								                    <td>0.42</td>
								                    <td>0.44</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择14</td>
								                    <td>0.56</td>
								                    <td>0.33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择15</td>
								                    <td>0.65</td>
								                    <td>0.77</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择16</td>
								                    <td>0.55</td>
								                    <td>0.75</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">双选17</td>
								                    <td>0.56</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">双选18</td>
								                    <td>0.52</td>
								                    <td>0.63</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">双选19</td>
								                    <td>0.56</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">双选20</td>
								                    <td>0.32</td>
								                    <td>0.47</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">双选21</td>
								                    <td>0.64</td>
								                    <td>0.94</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">34(1)_1</td>
								                    <td>0.66</td>
								                    <td>0.92</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">34(1)_2</td>
								                    <td>0.56</td>
								                    <td>0.89</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">34(2)_1</td>
								                    <td>0.22</td>
								                    <td>0.97</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">34(2)_2</td>
								                    <td>0.32</td>
								                    <td>0.86</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">34(2)_3</td>
								                    <td>0.69</td>
								                    <td>0.90</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">35_1</td>
								                    <td>0.45</td>
								                    <td>0.68</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">35_2</td>
								                    <td>0.23</td>
								                    <td>0.73</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">35_3</td>
								                    <td>0.85</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">36_1</td>
								                    <td>0.11</td>
								                    <td>0.76</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">36_2</td>
								                    <td>0.85</td>
								                    <td>0.50</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">36_3</td>
								                    <td>0.36</td>
								                    <td>0.09</td>
								                </tr>

								                </tbody>
								            </table>
								            <!--图38-->
								            <div id="chart4_38" class="chart4_38"></div>
								            <p class="tip">图38题目难度分布</p>
								            <!--图39-->
								            <p class="tip">为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>
								            <div><img src="${basePath!''}/images/mathdiff1.png" alt="" style="height:400px; display:block; margin:20px auto;"></div>
								            <p class="tip">图39题目质量综合评价图</p>
								            <!--图40-->
								            <div><img src="${basePath!''}/images/mathdidd2.png" alt="" style="height:400px; display:block; margin:20px auto;"></div>
								            <p class="tip">图40题目难度区分度散点图</p>

								            <!--图41-->
								            <div id="scorePic4_41" class="scorePic4_41"></div>
								            <p class="tip">图41选择13难度分布图</p>
								            <!--图42-->
								            <div id="scorePic4_42" class="scorePic4_42"></div>
								            <p class="tip">图42选择14难度分析题</p>
								            <!--图43-->
								            <div id="scorePic4_43" class='scorePic4_43' ></div>
								            <p class="tip">图43选择15难度分布图</p>

								        </div>

							        </div>
							        <!-- 物理第二部分 -->
					            	<div class="five_two" id="part52">
										<h3>5.2 命题质量分析</h3>
							            <div class="five_two_one" id="part521">
											<h4>5.2.1 各知识点得分情况</h4>
								            <!--表15-->
								            <p class="tip">表27物理各知识模块得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>知识模块</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">电磁学</td>
								                    <td>24.59</td>
								                    <td>0.65</td>
								                    <td>38</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">力学</td>
								                    <td>18.12</td>
								                    <td>0.53</td>
								                    <td>34</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">热学</td>
								                    <td>3.78</td>
								                    <td>0.63</td>
								                    <td>28</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">实验</td>
								                    <td>12.55</td>
								                    <td>0.70</td>
								                    <td>18</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">原子物理</td>
								                    <td>3.53</td>
								                    <td>0.88</td>
								                    <td>4</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图45-->
								            <div id="chart4_45" class="chart4_45"></div>
								            <p class="tip">图45物理各知识模块得分率对比图</p>
							            </div>
							            <div class="five_two_two" id="part522">
							            	<h4>5.2.2 各认知层次得分情况</h4>
								            <!--表28-->
								            <p class="tip">表28物理各认知层次得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>认知层次</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">识记</td>
								                    <td>30.46</td>
								                    <td>0.89</td>
								                    <td>32</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">理解</td>
								                    <td>35.46</td>
								                    <td>0.44</td>
								                    <td>45</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">运用</td>
								                    <td>41.096</td>
								                    <td>0.75</td>
								                    <td>16</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图45-->
								            <div id="chart4_46" class="chart4_46"></div>
								            <p class="tip">图46物理各认知层次得分率对比图</p>
							            </div>
							            
										<div class="five_two_three" id="part523">
								            <h4>5.2.3 各题得分情况</h4>
								            <!--b表29    -->
								            <p class="tip">表29物理各题型得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>题型</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">单选题</td>
								                    <td>45.409</td>
								                    <td>0.50</td>
								                    <td>25</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">多选题</td>
								                    <td>5.38</td>
								                    <td>0.78</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">解答题</td>
								                    <td>20.53</td>
								                    <td>0.59</td>
								                    <td>45</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图47-->

								            <div id="chart4_47" class="chart4_47"></div>
								            <p class="tip">图47物理各题型得分率对比图</p>
								        </div>

								        <div class="five_two_four" id="part524">
								        	<h4>5.2.4 各区得分情况</h4>
								            <!--表18-->
								            <p class="tip">表30物理各区得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>区域</td>
								                    <td>人数</td>
								                    <td>平均分</td>
								                    <td>标准差</td>
								                    <td>最高分</td>
								                    <td>最低分</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">市直属</td>
								                    <td>4018</td>
								                    <td>77.08</td>
								                    <td>12.3</td>
								                    <td>90</td>
								                    <td>13</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">越秀区</td>
								                    <td>2304</td>
								                    <td>64.78</td>
								                    <td>16.12</td>
								                    <td>100</td>
								                    <td>13.5</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">天河区</td>
								                    <td>1559</td>
								                    <td>64.77</td>
								                    <td>18.61</td>
								                    <td>100</td>
								                    <td>11</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">黄浦区</td>
								                    <td>1852</td>
								                    <td>81.13</td>
								                    <td>19.49</td>
								                    <td>131</td>
								                    <td>26.5</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">萝岗区</td>
								                    <td>4332</td>
								                    <td>77.78</td>
								                    <td>21.64</td>
								                    <td>132.5</td>
								                    <td>18</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">荔湾区</td>
								                    <td>1428</td>
								                    <td>63.43</td>
								                    <td>9.72</td>
								                    <td>131</td>
								                    <td>33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">番禺区</td>
								                    <td>2227</td>
								                    <td>100.27</td>
								                    <td>9.88</td>
								                    <td>135</td>
								                    <td>20</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">海珠区</td>
								                    <td>4332</td>
								                    <td>89.03</td>
								                    <td>10.72</td>
								                    <td>100</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">花都区</td>
								                    <td>1206</td>
								                    <td>86.8</td>
								                    <td>8.78</td>
								                    <td>44</td>
								                    <td>4</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">增城区</td>
								                    <td>1037</td>
								                    <td>103.27</td>
								                    <td>8.72</td>
								                    <td>100.5</td>
								                    <td>5</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">白云区</td>
								                    <td>5624</td>
								                    <td>71.01</td>
								                    <td>25.74</td>
								                    <td>98</td>
								                    <td>9</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">从化区</td>
								                    <td>2356</td>
								                    <td>69.49</td>
								                    <td>22.76</td>
								                    <td>87.5</td>
								                    <td>14</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">南沙区</td>
								                    <td>398</td>
								                    <td>61.91</td>
								                    <td>24.82</td>
								                    <td>85.5</td>
								                    <td>12</td>
								                </tr>

								                </tbody>
								            </table>
								        </div>
							        </div>

							    </div>

							    <!--化学-->
						        <div class="huaxue" id="part6">
						            <h2>6 化学学科分析</h2>
						            <!-- 化学第一部分 -->
					            	<div class="six_one" id="part61">
										<h3>6.1 命题质量分析</h3>
							            <div class="six_one_one" id="part611">
											<h4>6.1.1 全卷质量分析</h4>
								            <!--表31-->
								            <p class="tip">表31化学全卷质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试卷</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                    <td>信度</td>
								                    <td>峰度</td>
								                    <td>偏度</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">全卷</td>
								                    <td>0.62</td>
								                    <td>0.43</td>
								                    <td>0.85</td>
								                    <td>-0.08</td>
								                    <td>-0.63</td>
								                </tr>
								                </tbody>
								            </table>
								            <div class="beizhu">
								                注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。
								            </div>
								            <!--图48-->
								            <div id="chart5_48" class="chart5_48"></div>
								            <p class="tip">图48全市化学得分分布图</p>
							           	</div>

							           	<div class="six_one_two" id="part612">
							           		
								            <h4>6.1.2 各试题详细分析</h4>
								            <!--表32-->
								            <p class="tip">表32各题质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试题</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                </tr>
								                <tr><td class="max-bg-blue">选择7</td>
								                <td>0.42</td>
								                <td>0.44</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择8</td>
								                    <td>0.56</td>
								                    <td>0.33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择9</td>
								                    <td>0.65</td>
								                    <td>0.77</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择10</td>
								                    <td>0.55</td>
								                    <td>0.75</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择11</td>
								                    <td>0.56</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择12</td>
								                    <td>0.52</td>
								                    <td>0.63</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">双选22</td>
								                    <td>0.56</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">双选23</td>
								                    <td>0.32</td>
								                    <td>0.47</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">30_1</td>
								                    <td>0.64</td>
								                    <td>0.94</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">30_2</td>
								                    <td>0.66</td>
								                    <td>0.92</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">30_3</td>
								                    <td>0.56</td>
								                    <td>0.89</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">30_4</td>
								                    <td>0.22</td>
								                    <td>0.97</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">30_5</td>
								                    <td>0.32</td>
								                    <td>0.86</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">31_1</td>
								                    <td>0.69</td>
								                    <td>0.90</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">31_2</td>
								                    <td>0.45</td>
								                    <td>0.68</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">31_3</td>
								                    <td>0.23</td>
								                    <td>0.73</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">31_4</td>
								                    <td>0.85</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">31_5</td>
								                    <td>0.11</td>
								                    <td>0.76</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">31_6</td>
								                    <td>0.85</td>
								                    <td>0.50</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">32_1</td>
								                    <td>0.36</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">32_2</td>
								                    <td>0.36</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">32_3</td>
								                    <td>0.36</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">32_4</td>
								                    <td>0.36</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">32_5</td>
								                    <td>0.36</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">33_1</td>
								                    <td>0.36</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">33_2</td>
								                    <td>0.36</td>
								                    <td>0.09</td>
								                </tr>

								                </tbody>
								            </table>
								            <!--图49-->
								            <div id="chart5_49" class="chart5_49"></div>
								            <p class="tip">图49题目难度分布</p>
								            <!--图39-->
								            <p class="tip">为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>
								            <div><img src="${basePath!''}/images/mathdiff1.png" alt="" style="height:400px; display:block; margin:20px auto;"></div>
								            <p class="tip">图50题目质量综合评价图</p>
								            <!--图40-->
								            <div><img src="${basePath!''}/images/mathdidd2.png" alt="" style="height:400px; display:block; margin:20px auto;"></div>
								            <p class="tip">图51题目难度区分度散点图</p>
								            <!--图52-->
								            <div id="scorePic5_52" class="scorePic5_52"></div>
								            <p class="tip">图52选择7难度分布图</p>
								            <!--图53-->
								            <div id="scorePic5_53" class="scorePic5_53"></div>
								            <p class="tip">图53选择8难度分析题</p>
								            <!--图54-->
								            <div id="scorePic5_54" class="scorePic5_54"></div>
								            <p class="tip">图54选择9难度分布图</p>
							           	</div>

							        </div>
							        <!-- 化学第二部分 -->
					            	<div class="six_two" id="part62">
										<h3>6.2 学科得分分析</h3>
							            <div class="six_two_one" id="part621">
											<h4>6.2.1 各知识点得分情况</h4>
								            <!--表15-->
								            <p class="tip">表33化学各知识模块得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>知识模块</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">化学平衡</td>
								                    <td>15.89</td>
								                    <td>0.61</td>
								                    <td>26</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">离子反应</td>
								                    <td>3.28</td>
								                    <td>0.82</td>
								                    <td>34</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">氧化还原反应</td>
								                    <td>18.36</td>
								                    <td>0.54</td>
								                    <td>4</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">有机物</td>
								                    <td>4.55</td>
								                    <td>0.52</td>
								                    <td>8</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">元素</td>
								                    <td>3.53</td>
								                    <td>0.74</td>
								                    <td>8</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图56-->
								            <div id="chart5_56" class="chart5_56"></div>
								            <p class="tip">图56化学各知识模块得分率对比图</p>
							           	</div>
							           	<div class="six_two_two" id="part622">
							           		<h4>6.2.2 各认知层次得分情况</h4>
								            <!--表28-->
								            <p class="tip">表28物理各认知层次得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>认知层次</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">识记</td>
								                    <td>30.46</td>
								                    <td>0.70</td>
								                    <td>33</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">理解</td>
								                    <td>35.46</td>
								                    <td>0.57</td>
								                    <td>45</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">运用</td>
								                    <td>41.096</td>
								                    <td>0.59</td>
								                    <td>22</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图57-->
								            <div id="chart5_57" class="chart5_57"></div>
								            <p class="tip">图57化学各认知层次得分率对比图</p>
							           	</div>
							           	<div class="six_two_three" id="part623">
								            <h4>6.2.3 各题得分情况</h4>
								            <!--b表29    -->
								            <p class="tip">表35化学各题型得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>题型</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">单选题</td>
								                    <td>19.09</td>
								                    <td>0.83</td>
								                    <td>25</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">多选题</td>
								                    <td>7.78</td>
								                    <td>0.65</td>
								                    <td>30</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">解答题</td>
								                    <td>34.40</td>
								                    <td>0.54</td>
								                    <td>45</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图58-->

								            <div id="chart5_58" class="chart5_58"></div>
								            <p class="tip">图58化学各题型得分率对比图</p>
							           	</div>
							           	<div class="six_two_four" id="part624">
							           		<h4>6.2.4 各区得分情况</h4>
								            <!--表36-->
								            <p class="tip">表36化学各区得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>区域</td>
								                    <td>人数</td>
								                    <td>平均分</td>
								                    <td>标准差</td>
								                    <td>最高分</td>
								                    <td>最低分</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">市直属</td>
								                    <td>4018</td>
								                    <td>73.87</td>
								                    <td>12.3</td>
								                    <td>99</td>
								                    <td>13</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">越秀区</td>
								                    <td>2304</td>
								                    <td>64.68</td>
								                    <td>15.12</td>
								                    <td>99</td>
								                    <td>12</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">天河区</td>
								                    <td>1559</td>
								                    <td>62.77</td>
								                    <td>16.61</td>
								                    <td>97</td>
								                    <td>7</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">黄浦区</td>
								                    <td>1852</td>
								                    <td>81.13</td>
								                    <td>19.49</td>
								                    <td>131</td>
								                    <td>10</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">萝岗区</td>
								                    <td>4332</td>
								                    <td>77.78</td>
								                    <td>21.64</td>
								                    <td>97.5</td>
								                    <td>12</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">荔湾区</td>
								                    <td>1428</td>
								                    <td>63.43</td>
								                    <td>9.72</td>
								                    <td>131</td>
								                    <td>4</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">番禺区</td>
								                    <td>2227</td>
								                    <td>100.27</td>
								                    <td>9.88</td>
								                    <td>135</td>
								                    <td>3</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">海珠区</td>
								                    <td>4332</td>
								                    <td>89.03</td>
								                    <td>10.72</td>
								                    <td>100</td>
								                    <td>11</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">花都区</td>
								                    <td>1206</td>
								                    <td>86.8</td>
								                    <td>8.78</td>
								                    <td>44</td>
								                    <td>1</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">增城区</td>
								                    <td>1037</td>
								                    <td>87.27</td>
								                    <td>8.72</td>
								                    <td>100.5</td>
								                    <td>5</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">白云区</td>
								                    <td>5624</td>
								                    <td>71.01</td>
								                    <td>25.74</td>
								                    <td>98</td>
								                    <td>9</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">从化区</td>
								                    <td>2356</td>
								                    <td>92.49</td>
								                    <td>22.76</td>
								                    <td>87.5</td>
								                    <td>14</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">南沙区</td>
								                    <td>398</td>
								                    <td>55.91</td>
								                    <td>24.82</td>
								                    <td>85.5</td>
								                    <td>12</td>
								                </tr>

								                </tbody>
								            </table>
							           	</div>
							        </div>

							    </div>

								<!--生物-->
						        <div class="shengwu" id="part7">
						            <h2>7 生物学科分析</h2>
						            <!-- 生物第一部分 -->
					            	<div class="seven_one" id="part71">
										<h3>7.1 命题质量分析</h3>
							            <div class="seven_one_one" id="part711">
											<h4>7.1.1 全卷质量分析</h4>
								            <!--表31-->
								            <p class="tip">表37生物全卷质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试卷</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                    <td>信度</td>
								                    <td>峰度</td>
								                    <td>偏度</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">全卷</td>
								                    <td>0.62</td>
								                    <td>0.45</td>
								                    <td>0.85</td>
								                    <td>-0.47</td>
								                    <td>-0.45</td>
								                </tr>
								                </tbody>
								            </table>
								            <div class="beizhu">
								                注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。
								            </div>
								            <!--图59-->
								            <div id="chart6_59" class="chart6_59"></div>
								            <p class="tip">图48全市生物得分分布图</p>
							            </div>
							            <div class="seven_one_two" id="part712">
								            <h4>7.1.2 各试题详细分析</h4>
								            <!--表32-->
								            <p class="tip">表38各题质量分析</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>试题</td>
								                    <td>难度</td>
								                    <td>区分度</td>
								                </tr>
								                <tr><td class="max-bg-blue">选择</td>
								                <td>0.67</td>
								                <td>0.44</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择2</td>
								                    <td>0.74</td>
								                    <td>0.33</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择3</td>
								                    <td>0.78</td>
								                    <td>0.77</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择4</td>
								                    <td>0.84</td>
								                    <td>0.75</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择5</td>
								                    <td>0.88</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">选择6</td>
								                    <td>0.52</td>
								                    <td>0.63</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">双选24</td>
								                    <td>0.46</td>
								                    <td>0.45</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">双选25</td>
								                    <td>0.80</td>
								                    <td>0.47</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">26_1</td>
								                    <td>0.50</td>
								                    <td>0.94</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">26_2</td>
								                    <td>0.48</td>
								                    <td>0.92</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">26_3</td>
								                    <td>0.58</td>
								                    <td>0.89</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">26_4</td>
								                    <td>0.70</td>
								                    <td>0.97</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">26_5</td>
								                    <td>0.36</td>
								                    <td>0.86</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">27_1</td>
								                    <td>0.54</td>
								                    <td>0.90</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">27_2</td>
								                    <td>0.67</td>
								                    <td>0.68</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">27_3</td>
								                    <td>0.73</td>
								                    <td>0.73</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">28_1</td>
								                    <td>0.53.</td>
								                    <td>0.88</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">28_2</td>
								                    <td>0.52</td>
								                    <td>0.76</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">28_3</td>
								                    <td>0.20</td>
								                    <td>0.50</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">28_4</td>
								                    <td>0.47</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">28_5</td>
								                    <td>0.40</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29前半题_1</td>
								                    <td>0.50</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29前半题_2</td>
								                    <td>0.52</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29前半题_3</td>
								                    <td>0.20</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29后半题_1</td>
								                    <td>0.47</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29后半题_2</td>
								                    <td>0.40</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29后半题_2</td>
								                    <td>0.50</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29后半题_2</td>
								                    <td>0.70</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29后半题_2</td>
								                    <td>0.78</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29后半题_2</td>
								                    <td>0.79</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29后半题_2</td>
								                    <td>0.50</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29后半题_3</td>
								                    <td>0.62</td>
								                    <td>0.09</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">29后半题_4</td>
								                    <td>0.59</td>
								                    <td>0.09</td>
								                </tr>

								                </tbody>
								            </table>
								            <!--图60-->
								            <div id="chart6_60" class="chart6_60"></div>
								            <p class="tip">图60题目难度分布</p>
								            <!--图61-->
								            <p class="tip">为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>
								            <div class="imgs"><img src="${basePath!''}/images/mathdiff1.png" alt=""></div>
								            <p class="tip">图61题目质量综合评价图</p>
								            <!--图62-->
								            <div class="imgs"><img src="${basePath!''}/images/mathdidd2.png" alt=""></div>
								            <p class="tip">图62题目难度区分度散点图</p>
								            <!--图63-->
								            <div id="scorePic6_63" class="scorePic6_63"></div>
								            <p class="tip">图63选择1难度分布图</p>
								            <!--图64-->
								            <div id="scorePic6_64" class="scorePic6_64"></div>
								            <p class="tip">图64选择2难度分析题</p>
								            <!--图65-->
								            <div id="scorePic6_65" class="scorePic6_65"></div>
								            <p class="tip">图65选择3难度分布图</p>
							            </div>
							        </div>

							        <!-- 生物第二部分 -->
					            	<div class="seven_two" id="part72">
										<h3>7.2 命题质量分析</h3>
							            <div class="seven_two_one" id="part721">
											<h4>7.2.1 各知识点得分情况</h4>
								            <!--表39-->
								            <p class="tip">表39生物各知识模块得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>知识模块</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">分子与细胞</td>
								                    <td>15.89</td>
								                    <td>0.56</td>
								                    <td>26</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">教材实验</td>
								                    <td>3.28</td>
								                    <td>0.69</td>
								                    <td>34</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">生物与环境</td>
								                    <td>18.36</td>
								                    <td>0.66</td>
								                    <td>4</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">探究实验</td>
								                    <td>14.55</td>
								                    <td>0.65</td>
								                    <td>8</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">现代生物科技</td>
								                    <td>12.53</td>
								                    <td>0.52</td>
								                    <td>8</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">遗传与进化</td>
								                    <td>16.53</td>
								                    <td>0.62</td>
								                    <td>20</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图67-->
								            <div id="chart6_67" class="chart6_67"></div>
								            <p class="tip">图67生物各知识模块得分率对比图</p>
							            </div>
							            <div class="seven_two_two" id="part722">
							            	<h4>7.2.2 各认知层次得分情况</h4>
								            <!--表28-->
								            <p class="tip">表40生物各认知层次得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>认知层次</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">识记</td>
								                    <td>27.46</td>
								                    <td>0.90</td>
								                    <td>30</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">理解</td>
								                    <td>19.46</td>
								                    <td>0.52</td>
								                    <td>38</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">运用</td>
								                    <td>16.096</td>
								                    <td>0.50</td>
								                    <td>32</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图57-->
								            <div id="chart6_68" class="chart6_68"></div>
								            <p class="tip">图57化学各认知层次得分率对比图</p>
							            </div>

							            <div class="seven_two_three" id="part723">
								            <h4>7.2.3 各题得分情况</h4>
								            <!--b表29    -->
								            <p class="tip">表35化学各题型得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>题型</td>
								                    <td>平均分</td>
								                    <td>得分率</td>
								                    <td>满分值</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">单选题</td>
								                    <td>17.09</td>
								                    <td>0.74</td>
								                    <td>24</td>
								                </tr>

								                <tr>
								                    <td class="max-bg-blue">多选题</td>
								                    <td>7.56</td>
								                    <td>0.63</td>
								                    <td>12</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">解答题</td>
								                    <td>37.40</td>
								                    <td>0.58</td>
								                    <td>64</td>
								                </tr>
								                </tbody>
								            </table>
								            <!--图58-->

								            <div id="chart6_69" class="chart6_69"></div>
								            <p class="tip">图69生物各题型得分率对比图</p>
							            </div>

							            <div class="seven_two_four" id="part724">
							            	<h4>7.2.4 各区得分情况</h4>
								            <!--表36-->
								            <p class="tip">表42生物各区得分情况</p>
								            <table class="max-table">
								                <tbody>
								                <tr class="max-bg-blue">
								                    <td>区域</td>
								                    <td>人数</td>
								                    <td>平均分</td>
								                    <td>标准差</td>
								                    <td>最高分</td>
								                    <td>最低分</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">市直属</td>
								                    <td>4018</td>
								                    <td>79.87</td>
								                    <td>12.37</td>
								                    <td>99</td>
								                    <td>13</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">越秀区</td>
								                    <td>2304</td>
								                    <td>64.68</td>
								                    <td>15.12</td>
								                    <td>95</td>
								                    <td>15</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">天河区</td>
								                    <td>1559</td>
								                    <td>64.77</td>
								                    <td>16.61</td>
								                    <td>97</td>
								                    <td>6</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">黄浦区</td>
								                    <td>1852</td>
								                    <td>81.13</td>
								                    <td>19.49</td>
								                    <td>131</td>
								                    <td>10</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">萝岗区</td>
								                    <td>4332</td>
								                    <td>60.78</td>
								                    <td>19.64</td>
								                    <td>88.5</td>
								                    <td>12</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">荔湾区</td>
								                    <td>1428</td>
								                    <td>63.43</td>
								                    <td>19.72</td>
								                    <td>90</td>
								                    <td>5</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">番禺区</td>
								                    <td>2227</td>
								                    <td>102.27</td>
								                    <td>8.88</td>
								                    <td>135</td>
								                    <td>3</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">海珠区</td>
								                    <td>4332</td>
								                    <td>89.03</td>
								                    <td>9.72</td>
								                    <td>89</td>
								                    <td>11</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">花都区</td>
								                    <td>1206</td>
								                    <td>86.8</td>
								                    <td>8.78</td>
								                    <td>97</td>
								                    <td>1</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">增城区</td>
								                    <td>1037</td>
								                    <td>87.27</td>
								                    <td>8.72</td>
								                    <td>98.5</td>
								                    <td>5</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">白云区</td>
								                    <td>5624</td>
								                    <td>71.01</td>
								                    <td>25.74</td>
								                    <td>98</td>
								                    <td>9</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">从化区</td>
								                    <td>2356</td>
								                    <td>92.49</td>
								                    <td>22.76</td>
								                    <td>97.5</td>
								                    <td>7</td>
								                </tr>
								                <tr>
								                    <td class="max-bg-blue">南沙区</td>
								                    <td>398</td>
								                    <td>55.91</td>
								                    <td>24.82</td>
								                    <td>96.5</td>
								                    <td>4</td>
								                </tr>
								                </tbody>
								            </table>
							            </div>

							        </div>

							    </div>
						
					        </div>
							
							<!-- 附录(表) -->
					        <div id="part8" class="appendix">
					        	<h2>附录</h2>
					        	<h3>全市各校考试详情</h3>
						        <div>
						            <table class="max-table">
						                <tbody>
						                <tr class="max-bg-blue">
						                    <td>区域</td>
						                    <td>学校</td>
						                    <td>实考人数</td>
						                    <td>总分</td>
						                    <td>语文</td>
						                    <td>数学</td>
						                    <td>英语</td>
						                    <td>物理</td>
						                    <td>化学</td>
						                    <td>生物</td>
						                    <td>全市排名</td>
						                </tr>
						                <!--市直属-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">市直属</td>
						                    <td>华南师范大学附属中学</td>
						                    <td>354</td>
						                    <td>583.9</td>
						                    <td>108.92</td>
						                    <td>110</td>
						                    <td>116.23</td>
						                    <td>84.67</td>
						                    <td>81.12</td>
						                    <td>82.96</td>
						                    <td>1</td>
						                </tr>
						                <tr>
						                    <td>广东实验中学</td>
						                    <td>507</td>
						                    <td>566.08</td>
						                    <td>105.83</td>
						                    <td>109.1</td>
						                    <td>113.78</td>
						                    <td>76.59</td>
						                    <td>77.46</td>
						                    <td>79.56</td>
						                    <td>2</td>
						                </tr>
						                <tr>
						                    <td>广州市执信中学</td>
						                    <td>554</td>
						                    <td>561.93</td>
						                    <td>107.34</td>
						                    <td>104.56</td>
						                    <td>115</td>
						                    <td>78</td>
						                    <td>77.4</td>
						                    <td>79.42</td>
						                    <td>3</td>
						                </tr>
						                <tr>
						                    <td>广东广雅中学</td>
						                    <td>513</td>
						                    <td>549.96</td>
						                    <td>103.71</td>
						                    <td>101.8</td>
						                    <td>108.51</td>
						                    <td>79.35</td>
						                    <td>80.02</td>
						                    <td>79.35</td>
						                    <td>4</td>
						                </tr>
						                <tr>
						                    <td>广州市第六中学</td>
						                    <td>538</td>
						                    <td>534.98</td>
						                    <td>103.7</td>
						                    <td>98.92</td>
						                    <td>106.18</td>
						                    <td>77.96</td>
						                    <td>72.93</td>
						                    <td>75.3</td>
						                    <td>7</td>
						                </tr>
						                <!--越秀区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">越秀区</td>
						                    <td>广州市第七中学</td>
						                    <td>349</td>
						                    <td>523.98</td>
						                    <td>105</td>
						                    <td>97.56</td>
						                    <td>105.68</td>
						                    <td>78.6</td>
						                    <td>76.6</td>
						                    <td>80.3</td>
						                    <td>8</td>
						                </tr>
						                <tr>
						                    <td>广州市第十六中学</td>
						                    <td>309</td>
						                    <td>508.09</td>
						                    <td>99.42</td>
						                    <td>94.79</td>
						                    <td>100.19</td>
						                    <td>72.03</td>
						                    <td>71.26</td>
						                    <td>75.3</td>
						                    <td>12</td>
						                </tr>
						                <tr>
						                    <td>广州市培正中学</td>
						                    <td>234</td>
						                    <td>495.98</td>
						                    <td>96.4</td>
						                    <td>94.7</td>
						                    <td>96.18</td>
						                    <td>71.64</td>
						                    <td>68.87</td>
						                    <td>67.91</td>
						                    <td>16</td>
						                </tr>
						                <tr>
						                    <td>广州市第三中学</td>
						                    <td>275</td>
						                    <td>489.71</td>
						                    <td>97.26</td>
						                    <td>92.33</td>
						                    <td>90.16</td>
						                    <td>68.81</td>
						                    <td>71.47</td>
						                    <td>69.69</td>
						                    <td>17</td>
						                </tr>
						                <tr>
						                    <td>广州市育才中学</td>
						                    <td>258</td>
						                    <td>466.38</td>
						                    <td>93.74</td>
						                    <td>88</td>
						                    <td>85.73</td>
						                    <td>70.74</td>
						                    <td>63.45</td>
						                    <td>64.71</td>
						                    <td>29</td>
						                </tr>
						                <!--天河区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">天河区</td>
						                    <td>广州市第四十七中学</td>
						                    <td>437</td>
						                    <td>497.98</td>
						                    <td>96.24</td>
						                    <td>90.95</td>
						                    <td>95.98</td>
						                    <td>74.32</td>
						                    <td>70.11</td>
						                    <td>70.3</td>
						                    <td>15</td>
						                </tr>
						                <tr>
						                    <td>广州市第七十五中学</td>
						                    <td>235</td>
						                    <td>471.09</td>
						                    <td>94.72</td>
						                    <td>90.69</td>
						                    <td>86.69</td>
						                    <td>67.07</td>
						                    <td>66.12</td>
						                    <td>66.54</td>
						                    <td>24</td>
						                </tr>
						                <tr>
						                    <td>广州市天河中学</td>
						                    <td>166</td>
						                    <td>468.98</td>
						                    <td>94</td>
						                    <td>84.56</td>
						                    <td>98.6</td>
						                    <td>84.36</td>
						                    <td>70.6</td>
						                    <td>70.6</td>
						                    <td>25</td>
						                </tr>
						                <tr>
						                    <td>广州市第八十九中学</td>
						                    <td>133</td>
						                    <td>446.52</td>
						                    <td>91.98</td>
						                    <td>87.77</td>
						                    <td>81.98</td>
						                    <td>62.5</td>
						                    <td>60.94</td>
						                    <td>61.27</td>
						                    <td>37</td>
						                </tr>
						                <tr>
						                    <td>广州市东圃中学</td>
						                    <td>133</td>
						                    <td>452.61</td>
						                    <td>80.26</td>
						                    <td>65.36</td>
						                    <td>27.6</td>
						                    <td>54.63</td>
						                    <td>65.3</td>
						                    <td>77.2</td>
						                    <td>48</td>
						                </tr>
						                <!--荔湾区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">荔湾区</td>
						                    <td>广州市第四中学</td>
						                    <td>349</td>
						                    <td>523.98</td>
						                    <td>105</td>
						                    <td>97.56</td>
						                    <td>105.68</td>
						                    <td>78.6</td>
						                    <td>76.6</td>
						                    <td>80.3</td>
						                    <td>18</td>
						                </tr>
						                <tr>
						                    <td>广州市真光中学</td>
						                    <td>309</td>
						                    <td>508.09</td>
						                    <td>99.42</td>
						                    <td>94.79</td>
						                    <td>100.19</td>
						                    <td>72.03</td>
						                    <td>71.26</td>
						                    <td>75.3</td>
						                    <td>21</td>
						                </tr>
						                <tr>
						                    <td>广州市第一中学</td>
						                    <td>349</td>
						                    <td>523.98</td>
						                    <td>105</td>
						                    <td>97.56</td>
						                    <td>105.68</td>
						                    <td>78.6</td>
						                    <td>76.6</td>
						                    <td>80.3</td>
						                    <td>35</td>
						                </tr>
						                <tr>
						                    <td>广州市西关外国语学校</td>
						                    <td>234</td>
						                    <td>495.98</td>
						                    <td>96.4</td>
						                    <td>94.7</td>
						                    <td>96.18</td>
						                    <td>71.64</td>
						                    <td>68.87</td>
						                    <td>67.91</td>
						                    <td>39</td>
						                </tr>
						                <tr>
						                    <td>广州市南海中学</td>
						                    <td>275</td>
						                    <td>489.71</td>
						                    <td>97.26</td>
						                    <td>92.33</td>
						                    <td>90.16</td>
						                    <td>68.81</td>
						                    <td>71.47</td>
						                    <td>69.69</td>
						                    <td>57</td>
						                </tr>
						                <!--萝岗区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="4">萝岗区</td>
						                    <td>广州市玉岩中学</td>
						                    <td>349</td>
						                    <td>523.98</td>
						                    <td>105</td>
						                    <td>97.56</td>
						                    <td>105.68</td>
						                    <td>78.6</td>
						                    <td>76.6</td>
						                    <td>80.3</td>
						                    <td>32</td>
						                </tr>
						                <tr>
						                    <td>华南师范大学附属康大学校</td>
						                    <td>201</td>
						                    <td>523.09</td>
						                    <td>56.42</td>
						                    <td>77.79</td>
						                    <td>56.19</td>
						                    <td>72.03</td>
						                    <td>62.26</td>
						                    <td>77.3</td>
						                    <td>88</td>
						                </tr>
						                <tr>
						                    <td>广州开发区外国语学校</td>
						                    <td>562</td>
						                    <td>563.98</td>
						                    <td>100</td>
						                    <td>63.54</td>
						                    <td>100.68</td>
						                    <td>88.6</td>
						                    <td>56.3</td>
						                    <td>79.3</td>
						                    <td>103</td>
						                </tr>
						                <tr>
						                    <td>广州科学城中学</td>
						                    <td>236</td>
						                    <td>456.98</td>
						                    <td>77.4</td>
						                    <td>88.7</td>
						                    <td>66.18</td>
						                    <td>45.64</td>
						                    <td>65.5</td>
						                    <td>63.91</td>
						                    <td>16</td>
						                </tr>

						                <!--番禺区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">番禺区</td>
						                    <td>广东仲元中学</td>
						                    <td>336</td>
						                    <td>856.98</td>
						                    <td>105</td>
						                    <td>89.6</td>
						                    <td>99.9</td>
						                    <td>78.3</td>
						                    <td>76.6</td>
						                    <td>88.3</td>
						                    <td>107</td>
						                </tr>
						                <tr>
						                    <td>广东番禺中学</td>
						                    <td>635</td>
						                    <td>542.09</td>
						                    <td>88</td>
						                    <td>97</td>
						                    <td>98</td>
						                    <td>83</td>
						                    <td>69.5</td>
						                    <td>77.7</td>
						                    <td>9</td>
						                </tr>
						                <tr>
						                    <td>广州市番禺区象贤中学</td>
						                    <td>236</td>
						                    <td>52.6</td>
						                    <td>100</td>
						                    <td>103.6</td>
						                    <td>106.68</td>
						                    <td>78.6</td>
						                    <td>76.6</td>
						                    <td>85.3</td>
						                    <td>22</td>
						                </tr>
						                <tr>
						                    <td>广州市禺山高级中学</td>
						                    <td>234</td>
						                    <td>236.98</td>
						                    <td>98</td>
						                    <td>56.6</td>
						                    <td>77.18</td>
						                    <td>69.5</td>
						                    <td>77.4</td>
						                    <td>67.91</td>
						                    <td>82</td>
						                </tr>
						                <tr>
						                    <td>广州市番禺区洛溪新城中学</td>
						                    <td>236</td>
						                    <td>452.71</td>
						                    <td>97.26</td>
						                    <td>35.33</td>
						                    <td>90.16</td>
						                    <td>75.81</td>
						                    <td>71.47</td>
						                    <td>69.69</td>
						                    <td>13</td>
						                </tr>
						                <!--增城区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">增城市增城中学</td>
						                    <td>增城市郑中钧中学</td>
						                    <td>236</td>
						                    <td>452.98</td>
						                    <td>98</td>
						                    <td>85.56</td>
						                    <td>101</td>
						                    <td>79.6</td>
						                    <td>76.6</td>
						                    <td>99.3</td>
						                    <td>34</td>
						                </tr>
						                <tr>
						                    <td>增城市第一中学</td>
						                    <td>203</td>
						                    <td>506</td>
						                    <td>77</td>
						                    <td>88.8</td>
						                    <td>198.3</td>
						                    <td>69.3</td>
						                    <td>77.4</td>
						                    <td>75.3</td>
						                    <td>41</td>
						                </tr>
						                <tr>
						                    <td>增城市新塘中学</td>
						                    <td>456</td>
						                    <td>236.98</td>
						                    <td>105</td>
						                    <td>42.56</td>
						                    <td>85.68</td>
						                    <td>77.6</td>
						                    <td>36.6</td>
						                    <td>80.3</td>
						                    <td>62</td>
						                </tr>
						                <tr>
						                    <td>增城市高级中学</td>
						                    <td>236</td>
						                    <td>563.98</td>
						                    <td>86.3</td>
						                    <td>45.3</td>
						                    <td>96.18</td>
						                    <td>71.64</td>
						                    <td>68.87</td>
						                    <td>89.91</td>
						                    <td>76</td>
						                </tr>
						                <tr>
						                    <td>增城市增城中学</td>
						                    <td>254</td>
						                    <td>500.98</td>
						                    <td>77.4</td>
						                    <td>94.7</td>
						                    <td>96.18</td>
						                    <td>84.64</td>
						                    <td>96</td>
						                    <td>67.91</td>
						                    <td>33</td>
						                </tr>

						                <!--黄埔区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="4">黄埔区</td>
						                    <td>广州市第八十六中学</td>
						                    <td>245</td>
						                    <td>98.98</td>
						                    <td>542</td>
						                    <td>85.6</td>
						                    <td>85.6</td>
						                    <td>11.6</td>
						                    <td>66.6</td>
						                    <td>80.3</td>
						                    <td>8</td>
						                </tr>
						                <tr>
						                    <td>广州石化中学</td>
						                    <td>365</td>
						                    <td>896.09</td>
						                    <td>55.42</td>
						                    <td>94.79</td>
						                    <td>101.19</td>
						                    <td>72.03</td>
						                    <td>53.6</td>
						                    <td>75.3</td>
						                    <td>73</td>
						                </tr>
						                <tr>
						                    <td>广州市第八十七中学</td>
						                    <td>395</td>
						                    <td>452.8</td>
						                    <td>236</td>
						                    <td>97.56</td>
						                    <td>100.68</td>
						                    <td>78.6</td>
						                    <td>66.6</td>
						                    <td>80.3</td>
						                    <td>92</td>
						                </tr>
						                <tr>
						                    <td>广州市第八十四中学</td>
						                    <td>125</td>
						                    <td>99</td>
						                    <td>100</td>
						                    <td>367</td>
						                    <td>96.18</td>
						                    <td>56.3</td>
						                    <td>68.87</td>
						                    <td>67.91</td>
						                    <td>10+</td>
						                </tr>

						                <!--海珠区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">海珠区</td>
						                    <td>广州市第五中学</td>
						                    <td>349</td>
						                    <td>523.98</td>
						                    <td>105</td>
						                    <td>97.56</td>
						                    <td>105.68</td>
						                    <td>78.6</td>
						                    <td>76.6</td>
						                    <td>80.3</td>
						                    <td>28</td>
						                </tr>
						                <tr>
						                    <td>广州市第九十七中学</td>
						                    <td>406</td>
						                    <td>563.09</td>
						                    <td>105</td>
						                    <td>89.9</td>
						                    <td>87.5</td>
						                    <td>77.3</td>
						                    <td>71.26</td>
						                    <td>75.3</td>
						                    <td>40</td>
						                </tr>
						                <tr>
						                    <td>广州市南武中学</td>
						                    <td>654</td>
						                    <td>253.98</td>
						                    <td>142</td>
						                    <td>99</td>
						                    <td>98.7</td>
						                    <td>66.6</td>
						                    <td>76.6</td>
						                    <td>84.3</td>
						                    <td>49</td>
						                </tr>
						                <tr>
						                    <td>广州市海珠实验中学</td>
						                    <td>36.4</td>
						                    <td>495.98</td>
						                    <td>96.4</td>
						                    <td>94.7</td>
						                    <td>52.6.18</td>
						                    <td>71.64</td>
						                    <td>68.87</td>
						                    <td>67.91</td>
						                    <td>60</td>
						                </tr>
						                <tr>
						                    <td>广州市海珠中学</td>
						                    <td>569</td>
						                    <td>489.71</td>
						                    <td>97.26</td>
						                    <td>56.6.33</td>
						                    <td>90.16</td>
						                    <td>68.81</td>
						                    <td>77.9.47</td>
						                    <td>69.69</td>
						                    <td>79</td>
						                </tr>

						                <!--花都区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">花都区</td>
						                    <td>广州市花都区秀全中学</td>
						                    <td>452</td>
						                    <td>523.98</td>
						                    <td>105</td>
						                    <td>256.56</td>
						                    <td>36.68</td>
						                    <td>78.6</td>
						                    <td>79.6</td>
						                    <td>80.3</td>
						                    <td>14</td>
						                </tr>
						                <tr>
						                    <td>广州市花都区邝维煜纪念中学</td>
						                    <td>563</td>
						                    <td>508.09</td>
						                    <td>99.42</td>
						                    <td>94.79</td>
						                    <td>99</td>
						                    <td>72.03</td>
						                    <td>85.26</td>
						                    <td>75.3</td>
						                    <td>43</td>
						                </tr>
						                <tr>
						                    <td>广州市花都区新华中学</td>
						                    <td>536</td>
						                    <td>236.98</td>
						                    <td>87</td>
						                    <td>63.56</td>
						                    <td>105.68</td>
						                    <td>78.6</td>
						                    <td>76.6</td>
						                    <td>80.3</td>
						                    <td>81</td>
						                </tr>
						                <tr>
						                    <td>广州市花都区第一中学</td>
						                    <td>542</td>
						                    <td>653.6</td>
						                    <td>77.6</td>
						                    <td>94.7</td>
						                    <td>98.6</td>
						                    <td>71.64</td>
						                    <td>68.87</td>
						                    <td>66.6</td>
						                    <td>91</td>
						                </tr>
						                <tr>
						                    <td>广州市花都区圆玄中学</td>
						                    <td>275</td>
						                    <td>489.71</td>
						                    <td>97.26</td>
						                    <td>92.33</td>
						                    <td>90.16</td>
						                    <td>68.81</td>
						                    <td>71.47</td>
						                    <td>69.69</td>
						                    <td>116</td>
						                </tr>

						                <!--白云区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">白云区</td>
						                    <td>广州市培英中学</td>
						                    <td>652</td>
						                    <td>55.6</td>
						                    <td>105</td>
						                    <td>52.6</td>
						                    <td>105.68</td>
						                    <td>78.6</td>
						                    <td>77.5</td>
						                    <td>69.4</td>
						                    <td>27</td>
						                </tr>
						                <tr>
						                    <td>广州市第八十中学</td>
						                    <td>305</td>
						                    <td>504.09</td>
						                    <td>99.42</td>
						                    <td>94.79</td>
						                    <td>120</td>
						                    <td>72.03</td>
						                    <td>71.26</td>
						                    <td>88.7</td>
						                    <td>53</td>
						                </tr>
						                <tr>
						                    <td>广州市第六十五中学</td>
						                    <td>542</td>
						                    <td>523.98</td>
						                    <td>136</td>
						                    <td>97.56</td>
						                    <td>148</td>
						                    <td>78.6</td>
						                    <td>76.6</td>
						                    <td>75.3</td>
						                    <td>56</td>
						                </tr>
						                <tr>
						                    <td>广州市白云中学</td>
						                    <td>234</td>
						                    <td>495.98</td>
						                    <td>90.6</td>
						                    <td>94.7</td>
						                    <td>96.18</td>
						                    <td>78.6</td>
						                    <td>68.87</td>
						                    <td>88.6</td>
						                    <td>72</td>
						                </tr>
						                <tr>
						                    <td>广州市第七十一中学</td>
						                    <td>234</td>
						                    <td>495.98</td>
						                    <td>96.4</td>
						                    <td>94.7</td>
						                    <td>96.18</td>
						                    <td>71.64</td>
						                    <td>68.87</td>
						                    <td>67.91</td>
						                    <td>96</td>
						                </tr>
						                <!--从化区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="5">从化区</td>
						                    <td>从化中学</td>
						                    <td>349</td>
						                    <td>523.98</td>
						                    <td>105</td>
						                    <td>97.56</td>
						                    <td>105.68</td>
						                    <td>78.6</td>
						                    <td>102.6</td>
						                    <td>80.3</td>
						                    <td>20</td>
						                </tr>
						                <tr>
						                    <td>从化六中</td>
						                    <td>309</td>
						                    <td>99.09</td>
						                    <td>99.42</td>
						                    <td>94.79</td>
						                    <td>185.19</td>
						                    <td>72.03</td>
						                    <td>71.26</td>
						                    <td>75.3</td>
						                    <td>50</td>
						                </tr>
						                <tr>
						                    <td>从化五中</td>
						                    <td>300</td>
						                    <td>500.98</td>
						                    <td>105</td>
						                    <td>89</td>
						                    <td>105.68</td>
						                    <td>78.6</td>
						                    <td>77.5</td>
						                    <td>80.3</td>
						                    <td>80</td>
						                </tr>
						                <tr>
						                    <td>从化二中</td>
						                    <td>236</td>
						                    <td>495.98</td>
						                    <td>96.4</td>
						                    <td>94.7</td>
						                    <td>96.18</td>
						                    <td>71.64</td>
						                    <td>52.6.87</td>
						                    <td>67.91</td>
						                    <td>85</td>
						                </tr>
						                <tr>
						                    <td>从化三中</td>
						                    <td>275</td>
						                    <td>555.71</td>
						                    <td>97.26</td>
						                    <td>56.4</td>
						                    <td>90.16</td>
						                    <td>68.81</td>
						                    <td>71.47</td>
						                    <td>77.69</td>
						                    <td>128</td>
						                </tr>
						                <!--南沙区-->
						                <tr>
						                    <td class="max-bg-blue" rowspan="4">南沙区</td>
						                    <td>南沙一中</td>
						                    <td>174</td>
						                    <td>412.6</td>
						                    <td>89.26</td>
						                    <td>80.17</td>
						                    <td>105.68</td>
						                    <td>55.01</td>
						                    <td>55.79</td>
						                    <td>80.3</td>
						                    <td>58</td>
						                </tr>
						                <tr>
						                    <td>广州市南沙麒麟中学</td>
						                    <td>56</td>
						                    <td>56.83</td>
						                    <td>78.36</td>
						                    <td>61.27</td>
						                    <td>53.21</td>
						                    <td>44.34</td>
						                    <td>68.59</td>
						                    <td>46.07</td>
						                    <td>114</td>
						                </tr>
						                <tr>
						                    <td>广州市南沙第二中学</td>
						                    <td>118</td>
						                    <td>316.17</td>
						                    <td>78.03</td>
						                    <td>58.56</td>
						                    <td>52.87</td>
						                    <td>44.17</td>
						                    <td>39.22</td>
						                    <td>43.32</td>
						                    <td>120</td>
						                </tr>
						                <tr>
						                    <td>广州市英东中学</td>
						                    <td>119</td>
						                    <td>523.6.98</td>
						                    <td>88.4</td>
						                    <td>96.5</td>
						                    <td>78.6</td>
						                    <td>66.6</td>
						                    <td>88.8</td>
						                    <td>67.91</td>
						                    <td>132</td>
						                </tr>



						                </tbody>
						            </table>
						        </div>
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
<script src="${basePath!''}/js/common.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<script src="${basePath!''}/js/echarts.min.js"></script>
<script type="text/javascript">
	$(function(){

		selected();

		var chart_01 = echarts.init(document.getElementById('chart_01'));
		var myChart =echarts.init(document.getElementById('scorePic2'));
		var myChart_03 = echarts.init(document.getElementById('scorePic3'));
		var chart_02 = echarts.init(document.getElementById('chart_02'));
		var chart_03 = echarts.init(document.getElementById('chart_03'));
		var chart_08 = echarts.init(document.getElementById('scorePic8'));
		var chart_09 = echarts.init(document.getElementById('scorePic9'));
		var chart_10 = echarts.init(document.getElementById('scorePic10'));
		var chart_05 = echarts.init(document.getElementById('chart_05'));
		var chart_06 = echarts.init(document.getElementById('chart_06'));
		var chart_07 = echarts.init(document.getElementById('chart_07'));
		var chart_21 = echarts.init(document.getElementById('chart_21'));
		var chart2_23 = echarts.init(document.getElementById('chart2_23'));
		var chart2_24 = echarts.init(document.getElementById('chart2_24'));
		var chart2_25 = echarts.init(document.getElementById('chart2_25'));

		var chart2_16 = echarts.init(document.getElementById('chart2_16'));
		var scorePic2_19 = echarts.init(document.getElementById('scorePic2_19'));
		var scorePic2_20 = echarts.init(document.getElementById('scorePic2_20'));
		var scorePic2_21 = echarts.init(document.getElementById('scorePic2_21'));

		var chart3_26 = echarts.init(document.getElementById('chart3_26'));
		var chart3_27 = echarts.init(document.getElementById('chart3_27'));
		var scorePic3_30 = echarts.init(document.getElementById('scorePic3_30'));
		var scorePic3_31 = echarts.init(document.getElementById('scorePic3_31'));
		var scorePic3_32 = echarts.init(document.getElementById('scorePic3_32'));
		var chart3_34 = echarts.init(document.getElementById('chart3_34'));
		var chart3_35 = echarts.init(document.getElementById('chart3_35'));
		var chart3_36 = echarts.init(document.getElementById('chart3_36'));

		var chart4_37 = echarts.init(document.getElementById('chart4_37'));
		var chart4_38 = echarts.init(document.getElementById('chart4_38'));
		var scorePic4_41 = echarts.init(document.getElementById('scorePic4_41'));
		var scorePic4_42 = echarts.init(document.getElementById('scorePic4_42'));
		var scorePic4_43 = echarts.init(document.getElementById('scorePic4_43'));

		var chart4_45 = echarts.init(document.getElementById('chart4_45'));
		var chart4_46 = echarts.init(document.getElementById('chart4_46'));
		var chart4_47 = echarts.init(document.getElementById('chart4_47'));

		var chart5_48 = echarts.init(document.getElementById('chart5_48'));
		var chart5_49 = echarts.init(document.getElementById('chart5_49'));
		var scorePic5_52 = echarts.init(document.getElementById('scorePic5_52'));
		var scorePic5_53 = echarts.init(document.getElementById('scorePic5_53'));
		var scorePic5_54 = echarts.init(document.getElementById('scorePic5_54'));
		var chart5_56 = echarts.init(document.getElementById('chart5_56'));
		var chart5_57 = echarts.init(document.getElementById('chart5_57'));
		var chart5_58 = echarts.init(document.getElementById('chart5_58'));
		var chart6_59 = echarts.init(document.getElementById('chart6_59'));
		var chart6_60 = echarts.init(document.getElementById('chart6_60'));
		var scorePic6_63 = echarts.init(document.getElementById('scorePic6_63'));
		var scorePic6_64 = echarts.init(document.getElementById('scorePic6_64'));
		var scorePic6_65 = echarts.init(document.getElementById('scorePic6_65'));
		var chart6_67 = echarts.init(document.getElementById('chart6_67'));
		var chart6_68 = echarts.init(document.getElementById('chart6_68'));
		var chart6_69 = echarts.init(document.getElementById('chart6_69'));

		


		var chart_01_option  =  {

            tooltip : {
                trigger: 'axis'
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType: {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            legend: {

                data:['全市总分','趋势线--总分']
            },
            xAxis : [
                {
                    type : 'category',
                    axisLabel:{
                        rotate:90,
                    },
                    data : ['0-10','10-20','20-30','30-40','40-50','50-60','60-70','70-80','80-90','90-100','100-110','110-120','120-130','130-140','140-150','150-160','160-170','170-180','180-190','190-200','200-210','210-220','220-230','230-240','240-250','250-260','260-270','270-280','280-290','290-300','300-310','310-320','320-330','330-340','340-350','350-360','360-370','370-380','380-390','390-400','400-410','410-420','420-430','430-440','440-450','450-460','470-480','480-490','490-500','500-510','510-520','520-530','530-540','540-550','550-560','560-570','570-580','580-590','590-600','600-610','610-620','620-630','630-640','640-650','650-660','660-670','670-680','680-690','690-700','700-710','710-720','720-730','730-740','740,750']

                }
            ],
            yAxis : [
                {
                    type : 'value',
                    max:5,
                    interval: 0.5,
                    axisLabel: {
                        formatter: '{value} %'
                    }
                }
            ],
            series : [

                {
                    name:'全市总分',
                    type:'bar',
                    data:[0,0,0,0,0,0,0,0,0.02,0,0.01,0.02,0.01,0.019266,0.04,0.05,0.08,0.13,0.017,0.29,0.32,0.34,0.52,0.59,0.73,0.86,1.05,1.02,1.22,1.30,1.55,1.58,1.72,1.73,1.92,2.18,2.50,2.78,2.87,2.95,3.28,3.44,3.52,3.84,3.85,3.99,4.12,3.93,4.18,3.89,3.78,3.89,3.32,3.396,3.13,2.88,2.45,2.10,1.80,1.43,1.17,0.79,0.57,0.39,0.24,0.10,0.08,0.01,0.02,0,0,0,0,0,0]
                },
                {
                    name:'趋势线--总分',
                    type:'line',
                    data:[0,0,0,0,0,0,0,0,0.02,0,0.01,0.02,0.01,0.019266,0.04,0.05,0.08,0.13,0.017,0.29,0.32,0.34,0.52,0.59,0.73,0.86,1.05,1.02,1.22,1.30,1.55,1.58,1.72,1.73,1.92,2.18,2.50,2.78,2.87,2.95,3.28,3.44,3.52,3.84,3.85,3.99,4.12,3.93,4.18,3.89,3.78,3.89,3.32,3.396,3.13,2.88,2.45,2.10,1.80,1.43,1.17,0.79,0.57,0.39,0.24,0.10,0.08,0.01,0.02,0,0,0,0,0,0]

                }
            ]
        };

        var option2 = {
            title : {
                x:'center'
            },
            tooltip : {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                orient : 'vertical',
                x : 'left',
                data:['A等级','B等级','C等级','D等级','E等级']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {
                        show: true,
                        type: ['pie', 'funnel'],
                        option: {
                            funnel: {
                                x: '25%',
                                width: '50%',
                                funnelAlign: 'left',
                                max: 1548
                            }
                        }
                    },
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            series : [
                {
                    name:'本校各水平等级分布图',
                    type:'pie',
                    radius : '55%',
                    itemStyle:{
                        normal:{
                            label:{
                                show:true,
                                testStyle:{
                                    color:'#ccc'
                                }
                            }
                        }
                    },
                    center: ['50%', '60%'],
                    data:[
                        {value:4.43, name:'A等级'},
                        {value:31.01, name:'B等级'},
                        {value:47.47, name:'C等级'},
                        {value:13.95, name:'D等级'},
                        {value:3.16, name:'E等级'}
                    ]
                }
            ]
        };


        var option3 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['A等级','B等级','C等级','D等级','E等级']
            },
            toolbox: {
                show : false,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['语文','数学','英语','物理','化学','生物']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'A等级',
                    type:'line',
                    symbol:'diamond',
                    data:[0.7226, 0.765133, 0.78, 0.88, 0.84, 0.85]
                },
                {
                    name:'B等级',
                    type:'line',
                    symbol:'rect',
                    data:[0.67, 0.65, 0.66, 0.77, 0.75, 0.76]
                },
                {
                    name:'C等级',
                    type:'line',
                    symbol:'triangle',
                    data:[0.61, 0.57, 0.53, 0.64, 0.63, 0.63]
                },
                {
                    name:'D等级',
                    type:'line',
                    symbol:'pin',
                    data:[0.557, 0.478666666666667, 0.412733333333333, 0.4821, 0.4984,0.496]
                },
                {
                    name:'E等级',
                    type:'line',
                    data:[0.4816, 0.3334, 0.293533333333333, 0.3365, 0.3211, 0.3486]
                }
            ]
        };

        var chart_02_option  =  {
            tooltip : {
                trigger: 'axis'
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType: {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            //                    calculable : true,
            legend: {
                data:['全市总分','趋势线--语文']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-5','5-10','10-15','15-20','20-25','25-30','30-35','35-40','40-45','45-50','50-55','55-60','60-65','65-70','70-75','75-80','80-85','85-90','90-95','95-100','100-105','105-110','110-115','115-120','120-125','125-130','130-135','135-140','140-145','145-150']

                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                }
            ],
            series : [

                {
                    name:'全市总分',
                    type:'bar',
                    data:[0, 0, 0.011527, 0.01537, 0.011527, 0.04611,0.03, 0.07, 0.08, 0.15, 0.35, 0.86,1.69,2.97,5.37,7.92,10.37,13.52,15.34,14.86,12.44,8.00,3.77,1.58,0.37,0.09,0.00,0.00,0.00,0.00]
                },
                {
                    name:'趋势线--语文',
                    type:'line',
                    //                            yAxisIndex: 1,
                    data:[0, 0, 0.011527, 0.01537, 0.011527, 0.04611,0.03, 0.07, 0.08, 0.15, 0.35, 0.86,1.69,2.97,5.37,7.92,10.37,13.52,15.34,14.86,12.44,8.00,3.77,1.58,0.37,0.09,0.00,0.00,0.00,0.00]
                }
            ]
        };

        var chart_03_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ["难度"]
            },

            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'middle',
                axisLabel:{
                    interval:0,
                    rotate:45,
                    margin:2,
                    textStyle:{
                        color:"#222"
                    }
                },

                data: ['选择题1','选择题2','选择题3','选择题4','选择题5','选择题6','选择题7','选择题8','选择题12','选择题13','9(1)','9(2)_1','9(2)_2','10_1','10_2','11','14','15','16-19','17-20','18-21','22','23','24']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'难度',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:4,
                    data:[0.34, 0.70, 0.62, 0.83, 0.44, 0.68, 0.83,0.61, 0.75, 0.53, 0.87,0.23, 0.62, 0.64,0.26, 0.33,0.69, 0.44, 0.54, 0.59, 0.35, 0.39,0.48,0.65,0.68]
                }
            ]
        }

        var scorePic8_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0.35, 0.15, 0.27, 0.10, 0.15, 0.18, 0.20, 0.25, 0.30, 0.35, 0.40, 0.45, 0.50, 0.64, 0.70, 0.72, 0.75, 0.89, 0.42, 0.55, 0.50, 0.77]

                }
            ]
        };

        var scorePic9_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[, 0.25, 0.27, 0.10, 0.32, 0.12, 0.20, 0.25, 0.30, 0.35, 0.40, 0.45, 0.51, 0.50, 0.74, 0.72, 0.71, 0.80, 0.42, 0.55, 0.50, 0.77]

                }
            ]
        };

        var scorePic10_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[, 0.15, 0.27, 0.15, 0.20, 0.23, 0.24, 0.25, 0.30, 0.37, 0.45, 0.47, 0.51, 0.51, 0.60, 0.72, 0.71, 0.75, 0.76, 0.78, 0.80, 0.90]

                }
            ]
        };

        var chart_05_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data: ['全市']
            },

            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                data: ['古诗词阅读','文言文阅读','现代文阅读','写作','语言知识和运用'],
                axisLabel:{
                    rotate:90,
                }

            },
            grid: { // 控制图的大小，调整下面这些值就可以，
                x: 40,
                x2: 100,
                y2: 100,// y2可以控制 X轴跟Zoom控件之间的间隔，避免以为倾斜后造成 label重叠到zoom上
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.72, 0.78, 0.74, 0.78,0.56,0.86]
                }
            ]
        }

        var chart_06_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {

                data: ['全市']
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
                data: ['识记','理解','运用']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.6, 0.74, 0.78]
                }
            ]
        }

        var chart_07_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全市']
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
                nameLocation:'left',
                data: ['选择题','简答题','作文题']

            },
            yAxis: {
                type: 'value'
            },
            series: [

                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.43, 0.62, 0.65]
                }
            ]
        }

        var chart_21_option  =  {
            tooltip : {
                trigger: 'axis'
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType: {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            legend: {
                data:['全市总分','趋势线--数学']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-5','5-10','10-15','15-20','20-25','25-30','30-35','35-40','40-45','45-50','50-55','55-60','60-65','65-70','70-75','75-80','80-85','85-90','90-95','95-100','100-105','105-110','110-115','115-120','120-125','125-130','130-135','135-140','140-145','145-150']
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                }
            ],
            series : [

                {
                    name:'全市总分',
                    type:'bar',
                    data:[0.03074, 0.0960611, 0.138329, 0.33813, 0.40, 0.62,0.73, 1.08, 1.39,1.71,2.36,3.14,4.33,5.85,7.396734,9.394813,10.35543,10.86647,9.886647,8.10,6.72,5.08,3.60,2.64,1.88,1.02,0.52,0.18,0.07,0.01]
                },
                {
                    name:'趋势线--数学',
                    type:'line',
                    //                            yAxisIndex: 1,
                    data:[0.03074, 0.0960611, 0.138329, 0.33813, 0.40, 0.62,0.73, 1.08, 1.39,1.71,2.36,3.14,4.33,5.85,7.396734,9.394813,10.35543,10.86647,9.886647,8.10,6.72,5.08,3.60,2.64,1.88,1.02,0.52,0.18,0.07,0.01]

                }
            ]
        };

        var chart2_16_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ["难度"]
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'middle',
                axisLabel:{
                    interval:0,
                    rotate:45,
                    margin:2,
                    textStyle:{
                        color:"#222"
                    }
                },
                //                    axisLabel : {
                //                        formatter:function(val){
                //                            return val.split("").join("\n");
                //                        }
                //
                //                    },
                data: ['选择题1','选择题2','选择题3','选择题4','选择题5','选择题6','选择题7','选择题8','9-13_1','9-13_2','9-13_3','9-13_4','9-13_5','14-15','16_1','16_2','17_1','17_2','18_1','18_2','19_1','19_2','20_1','20_2','20_3','21_1','21_2','21_3']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'难度',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:4,
                    data:[0.9, 0.88, 0.87, 0.85,0.77,0.72,0.70, 0.65,0.54, 0.71, 0.80, 0.77, 0.84, 0.94, 0.82, 0.80, 0.64, 0.60, 0.54, 0.52, 0.42, 0.40, 0.36, 0.33, 0.32, 0.20,0.22,0.19]
                }
            ]
        }

        var scorePic2_19_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0.35, 0.15, 0.27, 0.10, 0.15, 0.30, 0.35, 0.36, 0.40, 0.47, 0.48, 0.50, 0.55, 0.64, 0.70, 0.72, 0.75, 0.80, 0.88 ,0.85, 0.89, 0.88]

                }
            ]
        };

        var scorePic2_20_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[, 0.25, 0.27, 0.10, 0.32, 0.12, 0.20, 0.35, 0.30, 0.32, 0.40, 0.45, 0.51, 0.50, 0.74, 0.72, 0.71, 0.80, 0.42, 0.55, 0.50, 0.77]

                }
            ]
        };

        var scorePic2_21_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[, 0.15, 0.27, 0.20, 0.23, 0.25, 0.24, 0.25, 0.35, 0.37, 0.45, 0.47, 0.51, 0.51, 0.53, 0.60, 0.71, 0.75, 0.78, 0.90, 0.80, 0.90]

                }
            ]
        };

        var chart2_23_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'left',
                axisLabel : {
                    interval: 0,
                    formatter:function(val){
                        return val.split("").join("\n");
                    }
                },
                data: ['复数','函数与导数','常用逻辑用语','立体几何','排列组合、概率与统计','平面解析几何','平面向量与三角','数列、推理与证明','算法初步'],


            },
            grid: { // 控制图的大小，调整下面这些值就可以，
                x: 40,
                x2: 100,
                y2: 150,// y2可以控制 X轴跟Zoom控件之间的间隔，避免以为倾斜后造成 label重叠到zoom上
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.50, 0.65, 0.70, 0.45,0.53,0.60,0.55,0.53,0.42]
                }
            ]
        }

        var chart2_24_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
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
                data: ['理解','推理','应用']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.56, 0.43, 0.80]
                }
            ]
        }

        var chart2_25_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全市']
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
                nameLocation:'left',
                data: ['选择题','填空题','选做题','解答题']

            },
            yAxis: {
                type: 'value'
            },
            series: [

                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.48, 0.73, 0.90,0.67]
                }
            ]
        }

        var chart3_26_option  =  {
            tooltip : {
                trigger: 'axis'
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType: {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            legend: {
                data:['全市总分','趋势线--英语']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-5','5-10','10-15','15-20','20-25','25-30','30-35','35-40','40-45','45-50','50-55','55-60','60-65','65-70','70-75','75-80','80-85','85-90','90-95','95-100','100-105','105-110','110-115','115-120','120-125','125-130','130-135','135-140','140-145','145-150']
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                }
            ],
            series : [

                {
                    name:'全市总分',
                    type:'bar',
                    data:[0.03074, 0.0960611, 0.138329, 0.33813, 0.40, 0.62,0.73, 1.08, 1.39,1.71,2.36,3.14,4.33,5.85,7.396734,9.394813,10.35543,10.86647,9.886647,8.10,6.72,5.08,3.60,2.64,1.88,1.02,0.52,0.18,0.07,0.01]
                },
                {
                    name:'趋势线--英语',
                    type:'line',
                    data:[0.03074, 0.0960611, 0.138329, 0.33813, 0.40, 0.62,0.73, 1.08, 1.39,1.71,2.36,3.14,4.33,5.85,7.396734,9.394813,10.35543,10.86647,9.886647,8.10,6.72,5.08,3.60,2.64,1.88,1.02,0.52,0.18,0.07,0.01]
                }
            ]
        };

        var chart3_27_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ["难度"]
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'middle',
                axisLabel:{
                    interval:0,
                    rotate:45,
                    margin:2,
                    textStyle:{
                        color:"#222"
                    }
                },
                //                    axisLabel : {
                //                        formatter:function(val){
                //                            return val.split("").join("\n");
                //                        }
                //
                //                    },
                data: ['选择题1','选择题2','选择题3','选择题4','选择题5','选择题6','选择题7','选择题8','选择题9','选择10','选择11','选择12','选择13','选择14','选择15','选择26','选择27','选择28','选择29','选择30','选择31','选择32','选择33','选择34','选择35','选择36','选择37','选择38','选择39','选择40','选择41','选择42','选择43','选择44','选择45','选择46','选择47','选择48','选择49','选择50','1_16','1_17','1_18','1_19','1_20']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'难度',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:4,
                    data:[0.9, 0.88, 0.87, 0.85,0.77,0.72,0.70, 0.65,0.54, 0.71, 0.80, 0.77, 0.84, 0.94, 0.82, 0.80, 0.64, 0.60, 0.54, 0.52, 0.42, 0.40, 0.36, 0.33, 0.32, 0.20,0.22,0.19, 0.54, 0.52, 0.42, 0.40, 0.36, 0.33, 0.32, 0.20,0.22,0.19,0.64, 0.60, 0.54, 0.52, 0.42, 0.40, 0.36, 0.33]
                }
            ]
        }

        var scorePic3_30_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0.35, 0.15, 0.27, 0.10, 0.15, 0.30, 0.35, 0.30, 0.40, 0.47, 0.50, 0.52, 0.55, 0.64, 0.45, 0.72, 0.79, 0.80, 0.88 ,0.85, 0.89, 0.90]

                }
            ]
        };

        var scorePic3_31_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[, 0.25, 0.27, 0.10, 0.32, 0.12, 0.20, 0.32, 0.30, 0.35, 0.25, 0.45, 0.51, 0.50, 0.74, 0.70, 0.71, 0.79, 0.42, 0.55, 0.50, 0.78]

                }
            ]
        };

        var scorePic3_32_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[, 0.15, 0.27, 0.20, 0.23, 0.25, 0.24, 0.25, 0.35, 0.37, 0.45, 0.47, 0.51, 0.51, 0.53, 0.60, 0.71, 0.75, 0.78, 0.90, 0.80, 0.90]

                }
            ]
        };

        var chart3_34_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'left',
                axisLabel : {
                    interval: 0,
                    formatter:function(val){
                        return val.split("").join("\n");
                    }
                },
                data: ['听说','写作','语言知识及运用','阅读'],


            },
            grid: { // 控制图的大小，调整下面这些值就可以，
                x: 40,
                x2: 100,
                y2: 150,// y2可以控制 X轴跟Zoom控件之间的间隔，避免以为倾斜后造成 label重叠到zoom上
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[  0.63,0.51,0.45,0.61]
                }
            ]
        }

        var chart3_35_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
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
                data: ['识记','理解','运用']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.62, 0.52, 0.48]
                }
            ]
        }

        var chart3_36_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全市']
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
                nameLocation:'left',
                data: ['选择题','填空题','作文题','口语题']

            },
            yAxis: {
                type: 'value'
            },
            series: [

                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.57, 0.36, 0.51,0.63]
                }
            ]
        }

        var chart4_37_option  =  {
            tooltip : {
                trigger: 'axis'
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType: {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            legend: {
                data:['全市总分','趋势线--物理']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-5','5-10','10-15','15-20','20-25','25-30','30-35','35-40','40-45','45-50','50-55','55-60','60-65','65-70','70-75','75-80','80-85','85-90','90-95','95-100','100-105','105-110','110-115','115-120','120-125','125-130','130-135','135-140','140-145','145-150']

                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                }
            ],
            series : [

                {
                    name:'全市总分',
                    type:'bar',
                    data:[0, 0.03, 0.13, 0.37, 0.80, 1.35,1.78, 2.17, 2.75,3.36,4.16,5.05,5.71,6.26,6.69,7.28,7.00,7.09,6.81,6.48,6.07,5.47,4.46,3.81,2.71,1.50,0.58,0.12,0.02,0]
                },
                {
                    name:'趋势线--物理',
                    type:'line',
                    data:[0, 0.03, 0.13, 0.37, 0.80, 1.35,1.78, 2.17, 2.75,3.36,4.16,5.05,5.71,6.26,6.69,7.28,7.00,7.09,6.81,6.48,6.07,5.47,4.46,3.81,2.71,1.50,0.58,0.12,0.02,0]
                }
            ]
        };

        var chart4_38_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ["难度"]
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'middle',
                axisLabel:{
                    interval:0,
                    rotate:45,
                    margin:2,
                    textStyle:{
                        color:"#222"
                    }
                },
                //                    axisLabel : {
                //                        formatter:function(val){
                //                            return val.split("").join("\n");
                //                        }
                //
                //                    },
                data: ['选择13','选择14','选择15','选择16','双选17','双选18','双选19','双选20','双选21','34(1)_1','34(1)_2','34(2)_1','34(2)_2','34(2)_3','35_1','35_2','35_3','36_1','36_2','36_3']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'难度',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:4,
                    data:[0.47, 0.94, 0.92, 0.88,0.97,0.86,0.90, 0.68,0.73, 0.88, 0.76, 0.80, 0.82, 0.60, 0.70, 0.56, 0.41, 0.76, 0.50, 0.09]
                }
            ]
        }

        var scorePic4_41_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0,, 0.15, 0.27, 0.10, 0.15, 0.30, 0.32, 0.30, 0.40, 0.47, 0.50, 0.52, 0.56, 0.60, 0.61, 0.72, 0.79, 0.799, 0.88 ,0.85, 0.56, 0.90]

                }
            ]
        };

        var scorePic4_42_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0, 0.23, 0.18, 0.40, 0.41, 0.45, 0.60, 0.65, 0.63, 0.67, 0.75, 0.77, 0.80, 0.82, 0.84, 0.88, 0.89, 0.90, 0.91, 0.92, 0.92, 0.92]

                }
            ]
        };

        var scorePic4_43_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[, 0.15, 0.27, 0.20, 0.23, 0.25, 0.24, 0.25, 0.35, 0.37, 0.45, 0.47, 0.51, 0.51, 0.53, 0.60, 0.71, 0.75, 0.78, 0.90, 0.80, 0.90]

                }
            ]
        };

        var chart4_45_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'left',
                axisLabel : {
                    interval: 0,
                    formatter:function(val){
                        return val.split("").join("\n");
                    }
                },
                data: ['电磁学','力学','热学','实验','原子物理'],


            },
            grid: { // 控制图的大小，调整下面这些值就可以，
                x: 40,
                x2: 100,
                y2: 150,// y2可以控制 X轴跟Zoom控件之间的间隔，避免以为倾斜后造成 label重叠到zoom上
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[  0.65,0.53,0.63,0.70,0.88]
                }
            ]
        }

        var chart4_46_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
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
                data: ['识记','理解','运用']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.89, 0.44, 0.75]
                }
            ]
        }

        var chart4_47_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全市']
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
                nameLocation:'left',
                data: ['单选题','多选题','解答题']

            },
            yAxis: {
                type: 'value'
            },
            series: [

                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.50, 0.78, 0.59]
                }
            ]
        }

        var chart5_48_option  =  {
            tooltip : {
                trigger: 'axis'
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType: {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            legend: {
                data:['全市总分','趋势线--化学']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-5','5-10','10-15','15-20','20-25','25-30','30-35','35-40','40-45','45-50','50-55','55-60','60-65','65-70','70-75','75-80','80-85','85-90','90-95','95-100']

                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                }
            ],
            series : [

                {
                    name:'全市总分',
                    type:'bar',
                    data:[0.04, 0.20, 0.75, 1.10, 1.93, 2.37,3.04, 3.81, 4.49,6.06,7.63,9.53,11.02,11.78,12.08,9.85,8.03,4.62,1.48,0.19]
                },
                {
                    name:'趋势线--化学',
                    type:'line',
                    data:[0.04, 0.20, 0.75, 1.10, 1.93, 2.37,3.04, 3.81, 4.49,6.06,7.63,9.53,11.02,11.78,12.08,9.85,8.03,4.62,1.48,0.19]
                }
            ]
        };

        var chart5_49_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ["难度"]
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'middle',
                axisLabel:{
                    interval:0,
                    rotate:45,
                    margin:2,
                    textStyle:{
                        color:"#222"
                    }
                },
                //                    axisLabel : {
                //                        formatter:function(val){
                //                            return val.split("").join("\n");
                //                        }
                //
                //                    },
                data: ['选择7','选择8','选择9','选择10','选择11','选择12','双选22','双选23','30_1','30_2','30_3','30_5','31_1','31_2','31_3','31_4','31_5','31_6','32_1','32_2','32_3','32_4','32_5','33_1','33_2']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'难度',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:4,
                    data:[0.47, 0.94, 0.92, 0.88,0.97,0.86,0.90, 0.68,0.73, 0.88, 0.76, 0.80, 0.82, 0.60, 0.70, 0.56, 0.41, 0.76, 0.50, 0.9,0.80, 0.82, 0.60, 0.70,0.47, 0.94, 0.92, 0.88,0.97,]
                }
            ]
        }

        var scorePic5_52_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0.16, 0.18, 0.25, 0.26, 0.29, 0.30, 0.32, 0.35, 0.40, 0.49, 0.50, 0.55, 0.56, 0.60, 0.61, 0.72, 0.80, 0.799, 0.88 ,0.85, 0.56, 0.90]

                }
            ]
        };

        var scorePic5_53_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0, 0.18, 0.20, 0.35, 0.36, 0.45, 0.60, 0.62, 0.63, 0.67, 0.75, 0.78, 0.80, 0.80, 0.84, 0.88, 0.885, 0.90, 0.91, 0.90, 0.91, 0.92]

                }
            ]
        };

        var scorePic5_54_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0, 0.18, 0.20, 0.23, 0.25, 0.27, 0.24, 0.25, 0.35, 0.37, 0.45, 0.45, 0.51, 0.51, 0.53, 0.60, 0.71, 0.75, 0.78, 0.90, 0.80, 0.90]

                }
            ]
        };

        var chart5_56_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'left',
                axisLabel : {
                    interval: 0,
                    formatter:function(val){
                        return val.split("").join("\n");
                    }
                },
                data: ['化学平衡','离子反应','实验','氧化还原反应','有机物','元素'],


            },
            grid: { // 控制图的大小，调整下面这些值就可以，
                x: 40,
                x2: 100,
                y2: 150,// y2可以控制 X轴跟Zoom控件之间的间隔，避免以为倾斜后造成 label重叠到zoom上
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[  0.61,0.82,0.54,0.52,0.74,0.68]
                }
            ]
        }

        var chart5_57_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
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
                data: ['识记','理解','运用']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.70, 0.57, 0.59]
                }
            ]
        }

        var chart5_58_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全市']
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
                nameLocation:'left',
                data: ['单选题','多选题','解答题']

            },
            yAxis: {
                type: 'value'
            },
            series: [

                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.83, 0.65, 0.54]
                }
            ]
        }
   		
   		var chart6_59_option  =  {
            tooltip : {
                trigger: 'axis'
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType: {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            legend: {
                data:['全市总分','趋势线--生物']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-5','5-10','10-15','15-20','20-25','25-30','30-35','35-40','40-45','45-50','50-55','55-60','60-65','65-70','70-75','75-80','80-85','85-90','90-95','95-100']

                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                }
            ],
            series : [

                {
                    name:'全市总分',
                    type:'bar',
                    data:[0.00, 0.00, 0.00, 0.00, 0.00, 1.27,0, 2.53, 2.53,5.70,6.33,4.43,14.56,14.56,18.99,12.03,10.76,4.43,1.90,0]
                },
                {
                    name:'趋势线--化学',
                    type:'line',
                    data:[0.00, 0.00, 0.00, 0.00, 0.00, 1.27,0, 2.53, 2.53,5.70,6.33,4.43,14.56,14.56,18.99,12.03,10.76,4.43,1.90,0]

                }
            ]
        };

        var chart6_60_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ["难度"]
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'middle',
                axisLabel:{
                    interval:0,
                    rotate:45,
                    margin:2,
                    textStyle:{
                        color:"#222"
                    }
                },
                //                    axisLabel : {
                //                        formatter:function(val){
                //                            return val.split("").join("\n");
                //                        }
                //
                //                    },
                data: ['选择1','选择2','选择3','选择4','选择5','选择6','双选24','双选25','26_1','26_2','26_3','26_4','26_5','27_1','27_2','27_3','28_1','28_2','28_4','28_5','29前半题_1','29前半题_2','29前半题_3','29后半题_1','29后半题_2','29后半题_3','29后半题_4']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'难度',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:4,
                    data:[0.67, 0.74, 0.78, 0.84,0.88,0.52,0.46, 0.80,0.50, 0.48, 0.58, 0.70, 0.36, 0.54, 0.52, 0.20, 0.47, 0.40, 0.50, 0.70,0.78, 0.79, 0.50, 0.62,0.59, 0.94, 0.92, 0.88,0.97,0.59]
                }
            ]
        }

        var scorePic6_63_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0.21, 0.18, 0.20, 0.25, 0.29, 0.31, 0.32, 0.38, 0.40, 0.49, 0.52, 0.55, 0.54, 0.62, 0.61, 0.72, 0.80, 0.799, 0.88 ,0.80, 0.56, 0.90]

                }
            ]
        };

        var scorePic6_64_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0, 0.18, 0.22, 0.34, 0.36, 0.40, 0.55, 0.62, 0.63, 0.66, 0.68, 0.78, 0.80, 0.75, 0.84, 0.89, 0.885, 0.90, 0.91, 0.90, 0.91, 0.92]

                }
            ]
        };

        var scorePic6_65_option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['难度分布']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataZoom : {show: true},
                    dataView : {show: true},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            xAxis : [
                {
                    name:'分数',
                    type : 'category',
                    boundaryGap : false,
                    data:['0','10','20','30','40','50','60','70','70','80','90','100','110','120','130','140']
                }
            ],
            yAxis : [
                {
                    name:'得分率',
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'得分率',
                    type:'line',
                    data:[0.18, 0.23, 0.20, 0.23, 0.25, 0.30, 0.24, 0.25, 0.35, 0.37, 0.45, 0.48, 0.51, 0.51, 0.53, 0.60, 0.71, 0.78, 0.78, 0.90, 0.89, 0.90]

                }
            ]
        };

        var chart6_67_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
            },
            //                grid: {
            //                    left: '3%',
            //                    right: 80,
            //                    bottom: '3%',
            //                    containLabel: true
            //                },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                nameLocation:'left',
                axisLabel : {
                    interval: 0,
                    formatter:function(val){
                        return val.split("").join("\n");
                    }
                },
                data: ['分子与细胞','教材实验','生物与环境','探究实验','现代生物科技','遗传与进化'],


            },
            grid: { // 控制图的大小，调整下面这些值就可以，
                x: 40,
                x2: 100,
                y2: 150,// y2可以控制 X轴跟Zoom控件之间的间隔，避免以为倾斜后造成 label重叠到zoom上
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[  0.56,0.69,0.66,0.65,0.52,0.62]
                }
            ]
        }

        var chart6_68_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                //                    orient:'vertical',
                //                    top:'center',
                //                    right:0,
                data: ['全市']
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
                data: ['识记','理解','运用']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.90, 0.52, 0.50]
                }
            ]
        }

        var chart6_69_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全市']
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
                nameLocation:'left',
                data: ['单选题','多选题','解答题']

            },
            yAxis: {
                type: 'value'
            },
            series: [

                {
                    name:'全市',
                    type:'line',
                    color:['rgb(128,100,162)'],
                    symbol:'pin',
                    symbolSize:4,
                    data:[0.74, 0.63, 0.58]
                }
            ]
        }

        chart_01.setOption(chart_01_option)
        myChart.setOption(option2);
        myChart_03.setOption(option3);
        chart_02.setOption(chart_02_option);
        chart_03.setOption(chart_03_option);
        chart_08.setOption(scorePic8_option);
        chart_09.setOption(scorePic9_option);
        chart_10.setOption(scorePic10_option);
        chart_05.setOption(chart_05_option);
        chart_06.setOption(chart_06_option);
        chart_07.setOption(chart_07_option);
        chart_21.setOption(chart_21_option);
        chart2_23.setOption(chart2_23_option);
        chart2_24.setOption(chart2_24_option);
        chart2_25.setOption(chart2_25_option);

        chart2_16.setOption(chart2_16_option);
        scorePic2_19.setOption(scorePic2_19_option);
        scorePic2_20.setOption(scorePic2_20_option);
        scorePic2_21.setOption(scorePic2_21_option);

        chart3_26.setOption(chart3_26_option);
        chart3_27.setOption(chart3_27_option);
        chart3_34.setOption(chart3_34_option);
        chart3_35.setOption(chart3_35_option);
        chart3_36.setOption(chart3_36_option);

        scorePic3_30.setOption(scorePic3_30_option);
        scorePic3_31.setOption(scorePic3_31_option);
        scorePic3_32.setOption(scorePic3_32_option);

        chart4_37.setOption(chart4_37_option);
        chart4_38.setOption(chart4_38_option);
        scorePic4_41.setOption(scorePic4_41_option);
        scorePic4_42.setOption(scorePic4_42_option);
        scorePic4_43.setOption(scorePic4_43_option);
        scorePic5_52.setOption(scorePic5_52_option);
        scorePic5_53.setOption(scorePic5_53_option);
        scorePic5_54.setOption(scorePic5_54_option);

        chart4_45.setOption(chart4_45_option);
        
        chart4_46.setOption(chart4_46_option);
        chart4_47.setOption(chart4_47_option);

        chart5_48.setOption(chart5_48_option);
        chart5_49.setOption(chart5_49_option);
        chart5_56.setOption(chart5_56_option);
        chart5_57.setOption(chart5_57_option);
        chart5_58.setOption(chart5_58_option);
        chart6_59.setOption(chart6_59_option);
        chart6_60.setOption(chart6_60_option);
        scorePic6_63.setOption(scorePic6_63_option);
        scorePic6_64.setOption(scorePic6_64_option);
        scorePic6_65.setOption(scorePic6_65_option);
        chart6_67.setOption(chart6_67_option);
        chart6_68.setOption(chart6_68_option);
        chart6_69.setOption(chart6_69_option);
   

    })

</script>
	
</body>
</html>