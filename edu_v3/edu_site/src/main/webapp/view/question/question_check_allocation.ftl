<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>题库-公开题目审核分配</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/tiku_shenhe.css">
</head>
<body>

<!-- 引入公共头部 -->
<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
		
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>题库>新增题目</h3>
					</div>
					<p class="back fr" onClick="javascript :history.back(-1);">返回上级</p>
				</div>

				<div class="select_project">
					<div class="stage_choice choice_sub clearfix">
						<span>选择学段：</span>
						<!-- 学段  -->
						<ul class="clearfix">
							<#if search.stageId??>
							<#if bStageVos?? && bStageVos?size != 0>
								<#list bStageVos as bsv>
									<li onClick="search_question_ware('stage',${bsv.id!''})" stage_id="${bsv.id!''}" <#if bsv.id == search.stageId> class="active"</#if>>${bsv.name!''}</li>
								</#list>
							</#if>
						</#if>
						</ul>
					</div>
					<div class="grade_choice choice_sub clearfix">
						<span>选择年级：</span>
						<ul class="clearfix">
							<!-- 年级  -->
							<#if search.gradeId??>
								<#if bGradeVos?? && bGradeVos?size != 0>
									<#list bGradeVos as bgv>
										<li  onClick="search_question_ware('grade',${bgv.id!''})" grade_id="${bgv.id!''}" <#if bgv.id == search.gradeId> class="active"</#if>>${bgv.name!''}</li>
									</#list>
								</#if>
							</#if>
						</ul>
					</div>
					<div class="subject_choice choice_sub clearfix">
						<span>选择学科：</span>
						<ul class="clearfix">
							<!-- 学科  -->
							<#if search.subjectId??>
								<#if bSubjectVos?? && bSubjectVos?size != 0>
									<#list bSubjectVos as bsv>
										<li onClick="search_question_ware('subject',${bsv.id!''})"  subject_id="${bsv.id!''}" <#if bsv.id == search.subjectId> class="active"</#if>>${bsv.name!''}</li>
									</#list>
								</#if>
							</#if>
						</ul>
					</div>
					<form action="${basePath!''}/question/check/allocation/save.htm" method="post" onsubmit="disabled_button()">
					<input type="hidden" name="stageId" value="${search.stageId!''}">
					<input type="hidden" name="gradeId" value="${search.gradeId!''}">
					<input type="hidden" name="subjectId" value="${search.subjectId!''}">
					<div class="allot ">
						<div class="count clearfix"><p class="fr">待分配题目<span id="count_span">${count!''}</span>（道）,可分配题还剩&nbsp;<span class="feasible_count" id="feasible_count_span">${count!''}</span>（道）</p></div>
						<ul class="all_input">
							<li class="first_line"><span >姓名</span><span>分配考题（道）</span></li>
							<#if subs?? && subs?size != 0>
							<#list subs as sub>
								<input type="hidden" name="qcnms[${sub_index!''}].checkId" value="${sub.id!''}"/>
								<input type="hidden" name="qcnms[${sub_index!''}].checkName" value="${sub.name!''}"/>
								<li><span>${sub.name!""}</span><span><input type="text"  name="qcnms[${sub_index!''}].num" value="0"></span></li>
							</#list>
							</#if>
						</ul>
						<div class="count clearfix"><button class="fr" type="submit" id="submit_button">确认提交</button></div>
					</div>
					</form>

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
<script src="${basePath!''}/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript">

	//待分配的总数
	var totalCount = parseInt($('#count_span').html());
	var residue_input  = $('.feasible_count');	//剩下多少道的显示
	var input_contain = $('.all_input');
	
	input_contain.on('input propertychange','input',function(){
		var num = parseInt($(this).val());	//当前输入框的值
		if(!checkNumber(num)){
			$(this).val("0");
			alert('请输入合法有效的数字!');
			
			var use_input = 0;	//已经分配的题目数量
			var all_input = input_contain.find('input[type="text"]');	//所有的输入框

		}else{
		
			$(this).val(parseInt(num));
			
		}
		
		//计算剩余题数
		var use_input = 0;	//已经分配的题目数量
		var all_input = input_contain.find('input[type="text"]');	//所有的输入框

		all_input.each(function(index,ipt){
			use_input += parseInt($(this).val());	//已经分配的题目数量
			if(use_input > totalCount){
				alert('已经没有更多题目分配');
				$(this).val(0)
				return false;
			}else{
				var elseCount = totalCount - use_input; //剩下多少道题
				residue_input.html(elseCount);
			}
		})
	})
	
	function checkNumber(theObj) {
	  var reg = /^\+?[1-9][0-9]*$/;  
	  if (reg.test(theObj)) {
	    return true;
	  }
	  return false;
	}

	  //组装查询跳转url
	function search_question_ware(type,id){
		
		var stageId = $('.stage_choice ul li.active').attr('stage_id');
		var gradeId = $('.grade_choice ul li.active').attr('grade_id');
		var subjectId  = $('.subject_choice ul li.active').attr('subject_id');
		var typeId = $('.type_choice ul li.active').attr('type_id');
		var difficulty =  $('.difficulty_choice ul li.active').attr('difficulty');
		var belongToLib = $('.belongToLib_choice ul li.active').attr('belongToLib');
		var sort = $('.sort ul li.active').attr('sort');
		
		var url = "${basePath!''}/question/check/allocation/list.htm?";
		var data = "";
		
		//跳转页码
		
		
		if(type == 'stage'){
			data = data + "stageId="+id;
		}else if(type == 'grade'){
			
			data = data + "stageId="+stageId+"&gradeId="+id;
		}else if(type == 'subject'){
	
			data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+id;
		}
		
		window.location.href=url+data;
	}
	
	function disabled_button(){
	
		//修改按钮颜色，不允许重复提交--------------------------
		$('#submit_button').attr('disabled',"true");
		$('#submit_button').text("正在提交中...");
		$('#submit_button').css("background","#d9d9d9");
		$('#submit_button').css("color","#000000");
		$('#submit_button').css("font-weight","bold");
		//-----------------------------------------------
	    
	}
	    
</script>
</body>
</html>