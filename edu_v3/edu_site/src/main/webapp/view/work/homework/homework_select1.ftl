<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>题库中心</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/tiku.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/zTreeStyle/zTreeStyle.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/popup.css">
</head>
<body>
<input type="hidden" id="knowledgeId" <#if search.knowledgeId??>value="${search.knowledgeId!''}"</#if>>
<input type="hidden" id="catalogDetailId" <#if search.catalogDetailId??>value="${search.catalogDetailId!''}"</#if>>

<!-- 引入公共头部 -->
<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="belongToLib_choice middle fl">
	<!-- 			<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>题库管理</h3>
					</div>
				</div> -->
				<div class="nav_list clearfix">
					<ul class=" paper_list fl clearfix ">
						<!--	1考试题库,2作业题库,3錨题库,4种子题库, 5个人题库（教师题库）,6专家题库 （新题库）-->
						<li belongToLib="2" <#if search.belongToLib == '2'> class="active"</#if>  >作业题库</li>
					</ul>
					<p class="back fr"><a href="javascript:history.back(-1)">返回上级</a></p>
				</div>
				
				<div class="subject">
					<div class="stage_choice clearfix">
						<span class="fl">学段：</span>
						<ul class="clearfix fl">
						
							<!-- 学段  -->
							<#if search.stageId??>
								<#if bStageVos?? && bStageVos?size != 0>
									<#list bStageVos as bsv>
										<li stage_id="${bsv.id!''}" <#if bsv.id == search.stageId> class="active"</#if>>${bsv.name!''}</li>
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
										<li grade_id="${bgv.id!''}" <#if bgv.id == search.gradeId> class="active"</#if>>${bgv.name!''}</li>
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
										<li  subject_id="${bsv.id!''}" <#if bsv.id == search.subjectId> class="active"</#if>>${bsv.name!''}</li>
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
					<div class="difficulty_choice clearfix">
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

				<div class="sort clearfix">
					<ul class="fl">
						<li  onClick="search_question_ware('sort','')"  <#if search.sort??><#else>class="active"</#if>>默认</li>
						<li  onClick="search_question_ware('sort','0')" sort='0'  <#if search.sort?? && search.sort == '0'>class="active"</#if>>组卷次数↓</li>
						<li  onClick="search_question_ware('sort','1')" sort='1'  <#if search.sort?? && search.sort == '1'>class="active"</#if>>难度系数↑<i></i></li>
					</ul>
					<div class="mingti fr">
						<div class="fl workcreate" onClick="homework_question()">生成并预览作业</div>
					</div>
				</div>

				<#assign option_number="ABCDEFGHIJKLMNOPQRSTUVWXYZ"/>
				<div class="questions">
					<div class="tips">
						<span>提示：但集体面可现实答案和解析</span>
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
										<#if  && qw.qtv.markingCode == '3' || qw.qtv.markingCode == '4'>
											<p><span>【答案】<#if av.answerValue??><#list av.answerValue?split("|") as av>${av!''}&nbsp;</#list></#if></span><p>
										</#if>
										<#if && qw.qtv.markingCode == '5'>
										    <p><span>【答案】<#if av.answerValue??><#list av.answerValue?split("|") as av>${av_index+1} <#if av=='0'>√<#else>×</#if></#list></#if></span><p>
										</#if>
										<p><span>【解析】${av.answerDescription?replace('other.koo6.com','video.koo6.com')?replace('__TIIMGURL__','video.koo6.com')}</p>
									</div>
								</div>
							</#list>
						</#if>
						

						<div class="who clearfix">
							<p class="fl">命题人：${qw.createName!''} &nbsp;&nbsp;编号：${qw.id!''} &nbsp;&nbsp;<#if qw.knowledgeNames?? && qw.knowledgeNames?size != 0>知识点：<#list qw.knowledgeNames as kn>${kn!''}&nbsp;</#list></#if></p>
							<span class="fr">组卷次数：<i>${qw.testTimes!''}</i>次</span>
						</div>

						<div class="operation clearfix">
							<p class="fl"><span>难度:${qw.difficulty!''}</span><#if qw.qtv??><span>题型:${qw.qtv.typeName!''}</span></#if><span>更新:${qw.createTime?string("yyyy-MM-dd HH:mm:ss")}</span></p>
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
								<span id=${qw.id!''}>
									<#if isCollect == '0'>
										<li onClick="saveOrRemove(${qw.id!''},'1')"><i>+</i><i>加入作业</i></li>	
									<#else>
										<li onClick="saveOrRemove(${qw.id!''},'2')"><i>已加入作业</i></li>
									</#if>
								</span>	
								
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
				
					
				<!-- 是否提交弹出提示框 -->
				<div class="pop_shade">
					<div class="pop" type='2' style="display: none">
						<h3 class="hand_success clearfix">温馨提示<span class="fr"></span></h3>
						<div class="finish">
							<h3></h3>
							<p class="work_msg">您已添加<i id="qtnNum"></i>道题目</p>
							<p class="check_work">
								<span class="now_check">生成查看作业</span> | <span class="i_know">继续添加</span>
							</p>
						</div>
					</div>
				</div>
				
			</div>
		

		<!-- 右侧边栏 -->
			<div class="content_right fr">
				<#--
				<p class="hr"></p>
				<form>
					<div class="form_div">
						<i></i>
						<input type="text" name="" placeholder="搜索...">
					</div>
				</form>
				
				<p class="hr m_top"></p>	
				-->
				<div class="bk_gray">
					<!-- <div class="konwledge">知识点</div> -->
					<p class="show_way clearfix">
						<span class="<#if search.knowledgeId??>active <#else><#if search.catalogDetailId??><#else>active </#if></#if>knowledge">知识点</span>
						<span class="<#if search.catalogDetailId??>active </#if>chapter">课本章节</span>
					</p>

					<ul class="ztree ztree_knowledge" id="treeNode_knowledge" style="height: 600px;width:190px"></ul>
					<ul class="ztree ztree_chapter" id="treeNode_chapter"  style="height: 600px;width:190px"></ul>
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

		//知识点、课本章节切换
		$('.show_way').on('click','span',function(){
			var index = $(this).index();
			console.log(index);
			$('.show_way span').removeClass('active');
			$(this).addClass('active');

			if(index == 0){
				$('.ztree').eq(0).show();
				$('.ztree').eq(1).hide();
			}else{
				$('.ztree').eq(1).show();
				$('.ztree').eq(0).hide();
			}
		})
		
		//关闭弹窗
    	$('.hand_success span,.i_know').click(function(){
    		$('.pop_shade').hide();
    	})
    	
    	//生成预览作业
    	$('.now_check').click(function(){
    		goviewQuestion();
    	})
		
		loadknowledge();
		loadCatalogDetail();
		
		$(".type_choice").hide();

	})

	//弹出提示框
	function popup(type){
    	$('.pop_shade').show();
    	var this_ele = $('.pop_shade').find('.pop[type='+ type +']');
    	this_ele.show().siblings().hide();	
    }
	
	function collect_question(questionId){
		
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/question/collect/list/save.htm', 
		    data:{'questionId':questionId}, 
		    success:function(data){  
		    	if(data==1){
		    		alert('收藏成功');
		    	}else{
		    		alert('收藏失败！');
		    	}
		    }  
	 	});
	}
	
	function delete_question(questionId){
	
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/question/ware/listbyid/delete.htm', 
		    data:{'id':questionId}, 
		    success:function(data){  
		    	if(data==1){
		    		alert('删除成功');
		    	}else{
		    		alert('删除失败！');
		    	}
		    }  
	 	});
	
	}

	function loadknowledgeTree(zNodes){
	
		//树形菜单
		var setting = {
			showLine: false, 
			checkable: true,
			callback:{
				onClick: zKnowTreeOnClick
			}
		}
		
		var zTreeObj;
		zTreeObj = $.fn.zTree.init($("#treeNode_knowledge"), setting, zNodes);	//初始化树
		
	}
	
	function loadCatalogDetailTree(zNodes){
	
		//树形菜单
		var setting = {
			showLine: false, 
			checkable: true,
			callback:{
				onClick: zCatalogTreeOnClick
			}
		}
		
		var zTreeObj;
		zTreeObj = $.fn.zTree.init($("#treeNode_chapter"), setting, zNodes);	//初始化树
		
	}
	
	
	function zKnowTreeOnClick(event, treeId, treeNode) {
		
	    search_question_ware('know',treeNode.id);
	    
	};
	
	function zCatalogTreeOnClick(event, treeId, treeNode) {
		
	     search_question_ware('catalog',treeNode.id);
	};
	
	//加载知识点
	function loadknowledge(){
	
		var stageId = $('.stage_choice ul li.active').attr('stage_id');
		var gradeId = $('.grade_choice ul li.active').attr('grade_id');
		var subjectId  = $('.subject_choice ul li.active').attr('subject_id');
	
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/knowledge/treelistbysearch.htm',  
          data:{'gradeId':gradeId,'stageId':stageId,'subjectId':subjectId,'id':$('#knowledgeId').val()},
          success:function(data){  
        	  loadknowledgeTree(data);                    
          }  
    	});  
	
	}
	
	//加载章节
	function loadCatalogDetail(){
	
		var stageId = $('.stage_choice ul li.active').attr('stage_id');
		var gradeId = $('.grade_choice ul li.active').attr('grade_id');
		var subjectId  = $('.subject_choice ul li.active').attr('subject_id');
		<#if catalogId??>
			var catalogId = ${catalogId!''};
		<#else>
			var catalogId = null;
		</#if>
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/catalogDetail/treelistbysearch.htm',  
          data:{'gradeId':gradeId,'stageId':stageId,'subjectId':subjectId,'id':$('#catalogDetailId').val(),'catalogId':catalogId},
          success:function(data){  
        	  loadCatalogDetailTree(data);                    
          }  
    	});  
	
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
		var data ="";
		var homeworkId = ${homeworkId!''};
		var url = "${basePath!''}/work/homework/select.htm?";
		<#if catalogId??>
			data +="&catalogId="+ ${catalogId!''};
		</#if>
		 data += "&homeworkId="+homeworkId;
		
		//归属题库
		if(belongToLib == undefined){
		
			data = data + "&belongToLib=1&";
		}else{
			data = data + "&belongToLib=" +belongToLib+"&";
		}
		
		//跳转页码
		
		
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
	
	//点一次加入作业，再点击侧取消
	function saveOrRemove(questionId,workType){
		var htmlStr = null;
		if(workType=='1'){
			//html = "<i>已加入作业</i>";
			htmlStr = "<li onClick=saveOrRemove('"+questionId+"','2')><i>已加入作业</i></li>";
			saveQuestionHomework(questionId);
		}else{
			//html = "<i>+</i><i>加入作业</i>";
			htmlStr = "<li onClick=saveOrRemove('"+questionId+"','1')>"+"<i>+</i><i>加入作业</i></li>";
			removeQuestionHomework(questionId);
		}
		$("#"+questionId).html(htmlStr);
	}
	
	//作业添加题目
	function saveQuestionHomework(questionId){
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/work/workQuestion/list/save.htm?', 
		    data:{'homeworkId':${homeworkId!''},'questionId':questionId}, 
		    success:function(data){  
		    	
		    }  
	 	});
	}
	
	//作业删除题目
	function removeQuestionHomework(questionId){
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/work/workQuestion/listbysearch/delete.htm?', 
		    data:{'homeworkId':${homeworkId!''},'questionId':questionId}, 
		    success:function(data){  
		    	
		    }  
	 	});
	}
	
	//查询作业中是否有题目
	function homework_question(){
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/work/workQuestion/listbysearch.htm?', 
		    data:{'homeworkId':${homeworkId!''},'delflag':'0'}, 
		    success:function(data){  
		    	if(data!=null && data!=""){
		    		var Curedata = $.extend(true, [], data);
		    		$('#qtnNum').html(Curedata.length);
		    		popup(2);
		    		//alert('你已经添加'+Curedata.length+'道题目，是否生成作业？');
		    	}else{
		    		alert('您还没有添加题目！');
		    	}
		    }  
	 	});
	}
	
	//生成预览作业
	function goviewQuestion(){
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/work/homework/listbyid/update.htm?', 
		    data:{'id':${homeworkId},'delflag':"0"}, 
		    async: false,
		    success:function(data){  
		    	var url = "${basePath!''}/work/homework/view.htm?";
				var data = "id="+${homeworkId};
				window.location.href=url+data;
		    }  
	 	});
	}
</script>



</body>
</html>
