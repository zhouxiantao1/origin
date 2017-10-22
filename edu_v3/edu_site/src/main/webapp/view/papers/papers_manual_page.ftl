<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>试卷管理-手工组卷</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/preview_paper.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/zTreeStyle/zTreeStyle.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/create_paper.css">
</head>
<body>
	<#include '/common/top.ftl' />
	<div class="content_contain">
		<div class="content">
			<div class="mid fl" id="sgzj">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>试卷管理>手工组卷</h3>
					</div>
					<p class="back fr"><a href="javascript:history.back(-1)">返回上级</a></p>
				</div>
				<div class="paper-title">
					<input type="text" placeholder="请输入试卷名称" id = "paperName" maxlength = "30">
				</div>
				<div class="paper-box">
					<div class="paper-item">
						<div class="paper-info">
							<p class="title">试卷信息</p>
							<div class="info-body">
								<div class="info-item type" id="js-exam-type-choose">
									<label>考试类型：</label>
									<#assign  keys=examTypeMap?keys/>
									  <#if keys??>
									  <#list keys as key> 
										  <#if key_index == 0>
											<span name = "examType" onclick ="examType(${key!''},this)" class="current">${examTypeMap["${key!''}"]}</span> 
										  <#else>
											<span name = "examType" onclick ="examType(${key!''},this)">${examTypeMap["${key!''}"]}</span> 
										  </#if>
									  </#list>
									  </#if>
									  <input id = "examType" type = "hidden" value ="${examType}"/>
								</div>
								<div class="info-item">
									<label>选择学段：</label>
									<select name="" id="stage_select">
									<#list baseStageVoList as baseStageVo>
									 <option value="${baseStageVo.id}">${baseStageVo.name}</option> 
									</#list>
									</select>
								</div>
								<div class="info-item">
									<label>选择年级：</label>
									<select name="" id="grade_select">
									<#list baseGradeVoList as baseGradeVo>
									 <option value="${baseGradeVo.id}">${baseGradeVo.name}</option> 
									</#list>
									</select>
								</div>
								<div class="info-item subject">
									<label>选择学科：</label>
									<select name="" id="subject_select" onchange = "subjectChange()">
									<#list baseSubjectVoList as baseSubjectVo>
									 <option value="${baseSubjectVo.id}">${baseSubjectVo.name}</option> 
									</#list>
									</select>
								</div>
								<div class="info-item">
		                            <label>考试时长：</label>
		                            <input type="text" placeholder="60" class="sub-json" id="testTime"
		                            onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"  
	    							onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'0')}else{this.value=this.value.replace(/\D/g,'')}"
		                            >
		                            <label>(分钟)</label>
	                        	</div>
							</div>
						</div>
					</div>
					<div class="paper-item">
						<div class="paper-manage">
							<p class="title">组卷设置</p>
							<div class="info-body1">
								<div class="info-item paper-hard">
									<label for="" class="fl">试卷难度：</label>
									<div class="easy_hard clearfix fl">
										<span>较易</span>
										<div class="drag-step" data-step="0" id="q_drag">
											<div class="value" id = "paperDifficulty">1</div>
											<div class="top"></div>
											<div class="bottom"></div>
											<div class="ball"></div>
										</div>
										<span>较难</span>
									</div>
									<div class="cl"></div>
								</div>
								<div class="info-item" id = "txsz">
									<div id = "txszdiv">
									<div style ="clear:both">题型设置：</div>
									<#list questionTypeVoList as questionTypeVo>
										<div class="info-item" style="float:left;width:200px;">
											<input isObjective = "${questionTypeVo.isObjective}" name="questionType" type="checkbox" value="${questionTypeVo.id}"/><span>${questionTypeVo.typeName}</span>
										</div>
									</#list>
									</div>
									<div id = "fsszdiv">
									<div style ="clear:both">每题分数设置：</div>
									<#list questionTypeVoList as questionTypeVo>
										<div class="info-item" style="float:left;width:200px;">
											<input type="text" value="1" disabled = "disabled"
											onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"  
											onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'0')}else{this.value=this.value.replace(/\D/g,'')}"
											>
										</div>
									</#list>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="operation" style="clear:both;margin:0 350px;">
						<button class="submit" onclick = "selectTopic(5,'','','xt','')">去题库里选题</button>
						<button class="cancel" onclick = "go_cancel()">取消</button>
					</div>
				</div>
			</div>
			
			<!--选题-->
			<div class="middle fl" id="xt" style="display:none;">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>试卷管理>试卷选题</h3>
					</div>
					<p class="back fr" onclick = "previewPaper()">预览试卷</p>
					<p class="back fr"><a href="${basePath!''}/papers/manual/list.htm">返回</a></p>
				</div>
				<div class="paper-info1">
					<div class="stage_choice clearfix">
						<span class="fl">类型：</span>
						<ul class="clearfix fl">
							<li class="active" onclick = "selectTopic(5,'',this,'tk','')">我的题库</li>
							<li onclick = "selectTopic(1,'',this,'tk','')">考试题库</li>
						</ul>
					</div>
					<div class="stage_choice clearfix">
						<span class="fl">题型：</span>
						<ul class="clearfix fl" id="txid">
						</ul>
					</div>
				</div>
				<div class="question-list" id = "xt_tmlb">
				</div>
			</div>
			<!-- 选题的右侧边栏 -->
			<div class="content_right fr" id="xtyc" style="display:none;">
				<div class="shaixuan">
					<p><i>教材版本:</i>
						<select name="" id = "version_select">
							<#list baseVersionVoList as baseVersionVo>
							 <option value="${baseVersionVo.id}">${baseVersionVo.name}</option> 
							</#list>
						</select>
					</p>
				</div>
				<div class="bk_gray">
					<p>
						<i>课本章节:</i>
						<ul class="ztree ztree_chapter" id="treeNode_chapter"  style="height: 600px;width:190px;"></ul>
					</p>
				</div>
			</div>
			
			<!--预览-->
			<div class="middle fl" id="sgzjyl" style="display:none;">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>试卷管理>预览试卷</h3>
					</div>
					<p class="back fr" onclick = "intelligenceSubmit()">保存试卷</p>
					<p class="back fr"><a href="#" onclick = "go_back()">返回</a></p>
				</div>
				<div class="paper-info1">
					<p class="title" id="yl_paperName"></p>
					<p>
						<span id = "yl_testTime">考试时间：分钟</span>
						<span id = "yl_totalScore">试卷总分：分</span>
						<span id = "yl_createName">命题人：</span>
						<span id = "yl_createTime">日期：</span>
					</p>
				</div>
				<div class="question-list" id = "yl_tmlb">
				</div>
			</div>
			<!-- 预览的右侧边栏 -->
			<div class="content_right fr" id="sgzjyc" style="display:none;">
				<div class="shaixuan">
					<p><i>学科</i><span id = "yl_subjectName"></span></p>
					<p><i>年级</i><span id = "yl_gradeName"></span></p>
					<p><i>教材版本</i><span id = "yl_versionName"></span></p>
				</div>
			</div>
		
		</div>
		<input id="roleType" type = "hidden" value = "${roleType}"/>
		<input id="catalogDetailId" type="hidden">
		<input id="questionType" type="hidden">
		<input id="belongToLib" type="hidden" value = "5">
		<input id="createName" type="hidden" value = "${createName}">
		<input id="totalScore" type="hidden">
		<input id="totalQuantity" type="hidden">
	</div>
</body>

<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/ball.js"></script>
<script src="${basePath!''}/js/jquery.ztree.all.min.js"></script>
<script src="${basePath!''}/js/UE/ueditor.config.js"></script>
<script src="${basePath!''}/js/UE/ueditor.all.js"></script>

 <script type="text/javascript">
 	var N = [  
                "零", "一", "二", "三", "四", "五", "六", "七", "八", "九"  
            ];  
    function convertToChinese(num){  
        var str = num.toString();  
        var len = num.toString().length;  
        var C_Num = [];  
        for(var i = 0; i < len; i++){  
            C_Num.push(N[str.charAt(i)]);  
        }  
        return C_Num.join('');  
    }  
 	
	function examType(obj,ob){
	 	$(ob).addClass("current");
	 	$(ob).siblings().removeClass(); 
	 	$("#examType").val(obj);
	} 

	//学段改变，重新获取学科、年级、题型、同步章节、课本章节
	$("select#stage_select").change(function(){
		// 学科信息
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/base/subject/listbystageid.htm', 
		    data:{'stageId':$(this).val()}, 
		    async: false,
		    success:function(data){  
		    	var subject_html = "";
		    	for(var i = 0;i<data.length;i++){
		    		subject_html += '<option value="'+ data[i].id+'">'+data[i].name+'</option>';
		    	}
		    	$('#subject_select').html(subject_html);
		    }  
	 	});
	 	// 年级信息
	 	$.ajax({  
			type:'get',  
		    url:'${basePath!''}/base/grade/listbystageid.htm', 
		    data:{'stageId':$(this).val()}, 
		    async: false,
		    success:function(data){  
		    	var grade_html = "";
		    	for(var i = 0;i<data.length;i++){
		    		grade_html += '<option value="'+ data[i].id+'">'+data[i].name+'</option>';
		    	}
		    	$('#grade_select').html(grade_html);
		    }  
	 	});
	 	subjectChange();
	});
	
	//学科改变，重新获取题型、同步章节、课本章节
	function subjectChange(){
	 	//题型信息
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/question/type/listbysearch.htm', 
		    data:{'subjectId':$('#subject_select').val()}, 
		    async: false,
		    success:function(data){  
		    	var question_type_html = "<div id = 'txszdiv'><div style ='clear:both'>题型设置：</div>";
		    	t1 = "";
		    	var question_fraction_html = "<div id = 'fsszdiv'><div style ='clear:both'>每题分数设置：</div>";
		    	t3 = "";
		    	for(var i = 0;i<data.length;i++){
		    		t1+='<div class="info-item" style="float:left;width:200px;"><input isObjective = "'+data[i].isObjective+'" name="questionType" type="checkbox" value="'+data[i].id+'"/><span>'+data[i].typeName+'</span></div>';
		    		t3+='<div class="info-item" style="float:left;width:200px;"><input disabled = "disabled" type="text" value="1"'+
		    		'onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,\'\')}else{this.value=this.value.replace(/\\D/g,\'\')}"'+ 
    									'onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,\'0\')}else{this.value=this.value.replace(/\\D/g,\'\')}"'+
		    		'></div>';
		    	}
		    	var ht = question_type_html+t1+"</div>"+question_fraction_html+t3+"</div>";
		    	$('#txsz').html(ht);
		    	
		    	$('input[name="questionType"]').change(function(){
					var index = $(this).parent().index();
					if($(this).is(':checked')){
						$(this).parent().parent().siblings().eq(0).find("div").eq(index).children(0).attr("disabled",false);
					}else{
						$(this).parent().parent().siblings().eq(0).find("div").eq(index).children(0).attr("disabled",true);
					}
				});
		    }  
	 	});
	 	loadCatalogDetail();
	}
	
	//版本改变，重新获取同步章节及章节内容
	$("select#version_select").change(function(){
	 	loadCatalogDetail();
	});
	
	//年级改变，重新获取同步章节及章节内容
	$("select#grade_select").change(function(){
		if($("#roleType").val() == "ROLE_09"){
			// 学科信息
			$.ajax({  
				type:'get',  
			    url:'${basePath!''}/papers/intelligence/teachersubject/list.htm', 
			    data:{'gradeId':$(this).val()}, 
			    async: false,
			    success:function(data){  
			    	var subject_html = "";
			    	for(var i = 0;i<data.length;i++){
			    		subject_html += '<option value="'+ data[i].id+'">'+data[i].name+'</option>';
			    	}
			    	$('#subject_select').html(subject_html);
			    }  
		 	});
			subjectChange();
		}else{
			loadCatalogDetail();
		}
	});
	
	function integerValidation(va,ob){
	  	var validation = /^\+?[1-9][0-9]*$/;
		if(ob == 1){
			 if(!$.trim(va)){
	            alert('考试时长不能为空！');
	            return false;
	        }else if(!(validation.test(va))){  
		     	alert('考试时长必须为正整数！');
		        return false;  
			}else{
				return true; 
			}
		}
	}
	
	$('input[name="questionType"]').change(function(){
		var index = $(this).parent().index();
		if($(this).is(':checked')){
			$(this).parent().parent().siblings().eq(0).find("div").eq(index).children(0).attr("disabled",false);
			$(this).parent().parent().siblings().eq(1).find("div").eq(index).children(0).attr("disabled",false);
		}else{
			$(this).parent().parent().siblings().eq(0).find("div").eq(index).children(0).attr("disabled",true);
			$(this).parent().parent().siblings().eq(1).find("div").eq(index).children(0).attr("disabled",true);
		}
		
	});
	
	function integerValidation(va,ob){
	  	var validation = /^\+?[1-9][0-9]*$/;
		if(ob == 1){
			 if(!$.trim(va)){
	            alert('考试时长不能为空！');
	            return false;
	        }else if(!(validation.test(va))){  
		     	alert('考试时长必须为正整数！');
		        return false;  
			}else{
				return true; 
			}
		}
	}
	
	function selectTopic(belongToLib,questionType,ob,type,pageNo){
		if(type=='xt'){
			if(!$.trim($("#paperName").val())){
	            alert('试卷名称不能为空！');
	            return false;
			}
			if(!integerValidation($("#testTime").val(),1)){
	       		return false;
			}
	    	if($('input[name="questionType"]:checked').length == 0){
	    		alert('请选择题目类型！');
	            return false;
	    	}
	    	var bre = 0;
			$('input[name="questionType"]:checked').each(function(i){
				var index = $(this).parent().index();
				var quScoreVal = $(this).parent().parent().siblings().eq(0).find("div").eq(index).children(0).val();
				if(quScoreVal == ""){
					alert("请设置题型对应的分数！");
					bre = 1;
					return false;
				}
			});
			if(bre == 1){
				return;
			}
			$('input[name="questionType"]:checked').each(function(i){
				if(i == 0){
					var lihtml = "<li class='active' onclick = \"selectTopic('','"+$(this).val()+"',this,'tx','')\">"+$(this).next().html()+"</li>";
				}else{
					var lihtml = "<li onclick = \"selectTopic('','"+$(this).val()+"',this,'tx','')\">"+$(this).next().html()+"</li>";
				}
				$("#txid").append(lihtml);
			});
			$('#questionType').val($('input[name="questionType"]:checked').eq(0).val());
		}
		if(type == 'tk'){
			$('#belongToLib').val(belongToLib);
			$(ob).addClass("active");
	 		$(ob).siblings().removeClass(); 
		}
		if(type == 'tx'){
			$('#questionType').val(questionType);
			$(ob).addClass("active");
	 		$(ob).siblings().removeClass(); 
		}
		if(type == 'page'){
			var jsondata = {'subjectId':$('#subject_select option:selected').val(),
						'gradeId':$('#grade_select option:selected').val(),
						'versionId':$('#version_select option:selected').val(),
						'stageId':$('#stage_select').val(),
						'belongToLib':$('#belongToLib').val(),
						'typeId':$('#questionType').val(),
						'catalogDetailId':$('#catalogDetailId').val(),
						'pageNo':pageNo
						};
		}else{
			var jsondata = {'subjectId':$('#subject_select option:selected').val(),
						'gradeId':$('#grade_select option:selected').val(),
						'versionId':$('#version_select option:selected').val(),
						'stageId':$('#stage_select').val(),
						'belongToLib':$('#belongToLib').val(),
						'typeId':$('#questionType').val(),
						'catalogDetailId':$('#catalogDetailId').val()
						};
		}
		$.ajax({ 
			type:'post',  
			url:'${basePath!''}/papers/manual/list/selecttopic.htm',
			async:false,
			data:jsondata,
			success:function(data){  
				var Curedata = $.extend(true, [], data);      	  
				if (Curedata != null) {
					$("#xt_tmlb").html("");//清空列表
					$("#xt").css('display','block');
					$("#xtyc").css('display','block');
					$("#sgzj").css('display','none');
					var no = 0;
					var djbf = 1;
					var qod = "";
					var divHTML = "";
					for(var i = 0; i<Curedata.list.length; i++){
						no = no + 1;
						var qod = "<br/>";
						var qods = Curedata.list[i].qods;
						var ind = 0;
						if(qods !="" && qods != null){
							for(var j =0 ;j<qods.length;j++){
								if(Curedata.list[i].qods[j].is_answer == "1"){
									ind =j;
								}
								qod+='<input type="radio"/>'+(j+"").replace(/0/,"A").replace(/1/,"B").replace(/2/,"C").replace(/3/,"D")+'. '+Curedata.list[i].qods[j].content+'<br/>';
							}
						}
						var knowledgeNames = "";
						if(Curedata.list[i].knowledgeNames != null){
							for(var k = 0; k<Curedata.list[i].knowledgeNames.length; k++){
								knowledgeNames+=Curedata.list[i].knowledgeNames[k]+" ";
							}
						}
						var testTimes = 0;
						if(Curedata.list[i].testTimes == null){
							testTimes = 0;
						}else{
							testTimes = Curedata.list[i].testTimes;
						}
						var difficulty = 0;
						if(Curedata.list[i].difficulty == null){
							difficulty = 0;
						}else{
							difficulty = Curedata.list[i].difficulty;
						}
						<!-- 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题  -->
						var anHtml = "";
						for(var z = 0; z<Curedata.list[i].avs.length;z++){
							if(Curedata.list[i].qtv.markingCode == '0'){
								anHtml +='<p><span>【答案】'+Curedata.list[i].avs[z].answerValue+'</span><p>';
							}else if(Curedata.list[i].qtv.markingCode == '1' || Curedata.list[i].qtv.markingCode == '2'){
								if(qods !="" && qods != null){
									var daString ="";
									for(var j =0 ;j<qods.length;j++){
										if(Curedata.list[i].qods[j].is_answer == "1"){
											daString+=String.fromCharCode(65 + j)+" ";
										}
									}
								}
								anHtml +='<p><span>【答案】'+daString+'</span><p/>';
							}else if(Curedata.list[i].qtv.markingCode == '3' || Curedata.list[i].qtv.markingCode == '4'){
								if(Curedata.list[i].avs[z].answerValue == null){
									anHtml +='<p><span>【答案】 无</span><p>';
								}else{
									var da = Curedata.list[i].avs[z].answerValue.split("|");
									var daString ="";
									for(var a = 0; a<da.length;a++){
										daString+=da[a]+' ';
									}
									anHtml +='<p><span>【答案】'+daString+'</span><p>';
								}
								
							}else if(Curedata.list[i].qtv.markingCode == '5'){
								if(Curedata.list[i].avs[z].answerValue == null){
									anHtml +='<p><span>【答案】 无</span><p>';
								}else{
									var da = Curedata.list[i].avs[z].answerValue.split("|");
									var daString ="";
									for(var g = 0; g<da.length; g++){
										if(da[g] == '0'){
											daString += (g+1)+'.'+'√ ';
										}else{
											daString += (g+1)+'.'+'× ';
										}
									}
									anHtml +='<p><span>【答案】'+daString+'</span><p>';
								}
								
							}
							anHtml +='<p><span>【解析】'+Curedata.list[i].avs[z].answerDescription==null?"无":Curedata.list[i].avs[z].answerDescription+'</p>';
						}
						var is_add ="";
						if(questionStr.indexOf(","+Curedata.list[i].id+",") >= 0){
							is_add = '<div class="fr"><span>已加入</span></div>';
						}else{
							is_add = '<div class="fr"><span onclick = "addQuestion('+Curedata.list[i].id+','+Curedata.list[i].typeId+',this)">加入试卷</span></div>';
						}
						var scoreVal = 0;
						$('input[name="questionType"]:checked').each(function(){
							if(Curedata.list[i].typeId == $(this).val()){
								var dindex = $(this).parent().index();
								scoreVal = $(this).parent().parent().siblings().eq(0).find("div").eq(dindex).children(0).val();
								return false;
							}
						});
						var qcd = Curedata.list[i].qcd;
						var qcd_title = "";
						var qcd_content = "";
						if(qcd !="" && qcd != null){
							qcd_title = qcd.title;
							qcd_content = qcd.content;
						}
						divHTML += '<div class="question-item">'
							+'<p>'
								+'<span>组卷次数:'+testTimes+'</span>'
								+'<span>难度：'+difficulty+'</span>'
								+'<span>知识点：'+knowledgeNames+'</span>'
								+'<span class="fr score">分值<input type="text" value="'+scoreVal+'" readonly="readonly"></span>'
							+'</p>'
							+'<div class="ques-info fl">'
								+qcd_title
								+qcd_content
								+qod
							+'</div>'
							+'<div class="answer"><div class="already_login">'
							+anHtml
							+'</div></div>'
							+is_add
							+'<div class="cl"></div>'
							+'</div>';
					}
					var pageHtml ="";
					if(Curedata.totalPages>0){
						if(Curedata.pageNo != 1){
							pageHtml += '<li onClick="selectTopic(\'\',\'\',\'\',\'page\','+Curedata.firstPageNo+')">首页</li>'
							+'<li onClick="selectTopic(\'\',\'\',\'\',\'page\','+Curedata.prePageNo+')">上一页</li>';
						}
						for(var index = 1; index <= Curedata.endNo; index++){
							if (index == Curedata.pageNo){
								pageHtml += '<li class="active" onClick="selectTopic(\'\',\'\',\'\',\'page\','+Curedata.pageNo+')">'+Curedata.pageNo+'</li>';
							}else{
								pageHtml += '<li  onClick="selectTopic(\'\',\'\',\'\',\'page\','+index+')">'+index+'</li>';
							}
						}
						if(Curedata.pageNo != Curedata.totalPages){
							pageHtml += '<li onClick="selectTopic(\'\',\'\',\'\',\'page\','+Curedata.nextPageNo+')">下一页</li>'
							+'<li onClick="selectTopic(\'\',\'\',\'\',\'page\','+Curedata.lastPageNo+')">未页</li>';
						}	
	      				pageHtml += '<li style ="width:50px;">'+Curedata.pageNo+'/'+Curedata.totalPages+'</li>'
	      				+'<li style ="width:150px;">共'+Curedata.rows+'条记录，分'+Curedata.totalPages+' 页</li>';
					}
					var endHtml = '</div>'
					+'<div class="mids fr">'
						+'<ul class="page_num clearfix">'
							+pageHtml
						+'</ul>'
					+'</div>';
					
					$("#xt_tmlb").append(divHTML+endHtml);
				}else{
					alert("您选择的在题库中题目的数量不足");
				}
			}  
		});
	}
	
	function intelligenceSubmit(){
		var questionQuQuantityMap = {};
		var questionQuScoreMap = {};
		var questionTypeMap = {};
		var isSubjective = 0;//是否包含主观题 默认没有
		$('input[name="questionType"]:checked').each(function(i){
			if($(this).attr("isObjective") == "0"){//是否客观题（0否，1是）客观题 机器阅卷，主观题 人为阅卷
				isSubjective = 1;
			}
			var index = $(this).parent().index();
			var quScoreVal = $(this).parent().parent().siblings().eq(0).find("div").eq(index).children(0).val();
			questionQuScoreMap[$(this).val()] = quScoreVal;
			questionTypeMap[$(this).val()] = $(this).next().html();
		});
		for(var d = 0; d<$("#yl_tmlb").children("p").size();d++){
			var quQuantityId = $("#yl_tmlb").children("p").eq(d).attr("typeid");
			var quQuantityVal = $("#yl_tmlb").children("p").eq(d).attr("totalqu");
			questionQuQuantityMap[quQuantityId] = quQuantityVal;
		}
		
		var questionWareVo = new Array();
    	var questionWareVoMap = {};  
		$('.questionTypeId').each(function(i){
			var t = $(".questionTypeId").eq(i+1).val();
			questionWareVo.push({id:$(this).prev().val(),typeId:$(this).val()});
			if(t != $(this).val()){
				questionWareVoMap[$(this).val()] = questionWareVo;
				questionWareVo = new Array();
			}
		});
		var jsondatas = {'paperName':$('#paperName').val(),
						'subjectId':$('#subject_select option:selected').val(),
						'gradeId':$('#grade_select option:selected').val(),
						'versionId':$('#version_select option:selected').val(),
						'testTime':$('#testTime').val(),
						'totalQuantity':$('#totalQuantity').val(),
						'totalScore':$('#totalScore').val(),
						'paperDifficulty':$('#paperDifficulty').text(),
						'questionQuQuantityMap':questionQuQuantityMap,
						'questionQuScoreMap':questionQuScoreMap,
						'questionTypeMap':questionTypeMap,
						'questionWareVoMap':questionWareVoMap,
						'examType':$('#examType').val(),
						'isSubjective':isSubjective
						};
		$.ajax({
			type:'post',  
			url:'${basePath!''}/papers/manual/list/save.htm',
			async: false,
			contentType:"application/json;charset=utf-8",    
            dataType:"json",
			data:JSON.stringify(jsondatas),
			traditional:true,//这里设置为true后台接收数组就会去掉[]这个框
			success:function(data){
				alert("保存成功！");
				window.location.href = "${basePath!''}/papers/mypapers/list.htm";
			},
		    error: function(){
            	alert("保存失败！");
            } 
		});
	}
	
	$(function(){
		loadCatalogDetail();
	})
	
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
	
	function zCatalogTreeOnClick(event, treeId, treeNode) {
		$('#catalogDetailId').val(treeNode.id);
		selectTopic('','','','kbzj','');
	};
	
	//加载课本章节
	function loadCatalogDetail(){
		var stageId = $('#stage_select').val();
		var gradeId = $('#grade_select').val();
		var subjectId  = $('#subject_select').val();
		var versionId = $('#version_select').val();
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/catalogDetail/treelistbysearch.htm',  
          data:{'gradeId':gradeId,'stageId':stageId,'subjectId':subjectId,'id':$('#catalogDetailId').val(),'versionId':versionId},
          success:function(data){  
        	  loadCatalogDetailTree(data);                    
          }  
    	});
	}
	
	var questionStr = ",";
	function addQuestion(questionId,questionType,ob){
		questionStr+=questionId+",";
		$(ob).removeAttr('onclick');
		$(ob).attr({"disabled":"disabled"});
	 	$(ob).html("已加入");
	}
	
	function go_back(){
		$("#sgzjyl").css('display','none');
		$("#sgzjyc").css('display','none');
		$("#xt").css('display','block');
		$("#xtyc").css('display','block');
	}
	
	function previewPaper(){
		if(questionStr.length<2){
			alert("请先选择题目！");
			return;
		}
		var jsondata = {'questionStr':questionStr};
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/papers/manual/list/preview.htm',
			async:false,
			data:jsondata,
			success:function(data){
				var Curedata = $.extend(true, [], data);      	  
				if (Curedata != null) {
					$("#yl_tmlb").html("");
					$("#yl_paperName").html($('#paperName').val());
					$("#yl_testTime").html("考试时间："+$('#testTime').val()+"分钟");
					$("#yl_createName").html("命题人："+$('#createName').val());
					$("#yl_createTime").html("日期："+ (new Date()).toLocaleDateString());
					$("#yl_subjectName").html($('#subject_select option:selected').text());
					$("#yl_gradeName").html($('#grade_select option:selected').text());
					$("#yl_versionName").html($('#version_select option:selected').text());
					$("#sgzjyl").css('display','block');
					$("#sgzjyc").css('display','block');
					$("#xt").css('display','none');
					$("#xtyc").css('display','none');
					var no = 0;
					var djbf = 1;
					var qod = "";
					var divHTML = "";
					var zf = 0;//总分
					var totalquArray = new Array()
					$('input[name="questionType"]:checked').each(function(j){
						var totalqu = 0;
						for(var i = 0; i<Curedata.list.length; i++){
							if(Curedata.list[i].typeId == $(this).val()){
								totalqu = totalqu + 1;
							}
						}
						totalquArray[j] = totalqu;
					});
					$('input[name="questionType"]:checked').each(function(n){
						var dindex = $(this).parent().index();
						var scoreVal = $(this).parent().parent().siblings().eq(0).find("div").eq(dindex).children(0).val();
						if(n != 0){
							divHTML = divHTML + '<p totalqu = '+totalquArray[n]+' typeid = '+$(this).val()+'>第'+convertToChinese(djbf++)+'部分：'+$(this).next().html()+'（共'+totalquArray[n]+'题，每题'+scoreVal+'分）</p>';
						}
						for(var i = 0; i<Curedata.list.length; i++){
							if(Curedata.list[i].typeId == $(this).val()){
								zf+=parseInt(scoreVal);
								no = no + 1;
								var qod = "<br/>";
								var qods = Curedata.list[i].qods;
								var ind = 0;
								if(qods !="" && qods != null){
									for(var j =0 ;j<qods.length;j++){
										if(Curedata.list[i].qods[j].is_answer == "1"){
											ind =j;
										}
										qod+='<input type="radio"/>'+(j+"").replace(/0/,"A").replace(/1/,"B").replace(/2/,"C").replace(/3/,"D")+'. '+Curedata.list[i].qods[j].content+'<br/>';
									}
								}
								var knowledgeNames = "";
								if(Curedata.list[i].knowledgeNames != null){
									for(var k = 0; k<Curedata.list[i].knowledgeNames.length; k++){
										knowledgeNames+=Curedata.list[i].knowledgeNames[k]+" ";
									}
								}
								var testTimes = 0;
								if(Curedata.list[i].testTimes == null){
									testTimes = 0;
								}else{
									testTimes = Curedata.list[i].testTimes;
								}
								var difficulty = 0;
								if(Curedata.list[i].difficulty == null){
									difficulty = 0;
								}else{
									difficulty = Curedata.list[i].difficulty;
								}
								var anHtml = "";
								for(var z = 0; z<Curedata.list[i].avs.length;z++){
									if(Curedata.list[i].qtv.markingCode == '0'){
										anHtml +='<p><span>【答案】'+Curedata.list[i].avs[z].answerValue+'</span><p>';
									}else if(Curedata.list[i].qtv.markingCode == '1' || Curedata.list[i].qtv.markingCode == '2'){
										if(qods !="" && qods != null){
											var daString ="";
											for(var j =0 ;j<qods.length;j++){
												if(Curedata.list[i].qods[j].is_answer == "1"){
													daString+=String.fromCharCode(65 + j)+" ";
												}
											}
										}
										anHtml +='<p><span>【答案】'+daString+'</span><p/>';
									}else if(Curedata.list[i].qtv.markingCode == '3' || Curedata.list[i].qtv.markingCode == '4'){
										if(Curedata.list[i].avs[z].answerValue == null){
											anHtml +='<p><span>【答案】 无</span><p>';
										}else{
											var da = Curedata.list[i].avs[z].answerValue.split("|");
											var daString ="";
											for(var a = 0; a<da.length;a++){
												daString+=da[a]+' ';
											}
											anHtml +='<p><span>【答案】'+daString+'</span><p>';
										}
									}else if(Curedata.list[i].qtv.markingCode == '5'){
										if(Curedata.list[i].avs[z].answerValue == null){
											anHtml +='<p><span>【答案】 无</span><p>';
										}else{
											var da = Curedata.list[i].avs[z].answerValue.split("|");
											var daString ="";
											for(var g = 0; g<da.length; g++){
												if(da[g] == '0'){
													daString += (g+1)+'.'+'√ ';
												}else{
													daString += (g+1)+'.'+'× ';
												}
											}
											anHtml +='<p><span>【答案】'+daString+'</span><p>';
										}
									}
									anHtml +='<p><span>【解析】'+Curedata.list[i].avs[z].answerDescription==null?"无":Curedata.list[i].avs[z].answerDescription+'</p>';
								}
								var is_add ="";
								if(questionStr.indexOf(","+Curedata.list[i].id+",") >= 0){
									is_add = '<div class="fr"><span>已加入</span></div>';
								}else{
									is_add = '<div class="fr"><span onclick = "addQuestion('+Curedata.list[i].id+','+Curedata.list[i].typeId+',this)">加入试卷</span></div>';
								}
								var qcd = Curedata.list[i].qcd;
								var qcd_title = "";
								var qcd_content = "";
								if(qcd !="" && qcd != null){
									qcd_title = qcd.title;
									qcd_content = qcd.content;
								}
								divHTML += '<div class="question-item">'
									+'<p>'
										+'<span>组卷次数:'+testTimes+'</span>'
										+'<span>难度：'+difficulty+'</span>'
										+'<span>知识点：'+knowledgeNames+'</span>'
										+'<span class="fr score">分值<input type="text" value="'+scoreVal+'" readonly="readonly"></span>'
									+'</p>'
									+'<div class="ques-info fl">'
										+qcd_title
										+qcd_content
										+qod
									+'</div>'
									+'<div class="answer"><div class="already_login">'
									+anHtml
									+'</div></div>'
									+is_add
									+'<div class="cl"><input name ="questionNo" type="hidden" value = "'+no+'"/><input class ="questionId" type="hidden" value = "'+Curedata.list[i].id+'"/><input class ="questionTypeId" type="hidden" value = "'+Curedata.list[i].typeId+'"/></div>'
									+'</div>';
							}
						}
						if(n == 0){
							divHTML = '<p totalqu = '+totalquArray[n]+' typeid = '+$(this).val()+'>第'+convertToChinese(djbf++)+'部分：'+$(this).next().html()+'（共'+totalquArray[n]+'题，每题'+scoreVal+'分）</p>' + divHTML;
						}
					});
					
					$("#yl_totalScore").html("试卷总分："+zf+"分");
					$("#totalScore").val(zf);
					$("#totalQuantity").val(Curedata.list.length);
					$("#yl_tmlb").append(divHTML);
				}else{
					alert("您选择的在题库中题目的数量不足");
				}
			}  
		});
	}
	
	$(function(){
		var ue = UE.getEditor('topic');
		var ue = UE.getEditor('answer');
		drag_step('q_drag', 0, function (value) {
            $('#q_drag').find('.value').html((100 - value) / 100)
			//return value / 100;
        })

        //树形菜单
		var setting = {
			showLine: false, 
			checkable: true 
		}

		var zNodes = [
		   {
		       name: "Item1", //节点名称
		       open: true,  //节点是否可以展开
		       isParent:true, //是否为文件夹
		       children: [{
		           name:"Item 1.1",
		       },
		       {
		       	 name:"Item 1.2",
		       },
		       {
		          name:"Item 1.3"
		       }]
		   },

		];

		var zTreeObj;
		zTreeObj = $.fn.zTree.init($("#treeNode"), setting, zNodes);	//初始化树
	})
	
	function go_cancel(){
		window.location.href = "${basePath!''}/papers/mypapers/list.htm";
	}
</script>

</body>
</html>