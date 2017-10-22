<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>统计分析报告-管理员</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/analysis_report_manage.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>统计分析>分析报告</h3>
					</div>
					<p class="back fr" onClick="back_list()">返回上级</p>
				</div>
				
				<div class="container">
					<div class="grade_show">
						<div class="export clearfix"><button class="fr">导出分析报告</button></div>
						<h2 class="grade_name">广州市2016年学生阳光评价活动分析报告</h2>
						<div class="grade_type">
							<span>此处是关于该测评的简介(或是指导语)，由用户操作行为产生，用户填写则有，不填写则无。</span>
						</div>
					</div>

					<div class="report clearfix">
						<div class="report_list fl">
							<p class="title">自定义报告（勾选所需报告内容）</p>
							<p class="nav">报告导航</p>
							<ul>
								<li>
									<label><input type="checkbox" name=""><span>全选</span></label>
								</li>
								<li>
									<label><input type="checkbox" name=""><span>1 考试概况分析</span></label>
									<ul>
										<li><span>1.1 非学业质量表质量分析</span></li>
										<li><span>1.2 学科试卷质量分析</span></li>
									</ul>
								</li>

								<li>
									<label><input type="checkbox" name=""><span>2 综合发展水平分析</span></label>
									<ul>
										<li>
											<span>2.1 全市在六大评价指标上的表现</span>
										</li>
										<li>
											<span>2.2 全市在各分项指标上的表现</span>
										</li>
									</ul>
								</li>
								<li>
									<label><input type="checkbox" name=""><span>3 学业发展水平分析</span></label>
									<ul>
										<li><span>3.1 学业水平表现</span></li>
										<li><span>3.2 学业配套问卷各维度得分</span></li>
										<li><span>3.2 学业测试与配套问卷的相关分析</span></li>
									</ul>
								</li>
								<li>
									<label><input type="checkbox" name=""><span>4学业与非学业归因分析</span></label>
								</li>
								<li>
									<label><input type="checkbox" name=""><span> 附表</span></label>
								</li>
							</ul>

						</div>
						<div class="show_report fr">
							<div class="part_one">
								<h2>第一部分：评价工具质量分析</h2>
								<div class="point_one">
									<h3>1.非学业质量表质量分析</h3>
									<div class="tabs">
										<p class="tab_name">非学业量表信度（α系数）分析表</p>
										<table class="tb_one">
											<tr>
												<td>量表（问卷）名称</td>
												<td class="three">α系数</td>
											</tr>
											<tr>
												<td>
													广州越秀区2016年学生阳光评价活动之家长问卷</td>
												<td>0.94</td>
											</tr>
											<tr>
												<td>广州市2016年学生阳光评价活动之学生问卷</td>
												<td>0.94</td>
											</tr>
											<tr>
												<td>广州越秀区2016年学生阳光评价活动之教师问卷</td>
												<td>0.90</td>
											</tr>
											<tr>
												<td>广州越秀区2016年学生阳光评价活动之家长问卷</td>
												<td>0.94</td>
											</tr>
											<tr>
												<td>广州越秀区2016年学生阳光评价活动之教师问卷</td>
												<td>0.85</td>
											</tr>
										</table>
										<p class="zhu"><span></span> 注：α系数在0-1之间，越大表明量表的信度越好。</p>

										<p class="tab_name tab_name_top">非学业量表信度（α系数）分析表</p>
										<table class="tb_two">
											<tr>
												<td>量表</td>
												<td class="three">λ^2⁄df </td>
												<td class="three">RMSEA </td>
												<td class="three">GFI </td>
												<td class="three">AGFI</td>
												<td class="three">NFI</td>
												<td class="three">CFI</td>
												<td class="three">IFI</td>
											</tr>
											<tr>
												<td>
													某次测评的名称（某张问卷的名称）</td>
												<td>25989</td><td>445.03</td><td>97.07</td><td>684.5</td><td>70.5</td><td>400</td><td>100</td>
											</tr>
											<tr>
												<td>
													某次测评的名称（某张问卷的名称）</td>
												<td>25989</td><td>445.03</td><td>97.07</td><td>684.5</td><td>70.5</td><td>400</td><td>100</td>
											</tr>
											<tr>
												<td>
													某次测评的名称（某张问卷的名称）</td>
												<td>25989</td><td>445.03</td><td>97.07</td><td>684.5</td><td>70.5</td><td>400</td><td>100</td>
											</tr>
											<tr>
												<td>
													某次测评的名称（某张问卷的名称）</td>
												<td>25989</td><td>445.03</td><td>97.07</td><td>684.5</td><td>70.5</td><td>400</td><td>100</td>
											</tr>
											<tr>
												<td>
													某次测评的名称（某张问卷的名称）</td>
												<td>25989</td><td>445.03</td><td>97.07</td><td>684.5</td><td>70.5</td><td>400</td><td>100</td>
											</tr>
											<tr>
												<td>
													某次测评的名称（某张问卷的名称）</td>
												<td>25989</td><td>445.03</td><td>97.07</td><td>684.5</td><td>70.5</td><td>400</td><td>100</td>
											</tr>
											<tr>
												<td>
													某次测评的名称（某张问卷的名称）</td>
												<td>25989</td><td>445.03</td><td>97.07</td><td>684.5</td><td>70.5</td><td>400</td><td>100</td>
											</tr>
										</table>
										<p class="zhu"><span></span> 注：上述表中的指标都是判断量表效度好坏的指标，λ^2⁄df越接近1越好，一般小于5在可接受范围；RMSEA越小越好，一般小于0.08认为在合理范围内；GFI、AGFI、NFI、CFI、IFT越大越好，一般评价标准为：GFI>0.8,AGFI>0.8,NFI>0.9,CFI>0.9,TFI>0.9.</p>
									</div>
								</div>

								<div class="point_one">
									<h3>2.学科试卷质量分析</h3>
									<div class="tabs">
										<p class="tab_name">非学业量表信度（α系数）分析表</p>
										<table class="tb_three">
											<tr>
												<td class="one">分类</td><td class="two">具体内容</td><td class="three">分值</td><td class="four">所占比例（%）</td>
											</tr>
											<tr>
												<td rowspan="3">知识模块</td><td>几何图形</td><td>36</td><td>36</td>
											</tr>
											
											<tr>
												<td>式与代数</td><td>58</td><td>58</td>
											</tr>
											<tr>
												<td>统计与概率</td><td>6</td><td>6</td>
											</tr>
											<tr>
												<td colspan="2">小计</td><td>100</td><td>100</td>
											</tr>

											<tr>
												<td rowspan="3">认知层次</td><td>理解</td><td>58</td><td>58</td>
											</tr>
											<tr>
												<td>应用</td><td>6</td><td>6</td>
											</tr>
											<tr>
												<td>推理</td><td>6</td><td>6</td>
											</tr>
											<tr>
												<td colspan="2">小计</td><td>100</td><td>100</td>
											</tr>
										</table>
										<p class="zhu"><span></span>注：从数学试卷的教育测量学参数来看，全卷的难度系数为0.69，区分度为0.38，信度为0.86。全卷具有适当的难度和区分度，信度较好。</p>

										<p class="tab_name tab_name_top">六年级数学能力测验试卷质量分析</p>
										<table class="tb_four">
											<tr>
												<td class="one">测验名称</td>
												<td class="two">难度</td>
												<td class="three">区分度</td>
												<td class="four">信度</td>
											</tr>
											<tr>
												<td class="one">试卷名称</td>
												<td>0.69</td>
												<td>0.38</td>
												<td>0.86</td>
											</tr>
										</table>

										<p class="tab_name tab_name_top">六年级数学能力测试项目质量分析</p>
										<table class="tb_five">
											<tr>
												<td class="one">题号</td><td class="two">难度</td><td class="three">区分度</td><td colspan="6" class="four">选项分析</td>
											</tr>
											<tr>
												<td>1</td><td>0.69</td><td>0.38</td><td>A</td><td>B</td><td>C</td><td>D</td><td>空白</td><td>正确答案</td>
											</tr>
											<tr>
												<td>2</td><td>0.69</td><td>0.38</td><td>1.00%</td><td>81.45%</td><td>3.62%</td><td>0.83%</td><td>13.10%</td><td>B</td>
											</tr>
											<tr>
												<td>2</td><td>0.69</td><td>0.38</td><td>1.00%</td><td>81.45%</td><td>3.62%</td><td>0.83%</td><td>13.10%</td><td>B</td>
											</tr>
											<tr>
												<td>2</td><td>0.69</td><td>0.38</td><td>1.00%</td><td>81.45%</td><td>3.62%</td><td>0.83%</td><td>13.10%</td><td>B</td>
											</tr>
											<tr>
												<td>2</td><td>0.69</td><td>0.38</td><td>1.00%</td><td>81.45%</td><td>3.62%</td><td>0.83%</td><td>13.10%</td><td>B</td>
											</tr>
											<tr>
												<td>2</td><td>0.69</td><td>0.38</td><td>1.00%</td><td>81.45%</td><td>3.62%</td><td>0.83%</td><td>13.10%</td><td>B</td>
											</tr>
										</table>
										<p class="zhu"><span></span>注：在判断题目的质量时，一般题目的难度适中为宜，难度系数在0.3-0.7较好，题目的区分度越高越好，区分度在0.4以上的试题表示其区分度优良</p>
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

	
</body>
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>

<script type="text/javascript">
	//跳转到列表
	function back_list(){
		window.location.href="${basePath!''}/evaluate/eva/list.htm?";
	}
</script>
</html>