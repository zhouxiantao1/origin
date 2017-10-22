<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>在线作业</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="-1">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">	
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/tiku.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/work_manage.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/zTreeStyle/zTreeStyle.css">
</head>
<body>
<input type="hidden" id="knowledgeId" <#if search.knowledgeId??>value="${search.knowledgeId!''}"</#if>>
<input type="hidden" id="catalogDetailId" <#if search.catalogDetailId??>value="${search.catalogDetailId!''}"</#if>>
<input type="hidden" id="versionId" <#if search.versionId??>value="${search.versionId!''}"</#if>>
<input type="hidden" id="belongToLib" <#if search.belongToLib??>value="${search.belongToLib!''}"</#if>>
<!-- 引入公共头部 -->
<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content clearfix">
			<div class="belongToLib_choice middle fl">
				<!-- <div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>在线作业&gt;我的错题集</h3>
					</div>
				</div> -->
				<div class="nav_list">
					<ul class=" paper_list clearfix ">
						<li><a href="${basePath!''}/work/homework/list.htm?">我的作业</a></li>
						<li class="active">我的错题集</li>
					</ul>
				</div>

				<div class="subject">
					<div class="version_choice clearfix" style="display:none">
						<span class="fl">版本：</span>
						<ul class="clearfix fl">
							<!-- 版本  -->
							<#if search.versionId??>
								<#if bVersionVos?? && bVersionVos?size != 0>
									<#list bVersionVos as bvv>
										<li onClick="search_question_ware('stage',${bvv.id!''})" stage_id="${bvv.id!''}" <#if bvv.id == search.versionId> class="active"</#if>>${bvv.name!''}</li>
									</#list>
								</#if>
							</#if>
						</ul>
					</div>
					<div class="stage_choice clearfix">
						<span class="fl" style="display:none">学段：</span>
						<ul class="clearfix fl" style="display:none">
						
							<!-- 学段  -->
							<#if search.stageId??>
								<#if bStageVos?? && bStageVos?size != 0>
									<#list bStageVos as bsv>
										<li onClick="search_question_ware('stage',${bsv.id!''})" stage_id="${bsv.id!''}" <#if bsv.id == search.stageId> class="active"</#if>>${bsv.name!''}</li>
									</#list>
								</#if>
							</#if>
						</ul>
					</div>
					<div class="grade_choice clearfix">
						<span class="fl">年级：</span>
						<ul class="clearfix fl">
						
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
					
					<div class="subject_choice clearfix">
						<span class="fl">学科：</span>
						<ul class="clearfix fl">
							<!-- 学科  -->
							
							<#if search.subjectId??>
								<#if bSubjectVos?? && bSubjectVos?size != 0>
									<#list bSubjectVos as bsv>
										<li onClick="search_question_ware('subject',${bsv.id!''})"  subject_id="${bsv.id!''}" <#if search.subjectId?? && search.subjectId==bsv.id> class="active"</#if>>${bsv.name!''}</li>
									</#list>
								</#if>
							</#if>
						</ul>
					</div>
					
					<div class="type_choice clearfix">
						<span class="fl">题型：</span>
						<ul class="clearfix fl">
							<li  onClick="search_question_ware('type','')"   <#if search.typeId??><#else>class="active"</#if>>全部</li>
							<#if qTypeVos?? && qTypeVos?size != 0>
								<#list qTypeVos as qtv>
									<li  onClick="search_question_ware('type',${qtv.id!''})"   type_id="${qtv.id!''}" <#if search.typeId?? && search.typeId == qtv.id>class="active"</#if>>${qtv.typeName!''}</li>
								</#list>
							</#if>
						</ul>
					</div>
					
					<div class="difficulty_choice clearfix" style="display:none">
						<span class="fl">难度：</span>
						
						<ul class="clearfix fl">
							<!-- 难度  -->
							<li  onClick="search_question_ware('difficulty','')" <#if search.difficulty??><#else> class="active"</#if>>全部</li>
							<li  onClick="search_question_ware('difficulty','0')" difficulty='0' <#if search.difficulty?? &&  search.difficulty == '0'> class="active"</#if>>较易1.00-0.70</li>
							<li  onClick="search_question_ware('difficulty','1')" difficulty='1' <#if search.difficulty?? &&  search.difficulty == '1'> class="active"</#if>>中等0.70-0.30</li>
							<li  onClick="search_question_ware('difficulty','2')" difficulty='2' <#if search.difficulty?? &&  search.difficulty == '2'> class="active"</#if>>较难0.30-0.00</li>
						</ul>
					</div>
				</div>

			

				<#assign option_number="ABCDEFGHIJKLMNOPQRSTUVWXYZ"/>
				<div class="questions">
					<div class="tips">
						<span>提示：勾选可显示全部答案与解析</span>
						<label class="show_answer"><input type="checkbox" name=""><i>显示全部答案和解析</i></label>
					</div>

					<#if pb.list?? && pb.list?size != 0>
					<#list pb.list as qw>
					
					<div class="item">
						<!-- 问题 -->
						<div class="question">                                                            
							<#if qw.qcd??>${qw.qcd.title?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</#if>
							<#if qw.qcd.content??>${qw.qcd.content?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</#if>
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
										<p><span>【解析】${av.answerDescription?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</p>
									</div>
								</div>
							</#list>
						</#if>
						
						<#assign wrong_id=0>
						<div class="who clearfix">
							<p class="fl">编号：${qw.id!''} &nbsp;&nbsp;<#if qw.knowledgeNames?? && qw.knowledgeNames?size != 0>知识点：<#list qw.knowledgeNames as kn>${kn!''}&nbsp;</#list></#if></p>
							
							<#assign wrong_num=1>
							<#if workWrongVoList?? && workWrongVoList?size!=0>
								<#list workWrongVoList as workWrongVo>
									<#if workWrongVo.questionId==qw.id>
										<#assign wrong_num=workWrongVo.wrongNum>
										<#assign wrong_id=workWrongVo.id>
									</#if>
								</#list>
							</#if>
							<span class="fr">做错次数：<i>${wrong_num!''}</i>次</span>
						</div>

						<div class="operation clearfix">
							<p class="fl"><#if qw.qtv??><span>题型:${qw.qtv.typeName!''}</span></#if><span>更新:${qw.createTime?string("yyyy-MM-dd HH:mm:ss")}</span></p>
							<ul class="fr clearfix">
								<!-- <li><img src="${basePath!''}/images/纠错.png"><i>纠错</i></li> -->
								
								<#assign isCollect='0'>
								<#if qCollectVos?? && qCollectVos?size != 0>
									<#list qCollectVos as vo>
										<#if vo.questionId == qw.id>
											<#assign isCollect='1'>
										</#if>
									</#list>
								</#if>
								
			
								<li onClick="master(${wrong_id!''})"><img src="${basePath!''}/images/wrong_grasp.png"><i>我已掌握</i></li>
								<li onClick="enough_question(${qw.id!''})"><img src="${basePath!''}/images/wrong_save.png"><i>补救练习</i></li>
								
								
							</ul>
						</div>
					</div>
					</#list>
					
				<!-- 分页 -->
				<div class="page_list clearfix" id="demo2">
					<div class="mids fr">
						<ul class="page_num clearfix">
						   <#if pb.pageNo != 1>
						   	  <li onClick="search_question_ware('page','${pb.firstPageNo!''}')" >首页</li>
              	              <li onClick="search_question_ware('page','${pb.prePageNo!''}')" >上一页</li>
                           </#if>
                            <#list pb.startNo..pb.endNo as index>
              					<#if index == pb.pageNo>
              						<li class="active"   onClick="search_question_ware('page','${pb.pageNo}')">${pb.pageNo}</li>
              					<#else>
              						<li  onClick="search_question_ware('page','${index}')">${index}</li>
              					</#if>
			  				</#list>
			  				
			  				 <#if pb.pageNo != pb.totalPages>
								<li onClick="search_question_ware('page','${pb.nextPageNo!''}')">下一页</li>
								<li onClick="search_question_ware('page','${pb.lastPageNo!''}')">未页</li>
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
	
<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<script src="${basePath!''}/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript">
	
	$(function(){
		//	答案解析 展示与隐藏
		var thischeck = $('.show_answer').find('input');
		thischeck.on('click',function(){
			if(thischeck.attr('checked',true)){
				$('.answer').toggle();	//展示区域
			}
		})	

	})

	//我已掌握
	function master(id){
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/work/wrong/listbyid/update.htm',  
          data:{'id':id,'delflag':'1'},
          async: false,
          success:function(data){  
        	 	var stageId = $('.stage_choice ul li.active').attr('stage_id');
				var gradeId = $('.grade_choice ul li.active').attr('grade_id');
				var subjectId  = $('.subject_choice ul li.active').attr('subject_id');
				var typeId = $('.type_choice ul li.active').attr('type_id');
				
				var url = "${basePath!''}/work/wrong/list.htm?";
				var data = "";
				
				if(stageId!=null && stageId!=""){
					data += "&stageId="+stageId;
				}
				if(gradeId!=null && gradeId!=""){
					data += "&gradeId="+gradeId;
				}
				if(subjectId!=null && subjectId!=""){
					data += "&subjectId="+subjectId;
				}
				if(typeId!=null && typeId!=""){
					data += "&typeId="+typeId;
				}
				//跳转页码
				window.location.href=url+data;   
          }  
       });
	}
 
	//查看数据库里面是否有足够的题目
	function enough_question(questionId){
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/work/wrong/enough.htm',  
          data:{'id':questionId},
          async: false,
          success:function(data){ 
       	  	 if(data!=0){
       	  	 	window.location.href="${basePath!''}/work/wrong/exercise.htm?id="+data+"&questionId="+questionId;
       	  	 }else{
       	  	 	alert("题目数不够")
       	  	 }   	
          }
       })
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
		
		var url = "${basePath!''}/work/wrong/list.htm?";
		var data = "";
	
		
		if(type == 'stage'){
			data = data + "stageId="+id;
		}else if(type == 'grade'){
			
			data = data + "stageId="+stageId+"&gradeId="+id;
		}else if(type == 'subject'){
			
			data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+id;
		}else if(type == 'type'){
			if(id == ''){
				// 查询全部
				data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+subjectId;
			}else{
				data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+subjectId+"&typeId="+id;
			}
		}else if(type == 'difficulty'){
		
			data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+subjectId;
			
			if(typeId != undefined){
				data = data + "&typeId="+typeId;
			}
			if(id != ''){
				data = data + "&difficulty="+id;
			}
		}else if(type == 'sort'){
		
			data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+subjectId;
			
			if(typeId != undefined){
				data = data + "&typeId="+typeId;
			}
			if(difficulty != undefined){
				data = data + "&difficulty"+difficulty;
			}
			if(id != ''){
				data = data + "&sort="+id;
			}
			
		}else if(type == 'page'){
		
			data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+subjectId;
			
			if(typeId != undefined){
				data = data + "&typeId="+typeId;
			}
			if(difficulty != undefined){
				data = data + "&difficulty"+difficulty;
			}
			if(sort != undefined){
				data = data + "&sort="+sort;
			}
			data = data+ "&pageNo="+id;
		}else if(type== 'know'){
		
			data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+subjectId;
			
			if(typeId != undefined){
				data = data + "&typeId="+typeId;
			}
			if(difficulty != undefined){
				data = data + "&difficulty"+difficulty;
			}
			if(sort != undefined){
				data = data + "&sort="+sort;
			}
			data = data+ "&knowledgeId="+id;
			
		}else if(type== 'catalog'){
		
			data = data + "stageId="+stageId+"&gradeId="+gradeId+"&subjectId="+subjectId;
			
			if(typeId != undefined){
				data = data + "&typeId="+typeId;
			}
			if(difficulty != undefined){
				data = data + "&difficulty"+difficulty;
			}
			if(sort != undefined){
				data = data + "&sort="+sort;
			}
			data = data+ "&catalogDetailId="+id;
			
		}
		window.location.href=url+data;
	}
</script>



</body>
</html>
