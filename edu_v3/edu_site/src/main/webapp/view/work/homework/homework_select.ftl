<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>试卷管理-题库选题</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/tiku_select.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>在线作业>布置作业>选题</h3>
					</div>
				</div>

				<div class="subject">
					<div class="grade clearfix">
						<span class="fl">章节：</span>
						<select id="catalogdetailId"  onchange="catalogdetail()">
							<#if baseCatalogDetailVoList?? && baseCatalogDetailVoList?size != 0>
								<#list baseCatalogDetailVoList as baseCatalogDetailVo>
									<option value = "0,${baseCatalogDetailVo.id!''}">${baseCatalogDetailVo.name!''}</option>
									<#if baseCatalogDetailVo.bcdvs?? && baseCatalogDetailVo.bcdvs?size !=0>
										<#list baseCatalogDetailVo.bcdvs as baseCatalogDetailVo1>
											<option value = "0,${baseCatalogDetailVo1.id!''}">&nbsp&nbsp${baseCatalogDetailVo1.name!''}</option>
											<#if baseCatalogDetailVo1.baseKnowledgeVoList?? && baseCatalogDetailVo1.baseKnowledgeVoList?size !=0>
												<#list baseCatalogDetailVo1.baseKnowledgeVoList as baseKnowledge>
													<option value = "1,${baseKnowledge.bkv.id!''}">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp${baseKnowledge.bkv.name!''}</option>
												</#list>
											</#if>
										</#list>
									</#if>
								</#list>
							</#if>
						</select>
					</div>
					<div class="subject_choice clearfix">
						<span class="fl">题型：</span>
						<ul class="clearfix fl">
							<#if questionTypeVoList?? && questionTypeVoList?size != 0>
								<#list questionTypeVoList as questionTypeVo>
									<li>${questionTypeVo.typeName}(3379道)</li>
								</#list>
							</#if>
						</ul>
					</div>
				</div>

				<div class="sort clearfix">
					
					<div class="mingti fr">
						<span class="fl" id ="questionNum" ></span>
						<div class="fl join"> <i>+</i> 全部加入作业</div>
						<div class="fl create" onClick="goviewQuestion()">生成预览</div>
					</div>
				</div>


				<div class="questions" id= "questions">
					<div class="tips">
						<span>提示：但集体面可现实答案和解析</span>
						<label><input type="checkbox" name=""><i>显示全部答案和解析</i></label>
					</div>

				</div>
			<!-- 分页 -->
				<div class="page">
					<ul id="turnPage">
						<li>第一页<i></i></li>|
						<li>下一页</li>
					</ul>
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
	var relatedId = '';
	var relatedType = '';
	var type = '';
	
	$(function(){
		relatedType = "1";
		intQuestion();
		
	});
	
	function catalogdetail(){
		var str =  $("#catalogdetailId").val().split(",");
		relatedId =  Number(str[1]);
		if(str[0]==0){
			relatedType =1;
		}else{
			relatedType =2;
		}
		getQuestion()
	}
	
	function getKnowlede(){
		var html = '';
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/knowledge/catalogDetail/listbysearch.htm',  
          data:{'catalogdetailId':$("#catalogdetailId").val()},
          async: false,
          success:function(data){  
        	  var Curedata = $.extend(true, [], data);      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			        	var baseKnowlegeVo = $.extend(true, [], Curedata[i].bkv);
			            html += "<option value='"+baseKnowlegeVo.id+"'>"+ baseKnowlegeVo.name
			                    + "</option>";
			           
			        }	
			        $("#knowledgeId").html(html);
		    }                
          }  
       });	
	}
	
	
	
	function getQuestion(){
		var html = '';
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/questionRelated/page/list.htm',  
          data:{'relatedId':relatedId,'relatedType':relatedType},
          async: false,
          success:function(data){  
        	  var Curedata = $.extend(true, [], data.list);  
        	     	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			        	var qcd = $.extend(true, [], Curedata[i].questionWareVo.qcd);
			        	
			        	var qods = $.extend(true, [], Curedata[i].questionWareVo.qods);
			        	var select = '选项：</br>';
			        	for(var j = 0; j <qods.length;j++ ){
			        		select += qods[j].content+"<br>";
			        	}
			        	
			        	var avs = $.extend(true, [], Curedata[i].questionWareVo.avs);
			        	var answer = '';
			        	for(var k = 0; k < avs.length;k++){
			        		answer +=avs[k].answerDescription; 
			        	}  
			            
			     html +="<div class='item'>"+
						"<div class='question'>"+
							"<p>【题文】</br></p>"+
							qcd.title+"</br>"+
							select+
							"<p>【答案解析】</p>"+
							answer+"</br>"+
						"</div>"+

						"<div class='operation clearfix'>"+
							"<p class='fl'><span>曝光率：1%</span><span>难度:(较易0.35)</span><span>能力目标：理解</span></p>"+
							"<ul class='fr clearfix'>"+
								"<li><img src='${basePath!''}/images/纠错.png'><i>纠错</i></li>"+
								"<li><img src='${basePath!''}/images/收藏.png'><i>收藏</i></li>"+
								"<li class='join_paper' onClick='saveHomework("+questionId+")'>加入作业</li>"+
							"</ul>"+
						"</div>"+
					"</div>";
			           
			        }	
			        $("#questions").html(html);
		    }                
          }  
       });  
	}
	
	function intQuestion(){
		var html = '';
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/questionRelated/page/list.htm',  
          data:{"relatedIds":"${str}","relatedType":relatedType},
          async: false,
          success:function(data){  
        	  var Curedata = $.extend(true, [], data.list); 
        	  $("#questionNum").html("共<i>"+data.rows+"</i>道试题");      	  
			    if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			        	var qcd = $.extend(true, [], Curedata[i].questionWareVo.qcd);
			        	
			        	var qods = $.extend(true, [], Curedata[i].questionWareVo.qods);
			        	var select = '选项：</br>';
			        	for(var j = 0; j <qods.length;j++ ){
			        		select += qods[j].content+"<br>";
			        	}
			        	var questionId = Curedata[i].questionWareVo.id;
			        	var avs = $.extend(true, [], Curedata[i].questionWareVo.avs);
			        	var answer = '';
			        	for(var k = 0; k < avs.length;k++){
			        		answer +=avs[k].answerDescription; 
			        	}
			        	  
			            
			     html +="<div class='item'>"+
						"<div class='question'>"+
							"<p>【题文】</br></p>"+
							qcd.title+"</br>"+
							select+
							"<p>【答案解析】</p>"+
							answer+"</br>"+
						"</div>"+

						"<div class='operation clearfix'>"+
							"<p class='fl'><span>曝光率：1%</span><span>难度:(较易0.35)</span><span>能力目标：理解</span></p>"+
							"<ul class='fr clearfix'>"+
								"<li><img src='${basePath!''}/images/纠错.png'><i>纠错</i></li>"+
								"<li><img src='${basePath!''}/images/收藏.png'><i>收藏</i></li>"+
								"<li class='join_paper' onClick='saveHomework("+questionId+")'  >加入作业</li>"+
							"</ul>"+
						"</div>"+
					"</div>";
			           
			        }	
			        $("#questions").html(html);
		    }                
          }  
       });
	}
	
	function saveHomework(questionId){
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/work/workQuestion/list/save.htm?', 
		    data:{'homeworkId':${homeworkId},'questionId':questionId}, 
		    success:function(data){  
		    	if(data!=0){
		    		alert('添加成功');
		    	}else{
		    		alert('添加失败！');
		    	}
		    }  
	 	});
	}
	
	function goviewQuestion(){
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/work/homework/listbyid/update.htm?', 
		    data:{'id':${homeworkId},'delflag':"0"}, 
		    success:function(data){  
		    	if(data!=0){
		    		alert('添加成功');
		    	}else{
		    		alert('添加失败！');
		    	}
		    }  
	 	});
		var url = "${basePath!''}/work/homework/homeworkview.htm?";
		var data = "id="+${homeworkId};
		window.location.href=url+data;
	}
	
</script>
</body>
</html>