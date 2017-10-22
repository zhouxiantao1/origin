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
<title>首页</title>
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
<body>
<input type="hidden" id="basePath" value="${basePath!''}">
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
          <h4 class="page-title">CRM Dashboard Page</h4>
        </div>
        <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
          <ol class="breadcrumb">
            <li><a href="#">Dashboard</a></li>
            <li class="active">CRM Dashboard</li>
          </ol>
        </div>
        <!-- /.col-lg-12 -->
      </div>
      <!--row -->
      <div class="row">
        <div class="col-md-3 col-sm-6">
          <div class="white-box">
            <div class="r-icon-stats">
              <i class="ti-user bg-danger"></i>
              <div class="bodystate">
                <h4>3564</h4>
                <span class="text-muted">New Customers</span>
              </div>
            </div>  
          </div>
        </div>
        <div class="col-md-3 col-sm-6">
          <div class="white-box">
            <div class="r-icon-stats">
              <i class="ti-shopping-cart bg-info"></i>
              <div class="bodystate">
                <h4>342</h4>
                <span class="text-muted">New Products</span>
              </div>
            </div>  
          </div>
        </div>
        <div class="col-md-3 col-sm-6">
          <div class="white-box">
            <div class="r-icon-stats">
              <i class="ti-wallet bg-success"></i>
              <div class="bodystate">
                <h4>56%</h4>
                <span class="text-muted">Today's Profit</span>
              </div>
            </div>  
          </div>
        </div>
        <div class="col-md-3 col-sm-6">
          <div class="white-box">
            <div class="r-icon-stats">
              <i class="ti-star bg-inverse"></i>
              <div class="bodystate">
                <h4>56%</h4>
                <span class="text-muted">New Leads</span>
              </div>
            </div>  
          </div>
        </div>
      </div>
      <!--/row -->
      <!--row -->
      <div class="row">
        <div class="col-md-5 col-lg-4 col-sm-12 col-xs-12">
          <div class="white-box">
              <h3 class="box-title">Leads by Source</h3>
              <div id="morris-donut-chart" class="ecomm-donute" style="height: 317px;"></div>
              <ul class="list-inline m-t-30 text-center">
                <li class="p-r-20">
                  <h5 class="text-muted"><i class="fa fa-circle" style="color: #fb9678;"></i> Ads</h5>
                  <h4 class="m-b-0">8500</h4>
                </li>
                <li class="p-r-20">
                  <h5 class="text-muted"><i class="fa fa-circle" style="color: #01c0c8;"></i> Tredshow</h5>
                  <h4 class="m-b-0">3630</h4>
                </li>
                <li>
                  <h5 class="text-muted"> <i class="fa fa-circle" style="color: #4F5467;"></i> Web</h5>
                  <h4 class="m-b-0">4870</h4>
                </li>
            </ul>
          </div>
       </div>  
        <div class="col-md-7 col-lg-8 col-sm-12 col-xs-12">
          <div class="white-box">
            <h3 class="box-title">Top Products sales</h3>
            <ul class="list-inline text-center">
              <li>
                <h5><i class="fa fa-circle m-r-5" style="color: #00bfc7;"></i>iMac</h5>
              </li>
              <li>
                <h5><i class="fa fa-circle m-r-5" style="color: #b4becb;"></i>iPhone</h5>
              </li>
            </ul>

            <div id="morris-area-chart2" style="height: 370px;"></div>
          </div>
        </div>
              
      </div>
      <!-- row -->
       <!-- .row -->
      <div class="row">
        <div class="col-md-4 col-sm-12 col-xs-12">
          <div class="white-box">
            <h3 class="box-title"><small class="pull-right m-t-10 text-success"><i class="fa fa-sort-asc"></i> 18% High then last month</small> Total Leads</h3>
            <div class="stats-row">
              <div class="stat-item">
                <h6>Overall Growth</h6>
                <b>80.40%</b></div>
              <div class="stat-item">
                <h6>Montly</h6>
                <b>15.40%</b></div>
              <div class="stat-item">
                <h6>Day</h6>
                <b>5.50%</b></div>
            </div>
            <div id="sparkline8" class="minus-mar"></div>
          </div>
        </div>
        <div class="col-md-4 col-sm-12 col-xs-12">
          <div class="white-box">
            <h3 class="box-title"><small class="pull-right m-t-10 text-danger"><i class="fa fa-sort-desc"></i> 18% High then last month</small>Total Vendor</h3>
            <div class="stats-row">
              <div class="stat-item">
                <h6>Overall Growth</h6>
                <b>80.40%</b></div>
              <div class="stat-item">
                <h6>Montly</h6>
                <b>15.40%</b></div>
              <div class="stat-item">
                <h6>Day</h6>
                <b>5.50%</b></div>
            </div>
            <div id="sparkline9" class="minus-mar"></div>
          </div>
        </div>
        <div class="col-md-4 col-sm-12 col-xs-12">
          <div class="white-box">
            <h3 class="box-title"><small class="pull-right m-t-10 text-success"><i class="fa fa-sort-asc"></i> 18% High then last month</small>Invoice Generate</h3>
            <div class="stats-row">
              <div class="stat-item">
                <h6>Overall Growth</h6>
                <b>80.40%</b></div>
              <div class="stat-item">
                <h6>Montly</h6>
                <b>15.40%</b></div>
              <div class="stat-item">
                <h6>Day</h6>
                <b>5.50%</b></div>
            </div>
            <div id="sparkline10" class="minus-mar"></div>
          </div>
        </div>
      </div>
      <!-- /.row -->
      <!-- /row -->
      <div class="row">
        <div class="col-sm-6">
          <div class="white-box">
            <h3 class="box-title m-b-0">New Customers List</h3>
            <p class="text-muted">this is the sample data here for crm</p>
            <div class="table-responsive">
              <table class="table">
                <thead>
                  <tr>
                    <th>#</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Username</th>
                    <th>Role</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>1</td>
                    <td>Deshmukh</td>
                    <td>Prohaska</td>
                    <td>@Genelia</td>
                    <td><span class="label label-danger">admin</span> </td>
                  </tr>
                  <tr>
                    <td>2</td>
                    <td>Deshmukh</td>
                    <td>Gaylord</td>
                    <td>@Ritesh</td>
                    <td><span class="label label-info">member</span> </td>
                  </tr>
                  <tr>
                    <td>3</td>
                    <td>Sanghani</td>
                    <td>Gusikowski</td>
                    <td>@Govinda</td>
                    <td><span class="label label-warning">developer</span> </td>
                  </tr>
                  <tr>
                    <td>4</td>
                    <td>Roshan</td>
                    <td>Rogahn</td>
                    <td>@Hritik</td>
                    <td><span class="label label-success">supporter</span> </td>
                  </tr>
                  <tr>
                    <td>5</td>
                    <td>Joshi</td>
                    <td>Hickle</td>
                    <td>@Maruti</td>
                    <td><span class="label label-info">member</span> </td>
                  </tr>
                  <tr>
                    <td>6</td>
                    <td>Nigam</td>
                    <td>Eichmann</td>
                    <td>@Sonu</td>
                    <td><span class="label label-success">supporter</span> </td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
        <div class="col-sm-6">
          <div class="white-box">
            <h3 class="box-title m-b-0">New Product List</h3>
            <p class="text-muted">this is the sample data here for crm</p>
            <div class="table-responsive">
              <table class="table table-hover">
                <thead>
                  <tr>
                    <th>#</th>
                    <th>Products</th>
                    <th>Popularity</th>
                    <th>Sales</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>1</td>
                    <td>Milk Powder</td>
                    <td><span class="peity-line" data-width="120" data-peity='{ "fill": ["#13dafe"], "stroke":["#13dafe"]}' data-height="40">0,-3,-2,-4,-5,-4,-3,-2,-5,-1</span> </td>
                    <td><span class="text-danger text-semibold"><i class="fa fa-level-down" aria-hidden="true"></i> 28.76%</span> </td>
                  </tr>
                  <tr>
                    <td>2</td>
                    <td>Air Conditioner</td>
                    <td><span class="peity-line" data-width="120" data-peity='{ "fill": ["#13dafe"], "stroke":["#13dafe"]}' data-height="40">0,-1,-1,-2,-3,-1,-2,-3,-1,-2</span> </td>
                    <td><span class="text-warning text-semibold"><i class="fa fa-level-down" aria-hidden="true"></i> 8.55%</span> </td>
                  </tr>
                  <tr>
                    <td>3</td>
                    <td>RC Cars</td>
                    <td><span class="peity-line" data-width="120" data-peity='{ "fill": ["#13dafe"], "stroke":["#13dafe"]}' data-height="40">0,3,6,1,2,4,6,3,2,1</span> </td>
                    <td><span class="text-success text-semibold"><i class="fa fa-level-up" aria-hidden="true"></i> 58.56%</span> </td>
                  </tr>
                  <tr>
                    <td>4</td>
                    <td>Down Coat</td>
                    <td><span class="peity-line" data-width="120" data-peity='{ "fill": ["#13dafe"], "stroke":["#13dafe"]}' data-height="40">0,3,6,4,5,4,7,3,4,2</span> </td>
                    <td><span class="text-info text-semibold"><i class="fa fa-level-up" aria-hidden="true"></i> 35.76%</span> </td>
                  </tr>
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
            <ul class="m-t-20 all-demos">
               <li><b>Choose other demos</b></li>
            </ul>
            <ul class="m-t-20 chatonline">
              <li><b>Chat option</b></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/plugins/images/users/varun.jpg" src="http://eliteadmin.themedesigner.in/demos/${basePath}/plugins/images/users/varun.jpg" alt="user-img" class="img-circle"> <span>Varun Dhavan <small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/plugins/images/users/genu.jpg" src="http://eliteadmin.themedesigner.in/demos/${basePath}/plugins/images/users/genu.jpg" alt="user-img"  class="img-circle"> <span>Genelia Deshmukh <small class="text-warning">Away</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/plugins/images/users/ritesh.jpg" src="http://eliteadmin.themedesigner.in/demos/${basePath}/plugins/images/users/ritesh.jpg" alt="user-img"  class="img-circle"> <span>Ritesh Deshmukh <small class="text-danger">Busy</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/plugins/images/users/arijit.jpg" src="http://eliteadmin.themedesigner.in/demos/${basePath}/plugins/images/users/arijit.jpg" alt="user-img" class="img-circle"> <span>Arijit Sinh <small class="text-muted">Offline</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/plugins/images/users/govinda.jpg" src="http://eliteadmin.themedesigner.in/demos/${basePath}/plugins/images/users/govinda.jpg" alt="user-img" class="img-circle"> <span>Govinda Star <small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/plugins/images/users/hritik.jpg" src="http://eliteadmin.themedesigner.in/demos/${basePath}/plugins/images/users/hritik.jpg" alt="user-img" class="img-circle"> <span>John Abraham<small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/plugins/images/users/john.jpg" src="http://eliteadmin.themedesigner.in/demos/${basePath}/plugins/images/users/john.jpg" alt="user-img" class="img-circle"> <span>Hritik Roshan<small class="text-success">online</small></span></a></li>
              <li><a href="javascript:void(0)"><img src="${basePath}/plugins/images/users/pawandeep.jpg" src="http://eliteadmin.themedesigner.in/demos/${basePath}/plugins/images/users/pawandeep.jpg" alt="user-img" class="img-circle"> <span>Pwandeep rajan <small class="text-success">online</small></span></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- /.right-sidebar -->
    </div>	
    <!-- /.container-fluid -->
    <footer class="footer text-center">Copyright © 华南师范大学人才测评与考试研究所 广州市信息中心（广州市电化教育馆） 广东省心理学会 水晶球教育信息技术有限公司</footer>
  </div>
  <!-- /#page-wrapper -->
</div>
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
