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
<title>代码生成</title>
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
          <h4 class="page-title">代码管理</h4>
        </div>
        <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
          <ol class="breadcrumb">
            <li><a href="index.html" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/index.html">作业管理</a></li>
            <li class="active">代码生成</li>
          </ol>
        </div>
        <!-- /.col-lg-12 -->
      </div>
      <!-- row -->
      <div class="row">
	      <div class="col-sm-12">
			   <div class="white-box">
			   	 <div class="row">
				  <div class="col-lg-1 col-sm-1 col-xs-12" style="padding-left:2px;padding-right:2px">
			        <button class="btn btn-block btn-info btn-rounded"  data-toggle="modal" data-target="#code_object_modal">创建项目</button>
			      </div>
			      <div class="col-lg-1 col-sm-1 col-xs-12"  style="padding-left:2px;padding-right:2px">
			        <button class="btn btn-block btn-info btn-rounded"   data-toggle="modal" data-target="#code_property_modal">创建属性</button>
			      </div>
			      <div class="col-lg-1 col-sm-1 col-xs-12" style="padding-left:2px;padding-right:2px">
			        <a href="${basePath}/code/generate.htm?codeId=${codeId!''}"><button class="btn btn-block btn-info btn-rounded">一键生成</button></a>
			      </div>
			     </div>
			    </div>
	      </div>
      </div>
            <div class="row">
		        <div class="col-sm-6">
		          <div class="white-box"  style="padding:10px">
		            <h3 class="box-title" style="font-size:12px;font-weight:bold">项目基本信息</h3>
		            <div class="inbox-center">
		              <table class="table table-hover"  style="font-size:12px;color:#000000">
		                <tbody>
		                 <tr  class="unread">
		                    <td>项目名称</td>
		                    <td>父模块</td>
		                    <td>子模块</td>
		                    <td>生成时间</td>
		                    <td>创建人</td>
		                    <td>表前缀</td>
		                    <td>操作</td>
		                  </tr>
		                  <#if dcvs?? && dcvs?size !=0>
		                  	<#list dcvs as dcv>
			                  <tr class="unread" <#if dcv.id == codeId>style="color:#03a9f3"</#if>>
			                    <td>${dcv.codeName!''}</td>
			                    <td>${dcv.projectName!''}</td>
			                    <td>${dcv.moduleName!''}</td>
			                    <td><#if dcv.lastGenerateTime??>${dcv.lastGenerateTime?string("yyyy-MM-dd HH:mm:ss")}<#else>未生成</#if></td>
			                    <td>${dcv.createName!''}</td>
			                    <td>${dcv.tableTop!''}</td>
			                    <td class="hidden-xs" style="padding-top:8px">
	                       		 <button type="button" class="btn btn-primary btn-circle"><i class="fa fa-list"></i> </button>
	                       		 <button type="button" class="btn btn-warning btn-circle"><i class="fa fa-times"></i> </button>
	                       		 <button type="button" class="btn btn-success btn-circle"><a href="${basePath}/code/list.htm?codeId=${dcv.id}"><i class="fa fa-link"></i></a> </button>
	                       		 <button type="button" class="btn btn-info btn-circle"><a href="${basePath}/code/method/list.htm?codeId=${dcv.id}"><i class="fa fa-check"></i></a>  </button>
	                        	</td>
			                  </tr>
		                 	 </#list>
		                 	  <#else>
		                     	<tr class="unread">
		                        <td colspan="6" align="center">暂无开发信息!</td>
		                        </tr>
		                  </#if>
		                </tbody>
		              </table>
		            </div>
		          </div>
		        </div>
		        <div class="col-sm-6">
		          <div class="white-box"  style="padding:10px">
		            <h3 class="box-title" style="font-size:12px;font-weight:bold">对象字段信息</h3>
		            <div class="inbox-center">
		              <table class="table table-hover"  style="font-size:12px">
		                  
		                <tbody>
		                <tr class="unread">
		                    <td>字段名</td>
		                    <td>类型</td>
		                    <td>长度</td>
		                    <td>为空?</td>
		                    <td>注释</td>
		                    <td>默认值</td>
		                    <td>查询条件？</td>
		                    <td  style="width:90px;padding-left:1px;padding-rigth:1px">操作</td>
		                  </tr>
		                  <#if dcvps?? && dcvps?size !=0>
		                  	<#list dcvps as dcvp>
			                  <tr  class="unread">
			                    <td>${dcvp.name!''}</td>
			                    <td>${dcvp.type!''}</td>
			                    <td>${dcvp.length!''}</td>
			                    <td>
			                    	<div class="checkbox checkbox-inverse checkbox-circle" style="margin-top:0px">
						              <input id="checkbox12" type="checkbox" disabled="" <#if dcvp.isNull == '0'>checked=""</#if>	>
						              <label for="checkbox12">&nbsp;</label>
						            </div>
			                    </td>
			                    <td>${dcvp.comment!''}</td>
			                    <td>${dcvp.def!''}</td>
			                    <td > 
									<div class="checkbox checkbox-inverse checkbox-circle" style="margin-top:0px">
						              <input id="checkbox12" type="checkbox" disabled="" <#if dcvp.isSearch == '1'>checked=""</#if>	>
						              <label for="checkbox12">&nbsp;</label>
						            </div>	
								</td>
			                    <td class="hidden-xs" style="padding-top:8px; width:90px;padding-left:1px;padding-rigth:1px">
	                       		<button type="button" class="btn btn-primary btn-circle"><i class="fa fa-list"></i> </button>
	                       		<button type="button" class="btn btn-warning btn-circle"><i class="fa fa-times"></i> </button>
	                        	</td>
			                  </tr>
		                 	 </#list>
		                 	 <#else>
		                     	<tr class="unread">
		                        <td colspan="8" align="center">该开发任务下暂无属性信息!</td>
		                        </tr>
		                  </#if>
		                </tbody>
		              </table>
		            </div>
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

<!-- 创建项目modal -->
<form class="form-horizontal" action="${basePath}/code/save.htm" method="post">
<div id="code_object_modal" class="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
      	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h5 class="modal-title">创建新的开发任务</h5>
      </div>
      <div class="modal-body">
        
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">项目名称</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="codeName">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">父模块</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="projectName">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">子模块</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="moduleName">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">表前缀</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="tableTop">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">模块信息</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="codeComment">
                </div>
              </div>
            
            
              
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
        <button type="submit" class="btn btn-danger waves-effect waves-light">保存项目信息</button>
      </div>
    </div>
  </div>
</div>
</form>


<!-- 属性字段modal -->
<form class="form-horizontal" action="${basePath}/code/propertySave.htm" method="post">
<div id="code_property_modal" class="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
      	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h5 class="modal-title">创建新的属性字段</h5>
      </div>
      <div class="modal-body">
         	 <input type="hidden" value="${codeId!''}" name="codeId">
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">名称</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="name">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">类型</label>
                <div class="col-sm-9">
                 <div class="radio">
                  <input type="radio" name="type"  value="bigint" checked>
                  <label for="radio1">bigint</label>
                 </div>
               	 <div class="radio">
                  <input type="radio" name="type"  value="text">
                  <label for="radio1">text</label>
                 </div>
                 
                 <div class="radio">
                  <input type="radio" name="type"  value="decimal" checked>
                  <label for="radio1">decimal</label>
                 </div>
               	 <div class="radio">
                  <input type="radio" name="type"  value="enum">
                  <label for="radio1">enum</label>
                 </div>
                 
                 <div class="radio">
                  <input type="radio" name="type"  value="varchar" checked>
                  <label for="radio1">varchar</label>
                 </div>
               	 <div class="radio">
                  <input type="radio" name="type"  value="datetime">
                  <label for="radio1">datetime</label>
                 </div>
                 </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">长度</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="length" id="length">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">是否为空</label>
                <div class="col-sm-9">
                 <div class="radio">
                  <input type="radio" name="isNull"  value="0" checked>
                  <label for="radio1">为空</label>
                 </div>
               	 <div class="radio">
                  <input type="radio" name="isNull"  value="1">
                  <label for="radio1">不为空</label>
                 </div>
                 </div>
              </div>
              
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">注释</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="comment">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">默认值</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="def">
                </div>
              </div>
              
               <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">查询条件</label>
                <div class="col-sm-9">
                 <div class="radio">
                  <input type="radio" name="isSearch"  value="0" checked>
                  <label for="radio1">不是</label>
                 </div>
               	 <div class="radio">
                  <input type="radio" name="isSearch"  value="1">
                  <label for="radio1">是</label>
                 </div>
                  </div>
              </div>
              
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
        <button type="submit" class="btn btn-danger waves-effect waves-light">保存项目信息</button>
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
<script>
$(function(){
	alert('abc');
	$("input[name='type']").bind("click",function(){   
	  	 $("#length").attr("readOnly",false);
	  	 var type = $(this).val();
	  	 if(type == 'bigint'){
	  	  	$('#length').val('(10)');
	  	 }else if(type == 'varchar'){
	  		$('#length').val('(100)');
	  	 }else if(type == 'enum'){
	  		$('#length').val("('0','1')");
	  	 }else if(type == 'decimal'){
	  		$('#length').val("(10,2)");
	  	 }else{
	  	 	$('#length').val("");
	  	 	$("#length").attr("readOnly",true);
	  	 }
  	});
});	
</script>
</html>
