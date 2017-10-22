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
<title>作业调度配置</title>
<!-- Bootstrap Core CSS -->
<link href="${basePath}/bootstrap/dist/css/bootstrap.min.css" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Menu CSS -->
<link href="${basePath}/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" rel="stylesheet">
<!-- morris CSS -->
<link href="${basePath}/plugins/bower_components/morrisjs/morris.css" src="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/morrisjs/morris.css" rel="stylesheet">
<!-- animation CSS -->
<link href="${basePath}/css/animate.css" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/css/animate.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="${basePath}/css/style.css" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/css/style.css" rel="stylesheet">
<!-- color CSS -->
<link href="${basePath}/css/colors/gray-dark.css" src="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/css/colors/gray-dark.css" id="theme"  rel="stylesheet">
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
          <h4 class="page-title">作业调度配置</h4>
        </div>
        <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
          <ol class="breadcrumb">
            <li><a href="index.html" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/index.html">作业管理</a></li>
            <li class="active">作业调度配置</li>
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
              <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="inbox-center">
                  <table class="table table-hover">
                  	<thead>
                      <tr class="unread">
                        <td colspan="11">
                        	 <input type="hidden" value="searchForm" id="formId">
                       		 <input type="hidden" value="${basePath}/job/scheduler/list.htm" id="formName">
                        	 <form action="${basePath}/job/scheduler/list.htm" id="searchForm">
                        	 </form>
                             <button class="btn btn-block btn-default btn-rounded" style="width:120px"  data-toggle="modal" data-target="#job_scheduler_modal">创建</button>
                        </td>
                      </tr>
                    </thead>
                    <thead>
                      <tr class="unread">
                        <td><div class="checkbox m-t-0 m-b-0">
                            <input  type="checkbox">
                            <label for="checkbox0"></label>
                          </div></td>
                        <td class="hidden-xs">名称</td>
                        <td class="hidden-xs">启动类型</td>
                        <td class="hidden-xs">RIM导出</td>
                        <td class="hidden-xs">RIM代理</td>
                        <td class="hidden-xs">线程数</td>
                        <td class="hidden-xs">线程优先级</td>
                        <td class="hidden-xs">作业存储类</td>
                        <td class="hidden-xs">操作</td>
                      </tr>
                    </thead>
                    <tbody>
                    
                    <#if pb.list?? && pb.list?size != 0>
                      <#list pb.list as sc>
                      <tr class="unread">
                        <td><div class="checkbox m-t-0 m-b-0">
                            <input  type="checkbox">
                            <label for="checkbox0"></label>
                          </div></td>
                        <td class="hidden-xs">${sc.schedulerName!''}</td>
                        <td class="hidden-xs"><#if sc.startType == '0'>加载启动<#else>手动启动</#if></td>
                        <td class="hidden-xs">${sc.rmiExport!''}</td>
                        <td class="hidden-xs">${sc.rmiProxy!''}</td>
                        <td class="hidden-xs">${sc.threadCount!''}</td>
                        <td class="hidden-xs">${sc.threadPriority!''}</td>
                        <td class="hidden-xs">${sc.jobStoreClass!''}</td>
                        <td class="hidden-xs" style="padding-top:8px">
                       		 <button type="button" class="btn btn-default btn-circle"><i class="fa fa-check" ></i> </button>
                       		 <button type="button" class="btn btn-primary btn-circle"><i class="fa fa-list"></i> </button>
                       		 <button type="button" class="btn btn-warning btn-circle"><i class="fa fa-times"></i> </button>
                        </td>
                      </tr>
                      </#list>	
                     <#else>
                     	<tr class="unread">
                        <td colspan="11" align="center">暂无调度配置信息!</td>
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

<!-- 创建调度modal -->
<form class="form-horizontal" action="${basePath}/job/scheduler/save.htm" method="post">
<div id="job_scheduler_modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
      	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h5 class="modal-title">创建调度配置</h5>
      </div>
      <div class="modal-body">
        
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">调度名称</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="schedulerName">
                </div>
              </div>
              
               <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">启动类型</label>
                <div class="col-sm-9">
               	 <div class="radio">
                  <input type="radio" name="startType" id="radio1" value="0">
                  <label for="radio1">加载启动</label>
                 </div>
                 <div class="radio">
                  <input type="radio" name="startType" id="radio1" value="1" checked>
                  <label for="radio1">手动启动</label>
                 </div>
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">rmiExport</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="rmiExport" value="flase" disabled="true">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">rmiProxy</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="rmiProxy" value="flase" disabled="true"> 
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">wrapInUserTransaction</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="wrapInUserTransaction" value="flase" disabled="true">
                </div>
              </div>
              
              
                 <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">threadPoolClass</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="threadPoolClass" value="org.quartz.simpl.SimpleThreadPool" disabled="true">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">threadCount</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="threadCount" value="10" disabled="true">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">threadPriority</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="threadPriority" value="5" disabled="true">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">inheritContextClassLoader</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="inheritContextClassLoader" value="true" disabled="true">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">jobStoreMisfireThreshold</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="jobStoreMisfireThreshold" value="60000" disabled="true">
                </div>
              </div>
              
               <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">jobStoreClass</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="jobStoreClass" value="org.quartz.simpl.RAMJobStore" disabled="true">
                </div>
              </div>
              
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">备注</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="schedulerNote">
                </div>
              </div>
              
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
        <button type="submit" class="btn btn-danger waves-effect waves-light">保存调度配置</button>
      </div>
    </div>
  </div>
</div>
</form>



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
</body>
</html>
