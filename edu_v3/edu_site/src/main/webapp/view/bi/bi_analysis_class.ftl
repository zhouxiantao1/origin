<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>统计分析-班级</title>
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
						<!-- <div class="export clearfix"><button class="fr">导出分析报告</button></div> -->
						<h2 class="grade_name">广州市天河中学高二（1）班2016年广州市学业考试班级分析诊断报告</h2>
						<div class="grade_type">
							<span>线上考试</span>
							<span>市级考试</span>
							<span>年级：高二</span>
							<span>报告范围：班级</span>
						</div>
					</div>

					<div class="report clearfix">
						<div class="report_list fl">
							<p class="title">自定义报告（勾选所需报告内容）</p>
							<p class="nav">报告导航</p>
							<ul>
								<li>
									<label idx='1' class="part_father"><input checked type="checkbox" name=""><span>1 考试概况分析</span></label>
									<ul>
										<li><label idx='11'><input checked type="checkbox" name=""><span>1.1 试卷质量分析</span></label></li>
										<li><label idx='12'><input checked type="checkbox" name=""><span>1.2 考试基本情况</span></label></li>
										<li><label idx='13'><input checked type="checkbox" name=""><span>1.3 个水平等级学生分析</span></label></li>
									</ul>
								</li>

								<li>
									<label class="part_father" idx='2'><input type="checkbox" name=""><span>2 各科成绩详细分析</span></label>
									<ul>
										<li>
											<label idx='21' class="part_father"><input type="checkbox" name=""><span>2.1 语文学科分析</span></label>
											<ul>
												<li><label idx='211'><input type="checkbox" name=""><span>2.1.1 各知识模块掌握情况分</span></label></li>
												<li><label idx='212'><input type="checkbox" name=""><span>2.1.2 各题型得分情况分析</span></label></li>
												<li><label idx='213'><input type="checkbox" name=""><span>2.1.3 各认知层次得分情况分</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='22' class="part_father"><input type="checkbox" name=""><span>2.2 数学学科分析</span></label>
											<ul>
												<li><label idx='221'><input type="checkbox" name=""><span>2.2.1 各知识模块掌握情况分</span></label></li>
												<li><label idx='222'><input type="checkbox" name=""><span>2.2.2 各题型得分情况分析</span></label></li>
												<li><label idx='223'><input type="checkbox" name=""><span>2.2.3 各认知层次得分情况分</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='23' class="part_father"><input type="checkbox" name=""><span>2.3 英语学科分析</span></label>
											<ul>
												<li><label idx='231'><input type="checkbox" name=""><span>2.3.1 各知识模块掌握情况分</span></label></li>
												<li><label idx='232'><input type="checkbox" name=""><span>2.3.2 各题型得分情况分析</span></label></li>
												<li><label idx='233'><input type="checkbox" name=""><span>2.3.3 各认知层次得分情况分</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='24' class="part_father"><input type="checkbox" name=""><span>2.4 物理学科分析</span></label>
											<ul>
												<li><label idx='241'><input type="checkbox" name=""><span>2.4.1 各知识模块掌握情况分</span></label></li>
												<li><label idx='242'><input type="checkbox" name=""><span>2.4.2 各题型得分情况分析</span></label></li>
												<li><label idx='243'><input type="checkbox" name=""><span>2.4.3 各认知层次得分情况分</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='25' class="part_father"><input type="checkbox" name=""><span>2.5 化学学科分析</span></label>
											<ul>
												<li><label idx='251'><input type="checkbox" name=""><span>2.5.1 各知识模块掌握情况分</span></label></li>
												<li><label idx='252'><input type="checkbox" name=""><span>2.5.2 各题型得分情况分析</span></label></li>
												<li><label idx='253'><input type="checkbox" name=""><span>2.5.3 各认知层次得分情况分析</span></label></li>
											</ul>
										</li>
										<li>
											<label idx='26' class="part_father"><input type="checkbox" name=""><span>2.6 生物学科分析</span></label>
											<ul>
												<li><label idx='261'><input type="checkbox" name=""><span>2.6.1 各知识模块掌握情况分</span></label></li>
												<li><label idx='262'><input type="checkbox" name=""><span>2.6.2 各题型得分情况分析</span></label></li>
												<li><label idx='263'><input type="checkbox" name=""><span>2.6.3 各认知层次得分情况分</span></label></li>
											</ul>
										</li>
										
									</ul>
								</li>
								<li>
									<label idx='3' class="part_father"><input type="checkbox" name=""><span>附表</span></label>
								</li>
							</ul>

						</div>

						<div class="show_report fr">
							<div class="chapter_one" id="part1">
								<h2>1.班级考试概况分析</h2>
								<div class="part_content" class="part_one_one" id="part11">
									<h3>1.1各科考试概况</h3>
									<p>广州市天河中学高二（1）班共51人参加了2016年广州市学业统考[考试名称]，全班在本次考试中的表现，如表1所示。与所在学校、所属区域及全市的平均分相比，除语文和化学外，广州市天河中学高二（1）班在本次考试中各科成绩均高于全校平均分、荔湾平均分和全市平均分。</p>

									<!--1.1 表1-->
						            <div id="biao1" class="reportTable">
						                <p class="tacenter">表1班级各科分数汇总表</p>
						                <table border="1">
						                    <thead>
						                    <tr>
						                        <th rowspan="2">科目</th>
						                        <th colspan="4">班级情况</th>
						                        <th colspan="6">总体对比</th>
						                    </tr>
						                    <tr>
						                        <th>平均分</th>
						                        <th>标准差</th>
						                        <th>最高分</th>
						                        <th>最低分</th>
						                        <th colspan="2">校平均分</th>
						                        <th colspan="2">区平均分</th>
						                        <th colspan="2">市平均分</th>

						                    </tr>
						                    </thead>
						                    <tbody>
						                    <tr>
						                        <td class="max-bg-blue">总分</td>
						                        <td>465.51</td>
						                        <td>26.87</td>
						                        <td>649</td>
						                        <td>117</td>
						                        <td>437.89</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>437.89</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>437.30</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                    </tr>
						                    <tr>
						                        <td class="max-bg-blue">语文</td>
						                        <td>97.20</td>
						                        <td>11.06</td>
						                        <td>102</td>
						                        <td>77</td>
						                        <td>91.14</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>98.32</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>90.3</td>
						                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
						                    </tr>
						                    <tr>
						                        <td class="max-bg-blue">数学</td>
						                        <td>95.77</td>
						                        <td>14.06</td>
						                        <td>130</td>
						                        <td>54</td>
						                        <td>86.81</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>89.67</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>69.57</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                    </tr>
						                    <tr>
						                        <td class="max-bg-blue">英语</td>
						                        <td>97.02</td>
						                        <td>16.06</td>
						                        <td>102</td>
						                        <td>36</td>
						                        <td>45.14</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>91.14</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>90.3</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                    </tr>
						                    <tr>
						                        <td class="max-bg-blue">物理</td>
						                        <td>76.32</td>
						                        <td>23.06</td>
						                        <td>123</td>
						                        <td>22</td>
						                        <td>89.14</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>99.14</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>89.3</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                    </tr>
						                    <tr>
						                        <td class="max-bg-blue">化学</td>
						                        <td>89.6</td>
						                        <td>52.06</td>
						                        <td>133</td>
						                        <td>94.0</td>
						                        <td>96</td>
						                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
						                        <td>89.6</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>95</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                    </tr>
						                    <tr>
						                        <td class="max-bg-blue">生物</td>
						                        <td>65.32</td>
						                        <td>13.0</td>
						                        <td>128</td>
						                        <td>63</td>
						                        <td>89.6</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>78.6</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                        <td>90.3</td>
						                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
						                    </tr>
						                    </tbody>
						                </table>
						            </div>
						            <div id="pic_one"></div>
						            <p class="tacenter">图 1总分分数段分布对比图</p>
								</div>

								<div class="reportTable" class="part_one_two" id="part12">
						            <h3>1.2 各水平等级学生分布</h3>
						            <!--表3-->
						            <div id="biao3" class="reportTable">
						                <p class="fenxiText">不同水平等级的学生，学习过程会有所区别。对不同水平等级的学生的考试表现进行诊断性的评价，有助于了解各水平等级学生学习的差异，帮助班主任及任课老师对各水平等级的学生做出有针对性的教学指导，从而提高教学效率。</p>
						                <p class="fenxiText">根据教育测量理论，学生的考试成绩一般服从正态分布，根据全市所有学生本次考试总分的平均分及标准差，各等级划分如表3所示：</p>
						                <p class="tacenter">表2水平等级划分规则</p>
						                <table border="1">
						                    <thead>
						                    <tr>
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
						            </div>
						            <p class="fenxiText">根据上述水平等级划分规则，广州市天河中学高三年级各水平等级学生分布如图2所示：</p>
						            <!--图2-->
						            <div class="scorePic2 reportTable" id="scorePic2"></div>
						            <p class="tacenter">图1本班各水平等级分布图</p>
						            <!--图3-->
						            <p class="fenxiText">从图3可知，在本次考试中，广州市天河中学学生总体上处于中上等级[只分三种，中上等，中下等，中等。若果A+B等级的人数比D+E等级的多，中上等，反之中下等，相等则中等。]，但处于A等级的学生较少，拔尖生不足。[分两种，A等级的多于全市的，就说：“且A等级学生较多，表现优秀”；A等级的少于全市的，就说：“但处于A等级的学生较少，拔尖生不足”]</p>
						            <!--图2-->
						            <div class="scorePic3 reportTable" id="scorePic3"></div>
						            <p class="tacenter">图2各水平等级分布与全市对比图</p>
						            <!--图4-->
						            <!--<p class="fenxiText">-->
						                <!--下图中，各等级学生如果在某科目上得分率显著大于其他科目，则说明该科目是本次考试拉开学生总分差距的关键科目。-->
						            <!--</p>-->
						            <h3>1.3 各水平等级学生在各科上的表现</h3>
						            <p class="fenxiText">下图中，各等级学生如果在某科目上得分率显著大于其他科目，则说明该科目是本次考试拉开学生总分差距的关键科目。</p>
						            <div class="scorePic4 reportTable" id="scorePic4"></div>
						            <p class="tacenter">图3各水平等级学生各科得分率对比图</p>
						        </div>
						    </div>

					        <!-- 第二章节 -->	
							<!--2 各科详细分析-->
						    <div id="part2" class="chapter_two">
						    	<h2 class="tacenter">2 各科详细分析</h2>
					            <div class="reportTable">
					            	<!-- 语文 -->
					            	<div class="two_one" id="part21">
					            		<h3>2.1 语文</h3>
						                <div class="two_one_one" id="part211">
								            <h4>2.1.1 各知识模块得分情况分析</h4>

								            <div class="scorePic5 reportTable" id="scorePic5"></div>
								        </div>
								        <div class="two_one_two" id="part212">
								            <h4>2.1.2 各知识模块得分情况分析</h4>
								            <!--2.1-表4-->
								            <div id="biao4" class="reportTable">
								                <p class="tacenter">表4语文各知识模块得分情况</p>
								                <table border="1">
								                    <thead>
								                    <tr>
								                        <th rowspan="2">知识模块</th>
								                        <th colspan="2">本校情况</th>
								                        <th colspan="4">总体对比</th>
								                        <th rowspan="2">满分值</th>
								                    </tr>
								                    <tr>
								                        <th>平均分</th>
								                        <th>得分率</th>
								                        <th colspan="2">区平均分</th>
								                        <th colspan="2">市平均分</th>

								                    </tr>
								                    </thead>
								                    <tbody>
								                    <tr>
								                        <td class="max-bg-blue">古诗词阅读</td>
								                        <td>7.04</td>
								                        <td>0.54</td>
								                        <td>6.46</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>5.63</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>15</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">文言文阅读</td>
								                        <td>14.25</td>
								                        <td>0.65</td>
								                        <td>14.31</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>13.63</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>26</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">现代文阅读</td>
								                        <td>5.04</td>
								                        <td>3.65</td>
								                        <td>3.63</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>7.25</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>27</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">写作</td>
								                        <td>11.23</td>
								                        <td>0.65</td>
								                        <td>7.77</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>5.63</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>60</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">语言知识和运用</td>
								                        <td>15.25</td>
								                        <td>0.54</td>
								                        <td>6.46</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>5.63</td>
								                        <td><img src="${basePath!''}/images/up.png" alt="""></td>
								                        <td>24</td>
								                    </tr>
								                    </tbody>
								                </table>

								            </div>
								            <!--图6-->
								            <div class="scorePic6 reportTable" id="scorePic6" ></div>
								            <p class="tacenter">图4语文各知识模块得分率对比图</p>
								        </div>
						            	<div class="two_one_three" id="part213">
							                <h4>2.1.3 各认知层次得分情况分析</h4>
							                <!--表5-->
							                <div id="biao4" class="reportTable">
							                    <p class="tacenter">表4语文各认知层次得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">认知层次</th>
							                            <th colspan="2">本校情况</th>
							                            <th colspan="4">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">识记</td>
							                            <td>22.65</td>
							                            <td>0.54</td>
							                            <td>20.71</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.45</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">理解</td>
							                            <td>35.6</td>
							                            <td>0.55</td>
							                            <td>23.56</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>25.61</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">运用</td>
							                            <td>40.23</td>
							                            <td>0.55</td>
							                            <td>7.88</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>6.66</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图7-->
							                <div class="scorePic7 reportTable" id="scorePic7"></div>
							                <p class="tacenter">图5语文各认知层次得分率对比图</p>
							            </div>
							            <div class="two_one_four" id="part214">
							                <h4>2.1.4 各题型得分情况分析</h4>
							                <!--表6-->
							                <div id="biao6" class="reportTable">
							                    <p class="tacenter">表5语文各题型得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">题型</th>
							                            <th colspan="2">本校情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">选择题</td>
							                            <td>22.90</td>
							                            <td>0.49</td>
							                            <td>20.81</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.81</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.47</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>47</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">简答题</td>
							                            <td>32.18</td>
							                            <td>0.75</td>
							                            <td>28.97</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>28.97</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>28.76</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>43</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">作文题</td>
							                            <td>42.49</td>
							                            <td>0.71</td>
							                            <td>41.84</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>41.35</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>41.09</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>60</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图8-->
							                <div class="scorePic8 reportTable" id="scorePic8"></div>
							                <p class="tacenter">图6语文各题型得分率对比图</p>
							            </div>
							            <div class="two_one_five" id="part215">
							                <h4>2.1.5 各题得分情况分析</h4>
							                <!--表7-->
							                <div id="biao7" class="reportTable">
							                    <p class="tacenter">表6语文各小题得分情况分析</p>
							                    
							                            &gt;选择6
							                            &gt;选择7<table border="1">
							                        <thead>
							                        <tr>
							                            <th>题号</th>
							                            <th>本校得分率</th>
							                            <th>满分值</th>
							                            <th>难度</th>
							                            <th>区分度</th>
							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">选择1</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择2</td>
							                            <td>0.76</td>
							                            <td>3</td>
							                            <td>0.24</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择3</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.55</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择4</td>
							                            <td>0.12</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.17</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择5</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.52</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择6</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择6</td>
							                            <td>0.44</td>
							                            <td>3</td>
							                            <td>0.55</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择8</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.17</td>
							                            <td>0.12</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择12</td>
							                            <td>0.42</td>
							                            <td>3</td>
							                            <td>0.25</td>
							                            <td>0.33</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择13</td>
							                            <td>0.25</td>
							                            <td>3</td>
							                            <td>0.27</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">9(1)</td>
							                            <td>0.29</td>
							                            <td>3</td>
							                            <td>0.32</td>
							                            <td>0.25</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">9(2)_1</td>
							                            <td>0.22</td>
							                            <td>3</td>
							                            <td>0.56</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">9(2)_2</td>
							                            <td>0.52</td>
							                            <td>3</td>
							                            <td>0.23</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">10_1</td>
							                            <td>0.23</td>
							                            <td>3</td>
							                            <td>0.33</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">10_2</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">11</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.44</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">14</td>
							                            <td>0.12</td>
							                            <td>3</td>
							                            <td>0.18</td>
							                            <td>0.20</td>
							                        </tr>


							                        <tr>
							                            <td class="max-bg-blue">15</td>
							                            <td>0.60</td>
							                            <td>4</td>
							                            <td>0.54</td>
							                            <td>0.17</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">16-19	</td>
							                            <td>0.63</td>
							                            <td>4</td>
							                            <td>0.59</td>
							                            <td>0.20</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">17-20</td>
							                            <td>0.38</td>
							                            <td>5</td>
							                            <td>0.35</td>
							                            <td>0.21</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">18-21</td>
							                            <td>0.42</td>
							                            <td>6</td>
							                            <td>0.39</td>
							                            <td>0.18</td>
							                        </tr>

							                        <tr>
							                            <td class="max-bg-blue">22</td>
							                            <td>0.47</td>
							                            <td>6</td>
							                            <td>0.48</td>
							                            <td>0.20</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">23</td>
							                            <td>0.62</td>
							                            <td>6</td>
							                            <td>0.65</td>
							                            <td>0.22</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">24</td>
							                            <td>0.71</td>
							                            <td>60</td>
							                            <td>0.38</td>
							                            <td>0.10</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							            </div>
							        </div>
								
									<!--数学-->
							        <div class="two_two" id="part22">
							            <!--2.2.数学-->
							            <h3>2.2.数学</h3>
							            <div class="two_two_one"  id="part221">
							                <h4>2.2.1 各知识模块得分情况分析</h4>
							                <!--表8-->
							                <div id="biao8" class="reportTable">
							                    <p class="tacenter">表7数学各认知层次得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">认知层次</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">复数</td>
							                            <td>5.00</td>
							                            <td>1.00</td>
							                            <td>4.91</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4.84</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4.75</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5</td>

							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">函数与导数</td>
							                            <td>10.33</td>
							                            <td>0.27</td>
							                            <td>8.15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>7.90</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>8.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>37</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">常用逻辑用语</td>
							                            <td>8.73</td>
							                            <td>0.87</td>
							                            <td>8.01</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>7.82</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>7.82</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>10</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">立体几何</td>
							                            <td>7.82</td>
							                            <td>0.57</td>
							                            <td>8.75</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>8.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>7.93</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>19</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">排列组合、概率与统计</td>
							                            <td>16.37</td>
							                            <td>0.74</td>
							                            <td>15.66</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15.10</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15.22</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>22</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">平面解析几何</td>
							                            <td>10.47</td>
							                            <td>0.55</td>
							                            <td>8.43</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>7.44</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>7.44</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>19</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">平面向量与三角</td>
							                            <td>19.41</td>
							                            <td>0.88</td>
							                            <td>19.34</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>18.09</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>18.22</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>22</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">数列、推理与证明</td>
							                            <td>4.61</td>
							                            <td>0.92</td>
							                            <td>4.59</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4.39</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4.43</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">算法初步</td>
							                            <td>9.22</td>
							                            <td>0.92</td>
							                            <td>8.99</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>8.62</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>8.56</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>10</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选做题</td>
							                            <td>4.71</td>
							                            <td>0.78</td>
							                            <td>4.72</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4.48</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4.45</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>16</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图9-->
							                <div class="scorePic9 reportTable" id="scorePic9"></div>
							                <p class="tacenter">图7数学各知识模块得分率对比图</p>
							            </div>
							            <div class="two_two_two"  id="part222">
							            	<h4>2.2.2 各认知层次得分情况分析</h4>
							                <!--表9-->
							                <div id="biao9" class="reportTable">
							                    <p class="tacenter">表7数学各认知层次得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">认知层次</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">标识</td>
							                            <td>29.49</td>
							                            <td>0.54</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>42</td>

							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">理解</td>
							                            <td>35.8</td>
							                            <td>0.74</td>
							                            <td>41.84</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>19.27</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>16</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>40</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">运用</td>
							                            <td>42.49</td>
							                            <td>0.71</td>
							                            <td>41.84</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>41.35</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>41.09</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>55</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图10-->
							                <div class="scorePic10 reportTable" id="scorePic10" ></div>
							                <p class="tacenter">图8数学各认知层次得分率对比图</p>
							            </div>

							            <div class="two_two_three"  id="part223">
							                <h4>2.2.3 各题型得分情况分析</h4>
							                <!--表9-->
							                <div id="biao9" class="reportTable">
							                    <p class="tacenter">表8数学各题型得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">题型</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">选择题</td>
							                            <td>31.27</td>
							                            <td>0.54</td>
							                            <td>29.11</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.66</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>28.56</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>60</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">填空题</td>
							                            <td>19.86</td>
							                            <td>0.54</td>
							                            <td>18.55</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>18.76</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>17.76</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>25</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选做题</td>
							                            <td>24.12</td>
							                            <td>0.54</td>
							                            <td>17.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>18.36</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>26</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">解答题</td>
							                            <td>25.6</td>
							                            <td>0.54</td>
							                            <td>18.30</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.53</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>6.33</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>49</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图11-->
							                <div class="scorePic11 reportTable" id="scorePic11"></div>
							                <p class="tacenter">图9数学各题型得分率对比图</p>
							            </div>
							            <div class="two_two_four" id="part224">
							                <h4>2.2.4 各题型得分情况分析</h4>
							                <!--表10-->
							                <div id="biao10" class="reportTable">
							                    <p class="tacenter">表10数学各小题得分情况分析</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th>题号</th>
							                            <th>本班得分率</th>
							                            <th>满分值</th>
							                            <th>难度</th>
							                            <th>区分度</th>
							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">选择1</td>
							                            <td>1.00</td>
							                            <td>5</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择2</td>
							                            <td>1.00</td>
							                            <td>5</td>
							                            <td>0.24</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择3</td>
							                            <td>1.00</td>
							                            <td>5</td>
							                            <td>0.56</td>
							                            <td>0.44</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择4</td>
							                            <td>0.56</td>
							                            <td>5</td>
							                            <td>0.45</td>
							                            <td>0.5</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择5</td>
							                            <td>0.66</td>
							                            <td>5</td>
							                            <td>0.45</td>
							                            <td>0.55</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择6</td>
							                            <td>0.36</td>
							                            <td>5</td>
							                            <td>0.77</td>
							                            <td>0.26</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择7</td>
							                            <td>0.56</td>
							                            <td>5</td>
							                            <td>0.15</td>
							                            <td>0.33</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择8</td>
							                            <td>0.56</td>
							                            <td>5</td>
							                            <td>0.45</td>
							                            <td>0.43</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择9</td>
							                            <td>0.77</td>
							                            <td>5</td>
							                            <td>0.66</td>
							                            <td>0.77</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择10</td>
							                            <td>0.63</td>
							                            <td>5</td>
							                            <td>0.32</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择11</td>
							                            <td>0.45</td>
							                            <td>5</td>
							                            <td>0.25</td>
							                            <td>0.23</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择12</td>
							                            <td>0.25</td>
							                            <td>5</td>
							                            <td>0.34</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择13</td>
							                            <td>0.45</td>
							                            <td>5</td>
							                            <td>0.34</td>
							                            <td>0.25</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择14</td>
							                            <td>0.36</td>
							                            <td>5</td>
							                            <td>0.36</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择15</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.66</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择16</td>
							                            <td>0.12</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.66</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择17</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.25</td>
							                            <td>0.36</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							            </div>
							        </div>

							        <!--英语-->
							        <div class="two_three" id="part23">
							            <!--2.3英语-->
							            <h3>2.3英语</h3>
							            <div class="two_three_one" id="part231">
							                <h4>2.3.1 各知识模块得分情况分析</h4>
							                <!--表11-->
							                <div id="biao11" class="reportTable">
							                    <p class="tacenter">表11英语各知识模块得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">知识模块</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">听说</td>
							                            <td>10.61</td>
							                            <td>0.54</td>
							                            <td>10.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>9.30</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>9.14</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>40</td>

							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">语言知识及运用</td>
							                            <td>22.45</td>
							                            <td>0.55</td>
							                            <td>21.43</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>19.86</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.17</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>40</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">阅读</td>
							                            <td>20.36</td>
							                            <td>0.36</td>
							                            <td>21.65</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>18.86</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>18.77</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>50</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图12-->
							                <div class="scorePic12 reportTable" id="scorePic12"></div>
							                <p class="tacenter">图10英语各知识模块得分率对比图</p>
							            </div>
							            <div class="two_three_two" id="part232">
							                <h4>2.3.2 各认知层次得分情况分析</h4>
							                <!--表12-->
							                <div id="biao12" class="reportTable">
							                    <p class="tacenter">表12英语各认知层次得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">认知层次</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">识记</td>
							                            <td>35.25</td>
							                            <td>0.70</td>
							                            <td>31.17</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>29.62</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>29.58</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>50</td>

							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">理解</td>
							                            <td>34.78</td>
							                            <td>0.64</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>30.58</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>27.31</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>55</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">运用</td>
							                            <td>27.87</td>
							                            <td>0.62</td>
							                            <td>24.27</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.11</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>45</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图13-->
							                <div class="scorePic13 reportTable" id="scorePic13"></div>
							                <p class="tacenter">图11英语各认知层次得分率对比图</p>
							            </div>

							            <div class="two_three_three" id="part233">
							                <h4>2.3.3 各题型得分情况分析</h4>
							                <!--表13-->
							                <div id="biao13" class="reportTable">
							                    <p class="tacenter">表13英语各题型得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">题型</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">选择题</td>
							                            <td>56.51</td>
							                            <td>0.71</td>
							                            <td>43.51</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>43.11</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>43.11</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>80</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">填空题</td>
							                            <td>8.29</td>
							                            <td>0.55</td>
							                            <td>5.96</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4.71</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4.78</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">作文题</td>
							                            <td>22.49</td>
							                            <td>0.56</td>
							                            <td>21.43</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>19.86</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.17</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>40</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">口语题</td>
							                            <td>10.61</td>
							                            <td>0.71</td>
							                            <td>10.14</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>9.30</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>9.14</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图11-->
							                <div class="scorePic14 reportTable" id="scorePic14"></div>
							                <p class="tacenter">图12英语各题型得分率对比图</p>
							            </div>
							            <div class="two_three_four" id="part234">
							                <h4>2.3.4 各题得分情况分析</h4>
							                <!--表14-->
							                <div id="biao14" class="reportTable">
							                    <p class="tacenter">表14英语各小题得分情况分析</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th>题号</th>
							                            <th>本班得分率</th>
							                            <th>满分值</th>
							                            <th>难度</th>
							                            <th>区分度</th>
							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">选择1</td>
							                            <td>0.31</td>
							                            <td>2</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择2</td>
							                            <td>0.84</td>
							                            <td>2</td>
							                            <td>0.24</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择3</td>
							                            <td>0.67</td>
							                            <td>2</td>
							                            <td>0.50</td>
							                            <td>0.60</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择4</td>
							                            <td>0.86</td>
							                            <td>2</td>
							                            <td>0.53</td>
							                            <td>0.67</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择5</td>
							                            <td>0.31</td>
							                            <td>2</td>
							                            <td>0.45</td>
							                            <td>0.77</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择6</td>
							                            <td>0.36</td>
							                            <td>2</td>
							                            <td>0.55</td>
							                            <td>0.62</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择7</td>
							                            <td>0.61</td>
							                            <td>2</td>
							                            <td>0.26</td>
							                            <td>0.25</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择8</td>
							                            <td>0.36</td>
							                            <td>2</td>
							                            <td>0.45</td>
							                            <td>0.68</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择9</td>
							                            <td>0.23</td>
							                            <td>2</td>
							                            <td>0.56</td>
							                            <td>0.86</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择10</td>
							                            <td>0.59</td>
							                            <td>2</td>
							                            <td>0.36</td>
							                            <td>0.77</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择11</td>
							                            <td>0.90</td>
							                            <td>2</td>
							                            <td>0.58</td>
							                            <td>0.64</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择12</td>
							                            <td>0.88</td>
							                            <td>2</td>
							                            <td>0.56</td>
							                            <td>0.42</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择13</td>
							                            <td>0.36</td>
							                            <td>2</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择14</td>
							                            <td>0.73</td>
							                            <td>2</td>
							                            <td>0.75</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择15</td>
							                            <td>0.94</td>
							                            <td>2</td>
							                            <td>0.56</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择26</td>
							                            <td>0.77</td>
							                            <td>2</td>
							                            <td>0.34</td>
							                            <td>0.30</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择27</td>
							                            <td>0.45</td>
							                            <td>2</td>
							                            <td>0.63</td>
							                            <td>0.52</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择28</td>
							                            <td>0.40</td>
							                            <td>2</td>
							                            <td>0.6233</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择29</td>
							                            <td>0.85</td>
							                            <td>2</td>
							                            <td>0.74</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择30</td>
							                            <td>0.36</td>
							                            <td>2</td>
							                            <td>0.45</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择31</td>
							                            <td>0.23</td>
							                            <td>2</td>
							                            <td>0.63</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择32</td>
							                            <td>0.45</td>
							                            <td>2</td>
							                            <td>0.63</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择33</td>
							                            <td>0.65</td>
							                            <td>2</td>
							                            <td>0.96</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择34</td>
							                            <td>0.56</td>
							                            <td>2</td>
							                            <td>0.63</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择35</td>
							                            <td>0.77</td>
							                            <td>2</td>
							                            <td>0.68</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择35</td>
							                            <td>0.36</td>
							                            <td>2</td>
							                            <td>0.63</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择37</td>
							                            <td>0.63</td>
							                            <td>2</td>
							                            <td>0.23</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择38</td>
							                            <td>0.85</td>
							                            <td>2</td>
							                            <td>0.63</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择39</td>
							                            <td>0.45</td>
							                            <td>2</td>
							                            <td>0.63</td>
							                            <td>0.52</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择40</td>
							                            <td>0.65</td>
							                            <td>2</td>
							                            <td>0.45</td>
							                            <td>0.23</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择41</td>
							                            <td>0.45</td>
							                            <td>2</td>
							                            <td>0.56</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择42</td>
							                            <td>0.56</td>
							                            <td>2</td>
							                            <td>0.45</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择43</td>
							                            <td>0.36</td>
							                            <td>2</td>
							                            <td>0.44</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择44</td>
							                            <td>0.69</td>
							                            <td>2</td>
							                            <td>0.77</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择45</td>
							                            <td>0.78</td>
							                            <td>2</td>
							                            <td>0.63</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择46</td>
							                            <td>0.98</td>
							                            <td>2</td>
							                            <td>0.63</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择47</td>
							                            <td>0.25</td>
							                            <td>2</td>
							                            <td>0.89</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择48</td>
							                            <td>0.36</td>
							                            <td>2</td>
							                            <td>0.44</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择49</td>
							                            <td>0.45</td>
							                            <td>2</td>
							                            <td>0.56</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择50</td>
							                            <td>0.98</td>
							                            <td>2</td>
							                            <td>0.65</td>
							                            <td>0.525</td>
							                        </tr>

							                        <tr>
							                            <td class="max-bg-blue">1_16</td>
							                            <td>0.25</td>
							                            <td>1.5</td>
							                            <td>0.89</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">1_17</td>
							                            <td>0.78</td>
							                            <td>1.5</td>
							                            <td>0.33</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">1_18</td>
							                            <td>0.69</td>
							                            <td>1.5</td>
							                            <td>0.58</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">1_19</td>
							                            <td>0.36</td>
							                            <td>1.5</td>
							                            <td>0.63</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">1_20</td>
							                            <td>0.77</td>
							                            <td>1.5</td>
							                            <td>0.68</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">1_21</td>
							                            <td>0.36</td>
							                            <td>1.5</td>
							                            <td>0.63</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">1_22</td>
							                            <td>0.63</td>
							                            <td>1.5</td>
							                            <td>0.23</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">1_23</td>
							                            <td>0.85</td>
							                            <td>1.5</td>
							                            <td>0.63</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">1_24</td>
							                            <td>0.45</td>
							                            <td>1.5</td>
							                            <td>0.63</td>
							                            <td>0.52</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">1_25</td>
							                            <td>0.65</td>
							                            <td>1.5</td>
							                            <td>0.45</td>
							                            <td>0.23</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">2_1</td>
							                            <td>0.45</td>
							                            <td>1.5</td>
							                            <td>0.56</td>
							                            <td>0.36</td>
							                        </tr>

							                        <tr>
							                            <td class="max-bg-blue">2_2</td>
							                            <td>0.73</td>
							                            <td>1.5</td>
							                            <td>0.75</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">2_3</td>
							                            <td>0.94</td>
							                            <td>1.5</td>
							                            <td>0.56</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">3_1</td>
							                            <td>0.77</td>
							                            <td>1.5</td>
							                            <td>0.34</td>
							                            <td>0.30</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">3_2</td>
							                            <td>0.45</td>
							                            <td>1.5</td>
							                            <td>0.63</td>
							                            <td>0.52</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">口语</td>
							                            <td>0.40</td>
							                            <td>1.5</td>
							                            <td>0.6233</td>
							                            <td>0.36</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							            </div>

							        </div>

							        <!--物理-->
							        <div class="two_four" id="part24">
							            <!--2.3英语-->
							            <h3>2.4物理</h3>
							            <div class="two_four_one" id="part241">
							                <h4>2.4.1 各知识模块得分情况分析</h4>
							                <!--表15-->
							                <div id="biao15" class="reportTable">
							                    <p class="tacenter">表15物理各知识模块得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">知识模块</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">电磁学</td>
							                            <td>29.96</td>
							                            <td>0.54</td>
							                            <td>27.57</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>25.51</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>24.59</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>40</td>

							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">力学</td>
							                            <td>22.69</td>
							                            <td>0.54</td>
							                            <td>21.20</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>25.51</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>18.21</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>34</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">热学</td>
							                            <td>7.04</td>
							                            <td>0.54</td>
							                            <td>3.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>3.17</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>6</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">实验</td>
							                            <td>13.28</td>
							                            <td>0.63</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.45</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>18</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">原子物理</td>
							                            <td>3.84</td>
							                            <td>0.54</td>
							                            <td>3.65</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>3.35</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图15-->
							                <div class="scorePic15 reportTable" id="scorePic15"></div>
							                <p class="tacenter">图13物理各知识模块得分率对比图</p>
							            </div>
							            <div class="two_four_two" id="part242">
							                <h4>2.4.2 各认知层次得分情况分析</h4>
							                <!--表16-->
							                <div id="biao16" class="reportTable">
							                    <p class="tacenter">表16物理各认知层次得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">认知层次</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">理解</td>
							                            <td>26.12</td>
							                            <td>0.54</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>28.13</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>28.32</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>32</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">识记</td>
							                            <td>32.56</td>
							                            <td>0.54</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.56</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>52</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">运用</td>
							                            <td>15.28</td>
							                            <td>0.36</td>
							                            <td>6.52</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>36</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>16</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图16-->
							                <div class="scorePic16 reportTable" id="scorePic16"></div>
							                <p class="tacenter">图14物理各认知层次得分率对比图</p>
							            </div>

							            <div class="two_four_three" id="part243">
							                <h4>2.4.3 各题型得分情况分析</h4>
							                <!--表17-->
							                <div id="biao17" class="reportTable">
							                    <p class="tacenter">表17物理各题型得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">题型</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">单选题</td>
							                            <td>13.56</td>
							                            <td>0.49</td>
							                            <td>13.06</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>12.47</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>26.47</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">多选题</td>
							                            <td>26.18</td>
							                            <td>0.78</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>26.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>30</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">解答题</td>
							                            <td>34.22</td>
							                            <td>0.71</td>
							                            <td>34.46</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>29.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>28.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>45</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图17-->
							                <div class="scorePic17 reportTable" id="scorePic17"></div>
							                <p class="tacenter">图15物理各题型得分率对比图</p>
							            </div>
							            <div class="two_four_four" id="part244">
							                <h4>2.4.4 各题得分情况分析</h4>
							                <!--表14-->
							                <div id="biao14" class="reportTable">
							                    <p class="tacenter">表18物理各小题得分情况分析</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th>题号</th>
							                            <th>本班得分率</th>
							                            <th>满分值</th>
							                            <th>难度</th>
							                            <th>区分度</th>
							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">选择13</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择14</td>
							                            <td>0.38</td>
							                            <td>3</td>
							                            <td>0.24</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择15</td>
							                            <td>0.55</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.25</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择16</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.23</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">双选17</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.85</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">双选18</td>
							                            <td>0.23</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">双选19</td>
							                            <td>0.25</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.23</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">双选20</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">双选21</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.22</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">34(1)_1</td>
							                            <td>0.38</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">34(1)_2</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">34(2)_1</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.75</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">34(2)_2</td>
							                            <td>0.56</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">34(2)_3</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.75</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">35_1</td>
							                            <td>0.78</td>
							                            <td>3</td>
							                            <td>0.36</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">35_2</td>
							                            <td>0.75</td>
							                            <td>3</td>
							                            <td>0.65</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">35_3</td>
							                            <td>0.65</td>
							                            <td>3</td>
							                            <td>0.23</td>
							                            <td>0.36</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							            </div>

							        </div>

							        <!--化学-->
							        <div class="two_five" id="part25">
							            <!--2.5化学-->
							            <h3>2.5化学</h3>
							            <div class="two_five_one" id="part251">
							                <h4>2.5.1 各知识模块得分情况分析</h4>
							                <!--表19-->
							                <div id="biao19" class="reportTable">
							                    <p class="tacenter">表19化学各知识模块得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">知识模块</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">化学平衡</td>
							                            <td>16.57</td>
							                            <td>0.64</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>3.52</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>26</td>

							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">离子反应</td>
							                            <td>3.45</td>
							                            <td>0.86</td>
							                            <td>17.52</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>6.36</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>2.36</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>26</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">实验</td>
							                            <td>19.43</td>
							                            <td>0.54</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>7.52</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">氧化还原反应</td>
							                            <td>7.56</td>
							                            <td>0.66</td>
							                            <td>6.13</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">有机物</td>
							                            <td>16.35</td>
							                            <td>0.75</td>
							                            <td>6.12</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.45</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>25</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>8</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">元素</td>
							                            <td>6.35</td>
							                            <td>0.54</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>4.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>8</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图18-->
							                <div class="scorePic18 reportTable" id="scorePic18"></div>
							                <p class="tacenter">图16化学各知识模块得分率对比图</p>
							            </div>
							            <div class="two_five_two" id="part252">
							                <h4>2.5.2 各认知层次得分情况分析</h4>
							                <!--表16-->
							                <div id="biao20" class="reportTable">
							                    <p class="tacenter">表20化学各认知层次得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">认知层次</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">识记</td>
							                            <td>25.67</td>
							                            <td>0.77</td>
							                            <td>7.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>2.56</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>23.36</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>40</td>

							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">理解</td>
							                            <td>13.56</td>
							                            <td>0.55</td>
							                            <td>7.45</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">运用</td>
							                            <td>4.36</td>
							                            <td>0.33</td>
							                            <td>6.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.56</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>22</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图19-->
							                <div class="scorePic19 reportTable" id="scorePic19"></div>
							                <p class="tacenter">图17化学各认知层次得分率对比图</p>
							            </div>

							            <div class="two_five_three" id="part253">
							                <h4>2.5.3 各题型得分情况分析</h4>
							                <!--表21-->
							                <div id="biao21" class="reportTable">
							                    <p class="tacenter">表21化学各题型得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">题型</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">单选题</td>
							                            <td>20.55</td>
							                            <td>0.86</td>
							                            <td>19.54</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>19.99</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.99</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>24</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">多选题</td>
							                            <td>7.04</td>
							                            <td>0.23</td>
							                            <td>2.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>25.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>12</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">解答题</td>
							                            <td>7.04</td>
							                            <td>0.54</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>2.56</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>64</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图19-->
							                <div class="scorePic20 reportTable" id="scorePic20"></div>
							                <p class="tacenter">图18化学各题型得分率对比图</p>
							            </div>
							            <div class="two_five_four" id="part254">
							                <h4>2.5.4 各题得分情况分析</h4>
							                <!--表14-->
							                <div id="biao22" class="reportTable">
							                    <p class="tacenter">表22化学各小题得分情况分析</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th>题号</th>
							                            <th>本班得分率</th>
							                            <th>满分值</th>
							                            <th>难度</th>
							                            <th>区分度</th>
							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">选择7</td>
							                            <td>0.23</td>
							                            <td>3</td>
							                            <td>0.44</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择8</td>
							                            <td>0.38</td>
							                            <td>3</td>
							                            <td>0.24</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择9</td>
							                            <td>0.56</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.22</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择10</td>
							                            <td>0.39</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.33</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择11</td>
							                            <td>0.25</td>
							                            <td>3</td>
							                            <td>0.11</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择12</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">双选22</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">双选23</td>
							                            <td>0.23</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.32</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">30_1</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">30_2</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">30_3</td>
							                            <td>0.32</td>
							                            <td>3</td>
							                            <td>0.45</td>
							                            <td>0.25</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">30_4</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">30_5</td>
							                            <td>0.25</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.52</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">31_1</td>
							                            <td>0.32</td>
							                            <td>3</td>
							                            <td>0.25</td>
							                            <td>0.63</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">31_2</td>
							                            <td>0.77</td>
							                            <td>3</td>
							                            <td>0.77</td>
							                            <td>0.65</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">31_3</td>
							                            <td>0.23</td>
							                            <td>3</td>
							                            <td>0.22</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">31_4</td>
							                            <td>0.52</td>
							                            <td>3</td>
							                            <td>0.32</td>
							                            <td>0.36</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							            </div>

							        </div>

							        <!--生物-->
							        <div class="two_six" id="part26">
							            <!--2.6生物-->
							            <h3>2.6生物</h3>
							            <div class="two_six_one" id="part261">
							                <h4>2.6.1 各知识模块得分情况分析</h4>
							                <!--表23-->
							                <div id="biao23" class="reportTable">
							                    <p class="tacenter">表23生物各知识模块得分情况</p>
							                    12
							                            <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">知识模块</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">分子与细胞</td>
							                            <td>14.96</td>
							                            <td>0.54</td>
							                            <td>14.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>12.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>12.39</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>22</td>

							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">教材实验</td>
							                            <td>8.14</td>
							                            <td>0.85</td>
							                            <td>7.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>6.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>6.98</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>10</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">生物与环境</td>
							                            <td>19.04</td>
							                            <td>0.65</td>
							                            <td>6.52</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>8.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>17.17</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>26</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">探究实验</td>
							                            <td>7.04</td>
							                            <td>0.54</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td><td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>4</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">现代生物科技</td>
							                            <td>6.04</td>
							                            <td>0.64</td>
							                            <td>5.52</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>7.63</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>40</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">遗传与进化</td>
							                            <td>19.47</td>
							                            <td>0.84</td>
							                            <td>18.58</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>6..36</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>26</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图21-->
							                <div class="scorePic21 reportTable" id="scorePic21"></div>
							                <p class="tacenter">图19生物各知识模块得分率对比图</p>
							            </div>
							            <div class="two_six_two" id="part262">
							                <h4>2.6.2 各认知层次得分情况分析</h4>
							                <!--表24-->
							                <div id="biao24" class="reportTable">
							                    <p class="tacenter">表24生物各认知层次得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">认知层次</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="6">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">校平均分</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">识记</td>
							                            <td>23.04</td>
							                            <td>0.78</td>
							                            <td>22.30</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>19.6</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>20.38</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>30</td>

							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">理解</td>
							                            <td>15.36</td>
							                            <td>0.36</td>
							                            <td>28.23</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>38</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">运用</td>
							                            <td>19.14</td>
							                            <td>0.54</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>26.67</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>32</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图22-->
							                <div class="scorePic22 reportTable" id="scorePic22"></div>
							                <p class="tacenter">图20生物各认知层次得分率对比图</p>
							            </div>

							            <div class="two_six_three" id="part263">
							                <h4>2.6.3 各题型得分情况分析</h4>
							                <!--表25-->
							                <div id="biao25" class="reportTable">
							                    <p class="tacenter">表25生物各题型得分情况</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th rowspan="2">题型</th>
							                            <th colspan="2">班级情况</th>
							                            <th colspan="4">总体对比</th>
							                            <th rowspan="2">满分值</th>
							                        </tr>
							                        <tr>
							                            <th>平均分</th>
							                            <th>得分率</th>
							                            <th colspan="2">区平均分</th>
							                            <th colspan="2">市平均分</th>

							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">单选题</td>
							                            <td>5.04</td>
							                            <td>0.54</td>
							                            <td>6.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>5.63</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>15</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">多选题</td>
							                            <td>18.90</td>
							                            <td>0.79</td>
							                            <td>18.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>23.63</td>
							                            <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                            <td>64</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">解答题</td>
							                            <td>1204</td>
							                            <td>0.54</td>
							                            <td>7.46</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>12.55</td>
							                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                            <td>24</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							                <!--图23-->
							                <div class="scorePic23 reportTable" id="scorePic23"></div>
							                <p class="tacenter">图21生物各题型得分率对比图</p>
							            </div>
							            <div class="two_six_four" id="part264">
							                <h4>2.6.4 各题得分情况分析</h4>
							                <!--表14-->
							                <div id="biao22" class="reportTable">
							                    <p class="tacenter">表26生物各小题得分情况分析</p>
							                    <table border="1">
							                        <thead>
							                        <tr>
							                            <th>题号</th>
							                            <th>本班得分率</th>
							                            <th>满分值</th>
							                            <th>难度</th>
							                            <th>区分度</th>
							                        </tr>
							                        </thead>
							                        <tbody>
							                        <tr>
							                            <td class="max-bg-blue">选择1</td>
							                            <td>0.87</td>
							                            <td>3</td>
							                            <td>0.65</td>
							                            <td>0.32</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择2</td>
							                            <td>0.38</td>
							                            <td>3</td>
							                            <td>0.24</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择3</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择4</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.56</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择5</td>
							                            <td>0.96</td>
							                            <td>3</td>
							                            <td>0.77</td>
							                            <td>0.56</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">选择6</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">双选24</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">双选25</td>
							                            <td>0.80</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">26_2</td>
							                            <td>0.56</td>
							                            <td>3</td>
							                            <td>0.26_1</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">26_3</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.22</td>
							                            <td>0.33</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">26_4</td>
							                            <td>0.45</td>
							                            <td>3</td>
							                            <td>0.23</td>
							                            <td>0.77</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">26_5</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">26_5</td>
							                            <td>0.39</td>
							                            <td>3</td>
							                            <td>0.38</td>
							                            <td>0.38</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">27_2</td>
							                            <td>0.36</td>
							                            <td>3</td>
							                            <td>0.34</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">27_3</td>
							                            <td>0.37</td>
							                            <td>3</td>
							                            <td>0.44</td>
							                            <td>0.45</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">28_1</td>
							                            <td>0.23</td>
							                            <td>3</td>
							                            <td>0.56</td>
							                            <td>0.36</td>
							                        </tr>
							                        <tr>
							                            <td class="max-bg-blue">28_2</td>
							                            <td>0.56</td>
							                            <td>3</td>
							                            <td>0.44</td>
							                            <td>0.38</td>
							                        </tr>
							                        </tbody>
							                    </table>

							                </div>
							            </div>

							        </div>
								</div>
							</div>

					        <!--附表-->
					        <div class="fubiao" id="part3">
					            <div id="biao27" class="reportTable">
					                <p class="tacenter">表27本班每位学生成绩</p>
					                <table border="1">
					                    <thead>
					                    <tr>
					                        <th>序号</th>
					                        <th>姓名</th>
					                        <th>总分</th>
					                        <th>语文</th>
					                        <th>数学</th>
					                        <th>英语</th>
					                        <th>物理</th>
					                        <th>化学</th>
					                        <th>生物</th>
					                        <th>水平等级</th>
					                    </tr>
					                    </thead>
					                    <tbody>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
					                    </tr>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
					                    </tr>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
					                    </tr>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
					                    </tr>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
					                    </tr>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
					                    </tr>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
					                    </tr>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
					                    </tr>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
					                    </tr>
					                    <tr>
					                        <td>1</td>
					                        <td>张俊森</td>
					                        <td>606</td>
					                        <td>96</td>
					                        <td>115</td>
					                        <td>130.5</td>
					                        <td>98</td>
					                        <td>80</td>
					                        <td>86</td>
					                        <td>A</td>
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

		selected();   //选择显示

		var myChart = echarts.init(document.getElementById('scorePic2'));
		var myChart_3 = echarts.init(document.getElementById('scorePic3'));
		var myChart_4 = echarts.init(document.getElementById('scorePic4'));
		var myChart_5 = echarts.init(document.getElementById('scorePic5'));
		var myChart_6 = echarts.init(document.getElementById('scorePic6'));
		var myChart_7 = echarts.init(document.getElementById('scorePic7'));
		var myChart_8 = echarts.init(document.getElementById('scorePic8'));
		var myChart_9 = echarts.init(document.getElementById('scorePic9'));
		var myChart_10 = echarts.init(document.getElementById('scorePic10'));
		var myChart_11 = echarts.init(document.getElementById('scorePic11'));
		var myChart_12 = echarts.init(document.getElementById('scorePic12'));
		var myChart_13 = echarts.init(document.getElementById('scorePic13'));
		var myChart_14 = echarts.init(document.getElementById('scorePic14'));
		var myChart_15 = echarts.init(document.getElementById('scorePic15'));
		var myChart_16 = echarts.init(document.getElementById('scorePic16'));
		var myChart_17 = echarts.init(document.getElementById('scorePic17'));
		var myChart_18 = echarts.init(document.getElementById('scorePic18'));
		var myChart_19 = echarts.init(document.getElementById('scorePic19'));
		var myChart_20 = echarts.init(document.getElementById('scorePic20'));
		var myChart_21 = echarts.init(document.getElementById('scorePic21'));
		var myChart_22 = echarts.init(document.getElementById('scorePic22'));
		var myChart_23 = echarts.init(document.getElementById('scorePic23'));
		var option = {
            title : {
                text: '本班各水平等级分布图',
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
                    name:'本班各水平等级分布图',
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

        var  option3 = {
            tooltip : {
                trigger: 'axis'
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType: {show: true, type: [ 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            legend: {
                data:['本班','本校','全区','全市']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['A等级','B等级','C等级','D等级','E等级']
                }
            ],
            yAxis : [
                {
                    type : 'value',
//                    name : '本校',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                },
                {
//                    type : 'value',
//                    name : '全市',
//                    axisLabel : {
//                        formatter: '{value} °C'
//                    }
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'bar',
                    data:[5.88, 35.29, 27.45,19.61,11.76]
                },
                {
                    name:'本校',
                    type:'bar',
                    data:[4.43, 31.01, 47.47,13.93,20.36]
                },
                {
                    name:'全区',
                    type:'bar',
                    data:[6.14, 26.50, 43.32,18.61,8.43]
                },
                {
                    name:'全市',
                    type:'bar',
                    data:[10.80, 23.10, 33.04,22.96,10.10]
                }
            ]
        };
        
        var option4 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
//                orient:'vertical',
//                top:'bottom',
//                right:0,
                data : ['A等级','B等级','C等级','D等级','E等级']
            },
            toolbox: {
//                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
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
//                    stack: '总量',
                    data:[0.65, 0.76, 0.82, 0.88, 0.86, 0.86]
                },
                {
                    name:'B等级',
                    type:'line',
//                    stack: '总量',
                    data:[0.68, 0.70, 0.72, 0.82, 0.76, 0.80]
                },
                {
                    name:'C等级',
                    type:'line',
//                    stack: '总量',
                    data:[0.64, 0.62, 0.63, 0.65, 0.60, 0.63]
                },
                {
                    name:'D等级',
                    type:'line',
//                    stack: '总量',
                    data:[0.63, 0.53, 0.59, 0.66, 0.56, 0.64]
                },
                {
                    name:'E等级',
                    type:'line',
//                    stack: '总量',
                    data:[0.62, 0.50, 0.49, 0.55, 0.45, 0.47]
                }
            ]
        };
	       
        var  option5 = {
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
	            calculable : true,
	            legend: {
	                data:['本校','全市','趋势线--本校','趋势线--全市']
	            },
	            xAxis : [
	                {
	                    type : 'category',
	                    data : ['0-50','50-100','100-150','150-200','200-250','250-300','300-350','350-400','400-450','450-500','500-550','550-600','600-650','650-700','700-750']
	                }
	            ],
	            yAxis : [
	                {
	                    type : 'value',
	//                    name : '本校',
	                    axisLabel : {
	                        formatter: '{value} %'
	                    }
	                },
	                {
	//                    type : 'value',
	//                    name : '全市',
	//                    axisLabel : {
	//                        formatter: '{value} °C'
	//                    }
	                }
	            ],
	            series : [

	                {
	                    name:'本校',
	                    type:'bar',
	                    data:[0, 0, 0, 2,3, 5, 7, 1, 8, 5, 4, 12,27,12,1]
	                },
	                {
	                    name:'全市',
	                    type:'bar',
	                    data:[0, 0, 0, 4,3, 15, 7, 12, 5, 3, 4, 12,5,25,1]
	                },
	                {
	                    name:'趋势线--本校',
	                    type:'line',
	                    yAxisIndex: 1,
	                    data:[2.0, 2.2, 3.3, 4.5, 6.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 6.2,5.2,5.0,3.2]
	                },
	                {
	                    name:'趋势线--全市',
	                    type:'line',
	                    yAxisIndex: 1,
	                    data:[2.0, 3.2, 2.3, 4.5, 5.3, 8.9, 20.3, 20.5, 23.0, 16.5, 12.0, 6.2,5.2,5.0,3.2]
	                }
	            ]
	        };

	    //图6
        var option6 = {
	            tooltip : {
	                trigger: 'axis'
	            },
	            legend: {
	                data : ['本班','全校','全区','全市']
	            },
	            toolbox: {
	                show : true,
	                feature : {
	                    mark : {show: true},
	                    dataView : {show: true, readOnly: false},
	                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
	                    restore : {show: true},
	                    saveAsImage : {show: true}
	                }
	            },
	            calculable : true,
	            xAxis : [
	                {
	                    type : 'category',
	                    boundaryGap : true,
	                    data : ['古诗词阅读','文言文阅读','现代文阅读','写作','语言知识和运用']
	                }
	            ],
	            yAxis : [
	                {
	                    type : 'value'
	                }
	            ],
	            series : [
	                {
	                    name:'本班',
	                    type:'line',
	                    data:[0.59, 0.65, 0.78, 0.71, 0.63]
	                },
	                {
	                    name:'全校',
	                    type:'line',
	                    data:[0.54, 0.65, 0.78, 0.7, 0.63]
	                },
	                {
	                    name:'全区',
	                    type:'line',
	                    data:[0.47, 0.6, 0.7, 0.69, 0.6]
	                },
	                {
	                    name:'全市',
	                    type:'line',
	//                    stack: '总量',
	                    data:[0.48, 0.59, 0.68, 0.68, 0.59]
	                }
	            ]
	        };
	    
        var   option7 = {
	            tooltip : {
	                trigger: 'axis'
	            },
	            legend: {
	                data : ['本班','全校','全区','全市']
	            },
	            toolbox: {
	                show : true,
	                feature : {
	                    mark : {show: true},
	                    dataView : {show: true, readOnly: false},
	                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
	                    restore : {show: true},
	                    saveAsImage : {show: true}
	                }
	            },
	            calculable : true,
	            xAxis : [
	                {
	                    type : 'category',
	                    boundaryGap : true,
	                    data : ['标识','理解','运用']
	                }
	            ],
	            yAxis : [
	                {
	                    type : 'value'
	                }
	            ],
	            series : [
	                {
	                    name:'本班',
	                    type:'line',
	                    data:[0.7, 0.63, 0.71]
	                },
	                {
	                    name:'全校',
	                    type:'line',
	                    data:[0.68, 0.61, 0.7]
	                },
	                {
	                    name:'全区',
	                    type:'line',

	                    data:[0.65, 0.55, 0.69]
	                },
	                {
	                    name:'全市',
	                    type:'line',

	                    data:[0.64, 0.55, 0.68]
	                }
	            ]
	        };

	    var option8 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['选择题','简答题','作文题']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',

                    data:[0.49, 0.75, 0.71]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.47, 0.73, 0.7]
                },
                {
                    name:'全区',
                    type:'line',

                    data:[0.44, 0.67, 0.69]
                },
                {
                    name:'全市',
                    type:'line',

                    data:[0.44, 0.69, 0.68]
                }
            ]
        };

        var option9 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : false,
            xAxis : [
                {
                    type : 'category',
//                    boundaryGap : true,
                    axisLabel:{
                        rotate:90,
                    },
                    data : ['复数','函数与导数','常用逻辑用语','立体几何','排列组合、概率与统计','平面解析几何','平面向量与三角','数列、推理与证明','算法初步','选做题']
                }
            ],
            grid: { // 控制图的大小，调整下面这些值就可以，
                x: 40,
                x2: 100,
                y2: 100,// y2可以控制 X轴跟Zoom控件之间的间隔，避免以为倾斜后造成 label重叠到zoom上
            },
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[1.00, 0.27, 0.57, 0.57,0.74,0.55,0.88,0.92,0.92,0.78]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.98, 0.21, 0.8, 0.46,0.71,0.44,0.88,0.92,0.85,0.94]
                },
                {
                    name:'全区',
                    type:'line',

                    data:[0.97, 0.21, 0.78, 0.43,0.69,0.39,0.82,0.88,0.83,0.9]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.95, 0.22, 0.78, 0.42,0.69,0.39,0.83,0.89,0.82,0.9]
                }
            ]
        };

        var option10 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['理解','推理','应用']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.77, 0.45, 0.94]
                },
                {
                    name:'本校',
                    type:'line',

                    data:[0.66, 0.41, 0.77]
                },
                {
                    name:'全区',
                    type:'line',

                    data:[0.63, 0.42, 0.79]
                },
                {
                    name:'全市',
                    type:'line',

                    data:[0.64, 0.42, 0.78]
                }
            ]
        };

        var option11 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['解答题','填空题','选择题','选做题']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',

                    data:[0.49, 0.78, 0.78, 0.94]
                },
                {
                    name:'本校',
                    type:'line',

                    data:[0.43, 0.74, 0.73, 0.94]
                },
                {
                    name:'全区',
                    type:'line',

                    data:[0.4, 0.71, 0.71,0.9]
                },
                {
                    name:'全市',
                    type:'line',

                    data:[0.4, 0.71, 0.71,0.89]
                }
            ]
        };

        var option12 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
//            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['听说','写作','语言知识及运用','阅读']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',

                    data:[0.71, 0.56, 0.62, 0.74]
                },
                {
                    name:'本校',
                    type:'line',

                    data:[0.68, 0.54, 0.48, 0.66]
                },
                {
                    name:'全区',
                    type:'line',

                    data:[0.62, 0.50, 0.41, 0.59]
                },
                {
                    name:'全市',
                    type:'line',

                    data:[0.61, 0.5, 0.42, 0.58]
                }
            ]
        };

        var option13 = {

            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['标记','理解','运用']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.7, 0.64, 0.62]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.61, 0.57, 0.54]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.54, 0.55, 0.45]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.55,0.54,0.45]
                }
            ]
        };

        var option14 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
//            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['选择题','填空题','作文题','口语题']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',

                    data:[0.71, 0.55, 0.56, 0.71]
                },
                {
                    name:'本校',
                    type:'line',

                    data:[0.61, 0.4, 0.54, 0.68]
                },
                {
                    name:'全区',
                    type:'line',

                    data:[0.54, 0.31, 0.5, 0.62]
                },
                {
                    name:'全市',
                    type:'line',

                    data:[0.63, 0.36, 0.57, 0.51]
                }
            ]
        };

        var option14 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
//            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['选择题','填空题','作文题','口语题']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',

                    data:[0.71, 0.55, 0.56, 0.71]
                },
                {
                    name:'本校',
                    type:'line',

                    data:[0.61, 0.4, 0.54, 0.68]
                },
                {
                    name:'全区',
                    type:'line',

                    data:[0.54, 0.31, 0.5, 0.62]
                },
                {
                    name:'全市',
                    type:'line',

                    data:[0.63, 0.36, 0.57, 0.51]
                }
            ]
        };

        var  option15 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['电磁学','力学','热学','实验','原子物理']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.79, 0.67, 0.7, 0.74,0.96]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.73, 0.62, 0.53,0.72,0.92]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.56, 0.59,0.69,0.88]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.65, 0.53, 0.63,0.7,0.88]
                }
            ]
        };

        var option16 = {

            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['理解','标记','运用']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.81, 0.62, 0.85]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.73, 0.58, 0.83]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.71, 0.55, 0.7]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.7,0.55,0.64]
                }
            ]
        };

        var option17 = {

            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['单选题','多选题','解答题']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.49, 0.75, 0.76]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.52, 0.82, 0.69]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.5, 0.78, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.5,0.78,0.59]
                }
            ]
        };

        var  option18 = {
            tooltip : {
                trigger: 'axis'
            },
//            legend: {
//                data : ['本班','本校','全区','全市']
//            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['化学平衡','离子反应','实验','氧化还原反应','有机物','元素']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.65, 0.86, 0.57, 0.64,0.82,0.75]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.59, 0.82, 0.51,0.52,0.75,0.69]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.61, 0.83, 0.54,0.54,0.74,0.69]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.61, 0.83, 0.54,0.53,0.74,0.68]
                }
            ]
        };

        var option19 = {

            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['标记','理解','运用']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.77, 0.64, 0.55]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.69, 0.55, 0.56]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.59, 0.7, 0.55]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.69,0.59,0.56]
                }
            ]
        };

        var option20 = {

            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['单选题','多选题','解答题']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.86, 0.79, 0.58]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.81, 0.69, 0.51]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.83, 0.64, 0.54]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.83,0.65,0.54]
                }
            ]
        };

        var option21 = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['分子与细胞','教材实验','生物与环境','探究实验','现代生物科技','遗传与进化']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.68, 0.82, 0.72, 0.73,0.31,0.75]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.64, 0.75, 0.71,0.69,0.27,0.71]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.57, 0.7, 0.65,0.66,0.46,0.64]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.56, 0.69, 0.66,0.65,0.352,0.62]
                }
            ]
        };

        var option22 = {

            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['标记','理解','运用']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.78, 0.77, 0.6]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.75, 0.74, 0.54]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.69, 0.66, 0.51]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.68,0.7,0.48]
                }
            ]
        };

        var option23 = {

            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data : ['本班','本校','全区','全市']
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : true,
                    data : ['单选题','多选题','解答题']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本班',
                    type:'line',
                    data:[0.79, 0.76, 0.68]
                },
                {
                    name:'本校',
                    type:'line',
                    data:[0.76, 0.74, 0.64]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.73, 0.62, 0.59]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.74,0.63,0.58]
                }
            ]
        };


		myChart.setOption(option);
		myChart_3.setOption(option3);
		myChart_4.setOption(option4);
		// 为echarts对象加载数据
		myChart_5.setOption(option5);
		// 为echarts对象加载数据
		myChart_6.setOption(option6);
		myChart_7.setOption(option7);
		myChart_7.setOption(option7);
		myChart_8.setOption(option8);
		myChart_8.setOption(option8);
		myChart_9.setOption(option9);
		myChart_10.setOption(option10);
		myChart_11.setOption(option11);
		myChart_12.setOption(option12);
		myChart_13.setOption(option13);
		myChart_14.setOption(option14);
		myChart_15.setOption(option15);
		myChart_16.setOption(option16);
		myChart_17.setOption(option17);
		myChart_18.setOption(option18);
		myChart_19.setOption(option19);
		myChart_20.setOption(option20);
		myChart_21.setOption(option21);
		myChart_22.setOption(option22);
		myChart_23.setOption(option23);
	})

</script>
</body>
</html>