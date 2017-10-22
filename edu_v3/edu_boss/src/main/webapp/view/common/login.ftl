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
<link rel="icon" type="image/png" sizes="16x16" href="../plugins/images/favicon.png">
<title>Elite CRM Admin Template - CRM admin dashboard web app kit</title>
<!-- Bootstrap Core CSS -->
<link href="${basePath}/bootstrap/dist/css/bootstrap.min.css" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- animation CSS -->
<link href="${basePath}/css/animate.css" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/css/animate.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="${basePath}/css/style.css" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/css/style.css" rel="stylesheet">
<!-- color CSS -->
<link href="${basePath}/css/colors/gray-dark.css" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/css/colors/gray-dark.css" id="theme"  rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="../../../oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js" tppabs="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="../../../oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js" tppabs="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
</head>
<body>

<section id="wrapper" class="login-register">
  <div class="login-box">
    <div class="white-box">
      <form class="form-horizontal form-material" id="loginform" action="j_spring_security_check" method="post">
        <h3 class="box-title m-b-20" style="font-weight:bold">欢迎登录</h3>
        <div class="form-group ">
          <div class="col-xs-12">
            <input class="form-control" type="text" required="" placeholder="帐号" id="j_username"  name="j_username" style="font-size:13px; font-weight:bold;">
          </div>
        </div>
        <div class="form-group">
          <div class="col-xs-12">
            <input class="form-control" type="password" required="" placeholder="密码" id="j_password"	name="j_password"  style="font-size:13px;font-weight:bold;">
          </div>
        </div>
        
        <div class="form-group"  id="geetestDiv">
          <div class="col-xs-8"><input class="form-control code_text" type="text" required="" placeholder="验证码" id="j_validateCode"	name="j_validateCode"  style="font-size:13px;font-weight:bold;"></div>
          <div class="col-xs-4">
             <a href="javascript:;">
              <img id="imgObj" alt="" title="换一张试试" src="generatevVerifyCode.htm" onclick="javascript:changeImage();" align="middle" style="cursor:pointer;"/>
	     	 </a>
          </div>
        </div>
        <#if SPRING_SECURITY_LAST_EXCEPTION?? && SPRING_SECURITY_LAST_EXCEPTION.message??>
        	<#if SPRING_SECURITY_LAST_EXCEPTION.message == 'Bad credentials'>
        		<div class="form-group"><div class="col-xs-12"><div class="alert alert-danger">帐号密码错误！请核对后再操作 </div></div></div>
	     	<#else>
	     		<div class="form-group"><div class="col-xs-12"><div class="alert alert-danger">${SPRING_SECURITY_LAST_EXCEPTION.message!''} </div></div></div>
	     	</#if>
	    </#if>
        <div class="form-group">
          <div class="col-md-12">
            <div class="checkbox checkbox-primary pull-left p-t-0">
              <input id="checkbox-signup" type="checkbox">
              <label for="checkbox-signup"> Remember me </label>
            </div>
            <a href="javascript:void(0)" id="to-recover" class="text-dark pull-right"><i class="fa fa-lock m-r-5"></i> Forgot pwd?</a> </div>
        </div>
        <div class="form-group text-center m-t-20">
          <div class="col-xs-12">
            <button class="btn btn-info btn-lg btn-block text-uppercase waves-effect waves-light" type="submit">登录</button>
          </div>
        </div>
        <div class="row">
          <div class="col-xs-12 col-sm-12 col-md-12 m-t-10 text-center">
            <div class="social"><a href="javascript:void(0)" class="btn  btn-facebook" data-toggle="tooltip"  title="Login with Facebook"> <i aria-hidden="true" class="fa fa-facebook"></i> </a> <a href="javascript:void(0)" class="btn btn-googleplus" data-toggle="tooltip"  title="Login with Google"> <i aria-hidden="true" class="fa fa-google-plus"></i> </a> </div>
          </div>
        </div>
        <div class="form-group m-b-0">
          <div class="col-sm-12 text-center">
            <p>Don't have an account? <a href="register.html" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/register.html" class="text-primary m-l-5"><b>Sign Up</b></a></p>
          </div>
        </div>
      </form>
      <form class="form-horizontal" id="recoverform" action="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/index.html">
        <div class="form-group ">
          <div class="col-xs-12">
            <h3>Recover Password</h3>
            <p class="text-muted">Enter your Email and instructions will be sent to you! </p>
          </div>
        </div>
        <div class="form-group ">
          <div class="col-xs-12">
            <input class="form-control" type="text" required="" placeholder="Email">
          </div>
        </div>
        <div class="form-group text-center m-t-20">
          <div class="col-xs-12">
            <button class="btn btn-primary btn-lg btn-block text-uppercase waves-effect waves-light" type="submit">Reset</button>
          </div>
        </div>
      </form>
    </div>
  </div>
</section>
<!-- jQuery -->
<script src="${basePath}/plugins/bower_components/jquery/dist/jquery.min.js" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="bootstrap/dist/js/bootstrap.min.js" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Menu Plugin JavaScript -->
<script src="${basePath}/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>

<!--slimscroll JavaScript -->
<script src="${basePath}/js/jquery.slimscroll.js" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/jquery.slimscroll.js"></script>
<!--Wave Effects -->
<script src="${basePath}/js/waves.js" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/waves.js"></script>
<!-- Custom Theme JavaScript -->
<script src="${basePath}/js/custom.min.js" tppabs="http://eliteadmin.themedesigner.in/demos/eliteadmin-crm/js/custom.min.js"></script>
<!--Style Switcher -->
<script src="${basePath}/plugins/bower_components/styleswitcher/jQuery.style.switcher.js" tppabs="http://eliteadmin.themedesigner.in/demos/plugins/bower_components/styleswitcher/jQuery.style.switcher.js"></script>
<script type="text/javascript">
function changeImage() {
	var imgsrc = document.getElementById("imgObj");
	var oldsrc = imgsrc.src;
	var newsrc = changeImageUrl(oldsrc);
	imgsrc.src = newsrc;
};

//添加時間戳，避免瀏覽器使用緩存
function changeImageUrl(url) {
	var timestamp = (new Date()).valueOf();
	var postion = url.indexOf("?");
	if (postion >= 0) {
		var suburl = url.substr(0, postion);
		url = suburl + "?timestamp=" + timestamp;
	} else {
		url = url + "?timestamp=" + timestamp;
	}

	return url;
};
</script>
</body>
</html>
