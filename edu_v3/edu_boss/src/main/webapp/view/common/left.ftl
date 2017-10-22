<!-- Left navbar-header -->
  <div class="navbar-default sidebar" role="navigation">
    
    <div class="sidebar-nav navbar-collapse slimscrollsidebar">
      <div class="user-profile">
        <div class="dropdown user-pro-body">
          <div><img src="${basePath}/plugins/images/users/varun.jpg" src="http://eliteadmin.themedesigner.in/demos/${basePath}/plugins/images/users/varun.jpg" alt="user-img" class="img-circle"></div>
          <a href="#" class="dropdown-toggle u-dropdown" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${Session.SPRING_SECURITY_CONTEXT.authentication.principal.username!'xxx'}<span class="caret"></span></a>
              <ul class="dropdown-menu animated flipInY">
                <li><a href="#"><i class="ti-user"></i> My Profile</a></li>
                <li><a href="#"><i class="ti-wallet"></i> My Balance</a></li>
                <li><a href="#"><i class="ti-email"></i> Inbox</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#"><i class="ti-settings"></i> Account Setting</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="${basePath}/j_spring_security_logout"><i class="fa fa-power-off"></i>&nbsp;安全退出</a></li>
              </ul>
        </div>
      </div>
      
      <ul class="nav" id="side-menu">
        
        <li class="sidebar-search hidden-sm hidden-md hidden-lg">
          <!-- input-group -->
          <div class="input-group custom-search-form">
            <input type="text" class="form-control" placeholder="Search...">
            <span class="input-group-btn">
            <button class="btn btn-default" type="button"> <i class="fa fa-search"></i> </button>
            </span> </div>
          <!-- /input-group -->
        </li>
        <li class="nav-small-cap m-t-10">--- Main Menu</li>
        <li> <a href="${basePath}/home.htm" class="waves-effect active"><i class="linea-icon linea-basic fa-fw" data-icon="v"></i> <span class="hide-menu">控制台首页</span></a></li>
        <#assign menu = Session.SPRING_SECURITY_CONTEXT.authentication.principal.menumap>
        <#if menu?? && menu?size !=0>
        <#list menu as m1>
        <li> <a  class="waves-effect"><i data-icon="O" class="${m1.img_url!''}"></i>&nbsp;&nbsp;&nbsp;<span class="hide-menu">${m1.name!''}<span class="fa arrow"></span></span></a>
          <#if m1.menu2map?? && m1.menu2map?size != 0>
          <ul class="nav nav-second-level">
            <#list m1.menu2map as m2>
            <li><a href="${basePath!''}${m2.url!''}">${m2.name!''}</a></li> 
          	</#list>
          </ul>
          </#if>
        </li>
        </#list>
        </#if>
        <li class="nav-small-cap">--- Support</li>
        <li><a href="${basePath}/j_spring_security_logout" class="waves-effect"><i class="icon-logout fa-fw"></i> <span class="hide-menu">安全退出</span></a></li>
        <li class="hide-menu">
          <a href="javacript:void(0);">         
            <span>Progress Report</span>
            <div class="progress">
              <div class="progress-bar progress-bar-info" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 85%" role="progressbar"> <span class="sr-only">85% Complete (success)</span> </div>
            </div>
            <span>Leads Report</span>
            <div class="progress">
              <div class="progress-bar progress-bar-danger" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 85%" role="progressbar"> <span class="sr-only">85% Complete (success)</span> </div>
            </div>
           </a> 
        </li>
      </ul>
    </div>
  </div>
  <!-- Left navbar-header end -->