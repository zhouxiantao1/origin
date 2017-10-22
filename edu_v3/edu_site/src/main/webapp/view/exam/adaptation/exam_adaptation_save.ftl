<!DOCTYPE html>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>自适应测试-发布自适应测验</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/fabu_auto_test.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/zTreeStyle/zTreeStyle.css">
	<script src="${basePath!''}/js/jquery.min.js"></script>
	<script src="${basePath!''}/js/placeholder.js"></script>
	<script src="${basePath!''}/js/common.js"></script>
	<script src="${basePath!''}/js/laydate/laydate.js"></script>
	<script src="${basePath!''}/js/jquery.ztree.all.min.js"></script>
</head>
<body>
<!-- 公共弹窗 -->
<#include '/common/popup.ftl' />

<!-- 引入公共头部 -->
<#include '/common/top.ftl' />

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>自适应测试&gt;发布自适应测验</h3>
					</div>
					<p class="back fr" onClick="javascript :history.back(-1);">返回上级</p>
				</div>

				<h3 class="jiance">测验设置</h3>
				<div class="test_set">
					<div class="totle_test">
						<span>测验名称：</span>
						<input type="text" placeholder="请输入测验名称" id="name" name="name" value="" onFocus="$('#name_msg_span').hide()" > 
						<b id="name_msg_span" class="name_msg" style="display: none;">注：该测试名称已存在！请输入其他名称</b>
					</div>
					
					<div class="choice_xueduan clearfix">
						<span>选择学段：</span>
						<ul class="clearfix" id="stage_choice">
							<!-- 学段  -->
							<#if search.stageId??>
								<#if bStageVos?? && bStageVos?size != 0>
									<#list bStageVos as bsv>
										<li onClick="switch_gradeandsubject(${bsv.id!''})" stage_id="${bsv.id!''}"  <#if bsv.id == search.stageId> class="active"</#if>>${bsv.name!''}</li>
									</#list>
								<#else>
									<li>暂无年段信息</li>
								</#if>
							</#if>
						</ul>
					</div>
					<div class="choice_grade clearfix">
						<span>选择年级：</span>
						<ul class="clearfix" id="grade_choice">
							<!-- 年级  -->
							<#if search.gradeId??>
								<#if bGradeVos?? && bGradeVos?size != 0>
									<#list bGradeVos as bgv>
										<li   grade_id="${bgv.id!''}" <#if bgv.id == search.gradeId> class="active"</#if>>${bgv.name!''}</li>
									</#list>
								<#else>
									<li>暂无年级信息</li>
								</#if>
							</#if>
						</ul>
					</div>
					<div class="choice_sub clearfix">
						<span>选择学科：</span>
						<ul class="clearfix" id="subject_choice">
							<!-- 学科  -->
							<#if search.subjectId??>
								<#if bSubjectVos?? && bSubjectVos?size != 0>
									<#list bSubjectVos as bsv>
										<li   subject_id="${bsv.id!''}" <#if bsv.id == search.subjectId> class="active"</#if>>${bsv.name!''}</li>
									</#list>
								<#else>
									<li>暂无学科信息</li>
								</#if>
							</#if>
						</ul>
					</div>

					<div class="totle_test">
						<span>监测题量：</span>
						<input type="text" name="num" id="num" placeholder="请输入题目数"  value="30"  onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
					</div>

					<div class="knowledge clearfix">
						<span class="kg fl">知识点：</span>
						<ul class="ztree fl" id="treeNode_knowledge" style="width: 320px;"></ul>
						<p class="test_count fl">共检索到试题<span id="question_num_span" class="question_num">0</span>题</p>
					</div>

					<div class="test_time clearfix">
						<span class="tt fl">测验时间：</span>
						<div class="three clearfix fl">
							<!-- <p class="fl start_time"><span>开始时间：</span><input type="text" name=""></p>
							<p class="fl end_time"><span>结束时间：</span><input type="text" name="testStartTime"></p> -->
							<p class="fl start_time"><span>开始时间：</span><input class="laydate-icon" id="start" type="text" name="testStartTime"></p>
							<p class="fl end_time"><span>结束时间：</span><input  class="laydate-icon" id="end" type="text" name="testEndTime"></p> 
							<p class="fl text_long"><span>考试时长：</span><input class="minutes_time" type="text" placeholder="请输入考试时长"   name="duration" id="duration" value="20"   onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">&nbsp;&nbsp;&nbsp;单位(分钟)</p>
						</div>
					</div>

					<div class="test_reduce">
						<span class="tr">测验简介：</span>
						<textarea placeholder="请输入本次测验的简介（可不填），限500字" id="remark" name="remark" >这是一场自适应测试</textarea>
					</div>
				</div>
				
				<@security.authorize url="/exam/adaptation/list/save.htm">
				<div class="operation">
					<button class="next" onClick="sub_exam_adaptation()" id="submit_button">提交</button>
				</div>
				</@security.authorize>
			</div>

		</div>
	</div>

	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>
	

<script type="text/javascript">

	
	$(function(){	
	
		//学科选中样式
		$('.choice_sub').on('click','li',function(){
			$('.choice_sub li').removeClass('active');
			$(this).addClass('active');
			loadknowledge();
		})
		//年级选中样式
		$('.choice_grade').on('click','li',function(){
			$('.choice_grade li').removeClass('active');
			$(this).addClass('active');
			loadknowledge();
		})
		//学段选中样式
		$('.choice_xueduan').on('click','li',function(){
			$('.choice_xueduan li').removeClass('active');
			$(this).addClass('active');
			loadknowledge();
		})

		
		// 时间控件加载
		addDate('#start','#end');
		

		//加载树菜单
		loadknowledge();
	

	})
	
	
	function checkNumber(theObj) {
	  var reg = /^\+?[1-9][0-9]*$/;  
	  if (reg.test(theObj)) {
	    return true;
	  }
	  return false;
	}
	
	
	function loadknowledgeTree(zNodes){
	
		//树形菜单
		var setting = {
			showLine: false, 
			checkable: true,
			check:{	
				enable:true,
				chkboxType:{'Y':'ps','N':'ps'}
			},
			callback:{
				onClick: zTreeOnClick,
				onCheck: zTreeOnCheck
			}
		}
		
		var zTreeObj;
		zTreeObj = $.fn.zTree.init($("#treeNode_knowledge"), setting, zNodes);	//初始化树
		
	}
	
	
	//加载知识点
	function loadknowledge(){
	
		$('#question_num_span').html('0');
	
		$('#treeNode_knowledge').empty();
		$('#treeNode_knowledge').append('<li>加载中...</li>');
	
		var stageId = $('#stage_choice li.active').attr('stage_id');
		var gradeId = $('#grade_choice li.active').attr('grade_id');
		var subjectId  = $('#subject_choice li.active').attr('subject_id');
	
		$.ajax({  
          type:'get',  
          url:'${basePath!''}/base/knowledge/treelistbysearch.htm',  
          data:{'gradeId':gradeId,'stageId':stageId,'subjectId':subjectId},
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
	
	function zTreeOnClick(event, treeId, treeNode) {
		
	    alert(treeNode.id + ", " + treeNode.name);
	    
	};
	
	function zTreeOnCheck(event,treeId,treeNode){
	
		 var treeObj=$.fn.zTree.getZTreeObj("treeNode_knowledge");
    	 nodes=treeObj.getCheckedNodes(true);
		 var know_ids = new Array();
    	
    	 if(nodes.length==0){
    		alert('请选中关联的知识点');
    		$('#question_num_span').html('0');
    		return;
    	 }else{
	        for(var i=0;i<nodes.length;i++){
		        know_ids.push(nodes[i].id); //获取选中节点的值
			}
		 }
		 
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/exam/adaptation/question/num/get.htm?timer='+ new Date().getTime(), 
		    data:{'knowIds':know_ids}, 
		    success:function(data){  
		    	$('#question_num_span').html(data);
		    }  
	 	});
	}
	
	
	//根据学段切换年级跟学科信息
	function switch_gradeandsubject(stageId){
	
		
		$('#subject_choice').empty();
		$('#subject_choice').append("<li>加载中...</li>");
		
		// 学科信息
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/base/subject/listbystageid.htm', 
		    data:{'stageId':stageId}, 
		    success:function(data){  
		    	$('#subject_choice').empty();
		    	var subject_html = "";
		    	for(var i = 0;i<data.length;i++){
		    		if(i == 0){
		    			subject_html += '<li  onClick=""  class="active" subject_id="'+ data[i].id+'">'+data[i].name+'</li>';
		    		}else{
		    			subject_html += '<li    subject_id="'+ data[i].id+'">'+data[i].name+'</li>';
		    		}
		    	}
		    	$('#subject_choice').append(subject_html);
		    }  
	 	});
	 	
	 	
	 	$('#grade_choice').empty();
		$('#grade_choice').append("<li>加载中...</li>");
	 	// 年级/册信息
	 	$.ajax({  
			type:'get',  
		    url:'${basePath!''}/base/grade/listbystageid.htm', 
		    data:{'stageId':stageId}, 
		    success:function(data){  
		    	$('#grade_choice').empty();
		    	var grade_html = "";
		    	for(var i = 0;i<data.length;i++){
		    		if(i == 0){
		    			grade_html += '<li    class="active" grade_id="'+ data[i].id+'">'+data[i].name+'</li>';
		    		}else{
		    			grade_html += '<li    grade_id="'+ data[i].id+'">'+data[i].name+'</li>';
		    		}
		    	}
		    	$('#grade_choice').html(grade_html);
		    }  
	 	});
	 	
	}
	
	
	function sub_exam_adaptation(){
		
	    
		var flag = true;
	
		//判断自适应测试名称是否存在
		if($('#name').val() == ''){
			alert('请输入自适应测试名称');
			return;
		}else{
			
			$.ajax({  
			    url:'${basePath!''}/exam/adaptation/name/check.htm', 
			    async: false,
			    data:{
			    	'name':$('#name').val()                                   // 自适应测试名称
			    }, 
			    success:function(data){  
			    	if(data == 1){
			    		$('#name_msg_span').show();
			    		flag = false;
			    	}
			    } ,
			    error: function(xhr,status,error) { 
			       if(error=='Forbidden'){
			       		alert('[验证自适应名称是否存在]权限不足');
			       }else{
			       		alert('系统出错!');
			       }
				   flag = false;
				} 
		 	});
	 	}
	 	
	 	if(!flag){
	 		return;
	 	}
	
		var stageId = $('#stage_choice  li.active').attr('stage_id');
		var gradeId = $('#grade_choice  li.active').attr('grade_id');
		var subjectId  = $('#subject_choice  li.active').attr('subject_id');
	
		var treeObj=$.fn.zTree.getZTreeObj("treeNode_knowledge");
    	nodes=treeObj.getCheckedNodes(true);
    	var know_ids = new Array();
    	
    	if(nodes.length==0){
    		alert('请选中关联的知识点');
    		
    		return;
    	}else{
	        for(var i=0;i<nodes.length;i++){
		        know_ids.push(nodes[i].id); //获取选中节点的值
			}
		}
		
		
		if($('#num').val()==''){
			
			alert('请输入测试的题目数量');
			return;
		
		}
		
		if($('#duration').val()==''){
			
			alert('请输入测试的考试时长');
			return;
		
		}
		
		if($('#start').val()==''){
			
			alert('请选择开始时间');
			return;
		
		}
		
		if($('#end').val()==''){
			
			alert('请选择结束时间');
			return;
		
		}
		
		
		if(parseInt($('#question_num_span').html()) < parseInt($('#num').val())){
			alert('您选择的知识点下的试题数量不满足创建测试的最低要求');
			return;
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
		    url:'${basePath!''}/exam/adaptation/list/save.htm', 
		    data:{
		    	'name':$('#name').val(),                                   // 自适应测试名称
		    	'stageId':stageId,                            //学段id
		    	'subjectId':subjectId,                        //学科id
		    	'gradeId':gradeId,                            //年级id
		    	'num':$('#num').val(),                         //题量（测试的试题数量）
		    	'duration':$('#duration').val(),               //时长（单位分钟
		    	'start':$('#start').val(),     //测试开始时间
		    	'end':$('#end').val(),         //测试结束时间
		    	'remark':$('#remark').val(),                   //简介
		    	'knowIds':know_ids,
		    }, 
		    success:function(data){  
		    
		    	if(data==1){
		    		popup(5);
		    		window.location.href="${basePath!''}/exam/adaptation/list.htm"; 
		    	}else{
		    		alert('失败！');
		    	}
		    	
		    } ,
		    error: function(xhr,status,error) { 
		       if(error=='Forbidden'){
		       		alert('[创建自适应测试]权限不足');
		       }else{
		       		alert('系统出错!');
		       }
			   flag = false;
			} 
	 	});
		
		
		
		
		
	
	}
	
	

</script>
	
</body>
</html>