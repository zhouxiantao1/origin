<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>自适应测试-作答</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="-1">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/auto_test_respond.css">
	<script src="${basePath!''}/js/jquery.min.js"></script>
	<script src="${basePath!''}/js/placeholder.js"></script>
</head>
<body onload="loading_exam_adaptation_question()">
	
	<input type="hidden" id="adaptationId" name="adaptationId" value="<#if eav??>${eav.id!''}</#if>"/>
	<input type="hidden" id="adaptationAnswerId"/>
	<input type="hidden" id="knowledgeId"/>
	<input type="hidden" id="difficulty"/>
	<input type="hidden" id="num" value="<#if eav??>${eav.num!''}</#if>"/>
	<input type="hidden" id="questionId"/>
	<input type="hidden" id="number"/>
	<input type="hidden" id="duration" value="<#if eav??>${eav.duration!''}</#if>"/>
	<!-- 剩余时间毫秒数 -->
	<input type="hidden" id="second" value="${eav.duration*60}"/>
<!-- 引入公共头部 -->

<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<#include '/common/popup.ftl'/>
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>自适应测试&gt;作答</h3>
					</div>
					<p class="back fr" onClick="history.go(-1)">返回上级</p>
				</div>
				<#if eav??>
				<div class="start_doit">
					<div class="clearfix">
						<p class="backs fr"><b style="color:red">注意:如答题过程中超过答题时间，则自动提交试卷!</b>&nbsp;&nbsp;&nbsp;<#if eav??>剩余时间: <i id="time_i">00:00:00</i></#if></p>
					</div>
					
					<h3>${eav.name!''}</h3>
					<div class="progress clearfix">
						<div class="progress_bar fl">
							<p class="bottom"></p>
							<p class="up" id="p_up"></p>
						</div>
						<div class="fl">选项题已完成<span id="span_num">0</span>/${eav.num!''}</div>
					</div>
					
					<div id="adaptation_content">
						<div class="load_msg">
							<img src = "${basePath!''}/images/loading.gif"/>
							<br>系统正在为您匹配下一道试题信息，请稍等...
						</div>
						
						<#--
						<div class="question">
							<h2>第<span>4</span>题(汉语拼音)</h2>
							<p class="que"></p>
							<div class="answer_area">
								<p><label><input type="radio" name="que"><span>A 两条领边相等</span></label></p>
								<p><label><input type="radio" name="que"><span>B 两条边和一个角相等</span></label></p>
								<p><label><input type="radio" name="que"><span>C 两个交相等</span></label></p>
								<p><label><input type="radio" name="que"><span>D 直角三角形对边相等</span></label></p>
								<button class="next" style="background:#e5e5e5;color:#000">下次再做</button>
								<button class="next" onClick="submit_exam_adaptation_answer()">下一题</button>
							</div>
						</div>
						-->
					</div>

				</div>
				<#else>
					<h1 class="tips_msg"><img src="${basePath!''}/images/no-content.png"><br>系统无法为您匹配到该次测试内容~~</h1>
				</#if>

			</div>

		</div>
	</div>

	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>
	

<script>

	function loading_exam_adaptation_question(){
		
		if($('#adaptationId').val()!=''){
		
			if($('#num').val()==$('#number').val()){
			
				$('#adaptation_content').empty();
				location.href = '${basePath!''}/exam/adaptation/report/page.htm?adaptationId='+$('#adaptationId').val();
			
			}else{
			
				$.ajax({  
					type:'get',  
				    url:'${basePath!''}/exam/adaptation/question/get.htm', 
				    data:{'adaptationId':$('#adaptationId').val()}, 
				   
						
				    success:function(data){  
				    
				    	$('#adaptation_content').empty();
				    	var html = "";
				    	
				    	if(data.eaqv != undefined){
				    	
				    		$('#adaptationAnswerId').val(data.id);
					    	$('#knowledgeId').val(data.eaqv.knowledgeId);
					    	$('#difficulty').val(data.eaqv.difficulty);
					    	$('#questionId').val(data.eaqv.questionId);
					    	$('#span_num').html(data.num);
					    	$('#p_up').width(data.num/$('#num').val()*100+'%');
					    	$('#number').val(data.num);
					    	$('#second').val($('#duration').val() * 60 - data.second);
				    	
						    html +='<div class="question">';
						    html +='<h2>第<span>'+data.num+'</span>题('+data.eaqv.bkv.name+')</h2>';
						    html +='<p class="que">'+data.eaqv.qcd.title+'</p>';
						    html +='<div class="answer_area">';
						    for(var i=0;i<data.eaqv.qods.length;i++){
						    	html +='<p><label><input type="radio" name="answer" value="'+i+'"><span>'+data.eaqv.qods[i].content+'</span></label></p>';
						    }
						    if($('#duration').val() * 60 - data.second > 0){
						    if($('#num').val()==data.num){
							    //最后一道题
							    	html +='<button class="next"  onClick="submit_exam_adaptation_answer()">完成测试</button>';
							    }else{
							    	html +='<button class="next"  onClick="submit_exam_adaptation_answer()">下一题</button>';
							    }
						    }else{
						    	popup(5);
						    	stop_exam_adaptation();
						    	html +='<button class="next" style="disabled:true;color:#000000;background:#d9d9d9;font-weight:bold">考试超时</button>';
						    }
						    html +='</div>';
						    html +='</div>';
						    html +='</div>';
					    
					    }else{
					    
					    	  html +='<div class="load_msg">';
							  html +='<br>系统无法为您匹配到合适的试题内容!！';
							  html +='</div>';
							    
					    }
					    
					    $('#adaptation_content').append(html);
				    	
				    },
			        error: function(XMLHttpRequest, textStatus, errorThrown) {
	                    
	                    $('#adaptation_content').empty();
				    	var html = "";
					    html +='<div class="load_msg">';
					    html +='<br>系统错误，快联系系统管理员吧！';
					    html +='</div>';
					    
					    $('#adaptation_content').append(html);
	                }
	    
			 	});
			 	
			 }
		}
	}
	
	function submit_exam_adaptation_answer(){
	
		var answer = $("input[name='answer']:checked").val();
		
		if(answer==null){
			 alert("请选择正确的答案!");
			 return;
		}
	
		$('#adaptation_content').empty();
    	var html = "";
	    html +='<div class="load_msg">';
	    html +='<img src = "${basePath!''}/images/loading.gif"/>';
	    html +='<br>系统正在为您匹配下一道试题信息，请稍等...';
	    html +='</div>';
	    
	    $('#adaptation_content').append(html);
	    
	    $.ajax({  
			type:'get',  
		    url:'${basePath!''}/exam/adaptation/question/answer/save.htm', 
		    data:{
		   		'answer':answer,
		    	'id':$('#adaptationAnswerId').val(),
		    	'difficulty':$('#difficulty').val(),
		    	'knowledgeId':$('#knowledgeId').val(),
		    	'adaptationId':$('#adaptationId').val(),
		    	'questionId':$('#questionId').val(),
		    	'number':$('#number').val(), //第几道题
		    }, 
		    success:function(data){  
		    	if(data == 1){
		    		loading_exam_adaptation_question();
		    	}
		    },
		    error: function(XMLHttpRequest, textStatus, errorThrown) {
                    
                    $('#adaptation_content').empty();
			    	var html = "";
				    html +='<div class="load_msg">';
				    html +='<br>系统错误，快联系系统管理员吧！';
				    html +='</div>';
				    
				    $('#adaptation_content').append(html);
            }
	 	});
		
	}
	
	
	function stop_exam_adaptation(){
		
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/exam/adaptation/stop.htm', 
		    data:{
		    	'adaptationId':$('#adaptationId').val(),
		    	'number':$('#number').val(), //第几道题
		    }, 
		    success:function(data){  
		    	if(data == 1){
		    		$('#now_check').empty();
		    		$('#now_check').append('<b onClick="location.href = \'${basePath!''}/exam/adaptation/report/page.htm?adaptationId='+$('#adaptationId').val()+'\'">现在查看报告</b>');
		    	}
		    },
		    error: function(XMLHttpRequest, textStatus, errorThrown) {
           		alert('系统错误，快联系系统管理员吧！');
            }
	 	});
	
	}
</script>

<script language="javascript" type="text/javascript"> 
function ShowCountDown() { 

	
	if($('#second').val()>0){
		$('#second').val($('#second').val()-1);
		var now = new Date(); 
		var endDate = new Date(); 
		endDate.setSeconds($('#second').val());
		var leftTime=endDate.getTime()-now.getTime(); 
		var leftsecond = parseInt(leftTime/1000); 
		//var day1=parseInt(leftsecond/(24*60*60*6)); 
		var day1=Math.floor(leftsecond/(60*60*24)); 
		var hour=Math.floor((leftsecond-day1*24*60*60)/3600); 
		var minute=Math.floor((leftsecond-day1*24*60*60-hour*3600)/60); 
		var second=Math.floor(leftsecond-day1*24*60*60-hour*3600-minute*60); 
		$('#time_i').html(hour+":"+minute+":"+second);
	}else{
		$('#time_i').html("已超时！");
	}
	
} 
window.setInterval(function(){ShowCountDown();}, 1000); 
</script> 	
</body>
</html>