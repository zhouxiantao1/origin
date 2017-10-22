<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>问卷量表库-问卷管理-新建问卷</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/add_new_paper.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
			
				<div class="preview clearfix">
					<button class='fr'>预览问卷</button>
				</div>
				<div class="basic_msg">
					<h3>填写基本信息</h3>
					<div class="basic clearfix">
						<div class="add_title fl">
							<span>问卷标题：</span><input type="text" name="" placeholder="请输入标题">
						</div>
						<div class="gl_target fl">
							<span>关联指标体系：</span>
							<select>
								<option>请选择指标体系</option>
								<option>指标体系一</option>
								<option>指标体系二</option>
							</select>
						</div>
					</div>
					
					<div class="add_reduces">
						<span>问卷介绍：</span><textarea placeholder="添加问卷介绍（可不填），限500字"></textarea>
					</div>
					<div class="add_reduces">
						<span>题目数量：</span><span>单选题(0)</span><span>多选题(0)</span>
					</div>
				</div>

				<div class="add_button clearfix">
					<button>添加题目</button>
				</div>

				<div class="add_question">
					<div class="contain clearfix">
						<div class="choice_tixi fl">
							<span>选择题目关联指标：</span>
							<select>
								<option>请选择</option>
								<option>指标一</option>
								<option>指标二</option>
							</select>
						</div>
						<div class="choice_type fl">
							<span>选择题型：</span>
							<select id = "question_type" onchange="select_question_type()">
								<option value = '1'>单选题</option>
								<option value = '2'>多选题</option>
							</select>
						</div>
					</div>
					
					<div class="set_question">
						<div class="timu clearfix">
							<span class="fl">题目：</span>
							<div class="title fl"></div>
						</div>
						<div class="edit eidt_width clearfix">
							<script type="text/plain" name='content' id="topic" class="ques-hl"></script>
							<button>编辑完毕</button>
						</div>
						
						<div class="answers">
							<div class="ans_one clearfix">
								<span class="fl">答案：</span>
								<div class="choices fl" id="selection">
									
								</div>
							</div>
							<div class="add_reduce clearfix">
								<button class="add fr" onclick="update_selectnum('add')">添加选项</button>
								<button class="reduce fr onclick="update_selectnum('minus')">减少选项</button>
							</div>
						</div>
					</div>

					<div class="queding">
						<button class="confirm">确定</button>
						<button class="cancel">取消</button>
					</div>
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
<script src="${basePath!''}/js/UE/ueditor.config.js"></script>
<script src="${basePath!''}/js/UE/ueditor.all.js"></script>

<script type="text/javascript">
	var wordList = new Array("A","B","C","D","E","F","G","H","I","J","K");
    var wordMinList = new Array("a","b","c","d","e","f","g","h","i","j","k");
    var htmlList=new Array(11)
    var selectNum = 5;
    
    //初始化数据
	$(function(){
		var ue = UE.getEditor('topic');
		var selectHtml = "";
		
		for(i=0 ; i<selectNum; i++){
			var ue = UE.getEditor("ans_"+wordMinList[i]);
		}
		runAdd('radio',selectNum)
		
		for(i=0 ; i<selectNum; i++){
			selectHtml +=htmlList[i];
		}
		$("#selection").html(selectHtml);
		$('.add_question').hide();
		
		$('.add_button button').on('click',function(){
			$('.add_question').show();
			$(this).hide();
		})
		
		$('.title,.bd_one').on('click',function(){
			$('.edit').hide();
			$(this).parent().next('.edit').show();
		})
		
    })
    
    function init(){
  
		$('.title,.bd_one').on('click',function(){
			$('.edit').hide();
			$(this).parent().next('.edit').show();
		})
		
    }
    
    //通过题型选择显示类型
    function select_question_type(){
    	alert($("#question_type").val());
    	if($("#question_type").val()=='1'){
    		question_type('radio');
    	}else if($("#question_type").val()=='2'){
    		question_type('checkbox');
    	}
    }
    
    //添加或者减少选项
    function update_selectnum(update_type){
    	if(selectNum==0||selectNum==11){
    		alert('已经没有选项或已经超出选项数');
    	}else{
    		if(update_type=='add'){
    			if($("#question_type").val()=='1'){
		    		htmlList[selectNum] = question_type('radio');
		    		selectNum ++;
		    	}else if($("#question_type").val()=='2'){
		    		htmlList[selectNum] = question_type('checkbox');
		    		selectNum ++;
	    		}
    		}else if(minus=='minus'){
    			if($("#question_type").val()=='1'){
		    		htmlList.remove(selectNum-1);
		    		selectNum --;
		    	}else if($("#question_type").val()=='2'){
		    		htmlList.remove(selectNum-1);
		    		selectNum --;
	    		}
    		}
    		var selectHtml = "";
    		for(i=0 ; i<selectNum; i++){
				var ue = UE.getEditor("ans_"+wordMinList[i]);
			}
	    	for(i=0 ; i<selectNum; i++){
				selectHtml +=htmlList[i];
			}
			$("#selection").html(selectHtml);
			init()
    	}
    }
    function runAdd(type){
    	for(i=0; i<selectNum ; i++){
    		htmlList[i] = question_type(type);	
    	}
    }
    
    //添加选项
    function question_type(type){
    	var html="";
    	if(type=='radio'){
	    		html	="<div class='ans clearfix'>"+
									"<label class='fl'><input type='radio' name='da'> <span>"+wordList[i]+"</span></label>"+
									"<div class='bd_one fl' id='content_"+wordMinList[i]+"'>输入问题</div>"+
									"<div class='score fr'>"+
										"<span>分值：</span>"+
										"<input type='number' name='' placeholder='可不设'>"+
									"</div>"+
								"</div>"+
								"<div class='edit clearfix'>"+
									"<script type='text/plain' name='content' id='ans_"+wordMinList[i]+"' class='ques-hl' />"+
									"<button onclick='content_value("+i+")'>编辑完毕</button>"+
								"</div>";
    	}
    	if(type=='checkbox'){
	    		html	="<div class='ans clearfix'>"+
									"<label class='fl'><input type='checkbox' name='da'> <span>"+wordList[i]+"</span></label>"+
									"<div class='bd_one fl'>输入问题</div>"+
									"<div class='score fr'>"+
										"<span>分值：</span>"+
										"<input type='number' name='' placeholder='可不设'>"+
									"</div>"+
								"</div>"+
								"<div class='edit clearfix'>"+
									"<script type='text/plain' name='content' id='ans_"+wordMinList[i]+"' class='ques-hl' />"+
									"<button>编辑完毕</button>"+
								"</div>";
    	}
    	return html;
    }
    
    
    
    //答案编辑完成后显示出来   
    function content_value(contentValue){
    	var content = UE.getEditor("ans_"+wordMinList[contentValue]);
    	$("#content_"+wordMinList[contentValue]).html(content.getContent());
    	$('.edit').hide();
    }

</script>

</body>
</html>