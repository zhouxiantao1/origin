<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理-问卷调查-作答</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_answer.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_manage_answer.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			<#include '/common/left.ftl' />
			
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>测评管理&gt;问卷调查&gt;作答</h3>
					</div>
					<p class="back fr" onclick="back_list()">返回</p>
				</div>

				<div class="operation clearfix">
					<!-- <span class="fl quit">下次再做</span>-->
					<div class="time_out fr clearfix">
						<p class="fl"><#if anwerTime??><img src="${basePath!''}/images/clock.png"> <i id="getTime"></i></#if></p>
						<button class="fl" onclick="save_answer()">交卷</button>
					</div>
				</div>
				<h2 class="test_name">教育质量阳光评价调查问卷</h2>
				
				<div class="respondence_area">	
					<div class="zuoda show_scroll">
						<#if evaluatePaperQuestionVoList?? && evaluatePaperQuestionVoList?size!=0 >
							<#list evaluatePaperQuestionVoList as evaluatePaperQuestionVo>
								<div class="first_paper">
									<p class="one clearfix"><span class="fl">${evaluatePaperQuestionVo.sort!''}. ${evaluatePaperQuestionVo.content!''}</span><label class="fr lb"><#if evaluatePaperQuestionVo.type=='1'><img src="${basePath!''}/images/radio.png"> <i>单选题</i><#elseif evaluatePaperQuestionVo.type=='2'><img src="${basePath!''}/images/checkbox.png"> <i>多选题</i></label><#else></#if></label></p>
									<#if evaluatePaperQuestionVo.evaluateSelectionVoList?? && evaluatePaperQuestionVo.evaluateSelectionVoList?size!=0>
										<#list evaluatePaperQuestionVo.evaluateSelectionVoList as evaluateSelectionVo>
											<#if evaluatePaperQuestionVo.type=='1'>
												<p class="qu_1">
													<label class="lb_1"><input type="radio" name=${evaluatePaperQuestionVo.sort!''} value=${evaluateSelectionVo.selectNum!''} onclick="save_checked('1',${evaluatePaperQuestionVo.sort!''})"><span>${evaluateSelectionVo.selectNum!''}. ${evaluateSelectionVo.content!''}</span></label>
												</p>
											<#elseif evaluatePaperQuestionVo.type=='2'>
												<p class="qu_1">
													<label class="lb_1"><input type="checkbox" name=${evaluatePaperQuestionVo.sort!''} value=${evaluateSelectionVo.selectNum!''} onclick="save_checked('2',${evaluatePaperQuestionVo.sort!''})"><span>${evaluateSelectionVo.selectNum!''}. ${evaluateSelectionVo.content!''}</span></label>
												</p>
											<#else></#if>
										</#list>
									</#if>
								</div>
							</#list>
						</#if>
						
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
								<#if evaluatePaperQuestionVoList?? && evaluatePaperQuestionVoList?size!=0>
									<#list evaluatePaperQuestionVoList as evaluatePaperQuestionVo>
										<li><span target=${evaluatePaperQuestionVo.sort!''} class="numb no_answer">${evaluatePaperQuestionVo.sort!''}</span><span target=${evaluatePaperQuestionVo.sort!''} id=${evaluatePaperQuestionVo.sort!''} questionId=${evaluatePaperQuestionVo.id} selectNum="" class="daan no_answer"></span></li>
									</#list>
								</#if>
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
	var timer = 0;
	$(function(){
		$('.show_sheet').on('click','.shou',function(){
			$('.answer_sheet').slideUp(700);
			$(this).hide().siblings().show();
		})
		$('.show_sheet').on('click','.show',function(){
			$('.answer_sheet').slideDown(700);
			$(this).hide().siblings().show();
		})
		<#if anwerTime??>
			get_time(${anwerTime});
			timer = setInterval(getRTime,1000);
		</#if>
	})
	
	function save_checked(type,nameStr){	
		if(type=='1'){
			var str = $('input[name='+nameStr+']:checked').val();
			$("#"+nameStr).html(str);
			$("#"+nameStr).attr('selectNum',str);
			$("span[target='"+nameStr+"']").removeClass('daan no_answer');	
			$("span[target='"+nameStr+"']").addClass('daan answered');	
		}else if(type==2){
			var str = "";
			$('input[name='+nameStr+']:checked').each(function(){  
				if(str==""){
					str = $(this).val();
				}else{
					str = str + "," + $(this).val();
				}     
			});
			
			$("#"+nameStr).html(str);
			$("#"+nameStr).attr('selectNum',str);
			if(str==""){
				$("span[target='"+nameStr+"']").removeClass('daan answered');
				$("span[target='"+nameStr+"']").addClass('daan no_answer');
			}else{
				$("span[target='"+nameStr+"']").removeClass('daan no_answer');	
				$("span[target='"+nameStr+"']").addClass('daan answered');
			}
		}
	}
	//计时
	var endTime = 0;
	
	function get_time(min){
		var time1 = new Date();
		var temp= new Date(time1.getTime()+ 1000 * min); //截止时间 
		var time = temp.Format("yyyy/MM/dd hh:mm:ss");
		var EndTime = new Date(time);
		endTime = EndTime.getTime();
	}

	
	function getRTime(){
		var dt = new Date();  
  		
		var NowTime = new Date();
		var t = endTime- NowTime.getTime(); 

		var d=Math.floor(t/1000/60/60/24); 
		var h=Math.floor(t/1000/60/60%24); 
		var m=Math.floor(t/1000/60%60); 
		var s=Math.floor(t/1000%60); 
		 
		document.getElementById("getTime").innerHTML =h+":" + m+":"+s;
		
		if(1000>=t){
			clearInterval(timer);
			alert("时间到，自动交卷");
			save_answer();
		}
	} 
	
	
	
	Date.prototype.Format = function (fmt) {
	    var o = {
	        "M+": this.getMonth() + 1, //月份 
	        "d+": this.getDate(), //日 
	        "h+": this.getHours(), //小时 
	        "m+": this.getMinutes(), //分 
	        "s+": this.getSeconds(), //秒 
	        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
	        "S": this.getMilliseconds() //毫秒 
	    };
	    if (/(y+)/.test(fmt))
	fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	    for (var k in o){
	    if (new RegExp("(" + k + ")").test(fmt)) {
	fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	}
	    }
	    return fmt;
	}
	
	//返回列表
	function back_list(){
		window.location.href="${basePath!''}/evaluate/eva/list.htm?";
	}
	
	//提交
	function save_answer(){
		//保存答案明细
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/evaluate/answer/list/save.htm?', 
			data:{'evaDetailId':${evaDetailId!''},'status':'2','issueListId':${issueListId!''}}, 
			async: false,
			success:function(data){  
				$(".card li span").each(function(){
					if($(this).attr('id')!=''&&$(this).attr('id')!=null){
						//保存答案明细
						$.ajax({  
							type:'post',  
						    url:'${basePath!''}/evaluate/answerDetail/list/save.htm?', 
						    async: false,
						    data:{
						    		'evaDetailId':${evaDetailId!''},
						    		'answerId':data,
						    		'questionId':$(this).attr('questionId'),
						    		'selectionNum':$(this).attr('selectNum')
						    	  }, 
						    success:function(data){  }  
					 	});	
					}	
				})
			}  
		});	
		window.location.href="${basePath!''}/evaluate/eva/list.htm?";
	}
</script>
</body>
</html>