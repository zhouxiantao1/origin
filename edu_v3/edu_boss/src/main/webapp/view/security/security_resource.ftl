<!DOCTYPE html>  
<html lang="en">
<head>
<#assign basePath=request.contextPath>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" type="image/png" sizes="16x16" href="${basePath}/plugins/images/favicon.png">
<title>资源管理</title>
<!-- Bootstrap Core CSS -->
<link href="${basePath}/bootstrap/dist/css/bootstrap.min.css" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Menu CSS -->
<link href="${basePath}/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" rel="stylesheet">
<!-- animation CSS -->
<link href="${basePath}/css/animate.css" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/css/animate.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="${basePath}/css/style.css" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/css/style.css" rel="stylesheet">
<!-- color CSS -->
<link href="${basePath}/css/colors/gray-dark.css" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/css/colors/gray-dark.css" id="theme"  rel="stylesheet">

</head>
<body class="fix-sidebar">
<input type="hidden" id="basePath" value="${basePath!''}">

<input type="hidden" id="resource_id">
<div id="wrapper">

  <!-- Top Navigation -->
  <#include '/common/top.ftl' />  
  <!-- Top Navigation end -->
  
  <!-- Left navbar-header -->
  <#include '/common/left.ftl' />
  <!-- Left navbar-header end -->
  
  <!-- Page Content -->
  <div id="page-wrapper">
    <div class="container-fluid">
      <div class="row bg-title">
        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
          <h4 class="page-title">资源管理</h4>
        </div>
        <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
          <ol class="breadcrumb">
            <li><a href="#">权限管理</a></li>
            <li class="active">资源管理</li>
          </ol>
        </div>
        <!-- /.col-lg-12 -->
      </div>
      <!-- .row -->
      <div class="row">
        <div class="col-md-12">
          <div class="white-box">
          <h3 class="box-title">
          	<div class="button-box">
              <button class="fcbtn btn btn-info btn-outline btn-1d"  data-toggle="modal"  data-target="#responsive-resource-modal">添加资源</button>
              <button class="fcbtn btn btn-warning btn-outline btn-1d">修改资源</button>
              <button class="fcbtn btn btn-danger btn-outline btn-1d">删除资源</button>
            </div>
		  </h3>
                <div class="row">
                    <div class="col-sm-4">
                      <h2>Tree</h2>
                      <div id="treeview-searchable" class=""></div>
                    </div>
                </div>
          </div>
        </div>
      </div>
      <!--/.row -->
      <!-- .right-sidebar -->
      <div class="right-sidebar">
        <div class="slimscrollright">
          <div class="rpanel-title"> Service Panel <span><i class="ti-close right-side-toggle"></i></span> </div>
          <div class="r-panel-body">
            <ul>
              <li><b>Layout Options</b></li>
              <li>
                <div class="checkbox checkbox-info">
                  <input id="checkbox1" type="checkbox" class="fxhdr">
                  <label for="checkbox1"> Fix Header </label>
                </div>
              </li>
              <li>
                <div class="checkbox checkbox-warning">
                  <input id="checkbox2" type="checkbox" checked="" class="fxsdr">
                  <label for="checkbox2"> Fix Sidebar </label>
                </div>
              </li>
              <li>
                <div class="checkbox checkbox-success">
                  <input id="checkbox4" type="checkbox" class="open-close">
                  <label for="checkbox4" > Toggle Sidebar </label>
                </div>
              </li>
            </ul>
            <ul id="themecolors" class="m-t-20">
              <li><b>With Light sidebar</b></li>
              <li><a href="javascript:void(0)" theme="default" class="default-theme">1</a></li>
              <li><a href="javascript:void(0)" theme="green" class="green-theme">2</a></li>
              <li><a href="javascript:void(0)" theme="gray" class="yellow-theme">3</a></li>
              <li><a href="javascript:void(0)" theme="blue" class="blue-theme">4</a></li>
              <li><a href="javascript:void(0)" theme="purple" class="purple-theme">5</a></li>
              <li><a href="javascript:void(0)" theme="megna" class="megna-theme">6</a></li>
              <li><b>With Dark sidebar</b></li>
              <br/>
              <li><a href="javascript:void(0)" theme="default-dark" class="default-dark-theme">7</a></li>
              <li><a href="javascript:void(0)" theme="green-dark" class="green-dark-theme">8</a></li>
              <li><a href="javascript:void(0)" theme="gray-dark" class="yellow-dark-theme working">9</a></li>

              <li><a href="javascript:void(0)" theme="blue-dark" class="blue-dark-theme">10</a></li>
              <li><a href="javascript:void(0)" theme="purple-dark" class="purple-dark-theme">11</a></li>
              <li><a href="javascript:void(0)" theme="megna-dark" class="megna-dark-theme">12</a></li>

            </ul>
            <ul class="m-t-20 chatonline">
              <li><b>Chat option</b></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/images/users/varun.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/varun.jpg" alt="user-img" class="img-circle"> <span>Varun Dhavan <small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/images/users/genu.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/genu.jpg" alt="user-img"  class="img-circle"> <span>Genelia Deshmukh <small class="text-warning">Away</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/images/users/ritesh.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/ritesh.jpg" alt="user-img"  class="img-circle"> <span>Ritesh Deshmukh <small class="text-danger">Busy</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/images/users/arijit.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/arijit.jpg" alt="user-img" class="img-circle"> <span>Arijit Sinh <small class="text-muted">Offline</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/images/users/govinda.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/govinda.jpg" alt="user-img" class="img-circle"> <span>Govinda Star <small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/images/users/hritik.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/hritik.jpg" alt="user-img" class="img-circle"> <span>John Abraham<small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/images/users/john.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/john.jpg" alt="user-img" class="img-circle"> <span>Hritik Roshan<small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/images/users/pawandeep.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/pawandeep.jpg" alt="user-img" class="img-circle"> <span>Pwandeep rajan <small class="text-success">online</small></span></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- /.right-sidebar -->
    </div>
    <!-- /.container-fluid -->
    <#include '/common/bottom.ftl' />  
  </div>
  <!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->

<!-- 创建资源modal -->
<form class="form-horizontal" action="${basePath}/security/resource/save.htm" method="post">
<div id="responsive-resource-modal" class="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
      	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h5 class="modal-title">创建资源</h5>
        <input type="hidden" name="roleId" value="${roleid!''}">
      </div>
      <div class="modal-body">
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">资源名称</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="name">
                </div>
              </div>
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">资源地址</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="url">
                </div>
              </div>
              <input type="hidden" id="add_resource_id" name="parentId" value="0">
              <div class="form-group">
              	 <label for="inputEmail3" class="col-sm-2 control-label">上级资源</label>
	             <div class="col-sm-9"  id="treeview1" >
	             </div>
              </div>
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">资源类型</label>
                <div class="col-sm-9">
               	 <div class="radio">
                  <input type="radio" name="resourceType" id="radio1" value="0" checked>
                  <label for="radio1">节点(通常为菜单)</label>
                 </div>
                 <div class="radio">
                  <input type="radio" name="resourceType" id="radio1" value="4">
                  <label for="radio1">请求</label>
                 </div>
                 <div class="radio">
                  <input type="radio" name="resourceType" id="radio1" value="1" >
                  <label for="radio1">页面元素</label>
                 </div>
                  <div class="radio">
                  <input type="radio" name="resourceType" id="radio1" value="2" >
                  <label for="radio1">数据级</label>
                 </div>
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">资源状态</label>
                <div class="col-sm-9">
                 <div class="radio">
                  <input type="radio" name="isVisible" id="radio2" value="0" checked>
                  <label for="radio2">启用</label>
                 </div>
               	 <div class="radio">
                  <input type="radio" name="isVisible" id="radio2" value="1">
                  <label for="radio2">禁用</label>
                 </div>
                </div>
              </div>
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">描述</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="description">
                </div>
              </div>
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">排序</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="sort">
                </div>
              </div>
              
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
        <button type="submit" class="btn btn-danger waves-effect waves-light">保存资源</button>
      </div>
    </div>
  </div>
</div>
</form>
<!-- jQuery -->
<script src00="${basePath}/plugins/bower_components/jquery/dist/jquery.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src00="${basePath}/bootstrap/dist/js/bootstrap.min.js" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Menu Plugin JavaScript -->
<script src00="${basePath}/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
<!--slimscroll JavaScript -->
<script src00="${basePath}/js/jquery.slimscroll.js" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/jquery.slimscroll.js"></script>
<!-- Treeview Plugin JavaScript -->
<script src="${basePath}/plugins/bower_components/bootstrap-treeview-master/dist/bootstrap-treeview.min.js" src00="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/bootstrap-treeview-master/dist/bootstrap-treeview.min.js"></script>
<!--Wave Effects -->
<script src00="${basePath}/js/waves.js" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/waves.js"></script>
<!-- Custom Theme JavaScript -->
<script src00="${basePath}/js/custom.min.js" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/custom.min.js"></script>
<!--Style Switcher -->
<script src00="${basePath}/plugins/bower_components/styleswitcher/jQuery.style.switcher.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/styleswitcher/jQuery.style.switcher.js"></script>
</body>
</html>
<script>
    
	$(function() {
	
	
		var tree;   
        $.ajax({  
          type:'get',  
          url:$('#basePath').val()+'/security/authorization/ajaxqueryallresource.htm',  
          data:{'roleId':$('#roleId').val()},
          success:function(data){  
        	  init(data);                    
          }  
       });  
       
       function init(tree){  
       
	        var $searchableTree = $('#treeview-searchable').treeview({
	          data: tree
	        });
	        
	        
	        $('#treeview1').treeview({
	          data: tree,
		      onNodeSelected: function (event, node) {
		            $('#add_resource_id').val(node.rid);
		          }
	        });
	        
   	   }
		
	});

</script>
