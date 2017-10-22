<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>试卷管理-预览试卷</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/preview_paper.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/zTreeStyle/zTreeStyle.css">
</head>
<body>

	<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<div class="middle fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>试卷管理>预览试卷</h3>
					</div>
					<p class="back fr"><a href="javascript:history.back(-1)">返回上级</a></p>
				</div>
				<div class="paper-info1">
					<p class="title">${papersInfoVo.paperName}</p>
					<p>
						<span>考试时间：${papersInfoVo.testTime}分钟</span>
						<span>试卷总分：${papersInfoVo.totalScore}分</span>
						<span>命题人：${papersInfoVo.createName}</span>
						<span>日期：${papersInfoVo.createTime}</span>
					</p>
				</div>
				<div class="question-list">
				<#assign keys = papersQuestionVoMap?keys/>
				  <#if keys??>
				  <#list keys as key>
					<p>第${(key_index+1)?replace('1','一')?replace('2','二')?replace('3','三')?replace('4','四')?replace('5','五')?replace('6','六')?replace('7','七')?replace('8','八')?replace('9','九')?replace('0','零')}部分：${questionTypeMap["${key}"]}（${questionQuQuantityMap["${key}"]}题，每题${questionQuScoreMap["${key}"]}分）</p>
					<#list papersQuestionVoMap[key] as papersQuestionVo>
					<div class="question-item">
						<p>
							<span>组卷次数:${papersQuestionVo.questionWareVo.testTimes}</span>
							<!--<span>曝光率:1%</span>
							<span>章节：第一章</span>-->
							<span>难度：${papersQuestionVo.questionWareVo.difficulty}</span>
							<span>知识点：
							<#list papersQuestionVo.questionWareVo.knowledgeNames as knowledgeName>
								${knowledgeName} 
							</#list>
							</span>
							<span class="fr score">分值<input disabled="disabled" type="text" value="${questionQuScoreMap["${key}"]}"></span>
						</p>
						<!-- 问题 -->
						<div class="ques-info fl">             
							<#if papersQuestionVo.questionWareVo.qcd??>${papersQuestionVo.questionWareVo.qcd.title?replace('other.koo6.com','video.koo6.com')}</#if>
							<#if papersQuestionVo.questionWareVo.qcd.content??>${papersQuestionVo.questionWareVo.qcd.content?replace('other.koo6.com','video.koo6.com')}</#if>
							<br/>
							<#if papersQuestionVo.questionWareVo.qods??>
								<#list papersQuestionVo.questionWareVo.qods as qod>
									<input disabled name="${papersQuestionVo.questionWareVo.id}" type="radio" value="${qod_index+1}" />${(qod_index+1)?replace('1','A')?replace('2','B')?replace('3','C')?replace('4','D')}. ${qod.content?replace('other.koo6.com','video.koo6.com')}<br/>
								</#list>
							</#if>
						</div>
						<div class="cl"></div>
					</div>
					</#list>
				</#list>
				</#if>
				</div>
				
			</div>

			<!-- 右侧边栏 -->
			<div class="content_right fr">
				
				<div class="shaixuan">
					<p><i>学科</i><span>${papersInfoVo.bsb.name}</span></p>
					<p><i>年级</i><span>${papersInfoVo.bgv.name}</span></p>
				</div>
				
				<div class="ques-setting">
					<p>题目设置</p>
					<table>
						<#list papersDetailVoList as papersDetailVo>
							<tr>
								<td>${papersDetailVo.questionTypeVo.typeName}</td>
								<td class="count">${papersDetailVo.quQuantity}</td>
								<td class="score"><i>${papersDetailVo.quScore}</i> 分 / 题</td>
							</tr>
						</#list>
					</table>
				</div>

		</div>
	</div>
	
	<div class="footer" style ="clear:both">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>
	
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<script src="${basePath!''}/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript">
	
	$(function(){	
		var thischeck = $('.show_answer').find('input');
		thischeck.on('click',function(){
			if(thischeck.attr('checked',true)){
				$('.answer').toggle();	//展示区域
			}

		})


		//树形菜单
		var setting = {
			showLine: false, 
			checkable: true 
		}

		var zNodes = [
		   {
		       name: "数与式", //节点名称
		       open: true,  //节点是否可以展开
		       isParent:true, //是否为文件夹
		       children: [{
		            name:"有理数"
		       },
			   {
			       name: "整式",
			       open: true,
			       id: 1,             //自定义的，可有可无  编号
			       // url:"sdfsldfsdf",  //自定义的，可有可无  他妈家的地址，老家的地址 点一下就去老家了。
			       children: [       //子文件夹  子节点
			            {
			                name: "整式"
			            },
			             {
			                 name: "整式的加减",
			                 children: [{
			                    name:"加或者减"
			                 }]
			             }
			         ]
			   },
			   {
			       name: "二次根式",
			       open: false,
			       id: 1,
			       children: [
			            {
			                name: "二次根式的乘除法"
			            },
			             {
			                 name: "二次根式的加减",
			             },
			             {
			                 name: "二次根式的应用",
			             }
			         ]
			   }]
		   },
		   {
		   		name:'方程(组)与不等式(组)',
		   		open:true,
		   		children:[{
		   			name:'一元一次方程'
		   		}]
		   },
		   {
		   		name:'函数及其图像',
		   		open:true,
		   		children:[{
		   			name:'函数基础知识'
		   		}]
		   },
		   {
		   		name:'统计与概率',
		   		open:true,
		   		children:[{
		   			name:'统计'
		   		},{
		   			name:'概率'
		   		}]
		   }

		];

		var zTreeObj;
		zTreeObj = $.fn.zTree.init($("#treeNode"), setting, zNodes);	//初始化树

	})

</script>

</body>
</html>