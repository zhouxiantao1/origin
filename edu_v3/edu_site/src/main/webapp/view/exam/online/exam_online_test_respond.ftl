<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>考试管理-作答</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/online_respond.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_manage_respond.css">
</head>
<body>
	<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<#include '/common/left.ftl' /> 
			
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>在线考试&gt;作答</h3>
					</div>
					<p class="back fr"><a href="javascript:history.back(-1)">返回</a></p>
				</div>

				<div class="operation clearfix">
					<!--<span class="fl quit">退出考试</span>-->
					<div class="time_out fr clearfix">
						<p class="fl"><img src="${basePath!''}/images/"> <i id="countdown"></i></p>
						<button onclick = "assignment()" class="fl">交卷</button>
					</div>
				</div>
				<h2 class="test_name">${examInfoVo.examName}</h2>
				
				<div class="respondence_area">
					<#assign lastUpdated = examDetailVo.endTime?date/>
					<input type = "hidden" id = "jstime" value="${lastUpdated?string('yyyy/MM/dd HH:mm:ss')}"/>
					<input type = "hidden" id = "paperId" value="${papersInfoVo.id}"/>
					<input type = "hidden" id = "examDetailId" value="${examDetailVo.id}"/>
					<input type = "hidden" id = "examId" value="${examInfoVo.id}"/>
					<input type = "hidden" id = "subjectId" value="${examDetailVo.subjectId}"/>
					<h3 class="grade">${examDetailVo.detailName}</h3>
					<span style="display:block;width:100%;text-align:center;">考试时间：${papersInfoVo.testTime}分钟 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;试卷总分：${papersInfoVo.totalScore}分&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;命题人：${papersInfoVo.createName}</span>
					<div class="zuoda show_scroll question-list">
					<#assign opt = 0 > 
						<#list papersDetailVoList as papersDetailVo>
							<p>第${(papersDetailVo_index+1)?replace('1','一')?replace('2','二')?replace('3','三')?replace('4','四')?replace('5','五')?replace('6','六')?replace('7','七')?replace('8','八')?replace('9','九')?replace('0','零')}部分：${papersDetailVo.questionTypeVo.typeName}（${papersDetailVo.quQuantity}题，每题${papersDetailVo.quScore}分）</p>
							<#list papersQuestionVoMap[papersDetailVo.id+""] as papersQuestionVo>
							<#assign opt = opt + 1 >
							<div class="question-item">
								<input type = "hidden" value ="${papersQuestionVo.questionWareVo.difficulty}"/>
								<input type = "hidden" value ="${papersQuestionVo.questionWareVo.bloomTaxonomy}"/>
								
								<!-- 问题 -->
								<div class="question">             
									<#if papersQuestionVo.questionWareVo.qcd??>${papersQuestionVo.questionWareVo.qcd.title?replace('other.koo6.com','video.koo6.com')}</#if>
									<#if papersQuestionVo.questionWareVo.qcd.content??>${papersQuestionVo.questionWareVo.qcd.content?replace('other.koo6.com','video.koo6.com')}</#if>
									<br/>
									<#if papersQuestionVo.questionWareVo.qods??>
										<#list papersQuestionVo.questionWareVo.qods as qod>
											<input onclick = 'selectAnswer(${opt},this)' name="${papersQuestionVo.questionWareVo.id}" type="radio" value="${qod_index+1}" />${(qod_index+1)?replace('1','A')?replace('2','B')?replace('3','C')?replace('4','D')}. ${qod.content?replace('other.koo6.com','video.koo6.com')}<br/>
										</#list>
									</#if>
								</div>
								
							</div>
							</#list>
						</#list>
					</div>
					
					<div class="height_fill"></div>
					<div class="posi">
						<div class="show_sheet">
							<p class="shou"> <i>收起答题卡</i><img src="${basePath!''}/images/down_arr.png" alt=""></p>
							<p class='show'> <i>展开答题卡</i><img src="${basePath!''}/images/down_arr.png" alt=""></p>
						</div>
						<div class="answer_sheet">
							<p class="tag">
								<span class="no_answer"></span>未答
								<span class="answered"></span>已答
							</p>
							<ul class="card">
							<#assign var = 0 >  
							<#list papersDetailVoList as papersDetailVo>
								<#list papersDetailVo.papersQuestionVoList as papersQuestionVo>
								<#assign var = var + 1 > 
									<li><span class="numb no_answer">${var}</span><span class="daan no_answer"></span></li>
								</#list>
							</#list>
							</ul>
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
<script type="text/javascript">
	$(function(){
		$('.show_sheet').on('click','.shou',function(){
			$('.answer_sheet').slideUp(700);
			$(this).hide().siblings().show();
		})
		$('.show_sheet').on('click','.show',function(){
			$('.answer_sheet').slideDown(700);
			$(this).hide().siblings().show();
		})
	}) 
	
	function GetRTime(){
	    //var EndTime= new Date('2018/09/20 00:00:00');
	    var EndTime = new Date($('#jstime').val());
	    var NowTime = new Date();
	    var t =EndTime.getTime() - NowTime.getTime();
	    var d=0;
	    var h=0;
	    var m=0;
	    var s=0;
	    if(t>=0){
	      d=Math.floor(t/1000/60/60/24);
	      h=Math.floor(t/1000/60/60%24);
	      m=Math.floor(t/1000/60%60);
	      s=Math.floor(t/1000%60);
	    }
	    document.getElementById("countdown").innerHTML = d + "天"+ h + "时"+m + "分"+s + "秒";
  	}
  	
	setInterval(GetRTime,0);
	
  	//交卷
	function assignment(){
		var examQuestionscoreVoList = new Array();  
		var flag = false;
		$(".question").each(function(i){
			var val = $('input:radio[name="'+$(this).find("input").attr("name")+'"]:checked').val();
			if(val == 'undefined' || val == null){
				flag = true;
				examQuestionscoreVoList.push({questionId:$(this).find("input").attr("name"),options:""});
			}else{
				examQuestionscoreVoList.push({questionId:$(this).find("input").attr("name"),options:val});
			}
		});
		if(flag){
			if(!confirm('未做完所有题目，是否现在交卷?')){
				return false;
		    }
		}
		var jsondata = {'examQuestionscoreVoList':examQuestionscoreVoList,
						'paperId':$('#paperId').val(),
						'examId':$('#examId').val(),
						'subjectId':$('#subjectId').val(),
						'examDetailId':$('#examDetailId').val()
						};
		$.ajax({
			type:'post',  
		    url:'${basePath!''}/exam/online/student/list/assignment.htm', 
		    async:false,
			contentType:"application/json;charset=utf-8",    
            dataType:"json",
			data:JSON.stringify(jsondata), 
			traditional:true,//这里设置为true后台接收数组就会去掉[]这个框
		    success:function(data){  
		    	window.location.href='${basePath!''}/exam/online/student/list/exam/result.htm?detailName='+$(".grade").html()+'&examId = '+$("#examId").val();
		    },
		    error: function(){
            	alert("出错了");
            }
	 	});
	}
	var option_number="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	function selectAnswer(opt,obj){
		$('.card').find('li').eq(opt-1).find('span').eq(0).attr('class', "answered");
		$('.card').find('li').eq(opt-1).find('span').eq(1).attr('class', "answered");
		var op = option_number.substring($(obj).val()-1,$(obj).val());
		$('.card').find('li').eq(opt-1).find('span').eq(1).html(op);
	}
</script>
</body>
</html>