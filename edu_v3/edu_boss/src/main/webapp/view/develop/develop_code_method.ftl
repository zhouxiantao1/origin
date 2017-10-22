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
<title>方式代码配置</title>
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
      <form id="subForm" action="${basePath}/code/method/save.htm"  method="post">
		<input type="hidden" id="codeId" value="${dcv.id!''}" name="codeId"/>
	        <div class="row">
		      <div class="col-sm-12">
				   <div class="white-box">
				   	 <div class="row">
					  <div class="col-lg-1 col-sm-1 col-xs-12" style="font-size:12px;padding-left:2px;padding-right:2px">
				        <button class="btn btn-block btn-info btn-rounded" type="submit">保存配置</button>
				      </div>
				      <div class="col-lg-1 col-sm-1 col-xs-12" style="font-size:12px;padding-left:2px;padding-right:2px">
				        <a href="${basePath}/code/list.htm?codeId=${dcv.id!''}" style="color:#ffffff"><button class="btn btn-block  btn-rounded">返回</a>
				      </div>
				      <div class="col-lg-1 col-sm-1 col-xs-12" style="font-size:12px;padding-left:5px;padding-right:5px">
				        <a href="${basePath}/code/preview.htm?codeId=${dcv.id!''}&type=bean" style="color:#ffffff"><button class="btn btn-block btn-info btn-rounded">预览bean</a>
				      </div>
				      <div class="col-lg-1 col-sm-1 col-xs-12" style="font-size:12px;padding-left:5px;padding-right:5px">
				        <a href="${basePath}/code/preview.htm?codeId=${dcv.id!''}&type=vo" style="color:#ffffff"><button class="btn btn-block btn-info btn-rounded">预览vo</a>
				      </div>
				      <div class="col-lg-1 col-sm-1 col-xs-12" style="font-size:12px;padding-left:5px;padding-right:5px">
				        <a href="${basePath}/code/preview.htm?codeId=${dcv.id!''}&type=search" style="color:#ffffff"><button class="btn btn-block btn-info btn-rounded">预览search</a>
				      </div>
				       <div class="col-lg-1 col-sm-1 col-xs-12" style="font-size:12px;padding-left:5px;padding-right:5px">
				        <a href="${basePath}/code/preview.htm?codeId=${dcv.id!''}&type=sql" style="color:#ffffff"><button class="btn btn-block btn-info btn-rounded">预览sql</a>
				      </div>
				     </div>
				    </div>
		      </div>
	        </div>
            <div class="row">
            	  <div class="col-sm-4">
		          <div class="white-box" style="padding:10px">
		            <h3 style="font-size:12px; font-weight:bold">${dcv.upperProjectName!''}${dcv.upperModuleName!''}Controller.java</h3>
		            <div class="inbox-center">
		              <table class="table table-hover" style="font-size:12px">
		                 
		                <tbody>
		                  <#if dmvs?? && dmvs?size != 0>
		                  <#list dmvs as dmv>
		                  <#if dmv.methodClassType == 'C'>
		                  <tr  class="unread">
		                    <td>
		                      <div class="checkbox checkbox-inverse">
	                            <input type="checkbox"  name="methodIds" value="${dmv.id!''}"  <#if dmv.codeId??>checked</#if>>
	                            <label for="checkbox0"></label>
	                          </div>
							</td>
		                    <td>
			                    <ul class="list-icons">
				                  <li style="line-height: 20px;"><i class="fa fa-caret-right text-info"></i>${dmv.methodName!''}</li>
				                  <li style="line-height: 20px;"><i class="fa fa-caret-right text-info"></i>(${dmv.methodCode!''})${dmv.methodComment!''}</li>
				                </ul>
	                		</td>
	                		<td>
			                    <button type="button" class="btn btn-info btn-circle"><a href="${basePath!''}/code/preview.htm?codeId=${dcv.id!''}&methodIds=${dmv.id!''}&type=controller"><i class="fa fa-check"></i></a>  </button>
	                		</td>
		                  </tr>
		                  </#if>
		                  </#list>
		                  </#if>
		                  
		                </tbody>
		              </table>
		            </div>
		          </div>
		        </div>
		        
		        
		         <div class="col-sm-4">
		          <div class="white-box" style="padding:10px">
		            <h3 style="font-size:12px; font-weight:bold">${dcv.upperProjectName!''}${dcv.upperModuleName!''}Service.java</h3>
		            <div class="inbox-center">
		               <table class="table table-hover" style="font-size:12px">
		                <tbody>
		                   <#if dmvs?? && dmvs?size != 0>
			                  <#list dmvs as dmv>
			                  <#if dmv.methodClassType == 'S'>
			                  <tr  class="unread">
			                    <td>
			                      <div class="checkbox checkbox-inverse">
		                            <input type="checkbox"  name="methodIds" value="${dmv.id!''}" <#if dmv.codeId??>checked</#if>>
		                            <label for="checkbox0"></label>
		                          </div>
								</td>
			                    <td>
				                    <ul class="list-icons">
					                  <li style="line-height: 20px;"><i class="fa fa-caret-right text-info"></i>${dmv.methodName!''}</li>
					                  <li style="line-height: 20px;"><i class="fa fa-caret-right text-info"></i>(${dmv.methodCode!''})${dmv.methodComment!''}</li>
					                </ul>
		                		</td>
		                		<td>
				                    <button type="button" class="btn btn-info btn-circle"><a href="${basePath!''}/code/preview.htm?codeId=${dcv.id!''}&methodIds=${dmv.id!''}&type=service"><i class="fa fa-check"></i></a>  </button>
				                    <button type="button" class="btn btn-info btn-circle"><a href="${basePath!''}/code/preview.htm?codeId=${dcv.id!''}&methodIds=${dmv.id!''}&type=serviceImpl"><i class="fa fa-check"></i></a>  </button>
		                		</td>
			                  </tr>
			                  </#if>
			                  </#list>
			                  </#if>
		                </tbody>
		              </table>
		            </div>
		          </div>
		        </div>
		       
		         <div class="col-sm-4">
		          <div class="white-box" style="padding:10px">
		            <h3 style="font-size:12px; font-weight:bold">${dcv.upperProjectName!''}${dcv.upperModuleName!''}Mapper.java</h3>
		            <div class="inbox-center">
		               <table class="table table-hover" style="font-size:12px">
		                 
		                <tbody>
		                   <#if dmvs?? && dmvs?size != 0>
			                  <#list dmvs as dmv>
			                  <#if dmv.methodClassType == 'D'>
			                  <tr  class="unread">
			                    <td>
			                      <div class="checkbox checkbox-inverse">
		                            <input type="checkbox"  name="methodIds" value="${dmv.id!''}"  <#if dmv.codeId??>checked</#if>>
		                            <label for="checkbox0"></label>
		                          </div>
								</td>
			                    <td>
				                    <ul class="list-icons">
					                  <li style="line-height: 20px;"><i class="fa fa-caret-right text-info"></i>${dmv.methodName!''}</li>
					                  <li style="line-height: 20px;"><i class="fa fa-caret-right text-info"></i>(${dmv.methodCode!''})${dmv.methodComment!''}</li>
					                </ul>
		                		</td>
		                		<td>
				                    <button type="button" class="btn btn-info btn-circle"><a href="${basePath!''}/code/preview.htm?codeId=${dcv.id!''}&methodIds=${dmv.id!''}&type=mapper"><i class="fa fa-check"></i></a>  </button>
				                    <button type="button" class="btn btn-info btn-circle"><a href="${basePath!''}/code/preview.htm?codeId=${dcv.id!''}&methodIds=${dmv.id!''}&type=mapperImpl"><i class="fa fa-check"></i></a>  </button>
				                    <button type="button" class="btn btn-info btn-circle"><a href="${basePath!''}/code/preview.htm?codeId=${dcv.id!''}&methodIds=${dmv.id!''}&type=xml"><i class="fa fa-check"></i></a>  </button>
		                		</td>
			                  </tr>
			                  </#if>
			                  </#list>
			                  </#if>
		                </tbody>
		              </table>
		            </div>
		          </div>
		        </div>
		      </div>
		      </form>
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
<div id="code_object_modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
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
<div id="code_property_modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
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
                <label for="inputEmail3" class="col-sm-2 control-label">类型</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="type">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">长度</label>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="length">
                </div>
              </div>
              
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">是否为空</label>
                <div class="col-sm-9">
                 <div class="radio">
                  <input type="radio" name="isNull" id="radio1" value="0" checked>
                  <label for="radio1">为空</label>
                 </div>
               	 <div class="radio">
                  <input type="radio" name="isNull" id="radio1" value="1">
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
                <label for="inputPassword3" class="col-sm-2 control-label">是否生成对应的操作方法</label>
                <div class="col-sm-9">
                 <div class="radio">
                  <input type="radio" name="isGenerate" id="radio2" value="0" checked>
                  <label for="radio1">不生成</label>
                
                 </div>
               	 <div class="radio">
                  <input type="radio" name="isGenerate" id="radio2" value="1">
                  <label for="radio1">生成</label>
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
</html>
<script>

	function sumbit_develop_method(){
	
		$('#subForm').empty();
		alert('abc');
	    obj = document.getElementsByName("checkboxs");
	    $('#subForm').append("<input type='hidden' name='codeId' value="+$('#codeId').val());
	    for(k in obj){
	        if(obj[k].checked)
	        	$('#subForm').append("<input type='hidden' name='methodIds' value="+obj[k].value);
	    }
	   // $('#subForm').submit();  
	    
	}

</script>
