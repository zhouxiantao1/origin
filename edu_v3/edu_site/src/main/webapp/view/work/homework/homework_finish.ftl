<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>作业管理-作业完成情况</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/wm_wk_finish.css">
</head>
<body>
	
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>在线作业&gt;作业完成情况</h3>
					</div>
					<p class="back fr" onClick="back_list()">返回上级</p>
				</div>

				<div class="work_detail">
					<h3 class="tit"><#if wkv??>${wkv.title!''}</#if></h3>
					<p class="school_klass">
						<span class="sch">广州市第二中学</span><span class="high"><#if wkcvList?? && wkcvList?size != 0><#list wkcvList as wkcv>${wkcv.baseClassesVo.name}&nbsp</#list></#if></span><span class="count">题数：${wkv.qtnNum!''}</span><span class="finish">截止时间：<#if wkv.endTime??>${wkv.endTime?string("yyyy-MM-dd HH:mm:ss")}</#if></span><span class="status">已完成人数：${levelAll!''}人</span>
					</p>

					<div class="work_grade">
						<h3>作业评分情况</h3>
						<div class="chart_grade clearfix">
							<div id="grade" class="fl grade"></div>
							<div class="msg fr">
								<h3>共完成人数<span>${levelAll!''}</span>人</h3>
								<p class="a clearfix"><i></i> <span>评分A</span><em>${levelA!''}人</em></p>
								<p class="b clearfix"><i></i> <span>评分B</span><em>${levelB!''}人</em></p>
								<p class="c clearfix"><i></i> <span>评分C</span><em>${levelC!''}人</em></p>
								<p class="d clearfix"><i></i> <span>评分D</span><em>${levelD!''}人</em></p>
							</div>
						</div>
					</div>
					<div class="right_grade">
						<h3>题目正确率情况</h3>
						<div class="chart_grade clearfix">
							<div id="grade_rate" class="fl grade"></div>
							<div class="msg fr">
								<label class="is_hide">
									<select>
										<option>正确率低于10%的题目</option>
										<option>正确率低于40%的题目</option>
										<option>正确率低于70%的题目</option>
										<option>正确率低于100%的题目</option>
									</select>
									<span>一键打印</span>
								</label>
								<h3>正确率预览</h3>
								<div class='is_auto'>
									<#assign i=1>
									<#assign num=1>
									<#if accuracyList?? && accuracyList?size!=0>
										<#list accuracyList as accuracyMap>
											<p class="e clearfix"><i></i> <span>第${num}题正确率</span><b> </b><em>${accuracyMap.accuracy!''}%</em></p>
											<#if i==5>
												<#assign i=1>
											<#else>
												<#assign i=i+1>
											</#if>
											<#assign num=num+1>
										</#list>
									</#if>							
								</div>
							</div>
						</div>
						<div class="one_check">
							<span class="sb_1">查看</span>
							<span class="sb_2">查看</span>
							<span class="sb_3">查看</span>
							<span class="sb_4">查看</span>
							<span class="sb_5">查看</span>
						</div>
					</div>

					<div class="finish_situation">
						<h3>作业完成情况</h3>
						<div class="situation">
							<span class="wk_status">完成状态：</span><select class="wk_status"><option>全部</option><option>一章节</option></select>

							<span class="wk_grade">作业评分：</span><select class="wk_grade" id="wk_stu" ><option value=''>全部</option><option value='1'>A</option><option value='2'>B</option><option value='3'>C</option><option value='4'>D</option></select>

							<span class="stu_name">学生姓名：</span><input class="stu_name" id="createName" type="text" name="">

							<button class="check" onClick="select_studentFinish(${wkv.id!''})">查询</button>
						</div>

						<div class="tb_list">
							<div class="op clearfix">
								<p class="stu_name">学生姓名</p>
								<p class="finish_time">完成时间</p>
								<p class="grade_work">作业评分</p>
								<p class="grade_work">正确率</p>
								<p class="finish_status">作答情况</p>
								<p class="operation">操作</p>
							</div>
							
							<#if pb.list?? && pb.list?size!=0>
								
								<#list pb.list as workAnswerVo>
									<#assign j=1>
							
									<div class="stu clearfix">
										<p class="stu_name">${workAnswerVo.createName!''}</p>
										<p class="finish_time">${workAnswerVo.createTime?string("yyyy-MM-dd HH:mm:ss")}</p>
										<p class="grade_work"><#if workAnswerVo.correct?? && (workAnswerVo.correct?number>80)>A<#elseif workAnswerVo.correct?? && (workAnswerVo.correct?number<80) && (workAnswerVo.correct?number>70||workAnswerVo.correct?number==70)>B<#elseif workAnswerVo.correct?? && (workAnswerVo.correct?number<70) && (workAnswerVo.correct?number>60||workAnswerVo.correct?number==60)>C<#else>D</#if></p>
										<p class="grade_work"><#if workAnswerVo.correct??>${workAnswerVo.correct!''}%<#else>-</#if></p>
										<p class="finish_status"><#if workAnswerVo.workAnswerDetailVoList?? && workAnswerVo.workAnswerDetailVoList?size!=0><#list workAnswerVo.workAnswerDetailVoList as workAnswerDetailVo><#if j<5>第${j}题：<span><#if workAnswerDetailVo.isRight=='0'>正确<#else>错误</#if></span><#assign j=j+1></#if></#list></#if></p>
										<p class="operation" onClick="answerViewHomework(${workAnswerVo.homeworkId!''},${workAnswerVo.studentId!''})">查看</p>
									</div>
								</#list>
							</#if>

						
						</div>

					</div>

					<!-- 分页 -->
					<div class="page">
						<ul>
							<li>第一页<i></i></li>|
							<li>下一页</li>
						</ul>
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
		$('.one_check').hide();
		$('.is_hide').hide();
		$('.wk_status').hide();
		$('.sch').hide();
		$('#wk_stu').val(${level!''})
		$('#createName').val('${createName!''}')
	})
	
	//查询
	function select_studentFinish(homeworkId){
		var data = "homeworkId="+homeworkId;
  		if($('#wk_stu').val()!=''){
			data += "&level="+$('#wk_stu').val();
		}
		if($('#createName').val()!=''){
			data += "&createName="+$('#createName').val();
		}
		var url = "${basePath!''}/work/homework/finish.htm?";
		window.location.href=url+data;	
	}
	
	function back_list(){
		window.location.href="${basePath!''}/work/homework/list.htm";
	}
	
	//查看学生作业
	function answerViewHomework(homeworkId,studentId){
		var url ="${basePath!''}/work/homework/answer/view.htm?";
		var data = "id="+homeworkId+"&studentId="+studentId+"&type=1";
		window.location.href=url+data;
	}

	var myChart = echarts.init(document.getElementById('grade'));
	var myCharts = echarts.init(document.getElementById('grade_rate'));

	var option = {
	    title : {
	        text: '得分率分布',
	        // subtext: '纯属虚构',
	        x:'center',
	        textStyle:{
	        	color:'#333',
	        	fontSize:16,
	        	// fontWeight:'bolder'
	        }
	    },
	    color:['#abcdef', '#fa6c3a','#526ba4','red','#efcb6a'], //饼图的颜色
	    tooltip : {
	        trigger: 'item',
	        formatter: "{a} <br/>{b} : {c} ({d}%)"
	    },
	    
	    toolbox: {
	        show : true,
	        feature : {
	            mark : {show: true},
	            dataView : {show: true, readOnly: false},
	            magicType : {
	                show: true,
	                type: ['pie', 'funnel']
	            },
	            restore : {show: true},
	            saveAsImage : {show: true}
	        }
	    },
	    calculable : true,
	    series : [
	        
	        {
	            name:'得分率人数分布情况',
	            type:'pie',
	            radius : [30, 110],
	            center : ['50%', '50%'],
	            roseType : 'area',
	            data:[
	                {value:${levelA!''}, name:'A'},
	                {value:${levelB!''}, name:'B'},
	                {value:${levelC!''}, name:'C'},
	                {value:${levelD!''}, name:'D'},
	            ], 
	            itemStyle:{ 
	            normal:{ 
	                  label:{ 
	                    show: true, 
	                    formatter: '{b} : {c} ({d}%)' 
	                  }, 
	                  labelLine :{show:true} 
	                } 
	            } 
	        }
	    ]
	};

	var options = {
		title : {
	        text: '各题正确率分布',
	        x:'center',
	        textStyle:{
	        	color:'#333',
	        	fontSize:16,
	        	// fontWeight:'bolder'
	        }
	    },
	    color:['#00ada7'],
	    //color:['#00ada7','#abcdef', '#fa6c3a','#526ba4','red','#efcb6a'], //图的颜色
	    tooltip : {
	        trigger: 'axis',
	        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
	            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
	        }
	    },
	    grid: {
	        left: '3%',
	        right: '4%',
	        bottom: '3%',
	        containLabel: true
	    },
	    xAxis : [
	        {
	            type : 'category',
	            data : [${accuracyStr!''}],
	            axisTick: {
	                alignWithLabel: true
	            }
	        }
	    ],
	    yAxis : [
	        {
	            type : 'value'
	        }
	    ],
	    series : [
	        {
	            name:'答对人数',
	            type:'bar',
	            barWidth: '60%',
	            itemStyle: {
                    normal: {
　　　　　　　　　　　　　　//定义一个list，然后根据所以取得不同的值，
                       // color: function(params) {
                            // build a color map as your need.
                          //  var colorList = [
                          //    '#abcdef', '#fa6c3a','#526ba4','red','#efcb6a'
                          //  ];
                          //  return colorList[params.dataIndex]
                     //   },
　　　　　　　　　　　　　　//以下为是否显示，显示位置和显示格式的设置了
                        label: {
                            show: true,
                            position: 'top',
                          	formatter: '{c} (人)'
                            // formatter: '{b}\n{c}'
                        }
                    }
                },
	            data:[${rightStr!''}]
	        }
	    ]
	};


	myChart.setOption(option);
	myCharts.setOption(options);
	
	
</script>
	
</body>
</html>