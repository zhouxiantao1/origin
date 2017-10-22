<!DOCTYPE html>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>新增指标体系-下一级</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" href="${basePath!''}/zTreeStyle/zTreeStyle_1.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/target_system.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>问卷管理&gt;新建指标体系&gt;添加下一级</h3>
					</div>
					<p class="back fr" onclick="return_list()">返回上级</p>
				</div>

				<div class="show_tree">
					<h3>指标体系结构 <span>(tips:点击相应指标，进行添加、删除)</span></h3>
					<div class="construction clearfix">
						<ul id="treeDemo" class="ztree fl"></ul>
						<div class="show_msg fl">
						
						</div>
					</div>

					<div class="add_next">
						<div class="add_title">
							<span>指标体系名称：</span><input type="text" name="" id="name" placeholder="请输入指标体系名称">
						</div>
						<div class="add_quanzhong">
							<span>权重：</span>
							<select id="index_weight">
								<option value=>请选择</option>
								<option value=0.0>0.0</option>
								<option value=0.1>0.1</option>
								<option value=0.2>0.2</option>
								<option value=0.3>0.3</option>
								<option value=0.4>0.4</option>
								<option value=0.5>0.5</option>
								<option value=0.6>0.6</option>
								<option value=0.7>0.7</option>
								<option value=0.8>0.8</option>
								<option value=0.9>0.9</option>
								<option value=1.0>1.0</option>
							</select>					
						</div>
						<div class="add_reduces">
							<span>指标体系介绍：</span><textarea id="content" placeholder="指标体系介绍（可不填），限500字"></textarea>
						</div>

						<div class="sure_cancel">
							<button class="confirm" onclick="save_level_indicator()">确定</button>
							<button class="cancel" onclick="cancel_level_indicator()">取消</button>
						</div>
					</div>
					
					<div class="sure_cancel">
						<button class="confirm" onclick="save_view()">保存</button>
						<button class="confirm" onclick="return_list()">取消</button>
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
<script src="${basePath!''}/js/jquery.ztree.all.min.js"></script>

<script type="text/javascript">
	var id="";

	$(function(){
		// 树形菜单
		var htmlStr = "<p>指标体系：<span>"+GetQueryString("name")+"</span></p>"+
					  "<p>权重：<span></span></p>"+
					  "<p>指标内容：<span>"+GetQueryString("content")+"</span></p>";
		$(".show_msg").html(htmlStr)	
		getById(GetQueryString("indicatorId"));
		loadIndicator();
		
	})
	//通过ID获取数据
	function getById(id){
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/evaluate/indicator/listbyid1.htm?', 
		    data:{'id':id}, 
		    success:function(data){
		    	 var weight = "";
		    	 if(data.weight!=null){
		    	 	weight = data.weight;
		    	 }
		    	 var htmlStr = "<p>指标名称：<span>"+data.name+"</span></p>"+
					  "<p>权重：<span>"+weight+"</span></p>"+
					  "<p>指标内容：<span>"+data.content+"</span></p>";
				$(".show_msg").html(htmlStr)
		    }  
	 	});
	}
	
	//点击新增触发
	function zTreeOnClick(event, treeId, treeNode) {
	   //alert(treeNode.id + ", " + treeNode.name);
	   id = treeNode.id;
	   getById(treeNode.id)
	};
	
	
	
	//编辑完成后触发
	function zTreeOnRename(event, treeId, treeNode, isCancel) {
		//alert(treeNode.id + ", " + treeNode.name);
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/evaluate/indicator/listbyid/update.htm?', 
		    data:{'name':treeNode.name,'id':treeNode.id}, 
		    success:function(data){  
		    	window.location.reload(); 
		    }  
	 	});
	}
	
	//删除
	function zTreeOnRemove(event, treeId, treeNode) {
		//alert(treeNode.id + ", " + treeNode.name);
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/evaluate/indicator/listbyid/delete.htm?', 
		    data:{'delflag':'0','id':treeNode.id}, 
		    success:function(data){  
		    	window.location.reload(); 
		    }  
	 	});
	}
	
	// 树形菜单
	function loadIndicatorTree(zNodes){
		var setting = {
			showLine: false, 
			checkable: true,
			selectedMulti: false,
			callback: {
				onClick: zTreeOnClick,
				onRename: zTreeOnRename,
				onRemove: zTreeOnRemove
			},
			edit: {
	            enable: true,
	            editNameSelectAll: true,
	            showRemoveBtn: 1,
	            showRenameBtn: 1
	           
	        },
	         data: {
	            simpleData: {
	                enable: true
	            }
	        },
	        view: {
				addHoverDom: addHoverDom,
				removeHoverDom: removeHoverDom
			}
		}
		
		var zTreeObj;
		zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, zNodes);	//初始化树
		
		function addHoverDom(treeId, treeNode) {
			var sObj = $("#" + treeNode.tId + "_span");
	        if (treeNode.editNameFlag || $("#addBtn_" + treeNode.tId).length > 0) return;
	        var addStr = "<span class='button add' id='addBtn_" + treeNode.tId + "' title='add node' onfocus='this.blur();'></span>";
	        sObj.after(addStr);
	        var btn="#addBtn_" + treeNode.tId;
	        btn = $(btn);
			if (btn) btn.bind("click", function(){
				$('.add_next').show();
			});
		};
		function removeHoverDom(treeId, treeNode) {
			$("#diyBtn_"+treeNode.id).unbind().remove();
			$("#diyBtn_space_" +treeNode.id).unbind().remove();
			$("#addBtn_" + treeNode.tId).unbind().remove();
			
		};
	}
	
	//获取url参数
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	
	//树加载指标数据
	function loadIndicator(){
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/evaluate/indicator/listbysearch.htm?', 
		    data:{'id':GetQueryString("indicatorId")}, 
		    success:function(data){  
		    	loadIndicatorTree(data);
		    }  
	 	});
	}
	
	
	
	//保存指标并刷新
	function save_level_indicator(){
		 $.ajax({  
			type:'get',  
		    url:'${basePath!''}/evaluate/indicator/list/save.htm?', 
		    data:{'name':$("#name").val(),'content':$("#content").val(),'parentId':id,'weight':$("#index_weight").val()}, 
		    success:function(data){  
		    	window.location.reload(); 
		    }  
	 	});
	}
	
	//取消
	function cancel_level_indicator(){
		$('.add_next').hide();
	}
	
	//最后保存跳转
	function save_view(){
		 $.ajax({  
			type:'post',  
		    url:'${basePath!''}/evaluate/indicator/listbyid/update.htm?', 
		    data:{'id':GetQueryString("indicatorId"),'delflag':'0'}, 
		    success:function(data){  
		    	var url = "${basePath!''}/evaluate/indicator/list.htm?";
		    	window.location.href= url;
		    }  
	 	});
	}
	
	//返回到列表
	function return_list(){
		window.location.href="${basePath!''}/evaluate/indicator/list.htm?";
	}
	
	
</script>

</body>
</html>