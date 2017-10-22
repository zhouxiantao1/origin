<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>统计分析-区级</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/analysis_klass.css">
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
						<h2 class="grade_name">2016年广州市学业考试天河区分析诊断报告</h2>
						<div class="grade_type">
							<span>线上考试</span>
							<span>市级考试</span>
							<span>年级：高二</span>
							<span>报告范围：天河区</span>
						</div>
					</div>

					<div class="report clearfix">
						<!-- 左侧导航 -->
						<div class="report_list fl">
							<p class="title">自定义报告（勾选所需报告内容）</p>
							<p class="nav">报告导航</p>
							<ul>
								<li>
									<label idx='1' class="part_father"><input type="checkbox" name=""><span>1 考试概况分析</span></label>
									<ul>
										<li><label idx='11'><input type="checkbox" name=""><span>1.1 试卷质量分析</span></label></li>
										<li><label idx='12'><input type="checkbox" name=""><span>1.2 考试基本情况</span></label></li>
										<li><label idx='13'><input type="checkbox" name=""><span>1.3 各水平等级学生分析</span></label></li>
										<li><label idx='14'><input type="checkbox" name=""><span>1.4 各校考试情况分析</span></label></li>
									</ul>
								</li>

								<li>
									<label class="part_father" idx='2'><input type="checkbox" name=""><span>2 语文学科分析</span></label>
									<ul>
										<li><label idx='21'><input type="checkbox" name=""><span>2.1 命题质量分析</span></label></li>
										<li><label idx='22'><input type="checkbox" name=""><span>2.2 学科得分分析</span></label></li>
										
									</ul>
								</li>

								<li>
									<label idx='3' class="part_father"><input type="checkbox" name=""><span>3 数学学科分析</span></label>
									<ul>
										<li><label idx='31'><input type="checkbox" name=""><span>3.1 试卷质量分析</span></label></li>
										<li><label idx='32'><input type="checkbox" name=""><span>3.2 学科得分分析</span></label></li>
									</ul>
								</li>

								<li>
									<label class="part_father" idx='4'><input type="checkbox" name=""><span>4 英语学科分析</span></label>
									<ul>
										<li><label idx='41'><input type="checkbox" name=""><span>4.1 试卷质量分析</span></label></li>
										<li><label idx='42'><input type="checkbox" name=""><span>4.2 学科得分分析</span></label></li>
									</ul>
								</li>

								<li>
									<label idx='5' class="part_father"><input type="checkbox" name=""><span>5 物理学科分析</span></label>
									<ul>
										<li><label idx='51'><input type="checkbox" name=""><span>5.1 试卷质量分析</span></label></li>
										<li><label idx='52'><input type="checkbox" name=""><span>5.2 学科得分分析</span></label></li>
									</ul>
								</li>
								<li>
									<label idx='6' class="part_father"><input type="checkbox" name=""><span>6 化学</span></label>
									<ul>
										<li><label idx='61'><input type="checkbox" name=""><span>6.1 试卷质量分析</span></label></li>
										<li><label idx='62'><input type="checkbox" name=""><span>6.2 学科得分分析</span></label></li>
									</ul>
								</li>
								<li>
									<label idx='7' class="part_father"><input type="checkbox" name=""><span>7 生物学科分析</span></label>
									<ul>
										<li><label idx='71'><input type="checkbox" name=""><span>7.1 试卷质量分析</span></label></li>
										<li><label idx='72'><input type="checkbox" name=""><span>7.2 学科得分分析</span></label></li>
									</ul>
								</li>
							</ul>

						</div>
						
						<!-- 内容区域  -->
						<div class="show_report fr">

							<!-- 第一章节 -->
							<div id="part1">
								<h2>1.班级考试概况分析</h2>
								<div class="part_content" id="part11">
									<h3>1.1各科考试概况</h3>
									<p>2016年广州市学业考试的六个科目的试卷难度、区分度、信度如表1所示。其中，难度表示试卷的难易程度，难度值越高表示该学科试卷越简单； 区分度表示该学科试卷有效低鉴别能力高和能力低的考生的程度，数值越高表示该学科的区分能力越强；信度是反映考试一致性程度的指标，数值越高代表试卷的信度越好。</p>

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
							                <tr>
							                    <td class="max-bg-blue">语文</td>
							                    <td>0.60</td>
							                    <td>0.21</td>
							                    <td>0.72</td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">数学</td>
							                    <td>0.55</td>
							                    <td>0.34</td>
							                    <td>0.82</td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">英语</td>
							                    <td>0.51</td>
							                    <td>0.43</td>
							                    <td>0.90</td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">物理</td>
							                    <td>0.63</td>
							                    <td>0.46</td>
							                    <td>0.85</td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">化学</td>
							                    <td>0.62</td>
							                    <td>0.43</td>
							                    <td>0.85</td>
							                </tr>
							                <tr><td class="max-bg-blue">生物</td>
							                <td>0.60</td>
							                <td>0.45</td>
							                <td>0.72</td>

							                </tr></tbody>
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
						            <p class="tip">表4水平等级划分规则</p>
						            <table class="max-table">
						                <tbody>
						                     <tr class="max-bg-blue">
						                         <td>等级</td>
						                         <td>划分规则</td>
						                         <td>等级分数</td>
						                     </tr>
						                    <tr>
						                        <td>A等级</td>
						                        <td>X≥+1.28S</td>
						                        <td>X≥569</td>
						                    </tr>
						                     <tr>
						                         <td>B等级</td>
						                         <td>+0.43S≤X＜+1.28S</td>
						                         <td>487≤X＜569</td>
						                     </tr>
						                     <tr>
						                         <td>C等级</td>
						                         <td>-0.43S≤X＜+0.43S</td>
						                         <td>403≤X＜487</td>
						                     </tr>
						                     <tr>
						                         <td>D等级</td>
						                         <td>-1.28S≤X＜-0.43S</td>
						                         <td>321≤X＜403</td>
						                     </tr>
						                     <tr>
						                         <td>E等级</td>
						                         <td>X＜-1.28S</td>
						                         <td>X＜321</td>
						                     </tr>
						                </tbody>
						            </table>
						            <p>注：表中X表示学生总分，表示全市学生总分的平均分，S表示全市学生总分的标准差。</p>
						            <p>根据上述水平等级划分规则，广州市天河区各水平等级学生分布如图4所示：</p>
						            <div id="chart_21" class="chart_21"></div>
						            <p class="tip">图4本区各水平等级分布图</p>
						            <p>从图5可知，在本次考试中，广州市天河区学生总体上处于中上等 ，但处于A等级的学生较少，拔尖生不足。</p>

						            <div id="chart_22" class="chart_22"></div>
						            <p class="tip">图5 各水平等级分布与全市对比图</p>
						            <p>下图中，各等级学生如果在某科目上得分率显著大于其他科目，则说明该科目是本次考试拉开学生总分差距的关键科目。</p>
						            <div id="chart_23" class="chart_23"></div>

						            <p class="tip">图6各水平等级学生各科得分率对比图</p>
						            
	            				</div>
	            				<div class="reportTable" id="part14">
	            					<h3>1.4各校考试情况分析</h3>
						            <p class="tip">表5各校考试情况 </p>
						            <table class="max-table">
						                <tbody>
						                    <tr class="max-bg-blue">
						                        <td>学校</td>
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
						                    <td>广州市海珠中学</td>
						                    <td>104</td>
						                    <td>580.50</td>
						                    <td>106.00</td>
						                    <td>100.00</td>
						                    <td>117.70</td>
						                    <td>83.00</td>
						                    <td>86.00</td>
						                    <td>88.00</td>
						                </tr>
						                <tr>
						                    <td>广州市第七十六中学</td>
						                    <td>113</td>
						                    <td>575.50</td>
						                    <td>94.00</td>
						                    <td>116.00</td>
						                    <td>120.50</td>
						                    <td>75.00</td>
						                    <td>86.00</td>
						                    <td>84.00</td>
						                </tr>
						                <tr>
						                    <td>广州市广大附属实验学校</td>
						                    <td>103</td>
						                    <td>549.50</td>
						                    <td>97.00</td>
						                    <td>104.00</td>
						                    <td>106.70</td>
						                    <td>78.00</td>
						                    <td>79.00</td>
						                    <td>77.00</td>
						                </tr>
						                <tr>
						                    <td>广州市铁一中学</td>
						                    <td>95</td>
						                    <td>539.50</td>
						                    <td>98.00</td>
						                    <td>97.00</td>
						                    <td>110.70</td>
						                    <td>78.00</td>
						                    <td>79.00</td>
						                    <td>77.00</td>
						                </tr>
						                <tr>
						                    <td>北大附中广州实验学校</td>
						                    <td>75</td>
						                    <td>535.50</td>
						                    <td>105.00</td>
						                    <td>94.00</td>
						                    <td>119.70</td>
						                    <td>72.00</td>
						                    <td>86.00</td>
						                    <td>79.00</td>
						                </tr>
						                    <tr>
						                        <td>广州市海珠中学</td>
						                        <td>84</td>
						                        <td>531.50</td>
						                        <td>91.00</td>
						                        <td>123.00</td>
						                        <td>99.70</td>
						                        <td>87.00</td>
						                        <td>63.00</td>
						                        <td>68.00</td>
						                    </tr>
						                    <tr>
						                        <td>广州市第七十六中学</td>
						                        <td>113</td>
						                        <td>575.50</td>
						                        <td>94.00</td>
						                        <td>116.00</td>
						                        <td>120.50</td>
						                        <td>75.00</td>
						                        <td>86.00</td>
						                        <td>84.00</td>
						                    </tr>
						                    <tr>
						                        <td>广州市广大附属实验学校</td>
						                        <td>113</td>
						                        <td>575.50</td>
						                        <td>94.00</td>
						                        <td>116.00</td>
						                        <td>120.50</td>
						                        <td>75.00</td>
						                        <td>86.00</td>
						                        <td>84.00</td>
						                    </tr>
						                    <tr>
						                        <td>广州市铁一中学</td>
						                        <td>104</td>
						                        <td>580.50</td>
						                        <td>106.00</td>
						                        <td>100.00</td>
						                        <td>117.70</td>
						                        <td>83.00</td>
						                        <td>86.00</td>
						                        <td>88.00</td>
						                    </tr>
						                    <tr>
						                        <td>北大附中广州实验学校</td>
						                        <td>95</td>
						                        <td>539.50</td>
						                        <td>98.00</td>
						                        <td>97.00</td>
						                        <td>110.70</td>
						                        <td>78.00</td>
						                        <td>79.00</td>
						                        <td>77.00</td>
						                    </tr>
						                    <tr>
						                        <td>广州市海珠中学</td>
						                        <td>104</td>
						                        <td>580.50</td>
						                        <td>106.00</td>
						                        <td>100.00</td>
						                        <td>117.70</td>
						                        <td>83.00</td>
						                        <td>86.00</td>
						                        <td>88.00</td>
						                    </tr>
						                    <tr>
						                        <td>广州市第七十六中学</td>
						                        <td>104</td>
						                        <td>580.50</td>
						                        <td>106.00</td>
						                        <td>100.00</td>
						                        <td>117.70</td>
						                        <td>83.00</td>
						                        <td>86.00</td>
						                        <td>88.00</td>
						                    </tr>
						                    <tr>
						                        <td>广州市广大附属实验学校</td>
						                        <td>99</td>
						                        <td>575.50</td>
						                        <td>113.00</td>
						                        <td>100.00</td>
						                        <td>127.70</td>
						                        <td>79.00</td>
						                        <td>85.00</td>
						                        <td>88.00</td>
						                    </tr>
						                    <tr>
						                        <td>广州市铁一中学</td>
						                        <td>108</td>
						                        <td>570.50</td>
						                        <td>101.00</td>
						                        <td>199.00</td>
						                        <td>76.70</td>
						                        <td>98.00</td>
						                        <td>74.00</td>
						                        <td>83.00</td>
						                    </tr>
						                    <tr>
						                        <td>北大附中广州实验学校</td>
						                        <td>121</td>
						                        <td>475.50</td>
						                        <td>92.00</td>
						                        <td>90.00</td>
						                        <td>117.70</td>
						                        <td>86.00</td>
						                        <td>76.00</td>
						                        <td>95.00</td>
						                    </tr>
						                </tbody>
						            </table>
	            				</div>

	            			</div>
							
							<!-- 第二章节 -->	
							<!--2 各科详细分析-->
						    <div id="academicContent">
								<!--语文-->
					            <div id="part2">
					            	<h2 class="tacenter">2 语文学科分析</h2>
					            	<!-- 语文第一部分 -->
					            	<div class="two_one" id="part21">
						                <h3>2.1 命题质量分析</h3>
						                <div class="two_one_one" id="part211">
						                	<h4>2.1.1 全卷质量分析</h4>
							                <p class="tip">表6语文全卷质量分析</p>
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
							                        <td>0.21</td>
							                        <td>0.72</td>
							                        <td>0.87</td>
							                        <td>-0.52</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <p>注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；
							                    偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。</p>
							            </div>
										<div class="two_one_two" id="part212">
							                <h4>2.1.2 各试题详细分析</h4>
							                <p class="tip">表7语文各小题质量分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>试题</td>
							                        <td>难度</td>
							                        <td>难度区分度</td>
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
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.83</td>
							                        <td>0.30</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.61</td>
							                        <td>0.43</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.75</td>
							                        <td>0.36</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_03" class="chart_03"></div>
							                
							                <p class="tip">图7各题目的难度对比图</p>
							                <p>为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>

							                <div class="imgs"><img src="${basePath!''}/images/sandian_1.png" alt=""></div>

							                <p class="tip">图8题目质量综合评价图</p>
							                <p>根据本次语文考试各题的难度和区分度，绘制各题的散点图如下，图中落在中间靠上的题目，综合质量较高。</p>
							                <div class="imgs"><img src="${basePath!''}/images/sandian-1.png" alt=""></div>

							                <p class="tip">图9题目难度区分度散点图</p>
							                <div id="chart_24" class='chart_24'></div>
							                
							                <p class="tip">图10选择1难度分布图</p>
							                <div id="chart_25" class="chart_25"></div>
							                
							                <p class="tip">图11选择2难度分布图</p>
							                <div id="chart_27" class="chart_27"></div>
							                <p class="tip">图12选择3难度分布图</p>
							            </div>

						            </div>
									<!-- 语文第二部分 -->
									<div class="two_two" id="part22">
						                <h3>2.2 学科得分分析</h3>
						                <div class="two_two_one" id="part221">
							                <h4>2.2.1 各知识点得分情况</h4>
							                <p class="tip">表8语文各知识模块得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">知识模块</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">古诗词阅读</td>
							                        <td>6.07</td>
							                        <td>0.74</td>
							                        <td>6.46</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>15</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">文言文阅读</td>
							                        <td>12.30</td>
							                        <td>0.60</td>
							                        <td>13.52</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>26</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">现代文阅读</td>
							                        <td>16.05</td>
							                        <td>0.70</td>
							                        <td>10.01</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>25</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">写作</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">语言知识和运用</td>
							                        <td>14.47</td>
							                        <td>0.60</td>
							                        <td>14.45</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>24</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_04" class="chart_04"></div>
							                
							                <p class="tip">图14语文各知识模块得分率对比图</p>
							            </div>
							            <div class="two_two_two" id="part222">
							                <h4>2.2.2 各认知层次得分情况</h4>
							                <p class="tip">表9语文各认知层次得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">识记</td>
							                        <td>30.52</td>
							                        <td>0.65</td>
							                        <td>30.46</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>42</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">理解</td>
							                        <td>19.27</td>
							                        <td>0.55</td>
							                        <td>19.98</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">运用</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>55</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_05" class="chart_05"></div>
							                
							                <p class="tip">图15语文各认知层次得分率对比图</p>
							            </div>
							            <div class="two_two_three" id="part223">
							                <h4>2.2.3 各题得分情况</h4>
							                <p class="tip">表10语文各题型得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择题</td>
							                        <td>20.81</td>
							                        <td>0.44</td>
							                        <td>21.06</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>47</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">简答题</td>
							                        <td>28.97</td>
							                        <td>0.67</td>
							                        <td>29.38</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>43</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">作文题</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>60</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_06"  class="chart_06"></div>
							                
							                <p class="tip">图16语文各题型得分率对比图</p>
							                <p class="tip">表11语文各小题得分情况分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
							                        <td>本区得分率</td>
							                        <td>满分值</td>
							                        <td>难度</td>
							                        <td>区分度</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择1</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择2</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择4</td>
							                        <td>0.83</td>
							                        <td>3</td>
							                        <td>0.83</td>
							                        <td>0.24</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择5</td>
							                        <td>0.44</td>
							                        <td>4</td>
							                        <td>0.44</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择6</td>
							                        <td>0.66</td>
							                        <td>3</td>
							                        <td>0.68</td>
							                        <td>0.31</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.34</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.26</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.32</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
							            </div>
							            <div class="two_two_four" id="part224">
							                <h4>2.2.4 各学校得分情况</h4>
							                <p class="tip">表12各校语文得分情况 </p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>学校</td>
							                        <td>人数</td>
							                        <td>平均分</td>
							                        <td>标准差</td>
							                        <td>最高分</td>
							                        <td>最低分</td>
							                    </tr>
							                    <tr>
							                        <td>广州市海珠中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十六中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市广大附属实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市铁一中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市天河中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四十七中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市思源学校</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市华美英语实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广东广雅中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十五中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第十六中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市南海中学</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市西关外国语学校</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市培正中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>华南师范大学附属中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    </tbody>
							                </table>
							            </div>
						            </div>

					            </div>

					            <!--数学-->
					            <div id="part3">
					                <h2>3 数学学科分析</h2>
					                <div class="three_one" id="part31">
						                <h3>3.1 命题质量分析</h3>
						                <div class="three_one_one" id="part311">
							                <h4>3.1.1 全卷质量分析</h4>
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
							                        <td>0.35</td>
							                        <td>0.82</td>
							                        <td>0.45</td>
							                        <td>-0.41</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <p>注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；
							                    偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。</p>
							            </div>
							            <div class="three_one_two" id="part312">
							                <h4>3.1.2 各试题详细分析</h4>
							                <p class="tip">表14数学各小题质量分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
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
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
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
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_28" class="chart_28"></div>
							                
							                <p class="tip">图18题目难度分布</p>
							                <p>为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>
							                <div class="imgs"><img src="${basePath!''}/images/sandian_1.png" alt=""></div>
							                <p class="tip">图19题目质量综合评价图</p>
							                <p>根据本次数学考试各题的难度和区分度，绘制各题的散点图如下，图中落在中间靠上的题目，综合质量较高。</p>

							                <div class="imgs"><img src="${basePath!''}/images/sandian-1.png" alt=""></div>

							                <p class="tip">图20题目难度区分度散点图</p>
							                <div id="chart_29" class='chart_29'></div>
							                
							                <p class="tip">图21选择1难度分布图</p>
							                <div id="chart_30" class="chart_30"></div>
							                
							                <p class="tip">图22选择2难度分布图</p>
							                <div id="chart_31" class="chart_31"></div>
							                
							                <p class="tip">图23选择3难度分布图</p>
							            </div>
						            </div>

						            <div class="three_two" id="part32">	
						                <h3>3.2 学科得分分析</h3>
						                <div class="three_two_one" id="part321">
							                <h4> 3.2.1 各知识点得分情况</h4>
							                <p class="tip">表15数学各知识模块得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">知识模块</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">复数</td>
							                        <td>4.84</td>
							                        <td>0.97</td>
							                        <td>4.78</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>5</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">函数、导数与不等式</td>
							                        <td>7.91</td>
							                        <td>0.21</td>
							                        <td>8.65</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>38</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">集合、常用逻辑用语</td>
							                        <td>7.82</td>
							                        <td>0.78</td>
							                        <td>7.91</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>10</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">立体几何</td>
							                        <td>8.23</td>
							                        <td>0.43</td>
							                        <td>8.23</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>19</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">排列、组合、概率与统计</td>
							                        <td>15.10</td>
							                        <td>0.69</td>
							                        <td>15.49</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>22</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">平面解析几何</td>
							                        <td>7.44</td>
							                        <td>0.39</td>
							                        <td>7.83</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>19</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">平面向量与三角</td>
							                        <td>18.09</td>
							                        <td>0.82</td>
							                        <td>18.49</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>22</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">数列、推理与证明</td>
							                        <td>14.39 </td>
							                        <td>0.88</td>
							                        <td>18.469</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>5</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">算法初步</td>
							                        <td>8.31</td>
							                        <td>0.83</td>
							                        <td>8.16</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>10</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_33" class="chart_33"></div>
							                
							                <p class="tip">图25数学各知识模块得分率对比图</p>
							            </div>
							            <div class="three_two_two" id="part322">
							                <h4>3.2.2 各认知层次得分情况</h4>
							                <p class="tip">表16数学各认知层次得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">理解</td>
							                        <td>30.52</td>
							                        <td>0.65</td>
							                        <td>30.46</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>42</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">推理</td>
							                        <td>19.27</td>
							                        <td>0.55</td>
							                        <td>19.98</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">运用</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>55</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_34" class="chart_34"></div>
							                
							                <p class="tip">图26数学各认知层次得分率对比图</p>
							            </div>
							            <div class="three_two_three" id="part323">
							                <h4>3.2.3 各题得分情况</h4>
							                <p class="tip">表17数学各题型得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择题</td>
							                        <td>20.81</td>
							                        <td>0.44</td>
							                        <td>21.06</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">简答题</td>
							                        <td>28.97</td>
							                        <td>0.67</td>
							                        <td>29.38</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>43</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">作文题</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_35" class="chart_35"></div>
							                
							                <p class="tip">图27数学各题型得分率对比图</p>
							                <p class="tip">表18数学各小题得分情况分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
							                        <td>本区得分率</td>
							                        <td>满分值</td>
							                        <td>难度</td>
							                        <td>区分度</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择1</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择2</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择4</td>
							                        <td>0.83</td>
							                        <td>3</td>
							                        <td>0.83</td>
							                        <td>0.24</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择5</td>
							                        <td>0.44</td>
							                        <td>4</td>
							                        <td>0.44</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择6</td>
							                        <td>0.66</td>
							                        <td>3</td>
							                        <td>0.68</td>
							                        <td>0.31</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.34</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.26</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.32</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>

							            </div>
							            <div class="three_two_four" id="part324">
							                <h4>3.2.4 各学校得分情况</h4>
							                <p class="tip">表19各校数学得分情况  </p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>学校</td>
							                        <td>人数</td>
							                        <td>平均分</td>
							                        <td>标准差</td>
							                        <td>最高分</td>
							                        <td>最低分</td>
							                    </tr>
							                    <tr>
							                        <td>广州市海珠中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十六中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市广大附属实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市铁一中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市天河中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四十七中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市思源学校</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市华美英语实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广东广雅中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十五中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第十六中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市南海中学</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市西关外国语学校</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市培正中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>华南师范大学附属中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    </tbody>
							                </table>
							            </div>
						            </div>

					            </div>

            					<!--英语-->
					            <div id="part4">
					                <h2>4 英语学科分析</h2>
					                <div class="four_one" id="part41">
						                <h3>4.1 命题质量分析</h3>
						                <div class="four_one_one" id="part411">
							                <h4>4.1.1 全卷质量分析</h4>
							                <p class="tip">表20英语全卷质量分析</p>
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
							                        <td>-0.59</td>
							                        <td>-0.098</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <p>注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；
							                    偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。</p>
							            </div>
							            <div class="four_one_two" id="part412">
							                <h4>4.1.2 各试题详细分析</h4>
							                <p class="tip">表21英语各小题质量分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
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
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
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
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">口语</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_36" class="chart_36"></div>
							                
							                <p class="tip">图28题目难度分布</p>
							                <p>为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>
							                <div class="imgs"><img src="${basePath!''}/images/sandian_1.png" alt=""></div>
							                <p class="tip">图29题目质量综合评价图</p>
							                <p>根据本次数学考试各题的难度和区分度，绘制各题的散点图如下，图中落在中间靠上的题目，综合质量较高。</p>
							                <div class="imgs"><img src="${basePath!''}/images/sandian-1.png" alt=""></div>
							                <p class="tip">图30题目难度区分度散点图</p>

							                <div id="chart_37" class="chart_37"></div>
							                
							                <p class="tip">图31选择1难度分布图</p>
							                <div id="chart_38" class="chart_28"></div>
							                
							                <p class="tip">图32选择2难度分布图</p>
							                <div id="chart_39" class="chart_39"></div>
							                
							                <p class="tip">图33选择3难度分布图</p>
							            </div>
						            </div>

						            <div class="four_two" id="part42">
						                <h3>4.2 学科得分分析</h3>
						                <div class="four_two_one" id="part421">
							                <h4> 4.2.1 各知识点得分情况</h4>
							                <p class="tip">表22英语各知识模块得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">知识模块</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">听说</td>
							                        <td>4.84</td>
							                        <td>0.97</td>
							                        <td>4.78</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>5</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">写作</td>
							                        <td>7.91</td>
							                        <td>0.21</td>
							                        <td>8.65</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>38</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">语言知识及运用</td>
							                        <td>7.82</td>
							                        <td>0.78</td>
							                        <td>7.91</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>10</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">阅读</td>
							                        <td>8.23</td>
							                        <td>0.43</td>
							                        <td>8.23</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>19</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_40" class="chart_40"></div>
							                
							                <p class="tip">图35英语各知识模块得分率对比图</p>
							            </div>
							            <div class="four_two_two" id="part422">
							                <h4>4.2.2 各认知层次得分情况</h4>
							                <p class="tip">表23英语各认知层次得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">识记</td>
							                        <td>30.52</td>
							                        <td>0.65</td>
							                        <td>30.46</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>42</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">理解</td>
							                        <td>19.27</td>
							                        <td>0.55</td>
							                        <td>19.98</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">运用</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>55</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_41" class="chart_41"></div>
							                
							                <p class="tip">图36英语各认知层次得分率对比图</p>
							            </div>
							            <div class="four_two_three" id="part423">
							                <h4>4.2.3 各题得分情况</h4>
							                <p class="tip">表24英语各题型得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择题</td>
							                        <td>20.81</td>
							                        <td>0.44</td>
							                        <td>21.06</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">填空题</td>
							                        <td>28.97</td>
							                        <td>0.67</td>
							                        <td>29.38</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>43</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">作文题</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">口语题</td>
							                        <td>9.03</td>
							                        <td>0.62</td>
							                        <td>9.49</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>15</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_42" class="chart_42"></div>
							               
							                <p class="tip">图37英语各题型得分率对比图</p>
							                <p class="tip">表25英语各小题得分情况分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
							                        <td>本区得分率</td>
							                        <td>满分值</td>
							                        <td>难度</td>
							                        <td>区分度</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择1</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择2</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择4</td>
							                        <td>0.83</td>
							                        <td>3</td>
							                        <td>0.83</td>
							                        <td>0.24</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择5</td>
							                        <td>0.44</td>
							                        <td>4</td>
							                        <td>0.44</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择6</td>
							                        <td>0.66</td>
							                        <td>3</td>
							                        <td>0.68</td>
							                        <td>0.31</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.34</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.26</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.32</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
							            </div>
							            <div class="four_two_four" id="part424">
							                <h4>4.2.4 各学校得分情况</h4>
							                <p class="tip">表26各校英语得分情况   </p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>学校</td>
							                        <td>人数</td>
							                        <td>平均分</td>
							                        <td>标准差</td>
							                        <td>最高分</td>
							                        <td>最低分</td>
							                    </tr>
							                    <tr>
							                        <td>广州市海珠中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十六中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市广大附属实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市铁一中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市天河中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四十七中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市思源学校</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市华美英语实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广东广雅中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十五中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第十六中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市南海中学</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市西关外国语学校</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市培正中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>华南师范大学附属中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    </tbody>
							                </table>
										</div>
					                </div>
					        	</div>	

					        	<!--物理-->
					            <div id="part5">
					                <h2>5 物理学科分析</h2>
					                <!-- 物理第一部分 -->
					                <div class="five_one" id="part51">
						                <h3>5.1 命题质量分析</h3>
						                <div class="five_one_one" id="part511">
						                	<h4>5.1.1 全卷质量分析</h4>
							                <p class="tip">表27物理全卷质量分析</p>
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
							                        <td>-0.59</td>
							                        <td>-0.098</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <p>注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；
							                    偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。</p>
						                </div>
						                <div class="five_one_two" id="part512">
						                	<h4>5.1.2 各试题详细分析</h4>
							                <p class="tip">表28物理各小题质量分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
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
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
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
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">口语</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_43" class="chart_43"></div>
							                <p class="tip">图38题目难度分布</p>
							                <p>为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>
							                <div class="imgs"><img src="${basePath!''}/images/fenxi1.png" alt=""></div>
							                <p class="tip">图29题目质量综合评价图</p>
							                <p>根据本次数学考试各题的难度和区分度，绘制各题的散点图如下，图中落在中间靠上的题目，综合质量较高。</p>
							                <div class="imgs"><img src="${basePath!''}/images/fenxi2.png" alt=""></div>
							                <p class="tip">图30题目难度区分度散点图</p>
							                <div id="chart_44" class="chart_44"></div>
							                <p class="tip">图41选择1难度分布图</p>
                							<div id="chart_45" class='chart_45'></div>
                							<p class="tip">图42选择2难度分布图</p>
                							<div id="chart_46" class='chart_46'></div>
                							<p class="tip">图43选择3难度分布图</p>
						                </div>

						            </div>
						            <!-- 物理第二部分 -->
						            <div class="five_two" id="part52">
						                <h3>5.2 学科得分分析</h3>
						                <div class="five_two_one" id="part521">
											<h4> 5.2.1 各知识点得分情况</h4>
							                <p class="tip">表29物理各知识模块得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">知识模块</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">听说</td>
							                        <td>4.84</td>
							                        <td>0.97</td>
							                        <td>4.78</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>5</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">电磁学</td>
							                        <td>7.91</td>
							                        <td>0.21</td>
							                        <td>8.65</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>38</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">力学</td>
							                        <td>7.82</td>
							                        <td>0.78</td>
							                        <td>7.91</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>10</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">热学</td>
							                        <td>8.23</td>
							                        <td>0.43</td>
							                        <td>8.23</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>19</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">实验</td>
							                        <td>12.45</td>
							                        <td>0.69</td>
							                        <td>12.55</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>18</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">原子物理</td>
							                        <td>3.62</td>
							                        <td>0.91</td>
							                        <td>3.53</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>4</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_47" class="chart_47"></div>
							                <p class="tip">图45物理各知识模块得分率对比图</p>
						                </div>
						                <div class="five_two_two" id="part522">
							                <h4>5.2.2 各认知层次得分情况</h4>
							                <p class="tip">表30物理各认知层次得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">识记</td>
							                        <td>30.52</td>
							                        <td>0.65</td>
							                        <td>30.46</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>42</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">理解</td>
							                        <td>19.27</td>
							                        <td>0.55</td>
							                        <td>19.98</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">运用</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>55</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_48" class="chart_48"></div>
							                <p class="tip">图46物理各认知层次得分率对比图</p>
						                </div>
						                <div class="five_two_three" id="part523">
							                <h4>5.2.3 各题得分情况</h4>
							                <p class="tip">表31物理各题型得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">单选题</td>
							                        <td>20.81</td>
							                        <td>0.44</td>
							                        <td>21.06</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">多选题</td>
							                        <td>28.97</td>
							                        <td>0.67</td>
							                        <td>29.38</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>43</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">解答题</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>

							                    </tbody>
							                </table>
							                <div id="chart_49" class="chart_49"></div>
							                <p class="tip">图47物理各题型得分率对比图</p>
							                <p class="tip">表32物理各小题得分情况分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
							                        <td>本区得分率</td>
							                        <td>满分值</td>
							                        <td>难度</td>
							                        <td>区分度</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择1</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择2</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择4</td>
							                        <td>0.83</td>
							                        <td>3</td>
							                        <td>0.83</td>
							                        <td>0.24</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择5</td>
							                        <td>0.44</td>
							                        <td>4</td>
							                        <td>0.44</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择6</td>
							                        <td>0.66</td>
							                        <td>3</td>
							                        <td>0.68</td>
							                        <td>0.31</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.34</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.26</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.32</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
						                </div>
						                <div class="five_two_four" id="part524">
						                	<h4>5.2.4 各学校得分情况</h4>
							                <p class="tip">表33各校物理得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>学校</td>
							                        <td>人数</td>
							                        <td>平均分</td>
							                        <td>标准差</td>
							                        <td>最高分</td>
							                        <td>最低分</td>
							                    </tr>
							                    <tr>
							                        <td>广州市海珠中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十六中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市广大附属实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市铁一中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市天河中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四十七中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市思源学校</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市华美英语实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广东广雅中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十五中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第十六中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市南海中学</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市西关外国语学校</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市培正中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>华南师范大学附属中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    </tbody>
							                </table>
						                </div>
						            </div>
						        </div>

						        <!--化学-->
					            <div id="part6">
					                <h2>6 化学学科分析</h2>
					                <!-- 化学第一部分 -->
					                <div class="six_one" id="part61">
						                <h3>6.1 命题质量分析</h3>
						                <div class="six_one_one" id="part611">
											<h4>6.1.1 全卷质量分析</h4>
							                <p class="tip">表34化学全卷质量分析</p>
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
							                        <td>-0.59</td>
							                        <td>-0.098</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <p>注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；
							                    偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。</p>
						                </div>
						                <div class="six_one_two" id="part612">
						                	<h4>6.1.2 各试题详细分析</h4>
							                <p class="tip">表28物理各小题质量分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
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
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
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
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_50" class="chart_50"></div>
							                <p class="tip">图48题目难度分布</p>
							                <p>为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>
							                <div class="imgs"><img src="${basePath!''}/images/fenxi1.png" alt=""></div>
							                <p class="tip">图29题目质量综合评价图</p>
							                <p>根据本次数学考试各题的难度和区分度，绘制各题的散点图如下，图中落在中间靠上的题目，综合质量较高。</p>
							                <div class="imgs"><img src="${basePath!''}/images/fenxi2.png" alt=""></div>
							                <p class="tip">图30题目难度区分度散点图</p>
							                <div id="chart_51" class="chart_51"></div>
							                <p class="tip">图51选择1难度分布图</p>
							                <div id="chart_52" class="chart_52"></div>
							                <p class="tip">图52选择2难度分布图</p>
							                <div id="chart_53" class="chart_53"></div>
							                <p class="tip">图52选择2难度分布图</p>
							                <p class="tip">图53选择3难度分布图</p>
						                </div>
						            </div>
						            <!-- 化学第二部分 -->
					                <div class="six_two" id="part62">
						                <h3>6.2 学科得分分析</h3>
						                <div class="six_two_one" id="part621">
											<h4>6.2.1 各知识点得分情况</h4>
							                <p class="tip">表36化学各知识模块得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">知识模块</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">化学平衡</td>
							                        <td>4.84</td>
							                        <td>0.97</td>
							                        <td>4.78</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>5</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">离子反应</td>
							                        <td>7.91</td>
							                        <td>0.21</td>
							                        <td>8.65</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>38</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">实验</td>
							                        <td>7.82</td>
							                        <td>0.78</td>
							                        <td>7.91</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>10</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">氧化还原反应</td>
							                        <td>8.23</td>
							                        <td>0.43</td>
							                        <td>8.23</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>19</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">有机物</td>
							                        <td>12.45</td>
							                        <td>0.69</td>
							                        <td>12.55</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>18</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">元素</td>
							                        <td>3.62</td>
							                        <td>0.91</td>
							                        <td>3.53</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>4</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_54" class="chart_54"></div>
							                <p class="tip">图55化学各知识模块得分率对比图</p>
						                </div>
						                <div class="six_two_two" id="part622">
							                <h4>6.2.2 各认知层次得分情况</h4>
							                <p class="tip">表37化学各认知层次得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">识记</td>
							                        <td>30.52</td>
							                        <td>0.65</td>
							                        <td>30.46</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>42</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">理解</td>
							                        <td>19.27</td>
							                        <td>0.55</td>
							                        <td>19.98</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">运用</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>55</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_55" class="chart_55"></div>
						                	<p class="tip">图56化学各认知层次得分率对比图</p>
						                </div>
						                <div class="six_two_three" id="part623">						<h4>6.2.3 各题得分情况</h4>
							                <p class="tip">表38化学各题型得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">单选题</td>
							                        <td>20.81</td>
							                        <td>0.44</td>
							                        <td>21.06</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">多选题</td>
							                        <td>28.97</td>
							                        <td>0.67</td>
							                        <td>29.38</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>43</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">解答题</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>

							                    </tbody>
							                </table>
							                <div id="chart_56" class="chart_56"></div>
							                <p class="tip">图57化学各题型得分率对比图</p>
							                <p class="tip">表39化学各小题得分情况分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
							                        <td>本区得分率</td>
							                        <td>满分值</td>
							                        <td>难度</td>
							                        <td>区分度</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择1</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择2</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择4</td>
							                        <td>0.83</td>
							                        <td>3</td>
							                        <td>0.83</td>
							                        <td>0.24</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择5</td>
							                        <td>0.44</td>
							                        <td>4</td>
							                        <td>0.44</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择6</td>
							                        <td>0.66</td>
							                        <td>3</td>
							                        <td>0.68</td>
							                        <td>0.31</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.34</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.26</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.32</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
						                </div>
						                <div class="six_two_four" id="part624">
						                	<h4>6.2.4 各学校得分情况</h4>
							                <p class="tip">表40各校化学得分情况 </p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>学校</td>
							                        <td>人数</td>
							                        <td>平均分</td>
							                        <td>标准差</td>
							                        <td>最高分</td>
							                        <td>最低分</td>
							                    </tr>
							                    <tr>
							                        <td>广州市海珠中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十六中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市广大附属实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市铁一中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市天河中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四十七中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市思源学校</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市华美英语实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广东广雅中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十五中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第十六中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市南海中学</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市西关外国语学校</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市培正中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>华南师范大学附属中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    </tbody>
							                </table>
						                </div>
						            </div>
						        </div>

						        <!--生物-->
					            <div id="part7">
					                <h2>7 生物学科分析</h2>
					                <!-- 生物第一部分 -->
					                <div class="seven_one" id="part71">
						                <h3>7.1 命题质量分析</h3>
						                <div class="seven_one_one" id="part711">
											<h4>7.1.1 全卷质量分析</h4>
							                <p class="tip">表41生物全卷质量分析</p>
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
							                        <td>-0.59</td>
							                        <td>-0.098</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <p>注：峰度是反映学生成绩分布曲线顶端尖峭或扁平程度的指标，峰度为3表示与正态分布相同，峰度大于3表示比正态分布陡峭，小于3表示比正态分布平坦；
							                    偏度是反映学生成绩分布曲线偏斜程度的指标，大于0表示正偏态，小于0表示负偏态。</p>
						                </div>
						                <div class="seven_one_two" id="part712">
						                	<h4>7.1.2 全卷质量分析</h4>
						                	<p class="tip">表42生物各小题质量分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
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
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
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
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">口语</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_57" class="chart_57"></div>
							                <p class="tip">图58题目难度分布</p>
							                <p>为了更直观的评价每道试题的质量，根据教育测量学的评价标准，绘制出如下图所示的题目综合评价图：</p>
							             	<div class="imgs"><img src="${basePath!''}/images/fenxi1.png" alt=""></div>
							                <p class="tip">图29题目质量综合评价图</p>
							                <p>根据本次数学考试各题的难度和区分度，绘制各题的散点图如下，图中落在中间靠上的题目，综合质量较高。</p>
							             	<div class="imgs"><img src="${basePath!''}/images/fenxi2.png" alt=""></div>
							                <p class="tip">图30题目难度区分度散点图</p>
							                <div id="chart_58" class="chart_58"></div>
							                <p class="tip">图61选择1难度分布图</p>
                							<div id="chart_59" class="chart_59"></div>
                							<p class="tip">图62选择2难度分布图</p>
                							<div id="chart_60" class="chart_60"></div>
                							<p class="tip">图63选择3难度分布图</p>
						                </div>
						            </div>
						            <!-- 生物第二部分 -->
					                <div class="seven_two" id="part72">
						                <h3>7.2 命题质量分析</h3>
						                <div class="seven_two_one" id="part721">
											<h4>7.2.1 各知识点得分情况</h4>
							                <p class="tip">表43生物各知识模块得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">知识模块</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">分子与细胞</td>
							                        <td>4.84</td>
							                        <td>0.97</td>
							                        <td>4.78</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>5</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">教材实验</td>
							                        <td>7.91</td>
							                        <td>0.21</td>
							                        <td>8.65</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>38</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">生物与环境</td>
							                        <td>7.82</td>
							                        <td>0.78</td>
							                        <td>7.91</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>10</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">探究实验</td>
							                        <td>8.23</td>
							                        <td>0.43</td>
							                        <td>8.23</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>19</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">现代生物科技</td>
							                        <td>12.45</td>
							                        <td>0.69</td>
							                        <td>12.55</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>18</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">遗传与进化</td>
							                        <td>3.62</td>
							                        <td>0.91</td>
							                        <td>3.53</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>4</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_61" class="chart_61"></div>
							                <p class="tip">图65生物各知识模块得分率对比图</p>
						                </div>
						                <div class="seven_two_two" id="part722">
						                	
							                <h4>7.2.2 各认知层次得分情况</h4>
							                <p class="tip">表30物理各认知层次得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">识记</td>
							                        <td>30.52</td>
							                        <td>0.65</td>
							                        <td>30.46</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>42</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">理解</td>
							                        <td>19.27</td>
							                        <td>0.55</td>
							                        <td>19.98</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">运用</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                        <td>55</td>
							                    </tr>
							                    </tbody>
							                </table>
							                <div id="chart_62" class="chart_62"></div>
							                <p class="tip">图66生物各认知层次得分率对比图</p>
						                </div>
						                <div class="seven_two_three" id="part723">
							                <h4>7.2.3 各题得分情况</h4>
							                <p class="tip">表45生物各题型得分情况</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td rowspan="2">认知层次</td>
							                        <td colspan="2">本区情况</td>
							                        <td colspan="2">总体对比</td>
							                        <td rowspan="2">满分值</td>
							                    </tr>
							                    <tr class="max-bg-blue">
							                        <td>平均分</td>
							                        <td>得分率</td>
							                        <td colspan="2">市平均分</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">单选题</td>
							                        <td>20.81</td>
							                        <td>0.44</td>
							                        <td>21.06</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">多选题</td>
							                        <td>28.97</td>
							                        <td>0.67</td>
							                        <td>29.38</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>43</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">解答题</td>
							                        <td>41.35</td>
							                        <td>0.69</td>
							                        <td>41.09</td>
							                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                        <td>60</td>
							                    </tr>

							                    </tbody>
							                </table>
							                <div id="chart_63" class="chart_63"></div>
							                <p class="tip">图67生物各题型得分率对比图</p>
							                <p class="tip">表46生物各小题得分情况分析</p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>题号</td>
							                        <td>本区得分率</td>
							                        <td>满分值</td>
							                        <td>难度</td>
							                        <td>区分度</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择1</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择2</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择3</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择4</td>
							                        <td>0.83</td>
							                        <td>3</td>
							                        <td>0.83</td>
							                        <td>0.24</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择5</td>
							                        <td>0.44</td>
							                        <td>4</td>
							                        <td>0.44</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">选择6</td>
							                        <td>0.66</td>
							                        <td>3</td>
							                        <td>0.68</td>
							                        <td>0.31</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（1）</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">9（2）_1</td>
							                        <td>0.34</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.54</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_1</td>
							                        <td>0.26</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">10_2</td>
							                        <td>0.32</td>
							                        <td>4</td>
							                        <td>0.38</td>
							                        <td>0.45</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.87</td>
							                        <td>3</td>
							                        <td>0.87</td>
							                        <td>0.17</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">16-19</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">20</td>
							                        <td>0.36</td>
							                        <td>3</td>
							                        <td>0.34</td>
							                        <td>0.36</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">22</td>
							                        <td>0.33</td>
							                        <td>3</td>
							                        <td>0.44</td>
							                        <td>0.56</td>
							                    </tr>
							                    <tr>
							                        <td class="max-bg-blue">24</td>
							                        <td>0.7</td>
							                        <td>3</td>
							                        <td>0.70</td>
							                        <td>0.29</td>
							                    </tr>
							                    </tbody>
							                </table>
						                </div>
						                <div class="seven_two_four" id="part724">
						                	<h4>7.2.4 各学校得分情况</h4>
							                <p class="tip">表47各校生物得分情况 </p>
							                <table class="max-table">
							                    <tbody>
							                    <tr class="max-bg-blue">
							                        <td>学校</td>
							                        <td>人数</td>
							                        <td>平均分</td>
							                        <td>标准差</td>
							                        <td>最高分</td>
							                        <td>最低分</td>
							                    </tr>
							                    <tr>
							                        <td>广州市海珠中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十六中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市广大附属实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市铁一中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市天河中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四十七中学</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市思源学校</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市华美英语实验学校</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广东广雅中学</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第七十五中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第十六中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
							                    </tr>
							                    <tr>
							                        <td>北大附中广州实验学校</td>
							                        <td>104</td>
							                        <td>106</td>
							                        <td>13.22</td>
							                        <td>136</td>
							                        <td>52</td>
							                    </tr>
							                    <tr>
							                        <td>广州市第四中学</td>
							                        <td>75</td>
							                        <td>105.67</td>
							                        <td>12.11</td>
							                        <td>134</td>
							                        <td>59</td>
							                    </tr>
							                    <tr>
							                        <td>广州市南海中学</td>
							                        <td>95</td>
							                        <td>98</td>
							                        <td>14.44</td>
							                        <td>127</td>
							                        <td>56</td>
							                    </tr>
							                    <tr>
							                        <td>广州市西关外国语学校</td>
							                        <td>113</td>
							                        <td>99</td>
							                        <td>12.00</td>
							                        <td>127</td>
							                        <td>60</td>
							                    </tr>
							                    <tr>
							                        <td>广州市培正中学</td>
							                        <td>100</td>
							                        <td>96</td>
							                        <td>12.34</td>
							                        <td>139</td>
							                        <td>53</td>
							                    </tr>
							                    <tr>
							                        <td>华南师范大学附属中学</td>
							                        <td>108</td>
							                        <td>90</td>
							                        <td>14.56</td>
							                        <td>130</td>
							                        <td>75</td>
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
		selected();   //选择显示
		
		var chart_01 = echarts.init(document.getElementById('chart_01'));
		var chart_03 = echarts.init(document.getElementById('chart_03'));
		var chart_04 = echarts.init(document.getElementById('chart_04'));
		var chart_05 = echarts.init(document.getElementById('chart_05'));
		var chart_06 = echarts.init(document.getElementById('chart_06'));

		var chart_21 = echarts.init(document.getElementById('chart_21'));
		var chart_22 = echarts.init(document.getElementById('chart_22'));
		var chart_23 = echarts.init(document.getElementById('chart_23'));
		var chart_24 = echarts.init(document.getElementById('chart_24'));
		var chart_25 = echarts.init(document.getElementById('chart_25'));
		var chart_27 = echarts.init(document.getElementById('chart_27'));
		var chart_28 = echarts.init(document.getElementById('chart_28'));
		var chart_29 = echarts.init(document.getElementById('chart_29'));
		var chart_30 = echarts.init(document.getElementById('chart_30'));
		var chart_31 = echarts.init(document.getElementById('chart_31'));
		var chart_33 = echarts.init(document.getElementById('chart_33'));
		var chart_34 = echarts.init(document.getElementById('chart_34'));
		var chart_35 = echarts.init(document.getElementById('chart_35'));
		var chart_36 = echarts.init(document.getElementById('chart_36'));
		var chart_37 = echarts.init(document.getElementById('chart_37'));
		var chart_38 = echarts.init(document.getElementById('chart_38'));
		var chart_39 = echarts.init(document.getElementById('chart_39'));
		var chart_40 = echarts.init(document.getElementById('chart_40'));
		var chart_41 = echarts.init(document.getElementById('chart_41'));
		var chart_42 = echarts.init(document.getElementById('chart_42'));
		var chart_43 = echarts.init(document.getElementById('chart_43'));
		var chart_44 = echarts.init(document.getElementById('chart_44'));
		var chart_45 = echarts.init(document.getElementById('chart_45'));
		var chart_46 = echarts.init(document.getElementById('chart_46'));
		var chart_47 = echarts.init(document.getElementById('chart_47'));
		var chart_48 = echarts.init(document.getElementById('chart_48'));
		var chart_49 = echarts.init(document.getElementById('chart_49'));
		var chart_50 = echarts.init(document.getElementById('chart_50'));
		var chart_51 = echarts.init(document.getElementById('chart_51'));
		var chart_52 = echarts.init(document.getElementById('chart_52'));
		var chart_53 = echarts.init(document.getElementById('chart_53'));
		var chart_54 = echarts.init(document.getElementById('chart_54'));
		var chart_55 = echarts.init(document.getElementById('chart_55'));
		var chart_56 = echarts.init(document.getElementById('chart_56'));
		var chart_57 = echarts.init(document.getElementById('chart_57'));
		var chart_58 = echarts.init(document.getElementById('chart_58'));
		var chart_59 = echarts.init(document.getElementById('chart_59'));
		var chart_60 = echarts.init(document.getElementById('chart_60'));
		var chart_61 = echarts.init(document.getElementById('chart_61'));
		var chart_62 = echarts.init(document.getElementById('chart_62'));
		var chart_63 = echarts.init(document.getElementById('chart_63'));
		


        var  chart_21_option = {
            tooltip : {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data: ['A等级','B等级','C等级','D等级','E等级']
            },
            series : [
                {
                    type: 'pie',
                    radius : '55%',
                    center: ['50%', '50%'],
                    data:[
                        {value:6.14, name:'A等级6.14%'},
                        {value:26.50, name:'B等级，26.50%'},
                        {value:40.39, name:'C等级,40.39%'},
                        {value:18.61, name:'D等级,18.61%'},
                        {value:8.56, name:'E等级,8.56%'}
                    ],
                    itemStyle: {
                        emphasis: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    },
                }
            ]
        };
                

		var chart_01_option = {
                tooltip: {
                    trigger: 'axis'
                },
                toolbox: {
                    feature: {
                        dataView: {show: true, readOnly: false},
                        magicType: {show: true, type: ['line', 'bar']},
                        restore: {show: true},
                        saveAsImage: {show: true}
                    }
                },
                legend: {
                    data:['本区','全市','趋势线-本区','趋势线-全市']
                },
                xAxis: [
                    {
                        type: 'category',
                        data: ['0-50','50-100','100-150','150-200','200-250','250-300','300-350','350-400','400-450','450-500','500-550','550-600','600-650','650-700','700-750'],
                        axisLabel : {
                            rotate:90,

                        }

                        }
                ],
                yAxis: [
                    {
                        type: 'value',
                        min: 0,
                        max: 30,
                        interval: 5,
                        axisLabel: {
                            formatter: '{value} %'
                        }
                    }
                ],
                series: [
                    {
                        name:'本区',
                        type:'bar',
                        data:[0.0, 0.0, 7.0,11.2, 12.6, 13.7, 15.6, 20.2, 23.6, 20.0, 6.4, 3.3,2.11,1.0,0.0]
                    },
                    {
                        name:'全市',
                        type:'bar',
                        data:[0.0, 0.0, 0.1,2.54, 3.7, 7.7, 11.6, 15.2, 20.7, 18.8, 10.0, 5.44,3.11,0.8,0.0]
                    },
                    {
                        name:'趋势线-本区',
                        type:'line',
                        data:[0.0, 0.0, 0.1,2.54, 3.7, 7.7, 11.6, 15.2, 20.7, 18.8, 10.0, 5.44,3.11,0.8,0.0]
                    },
                    {
                        name:'趋势线-全市',
                        type:'line',
                        data:[0.0, 0.0, 7.0,11.2, 12.6, 13.7, 15.6, 20.2, 23.6, 20.0, 6.4, 3.3,2.11,1.0,0.0]
                    }
                ]
            }

       var chart_22_option = {
	            tooltip: {
	                trigger: 'axis'
	            },
	            toolbox: {
	                feature: {
	                    dataView: {show: true, readOnly: false},
	                    magicType: {show: true, type: ['line', 'bar']},
	                    restore: {show: true},
	                    saveAsImage: {show: true}
	                }
	            },
	            legend: {
	                data:['本区','全市'],
	                right:30,
	                top:200,
	                orient:'vertical'
	            },
	            xAxis: [
	                {
	                    type: 'category',
	                    data: ['A等级','B等级','C等级','D等级','E等级']
	                }
	            ],
	            yAxis: [
	                {
	                    type: 'value',
	                    min: 0,
	                    max: 45,
	                    interval: 5,
	                    axisLabel: {
	                        formatter: '{value} %'
	                    }
	                }
	            ],
	            series: [
	                {
	                    name:'本区',
	                    type:'bar',
	                    data:[5,26, 40,17, 7]
	                },
	                {
	                    name:'全市',
	                    type:'bar',
	                    data:[11, 26, 33,17, 10]
	                }
	            ]
	        }

	    var chart_23_option = {
                title: {

                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    orient:'vertical',
                    top:'center',
                    right:0,
                    data: ['A等级','B等级','C等级','D等级','E等级']
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
                    data: ['语文','数学','英语','物理','化学','生物'],
                },
                yAxis: {
                    type: 'value',
                    max:1.00,
                    min:0,
                    interval:0.10
                },
                series: [
                    {
                        name:'A等级',
                        type:'line',
                        color:['rgb(79,129,189)'],
                        symbol:'diamond',
                        symbolSize:15,
                        data:[0.55, 0.30, 0.32, 0.30,0.35,0.56]
                    },
                    {
                        name:'B等级',
                        type:'line',
                        color:['rgb(192,80,77)'],
                        symbol:'rect',
                        symbolSize:15,
                        data:[0.62, 0.63, 0.68, 0.65,0.67,0.45]
                    },
                    {
                        name:'C等级',
                        type:'line',
                        color:['rgb(155,187,89)'],
                        symbol:'triangle',
                        symbolSize:15,
                        data:[0.60, 0.55, 0.64, 0.62,0.6,0.34]
                    },
                    {
                        name:'D等级',
                        type:'line',
                        color:['rgb(128,100,162)'],
                        symbol:'pin',
                        symbolSize:15,
                        data:[0.60, 0.46, 0.42, 0.48,0.47,0.58]
                    },
                    {
                        name:'E等级',
                        type:'line',
                        color:['#ff6600'],
                        symbol:'pin',
                        symbolSize:15,
                        data:[0.60, 0.46, 0.42, 0.48,0.47,0.48]
                    }

                ]
            }
           
        var chart_03_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['选择1','选择2','选择3','选择4','选择5','选择6','9（1）','9（2）_1','10_1','10_2','11','14','16-19','17-20','18-21','22','23','24']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75,0.81,0.34,0.47,0.55,0.76,0.61,0.66,0.59,0.77,0.44,0.67]
                }
            ]
        }

        var chart_24_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75]
                }
            ]
        }

        var chart_25_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.5,0.3,0.7,0.3]
                }
            ]
        }

        var chart_27_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.7,0.1,0.3,0.6]
                }
            ]
        }

        var chart_04_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['古诗词阅读','文言文阅读','现代文阅读','写作','语言知识和运用']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.40, 0.60, 0.70, 0.69,0.60]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.50, 0.63, 0.74, 0.65,0.66]
                }
            ]
        }

        var chart_05_option = {
	        tooltip: {
	            trigger: 'axis'
	        },
	        legend: {
	            orient:'vertical',
	            top:'center',
	            right:0,
	            data: ['全区','全市']
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
	            type: 'value',
	            min:0,
	            max:1.0,
	            interval:0.2
	        },
	        series: [
	            {
	                name:'全区',
	                type:'line',
	                color:['rgb(79,129,189)'],
	                symbol:'triangle',
	                symbolSize:15,
	                data:[0.63, 0.56, 0.68]
	            },
	            {
	                name:'全市',
	                type:'line',
	                color:['rgb(192,80,77)'],
	                symbol:'pin',
	                symbolSize:15,
	                data:[0.64, 0.58, 0.70]
	            }
	        ]
	    }

	    var chart_06_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.41, 0.65, 0.61]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.42, 0.66, 0.63]
                }
            ]
        }

        var chart_28_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['选择1','选择2','选择3','选择4','选择5','选择6','9（1）','9（2）_1','10_1','10_2','11','14','16-19','17-20','18-21','22','23','24']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75,0.81,0.34,0.47,0.55,0.76,0.61,0.66,0.59,0.77,0.44,0.67]
                }
            ]
        }

        var chart_29_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75]
                }
            ]
        }

        var chart_30_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.5,0.3,0.7,0.3]
                }
            ]
        }

        var chart_31_option = {
	        tooltip: {
	            trigger: 'axis'
	        },
	        legend: {
	            orient:'vertical',
	            top:'center',
	            right:0,
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
	            data: ['20','40','60','80','100','120','140']
	        },
	        yAxis: {
	            type: 'value',
	            max:1,
	            min:0,
	            interval:0.2
	        },
	        series: [
	            {
	                type:'line',
	                color:['rgb(79,129,189)'],
	                symbol:'diamond',
	                symbolSize:15,
	                data:[0.2,0.3,0.4,0.7,0.1,0.3,0.6]
	            }
	        ]
	    }
        
        var chart_33_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['复数','函数、导数与不等式','集合、常用逻辑用语','立体几何','排列、组合、概率与统计','平面解析几何','平面向量与三角','数列、推理与证明','算法初步'],
                axisLabel : {
                    formatter:function(val){
                        return val.split("").join("\n");
                    }

                }
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.40, 0.60, 0.70, 0.69,0.60,0.2,0.6,0.45]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.50, 0.63, 0.74, 0.65,0.66,0.3,0.61,0.48]
                }
            ]
        }

        var chart_34_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['理解','推理','运用']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.63, 0.56, 0.68]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.64, 0.58, 0.70]
                }
            ]
        }

        var chart_35_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['解答题','填空题','选择题','选做题']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.41, 0.70, 0.69,0.9]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.41, 0.70, 0.68,0.89]
                }
            ]
        }

        var chart_36_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['选择1','选择2','选择3','选择4','选择5','选择6','9（1）','9（2）_1','10_1','10_2','11','14','16-19','17-20','18-21','22','23','24']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75,0.81,0.34,0.47,0.55,0.76,0.61,0.66,0.59,0.77,0.44,0.67]
                }
            ]
        }

        var chart_37_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75]
                }
            ]
        }

        var chart_38_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.5,0.3,0.7,0.3]
                }
            ]
        }

        var chart_39_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.7,0.1,0.3,0.6]
                }
            ]
        }

        var chart_40_option = {
	        tooltip: {
	            trigger: 'axis'
	        },
	        legend: {
	            orient:'vertical',
	            top:'center',
	            right:0,
	            data: ['全区','全市']
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
	            data: ['听说能力','写作能力','语言知识及运用能力','阅读能力']
	        },
	        yAxis: {
	            type: 'value',
	            min:0,
	            max:1.0,
	            interval:0.2
	        },
	        series: [
	            {
	                name:'全区',
	                type:'line',
	                color:['rgb(79,129,189)'],
	                symbol:'triangle',
	                symbolSize:15,
	                data:[0.60, 0.50, 0.40, 0.60]
	            },
	            {
	                name:'全市',
	                type:'line',
	                color:['rgb(192,80,77)'],
	                symbol:'pin',
	                symbolSize:15,
	                data:[0.60, 0.50, 0.43, 0.60]
	            }
	        ]
	    }

	    var chart_41_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.63, 0.56, 0.68]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.64, 0.58, 0.70]
                }
            ]
        }

        var chart_42_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['选择题','填空题','作文题','口语题']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.41, 0.70, 0.69,0.9]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.41, 0.70, 0.68,0.89]
                }
            ]
        }

        var chart_43_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['选择1','选择2','选择3','选择4','选择5','选择6','9（1）','9（2）_1','10_1','10_2','11','14','16-19','17-20','18-21','22','23','24']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75,0.81,0.34,0.47,0.55,0.76,0.61,0.66,0.59,0.77,0.44,0.67]
                }
            ]
        }

        var chart_44_option = {
	        tooltip: {
	            trigger: 'axis'
	        },
	        legend: {
	            orient:'vertical',
	            top:'center',
	            right:0,
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
	            data: ['20','40','60','80','100','120','140']
	        },
	        yAxis: {
	            type: 'value',
	            max:1,
	            min:0,
	            interval:0.2
	        },
	        series: [
	            {
	                type:'line',
	                color:['rgb(79,129,189)'],
	                symbol:'diamond',
	                symbolSize:15,
	                data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75]
	            }
	        ]
	    }

	    var chart_45_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.5,0.3,0.7,0.3]
                }
            ]
        }

        var chart_46_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.7,0.1,0.3,0.6]
                }
            ]
        }

        var chart_47_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['电磁学','力学','热学','实验','原子物理']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.60, 0.50, 0.40, 0.60,0.9]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.60, 0.50, 0.43, 0.60,0.89]
                }
            ]
        }

        var chart_48_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.63, 0.56, 0.68]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.64, 0.58, 0.70]
                }
            ]
        }

        var chart_49_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['单选题','多选题','解答题']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.78, 0.76, 0.43]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.78, 0.76, 0.45]
                }
            ]
        }

        var chart_50_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['选择1','选择2','选择3','选择4','选择5','选择6','9（1）','9（2）_1','10_1','10_2','11','14','16-19','17-20','18-21','22','23','24']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75,0.81,0.34,0.47,0.55,0.76,0.61,0.66,0.59,0.77,0.44,0.67]
                }
            ]
        }

        var chart_51_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75]
                }
            ]
        }

        var chart_52_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.5,0.3,0.7,0.3]
                }
            ]
        }

        var chart_53_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.7,0.1,0.3,0.6]
                }
            ]
        }

        var chart_54_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['化学平衡','离子反应','实验','氧化还原反应','有机物','元素']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.60, 0.50, 0.40, 0.60,0.9,0.6]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.60, 0.50, 0.43, 0.60,0.89,0.58]
                }
            ]
        }

        var chart_55_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.63, 0.56, 0.68]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.64, 0.58, 0.70]
                }
            ]
        }
  		
  		var chart_56_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['单选题','多选题','解答题']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.78, 0.76, 0.43]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.78, 0.76, 0.45]
                }
            ]
        }

        var chart_57_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['选择1','选择2','选择3','选择4','选择5','选择6','9（1）','9（2）_1','10_1','10_2','11','14','16-19','17-20','18-21','22','23','24']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75,0.81,0.34,0.47,0.55,0.76,0.61,0.66,0.59,0.77,0.44,0.67]
                }
            ]
        }

        var chart_58_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.7,0.6,0.5,0.3,0.4,0.75]
                }
            ]
        }

        var chart_59_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.5,0.3,0.7,0.3]
                }
            ]
        }

        var chart_60_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
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
                data: ['20','40','60','80','100','120','140']
            },
            yAxis: {
                type: 'value',
                max:1,
                min:0,
                interval:0.2
            },
            series: [
                {
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'diamond',
                    symbolSize:15,
                    data:[0.2,0.3,0.4,0.7,0.1,0.3,0.6]
                }
            ]
        }

        var chart_61_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['分子与细胞','教材实验','生物与环境','探究实验','现代生物科技','遗传与进化']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.60, 0.50, 0.40, 0.60,0.9,0.6]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.60, 0.50, 0.43, 0.60,0.89,0.62]
                }
            ]
        }

        var chart_62_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.63, 0.56, 0.68]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.64, 0.58, 0.70]
                }
            ]
        }

        var chart_63_option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                orient:'vertical',
                top:'center',
                right:0,
                data: ['全区','全市']
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
                data: ['单选题','多选题','解答题']
            },
            yAxis: {
                type: 'value',
                min:0,
                max:1.0,
                interval:0.2
            },
            series: [
                {
                    name:'全区',
                    type:'line',
                    color:['rgb(79,129,189)'],
                    symbol:'triangle',
                    symbolSize:15,
                    data:[0.78, 0.76, 0.43]
                },
                {
                    name:'全市',
                    type:'line',
                    color:['rgb(192,80,77)'],
                    symbol:'pin',
                    symbolSize:15,
                    data:[0.78, 0.76, 0.45]
                }
            ]
        }

		chart_01.setOption(chart_01_option);

		chart_03.setOption(chart_03_option);
		chart_04.setOption(chart_04_option);
		chart_05.setOption(chart_05_option);
		chart_06.setOption(chart_06_option);

		chart_21.setOption(chart_21_option);
		chart_22.setOption(chart_22_option);
		chart_23.setOption(chart_23_option);
		chart_24.setOption(chart_24_option);
		chart_25.setOption(chart_25_option);
		chart_25.setOption(chart_25_option);
		chart_27.setOption(chart_27_option);
		chart_28.setOption(chart_28_option);
		chart_29.setOption(chart_29_option);
		chart_30.setOption(chart_30_option);
		chart_31.setOption(chart_31_option);
		chart_33.setOption(chart_33_option);
		chart_34.setOption(chart_34_option);
		chart_35.setOption(chart_35_option);
		chart_36.setOption(chart_36_option);
		chart_37.setOption(chart_37_option);
		chart_38.setOption(chart_38_option);
		chart_39.setOption(chart_39_option);
		chart_40.setOption(chart_40_option);
		chart_41.setOption(chart_41_option);
		chart_42.setOption(chart_42_option);
		chart_43.setOption(chart_43_option);
		chart_44.setOption(chart_44_option);
		chart_45.setOption(chart_45_option);
		chart_46.setOption(chart_46_option);
		chart_47.setOption(chart_47_option);
		chart_48.setOption(chart_48_option);
		chart_49.setOption(chart_49_option);
		chart_50.setOption(chart_50_option);
		chart_51.setOption(chart_51_option);
		chart_52.setOption(chart_52_option);
		chart_53.setOption(chart_53_option);
		chart_54.setOption(chart_54_option);
		chart_55.setOption(chart_55_option);
		chart_56.setOption(chart_56_option);
		chart_57.setOption(chart_57_option);
		chart_58.setOption(chart_58_option);
		chart_59.setOption(chart_59_option);
		chart_60.setOption(chart_60_option);
		chart_61.setOption(chart_61_option);
		chart_62.setOption(chart_62_option);
		chart_63.setOption(chart_63_option);
		
	})

</script>
</body>
</html>