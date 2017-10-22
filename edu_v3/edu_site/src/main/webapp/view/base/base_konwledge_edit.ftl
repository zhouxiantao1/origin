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
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/wenjuan_biaoku.css">
</head>
<body>
	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 


	<div class="content_contain">
		<div class="content">
			<div class="mid fl">
				<div class="ce_nanage clearfix">
					<div class="contain_c fl">
						<h3>基础信息&gt;知识点管理&gt;编辑</h3>
					</div>
					<p class="back fr" onclick="return_list()">返回</p>
				</div>

				<div class="show_tree">
					<h3>知识点模块<span>(tips:点击相应知识点，进行添加、删除)</span></h3>
					<div class="construction clearfix">
						<ul id="treeDemo" class="ztree fl"></ul>
						
					</div>

					<div class="add_next">
						<div class="add_reduces">
							<span>父知识点名称：</span><i id="parentName"></i>
						</div>
						<div class="add_reduces">
							<span>知识点名称：</span><input type="text" name="" id="childName" placeholder="一百字以内">
						</div>

						<div class="sure_cancel">
							<button class="confirm" id="save_knowledge">确定</button>
							<button class="cancel" onclick="cancel_level_indicator()">取消</button>
						</div>
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
		loadIndicator();
	})
	
	
	//点击新增触发
	function zTreeOnClick(event, treeId, treeNode) {
	   //alert(treeNode.id + ", " + treeNode.name);
	   id = treeNode.id;
	   $("#parentName").html(treeNode.name);
	   $("#save_knowledge").on("click",function(){
	   		$.ajax({  
				type:'post',  
			    url:'${basePath!''}/base/knowledge/list/save.htm?', 
			    data:{
				    'parentId':id,
				    'name':$("#childName").val()
			    }, 
			    success:function(data){  
			    	window.location.reload(); 
			    }  
		 	});
	   })
	};
	
	
	
	//编辑完成后触发
	function zTreeOnRename(event, treeId, treeNode, isCancel) {
		//alert(treeNode.id + ", " + treeNode.name);
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/base/knowledge/listbyid/update.htm?', 
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
		    url:'${basePath!''}/base/knowledge/listbyid/update.htm?', 
		    data:{'delflag':'1','id':treeNode.id}, 
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
	
	//树加载指标数据
	function loadIndicator(){
		<#if search??>
			var id = ${search.id!''};
		</#if>
		
		$.ajax({  
			type:'get',  
		    url:'${basePath!''}/base/knowledge/treelistbyparentId.htm?', 
		    data:{'parentId':id}, 
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
		window.location.href="${basePath!''}/base/knowledge/list.htm?";
	}
	
	
</script>

</body>
</html>