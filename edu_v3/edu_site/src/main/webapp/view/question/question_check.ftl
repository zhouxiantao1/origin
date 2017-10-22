<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>题库-题库审核</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/tiku_audit.css">
</head>
<body>

<!-- 引入公共头部 -->
<#include '/common/top.ftl' />		

	<div class="content_contain">
		<div class="content">
			<div class="checkStatus_choice sb_choice mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>题库>题目审核</h3>
					</div>
					<p class="back fr" onClick="javascript :history.back(-1);">返回上级</p>		
				</div>
				<div class="nav_list">
					<ul class="paper_list clearfix">
						<li checkStatus="1" <#if search.checkStatus == '1'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/check/list.htm?checkStatus=1'">未审核</li>
						<li checkStatus="2" <#if search.checkStatus == '2'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/check/list.htm?checkStatus=2'">审核通过</li>
						<li checkStatus="3" <#if search.checkStatus == '3'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/check/list.htm?checkStatus=3'">审核失败</li>
					</ul>
					<div class="condition_list">
						<div class="stage_choice choice_sub clearfix">
							<span class="fl">选择学段：</span>
							<ul class="clearfix fl">
								<!-- 学段  -->
								<#if search.stageId??>
									<#if bStageVos?? && bStageVos?size != 0>
										<#list bStageVos as bsv>
											<li onClick="search_question_check('stage',${bsv.id!''})" stage_id="${bsv.id!''}" <#if bsv.id == search.stageId> class="active"</#if>>${bsv.name!''}</li>
										</#list>
									</#if>
								</#if>
							</ul>
						</div>
						<div class="grade_choice choice_sub clearfix">
							<span>选择年级：</span>
							<ul class="clearfix">
								<!-- 年级  -->
								<li onClick="search_question_check('grade',0)" grade_id="0" <#if search.gradeId??><#else>class="active"</#if>>全部</li>
								<#if bGradeVos?? && bGradeVos?size != 0>
									<#list bGradeVos as bgv>
										<li  onClick="search_question_check('grade',${bgv.id!''})" grade_id="${bgv.id!''}" <#if search.gradeId??><#if bgv.id == search.gradeId> class="active"</#if></#if>>${bgv.name!''}</li>
									</#list>
								</#if>
							</ul>
						</div>
						<div class="subject_choice choice_sub clearfix" style="margin-bottom:5px">
							<span>选择学科：</span>
							<ul class="clearfix">
								
								<li  onClick="search_question_check('subject',0)"  subject_id="0"  <#if search.subjectId??><#else>class="active"</#if>>全部</li>
								<#if bSubjectVos?? && bSubjectVos?size != 0>
									<#list bSubjectVos as bsv>
										<li   onClick="search_question_check('subject',${bsv.id!''})"  subject_id="${bsv.id!''}" <#if search.subjectId??><#if bsv.id == search.subjectId> class="active"</#if></#if>>${bsv.name!''}</li>
									</#list>
								</#if>
							</ul>
						</div>
					</div>
				</div>
				

				<!-- <div class="select_project">
					<div class="sp_contain">
						<div class="stage_choice choice_sub clearfix">
							<span>选择学段：</span>
							<ul class="clearfix">
							
								<#if search.stageId??>
									<#if bStageVos?? && bStageVos?size != 0>
										<#list bStageVos as bsv>
											<li onClick="search_question_check('stage',${bsv.id!''})" stage_id="${bsv.id!''}" <#if bsv.id == search.stageId> class="active"</#if>>${bsv.name!''}</li>
										</#list>
									</#if>
								</#if>
							</ul>
						</div>
						<div class="grade_choice choice_sub clearfix">
							<span>选择年级：</span>
							<ul class="clearfix">
								
								<li onClick="search_question_check('grade',0)" grade_id="0" <#if search.gradeId??><#else>class="active"</#if>>全部</li>
								<#if bGradeVos?? && bGradeVos?size != 0>
									<#list bGradeVos as bgv>
										<li  onClick="search_question_check('grade',${bgv.id!''})" grade_id="${bgv.id!''}" <#if search.gradeId??><#if bgv.id == search.gradeId> class="active"</#if></#if>>${bgv.name!''}</li>
									</#list>
								</#if>
							</ul>
						</div>
						<div class="subject_choice choice_sub clearfix" style="margin-bottom:5px">
							<span>选择学科：</span>
							<ul class="clearfix">
								
								<li  onClick="search_question_check('subject',0)"  subject_id="0"  <#if search.subjectId??><#else>class="active"</#if>>全部</li>
								<#if bSubjectVos?? && bSubjectVos?size != 0>
									<#list bSubjectVos as bsv>
										<li   onClick="search_question_check('subject',${bsv.id!''})"  subject_id="${bsv.id!''}" <#if search.subjectId??><#if bsv.id == search.subjectId> class="active"</#if></#if>>${bsv.name!''}</li>
									</#list>
								</#if>
							</ul>
						</div>
					</div>
				</div> -->
				
				<#assign option_number="ABCDEFGHIJKLMNOPQRSTUVWXYZ"/>
				<div class="questions">
					<h3 class="tips">题目审核</h3>
					
					
					<#if pb.list?? && pb.list?size != 0>
					<#list pb.list as qw>
					
					<div class="item" id="div_question_id_${qw.id!''}">
						<!-- 问题 -->
						<div class="question">                                                            
							<#if qw.qc??>${qw.qcd.title!''}</#if>
							<#if qw.qc??>${qw.qcd.content!''}</#if>
							<br/>
							<#if qw.qods??>
								<#list qw.qods as qod>
									${option_number?substring(qod_index,qod_index+1)}.${qod.content?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}<br/>
								</#list>
							</#if>
						</div>
						
						<!-- 答案 -->
						<!-- 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题  -->
						<#if qw.avs??>
							<#list qw.avs as av>
								<div class="answer">
									<div class="already_login">	
										<!-- 非客观题(直接展示）-->
										<#if qw.qtv.markingCode == '0'>
											<p><span>【答案】${av.answerValue!''}</span><p>
										</#if>
										<#if qw.qtv.markingCode == '1' || qw.qtv.markingCode == '2'>
											<p><span>【答案】<#if qw.qods??><#list qw.qods as qod><#if qod.is_answer  == '1'>${option_number?substring(qod_index,qod_index+1)}</#if></#list></#if></span><p>
										</#if>
										<#if qw.qtv.markingCode == '3' || qw.qtv.markingCode == '4'>
											<p><span>【答案】<#if av.answerValue??><#list av.answerValue?split("|") as av>${av!''}&nbsp;</#list></#if></span><p>
										</#if>
										<#if qw.qtv.markingCode == '5'>
										    <p><span>【答案】<#if av.answerValue??><#list av.answerValue?split("|") as av>${av_index+1} <#if av=='0'>√<#else>×</#if></#list></#if></span><p>
										</#if>
										<p><span>【解析】${av.answerDescription!''}</p>
									</div>
								</div>
							</#list>
						</#if>

						<div class="who clearfix">
							<p class="fl">命题人：${qw.createName!''} &nbsp;&nbsp;编号：${qw.id!''} &nbsp;&nbsp;<#if qw.knowledgeNames?? && qw.knowledgeNames?size != 0>知识点：<#list qw.knowledgeNames as kn>${kn!''}&nbsp;</#list></#if></p>
							<span class="fr">组卷次数：<i>${qw.testTimes!''}</i>次</span>
						</div>

						<div class="operation clearfix">
							<p class="fl"><span>难度:${qw.difficulty!''}</span>
							<#if qw.qtv??><span>题型:${qw.qtv.typeName!''}</span></#if>
							<#if search.checkStatus=='1'>
								<span>更新时间:${qw.createTime?string("yyyy-MM-dd HH:mm:ss")}</span>
							<#else>
								<span>审核时间:${qw.checkTime?string("yyyy-MM-dd HH:mm:ss")}</span>
								<!--	1考试题库,2作业题库,3錨题库,4种子题库, 5个人题库（教师题库）,6专家题库 （新题库）,7.自适应题库-->
								<#if search.checkStatus != '3'>
								<span>归属题库:
									<#if qw.belongToLib=='1'>考试题库</#if>
									<#if qw.belongToLib=='2'>作业题库</#if>
									<#if qw.belongToLib=='3'>锚题库</#if>
									<#if qw.belongToLib=='4'>种子题库</#if>
									<#if qw.belongToLib=='5'>教师题库</#if>
									<#if qw.belongToLib=='6'>专家题库</#if>
									<#if qw.belongToLib=='7'>自适应题库</#if>
								</span>
								</#if>
							</#if>
							</p>
							<#if search.checkStatus == '1'>
							<ul class="fr clearfix">
								<li class="audit" question_id="${qw.id!''}">审核</li>
							</ul>
							</#if>
						</div>
					</div>

					</#list>
					<!-- 分页 -->
					<div class="page_list clearfix" id="demo2">
						<div class="mids fr">
							<ul class="page_num clearfix">
							   <#if pb.pageNo != 1>
							   	  <li onClick="search_question_check('page','${pb.firstPageNo!''}')" >首页</li>
	              	              <li onClick="search_question_check('page','${pb.prePageNo!''}')" >上一页</li>
	                           </#if>
	                            <#list pb.startNo..pb.endNo as index>
	              					<#if index == pb.pageNo>
	              						<li class="active"   onClick="search_question_check('page','${pb.pageNo}')">${pb.pageNo}</li>
	              					<#else>
	              						<li  onClick="search_question_check('page','${index}')">${index}</li>
	              					</#if>
				  				</#list>
				  				
				  				 <#if pb.pageNo != pb.totalPages>
									<li onClick="search_question_check('page','${pb.nextPageNo!''}')">下一页</li>
									<li onClick="search_question_check('page','${pb.lastPageNo!''}')">未页</li>
	              				</#if>
	              				<li>${pb.pageNo}/${pb.totalPages}</li>
	              				<li>共${pb.rows}条记录，分 ${pb.totalPages} 页</li>
							</ul>
						</div>
					</div>
					<#else>
					<h1 class="tips_msg"><img src="${basePath!''}/images/no-content.png"><br>暂无试题信息！！！</h1>
				</#if>

				</div>

			</div>
		</div>
	</div>

	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>
	
	<div class="popup_contain">
		<div class="popup">
			<h3 class="title">请选择相应的题库审核 <span class="close">x</span></h3>
			<div class="choice_audit">
				<input type="hidden" id="questionId"/>
				<!--	1考试题库,2作业题库,3錨题库,4种子题库, 5个人题库（教师题库）,6专家题库 （新题库）,7.自适应题库-->
				<label><input type="radio" name="belongToLib" checked value="1"><span>考试题库</span></label>
				<label><input type="radio" name="belongToLib" value="2"><span>作业题库</span></label>
				<label><input type="radio" name="belongToLib" value="3"><span>锚题题库</span></label><br/>
				<label><input type="radio" name="belongToLib" value="4"><span>种子题库</span></label>
				<label><input type="radio" name="belongToLib" value="6"><span>专家题库</span></label>
				<label><input type="radio" name="belongToLib" value="7"><span>自适应库</span></label>
			</div>
			<div class="operation">
				<button class="pass" onClick="check_question('2')">审核通过</button>
				<button class="faild"  onClick="check_question('3')">审核失败</button>
				<button class="cancel">取消</button>
			</div>
		</div>
	</div>
	
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<script type="text/javascript">
	$(function(){
		//弹窗出现
		$('.audit').click(function(){
			$('#questionId').val($(this).attr("question_id"));
			$('.popup_contain').show();
		})
		$('.popup .close,.operation .cancel').click(function(){
			$('.popup_contain').hide();
		})
	})
</script>
<script type="text/javascript">
	

    //组装查询跳转url
	function search_question_check(type,id){
		
		var stageId = $('.stage_choice ul li.active').attr('stage_id');
		var gradeId = $('.grade_choice ul li.active').attr('grade_id');
		var subjectId  = $('.subject_choice ul li.active').attr('subject_id');
		var checkStatus = $('.checkStatus_choice ul li.active').attr('checkStatus');
		
		
		var url = "${basePath!''}/question/check/list.htm?";
		var data = "";
		
		//归属题库
		if(checkStatus == undefined){
			data = data + "checkStatus=1&";
		}else{
			data = data + "checkStatus=" +checkStatus+"&";
		}
		
		
		if(type == 'stage'){
			data = data + "stageId="+id+"&gradeId=0&subjectId=0";
		}else if(type == 'grade'){
			
			data = data + "stageId="+stageId+"&gradeId="+id+"&subjectId="+subjectId;;
		}else if(type == 'subject'){
	
			data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+id;
		}else if(type == 'page'){
		
			data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+subjectId;
			data = data+ "&pageNo="+id;
			
		}
		
		window.location.href=url+data;
	}
	
	
	//审核试题
	function check_question(checkStatus){
	
		
		$.ajax({  
			type:'post',  
		    url:'${basePath!''}/question/check/update.htm', 
		    data:{
		    	'id':$('#questionId').val(),      //试题id
		    	'checkStatus':checkStatus,        //审核状态
		    	'belongToLib':$("input[name='belongToLib']:checked").val()         //所属题库  
		    }, 
		    success:function(data){  
		    
		    	$('.popup_contain').hide();
		    	if(data == 1){
		    	//操作成功
		    		$('#div_question_id_'+$('#questionId').val()).remove();
		    	}else{
		    	//操作失败
		    		alert('审核失败');
		    	}
		    },
		    error: function(XMLHttpRequest, textStatus, errorThrown) {
                    
                 alert('系统错误,请重新操作!');
            }
	 	});
		
	}
</script>


</body>
</html>