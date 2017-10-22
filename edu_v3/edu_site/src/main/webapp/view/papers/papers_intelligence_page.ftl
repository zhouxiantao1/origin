<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>试卷管理-智能组卷</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<!-- <link rel="stylesheet" type="text/css" href="${basePath!''}/css/wy_mingti.css"> -->
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/preview_paper.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/zTreeStyle/zTreeStyle.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/create_paper.css">
</head>
<body>

	<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">

		<div class="mid fl" id="znzj">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>试卷管理>智能组卷</h3>
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
                        	<div class="info-item">
	                            <label>试卷总分：</label>
	                            <input type="text" placeholder="100" class="sub-json" id="totalScore"
	                            onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"  
    							onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'0')}else{this.value=this.value.replace(/\D/g,'')}"
	                            >
	                            <label>(分)</label>
                        	</div>
	                        <div class="info-item">
	                            <label>题目总数：</label>
	                            <input type="text" placeholder="60" class="sub-json" id="totalQuantity"
	                            onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"  
    							onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'0')}else{this.value=this.value.replace(/\D/g,'')}"
	                            >
	                            <label>(道)</label>
	                        </div>
						</div>
					</div>
				</div>
				<div class="paper-item">
					<div class="paper-manage">
						<p class="title">组卷设置</p>
						<div class="info-body">
							<div class="info-item paper-hard">
								<label for="" class="fl">试卷难度：</label>
								<div class="easy_hard clearfix fl">
									<span>较易</span>
									<!-- <input type="range" name="points" min="0" max="10"> -->
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
								<div id = "tlszdiv">
								<div style ="clear:both">题量设置：</div>
								<#list questionTypeVoList as questionTypeVo>
									<div class="info-item" style="float:left;width:200px;">
										<select name="" id="" disabled = "disabled">
										<#list 1..12 as t>
										<option value="${t}">${t}</option>
										</#list>
										</select>
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
							<div class="info-item cl jiaocai">
								<div class="subversion fl">
									<label>教材版本：</label>
									<select name="" id = "version_select">
										<#list baseVersionVoList as baseVersionVo>
										 <option value="${baseVersionVo.id}">${baseVersionVo.name}</option> 
										</#list>
									</select>
								</div>
								<div class="fl chapter">
									<label>同步章节：</label>
									<select id="catalog_select" onchange="catalogChange()">
										<#list baseCatalogVoList as baseCatalogVo>
										 <option value="${baseCatalogVo.id}">${baseCatalogVo.name}</option> 
										</#list>
									</select>
								</div>
								<div class="cl"></div>
							</div>
							
						</div>
					</div>
				</div>
				<label>课本章节：</label>
				<div class="paper-item" id = "kbzj" style="overflow-y:auto; width:500px; height:300px;">
					<#list baseCatalogDetailVoList as baseCatalogDetailVo>
						<p>
							<input name="catalogDetail" type="checkbox" value="${baseCatalogDetailVo.id}">${baseCatalogDetailVo.name}
						</p>
					</#list>
				</div>
				<div class="operation">
					<button class="submit" onclick = "intelligenceNextStep()">下一步</button>
					<button class="cancel" onclick = "go_cancel()">取消</button>
				</div>
			</div>
		</div>
			<!--预览-->
			<div class="middle fl" id="znzjyl" style="display:none;">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<span></span>
						<h3>试卷管理>预览试卷</h3>
					</div>
					<p class="back fr" onclick = "intelligenceSubmit()">保存试卷</p>
					<p class="back fr"><a href="${basePath!''}/papers/intelligence/list.htm">返回</a></p>
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

			<!-- 右侧边栏 -->
			<div class="content_right fr" id="znzjyc" style="display:none;">
				
				<div class="shaixuan">
					<p><i>学科</i><span id = "yl_subjectName"></span></p>
					<p><i>年级</i><span id = "yl_gradeName"></span></p>
					<p><i>教材版本</i><span id = "yl_versionName"></span></p>
				</div>
				
				<div class="ques-setting">
					<p>题目设置</p>
					<table id = "tmsz">
					</table>
				</div>
				
				
			</div>
		
		
	</div>
	
	
	
	<input id = "roleType" type = "hidden" value = "${roleType}"/>
	
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
	 	
	 	// 年级/册信息
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
		    	var question_quantity_html = "<div id = 'tlszdiv'><div style ='clear:both'>题量设置：</div>";
		    	t2 = "";
		    	var question_fraction_html = "<div id = 'fsszdiv'><div style ='clear:both'>每题分数设置：</div>";
		    	t3 = "";
		    	for(var i = 0;i<data.length;i++){
		    		t1+='<div class="info-item" style="float:left;width:200px;"><input isObjective = "'+data[i].isObjective+'" name="questionType" type="checkbox" value="'+data[i].id+'"/><span>'+data[i].typeName+'</span></div>';
		    		t2+='<div class="info-item" style="float:left;width:200px;"><select disabled = "disabled" name="" id="">';
					var t22 ="";
		    		for(var j = 1; j<13; j++){
		    			t22+='<option value='+j+'>'+j+'</option>';
		    		}
		    		t2+=t22+'</select></div>';
		    		t3+='<div class="info-item" style="float:left;width:200px;"><input disabled = "disabled" type="text" value="1"'+
		    		'onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,\'\')}else{this.value=this.value.replace(/\\D/g,\'\')}"'+ 
    									'onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,\'0\')}else{this.value=this.value.replace(/\\D/g,\'\')}"'+
		    		'></div>';
		    	}
		    	var ht = question_type_html+t1+"</div>"+question_quantity_html+t2+"</div>"+question_fraction_html+t3+"</div>";
		    	$('#txsz').html(ht);
		    	
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
		    }  
	 	});
	 	//同步章节信息
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/base/catalog/listbysearch.htm', 
		    data:{'gradeId':$('#grade_select').val(),'versionId':$('#version_select').val(),'subjectId':$('#subject_select').val()}, 
		    success:function(data){  
		    	var catalog_html = "";
		    	for(var i = 0;i<data.length;i++){
		    		catalog_html += '<option value="'+ data[i].id+'">'+data[i].name+'</option>';
		    	}
		    	$('#catalog_select').html(catalog_html);
		    	catalogChange();//章节信息
		    }  
	 	});
	}
	
	//版本改变，重新获取同步章节及章节内容
	$("select#version_select").change(function(){
		//同步章节信息
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/base/catalog/listbysearch.htm', 
		    data:{'gradeId':$('#grade_select').val(),'versionId':$('#version_select').val(),'subjectId':$('#subject_select').val()}, 
		    success:function(data){  
		    	var catalog_html = "";
		    	for(var i = 0;i<data.length;i++){
		    		catalog_html += '<option value="'+ data[i].id+'">'+data[i].name+'</option>';
		    	}
		    	$('#catalog_select').html(catalog_html);
		    	catalogChange();//章节信息
		    }  
	 	});
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
			//同步章节信息
			$.ajax({  
				type:'get',  
			    url:'${basePath!''}/base/catalog/listbysearch.htm', 
			    data:{'gradeId':$(this).val(),'versionId':$('#version_select').val(),'subjectId':$('#subject_select').val()}, 
			    success:function(data){  
			    	var catalog_html = "";
			    	for(var i = 0;i<data.length;i++){
			    		catalog_html += '<option value="'+ data[i].id+'">'+data[i].name+'</option>';
			    	}
			    	$('#catalog_select').html(catalog_html);
			    	catalogChange();//章节信息
			    }  
		 	});
		}
		
	});
	
	//同步章节改变，获取章节信息
	function catalogChange(){
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/base/catalogDetail/listbysearch.htm', 
		    data:{'catalogId':$('#catalog_select').val(),'gradeId':$('#grade_select').val(),'versionId':$('#version_select').val(),'subjectId':$('#subject_select').val()}, 
		    success:function(data){  
		    	var catalog_detail_html = "";
		    	for(var i = 0;i<data.length;i++){
		    		catalog_detail_html += '<p><input name="catalogDetail" type="checkbox" value="'+ data[i].id+'">'+data[i].name+'</p>';
		    	}
		    	$('#kbzj').html(catalog_detail_html);
		    }  
	 	});
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
		if(ob == 2){
			 if(!$.trim(va)){
	            alert('试卷总分不能为空！');
	            return false;
	        }else if(!(validation.test(va))){  
		     	alert('试卷总分必须为正整数！');
		        return false;  
			}else{
				return true; 
			}
		}
		if(ob == 3){
			 if(!$.trim(va)){
	            alert('题目总数不能为空！');
	            return false;
	        }else if(!(validation.test(va))){  
		     	alert('题目总数必须为正整数！');
		        return false;  
			}else{
				return true; 
			}
		}
	}
	
	function intelligenceNextStep(){
		if(!$.trim($("#paperName").val())){
            alert('试卷名称不能为空！');
            return false;
       }
       if(!integerValidation($("#testTime").val(),1)){
       		return false;
       }
       if(!integerValidation($("#totalScore").val(),2)){
      		return false;
       }
       if(!integerValidation($("#totalQuantity").val(),3)){
       		return false;
       }
		var questionQuQuantityMap = {};
		var questionQuScoreMap = {};
		var questionTypeMap = {};
    	var questionTypeVoList = new Array();  
    	var bre = 0;
    	if($('input[name="questionType"]:checked').length == 0){
    		alert('请选择题目类型！');
            return false;
    	}
    	var quScoreValSum = 0;
    	var quQuantityValSum = 0;
		$('input[name="questionType"]:checked').each(function(i){
			var index = $(this).parent().index();
			var quQuantityVal = $(this).parent().parent().siblings().eq(0).find("div").eq(index).children(0).find("option:selected").val();
			var quScoreVal = $(this).parent().parent().siblings().eq(1).find("div").eq(index).children(0).val();
			if(quScoreVal == ""){
				alert("请输入对应的分数！");
				bre = 1;
				return false;
			}
			quQuantityValSum+=parseInt(quQuantityVal);
			quScoreValSum+=parseInt(quScoreVal)*parseInt(quQuantityVal);
			questionQuQuantityMap[$(this).val()] = quQuantityVal;
			questionQuScoreMap[$(this).val()] = quScoreVal;
			questionTypeMap[$(this).val()] = $(this).next().html();
			questionTypeVoList.push({id:$(this).val(),typeName:$(this).next().html()});
		});
		if(bre == 1){
			return;
		}
		if($('input[name="catalogDetail"]:checked').length == 0){
    		alert('请选择课本章节！');
            return false;
    	}
    	if(quScoreValSum != $("#totalScore").val()){
    		alert('设置题型的分数与总分不相等！');
            return false;
    	}
    	if(quQuantityValSum != $("#totalQuantity").val()){
    		alert('设置题型的题量与总题量不相等！');
            return false;
    	}
		var catalogDetailIdList = new Array();  
		$('input[name="catalogDetail"]:checked').each(function(i){
			catalogDetailIdList.push($(this).val());
		});
		var jsondata = {'subjectId':$('#subject_select option:selected').val(),
						'gradeId':$('#grade_select option:selected').val(),
						'versionId':$('#version_select option:selected').val(),
						'questionQuQuantityMap':questionQuQuantityMap,
						'questionQuScoreMap':questionQuScoreMap,
						'questionTypeMap':questionTypeMap,
						'questionTypeVoList':questionTypeVoList,
						'stageId':$('#stage_select').val(),
						'catalogId':$('#catalog_select').val(),
						'catalogDetailIdList':catalogDetailIdList
						};
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/papers/intelligence/list/preview.htm',
			async:false,
			contentType:"application/json;charset=utf-8",    
            dataType:"json",
			data:JSON.stringify(jsondata), 
			traditional:true,//这里设置为true后台接收数组就会去掉[]这个框
			success:function(data){  
				var Curedata = $.extend(true, [], data);
				if (Curedata != null && Curedata.totalQuantity != 0 ) {
					$("#znzjyl").css('display','block');
					$("#znzjyc").css('display','block');
					$("#znzj").css('display','none');
					$("#yl_paperName").html($('#paperName').val());
					$("#yl_testTime").html("考试时间："+$('#testTime').val()+"分钟");
					$("#yl_totalScore").html("试卷总分："+$('#totalScore').val()+"分");
					$("#yl_createName").html("命题人："+Curedata.createName);
					$("#yl_createTime").html("日期："+Curedata.createTime);
					$("#yl_subjectName").html($('#subject_select option:selected').text());
					$("#yl_gradeName").html($('#grade_select option:selected').text());
					$("#yl_versionName").html($('#version_select option:selected').text());
					var divHTML = "";
					var trHTML = "";
					var no = 0;
					var djbf = 1;
					$.each(Curedata.questionWareVoMap,function(key,values){
						var qod = "";
						trHTML = '<tr><td>'+Curedata.questionTypeMap[key]+'</td><td class="count">'+values.length+'</td><td class="score"><i>'+Curedata.questionQuScoreMap[key]+'</i> 分 / 题</td></tr>';
						$("#tmsz").append(trHTML);
						divHTML += '<p>第'+convertToChinese(djbf++)+'部分：'+Curedata.questionTypeMap[key]+'（共'+values.length+'题，每题'+Curedata.questionQuScoreMap[key]+'分）</p>';
						for(var i = 0; i<values.length; i++){
							no = no + 1;
							var qod = "<br/>";
							var qods = values[i].qods;
							var ind = 0;
							if(qods !="" && qods != null){
								for(var j =0 ;j<qods.length;j++){
									if(values[i].qods[j].is_answer == "1"){
										ind =j;
									}
									qod+='<input type="radio"/>'+(j+"").replace(/0/,"A").replace(/1/,"B").replace(/2/,"C").replace(/3/,"D")+'. '+values[i].qods[j].content+'<br/>';
								}
							}
							var knowledgeNames = "";
							if(values[i].knowledgeNames != null){
								for(var k = 0; k<values[i].knowledgeNames.length; k++){
									knowledgeNames+=values[i].knowledgeNames[k];
								}
							}
							var testTimes = 0;
							if(values[i].testTimes == null){
								testTimes = 0;
							}else{
								testTimes = values[i].testTimes;
							}
							var difficulty = 0;
							if(values[i].difficulty == null){
								difficulty = 0;
							}else{
								difficulty = values[i].difficulty;
							}
							var anHtml = "";
							for(var z = 0; z<values[i].avs.length;z++){
								if(values[i].qtv.markingCode == '0'){
									anHtml +='<p><span>【答案】'+values[i].avs[z].answerValue+'</span><p>';
								}else if(values[i].qtv.markingCode == '1' || values[i].qtv.markingCode == '2'){
									if(qods !="" && qods != null){
										var daString ="";
										for(var j =0 ;j<qods.length;j++){
											if(values[i].qods[j].is_answer == "1"){
												daString+=String.fromCharCode(65 + j)+" ";
											}
										}
									}
									anHtml +='<p><span>【答案】'+daString+'</span><p/>';
								}else if(values[i].qtv.markingCode == '3' || values[i].qtv.markingCode == '4'){
									var daString ="";
									if(values[i].avs[z].answerValue != null){
										var da = values[i].avs[z].answerValue.split("|");
										for(var a = 0; a<da.length;a++){
											daString+=da[a]+' ';
										}
									}
									anHtml +='<p><span>【答案】'+daString+'</span><p>';
								}else if(values[i].qtv.markingCode == '5'){
									var daString ="";
									if(values[i].avs[z].answerValue != null){
										var da = values[i].avs[z].answerValue.split("|");
										for(var g = 0; g<da.length; g++){
											if(da[g] == '0'){
												daString += (g+1)+'.'+'√ ';
											}else{
												daString += (g+1)+'.'+'× ';
											}
										}
									}
									anHtml +='<p><span>【答案】'+daString+'</span><p>';
								}
								anHtml +='<p><span>【解析】'+values[i].avs[z].answerDescription==null?"无":values[i].avs[z].answerDescription+'</p>';
							}
							var qcd = values[i].qcd;
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
									+'<span class="fr score">分值<input type="text" value="'+Curedata.questionQuScoreMap[key]+'" readonly="readonly"></span>'
								+'</p>'
								+'<div class="ques-info fl">'
									+qcd_title
									+qcd_content
									+qod
								+'</div>'
								+'<div class="answer"><div class="already_login">'
								+anHtml
								+'</div></div>'
								+'<div class="cl"><input name ="questionNo" type="hidden" value = "'+no+'"/><input class ="questionId" type="hidden" value = "'+values[i].id+'"/><input class ="questionTypeId" type="hidden" value = "'+key+'"/></div>'
								+'</div>';
						} 
					}); 
					$("#yl_tmlb").append(divHTML);
				}else{
					alert("您选择的在题库中题目的数量不足");
				}                
			},
			error: function(){
            	alert("您选择的在题库中题目的数量不足");
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
			var quQuantityVal = $(this).parent().parent().siblings().eq(0).find("div").eq(index).children(0).find("option:selected").val();
			var quScoreVal = $(this).parent().parent().siblings().eq(1).find("div").eq(index).children(0).val();
			
			questionQuQuantityMap[$(this).val()] = quQuantityVal;
			questionQuScoreMap[$(this).val()] = quScoreVal;
			questionTypeMap[$(this).val()] = $(this).next().html();
		});
		
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
			url:'${basePath!''}/papers/intelligence/list/save.htm',
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