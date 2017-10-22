<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>题库-新增题目</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/wy_mingti.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/zTreeStyle/zTreeStyle.css">
</head>
<body>
<!-- 操作类型0新建1编辑 -->
<input type="hidden" id="flag" <#if vo??>value="1"<#else>value="0"</#if>>
<#if vo??>
<input type="hidden" id="grade_id" value="${vo.gradeId!''}"/>
<input type="hidden" id="subject_id" value="${vo.subjectId!''}"/>
<input type="hidden" id="type_id" value="${vo.typeId!''}"/>
<input type="hidden" id="difficulty" value="${(100-vo.difficulty*100)}"/>
<input type="hidden" id="questionId" value="${vo.id!''}"/>
<input type="hidden" id="questionAnswerId" value="<#if vo??> <#list vo.avs as av> <#if av_index ==0>${av.id!""}</#if></#list></#if>"/>
</#if>
<!-- 引入公共头部 -->


<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>题库><#if vo??>编辑题目<#else>新增题目</#if></h3>
					</div>
					<p class="back fr" onClick="javascript :history.back(-1);">返回上级</p>
				</div>
				
				<div class="step">
					<ul class="clearfix">
						<li class="active one" tab='0'>试题基础信息</li>
						<li class="two" tab='1'>试题内容</li>
						<li class="three" tab='2'>试题答案与解析</li>
					</ul>
				</div>

				<div class="add_topic">
					<div class="contain_prev_next">
						<!-- 试题基础信息 -->
						<div class="tab_one">
							<div class="topic_detail clearfix">
								<div class="jc_xd clearfix">
									<label>
										<span class="jcbb">教材版本：</span>
										<select id="version_select"  disabled="true" style="background-color: rgba(62, 50, 33, 0.22);">
											<#if bVersionVos?? && bVersionVos?size != 0>
											<#list bVersionVos as bvv>
												<option value="${bvv.id!''}">${bvv.name!''}</option>
											</#list>
											</#if>
										</select>
									</label>
									<label>
										<span>学段：</span>
										<select  id="stage_select">
											 <#list bStageVos as bsv>
											 	 <option <#if vo??><#if vo.stageId==bsv.id> selected="selected" </#if></#if> value ="${bsv.id!''}">${bsv.name!''}</option>
											 </#list>
										</select>
									</label>
									
								</div>

								<div class="nj_xk clearfix">
									<label>
										<span>年级/册：</span>
										<select id="grade_select">
											<option>正在加载中...</option>
										</select>
									</label>
									<label>
										<span>学科：</span>
										<select id="subject_select">
											<option>正在加载中...</option>
										</select>
									</label>
									<label>
										<span class="q_type">题型：</span>
										<select  id="question_type_select">
											<option>正在加载中...</option>
										</select>
									</label>
									
								</div>
								
								<div class="tx_nl clearfix">
									<label>
										<span>能力目标：</span>
										<select name="" id="bloomTaxonomy">
											<option value="1" <#if vo??><#if vo.bloomTaxonomy=='1'>selected="selected"</#if></#if>>知道</option>
											<option value="2" <#if vo??><#if vo.bloomTaxonomy=='2'>selected="selected"</#if></#if>>领会</option>
											<option value="3" <#if vo??><#if vo.bloomTaxonomy=='3'>selected="selected"</#if></#if>>应用</option>
											<option value="4" <#if vo??><#if vo.bloomTaxonomy=='4'>selected="selected"</#if></#if>>分析</option>
											<option value="5" <#if vo??><#if vo.bloomTaxonomy=='5'>selected="selected"</#if></#if>>综合</option>
											<option value="6" <#if vo??><#if vo.bloomTaxonomy=='6'>selected="selected"</#if></#if>>评价</option>
										</select>
									</label>
									<label>
										<span class="score">参考分值：</span>
										<input type="text" name="estimateValue" id="estimateValue" <#if vo??>value="${vo.estimateValue!''}"</#if>  onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
									</label>
									<label>
										<span class="fl">难度：</span>
										<div class="easy_hard fl clearfix" style="padding-left: 5px;" id="difficulty">
											<span>较易</span>
											<div class="drag-step" data-step="<#if vo??>${100-vo.difficulty*100}<#else>1</#if>" id="q_drag">
								                <div class="value" id="drag-step-value"><#if vo??>${vo.difficulty!''}<#else>1</#if></div>
								                <div class="top"></div>
								                <div class="bottom"></div>
								                <div class="ball"></div>
								            </div>
											<span>较难</span>
										</div>
									</label>
									
								</div>
		
								<div class="zsd_zj clearfix">
									<label>
										<span class="fl">知识点：</span>
										<ul class="ztree fl" id="treeNode_knowledge" style="padding-top:15px; width: 212px"></ul>
									</label>
									<label>
										<span class="fl">章节：</span>
										<ul class="ztree fl" id="treeNode_chapter" style="padding-top:15px;  width: 212px  "></ul>
									</label>
								</div>
							</div>
						</div>
						
						<!-- 试题内容 -->
						<div class="tab_one" style="display: none">
						
						
							<div class="answer clearfix span_90" >
								<span class="fl">标题：</span>
								<script class="fl" type="text/plain" name='title' id="title"><#if vo??>${vo.qcd.title!''}</#if></script>
							</div>
							
							<div class="answer clearfix span_90">
								<span class="fl">内容：</span>
								<script class="fl" type="text/plain" name='content' id="content"><#if vo??>${vo.qcd.content!''}</#if></script>
							</div>
							
							<!--
							<div class="topic clearfix">
								<span class="fl">题目：</span>
								<div class="topic_containter fl">
									<label class="fl"><input type="radio" name="ques"></label>
									<div class="bd_one ue-after" index='0'>输入题目</div>
									<div class="edit_contain fl clearfix" style="display: none">
										<div class="edit eidt_width fl clearfix" id="edit0">
											<script type="text/plain" name='content' id="ue_edit0" class="ques-hl"></script>
										</div>
										<button class="edit_finish">编辑完毕</button>
									</div>
								</div>
							</div>
							-->
							<div class="topic clearfix topic_content" id="topic_content_div">
								<span class="fl">选项：</span>
								<div class="selects fl">
								<#if vo??>
									<#-- 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题   -->
									<#if vo.qtv.markingCode=='1' || vo.qtv.markingCode=='2'>
										<#list vo.qods as qod>
											<div class="ans clearfix">
												<div class="bd_one fl ue-after" index='${qod_index!''}'>输入选项</div>
												<div class="edit_contain fl clearfix" style="display: none">
													<div class="edit eidt_width fl clearfix" id="edit${qod_index!''}">
														<script type="text/plain" name='content' id="ue_edit${qod_index!''}" class="ques-hl">${qod.content!''}</script>
													</div>
													<button class="edit_finish">编辑完毕</button>
												</div>
											</div>
										</#list>
									</#if>
								<#else>
									<div class="ans clearfix">
										<div class="bd_one fl ue-after" index='0'>输入选项</div>
										<div class="edit_contain fl clearfix" style="display: none">
											<div class="edit eidt_width fl clearfix" id="edit0">
												<script type="text/plain" name='content' id="ue_edit0" class="ques-hl"></script>
											</div>
											<button class="edit_finish">编辑完毕</button>
										</div>
									</div>
									<div class="ans clearfix">
										<div class="bd_one fl ue-after" index='1'>输入选项</div>
										<div class="edit_contain fl clearfix" style="display: none">
											<div class="edit eidt_width fl clearfix" id="edit1">
												<script type="text/plain" name='content' id="ue_edit1" class="ques-hl"></script>
											</div>
											<button class="edit_finish">编辑完毕</button>
										</div>
									</div>
									<div class="ans clearfix">
										<div class="bd_one fl ue-after" index='2'>输入选项</div>
										<div class="edit_contain fl clearfix" style="display: none">
											<div class="edit eidt_width fl clearfix" id="edit2">
												<script type="text/plain" name='content' id="ue_edit2" class="ques-hl"></script>
											</div>
											<button class="edit_finish">编辑完毕</button>
										</div>
									</div>
									<div class="ans clearfix">
										<div class="bd_one fl ue-after" index='3'>输入选项</div>
										<div class="edit_contain fl clearfix" style="display: none">
											<div class="edit eidt_width fl clearfix" id="edit3">
												<script type="text/plain" name='content' id="ue_edit3" class="ques-hl"></script>
											</div>
											<button class="edit_finish">编辑完毕</button>
										</div>
									</div>
								</#if>
								</div>
								<div class="add_reduce clearfix">
									<button class="add fr">添加选项</button>
									<button class="reduce fr">减少选项</button>
								</div>
							</div>
							
						</div>

						<!-- 答案与解析 -->
						<div class="tab_one ans_exp" style="display: none">
							<p class="tips">注：请选择正确答案</p>
							<div id = "choice_answer_div" class="clearfix">
								<span class="fl">&nbsp;</span>
								<div class="choice_answer_div fl"></div>
							</div>
							<div class="answer clearfix" id="answer_div">
								<span class="fl">答案：</span>
								<script class="fl" type="text/plain" name='answer' id="answer"><#if vo??> <#list vo.avs as av> <#if av_index ==0>${av.answerValue!""}</#if></#list></#if></script>
							</div>
							<div class="answer clearfix">
								<span class="fl">解析：</span>
								<script class="fl" type="text/plain" name='description' id="description"><#if vo??> <#list vo.avs as av> <#if av_index ==0>${av.answerDescription!""}</#if></#list></#if></script>
							</div>
						</div>
					</div>

					<div class="nert_prev">
						<button class="prev">上一步</button>
						<button class="next">下一步</button>
						<#if vo??>
						<button class="commit"  onclick="modify_question_function()" id="submit_button">修改</button>
						<#else>
						<button class="commit"  onclick="sub_question_function()" id="submit_button">提交</button>
						</#if>
					</div>
					
				</div>
				
			</div>
		</div>
	</div>

	<div class="edit_contain" style="display: none">
		<div class="edit eidt_width fl clearfix" id="edit">
			<script type="text/plain" name='content' id="ue_edit" class="ques-hl"></script>
			<button class="edit_finish">编辑完毕</button>
		</div>
	</div>

	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>

<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/ball.js"></script>
<script src="${basePath!''}/js/jquery.ztree.all.min.js"></script>
<script src="${basePath!''}/js/UE/ueditor.config.js"></script>
<script src="${basePath!''}/js/UE/ueditor.all.js"></script>

<script type="text/javascript">
	$(function(){
	
		loading_grade();
		loading_subject();
		loading_question_type();
		loadknowledge();
		loadCatalogDetail();
		showQuestionDiv();

		// 插入编辑器
		$('body').on('click','.bd_one',function(){
			var index = $(this).attr('index');
			$('.edit_contain').hide();
			$(this).next($('.edit_contain')).show();
            var ue = UE.getEditor('ue_edit' + index);

            //编辑完成
			$('body').on('click','.edit_finish',function(){
				var content = ue.getContent();
				if(content.length ==0){
					alert('问题不能为空')
				}else{
					var show_ques = $(this).parent().prev('.ue-after');
					show_ques.addClass('active').html('编辑完成');
					$(this).parent().hide();
				}
			})
		})
		

		//减少选项
		$('.add_reduce .reduce').on('click',function(){
			$('.ans').last().remove();
		})
		
		//添加选项
		$('.add_reduce .add').on('click',function(){
			var now_index = parseInt($('.selects').children('.ans').last().find('.bd_one').attr('index'))+ 1;
			var html = '<div class="ans clearfix">' + 
							'<div class="bd_one fl ue-after" index=' + now_index + '>输入问题</div>' +
							'<div class="edit_contain fl clearfix" style="display: none">' + 
								'<div class="edit eidt_width fl clearfix" id=edit' + now_index +'>' + 
									'<script type="text/plain" name="content" id="ue_edit' + now_index +'"class="ques-hl"></sc' + 'ript>' + 
								'</div>' + 
								'<button class="edit_finish">编辑完毕</button>' + 
							'</div>'+
						'</div>'

			$('.selects').append(html);
		})
		
		var content = UE.getEditor('title');
		var content = UE.getEditor('content');
		var answer = UE.getEditor('answer');
		var description = UE.getEditor('description');
		
		//拖动小球函数		
		drag_step('q_drag', $('#difficulty').val(), function (value) {
            $('#q_drag').find('.value').html((100 - value) / 100)
			//return value / 100;
        })

        //点击下一步
        var index = 0;
        var next = $('.nert_prev .next'),
        commit = $('.nert_prev .commit'),
        prev = $('.nert_prev .prev')
        show_hide();
        next.on('click',function(){
        	if(index>2){
        		return false;
        	}else{
        		index++;
        		$('.tab_one').eq(index).show().siblings().hide();
        		$('.step li').addClass('active').eq(index+1).removeClass('active');
        		show_hide();

        		if(index==2){
        			var all_msg = $('.bd_one');
        			var contain = $('.choice_answer_div');
        			contain.empty();
        			
        			var marking_code = $('#question_type_select').find("option:selected").attr('marking_code');
        			
        			// 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题  
        			// 单选题
        			if(marking_code == 1){
        				
        				$.each(all_msg,function(idx,item){
	        				console.log(idx);
	        				var indexs = UE.getEditor('ue_edit' + idx);
	    					var content1 = "<div class='clearfix'><label class='fl'><input type='radio' name='ans_exp' value='"+ indexs.getContent() +"'></label> <div class='fl width_80'>" + indexs.getContent() + '</div></div>';
	    					contain.append(content1);
	        			})
        			
        			}
        			
        			// 多选题
        			if(marking_code == 2){
        				
        				$.each(all_msg,function(idx,item){
	        				console.log(idx);
	        				var indexs = UE.getEditor('ue_edit' + idx);
	    					var content1 = "<div class='clearfix'><label class='fl'><input type='checkbox' name='ans_exp' value='"+ indexs.getContent() +"'></label> <div class='fl width_80'>" + indexs.getContent() + '</div></div>';
	    					contain.append(content1);
	        			})
        			
        			}
        			
        			// 判断题
        			if(marking_code == 5){
        				var content = UE.getEditor('content');
        				contain.append("<div class='clearfix'><label class='fl'><input type='checkbox' name='ans_exp' value='"+ content.getContent() +"'></label> <div class='fl width_80'>" + content.getContent() + '</div></div>');
        			
        			}
        			
        		}

        	}

        })

        prev.on('click',function(){
        	if(index<1){
        		return false;
        	}else{
        		index--;
        		// console.log(index)
        		$('.tab_one').eq(index).show().siblings().hide();
        		$('.step li').eq(index+1).removeClass('active');
        		show_hide();
        	}

        })

        function show_hide(){
        	if(index==0){
	        	next.show().siblings().hide();
	        }else if(index == 1){
	        	commit.hide().siblings().show();
	        }else if(index == 2){
	        	next.hide().siblings().show();
	        }
        }

		
		//通过学段获取学科信息，年级/册信息
		$("select#stage_select").change(function(){

		 	loading_grade();
		 	loading_subject();
		 	loading_question_type();
		 	loadknowledge();
		 	loadCatalogDetail();
		 	
		});
		
		
		$("select#grade_select").change(function(){

		 	loadknowledge();
		 	loadCatalogDetail();
		 	
		});
		
		
		$("select#subject_select").change(function(){

		 	loading_question_type();
		 	loadknowledge();
		 	loadCatalogDetail();
		 	
		});
		
		
		$("select#version_select").change(function(){

		 	loadCatalogDetail();
		 	
		});
		
		// 能过题库确实命题内容格式
		$("select#question_type_select").change(function(){
		 	showQuestionDiv();
		});
		
		
		// 加载年级/册
		function loading_grade(){
			
		 	$.ajax({  
				type:'get',  
			    url:'${basePath!''}/base/grade/listbystageid.htm', 
			    async: false,
			    data:{'stageId':$('#stage_select').val()}, 
			    success:function(data){  
			    	var grade_html = "";
			    	
			    	if($('#flag').val()=='0'){
			    	
				    	for(var i = 0;i<data.length;i++){
				    		grade_html += '<option value="'+ data[i].id+'">'+data[i].name+'</option>';
				    	}
				    	
			    	}else{
			    	
			    		for(var i = 0;i<data.length;i++){
			    			if($('#grade_id').val()==data[i].id){
				    			grade_html += '<option selected="selected"  value="'+ data[i].id+'">'+data[i].name+'</option>';
				    		}else{
				    			grade_html += '<option  value="'+ data[i].id+'">'+data[i].name+'</option>';
				    		}
				   
				    	}
				    	
			    	}
			    	$('#grade_select').html(grade_html);
			    }  
		 	});
		
		}
		
		//加载学科信息
		function loading_subject(){
		
			// 学科信息
			$.ajax({  
				type:'get',  
			    url:'${basePath!''}/base/subject/listbystageid.htm', 
			    async: false,
			    data:{'stageId':$('#stage_select').val()}, 
			    success:function(data){ 
			     
			    	var subject_html = "";
			    	
			    	if($('#flag').val()=='0'){
			    	
				    	for(var i = 0;i<data.length;i++){
				    		subject_html += '<option value="'+ data[i].id+'">'+data[i].name+'</option>';
				    	}
				    	
			    	}else{
			    	
			    		for(var i = 0;i<data.length;i++){
			    			if($('#subject_id').val()==data[i].id){
				    			subject_html += '<option selected="selected"  value="'+ data[i].id+'">'+data[i].name+'</option>';
				    		}else{
				    			subject_html += '<option  value="'+ data[i].id+'">'+data[i].name+'</option>';
				    		}
				   
				    	}
				    	
			    	}
			    	
			    	$('#subject_select').html(subject_html);
			    }  
		 	});
		 	
		}
		
		function loading_question_type(){
		
			// 题型信息
			$.ajax({  
				type:'get',  
			    url:'${basePath!''}/question/type/listbysubjectid.htm', 
			    async: false,
			    data:{'subjectId':$('#subject_select').val()}, 
			    success:function(data){  
			    	var question_type_html = "";
			    	
			    	if($('#flag').val()=='0'){
			    	
				    	for(var i = 0;i<data.length;i++){
				    		question_type_html += '<option marking_code='+ data[i].markingCode+' value="'+ data[i].id+'">'+data[i].typeName+'</option>';
				    	}
				    	
			    	}else{
			    	
			    		for(var i = 0;i<data.length;i++){
			    			if($('#type_id').val()==data[i].id){
				    			question_type_html += '<option selected="selected" marking_code='+ data[i].markingCode+' value="'+ data[i].id+'">'+data[i].typeName+'</option>';
				    		}else{
				    			question_type_html += '<option marking_code='+ data[i].markingCode+' value="'+ data[i].id+'">'+data[i].typeName+'</option>';
				    		}
				   
				    	}
				    	
			    	}
			    	
			    	$('#question_type_select').html(question_type_html);
			    }  
		 	});
		
		}
		
		
		//加载知识点
		function loadknowledge(){
		
			
			$('#treeNode_knowledge').empty();
			$('#treeNode_knowledge').append('<li>加载中...</li>');
		
			$.ajax({  
	          type:'get',  
	          async: false,
	          url:'${basePath!''}/base/knowledge/treelistbysearch.htm',  
	          data:{'gradeId':$('#grade_select').val(),'stageId':$('#stage_select').val(),'subjectId':$('#subject_select').val(),'questionId':$('#questionId').val()},
	          success:function(data){ 
	           
	        	 if(data.length == 0){
	        	  	$('#treeNode_knowledge').empty();
					$('#treeNode_knowledge').append('<li style="color:red">对不起，暂查找不到知识点信息!</li>');
	        	  }else{
	        	  	 loadknowledgeTree(data);          
	        	  }      
	        	      
	          }  
	    	});  
		
		}
		
		
		//加载知识点
		function loadCatalogDetail(){
		
			$('#treeNode_chapter').empty();
			$('#treeNode_chapter').append('<li>加载中...</li>');
		
	
			var stageId = $('.stage_choice ul li.active').attr('stage_id');
			var gradeId = $('.grade_choice ul li.active').attr('grade_id');
			var subjectId  = $('.subject_choice ul li.active').attr('subject_id');
		
			$.ajax({  
	          type:'get',  
	          url:'${basePath!''}/base/catalogDetail/treelistbysearch.htm',  
	          data:{'gradeId':$('#grade_select').val(),'stageId':$('#stage_select').val(),'subjectId':$('#subject_select').val(),'versionId':$('#version_select').val(),'questionId':$('#questionId').val()},
	          success:function(data){  
	        	  
	        	  if(data.length == 0){
	        	  	$('#treeNode_chapter').empty();
					$('#treeNode_chapter').append('<li style="color:red">对不起，暂查找不到章节信息!</li>');
	        	  }else{
	        	  	 loadCatalogDetailTree(data);          
	        	  }                    
	          }  
	    	});  
		
		}
		
		
		function loadknowledgeTree(zNodes){
	
			//树形菜单
			var setting = {
				showLine: false, 
				checkable: true,
				check:{	
					enable:true,
					chkboxType:{'Y':'ps','N':'ps'}
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
				check:{	
					enable:true,
					chkboxType:{'Y':'ps','N':'ps'}
				}
			}
			
			var zTreeObj;
			zTreeObj = $.fn.zTree.init($("#treeNode_chapter"), setting, zNodes);	//初始化树
			
		}
		
	})
	
	
	
		
	// 提交试题信息		
	function sub_question_function(){
	
	
		var title = UE.getEditor('title');
		var content = UE.getEditor('content');
		var answer = UE.getEditor('answer');
		var description = UE.getEditor('description');
		
		
		if(!title.hasContents() && !content.hasContents()){
			alert('试题标题与内容必须至少有一个不为空！');
			return;
		} 
		
		
		var qs = new Array();
		var av;   //判断题专用(0.错  1.对)
		var isCheck = false;
		
		
		
		// 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题  
		var marking_code = $('#question_type_select').find("option:selected").attr('marking_code');
		
		if(marking_code == 1 || marking_code ==2){
		
			$("input[name='ans_exp']").each(function(i){
			
				if($(this).is(":checked")){
					qs.push({content: $(this).val(), is_answer: "1"});
					isCheck = true; 
		        }else{
		        	qs.push({content: $(this).val(), is_answer: "0"});
		        }
			   
			});
			
			if(!isCheck){
				alert('请选择正确的答案,再提交试题!');
				return;
			}
		
		}else if(marking_code == 5){
		
			$("input[name='ans_exp']").each(function(i){
				if($(this).is(":checked")){
					av = "1";
		        }else{
		        	av = "0";
		        }
			});
			
		}else{
		
			if(!answer.hasContents()){
				alert('答案不允许为空！');
			return;
			}
		
		}
		
		
		var treeKnowObj=$.fn.zTree.getZTreeObj("treeNode_knowledge");
    	knownodes=treeKnowObj.getCheckedNodes(true);
    	var know_ids = new Array();
    	
    	if(knownodes.length==0){
    		alert('请选中关联的知识点');
    		return;
    	}else{
	        for(var i=0;i<knownodes.length;i++){
		        know_ids.push(knownodes[i].id); //获取选中节点的值
			}
		}
		
		var treecatelogObj=$.fn.zTree.getZTreeObj("treeNode_chapter");
    	catelognodes=treecatelogObj.getCheckedNodes(true);
    	var catelog_ids = new Array();
    	
    	if(catelognodes.length==0){
    		alert('请选中关联的课本章节信息');
    		return;
    	}else{
	        for(var i=0;i<catelognodes.length;i++){
		        catelog_ids.push(catelognodes[i].id); //获取选中节点的值
			}
		}
	
	
		
		//修改按钮颜色，不允许重复提交--------------------------
		$('#submit_button').attr('disabled',"true");
	    $('#submit_button').text("正在提交中...");
	    $('#submit_button').css("background","#d9d9d9");
	    $('#submit_button').css("color","#000000");
	    $('#submit_button').css("font-weight","bold");
	    //-----------------------------------------------
		   
		$.ajax({  
				type:'post',  
			    url:'${basePath!''}/question/ware/list/save.htm', 
			    data:{
			    	'title':title.getContent(),                                             //试题标题
			    	'content':content.getContent(),                                         //试题内容
			    	'difficulty':(parseFloat($('#drag-step-value').html())).toFixed(2),     //试题难度值
			    	'bloomTaxonomy':$('#bloomTaxonomy').val(),                             //布鲁姆认知体系
			    	'estimateValue':$('#estimateValue').val(),                              //预估分值
			    	'subjectId':$('#subject_select').val(),                                 //学科id
			    	'gradeId':$('#grade_select').val(),         							//年级id
			    	'stageId':$('#stage_select').val(),          							//学段id
			    	'typeId':$('#question_type_select').val(),   							//题型id
			    	'answerValue':answer.getContent(),           							//答案
			    	'answerDescription':description.getContent(),							//答案解析
			    	'knowIds':know_ids,                          							//知识点ids
			    	'catelogIds':catelog_ids,                    							//课本章节ids
			    	'qs':JSON.stringify(qs),                     							//选择题选项
			    	'av':av,                                                                //判断题
			    }, 
			    success:function(data){  
			    	if(data == 1){
			    		window.location.href="${basePath!''}/question/ware/5/list.htm"; 
			    	}else{
			    		alert('命题失败！');
			    	}
			    }, 
				error:function(e) { 
					alert('命题失败，服务端出错了!');
				} 
		 	});
	
	}
	
	
	// 编辑试题信息		
	function modify_question_function(){
	
	
		var title = UE.getEditor('title');
		var content = UE.getEditor('content');
		var answer = UE.getEditor('answer');
		var description = UE.getEditor('description');
		
		
		if(!title.hasContents() && !content.hasContents()){
			alert('试题标题与内容必须至少有一个不为空！');
			return;
		} 
		
		
		var qs = new Array();
		var av;   //判断题专用(0.错  1.对)
		var isCheck = false;
		
		
		
		// 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题  
		var marking_code = $('#question_type_select').find("option:selected").attr('marking_code');
		
		if(marking_code == 1 || marking_code ==2){
		
			$("input[name='ans_exp']").each(function(i){
			
				if($(this).is(":checked")){
					qs.push({content: $(this).val(), is_answer: "1"});
					isCheck = true; 
		        }else{
		        	qs.push({content: $(this).val(), is_answer: "0"});
		        }
			   
			});
			
			if(!isCheck){
				alert('请选择正确的答案,再提交试题!');
				return;
			}
		
		}else if(marking_code == 5){
		
			$("input[name='ans_exp']").each(function(i){
				if($(this).is(":checked")){
					av = "1";
		        }else{
		        	av = "0";
		        }
			});
			
		}else{
		
			if(!answer.hasContents()){
				alert('答案不允许为空！');
			return;
			}
		
		}
		
		
		var treeKnowObj=$.fn.zTree.getZTreeObj("treeNode_knowledge");
    	knownodes=treeKnowObj.getCheckedNodes(true);
    	var know_ids = new Array();
    	
    	if(knownodes.length==0){
    		alert('请选中关联的知识点');
    		return;
    	}else{
	        for(var i=0;i<knownodes.length;i++){
		        know_ids.push(knownodes[i].id); //获取选中节点的值
			}
		}
		
		var treecatelogObj=$.fn.zTree.getZTreeObj("treeNode_chapter");
    	catelognodes=treecatelogObj.getCheckedNodes(true);
    	var catelog_ids = new Array();
    	
    	if(catelognodes.length==0){
    		alert('请选中关联的课本章节信息');
    		return;
    	}else{
	        for(var i=0;i<catelognodes.length;i++){
		        catelog_ids.push(catelognodes[i].id); //获取选中节点的值
			}
		}
	
	
		
		//修改按钮颜色，不允许重复提交--------------------------
		$('#submit_button').attr('disabled',"true");
	    $('#submit_button').text("正在修改中...");
	    $('#submit_button').css("background","#d9d9d9");
	    $('#submit_button').css("color","#000000");
	    $('#submit_button').css("font-weight","bold");
	    //-----------------------------------------------
		   
		$.ajax({  
				type:'post',  
			    url:'${basePath!''}/question/ware/list/modify.htm', 
			    data:{
			    	'questionId':$('#questionId').val(),                                    //试题id
			    	'questionAnswerId':$('#questionAnswerId').val(),                        //试题答案id
			    	'title':title.getContent(),                                             //试题标题
			    	'content':content.getContent(),                                         //试题内容
			    	'difficulty':(parseFloat($('#drag-step-value').html())).toFixed(2),     //试题难度值
			    	'bloomTaxonomy':$('#bloomTaxonomy').val(),                             //布鲁姆认知体系
			    	'estimateValue':$('#estimateValue').val(),                              //预估分值
			    	'subjectId':$('#subject_select').val(),                                 //学科id
			    	'gradeId':$('#grade_select').val(),         							//年级id
			    	'stageId':$('#stage_select').val(),          							//学段id
			    	'typeId':$('#question_type_select').val(),   							//题型id
			    	'answerValue':answer.getContent(),           							//答案
			    	'answerDescription':description.getContent(),							//答案解析
			    	'knowIds':know_ids,                          							//知识点ids
			    	'catelogIds':catelog_ids,                    							//课本章节ids
			    	'qs':JSON.stringify(qs),                     							//选择题选项
			    	'av':av,                                                                //判断题
			    }, 
			    success:function(data){  
			    	if(data == 1){
			    		window.location.href="${basePath!''}/question/ware/5/list.htm"; 
			    	}else{
			    		alert('命题失败！');
			    	}
			    }, 
				error:function(e) { 
					alert('命题失败，服务端出错了!');
				} 
		 	});
	
	}
	
	
	//根据题型展示操作div
	function showQuestionDiv(){
	
			// 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题  
			var marking_code = $('#question_type_select').find("option:selected").attr('marking_code');
			
			if(marking_code == 1 || marking_code ==2){
			
				$('#topic_content_div').show();
				$('#choice_answer_div').show();
				$('#answer_div').hide();
				$('#question_tips').html("请选择正确的答案！");
			
			}else if(marking_code == 5){
			
				$('#topic_content_div').hide();
				$('#choice_answer_div').show();
				$('#answer_div').hide();
				$('#question_tips').html("请对该试题进行判断，正确请勾选，错误则不勾选！");
				
			}else{
			
				$('#topic_content_div').hide();
				$('#choice_answer_div').hide();
				$('#answer_div').show();
				
			}
	
	}

</script>

</body>
</html>