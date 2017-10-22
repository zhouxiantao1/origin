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
<meta name="save" content="history">
<style>
　　 .saveHistory {behavior:url(#default#savehistory);}
</style>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>问卷量表库&gt;问卷管理&gt;新建问卷</h3>
					</div>
					<p class="back fr" onClick="back_list()">返回上级</p>
				</div>
				<div class="preview clearfix">
					<button class='fr' onclick="save_paper()">保存问卷</button>
				</div>
				<div class="basic_msg">
					<h3>填写基本信息</h3>
					<div class="basic clearfix">
						<div class="add_title fl">
							<span>问卷标题：</span><input type="text" id="paper_title" name="" placeholder="请输入标题">
						</div>
						<div class="gl_target fl">
							<span>关联指标体系：</span>
							<select id="paper_indicator" onChange="quary_next_indicator()">
								<#if evaluateIndicatorVoList?? && evaluateIndicatorVoList?size!=0>
									<#list evaluateIndicatorVoList as evaluateIndicatorVo>
										<option value=${evaluateIndicatorVo.id!''} >${evaluateIndicatorVo.name!''}</option>
									</#list>
								</#if>
							</select>
						</div>
					</div>
					
					<div class="add_reduces">
						<span>问卷介绍：</span><textarea class=saveHistory id="paper_content" placeholder="添加问卷介绍（可不填），限500字"></textarea>
					</div>
				</div>
				
				<div class="add_button clearfix">
					<button>添加题目</button>
				</div>
				
				<div class="add_question">
					<div class="contain clearfix">
						<div class="choice_tixi fl">
							<span>选择题目关联指标：</span>
							<select id="question_indicator">
							</select>
						</div>
						<div class="choice_type fl">
							<span>选择题型：</span>
							<select id="question_type" onChange="change_type()">
								<option value='1'>单选题</option>
								<option value='2'>多选题</option>
							</select>
						</div>
					</div>
					
					<div class="set_question">
						<div class="timu clearfix">
							<span class="fl">题目：</span>
							<div class="title fl ue-after">请输入题目</div>
						</div>

						<div class="answers">
							<div class="ans_one clearfix">
								<span class="fl">答案：</span>
								<div class="choices fl">
									<div class="ans clearfix">
										<label class="fl"><input type="radio" class="set_type" name="da"> <span>A</span></label>
										<div class="bd_one fl ue-after" id="select_A">输入选项</div>
										<div class="score fr">
											<span>分值：</span>
											<input type="number" name="" placeholder="可不设">
										</div>
									</div>

									<div class="ans clearfix">
										<label class="fl"><input type="radio" class="set_type" name="da"> <span>B</span></label>
										<div class="bd_one fl ue-after" id="select_B">输入选项</div>
										<div class="score fr">
											<span>分值：</span>
											<input type="number" name="" placeholder="可不设">
										</div>
									</div>

									<div class="ans clearfix">
										<label class="fl"><input type="radio" class="set_type" name="da"> <span>C</span></label>
										<div class="bd_one fl ue-after" id="select_C">输入选项</div>
										<div class="score fr">
											<span>分值：</span>
											<input type="number" name="" placeholder="可不设">
										</div>
									</div>


									<div class="ans clearfix">
										<label class="fl"><input type="radio" class="set_type" name="da"> <span>D</span></label>
										<div class="bd_one fl ue-after" id="select_D">输入选项</div>
										<div class="score fr">
											<span>分值：</span>
											<input type="number" name="" placeholder="可不设">
										</div>
									</div>
								
									
								</div>
							</div>
							<div class="add_reduce clearfix">
								<button class="add fr">添加选项</button>
								<button class="reduce fr">减少选项</button>
							</div>
						</div>
					</div>

					<div class="queding">
						<button class="confirm">确定</button>
						<button class="cancel">取消</button>
					</div>
				</div>

				<div class="topic_show">
					<h3>答卷信息</h3>
					<#if evaluatePaperQuestionVoList?? && evaluatePaperQuestionVoList?size!=0>
						<#list evaluatePaperQuestionVoList as evaluatePaperQuestionVo>
							<div class="topic_detail">
								<p class="tit">${evaluatePaperQuestionVo.sort!''}.${evaluatePaperQuestionVo.content!''}</p>
								<#if evaluatePaperQuestionVo.evaluateSelectionVoList?? && evaluatePaperQuestionVo.evaluateSelectionVoList?size!=0>
									<#list evaluatePaperQuestionVo.evaluateSelectionVoList as evaluateSelectionVo>
										<#if evaluatePaperQuestionVo.type=='1'>
											<p class="ans_one"><label><span>${evaluateSelectionVo.selectNum!''}</span> <input type="radio" name="aaa"></label>${evaluateSelectionVo.content!''}</p>
										<#else>
											<p class="ans_one"><label><span>${evaluateSelectionVo.selectNum!''}</span> <input type="checkbox" name="aaa"></label>${evaluateSelectionVo.content!''}</p>
										</#if>
									</#list>
								</#if>
							</div>
						</#list>
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

	<div class="bao">
		<div class="edit eidt_width fl clearfix" id="edit">
			<script type="text/plain" name='content' id="ue_edit" class="ques-hl" style="width: 99%;margin: 10px;"></script>
			<button class="edit_finish">编辑完毕</button>
			<!-- <script>
		        var time = new Date().valueOf();
		        $('#ue_edit').attr('id',"ue_edit"+time)
		        UEedit = new UE.ui.Editor();
		        UEedit.render('ue_edit' + time);
		        /*编辑完成*/
		        $('.edit_finish').click(function () {
		            var cont = UEedit.getContent();
		            var $p_items = $(this).parent().prev().find(".ue-after");
		            $p_items.html(cont);
		            $(this).parents('#edit').hide();
		        })
		    </script> -->
		</div>
	</div>


<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/UE/ueditor.config.js"></script>
<script src="${basePath!''}/js/UE/ueditor.all.js"></script>
<script type="text/javascript">
	$(function(){
		//初始化赋值
		<#if evaluatePaperVo??>
			$('#paper_title').val('${evaluatePaperVo.title!''}');
			$('#paper_indicator').val(${evaluatePaperVo.indicatorId!''});
			$('#paper_content').val('${evaluatePaperVo.introduction!''}');
		</#if>
		
		$('.add_button button').on('click',function(){
			$('.add_question').show();
		})


		$('body').on('click','.title,.bd_one',function(){
			//如果存在其他的编辑器 即移除
			if (typeof UEedit != 'undefined') {
                var cont = UEedit.getContent();
	            var $p_items = $(this).parent().prev(".ue-after");
	            $p_items.html(cont);
	            $(this).parents('#edit').hide();
                /*删除旧的编辑器*/
                $('.set_question').find('#edit').remove();
                UE.delEditor('ue_edit');
            }
			
			var html = $(this).html();
			var ueHtml = $('.bao').html();
			$(this).after(ueHtml);	//插入编辑器

			var time = new Date().valueOf();
	        $('#ue_edit').attr('id',"ue_edit"+time)
	        UEedit = new UE.ui.Editor();
	        UEedit.render('ue_edit' + time);
	        UEedit.ready(function () {
                UEedit.setContent(html);
            })
		})

		/*编辑完成*/
        $('body').delegate('.edit_finish','click',function () {
            var cont = UEedit.getContentTxt();
            var $p_items = $(this).parent().prev(".ue-after");
            $p_items.html(cont);
            $(this).parents('#edit').hide();
        })



		
		var i = 4;	//charCode
		//减少选项
		$('.add_reduce .reduce').on('click',function(){
			$('.ans').last().remove();
			if(i>=0){
				i--;
			}
		})
		//添加选项
		$('.add_reduce .add').on('click',function(){
			var html = '<div class="ans clearfix">' +
					'<label class="fl"><input type="radio" class="set_type" name="da"> ' +
						'<span>'+ String.fromCharCode(65 + i) +'</span>'+
					'</label>' + 
					'<div class="bd_one fl ue-after" id="select_'+String.fromCharCode(65 + i)+'">输入选项</div>'+
						'<div class="score fr">' +
							'<span>分值：</span>' + 
							'<input type="number" name="" placeholder="可不设">' + 
						'</div>' + 
					'</div>'

			$('.choices').append(html);
			change_type();
			i++;
		})
		
		quary_next_indicator();   //初始给问题指标值
		
		//保存题目和选项
		$('.confirm').on('click',function(){
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/evaluate/paperQuestion/list/save.htm?',
				data:{'paperId':${paperId!''},'content':$(".title").html(),'indicatorId':$("#question_indicator").val(),'sort':${sortMax!''},'type':$("#question_type").val()}, 
				async: false,
				success:function(data){  
					for(var j=0; j<i ;j++){		
						$.ajax({  
							type:'get',  
							url:'${basePath!''}/evaluate/selection/list/save.htm?',
							data:{'questionId':data,'selectNum':String.fromCharCode(65 + j),'selectScore':1,'sort':j+1,'content':$("#select_"+String.fromCharCode(65 + j)).html()}, 
							async: false,
							success:function(data){  
								
							}  
						});
					}
					dataBack();	
				}  
			});	

		})
		
		//返回列表
		$('.back').on('click',function(){
			delete_paper();
			window.location.href="${basePath!''}/evaluate/paper/list.htm?";
		})
		
		//题目取消
		$('.cancel').on('click',function(){
			dataBack();
		})

    })
    
   
    
    //查询下级指标体系
    function quary_next_indicator(){
    	var html ="";
    	$.ajax({  
			type:'get',  
			url:'${basePath!''}/evaluate/indicator/listbysearch.htm?',
			data:{'parentId':$("#paper_indicator").val()}, 
			async: false,
			success:function(data){  
				 var Curedata = $.extend(true, [], data);
				 if (Curedata != null) {
			        for ( var i = 0; i < Curedata.length; i++) {
			        	var children1 = $.extend(true, [], Curedata[i].children);
			            html += "<option value='"+Curedata[i].id+"'>"+ Curedata[i].name
			                    + "</option>";
			            var childrenList = $.extend(true, [], Curedata[i].children);
			            for(var j in childrenList){
			            	html += "<option value='"+childrenList[j].id+"'>&nbsp&nbsp&nbsp"+ childrenList[j].name
			                    + "</option>";
			            } 
			        }	
			    }
				$("#question_indicator").html(html);				
			}  
		});
    }
    
    //刷新本页
    function dataBack(){
    	//var url = "${basePath!''}/evaluate/paper/create.htm?";	
		//var data = "id=${paperId!''}&title="+$("#paper_title").val()+"&introduction="+$("#paper_content").val()+"&indicatorId="+$("#paper_indicator").val();
		//先更新问卷再刷新
		update_paper();
		window.location.reload();
    }
    
    //更新问卷
    function update_paper(){
    	$.ajax({  
			type:'get',  
			url:'${basePath!''}/evaluate/paper/listbyid/update.htm?',
			data:{'id':${paperId!''},'title':$("#paper_title").val(),'introduction':$("#paper_content").val(),'indicatorId':$("#paper_indicator").val(),'issueNum':0,'useNum':0}, 
			async: false,
			success:function(data){  
				update_indicator();
				var url = "${basePath!''}/evaluate/paper/list.htm?";
				window.location.href= url;				
			}  
		});
    }
    
    //保存问卷
    function save_paper(){
    	$.ajax({  
			type:'get',  
			url:'${basePath!''}/evaluate/paper/listbyid/update.htm?',
			data:{'id':${paperId!''},'title':$("#paper_title").val(),'introduction':$("#paper_content").val(),'indicatorId':$("#paper_indicator").val(),'issueNum':0,'useNum':0,'delflag':'0'}, 
			async: false,
			success:function(data){  
				update_indicator();
				var url = "${basePath!''}/evaluate/paper/list.htm?";
				window.location.href= url;				
			}  
		});
    }
    
    //更新指标体系的使用次数
    function update_indicator(){
    	$.ajax({  
			type:'post',  
			url:'${basePath!''}/evaluate/indicator/listbyid/update.htm?',
			data:{'id':$("#paper_indicator").val(),'useNum':1}, 
			async: false,
			success:function(data){}  
		});
    }
    
    //物理删除
    function delete_paper(){
    	$.ajax({  
			type:'get',  
			url:'${basePath!''}/evaluate/paper/listbyid/update.htm?',
			data:{'id':${paperId!''},'delflag':'1'}, 
			async: false,
			success:function(data){}  
		});
    }
    
    //获取url参数
    function getQueryString(key){
        var reg = new RegExp("(^|&)"+key+"=([^&]*)(&|$)");
        var result = window.location.search.substr(1).match(reg);
        return result?decodeURIComponent(result[2]):null;
      }
	
	//单选或者多选转换
	function change_type(){
		if($("#question_type").val()=='1'){
			$(".set_type").attr("type","radio");
		}else if($("#question_type").val()=='2'){
			$(".set_type").attr("type","checkbox");
		}
	}

</script>

</body>
</html>