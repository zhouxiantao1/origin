<!DOCTYPE html>  
<html lang="en">
<head>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" type="image/png" sizes="16x16" href="${basePath}/plugins/images/favicon.png">
<title>用户角色管理</title>
<!-- Bootstrap Core CSS -->
<link href="${basePath}/bootstrap/dist/css/bootstrap.min.css"  rel="stylesheet">
<!-- Menu CSS -->
<link href="${basePath}/plugins/bower_components/tablesaw-master/sidebar-nav/dist/sidebar-nav.min.css"  rel="stylesheet">
<!-- morris CSS -->
<link href="${basePath}/plugins/bower_components/morrisjs/morris.css"  rel="stylesheet">
<!-- animation CSS -->
<link href="${basePath}/css/animate.css"  rel="stylesheet">
<!-- Custom CSS -->
<link href="${basePath}/css/style.css"  rel="stylesheet">
<!-- color CSS -->
<link href="${basePath}/css/colors/gray-dark.css"  id="theme"  rel="stylesheet">
<!-- Date picker plugins css -->
<link href="${basePath}/plugins/bower_components/bootstrap-datepicker/bootstrap-datepicker.min.css" rel="stylesheet" type="text/css">
<!-- Daterange picker plugins css -->
<link href="${basePath}/plugins/bower_components/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
<link href="${basePath}/plugins/bower_components/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
<!-- /#wrapper -->
<!-- jQuery -->
<script tppabs="${basePath}/plugins/bower_components/jquery/dist/jquery.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script tppabs="${basePath}/bootstrap/dist/js/bootstrap.min.js" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Menu Plugin JavaScript -->
<script tppabs="${basePath}/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
<!--slimscroll JavaScript -->
<script tppabs="${basePath}/js/jquery.slimscroll.js" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/jquery.slimscroll.js"></script>
<!--Morris JavaScript -->
<script tppabs="${basePath}/plugins/bower_components/raphael/raphael-min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/raphael/raphael-min.js"></script>
<script tppabs="${basePath}/plugins/bower_components/morrisjs/morris.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/morrisjs/morris.js"></script>
<!-- Sparkline chart JavaScript -->
<script tppabs="${basePath}/plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js"></script>
<!-- jQuery peity -->
<script tppabs="${basePath}/plugins/bower_components/peity/jquery.peity.min.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/peity/jquery.peity.min.js"></script>
<script tppabs="${basePath}/plugins/bower_components/peity/jquery.peity.init.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/peity/jquery.peity.init.js"></script>
<!--Wave Effects -->
<script tppabs="${basePath}/js/waves.js" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/waves.js"></script>
<!-- Custom Theme JavaScript -->
<script tppabs="${basePath}/js/custom.min.js" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/custom.min.js"></script>
<script tppabs="${basePath}/js/dashboard1.js" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/dashboard1.js"></script>
<!--Style Switcher -->
<script tppabs="${basePath}/plugins/bower_components/styleswitcher/jQuery.style.switcher.js" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/styleswitcher/jQuery.style.switcher.js"></script>
<!-- Date Picker Plugin JavaScript -->
<script src="${basePath}/plugins/bower_components/bootstrap-datepicker/bootstrap-datepicker.min.js"></script>
<!-- Date range Plugin JavaScript -->
<script src="${basePath}/plugins/bower_components/timepicker/bootstrap-timepicker.min.js"></script>
<script src="${basePath}/plugins/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
</head>
<body class="fix-sidebar">

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
          <h4 class="page-title">用户角色管理</h4>
        </div>
        <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
          <ol class="breadcrumb">
            <li><a href="index.html" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/index.html">权限管理</a></li>
            <li class="active">用户角色管理</li>
          </ol>
        </div>
        <!-- /.col-lg-12 -->
      </div>
      <!-- row -->
      <div class="row">
        <!-- Left sidebar -->
        <div class="col-md-12">
          <div class="white-box">
            <!-- row -->
            <div class="row">
              <div class="col-lg-2 col-md-3  col-sm-12 col-xs-12 inbox-panel">
                <div> 
                  <@security.authorize url="/limit/element/button/role/add.htm">
                  <a href="#" class="btn btn-custom btn-block waves-effect waves-light" style="font-size:12px" data-toggle="modal" data-target="#responsive-role-modal">创建角色</a>
                  </@security.authorize>
                  <div class="list-group mail-list m-t-20">
                  <#if srs?? && srs?size !=0>
                   <#list srs as sr>
                   		<a href="${basePath}/security/role/list.htm?roleId=${sr.id!''}" class="list-group-item <#if sr.id == roleid>active</#if>">${sr.name!''}<#if sr.id == roleid><span class="label label-rouded label-default pull-right">${pb.rows!''}</span></#if></a> 
                   </#list>
                  </#if>
                  </div>
                </div>
              </div>
              <div class="col-lg-10 col-md-9 col-sm-12 col-xs-12 mail_listing">
              <input type="hidden" id="formId"/>
                <div class="inbox-center">
                  <table class="table table-hover">
                  	<thead>
                      <tr class="unread">
                        <td colspan="11">
                        	 <input type="hidden" value="searchForm" id="formId">
                       		 <input type="hidden" value="${basePath}/security/role/list.htm" id="formName">
                        	 <form action="${basePath}/security/role/list.htm" id="searchForm">
                        	 </form>
                        	 <@security.authorize url="/limit/element/modal/add.htm">
                            	 <button class="btn btn-block btn-default btn-rounded" style="width:120px"  data-toggle="modal" data-target="#responsive-user-modal">添加用户</button>
                             </@security.authorize>
                        </td>
                      </tr>
                    </thead>
                    <thead>
                      <tr class="unread">
                        <td><div class="checkbox m-t-0 m-b-0">
                            <input  type="checkbox">
                            <label for="checkbox0"></label>
                          </div></td>
                        <td class="hidden-xs">姓名</td>
                        <@security.authorize url="/limit/data/user/code.htm">
                        <td class="hidden-xs">用户编码</td>
                        </@security.authorize>
                        <td class="hidden-xs">帐号类型</td>
                        <td class="hidden-xs">帐号状态</td>
                        <td class="hidden-xs">描述</td>
                        <@security.authorize url="/limit/data/tr/create_time.htm">
                        <td class="hidden-xs">创建时间</td>
                        </@security.authorize>
                        <td class="hidden-xs">首次登录时间</td>
                        <td class="hidden-xs">最后登录时间</td>
                        <td class="hidden-xs">自动过期时间</td>
                        <td class="hidden-xs">登录次数</td>
                        <@security.authorize url="/limit/element/buttons/update.htm">
                        <td class="hidden-xs">操作</td>
                        </@security.authorize>
                      </tr>
                    </thead>
                    <tbody>
                     <#if pb.list?? && pb.list?size != 0>
                      <#list pb.list as user>
                      <tr class="unread">
                        <td><div class="checkbox m-t-0 m-b-0">
                            <input  type="checkbox">
                            <label for="checkbox0"></label>
                          </div></td>
                        <td class="hidden-xs">${user.name!''}</td>
                        <@security.authorize url="/limit/data/user/code.htm">
                        <td class="hidden-xs">${user.code!''}</td>
                        </@security.authorize>
                        <td class="hidden-xs">
                        	<#if user.type == '0'>
                        		自定义用户
                        	<#else>
                        		系统用户
                        	</#if>
                        </td>
                        <td class="hidden-xs">
                        	<#if user.isAccountNonLocked == '0'>
                        		<span class="label label-danger">启用</span>
                        	<#else>
                        		<span class="label label-table label-info">禁用</span>
                        	</#if>
                        </td>
                        <td class="hidden-xs">${user.description!''}</td>
                         <@security.authorize url="/limit/data/tr/create_time.htm">
                        <td class="hidden-xs"><#if user.createTime??>${user.createTime?string("yyyy-MM-dd HH:mm:ss")}</#if></td>
                       	 </@security.authorize>
                        <td class="hidden-xs"><#if user.firstLoginTime??>${user.firstLoginTime?string("yyyy-MM-dd HH:mm:ss")}</#if></td>
                        <td class="hidden-xs"><#if user.lastLoginTime??>${user.lastLoginTime?string("yyyy-MM-dd HH:mm:ss")}</#if></td>
                        <td class="hidden-xs"><#if user.expireTime??>${user.expireTime?string("yyyy-MM-dd HH:mm:ss")}</#if></td>
                        <td class="hidden-xs">${user.loginNum!''}</td>
                        <@security.authorize url="/limit/element/buttons/update.htm">
                        <td class="hidden-xs" style="padding-top:8px">
                       		 <button type="button" class="btn btn-default btn-circle"><i class="fa fa-check" ></i> </button>
                       		 <button type="button" class="btn btn-primary btn-circle"><i class="fa fa-list"></i> </button>
                       		 <button type="button" class="btn btn-warning btn-circle"><i class="fa fa-times"></i> </button>
                        </td>
                        </@security.authorize>
                      </tr>
                      </#list>	
                     <#else>
                     	<tr class="unread">
                        <td colspan="11" align="center">该角色下暂无用户信息!</td>
                        </tr>
                     </#if>
                    </tbody>
                  </table>
                </div>
                <#if pb.list?? && pb.list?size != 0>
               	 <#include '/common/searchPag.ftl' />  
                </#if>
              </div>
            </div>
            <!-- /.row -->
          </div>
        </div>
      </div>
      <!-- /.row -->
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
              <li><a href="javascript:void(0)"><img src="../plugins/images/users/varun.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/varun.jpg" alt="user-img" class="img-circle"> <span>Varun Dhavan <small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="../plugins/images/users/genu.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/genu.jpg" alt="user-img"  class="img-circle"> <span>Genelia Deshmukh <small class="text-warning">Away</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="../plugins/images/users/ritesh.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/ritesh.jpg" alt="user-img"  class="img-circle"> <span>Ritesh Deshmukh <small class="text-danger">Busy</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="../plugins/images/users/arijit.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/arijit.jpg" alt="user-img" class="img-circle"> <span>Arijit Sinh <small class="text-muted">Offline</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="../plugins/images/users/govinda.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/govinda.jpg" alt="user-img" class="img-circle"> <span>Govinda Star <small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="../plugins/images/users/hritik.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/hritik.jpg" alt="user-img" class="img-circle"> <span>John Abraham<small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="../plugins/images/users/john.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/john.jpg" alt="user-img" class="img-circle"> <span>Hritik Roshan<small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="../plugins/images/users/pawandeep.jpg" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/images/users/pawandeep.jpg" alt="user-img" class="img-circle"> <span>Pwandeep rajan <small class="text-success">online</small></span></a></li>
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

<!-- 新增角色modal -->
<form class="form-horizontal" action="${basePath}/security/role/save.htm" method="post">
<div id="responsive-role-modal" class="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
      	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h5 class="modal-title">新增角色</h5>
      </div>
      <div class="modal-body">
        
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">角色名称*</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="name">
                </div>
              </div>
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">角色编码*</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="code">
                </div>
              </div>
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">角色描述</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="description">
                </div>
              </div>
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">角色类型</label>
                <div class="col-sm-9">
               	 <div class="radio">
                  <input type="radio" name="type" id="radio1" value="1">
                  <label for="radio1">内置类型</label>
                 </div>
                 <div class="radio">
                  <input type="radio" name="type" id="radio1" value="0" checked>
                  <label for="radio1">自定义类型</label>
                 </div>
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">状态</label>
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
                <label for="inputEmail3" class="col-sm-2 control-label">排序*</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="sort">
                </div>
              </div>
              
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
        <button type="submit" class="btn btn-danger waves-effect waves-light">保存角色</button>
      </div>
    </div>
  </div>
</div>
</form>


<!-- 新增用户modal -->
<form class="form-horizontal" action="${basePath}/security/user/save.htm" method="post">
<div id="responsive-user-modal" class="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
      	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h5 class="modal-title">新增用户</h5>
        <input type="hidden" name="roleId" value="${roleid!''}">
      </div>
      
      <div class="modal-body">
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">姓名*</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="name">
                </div>
              </div>
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">用户编码*</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="code">
                </div>
              </div>
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="password" value="123456"  >
                </div>
              </div>
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">帐号类型</label>
                <div class="col-sm-9">
               	 <div class="radio">
                  <input type="radio" name="type" id="radio1" value="1">
                  <label for="radio1">内置类型</label>
                 </div>
                 <div class="radio">
                  <input type="radio" name="type" id="radio1" value="0" checked>
                  <label for="radio1">自定义类型</label>
                 </div>
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">帐号状态</label>
                <div class="col-sm-9">
                 <div class="radio">
                  <input type="radio" name="isAccountNonLocked" id="radio2" value="0" checked>
                  <label for="radio2">启用</label>
                 </div>
               	 <div class="radio">
                  <input type="radio" name="isAccountNonLocked" id="radio2" value="1">
                  <label for="radio2">禁用</label>
                 </div>
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">是否永久有效</label>
                <div class="col-sm-9">
                 <div class="radio">
                  <input type="radio" name="isPermanent" id="radio3" value="0" checked click="show_period_div()">
                  <label for="radio2">永久有效</label>
                 </div>
               	 <div class="radio">
                  <input type="radio" name="isPermanent" id="radio3" value="1" click="hide_period_div()">
                  <label for="radio2">有效期自动过期</label>
                 </div>
                </div>
              </div>
              
              
               <div class="form-group" id="period_div" style="display:none">
                <label for="inputPassword3" class="col-sm-2 control-label">有效期</label>
                <div class="col-sm-9">
                    <input class="form-control" type="date" value="0000-00-00" id="example-date-input" name="time">
                </div>
              </div>
              
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">描述</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="description">
                </div>
              </div>
              
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
        <button type="submit" class="btn btn-danger waves-effect waves-light">保存角色</button>
      </div>
    </div>
  </div>
</div>
</form>

</body>
<script>
$(function(){

	$("input:radio[name='isPermanent']").click(function(){
	
		var radio_checked = $("input:radio[name='isPermanent']:checked").val()
		if(radio_checked==0){
			$('#period_div').hide();
		}else{
			$('#period_div').show();
		}
		
    });
    
});	


</script>



</html>


