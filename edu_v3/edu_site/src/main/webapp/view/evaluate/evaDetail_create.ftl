<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>测评管理-新建单次测评问卷</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/test_manage_addone.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/add_single_test.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/popup.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 

	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>测评管理&gt;新建测评管理</h3>
					</div>
					<p class="back fr" onclick="back_evaList()">返回上级</p>
				</div>

				<div class="add_name">
					
				</div>

				<h3 class="exam_set">测评设置</h3>
				<div class="exam_detail">
					<div class="test_name">
						<span><n style="color:#f90202">*</n>测评名称：</span>
						<input type="text" id="evaDetail_name" placeholder="请输入测评名称">
						<em id="title_msg" style="display:none"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">测评名称不可以为空</i></em>
					</div>

					<div class="test_object clearfix">
						<span class="fl">所属学段：</span>
						<ul class="fl clearfix" id="eva_stageId">
							<li class="active" value=1>小学</li>
							<li value=2>普通初中</li>
							<li value=3>普通高中</li>
						</ul>
					</div>
					
					<div class="test_object clearfix">
						<span class="fl">测评对象：</span>
						<ul class="fl clearfix" id="eva_object">
							<li class="active" value='1'>学生</li>
							<li value='2'>家长</li>
							<li value='3'>教师</li>
							<li value='4'>校长</li>
						</ul>
					</div>
					<div class="test_way clearfix">
						<span class="fl">问卷方式：</span>
						<label><input type="radio" name="way" checked value='0'><i>线上问卷</i></label>
						<label><input type="radio" name="way" value='1'><i>线下纸笔问卷</i></label>
					</div>
					
					<div class="test_object clearfix">
						<span class="fl">发布区域：</span>
						<ul class="fl clearfix" id="eva_area">
							<li class="active" value='1' id="all">全部</li>
							<li value='2'>荔湾区</li>
							<li value='3'>越秀区</li>
							<li value='4'>海珠区</li>
							<li value='5'>天河区</li>
							<li value='6'>白云区</li>
							<li value='7'>黄埔区</li></br></br>
							<li value='8'>番禺区</li>
							<li value='9'>花都区</li>
							<li value='10'>南沙区</li>
							<li value='11'>从化区</li>
							<li value='12'>增城区</li>
						</ul>
					</div>
					
					<div class="select_wenjuan">
						<span><n style="color:#f90202">*</n>选择问卷：</span>
						<p class="show_select"></p>
						<button class="add_one" onClick="paper_window()">+添加问卷</button>
						<em style="display:none" id="paper_msg"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">请选择问卷</i></em>
					</div>
						
					<div class="test_time clearfix">
						<span class="fl"><n style="color:#f90202">*</n>测评时间：</span>
						<div class="time_box fl">
							<p class="kssj">
								<span><n style="color:#f90202">*</n>开始时间：</span>
								<input class="laydate-icon date" id="start" type="text" name="testStartTime">
								<em style="display:none" id="start_msg"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">不能为空</i></em>
								<span><n style="color:#f90202">*</n>结束时间：</span>
								<input  class="laydate-icon clock" id="end" type="text" name="testEndTime">
								<em style="display:none" id="end_msg"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">不能为空</i></em>
							</p>
						</div>
					</div>

					<div class="test_intreduce clearfix">
						<span class="fl">测评简介：</span>
						<textarea class="fl daokao" id="evaDetail_introduction" placeholder="请输入考试简介"></textarea>
					</div>

					<div class="test_msg clearfix">
						<span class="fl">注意事项：</span>
						<textarea class="msg fl" id="evaDetail_remake"></textarea>
					</div>

				</div>

				<div class="baocun_1">
					<button class="click_me" onclick="save_evaDetail()">保存</button>
					<button class="qx" onclick="back_evaList()">取消</button>
				</div>
				
				<div class="pop_shade">
					<!-- 完成问卷调查 -->
					<div class="pop" type='2' style="display: none">
						<h3 class="hand_success clearfix">新增测试成功 <span class="fr"></span></h3>
						<div class="finish">
							<h3><img src="${basePath!''}/images/right.png"></h3>
							<p class="tip_msg"></p>
							<p class="check_report">
								<span class="now_check">查看测评</span> | <span class="i_know">返回列表</span>
							</p>
						</div>
					</div>
				</div>
				
				<div class="layer_select">
					<h3 class="select_paper_title">选择问卷</h3>
					<div class="select_paper_ope ">
						<div class="line_one clearfix">
							<div class="choice_zhibiao fl">
								<span>选择指标体系：</span>
								<select id="paper_indicator">
									<option value="">全部</option>
									<#if evaluateIndicatorVoList?? && evaluateIndicatorVoList?size!=0>
										<#list evaluateIndicatorVoList as evaluateIndicatorVo>
											<option value=${evaluateIndicatorVo.id!''}>${evaluateIndicatorVo.name!''}</option>
										</#list>
									</#if>
								</select>
							</div>
							<div class="paper_name_check fr">
								<span>问卷名称：</span>
								<input type="text" id="paper_title" name="">
								<button onClick="query_paper()">查询</button>
							</div>
						</div>
						<div class="nav_list">
						</div>
						<div class="contain"></div>
				
					</div>
					<div class="baocun">
						<button class="bc" onclick="get_paper()">确 定</button>
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
<script src="${basePath!''}/js/placeholder.js"></script>
<script src="${basePath!''}/js/laydate/laydate.js"></script>
<script src="${basePath!''}/layer/layer.js"></script> 
<script src="${basePath!''}/js/common.js"></script>
<script type="text/javascript">
	var eveObject = 1;
	var stageId = 1;
	var areaList = new Array();
	var paperId =null; //问卷id
	var evaDetailId=null;
	$(function(){
		//初始化问卷列表
		init();

		
		$('#eva_object').on('click','li',function(){
			$('#eva_object li').removeClass('active');
			$(this).addClass('active');
			eveObject = $(this).val();
		})
		
		$('#eva_stageId').on('click','li',function(){
			$('#eva_stageId li').removeClass('active');
			$(this).addClass('active');
			stageId = $(this).val();
		})
		
		$('#eva_area').on('click','li',function(){
			if($(this).val()==1){
				$('#eva_area li').removeClass('active');
			}else{
				$('#all').removeClass('active');
			}
			//$('#eva_area li').removeClass('active');
			if($(this).attr("class")=='active'){
				$(this).removeClass('active');
			}else{
				$(this).addClass('active');
			}	
		})
		
		//消息显示和隐藏
		$('#evaDetail_name').focus(function(){
			$('#title_msg').hide();
		})
		$('#evaDetail_name').blur(function(){
			var evaDetail_name = $('#evaDetail_name').val();
			if(evaDetail_name==null || evaDetail_name==""){
				$('#title_msg').show();
			}	
		})
		
		$('#start').focus(function(){
			$('#start_msg').hide();
		})

		
		$('#end').focus(function(){
			$('#end_msg').hide();
		})
		

    	//关闭弹窗
    	$('.hand_success span,.i_know').click(function(){
    		$('.pop_shade').hide();
    		window.location.href="${basePath!''}/evaluate/eva/list.htm?";
    	})
	})
	
	
	
	//查看页面
	function view_evaDetail(id){
		window.location.href="${basePath!''}/evaluate/evaDetail/edit.htm?id="+id;
	}

	//弹窗
	function popup(type){
    		$('.click_me').on('click',function(){
    			$('.pop_shade').show();
    			var this_ele = $('.pop_shade').find('.pop[type='+ type +']');
    			this_ele.show().siblings().hide();
    			$('.now_check').on('click',function(){
    				window.location.href="${basePath!''}/evaluate/evaDetail/edit.htm?id="+evaDetailId;
    			})
    		})
    	}
	
	//提示信息
	function message(){
		var str = "1";
		var name = $('#evaDetail_name').val();
		if(name==null||name==""){
			$('#title_msg').show();
			var str = "";
		}
		if(paperId==null||paperId==""){
			$('#paper_msg').show();
			var str = "";
		}
		var start = $("#start").val();
		var end = $("#end").val();
		if(start=="" || start==null){
			$('#start_msg').show();
			var str = "";
		}
		if(end=="" || end==null){
			$('#end_msg').show();
			var str = "";
		}
		return str;
	}
	
	// 时间控件加载
	//addDate('#start','#end');
	var start = {
	  elem: '#start',
	  format: 'YYYY-MM-DD hh:mm:ss',
	  min: '${evaluateEvaVo.startTime?string("YYYY-MM-dd HH:mm:ss")}', //设定最小日期为当前日期
	  max: '${evaluateEvaVo.endTime?string("YYYY-MM-dd HH:mm:ss")}', //最大日期
	  istime: true,
	  istoday: false,
	  choose: function(datas){
	     end.min = datas; //开始日选好后，重置结束日的最小日期
	     end.start = datas //将结束日的初始值设定为开始日
	  }
	};
	var end = {
	  elem: '#end',
	  format: 'YYYY-MM-DD hh:mm:ss',
	  min: '${evaluateEvaVo.startTime?string("YYYY-MM-dd HH:mm:ss")}',
	  max: '${evaluateEvaVo.endTime?string("YYYY-MM-dd HH:mm:ss")}',
	  istime: true,
	  istoday: false,
	  choose: function(datas){
	    start.max = datas; //结束日选好后，重置开始日的最大日期
	  }
	};
	laydate(start);
	laydate(end);
	
	var lay_open =null;
	function paper_window(){
		lay_open = layer.open({
		  type: 1,
		  title: false,
		  area: ['1100px','640px'],
		  // skin: 'layui-layer-nobg', //没有背景色
		  shadeClose: true,
		  content: $('.layer_select'),
		  success:function(dom){
		  	console.log(dom);
		  	var confirm = dom.find('.bc');	//确定按钮

		  	//关闭
		  	confirm.on('click',function(){
		  		layer.close(lay_open);
		  	})
		  }

		});
	}
	
	
	
	function init(){
		var paper_list = "";
		var html = '<label>'+
						''+
						'<span class="wenjuan_name1">问卷一名称</span>'+
					'</label>'+
					'<span class="use_count">使用次数</span>'+
					'<span class="ans_count">题目数</span>'+
					'<span class="create">创建者</span>'+
					'<span class="update">创建时间</span>'
					
					
		$(".nav_list").html(html);
	
		//初始化问卷列表
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/evaluate/paper/listbysearch.htm?',
			data:{'delflag':'0','userId':${userId!''},'type':'3'}, 
			async: false,
			success:function(data){  
				var paperList = $.extend(true, [], data);
				if(paperList!=null&& paperList.length>0){
					for(var i in paperList){
						paper_list +=  '<div class="wenjuan_one">'+
											'<label>'+
												'<input type="radio" name="wj" class="paper_radio" value='+paperList[i].id+'>'+
												'<span class="wenjuan_name">'+paperList[i].title+'</span>'+
											'</label>'+
											'<span class="use_count">'+paperList[i].useNum+'</span>'+
											'<span class="ans_count">'+paperList[i].questionNum+'</span>'+
											'<span class="create">'+paperList[i].createName+'</span>'+
											'<span class="update">'+paperList[i].createTimeStr+'</span>'+
											
										'</div>'
					}
				}else{
					paper_list = '<h1 class="answer_msg"><img src="${basePath!''}/images/no-content.png"><br>还没有问卷，先去添加问卷吧！</h1>'
				} 
				
				$(".contain").html(paper_list);				
			}  
		});
	}
	
	//查询问卷列表
	function query_paper(){
		var paper_list = "";
		var indicatorId = $("#paper_indicator").val();
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/evaluate/paper/listbysearch.htm?',
			data:{'indicatorId':indicatorId,'title':$("#paper_title").val(),'delflag':'0','userId':${userId!''},'type':'3'}, 
			async: false,
			success:function(data){  
				var paperList = $.extend(true, [], data);
				if(paperList!=null && paperList.length>0){
					for(var i in paperList){
						paper_list +=  '<div class="wenjuan_one">'+
											'<label>'+
												'<input type="radio" name="wj" class="paper_radio" value='+paperList[i].id+'>'+
												'<span class="wenjuan_name">'+paperList[i].title+'</span>'+
											'</label>'+
											'<span class="use_count">'+paperList[i].useNum+'</span>'+
											'<span class="ans_count">'+paperList[i].questionNum+'</span>'+
											'<span class="create">'+paperList[i].createName+'</span>'+
											'<span class="update">'+paperList[i].createTimeStr+'</span>'+
										'</div>'
					}
				}else{
					paper_list = '<h1 class="answer_msg"><img src="${basePath!''}/images/no-content.png"><br>还没有问卷，先去添加问卷吧！</h1>'
				}
				$(".contain").html(paper_list);		
			}  
		});
	}
	
	//获取选中的问卷
	function get_paper(){
		paperId = $("input[name='wj']:checked").attr("value");
		if(paperId!=null && paperId!=''){
			//通过id获取问卷信息
			$.ajax({  
				type:'get',  
				url:'${basePath!''}/evaluate/paper/listbyid.htm?',
				data:{'id':paperId}, 
				async: false,
				success:function(data){  
					$('.show_select').html(data.title);	
					if(data!=null && data!=""){
						$('#paper_msg').hide();
					}else{
						$('#paper_msg').show();
					}
				}  
			});
		}	
	}
	
	//最后的保存操作
	function save_evaDetail(){
		//保存evaDetail
		var eva_id = null;
		<#if evaId??>
			eva_id = ${evaId!''};
		</#if>
		
		var msg = message();
		if(msg !=null && msg !="" ){
			$.ajax({  
				type:'post',  
				url:'${basePath!''}/evaluate/evaDetail/list/save.htm?',
				data:{
					'evaId':eva_id, //测评ID
					'name':$('#evaDetail_name').val(), //测评明细名称
					'introduction':$('#evaDetail_introduction').val(), //测评明细介绍
					'remake':$('#evaDetail_remake').val(), //测评明细注意事项
					'evaObject':eveObject,  //测评明细对象
					'stageId':stageId,		//测评明细学段
					'type':$("input[name='way']:checked").attr("value"),	//测评明细线上或线下
					'startTime':$('#start').val(), //开始时间
					'endTime':$('#end').val(),	//结束时间
					'issueNum':0,
					'allNum':areaList.length,
					'status':'1'
					}, 
				async: false,
				success:function(data){  
					//保存区域并返回到列表
					$("#eva_area").children('.active').each(function(){
						if($(this).val()==1){
							for(var i=2; i<13; i++){
								$.ajax({  
									type:'post',  
									url:'${basePath!''}/evaluate/evaIssue/list/save.htm?',
									data:{'evaId':eva_id,'evaDetailId':data,'areaId':i,'type':'0','status':'1'}, 
									async: false,
									success:function(data){  	
									}  
								});
							}
						}else{
							$.ajax({  
								type:'post',  
								url:'${basePath!''}/evaluate/evaIssue/list/save.htm?',
								data:{'evaId':eva_id,'evaDetailId':data,'areaId':$(this).val(),'type':'0','status':'1'}, 
								async: false,
								success:function(data){  	
								}  
							});
						}
						
					});
					//保存测评明细问卷关联
					$.ajax({  
							type:'post',  
							url:'${basePath!''}/evaluate/evaDetailPaper/list/save.htm?',
							data:{'evaDetailId':data,'paperId':paperId}, 
							async: false,
							success:function(data){  	
							}  
						});
					//更新问卷使用次数
					updatePaperUseNum(paperId);
					evaDetailId=data;
					window.location.href="${basePath!''}/evaluate/eva/list.htm?";
				}  
			});
		}
		
	}
	
	//更新问卷使用次数
	function updatePaperUseNum(paperId){
		$.ajax({  
			type:'post',  
			url:'${basePath!''}/evaluate/paper/listbyid/update.htm?',
			data:{'id':paperId,'useNum':1}, 
			async: false,
			success:function(data){ }  
		});
	}
	
	//返回列表页面
	function back_evaList(){
		window.location.href="${basePath!''}/evaluate/eva/list.htm?";
	}
	

</script>
</body>
</html>
