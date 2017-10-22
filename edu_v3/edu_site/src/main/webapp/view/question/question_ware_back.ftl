<!DOCTYPE html>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>题库中心</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="-1">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/tiku.css">
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
			
			<#include '/common/left.ftl' /> 
			
			<div class="belongToLib_choice middle fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>题库管理</h3>
					</div>
				</div>
				<ul class=" paper_list clearfix ">
					<!--	1考试题库,2作业题库,3錨题库,4种子题库, 5个人题库（教师题库）,6专家题库 （新题库）-->
					<@security.authorize url="/question/ware/5/list.htm">
					<li belongToLib="5" <#if search.belongToLib == '5'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/ware/5/list.htm'">我的题库</li>
					</@security.authorize>
					<@security.authorize url="/question/ware/1/list.htm">
					<li belongToLib="1" <#if search.belongToLib == '1'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/ware/1/list.htm'">考试题库</li>
					</@security.authorize>
					<@security.authorize url="/question/ware/2/list.htm">
					<li belongToLib="2" <#if search.belongToLib == '2'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/ware/2/list.htm'">作业题库</li>
					</@security.authorize>
					<@security.authorize url="/question/ware/3/list.htm">
					<li belongToLib="3" <#if search.belongToLib == '3'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/ware/3/list.htm'">锚题库</li>
					</@security.authorize>
					<@security.authorize url="/question/ware/4/list.htm">
					<li belongToLib="4" <#if search.belongToLib == '4'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/ware/4/list.htm'">种子题库</li>
					</@security.authorize>
					<@security.authorize url="/question/ware/6/list.htm">
					<li belongToLib="6" <#if search.belongToLib == '6'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/ware/6/list.htm'">专家题库</li>
					</@security.authorize>
					<@security.authorize url="/question/ware/7/list.htm">
					<li belongToLib="7" <#if search.belongToLib == '7'> class="active"</#if>  onClick="javascript:  location.href = '${basePath!''}/question/ware/7/list.htm'">自适应题库</li>
					</@security.authorize>
				</ul>

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
						<span class="fl">学段：</span>
						<ul class="clearfix fl">
						
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
										<li   onClick="search_question_ware('subject',${bsv.id!''})"  subject_id="${bsv.id!''}" <#if bsv.id == search.subjectId> class="active"</#if>>${bsv.name!''}</li>
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
						<button onClick="javascript:window.location.href='${basePath!''}/question/statistics/list.htm'"> <i>+</i> 试题统计</button>
						<@security.authorize url="/question/check/allocation/list.htm">
						<button onClick="javascript:window.location.href='${basePath!''}/question/check/allocation/list.htm'"> <i>+</i> 试题审核分配</button>
						</@security.authorize>
						<@security.authorize url="/question/check/list.htm">
						<button onClick="javascript:window.location.href='${basePath!''}/question/check/list.htm'"> <i>+</i> 试题审核</button>
						</@security.authorize>
						<@security.authorize url="/question/ware/save/page.htm">
						<button onClick="javascript:window.location.href='${basePath!''}/question/ware/save/page.htm'"> <i>+</i> 我要命题</button>
						</@security.authorize>
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
					
					<div class="item" id="question_item_${qw.id!''}">
						<!-- 问题 -->
						<div class="question"> 
							<#if qw.qcd??>${qw.qcd.title!''}</#if>
							<#if qw.qcd??>${qw.qcd.content!''}</#if>
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
										<#if qw.qtv??>
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
										    <p><span>【答案】<#if av.answerValue??><#list av.answerValue?split("|") as av><#if av=='0'>×<#else>√</#if></#list></#if></span><p>
										</#if>
										<p><span>【解析】${av.answerDescription!''}</p>
										</#if>
									</div>
								</div>
							</#list>
						</#if>
						
						<div class="who clearfix">
							<p class="fl">命题人：${qw.createName!''} &nbsp;&nbsp;编号：${qw.id!''} &nbsp;&nbsp;<#if qw.knowledgeNames?? && qw.knowledgeNames?size != 0>知识点：<#list qw.knowledgeNames as kn>${kn!''}&nbsp;</#list></#if></p>
							<span class="fr">组卷次数：<i><b>${qw.testTimes!''}</b></i>次</span>
						</div>

						<div class="operation clearfix">
							<p class="fl"><span>难度:${qw.difficulty!''}</span><#if qw.qtv??><span>题型:${qw.qtv.typeName!''}</span></#if><#if qw.modTime??><span>更新:${qw.modTime?string("yyyy-MM-dd HH:mm:ss")}</span></#if></p>
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
								
								<@security.authorize url="/question/collect/list/save.htm">
								<#if isCollect == '0'>
									<li  id="question_collect_li_${qw.id!''}"  onClick="collect_question(${qw.id!''})"><img src="${basePath!''}/images/收藏.png"><i>收藏</i></li>	
								<#else>
									<li><img src="${basePath!''}/images/已收藏.png"><i>已收藏</i></li>
								</#if>
								</@security.authorize>
								
								<#assign isExport='0'>
								<#if eids?? && eids?size != 0>
									<#list eids as id>
										<#if id == qw.id>
											<#assign isExport='1'>
										</#if>
									</#list>
								</#if>
								
								<@security.authorize url="/question/ware/modify/page.htm">
								<#if qw.createName!='格灵' && qw.testTimes ==0>
									<li onClick="javascript:location.href = '${basePath!''}/question/ware/modify/page.htm?id=${qw.id!''}'"><img src="${basePath!''}/images/编辑.png"><i>编辑</i></li>
								</#if>
								</@security.authorize>
								
								<@security.authorize url="/question/ware/listbyid/delete.htm">
								<#if qw.testTimes ==0>
									<li onClick="delete_question(${qw.id!''})"><img src="${basePath!''}/images/删除.png"><i>删除</i></li>
								</#if>
								</@security.authorize>
								
								<#if isExport == '0'>
									<li id="question_export_li_${qw.id!''}"><span onClick="addQuestionExportCookie(${qw.id!''},'<#if qw.qtv??>${qw.qtv.typeName!''}</#if>')">选题导出</span></li>
								<#else>
									<li id="question_export_li_${qw.id!''}"><span style="color:#000" onClick="deleteQuestionExportCookieById(${qw.id!''},'${qw.qtv.typeName!''}')">移除导出</span></li>
								</#if>
								
								
								<#--
								<li><i class="iconfont"  onClick="addQuestionExportCookie(${qw.id!''},'${qw.qtv.typeName!''}')">&#xe6df;</i> <span>选题</span></li>
								<li class="remove_li"> <i class="iconfont">&#xe699;</i> <span>移除</span></li>
								-->
								
								<#--
								
								<li><img src="${basePath!''}/images/编辑.png"><i>编辑</i></li>
								
								
								-->
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
			<!-- 右侧边栏 -->
			<div class="content_right fr">
				<!--
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

					<ul class="ztree ztree_knowledge" id="treeNode_knowledge" style="height: 600px;width:190px;display:<#if search.knowledgeId??>block<#else><#if search.catalogDetailId??>none<#else>block</#if></#if>"></ul>
					<ul class="ztree ztree_chapter" id="treeNode_chapter"  style="height: 600px;width:190px;display:<#if search.catalogDetailId??>block<#else>none</#if>"></ul>
				</div>
			</div>

		</div>
	</div>

	<div class="side_basket basket_active">
		<div class="fl bar_title">
			<p class="title_name"><i class="lanzi"></i><span>试题导出</span></p>
			<div class="arr"><i></i></div>
		</div>
		<div class="fr right_content">
			<h3 class="count_total">共计：（<span id="questoin_export_count">0</span>）道题</h3>
			<ul class="sub_list" id="question_export_cookie_ul">
			
				<li>加载中...</li>
				<!--
				<li class="clearfix">单选题：<span>6</span> 道<i></i></li>
				<li class="clearfix">多选题：<span>6</span> 道<i></i></li>
				<li class="clearfix">判断题：<span>6</span> 道<i></i></li>
				<li class="clearfix">填空题：<span>6</span> 道<i></i></li>
				<li class="clearfix">计算题：<span>6</span> 道<i></i></li>
				<li class="clearfix">综合题：<span>6</span> 道<i></i></li>
				<li class="clearfix">应用题：<span>6</span> 道<i></i></li>
				<li class="clearfix">单选题：<span>6</span> 道<i></i></li>
				<li class="clearfix">多选题：<span>6</span> 道<i></i></li>
				<li class="clearfix">判断题：<span>6</span> 道<i></i></li>
				<li class="clearfix">填空题：<span>6</span> 道<i></i></li>
				<li class="clearfix">计算题：<span>6</span> 道<i></i></li>
				<li class="clearfix">综合题：<span>6</span> 道<i></i></li>
				<li class="clearfix">应用题：<span>6</span> 道<i></i></li>
				-->
			</ul>
			<@security.authorize url="/question/ware/batch/export.htm">
			<button class="create_success"  onClick="export_question()">一键导出</button>
			</@security.authorize>
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
		//右侧篮子
		$('.arr').click(function(){
			var box = $('.side_basket')
			var right_distant = parseInt(box.css('right'));
		
			if(right_distant == 0){
				box.animate({right:'-150'})
			}else{
				box.animate({right:'-0'})
			}
		})

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

		
		loadknowledge();
		loadCatalogDetail();
		loadQuestionExportCookie();

	})

	
	
	function collect_question(questionId){
		
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/question/collect/list/save.htm', 
		    data:{'questionId':questionId}, 
		    success:function(data){  
		    	if(data==1){
		    		$('#question_collect_li_'+questionId).empty();
		    		$('#question_collect_li_'+questionId).append("<img src='${basePath!''}/images/已收藏.png'><i>已收藏</i>");
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
		    		$('#question_item_'+questionId).remove();
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
	      },
		    error: function(xhr,status,error) { 
		       if(error=='Forbidden'){
		       		alert('[加载知识点]权限不足');
		       }else{
		       		alert('系统出错!');
		       }
			} 
    	});  
	
	}
	
	//加载课本章节
	function loadCatalogDetail(){
	
		var stageId = $('.stage_choice ul li.active').attr('stage_id');
		var gradeId = $('.grade_choice ul li.active').attr('grade_id');
		var subjectId  = $('.subject_choice ul li.active').attr('subject_id');
	
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/catalogDetail/treelistbysearch.htm',  
          data:{'gradeId':gradeId,'stageId':stageId,'subjectId':subjectId,'id':$('#catalogDetailId').val(),'versionId':$('#versionId').val()},
          success:function(data){  
        	  loadCatalogDetailTree(data);                    
          }  ,
		    error: function(xhr,status,error) { 
		       if(error=='Forbidden'){
		       		alert('[加载课本章节]权限不足');
		       }else{
		       		alert('系统出错!');
		       }
			} 
    	});  
	
	}
	
	
	//加载待导出的试题信息
	function loadQuestionExportCookie(){
	
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/ware/export/get.htm?timer='+ new Date().getTime(),  
          success:function(data){  
          
      	  	var html = "";
      	  	var isExist = "0";
      	  	var count = 0;
      	  	
      	  	
		    for(var key in data){ 
		    	html += "<li class='clearfix'>"+key+"：<span>"+data[key]+"</span> 道<i onClick=\"deleteQuestionExportCookieByTypeName('"+key+"')\"></i></li>";
		    	count += parseInt(data[key]);
		    	isExist = "1";
		    } 
		    
		    $('#question_export_cookie_ul').empty();
		    if(isExist=='1'){
		   		$('#question_export_cookie_ul').append(html);
		    }else{
		    	$('#question_export_cookie_ul').append("<li style='color:red;font-size:12px;'>暂无导出的试题信息</li>");
		    	
		    }
		    $('#questoin_export_count').html(count);
			    
          },
		  error: function(xhr,status,error) { 
		       if(error=='Forbidden'){
		       		alert('[加载待导出的试题信息]权限不足');
		       }else{
		       		alert('加载待导出的试题信息系统出错!');
		       }
			} 
    	});  
		
	
	}
	
	
	// 增加到待导出队列中
	function addQuestionExportCookie(id,typeName){
	
		if(parseInt($('#questoin_export_count').html()) > 101){
			alert('每次最多只能同时导出100道试题！');
			return;
		}
	
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/ware/export/add.htm?timer='+ new Date().getTime(),  
          data:{'id':id,'typeName':typeName},
          success:function(data){  
          
      	  		if(data == 1){
      	  		
      	  			loadQuestionExportCookie();
      	  			
      	  			$('#question_export_li_'+id).empty();
      	  			$('#question_export_li_'+id).append("<span style='color:#000' onClick=\"deleteQuestionExportCookieById("+id+",'"+typeName+"')\">移除导出</span>");
								
								
      	  		}else{
      	  			alert('添加失败');
      	  		}
			    
          },
		  error: function(xhr,status,error) { 
		       if(error=='Forbidden'){
		       		alert('[添加导出]权限不足');
		       }else{
		       		alert('添加导出系统出错!');
		       }
			} 
    	});  
		
	}
	
	// 根据删除题型名称删除
	function deleteQuestionExportCookieByTypeName(typeName){
		
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/ware/name/delete.htm?timer='+ new Date().getTime(),  
          data:{'typeName':typeName},
          success:function(data){  
          
      	  		if(data == 1){
      	  			window.location.reload();
      	  		}else{
      	  			alert('删除失败');
      	  		}
			    
          },
		  error: function(xhr,status,error) { 
		       if(error=='Forbidden'){
		       		alert('[删除]权限不足');
		       }else{
		       		alert('删除失败,系统出错!');
		       }
			} 
    	});  
		
	}

	// 根据试题id删除
	function deleteQuestionExportCookieById(id,typeName){
		
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/ware/id/delete.htm?timer='+ new Date().getTime(),  
          data:{'id':id},
          success:function(data){  
          
      	  		if(data == 1){
      	  			loadQuestionExportCookie();
      	  			
      	  			$('#question_export_li_'+id).empty();
      	  			$('#question_export_li_'+id).append("<span onClick=\"addQuestionExportCookie("+id+",'"+typeName+"')\">选题导出</span>");
								
      	  		}else{
      	  			alert('删除失败');
      	  		}
			    
          },
		  error: function(xhr,status,error) { 
		       if(error=='Forbidden'){
		       		alert('[删除]权限不足');
		       }else{
		       		alert('删除失败,系统出错!');
		       }
			} 
    	});  
		
	}
	
	function export_question(){
	
		 location.href = '${basePath!''}/question/ware/batch/export.htm';
		 
		 
		 setTimeout(clean_question_export, 2000);  
		
	
	}
	
	function clean_question_export(){
	
	 	$.ajax({  
          type:'get',  
          url:'${basePath!''}/question/ware/export/clean.htm',  
          success:function(data){  
          
      	  		if(data == 1){
      	  			window.location.reload();
      	  		}else{
      	  			alert('清除失败');
      	  		}
			    
          },
		  error: function(xhr,status,error) { 
		       if(error=='Forbidden'){
		       		alert('[清除]权限不足');
		       }else{
		       		alert('清除失败,系统出错!');
		       }
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
		
		var url = "${basePath!''}/question/ware/"+$('#belongToLib').val()+"/list.htm?";
		var data = "";
		
		
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
</script>



</body>
</html>
