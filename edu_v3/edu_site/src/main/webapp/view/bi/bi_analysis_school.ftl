<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>分析报告-学校</title>
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
						<h2 class="grade_name">广州市天河中学2016年广州市学业考试校级分析诊断报告</h2>
						<div class="grade_type">
							<span>线上考试</span>
							<span>市级考试</span>
							<span>年级：高二</span>
							<span>报告范围：校级</span>
						</div>

						<div class="report clearfix">
							<!-- 左侧导航 -->
							<div class="report_list fl">
								<p class="title">自定义报告（勾选所需报告内容）</p>
								<p class="nav">报告导航</p>
								<ul>
									<li>
										<label idx='1' class="part_father"><input checked type="checkbox" name=""><span>1 学校考试概况分析</span></label>
										<ul>
											<li><label idx='11'><input checked type="checkbox" name=""><span>1.1 各科考试概况</span></label></li>
											<li><label idx='12'><input checked type="checkbox" name=""><span>1.2 各班考试情况分析</span></label></li>
											<li><label idx='13'><input checked type="checkbox" name=""><span>1.3 各水平等级学生分析</span></label></li>
											
										</ul>
									</li>
									<li>
										<label idx='2' class="part_father"><input type="checkbox" name=""><span>2 各科成绩详细分析</span></label>
										<ul>
											<li>
												<label idx='21' class="part_father"><input type="checkbox" name=""><span>2.1 语文</span></label>
												<ul>
													<li><label idx='211'><input type="checkbox" name=""><span>2.1.1 总体分布情况</span></label></li>
													<li><label idx='212'><input type="checkbox" name=""><span>2.1.2 各知识模块得分情况分析</span></label></li>
													<li><label idx='213'><input type="checkbox" name=""><span>2.1.3 各认知层次得分情况分析</span></label></li>
													<li><label idx='214'><input type="checkbox" name=""><span>2.1.4 各题型得分情况分析</span></label></li>
													<li><label idx='215'><input type="checkbox" name=""><span>2.1.5 各题得分情况分析</span></label></li>
												</ul>
											</li>
											<li>
												<label idx='22' class="part_father"><input type="checkbox" name=""><span>2.2 数学</span></label>
												<ul>
													<li><label idx='221'><input type="checkbox" name=""><span>2.2.1 总体分布情况</span></label></li>
													<li><label idx='222'><input type="checkbox" name=""><span>2.2.2 各知识模块得分情况分析</span></label></li>
													<li><label idx='223'><input type="checkbox" name=""><span>2.2.3 各认知层次得分情况分析</span></label></li>
													<li><label idx='224'><input type="checkbox" name=""><span>2.2.4 各题型得分情况分析</span></label></li>
													<li><label idx='225'><input type="checkbox" name=""><span>2.2.5 各题得分情况分析</span></label></li>
												</ul>
											</li>
											<li>
												<label idx='23' class="part_father"><input type="checkbox" name=""><span>2.3 英语</span></label>
												<ul>
													<li><label idx='231'><input type="checkbox" name=""><span>2.3.1 总体分布情况</span></label></li>
													<li><label idx='232'><input type="checkbox" name=""><span>2.3.2 各知识模块得分情况分析</span></label></li>
													<li><label idx='233'><input type="checkbox" name=""><span>2.3.3 各认知层次得分情况分析</span></label></li>
													<li><label idx='234'><input type="checkbox" name=""><span>2.3.4 各题型得分情况分析</span></label></li>
													<li><label idx='235 class="part_father"'><input type="checkbox" name=""><span>2.3.5 各题得分情况分析</span></label></li>
												</ul>
											</li>
											<li>
												<label idx='24' class="part_father"><input type="checkbox" name=""><span>2.4 物理</span></label>
												<ul>
													<li><label idx='241'><input type="checkbox" name=""><span>2.4.1 总体分布情况</span></label></li>
													<li><label idx='242'><input type="checkbox" name=""><span>2.4.2 各知识模块得分情况分析</span></label></li>
													<li><label idx='243'><input type="checkbox" name=""><span>2.4.3 各认知层次得分情况分析</span></label></li>
													<li><label idx='244'><input type="checkbox" name=""><span>2.4.4 各题型得分情况分析</span></label></li>
													<li><label idx='245'><input type="checkbox" name=""><span>2.4.5 各题得分情况分析</span></label></li>
												</ul>
											</li>
											<li>
												<label idx='25' class="part_father"><input type="checkbox" name=""><span>2.5 化学</span></label>
												<ul>
													<li><label idx='251'><input type="checkbox" name=""><span>2.5.1 总体分布情况</span></label></li>
													<li><label idx='252'><input type="checkbox" name=""><span>2.5.2 各知识模块得分情况分析</span></label></li>
													<li><label idx='253'><input type="checkbox" name=""><span>2.5.3 各认知层次得分情况分析</span></label></li>
													<li><label idx='254'><input type="checkbox" name=""><span>2.5.4 各题型得分情况分析</span></label></li>
													<li><label idx='255'><input type="checkbox" name=""><span>2.5.5 各题得分情况分析</span></label></li>
												</ul>
											</li>
											<li>
												<label idx='26' class="part_father"><input type="checkbox" name=""><span>2.6 生物</span></label>
												<ul>
													<li><label idx='261'><input type="checkbox" name=""><span>2.6.1 总体分布情况</span></label></li>
													<li><label idx='262'><input type="checkbox" name=""><span>2.6.2 各知识模块得分情况分析</span></label></li>
													<li><label idx='263'><input type="checkbox" name=""><span>2.6.3 各认知层次得分情况分析</span></label></li>
													<li><label idx='264'><input type="checkbox" name=""><span>2.6.4 各题型得分情况分析</span></label></li>
													<li><label idx='265'><input type="checkbox" name=""><span>2.6.5 各题得分情况分析</span></label></li>
												</ul>
											</li>

										</ul>
									</li>
								</ul>
							</div>

							<!-- 内容区域  -->
							<div class="show_report fr">
								<!-- 第一章节 -->
								<div id="part1">
									<h2>1.学校考试概况分析</h2>
									<div class="part_content" id="part11">
										<h3>1.1 各科考试概况</h3>
							            <p class="fenxiText">
							                广州市天河中学高三年级共158人参加了2016年广州市学业统考，全班在本次考试中的表现，如表1所示，与天河区和全市均分相比，除化学外，广州市天河中学高三年级在本次考试中各科成绩均高于天河区均分和市均分。
							            </p>
							            <p class="tacenter">表1 全校各科分数汇总表</p>
							            <table class="max-table">
							                <tbody>
							                <tr class="max-bg-blue">
							                    <td rowspan="2">科目</td>
							                    <td colspan="4">全校情况</td>
							                    <td colspan="4">总体对比</td>
							                </tr>
							                <tr class="max-bg-blue">
							                    <td>平均分</td>
							                    <td>标准差</td>
							                    <td>最高分</td>
							                    <td>最低分</td>
							                    <td colspan="2">区平均分</td>
							                    <td colspan="2">市平均分</td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">总分</td>
							                    <td>465.51</td>
							                    <td>26.87</td>
							                    <td>649</td>
							                    <td>117</td>
							                    <td>437.89</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                    <td>437.30</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">语文</td>
							                    <td>95.32</td>
							                    <td>11.06</td>
							                    <td>123</td>
							                    <td>12</td>
							                    <td>91.14</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                    <td>90.32</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">数学</td>
							                    <td>86.81</td>
							                    <td>15.18</td>
							                    <td>120</td>
							                    <td>32</td>
							                    <td>82.42</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                    <td>82.57</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">英语</td>
							                    <td>86.02</td>
							                    <td>10.14</td>
							                    <td>130.5</td>
							                    <td>35</td>
							                    <td>77.39</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                    <td>77.20</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">物理</td>
							                    <td>68.67</td>
							                    <td>13.56</td>
							                    <td>98</td>
							                    <td>29</td>
							                    <td>64.23</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                    <td>62.57</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">化学</td>
							                    <td>60.75</td>
							                    <td>14.25</td>
							                    <td>93</td>
							                    <td>15</td>
							                    <td>62.08</td>
							                    <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                    <td>62.16</td>
							                    <td><img src="${basePath!''}/images/down.png" alt=""></td>
							                </tr>
							                <tr>
							                    <td class="max-bg-blue">生物</td>
							                    <td>67.94</td>
							                    <td>13.18</td>
							                    <td>93</td>
							                    <td>28</td>
							                    <td>62.63</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                    <td>62.48</td>
							                    <td><img src="${basePath!''}/images/up.png" alt=""></td>
							                </tr>
							                </tbody>
							            </table>
							  
							            <p class="fenxiText">
							                从总分在各分数段的分布（图1）来看，广州市天河中学在400-500分数 段学生分布最多，与全市相比，高分段学生比例较少。
							            </p>
							            <div class="scorePic1 reportTable" id="scorePic1"></div>
							            <p class="tacenter">图1 总分分数段分布对比图</p>
									</div>

									<div class="part_content" id="part12">
										<h3>1.2 各班考试情况分析</h3>
							            <p class="tacenter">表2 各班考试情况</p>
							            <table class="max-table">
							                <tbody>
							                <tr class="max-bg-blue">
							                    <td>班级</td>
							                    <td>人数</td>
							                    <td>分析项</td>
							                    <td>总分</td>
							                    <td>语文</td>
							                    <td>数学</td>
							                    <td>英语</td>
							                    <td>物理</td>
							                    <td>化学</td>
							                    <td>生物</td>
							                </tr>
							                <tr>
							                    <td rowspan="4">高三（1）班</td>
							                    <td rowspan="4">51</td>
							                    <td>平均分</td><td>498.95</td><td>97.57</td><td>94</td><td>96.90</td><td>73.31</td><td>66.00</td><td>71.00</td>
							                </tr>
							                <tr><td>标准差</td><td>9.28</td><td>15.44</td><td>16.78</td><td>13.10</td><td>13.56</td><td>13.13</td><td>67.03</td></tr>
							                <tr><td>最高分</td><td>613.5</td><td>119</td><td>120</td><td>130.5</td><td>98</td><td>93</td><td>93</td></tr>
							                <tr><td>最低分</td><td>332.5</td><td>77</td><td>54</td><td>57</td><td>40</td><td>38</td><td>30</td></tr>
							                <tr>
							                    <td rowspan="4">高三（2）班</td>
							                    <td rowspan="4">54</td>
							                    <td>平均分</td><td>461.11</td><td>95.43</td><td>85.33</td><td>82.15</td><td>68.15</td><td>62.20</td><td>67.85</td>
							                </tr>
							                <tr><td>标准差</td><td>50.48</td><td>9.01</td><td>11.41</td><td>12.98</td><td>12.68</td><td>12.02</td><td>11.79</td></tr>
							                <tr><td>最高分</td><td>578.5</td><td>118</td><td>112</td><td>117.5</td><td>92</td><td>84</td><td>92</td></tr>
							                <tr><td>最低分</td><td>340.5</td><td>75</td><td>47</td><td>57</td><td>40</td><td>24</td><td>44</td></tr>
							                <tr>
							                    <td rowspan="4">高三（3）班</td>
							                    <td rowspan="4">53</td>
							                    <td>平均分</td><td>426.35</td><td>87.09</td><td>81.26</td><td>73.93</td><td>64.75</td><td>54.23</td><td>65.08</td>
							                </tr>
							                <tr><td>标准差</td><td>66.33</td><td>14.03</td><td>15.74</td><td>16.72</td><td>13.74</td><td>14.71</td><td>14.14</td></tr>
							                <tr><td>最高分</td><td>524</td><td>111</td><td>111</td><td>112</td><td>86</td><td>79</td><td>92</td></tr>
							                <tr><td>最低分</td><td>198.5</td><td>12</td><td>32</td><td>35</td><td>29</td><td>15</td><td>28</td></tr>
							                <tr><td>区</td><td>1483</td><td>平均分</td><td>437.89</td><td>91.14</td><td>82.42</td><td>77.39</td><td>64.23</td><td>62.08</td><td>62.63</td></tr>
							                <tr><td>市</td><td>25989</td><td>平均分</td><td>437.30</td><td>90.32</td><td>82.57</td><td>77.20</td><td>62.57</td><td>62.16</td><td>62.48</td></tr>
							            </tbody>
							        	</table>
									</div>

									<div class="part_content" id="part13">
										<h3>1.3 各水平等级学生分析</h3>
							            <p class="fenxiText">
							                不同水平等级的学生，学习过程会有所区别。对不同水平等级的学生的考试表现进行诊断性的评价，
							                有助于了解各水平等级学生学习的差异，帮助班主任及任课老师对各水平等级的学生做出有针对性的教学指导，从而提高教学效率。<br>
							                根据教育测量理论，学生的考试成绩一般服从正态分布，根据全市所有学生本次考试总分的平均分及标准差，各等级划分如表3所示：
							            </p>
							            <p class="tacenter">表3 水平等级划分规则</p>
							            <table class="max-table">
							                <tbody>
							                    <tr class="max-bg-blue"><td>等级</td><td>划分规则</td><td>等级分数</td></tr>
							                    <tr><td>A等级</td><td>X≥+1.28S</td><td>X≥569</td></tr>
							                    <tr><td>B等级</td><td>+0.43S≤X＜+1.28S</td><td>487≤X＜569</td></tr>
							                    <tr><td>C等级</td><td>-0.43S≤X＜+0.43S</td><td>403≤X＜487</td></tr>
							                    <tr><td>D等级</td><td>-1.28S≤X＜-0.43S</td><td>321≤X＜403</td></tr>
							                    <tr><td>E等级</td><td>X＜-1.28S</td><td>X＜321</td></tr>
							                </tbody>
							            </table>
							            <p class="fenxiText">注：表中X表示学生总分，表示全市学生总分的平均分，S表示全市学生总分的标准差。</p>

							            <p class="fenxiText">根据上述水平等级划分规则，广州市天河中学高三年级各水平等级学生分布如图2所示：</p>
							            <div class="scorePic reportTable" id="scorePic2"></div>
							            <p class="tacenter">图2 本校各水平等级分布图</p>
							            <p class="fenxiText">
							                从图3可知，在本次考试中，广州市天河中学学生总体上处于中上等级 ，但处于A等级的学生较少，拔尖生不足。
							            </p>
							            <div class="scorePic reportTable" id="scorePic3"></div>
							            <p class="tacenter">图3 各水平等级分布与全市对比图</p>
							            <p class="fenxiText">
							                下图中，各等级学生如果在某科目上得分率显著大于其他科目，则说明该科目是本次考试拉开学生总分差距的关键科目。
							            </p>
							            <div class="scorePic reportTable" id="scorePic4"></div>
							            <p class="tacenter">图4 各水平等级学生各科得分率对比图</p>
									</div>

								</div>
								
								<!-- 第二章节 -->	
								<!--2 各科详细分析-->
							    <div id="part2">
							    	<h2 class="tacenter">2 各科详细分析</h2>
									<!--语文-->
						            <div id="yuwen">
						            	<!-- 语文第一部分 -->
						            	<div class="two_one" id="part21">
						            		<h3>2.1 语文</h3>
							                <div class="two_one_one" id="part211">
							                	<h4>2.1.1 总体分布情况</h4>
								                <p class="fenxiText">
								                    从语文在各分数段的分布（图5）来看，广州市天河中学语文在90-100分数段学生分布最多。
								                </p>
								                <div class="scorePic reportTable" id="scorePic5"></div>
								                <p class="tacenter">图5 语文分数段分布对比图</p>
							                </div>
							                <div class="two_one_two" id="part212">
							                	<h4>2.1.2 各知识模块得分情况分析</h4>
								                <p class="tacenter">表4 语文各知识模块得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                        <tr class="max-bg-blue">
								                            <td rowspan="2">知识模块</td>
								                            <td colspan="2">本校情况</td>
								                            <td colspan="4">总体对比</td>
								                            <td rowspan="2">满分值</td>
								                        </tr>
								                        <tr class="max-bg-blue">
								                            <td>平均分</td>
								                            <td>得分率</td>
								                            <td colspan="2">区平均分</td>
								                            <td colspan="2">市平均分</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">古诗词阅读</td>
								                            <td>7.04</td>
								                            <td>0.54</td>
								                            <td>6.07</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>6.46</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>15</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">文言文阅读</td>
								                            <td>14.31</td>
								                            <td>0.65</td>
								                            <td>13.20</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>13.52</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>26</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">现代文阅读</td>
								                            <td>17.12</td>
								                            <td>0.74</td>
								                            <td>16.05</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>16.01</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>25</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">写作</td>
								                            <td>41.84</td>
								                            <td>0.70</td>
								                            <td>41.35</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>41.09</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>60</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">语言知识和运用</td>
								                            <td>15.00</td>
								                            <td>0.63</td>
								                            <td>14.47</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>14.45</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>24</td>
								                        </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic6"></div>
                								<p class="tacenter">图6 语文各知识模块得分率对比图</p>
							                </div>
							                <div class="two_one_three" id="part213">
							                	<h4>2.1.3 各认知层次得分情况分析</h4>
								                <p class="tacenter">表5 语文各认知层次得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">认知层次</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">识记</td>
								                        <td>29.31</td>
								                        <td>0.68</td>
								                        <td>30.52</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>30.46</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>42</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">理解</td>
								                        <td>26.16</td>
								                        <td>0.61</td>
								                        <td>19.27</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>19.98</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>53</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">运用</td>
								                        <td>41.84</td>
								                        <td>0.70</td>
								                        <td>41.35</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>41.09</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>55</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic7"></div>
                								<p class="tacenter">图7 语文各认知层次得分率对比图</p>
							                </div>
							                <div class="two_one_four" id="part214">
							                	<h4>2.1.4 各题型得分情况分析</h4>
								                <p class="tacenter">表6 语文各题型得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">题型</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择题</td>
								                        <td>22.24</td>
								                        <td>0.47</td>
								                        <td>20.81</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>421.06</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>47</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">简答题</td>
								                        <td>31.23</td>
								                        <td>0.73</td>
								                        <td>28.97</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>29.38</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>43</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">作文题</td>
								                        <td>41.84</td>
								                        <td>0.7</td>
								                        <td>41.35</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>41.09</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>60</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic8"></div>
                								<p class="tacenter">图8 语文各题型得分率对比图</p>
							                </div>
							                <div class="two_one_five" id="part215">
							                	<h4>2.1.5 各题得分情况分析</h4>
								                <p class="tacenter">表7 语文各小题得分情况分析</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td>题号</td>
								                        <td>本校得分率</td>
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
								                        <td>0.70</td>
								                        <td>3</td>
								                        <td>0.70</td>
								                        <td>0.29</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择3</td>
								                        <td>0.64</td>
								                        <td>3</td>
								                        <td>0.62</td>
								                        <td>0.57</td>
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
								                        <td>3</td>
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
								                        <td class="max-bg-blue">选择7</td>
								                        <td>0.85</td>
								                        <td>3</td>
								                        <td>0.83</td>
								                        <td>0.30</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择8</td>
								                        <td>0.63</td>
								                        <td>3</td>
								                        <td>0.61</td>
								                        <td>0.43</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择12</td>
								                        <td>0.76</td>
								                        <td>3</td>
								                        <td>0.75</td>
								                        <td>0.38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择13</td>
								                        <td>0.56</td>
								                        <td>3</td>
								                        <td>0.53</td>
								                        <td>0.44</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">9(1)</td>
								                        <td>0.87</td>
								                        <td>3</td>
								                        <td>0.87</td>
								                        <td>0.19</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">9(2)_1</td>
								                        <td>0.24</td>
								                        <td>4</td>
								                        <td>0.23</td>
								                        <td>0.24</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">9(2)_2</td>
								                        <td>0.63</td>
								                        <td>3</td>
								                        <td>0.62</td>
								                        <td>0.37</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">10_1</td>
								                        <td>0.26</td>
								                        <td>3</td>
								                        <td>0.26</td>
								                        <td>0.19</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">10_2</td>
								                        <td>0.32</td>
								                        <td>4</td>
								                        <td>0.33</td>
								                        <td>0.26</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">11</td>
								                        <td>0.67</td>
								                        <td>6</td>
								                        <td>0.69</td>
								                        <td>0.46</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">14</td>
								                        <td>0.49</td>
								                        <td>4</td>
								                        <td>0.44</td>
								                        <td>0.31</td>
								                    </tr>
								                   <tr>
								                       <td class="max-bg-blue">15</td>
								                       <td>0.54</td>
								                       <td>4</td>
								                       <td>0.54</td>
								                       <td>0.17</td>
								                   </tr>
								                    <tr>
								                        <td class="max-bg-blue">16-19</td>
								                        <td>0.59</td>
								                        <td>4</td>
								                        <td>0.59</td>
								                        <td>0.20</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">17-20</td>
								                        <td>0.36</td>
								                        <td>5</td>
								                        <td>0.35</td>
								                        <td>0.21</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">18-21</td>
								                        <td>0.38</td>
								                        <td>6</td>
								                        <td>0.39</td>
								                        <td>0.18</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">22</td>
								                        <td>0.49</td>
								                        <td>6</td>
								                        <td>0.48</td>
								                        <td>0.20</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">23</td>
								                        <td>0.65</td>
								                        <td>6</td>
								                        <td>0.65</td>
								                        <td>0.22</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">24</td>
								                        <td>0.69</td>
								                        <td>60</td>
								                        <td>0.68</td>
								                        <td>0.10</td>
								                    </tr>
								                    </tbody>
								                </table>
							                </div>

							            </div>
							        </div>

							        <!--数学-->
						            <div id="shuxue">
						            	<!-- 数学第一部分 -->
						            	<div class="two_two" id="part22">
						            		<h3>2.2 数学</h3>
								            <div class="two_two_one" id="part221">
												<h4>2.2.1 总体分布情况</h4>
								                <p class="fenxiText">
								                    从数学在各分数段的分布（图9）来看，广州市天河中学数学在80-90分数段学生分布最多。                </p>
								                <div class="scorePic reportTable" id="scorePic9"></div>
								                <p class="tacenter">图9 数学分数段分布对比图</p>
							            	</div>
							            	<div class="two_two_two" id="part222">
							            		<h4>2.2.2 各知识模块得分情况分析</h4>
								                <p class="tacenter">表8 数学各知识模块得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                        <tr class="max-bg-blue">
								                            <td rowspan="2">知识模块</td>
								                            <td colspan="2">本校情况</td>
								                            <td colspan="4">总体对比</td>
								                            <td rowspan="2">满分值</td>
								                        </tr>
								                        <tr class="max-bg-blue">
								                            <td>平均分</td>
								                            <td>得分率</td>
								                            <td colspan="2">区平均分</td>
								                            <td colspan="2">市平均分</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">复数</td>
								                            <td>4.91</td>
								                            <td>0.98</td>
								                            <td>4.84</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>4.78</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>5</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">函数与导数</td>
								                            <td>8.15</td>
								                            <td>0.21</td>
								                            <td>7.9</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>8.65</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>37</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">常用逻辑用语</td>
								                            <td>8.01</td>
								                            <td>0.80</td>
								                            <td>7.82</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>7.91</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>10</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">立体几何</td>
								                            <td>8.75</td>
								                            <td>0.46</td>
								                            <td>8.23</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>8.23</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>19</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">排列组合、概率与统计</td>
								                            <td>15.66</td>
								                            <td>0.71</td>
								                            <td>15.10</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>15.49</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>22</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">平面解析几何</td>
								                            <td>8.43</td>
								                            <td>0.44</td>
								                            <td>7.44</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>7.83</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>19</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">平面向量与三角</td>
								                            <td>19.34</td>
								                            <td>0.88</td>
								                            <td>18.09</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>18.49</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>22</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">数列、推理与证明</td>
								                            <td>4.59</td>
								                            <td>0.92</td>
								                            <td>4.39</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>4.48</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>5</td>
								                        </tr>
								                        <tr>
								                            <td class="max-bg-blue">算法初步</td>
								                            <td>4.27</td>
								                            <td>0.85</td>
								                            <td>8.62</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>4.16</td>
								                            <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                            <td>10</td>
								                        </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic10"></div>
                								<p class="tacenter">图10 数学各知识模块得分率对比图</p>
							            	</div>
							            	<div class="two_two_three" id="part223">
							            		<h4>2.2.3 各认知层次得分情况分析</h4>
								                <p class="tacenter">表9 数学各认知层次得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">认知层次</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">理解</td>
								                        <td>26.23</td>
								                        <td>26.23</td>
								                        <td>25.17</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>26.12</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>40</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">推理</td>
								                        <td>33.14</td>
								                        <td>0.41</td>
								                        <td>33.52</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>34.37</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>80</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">应用</td>
								                        <td>23.05</td>
								                        <td>0.77</td>
								                        <td>23.73</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>24.02</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>30</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic11"></div>
                								<p class="tacenter">图11 数学各认知层次得分率对比图</p>
							            	</div>
							            	<div class="two_two_four" id="part224">
							            		<h4>2.2.4 各题型得分情况分析</h4>
								                <p class="tacenter">表10 数学各题型得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">题型</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择题</td>
								                        <td>29.11</td>
								                        <td>0.43</td>
								                        <td>28.56</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>28.79</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>60</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">填空题</td>
								                        <td>18.55</td>
								                        <td>0.74</td>
								                        <td>17.76</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>18.21</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>25</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选做题</td>
								                        <td>4.72</td>
								                        <td>0.73</td>
								                        <td>4.48</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>4.49</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>16</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">解答题</td>
								                        <td>34.43</td>
								                        <td>0.94</td>
								                        <td>31.62</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>33.02</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>49</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic12"></div>
								                <p class="tacenter">图12 数学各题型得分率对比图</p>
							            	</div>
							            	<div class="two_two_five" id="part225">
							            		<h4>2.2.5 各题得分情况分析</h4>
								                <p class="tacenter">表11 数学各小题得分情况分析</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td>题号</td>
								                        <td>本校得分率</td>
								                        <td>满分值</td>
								                        <td>难度</td>
								                        <td>区分度</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择1</td>
								                        <td>0.97</td>
								                        <td>5</td>
								                        <td>0.94</td>
								                        <td>0.16</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择2</td>
								                        <td>0.98</td>
								                        <td>5</td>
								                        <td>0.95</td>
								                        <td>0.11</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择3</td>
								                        <td>0.97</td>
								                        <td>5</td>
								                        <td>0.94</td>
								                        <td>0.15</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择4</td>
								                        <td>0.57</td>
								                        <td>5</td>
								                        <td>0.54</td>
								                        <td>0.72</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择5</td>
								                        <td>0.85</td>
								                        <td>5</td>
								                        <td>0.52</td>
								                        <td>0.26</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择6</td>
								                        <td>0.63</td>
								                        <td>5</td>
								                        <td>0.62</td>
								                        <td>0.39</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择7</td>
								                        <td>0.41</td>
								                        <td>5</td>
								                        <td>0.40</td>
								                        <td>0.48</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择8</td>
								                        <td>0.44</td>
								                        <td>5</td>
								                        <td>0.44</td>
								                        <td>0.32</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">9-13_1</td>
								                        <td>0.92</td>
								                        <td>5</td>
								                        <td>0.91</td>
								                        <td>0.16</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">9-13_2</td>
								                        <td>0.60</td>
								                        <td>5</td>
								                        <td>0.51</td>
								                        <td>0.64</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">9-13_3</td>
								                        <td>0.92</td>
								                        <td>5</td>
								                        <td>0.89</td>
								                        <td>0.26</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">9-13_4</td>
								                        <td>0.92</td>
								                        <td>5</td>
								                        <td>0.85</td>
								                        <td>0.31</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">9-13_5</td>
								                        <td>0.35</td>
								                        <td>5</td>
								                        <td>0.42</td>
								                        <td>0.41</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">14-15</td>
								                        <td>0.94</td>
								                        <td>5</td>
								                        <td>0.89</td>
								                        <td>0.26</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">16_1</td>
								                        <td>0.87</td>
								                        <td>5</td>
								                        <td>0.83</td>
								                        <td>0.23</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">16_2</td>
								                        <td>0.79</td>
								                        <td>7</td>
								                        <td>0.73</td>
								                        <td>0.52</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">17_1</td>
								                        <td>0.98</td>
								                        <td>6</td>
								                        <td>0.94</td>
								                        <td>0.18</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">17_2</td>
								                        <td>0.52</td>
								                        <td>6</td>
								                        <td>0.51</td>
								                        <td>0.51</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">18_1</td>
								                        <td>0.92</td>
								                        <td>4</td>
								                        <td>0.84</td>
								                        <td>0.19</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">18_2</td>
								                        <td>0.29</td>
								                        <td>10</td>
								                        <td>0.23</td>
								                        <td>0.46</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">19_1</td>
								                        <td>0.65</td>
								                        <td>4</td>
								                        <td>0.58</td>
								                        <td>0.54</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">19_2</td>
								                        <td>0.28</td>
								                        <td>10</td>
								                        <td>0.25</td>
								                        <td>0.61</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">20_1</td>
								                        <td>0.62</td>
								                        <td>4</td>
								                        <td>0.54</td>
								                        <td>0.55</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">20_2</td>
								                        <td>0.11</td>
								                        <td>6</td>
								                        <td>0.11</td>
								                        <td>0.31</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">20_3</td>
								                        <td>0.01</td>
								                        <td>4</td>
								                        <td>0.02</td>
								                        <td>0.07</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">21_1</td>
								                        <td>0.06</td>
								                        <td>5</td>
								                        <td>0.09</td>
								                        <td>0.19</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">21_2</td>
								                        <td>0.01</td>
								                        <td>4</td>
								                        <td>0.02</td>
								                        <td>0.08</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">21_3</td>
								                        <td>0.00</td>
								                        <td>5</td>
								                        <td>0.00</td>
								                        <td>0.01</td>
								                    </tr>
								                    </tbody>
								                </table>
							            	</div>
						            	</div>
						           	</div>

						           	<!--英语-->
						            <div id="yingyu">
						            	<!-- 英语第一部分 -->
						            	<div class="two_three" id="part23">
						            		<h3>2.3 英语</h3>
								            <div class="two_three_one" id="part231">
												<h4>2.3.1 总体分布情况</h4>
								                <p class="fenxiText">
								                    从英语在各分数段的分布（图13）来看，广州市天河中学语文在90-100分数段学生分布最多。
								                </p>
								                <div class="scorePic reportTable" id="scorePic13"></div>
								                <p class="tacenter">图13 英语分数段分布对比图</p>
								            </div>
								            <div class="two_three_two" id="part232">
								            	<h4>2.3.2 各知识模块得分情况分析</h4>
								                <p class="tacenter">表12 英语各知识模块得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">知识模块</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">听说</td>
								                        <td>10.14</td>
								                        <td>0.68</td>
								                        <td>9.30</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>9.49</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>15</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">写作</td>
								                        <td>21.43</td>
								                        <td>0.54</td>
								                        <td>19.86</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>20.53</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>40</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">语言知识及运用</td>
								                        <td>21.65</td>
								                        <td>0.48</td>
								                        <td>18.86</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>20.30</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>45</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">阅读</td>
								                        <td>32.80</td>
								                        <td>0.66</td>
								                        <td>29.37</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>30.47</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>50</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic14"></div>
                								<p class="tacenter">图14 英语各知识模块得分率对比图</p>
								            </div>
								            <div class="two_three_three" id="part233">
								            	<h4>2.3.3 各认知层次得分情况分析</h4>
								                <p class="tacenter">表13 英语各认知层次得分情况况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">认知层次</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">识记</td>
								                        <td>31.17</td>
								                        <td>0.57</td>
								                        <td>29.62</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>30.78</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>50</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">理解</td>
								                        <td>30.58</td>
								                        <td>0.61</td>
								                        <td>27.31</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>28.51</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>55</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">运用</td>
								                        <td>24.27</td>
								                        <td>0.54</td>
								                        <td>20.46</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>21.50</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>45</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic15"></div>
                								<p class="tacenter">图15 英语各认知层次得分率对比图</p>
								            </div>
								            <div class="two_three_four" id="part234">
								            	<h4>2.3.4 各题型得分情况分析</h4>
								                <p class="tacenter">表14 英语各题型得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">题型</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择题</td>
								                        <td>0.61</td>
								                        <td>0.71</td>
								                        <td>43.51</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>45.40</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>80</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">填空题</td>
								                        <td>0.4</td>
								                        <td>0.55</td>
								                        <td>4.71</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>5.38</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>15</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">作文题</td>
								                        <td>0.54</td>
								                        <td>0.56</td>
								                        <td>19.86</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>20.53</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>40</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">口语题</td>
								                        <td>0.68</td>
								                        <td>0.71</td>
								                        <td>9.30</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>9.49</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>15</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic16"></div>
                								<p class="tacenter">图16 英语各题型得分率对比图</p>
								            </div>
								            <div class="two_three_five" id="part235">
								            	<h3>2.3.5 各题得分情况分析</h3>
								                <p class="tacenter">表15 英语各小题得分情况分析</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td>题号</td>
								                        <td>本校得分率</td>
								                        <td>满分值</td>
								                        <td>难度</td>
								                        <td>区分度</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择1</td>
								                        <td>0.22</td>
								                        <td>2</td>
								                        <td>0.20</td>
								                        <td>0.30</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择2</td>
								                        <td>0.66</td>
								                        <td>2</td>
								                        <td>0.58</td>
								                        <td>0.56</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择3</td>
								                        <td>0.56</td>
								                        <td>2</td>
								                        <td>0.50</td>
								                        <td>0.60</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择4</td>
								                        <td>0.60</td>
								                        <td>2</td>
								                        <td>0.53</td>
								                        <td>0.67</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择5</td>
								                        <td>0.42</td>
								                        <td>2</td>
								                        <td>0.42</td>
								                        <td>0.48</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择6</td>
								                        <td>0.41</td>
								                        <td>2</td>
								                        <td>0.33</td>
								                        <td>0.68</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择7</td>
								                        <td>0.39</td>
								                        <td>2</td>
								                        <td>0.41</td>
								                        <td>0.55</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择8</td>
								                        <td>0.17</td>
								                        <td>2</td>
								                        <td>0.18</td>
								                        <td>-0.09</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择9</td>
								                        <td>0.35</td>
								                        <td>2</td>
								                        <td>0.27</td>
								                        <td>0.15</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择10</td>
								                        <td>0.59</td>
								                        <td>2</td>
								                        <td>0.54</td>
								                        <td>0.26</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择11</td>
								                        <td>0.76</td>
								                        <td>2</td>
								                        <td>0.58</td>
								                        <td>0.64</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择12</td>
								                        <td>0.82</td>
								                        <td>2</td>
								                        <td>0.79</td>
								                        <td>0.42</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择13</td>
								                        <td>0.40</td>
								                        <td>2</td>
								                        <td>0.36</td>
								                        <td>0.25</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择14</td>
								                        <td>0.64</td>
								                        <td>2</td>
								                        <td>0.56</td>
								                        <td>0.63</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择15</td>
								                        <td>0.85</td>
								                        <td>2</td>
								                        <td>0.75</td>
								                        <td>0.60</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择26</td>
								                        <td>0.75</td>
								                        <td>2</td>
								                        <td>0.64</td>
								                        <td>0.38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择27</td>
								                        <td>0.88</td>
								                        <td>2</td>
								                        <td>0.77</td>
								                        <td>0.42</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择28</td>
								                        <td>0.51</td>
								                        <td>2</td>
								                        <td>0.44</td>
								                        <td>0.58</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择29</td>
								                        <td>0.63</td>
								                        <td>2</td>
								                        <td>0.56</td>
								                        <td>0.35</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择30</td>
								                        <td>0.63</td>
								                        <td>2</td>
								                        <td>0.55</td>
								                        <td>0.49</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择31</td>
								                        <td>0.92</td>
								                        <td>2</td>
								                        <td>0.85</td>
								                        <td>0.28</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择32</td>
								                        <td>0.12</td>
								                        <td>2</td>
								                        <td>0.15</td>
								                        <td>0.02</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择33</td>
								                        <td>0.53</td>
								                        <td>2</td>
								                        <td>0.49</td>
								                        <td>0.39</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择34</td>
								                        <td>0.48</td>
								                        <td>2</td>
								                        <td>0.44</td>
								                        <td>0.39</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择35</td>
								                        <td>0.78</td>
								                        <td>2</td>
								                        <td>0.69</td>
								                        <td>0.47</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择36</td>
								                        <td>0.72</td>
								                        <td>2</td>
								                        <td>0.63</td>
								                        <td>0.60</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择37</td>
								                        <td>0.25</td>
								                        <td>2</td>
								                        <td>0.23</td>
								                        <td>0.40</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择38</td>
								                        <td>0.59</td>
								                        <td>2</td>
								                        <td>0.50</td>
								                        <td>0.61</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择39</td>
								                        <td>0.80</td>
								                        <td>2</td>
								                        <td>0.69</td>
								                        <td>0.61</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择40</td>
								                        <td>0.66</td>
								                        <td>2</td>
								                        <td>0.57</td>
								                        <td>0.57</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择41</td>
								                        <td>0.42</td>
								                        <td>2</td>
								                        <td>0.32</td>
								                        <td>0.35</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择42</td>
								                        <td>0.43</td>
								                        <td>2</td>
								                        <td>0.42</td>
								                        <td>0.17</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择43</td>
								                        <td>0.49</td>
								                        <td>2</td>
								                        <td>0.40</td>
								                        <td>0.43</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择44</td>
								                        <td>0.52</td>
								                        <td>2</td>
								                        <td>0.39</td>
								                        <td>0.63</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择45</td>
								                        <td>0.67</td>
								                        <td>2</td>
								                        <td>0.59</td>
								                        <td>0.51</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择46</td>
								                        <td>0.91</td>
								                        <td>2</td>
								                        <td>0.82</td>
								                        <td>0.39</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择47</td>
								                        <td>0.94</td>
								                        <td>2</td>
								                        <td>0.89</td>
								                        <td>0.21</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择48</td>
								                        <td>0.93</td>
								                        <td>2</td>
								                        <td>0.82</td>
								                        <td>0.35</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择49</td>
								                        <td>0.94</td>
								                        <td>2</td>
								                        <td>0.89</td>
								                        <td>0.23</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择50</td>
								                        <td>0.90</td>
								                        <td>2</td>
								                        <td>0.81</td>
								                        <td>0.40</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_16</td>
								                        <td>0.38</td>
								                        <td>1.5</td>
								                        <td>0.24</td>
								                        <td>0.61</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_17</td>
								                        <td>0.37</td>
								                        <td>1.5</td>
								                        <td>0.28</td>
								                        <td>0.61</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_18</td>
								                        <td>0.69</td>
								                        <td>1.5</td>
								                        <td>0.51</td>
								                        <td>0.70</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_19</td>
								                        <td>0.16</td>
								                        <td>1.5</td>
								                        <td>0.15</td>
								                        <td>0.17</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_20</td>
								                        <td>0.28</td>
								                        <td>1.5</td>
								                        <td>0.21</td>
								                        <td>0.56</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_21</td>
								                        <td>0.56</td>
								                        <td>1.5</td>
								                        <td>0.43</td>
								                        <td>0.72</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_22</td>
								                        <td>0.56</td>
								                        <td>1.5</td>
								                        <td>0.45</td>
								                        <td>0.69</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_23</td>
								                        <td>0.08</td>
								                        <td>1.5</td>
								                        <td>0.07</td>
								                        <td>0.20</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_24</td>
								                        <td>0.21</td>
								                        <td>1.5</td>
								                        <td>0.28</td>
								                        <td>0.06</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">1_25</td>
								                        <td>0.68</td>
								                        <td>1.5</td>
								                        <td>0.56</td>
								                        <td>0.70</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">2_1</td>
								                        <td>0.49</td>
								                        <td>8</td>
								                        <td>0.44</td>
								                        <td>0.37</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">2_2/td&gt;
								                        </td><td>0.76</td>
								                        <td>5</td>
								                        <td>0.70</td>
								                        <td>0.44</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">2_3</td>
								                        <td>0.54</td>
								                        <td>2</td>
								                        <td>0.47</td>
								                        <td>0.45</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">3_1</td>
								                        <td>0.50</td>
								                        <td>5</td>
								                        <td>0.47</td>
								                        <td>0.35</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">3_2</td>
								                        <td>0.51</td>
								                        <td>20</td>
								                        <td>0.49</td>
								                        <td>0.43</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">口语</td>
								                        <td>0.69</td>
								                        <td>15</td>
								                        <td>0.63</td>
								                        <td>0.35</td>
								                    </tr>
								                    </tbody>
								                </table>
								            </div>

								        </div>
								    </div>

								    <!--物理-->
						            <div id="wuli">
						            	<!-- 物理第一部分 -->
						            	<div class="two_four" id="part24">
						            		<h3>2.4 物理</h3>
								            <div class="two_four_one" id="part241">
												<h4>2.4.1 总体分布情况</h4>
												<p class="fenxiText">
							                    从物理在各分数段的分布（图17）来看，广州市天河中学物理在70-80分数段学生分布最多，与全市相比，中上分数段学生分布比例较高                </p>
							                	<div class="scorePic reportTable" id="scorePic17"></div>
							                	<p class="tacenter">图17 物理分数段分布对比图</p>
											</div>
											<div class="two_four_two" id="part242">
												<h4>2.4.2 各知识模块得分情况分析</h4>
								                <p class="tacenter">表16 物理各知识模块得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">知识模块</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">电磁学</td>
								                        <td>25.57</td>
								                        <td>0.73</td>
								                        <td>25.51</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>24.59</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">力学</td>
								                        <td>21.20</td>
								                        <td>0.62</td>
								                        <td>19.17</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>18.12</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>34</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">热学</td>
								                        <td>3.17</td>
								                        <td>0.53</td>
								                        <td>3.56</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>3.78</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>6</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">实验</td>
								                        <td>13.04</td>
								                        <td>0.72</td>
								                        <td>12.45</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>12.55</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>18</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">原子物理</td>
								                        <td>3.70</td>
								                        <td>0.92</td>
								                        <td>12.65</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>3.53</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>4</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic18"></div>
                								<p class="tacenter">图18 物理各知识模块得分率对比图</p>
											</div>
											<div class="two_four_three" id="part243">
												<h4>2.4.3 各认知层次得分情况分析</h4>
								                <p class="tacenter">表17 物理各认知层次得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">认知层次</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">识记</td>
								                        <td>29.32</td>
								                        <td>0.73</td>
								                        <td>23.26</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>28.46</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>32</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">理解</td>
								                        <td>24.51</td>
								                        <td>0.58</td>
								                        <td>28.32</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>22.66</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>52</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">运用</td>
								                        <td>14.85</td>
								                        <td>0.83</td>
								                        <td>12.65</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>11.98</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>16</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic19"></div>
                								<p class="tacenter">图19 物理各认知层次得分率对比图</p>
											</div>
											<div class="two_four_four" id="part244">
												<h4>2.4.4 各题型得分情况分析</h4>
								                <p class="tacenter">表18 物理各题型得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">题型</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">单选题</td>
								                        <td>13.06</td>
								                        <td>0.49</td>
								                        <td>12.47</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>12.41</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>25</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">多选题</td>
								                        <td>24.53</td>
								                        <td>0.75</td>
								                        <td>23.49</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>23.39</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>30</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">解答题</td>
								                        <td>31.08</td>
								                        <td>0.71</td>
								                        <td>29.26</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>26.77</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>45</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic20"></div>
                								<p class="tacenter">图20 物理各题型得分率对比图</p>
											</div>
											<div class="four_five" id="part245">
												<h4>2.4.5 各题得分情况分析</h4>
								                <p class="tacenter">表19 物理各小题得分情况分析</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td>题号</td>
								                        <td>本校得分率</td>
								                        <td>满分值</td>
								                        <td>难度</td>
								                        <td>区分度</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择13</td>
								                        <td>0.54</td>
								                        <td>4</td>
								                        <td>0.47</td>
								                        <td>0.57</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择14</td>
								                        <td>0.93</td>
								                        <td>4</td>
								                        <td>0.94</td>
								                        <td>0.19</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择15</td>
								                        <td>0.92</td>
								                        <td>4</td>
								                        <td>0.92</td>
								                        <td>0.31</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择16</td>
								                        <td>0.87</td>
								                        <td>4</td>
								                        <td>0.89</td>
								                        <td>0.34</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">双选17</td>
								                        <td>0.98</td>
								                        <td>6</td>
								                        <td>0.97</td>
								                        <td>0.18</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">双选18</td>
								                        <td>0.94</td>
								                        <td>6</td>
								                        <td>0.86</td>
								                        <td>0.49</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">双选19</td>
								                        <td>0.93</td>
								                        <td>6</td>
								                        <td>0.90</td>
								                        <td>0.40</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">双选20</td>
								                        <td>0.53</td>
								                        <td>6</td>
								                        <td>0.68</td>
								                        <td>0.52</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">双选21</td>
								                        <td>0.71</td>
								                        <td>6</td>
								                        <td>0.73</td>
								                        <td>0.45</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">34(1)_1</td>
								                        <td>0.83</td>
								                        <td>4</td>
								                        <td>0.88</td>
								                        <td>0.30</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">34(1)_2</td>
								                        <td>0.69</td>
								                        <td>4</td>
								                        <td>0.76</td>
								                        <td>0.39</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">34(2)_1</td>
								                        <td>0.84</td>
								                        <td>2</td>
								                        <td>0.80</td>
								                        <td>0.28</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">34(2)_2</td>
								                        <td>0.85</td>
								                        <td>2</td>
								                        <td>0.82</td>
								                        <td>0.31</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">34(2)_3</td>
								                        <td>0.60</td>
								                        <td>0.6</td>
								                        <td>0.60</td>
								                        <td>0.32</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">35_1</td>
								                        <td>0.69</td>
								                        <td>6</td>
								                        <td>0.70</td>
								                        <td>0.76</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">35_2</td>
								                        <td>0.60</td>
								                        <td>6</td>
								                        <td>0.56</td>
								                        <td>0.79</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">35_3</td>
								                        <td>0.47</td>
								                        <td>6</td>
								                        <td>0.41</td>
								                        <td>0.74</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">36_1</td>
								                        <td>0.83</td>
								                        <td>4</td>
								                        <td>0.76</td>
								                        <td>0.65</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">36_2</td>
								                        <td>0.60</td>
								                        <td>6</td>
								                        <td>0.50</td>
								                        <td>0.70</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">36_3</td>
								                        <td>0.07</td>
								                        <td>8</td>
								                        <td>0.09</td>
								                        <td>0.21</td>
								                    </tr>
								                    </tbody>
								                </table>
											</div>
										</div>
									</div>

									<!--化学-->
						            <div id="huaxue">
						            	<!-- 化学第一部分 -->
						            	<div class="two_five" id="part25">
						            		<h3>2.5 化学</h3>
								            <div class="two_five_one" id="part251">
												<h4>2.5.1 总体分布情况</h4>
												<p class="fenxiText">
								                    从化学在各分数段的分布（图21）来看，广州市天河中学化学在60-70分数段学生分布最多，与全市相比，中下分数段学生分布比例较高。
								                </p>
								                <div class="scorePic reportTable" id="scorePic21"></div>
								                <p class="tacenter">图21 化学分数段分布对比图</p>
											</div>
											<div class="two_five_two" id="part252">
												<h4>2.5.2 各知识模块得分情况分析</h4>
								                <p class="tacenter">表20 化学各知识模块得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">知识模块</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">化学平衡</td>
								                        <td>15.44</td>
								                        <td>0.59</td>
								                        <td>15.73</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>15.89</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>26</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">离子反应</td>
								                        <td>3.27</td>
								                        <td>0.82</td>
								                        <td>3.30</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>3.28</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>4</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">实验</td>
								                        <td>17.45</td>
								                        <td>0.51</td>
								                        <td>18.42</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>18.36</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>34</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">氧化还原反应</td>
								                        <td>4.17</td>
								                        <td>0.52</td>
								                        <td>4.35</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>4.19</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>8</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">有机物</td>
								                        <td>14.94</td>
								                        <td>0.75</td>
								                        <td>14.75</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>14.87</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>20</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">元素</td>
								                        <td>5.48</td>
								                        <td>0.69</td>
								                        <td>5.53</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>5.41</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>8</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic22"></div>
								                <p class="tacenter">图22 化学各知识模块得分率对比图</p>
											</div>
											<div class="two_five_three" id="part253">
												<h4>2.5.3 各认知层次得分情况分析</h4>
								                <p class="tacenter">表21 化学各认知层次得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">认知层次</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">识记</td>
								                        <td>22.17</td>
								                        <td>0.55</td>
								                        <td>23.45</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>23.25</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>33</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">理解</td>
								                        <td>26.25</td>
								                        <td>0.69</td>
								                        <td>26.54</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>25.74</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>45</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">运用</td>
								                        <td>12.33</td>
								                        <td>0.56</td>
								                        <td>12.09</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>13.01</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>22</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic23"></div>
								                <p class="tacenter">图23 化学各认知层次得分率对比图</p>
											</div>

											<div class="two_five_four" id="part254">
												<h4>2.5.4 各题型得分情况分析</h4>
								                <p class="tacenter">表22 化学各题型得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">题型</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">单选题</td>
								                        <td>19.54</td>
								                        <td>0.81</td>
								                        <td>19.99</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>19.99</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>24</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">多选题</td>
								                        <td>8.34</td>
								                        <td>0.69</td>
								                        <td>7.72</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>7.78</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>12</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">解答题</td>
								                        <td>32.87</td>
								                        <td>0.51</td>
								                        <td>34.37</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>34.40</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>64</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic24"></div>
								                <p class="tacenter">图24 化学各题型得分率对比图</p>
											</div>
											<div class="two_five_five" id="part255">
												<h4>2.5.5 各题得分情况分析</h4>
								                <p class="tacenter">表23 化学各小题得分情况分析</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td>题号</td>
								                        <td>本校得分率</td>
								                        <td>满分值</td>
								                        <td>难度</td>
								                        <td>区分度</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择7</td>
								                        <td>0.91</td>
								                        <td>4</td>
								                        <td>0.87</td>
								                        <td>0.38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择8</td>
								                        <td>0.78</td>
								                        <td>4</td>
								                        <td>0.80</td>
								                        <td>0.39</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择9</td>
								                        <td>0.79</td>
								                        <td>4</td>
								                        <td>0.82</td>
								                        <td>0.45</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择10</td>
								                        <td>0.8</td>
								                        <td>4</td>
								                        <td>0.80</td>
								                        <td>0.48</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择11</td>
								                        <td>0.82</td>
								                        <td>4</td>
								                        <td>0.82</td>
								                        <td>0.46</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择12</td>
								                        <td>0.8</td>
								                        <td>4</td>
								                        <td>0.84</td>
								                        <td>0.43</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">双选22</td>
								                        <td>0.6</td>
								                        <td>6</td>
								                        <td>0.54</td>
								                        <td>0.48</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">双选23</td>
								                        <td>0.79</td>
								                        <td>6</td>
								                        <td>0.74</td>
								                        <td>0.63</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">30_1</td>
								                        <td>0.85</td>
								                        <td>2</td>
								                        <td>0.83</td>
								                        <td>0.38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">30_2</td>
								                        <td>0.89</td>
								                        <td>4</td>
								                        <td>0.85</td>
								                        <td>0.38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">30_3</td>
								                        <td>0.79</td>
								                        <td>3</td>
								                        <td>0.74</td>
								                        <td>0.55</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">30_4</td>
								                        <td>0.53</td>
								                        <td>4</td>
								                        <td>0.58</td>
								                        <td>0.60</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">30_5</td>
								                        <td>0.68</td>
								                        <td>3</td>
								                        <td>0.63</td>
								                        <td>0.67</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">31_1</td>
								                        <td>0.38</td>
								                        <td>4</td>
								                        <td>0.49</td>
								                        <td>0.15</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">31_2</td>
								                        <td>0.47</td>
								                        <td>2</td>
								                        <td>0.47</td>
								                        <td>0.58</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">31_3</td>
								                        <td>0.58</td>
								                        <td>3</td>
								                        <td>0.53</td>
								                        <td>0.68</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">31_4</td>
								                        <td>0.43</td>
								                        <td>2</td>
								                        <td>0.45</td>
								                        <td>0.51</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">31_5</td>
								                        <td>0.49</td>
								                        <td>3</td>
								                        <td>0.55</td>
								                        <td>0.33</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">31_6</td>
								                        <td>0.5</td>
								                        <td>2</td>
								                        <td>0.68</td>
								                        <td>0.38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">32_1</td>
								                        <td>0.96</td>
								                        <td>2</td>
								                        <td>0.91</td>
								                        <td>0.24</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">32_2</td>
								                        <td>0.97</td>
								                        <td>3</td>
								                        <td>0.94</td>
								                        <td>0.15</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">32_3</td>
								                        <td>0.9</td>
								                        <td>4</td>
								                        <td>0.86</td>
								                        <td>0.27</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">32_4</td>
								                        <td>0.04</td>
								                        <td>4</td>
								                        <td>0.15</td>
								                        <td>0.32</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">32_5</td>
								                        <td>0.35</td>
								                        <td>3</td>
								                        <td>0.32</td>
								                        <td>0.43</td>
								                    </tr>
								                    </tbody>
								                </table>
											</div>

									</div>

									<!--生物-->
						            <div id="shengwu">
						            	<!-- 生物第一部分 -->
						            	<div class="two_six" id="part26">
						            		<h3>2.6 生物</h3>
								            <div class="two_six_one" id="part261">
												<h4>2.6.1 总体分布情况</h4>
												<p class="fenxiText">
								                    从生物在各分数段的分布（图25）来看，广州市天河中学生物在70-80分数段学生分布最多。
								                </p>
								                <div class="scorePic reportTable" id="scorePic25"></div>
								                <p class="tacenter">图25 生物分数段分布对比图</p>
											</div>
											<div class="two_six_two" id="part262">
												<h4>2.6.2 各知识模块得分情况分析</h4>
								                <p class="tacenter">表24 生物各知识模块得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">知识模块</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">分子与细胞</td>
								                        <td>14.16</td>
								                        <td>0.64</td>
								                        <td>12.51</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>12.39</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>22</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">教材实验</td>
								                        <td>7.51</td>
								                        <td>0.75</td>
								                        <td>7.00</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>6.92</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>10</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">生物与环境</td>
								                        <td>18.34</td>
								                        <td>0.71</td>
								                        <td>16.83</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>17.17</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>26</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">探究实验</td>
								                        <td>8.27</td>
								                        <td>0.69</td>
								                        <td>7.86</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>7.76</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>12</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">现代生物科技</td>
								                        <td>1.09</td>
								                        <td>0.27</td>
								                        <td>1.84</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>2.06</td>
								                        <td><img src="${basePath!''}/images/down.png" alt=""></td>
								                        <td>4</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">遗传与进化</td>
								                        <td>18.57</td>
								                        <td>0.71</td>
								                        <td>16.59</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>16.18</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>26</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic26"></div>
								                <p class="tacenter">图26 生物各知识模块得分率对比图</p>
											</div>
											<div class="two_six_three" id="part263">
												<h4>2.6.3 各认知层次得分情况分析</h4>
								                <p class="tacenter">表25 生物各认知层次得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">认知层次</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">识记</td>
								                        <td>28.23</td>
								                        <td>0.74</td>
								                        <td>19.94</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>27.01</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>30</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">理解</td>
								                        <td>22.51</td>
								                        <td>0.75</td>
								                        <td>26.31</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>19.84</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">运用</td>
								                        <td>17.20</td>
								                        <td>0.54</td>
								                        <td>16.37</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>16.07</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>32</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic27"></div>
								                <p class="tacenter">图27 生物各认知层次得分率对比图</p>
											</div>
											<div class="two_six_four" id="part264">
												<h3>2.6.4 各题型得分情况分析</h3>
								                <p class="tacenter">表26 生物各题型得分情况</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td rowspan="2">题型</td>
								                        <td colspan="2">本校情况</td>
								                        <td colspan="4">总体对比</td>
								                        <td rowspan="2">满分值</td>
								                    </tr>
								                    <tr class="max-bg-blue">
								                        <td>平均分</td>
								                        <td>得分率</td>
								                        <td colspan="2">区平均分</td>
								                        <td colspan="2">市平均分</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">单选题</td>
								                        <td>18.15</td>
								                        <td>0.76</td>
								                        <td>17.55</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>17.70</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>24</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">多选题</td>
								                        <td>8.87</td>
								                        <td>0.74</td>
								                        <td>7.47</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>7.56</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>12</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">解答题</td>
								                        <td>40.92</td>
								                        <td>0.64</td>
								                        <td>37.60</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>37.23</td>
								                        <td><img src="${basePath!''}/images/up.png" alt=""></td>
								                        <td>64</td>
								                    </tr>
								                    </tbody>
								                </table>
								                <div class="scorePic reportTable" id="scorePic28"></div>
								                <p class="tacenter"><p class="tacenter">图28 生物各题型得分率对比图</p></p>
											</div>
											<div class="two_six_five" id="part265">
												<h4>2.6.5 各题得分情况分析</h4>
								                <p class="tacenter">表27 生物各小题得分情况分析</p>
								                <table class="max-table">
								                    <tbody>
								                    <tr class="max-bg-blue">
								                        <td>题号</td>
								                        <td>本校得分率</td>
								                        <td>满分值</td>
								                        <td>难度</td>
								                        <td>区分度</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择1</td>
								                        <td>0.79</td>
								                        <td>4</td>
								                        <td>0.67</td>
								                        <td>0.45</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择2</td>
								                        <td>0.83</td>
								                        <td>4</td>
								                        <td>0.74</td>
								                        <td>0.40</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择3</td>
								                        <td>0.87</td>
								                        <td>4</td>
								                        <td>0.78</td>
								                        <td>0.46</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择4</td>
								                        <td>0.86</td>
								                        <td>4</td>
								                        <td>0.84</td>
								                        <td>0.38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择5</td>
								                        <td>0.92</td>
								                        <td>4</td>
								                        <td>0.88</td>
								                        <td>0.32</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">选择6</td>
								                        <td>0.27</td>
								                        <td>4</td>
								                        <td>0.52</td>
								                        <td>0.51</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">双选24</td>
								                        <td>0.59</td>
								                        <td>6</td>
								                        <td>0.46</td>
								                        <td>0.66</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">双选25</td>
								                        <td>0.89</td>
								                        <td>6</td>
								                        <td>0.80</td>
								                        <td>0.46</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">26_1</td>
								                        <td>0.79</td>
								                        <td>2</td>
								                        <td>0.50</td>
								                        <td>0.71</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">26_2</td>
								                        <td>0.49</td>
								                        <td>2</td>
								                        <td>0.48</td>
								                        <td>0.61</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">26_3</td>
								                        <td>0.69</td>
								                        <td>4</td>
								                        <td>0.58</td>
								                        <td>0.42</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">26_4</td>
								                        <td>0.8</td>
								                        <td>6</td>
								                        <td>0.70</td>
								                        <td>0.49</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">26_5</td>
								                        <td>0.38</td>
								                        <td>2</td>
								                        <td>0.36</td>
								                        <td>0.34</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">27_1</td>
								                        <td>0.64</td>
								                        <td>4</td>
								                        <td>0.54</td>
								                        <td>0.68</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">27_2</td>
								                        <td>0.76</td>
								                        <td>4</td>
								                        <td>0.67</td>
								                        <td>0.51</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">27_3</td>
								                        <td>0.77</td>
								                        <td>8</td>
								                        <td>0.73</td>
								                        <td>0.44</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">28_1</td>
								                        <td>0.58</td>
								                        <td>4</td>
								                        <td>0.53</td>
								                        <td>0.48</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">28_2</td>
								                        <td>0.54</td>
								                        <td>4</td>
								                        <td>0.52</td>
								                        <td>0.38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">28_3</td>
								                        <td>0.18</td>
								                        <td>2</td>
								                        <td>0.20</td>
								                        <td>0.18</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">28_4</td>
								                        <td>0.27</td>
								                        <td>2</td>
								                        <td>0.47</td>
								                        <td>0.46</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">28_5</td>
								                        <td>0.42</td>
								                        <td>4</td>
								                        <td>0.40</td>
								                        <td>0.40</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">29前半题_1</td>
								                        <td>0.71</td>
								                        <td>2</td>
								                        <td>0.50</td>
								                        <td>0.56</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">29前半题_2</td>
								                        <td>0.75</td>
								                        <td>2</td>
								                        <td>0.70</td>
								                        <td>0.59</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">29前半题_3</td>
								                        <td>0.78</td>
								                        <td>2</td>
								                        <td>0.78</td>
								                        <td>0.16</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">29后半题_1</td>
								                        <td>0.85</td>
								                        <td>2</td>
								                        <td>0.79</td>
								                        <td>0.38</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">29后半题_2</td>
								                        <td>0.56</td>
								                        <td>2</td>
								                        <td>0.50</td>
								                        <td>0.40</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">29后半题_3</td>
								                        <td>0.65</td>
								                        <td>2</td>
								                        <td>0.62</td>
								                        <td>0.42</td>
								                    </tr>
								                    <tr>
								                        <td class="max-bg-blue">29后半题_4</td>
								                        <td>0.65</td>
								                        <td>4</td>
								                        <td>0.59</td>
								                        <td>0.12</td>
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
		var myChart = echarts.init(document.getElementById('scorePic1'));
		var myChart_2 = echarts.init(document.getElementById('scorePic2'));
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
		var myChart_24 = echarts.init(document.getElementById('scorePic24'));
		var myChart_25 = echarts.init(document.getElementById('scorePic25'));
		var myChart_26 = echarts.init(document.getElementById('scorePic26'));
		var myChart_27 = echarts.init(document.getElementById('scorePic27'));
		var myChart_28 = echarts.init(document.getElementById('scorePic28'));


        var option = {
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
                data:['本校','全市','趋势线-本校','趋势线-全市']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-50','50-100','100-150','150-200','200-250','250-300','300-350','350-400',
                        '400-450','450-500','500-550','550-600','600-650','650-700','700-750']
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
                    name:'本校',
                    type:'bar',
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,28, 18, 8,2, 0,0]
                },
                {
                    name:'全市',
                    type:'bar',
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                },
                {
                    name:'趋势线-本校',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,28, 18, 8,2, 0,0]
                }
                ,
                {
                    name:'趋势线-全市',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                },
            ]
        };

        var option2 = {
            tooltip : {
                trigger: 'item',
                formatter: "{d}%"
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
                                max: 100
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
                    name:'访问来源',
                    type:'pie',
                    radius : '55%',
                    center: ['50%', '60%'],
                    data:[
                        {value:4.43, name:'A等级'},
                        {value:31.01, name:'B等级'},
                        {value:47.47, name:'C等级'},
                        {value:13.95, name:'D等级'},
                        {value:3.16, name:'E等级'}
                    ],
                    itemStyle: {
                        normal: {
                            label: {
                                show: true,
                                formatter: '{b} {d}%',
                            },
                            labelLine: {show: true}
                        }
                    }
                }
            ]
        };

        var option3 = {
            tooltip : {
                trigger: 'axis'
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType: {show: true, type: ['bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            legend: {
                data:['本校','全市']
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
                    axisLabel : {
                        formatter: '{value} %'
                    }
                },
            ],
            series : [
                {
                    name:'本校',
                    type:'bar',
                    data:[4,31,46,14,3]
                },
                {
                    name:'全市',
                    type:'bar',
                    data:[11,22,33,23,10]
                },
            ]
        };

        var option4= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['A等级','B等级','C等级','D等级','E等级']
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
                    data:[0.71, 0.72, 0.8, 0.85, 0.83,0.86]
                },
                {
                    name:'B等级',
                    type:'line',
                    data:[0.68, 0.65, 0.65, 0.79, 0.61, 0.65]
                },
                {
                    name:'C等级',
                    type:'line',
                    data:[0.59,0.53,0.52, 0.60, 0.61,0.52]
                },
                {
                    name:'D等级',
                    type:'line',
                    data:[0.50, 0.53, 0.54, 0.60, 0.51, 0.45]
                },
                {
                    name:'E等级',
                    type:'line',
                    data:[0.42, 0.50, 0.35, 0.40, 0.45, 0.4]
                }
            ]
        };

        var option5 = {
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
                data:['本校','全市','趋势线-本校','趋势线-全市']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-10','10-20','20-30','30-40','40-50','50-60','60-70','70-80','80-90','90-100',
                                '100-110','110-120','120-130','130-140','140-150']
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                },
            ],
            series : [

                {
                    name:'本校',
                    type:'bar',
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                },
                {
                    name:'全市',
                    type:'bar',
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                },
                {
                    name:'趋势线-本校',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                }
                ,
                {
                    name:'趋势线-全市',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                }
                ,
            ]
        };

        var option6= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['古诗词阅读','文言文阅读','现代文阅读','写作','语言知识和运用'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8, 0.85, 0.83]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65, 0.79, 0.61]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52, 0.60, 0.61]
                }
            ]
        };

        var option7= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['识记','理解','运用'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };

        var option8= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['选择题','简答题','作文题'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };
        
        var option9 = {
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
                data:['本校','全市','趋势线-本校','趋势线-全市']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-10','10-20','20-30','30-40','40-50','50-60','60-70','70-80','80-90','90-100',
                        '100-110','110-120','120-130','130-140','140-150']
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                },
            ],
            series : [

                {
                    name:'本校',
                    type:'bar',
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                },
                {
                    name:'全市',
                    type:'bar',
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                },
                {
                    name:'趋势线-本校',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                }
                ,
                {
                    name:'趋势线-全市',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                }
                ,
            ]
        };

        var option10= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['复数','函数与导数','常用逻辑用语','立体几何','排列组合、概率与统计', '平面解析几何','平面向量与三角','数列、推理与证明','算法初步' ]
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8, 0.85, 0.83, 0.72, 0.8, 0.85, 0.83, 0.85, 0.83]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65, 0.79, 0.61, 0.65, 0.65, 0.79, 0.61, 0.61, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52, 0.60, 0.61,0.53,0.52, 0.60, 0.61, 0.60, 0.61]
                }
            ]
        };

        var option11= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['理解','推理','应用'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };

        var option12= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['选择题','填空题','选做题','解答题'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8,0.9]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65,0.89]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52,0.8]
                }
            ]
        };

        var option13 = {
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
                data:['本校','全市','趋势线-本校','趋势线-全市']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-10','10-20','20-30','30-40','40-50','50-60','60-70','70-80','80-90','90-100',
                        '100-110','110-120','120-130','130-140','140-150']
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                },
            ],
            series : [

                {
                    name:'本校',
                    type:'bar',
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                },
                {
                    name:'全市',
                    type:'bar',
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                },
                {
                    name:'趋势线-本校',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                }
                ,
                {
                    name:'趋势线-全市',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                }
                ,
            ]
        };

        var option14= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['听说能力','写作能力','语言知识及运用能力','阅读能力'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8, 0.85]
                },
                {
                    name: '全区',
                    type: 'line',
                    data: [0.68, 0.65, 0.65, 0.79]
                }
                ,
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52, 0.60 ]
                }
            ]
        };

        var option15= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['识记','理解','运用'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };

        var option16= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['选择题','填空题','作文题','口语题'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8,0.9]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65,0.89]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52,0.8]
                }
            ]
        };

        var option17 = {
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
                data:['本校','全市','趋势线-本校','趋势线-全市']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-10','10-20','20-30','30-40','40-50','50-60','60-70','70-80','80-90','90-100',
                        '100-110','110-120','120-130','130-140','140-150']
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                },
            ],
            series : [

                {
                    name:'本校',
                    type:'bar',
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                },
                {
                    name:'全市',
                    type:'bar',
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                },
                {
                    name:'趋势线-本校',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                }
                ,
                {
                    name:'趋势线-全市',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                }
            ]
        };

        var option18= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['电磁学','力学','热学','实验'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8, 0.85]
                },
                {
                    name: '全区',
                    type: 'line',
                    data: [0.68, 0.65, 0.65, 0.79]
                }
                ,
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52, 0.60 ]
                }
            ]
        };

        var option19= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['识记','理解','运用'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };

        var option20= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['单选题','多选题','解答题'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };

        var option21 = {
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
                data:['本校','全市','趋势线-本校','趋势线-全市']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-10','10-20','20-30','30-40','40-50','50-60','60-70','70-80','80-90','90-100',
                        '100-110','110-120','120-130','130-140','140-150']
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                },
            ],
            series : [

                {
                    name:'本校',
                    type:'bar',
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                },
                {
                    name:'全市',
                    type:'bar',
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                },
                {
                    name:'趋势线-本校',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                }
                ,
                {
                    name:'趋势线-全市',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                }
                ,
            ]
        };

        var option22= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['化学平衡','离子反应','实验','氧化还原反应','有机物','元素'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8, 0.85,0.6,0.5]
                },
                {
                    name: '全区',
                    type: 'line',
                    data: [0.68, 0.65, 0.65, 0.79,0.55,0.8]
                }
                ,
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52, 0.60,0.6,0.7]
                }
            ]
        };

        var option23= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['识记','理解','运用'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };

        var option24= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['单选题','多选题','解答题'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };

        var option25 = {
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
                data:['本校','全市','趋势线-本校','趋势线-全市']
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['0-10','10-20','20-30','30-40','40-50','50-60','60-70','70-80','80-90','90-100',
                        '100-110','110-120','120-130','130-140','140-150']
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} %'
                    }
                },
            ],
            series : [

                {
                    name:'本校',
                    type:'bar',
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                },
                {
                    name:'全市',
                    type:'bar',
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                },
                {
                    name:'趋势线-本校',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0, 1.00, 2, 6, 8, 13, 26,38, 18, 8,2, 0,0]
                }
                ,
                {
                    name:'趋势线-全市',
                    type:'line',
                    yAxisIndex: 0,
                    data:[0, 0, 0,2, 3, 6, 8, 13, 18, 20, 17, 11,3,1, 0]
                }
                ,
            ]
        };

        var option26= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['分子与细胞','教材实验','生物与环境','探究实验','现代生物科技','遗传与进化'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8, 0.85, 0.72, 0.8]
                },
                {
                    name: '全区',
                    type: 'line',
                    data: [0.68, 0.65, 0.65, 0.79, 0.65, 0.65]
                }
                ,
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52, 0.60 ]
                }
            ]
        };

        var option27= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['识记','理解','运用'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };

        var option28= {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['本校','全区','全市']
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
                    data : ['单选题','多选题','解答题'],
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'本校',
                    type:'line',
                    data:[0.71, 0.72, 0.8]
                },
                {
                    name:'全区',
                    type:'line',
                    data:[0.68, 0.65, 0.65]
                },
                {
                    name:'全市',
                    type:'line',
                    data:[0.59,0.53,0.52]
                }
            ]
        };

        // 为echarts对象加载数据
        myChart.setOption(option);
        myChart_2.setOption(option2);
        myChart_3.setOption(option3);
        myChart_4.setOption(option4);
        myChart_5.setOption(option5);
        myChart_6.setOption(option6);
        myChart_7.setOption(option7);
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
        myChart_24.setOption(option24);
        myChart_25.setOption(option25);
        myChart_26.setOption(option26);
        myChart_27.setOption(option27);
        myChart_28.setOption(option28);


	})

</script>

</body>
</html>