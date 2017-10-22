<!DOCTYPE html>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign basePath=request.contextPath>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>基础信息-管理人员</title>
	<!-- IE浏览器运行最新的渲染模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/common.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common/style.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/report_manage.css">
	<link rel="stylesheet" type="text/css" href="${basePath!''}/css/wenjuan_biaoku.css">
</head>
<body>

	<!-- 引入公共头部 -->
	<#include '/common/top.ftl' /> 
	<div class="content_contain">
		<div class="content">
			<div class="middle middle_1200 fl">
				<div class="nav_list clearfix">
					<ul class="paper_list fl clearfix">
						<li onClick="javascript:window.location.href='${basePath!''}/base/staff/list.htm'">人员管理</li>
						<li onClick="javascript:window.location.href='${basePath!''}/base/school/list.htm'">学校管理</li>
						<li class="active">基础数据管理</li>
					</ul>
					<div class="new_zhibiao fr">
						<a onClick="javascript:window.location.href='${basePath!''}/base/catalog/create.htm'"> <img src="${basePath!''}/images/形状-4.png"> <i>新增教材管理</i></a>
					</div>
				</div>	

				<div class="all_content">
					<div class="operation clearfix">
						<p id="staff" onClick="javascript:window.location.href='${basePath!''}/base/grade/list.htm'">年级管理</p>
						<p id="teacher" onClick="javascript:window.location.href='${basePath!''}/base/subject/list.htm'">学科管理</p>
						<p id="staff" onClick="javascript:window.location.href='${basePath!''}/question/type/list.htm'">题型管理</p>
						<p id="teacher" class="active">教材管理</p>
						<p id="teacher" onClick="javascript:window.location.href='${basePath!''}/base/knowledge/list.htm'">知识点管理</p>
						<!-- <div class="mingti fr">
							<button onClick="javascript:window.location.href='${basePath!''}/base/catalog/create.htm'"> <i>+</i> 新增</button>
						</div> -->
					</div>
					<div class="klass_sub">
						<span>学科：</span>	
						<select id="subjectId" onChange="fillSchool()">
							<option value="">全部</option>
							<#if baseSubjectVos?? && baseSubjectVos?size!=0>
								<#list baseSubjectVos as baseSubjectVo>
									<option value=${baseSubjectVo.id!''}>${baseSubjectVo.name!''}</option>
								</#list>
							</#if>
						</select>
						<span class="sub">年级：</span>
						<select id="gradeId">
							<option value="">全部</option>
							<#if baseGradeVos?? && baseGradeVos?size!=0>
								<#list baseGradeVos as baseGradeVo>
									<option value=${baseGradeVo.id!''}>${baseGradeVo.name!''}</option>
								</#list>
							</#if>
						</select>
						<span class="sub">版本：</span>
						<select id="versionId">
							<option value="">全部</option>
							<#if baseVersionVos?? && baseVersionVos?size!=0>
								<#list baseVersionVos as baseVersionVo>
									<option value=${baseVersionVo.id!''}>${baseVersionVo.name!''}</option>
								</#list>
							</#if>
						</select>
						<span class="work_name">教材名称：</span>
						<input type="text" id="catalogName" placeholder="输入教材名称">
						<button class="check fr" onClick="search_ask('query','1')">查询</button>
					</div>
					<div class="staff_list_contain">
						<div class="list_one clearfix">
							<p class="fl catalog_one">教材名称</p>
							<p class="fl catalog_towe" >学科</p>
							<p class="fl catalog_towe" >年级</p>
							<p class="fl catalog_towe" >版本</p>
							<p class="fl staff_towe">操作</p>
						</div>
					</div>
					
					<#if pageBean.list?? && pageBean.list?size!=0>
						<#list pageBean.list as baseCatalogVo>
							<div class="staff_list_contain" >
								<div class="some_detail clearfix">
									<p class="fl catalog_one" onClick="get_catalogDetail(${baseCatalogVo.id!''})"><img id="img_${baseCatalogVo.id!''}" type="1" src="${basePath!''}/images/catalog_right.png">${baseCatalogVo.name!''}</p>
									<p class="fl catalog_towe" ><#if baseCatalogVo.baseSubjectVo??>${baseCatalogVo.baseSubjectVo.name}<#else>-</#if></p>
									<p class="fl catalog_towe" ><#if baseCatalogVo.baseGradeVo??>${baseCatalogVo.baseGradeVo.name}<#else>-</#if></p>
									<p class="fl catalog_towe" ><#if baseCatalogVo.baseVersionVo??>${baseCatalogVo.baseVersionVo.name}<#else>-</#if></p>
									<p class="fl staff_three"><button onClick="get_leve(${baseCatalogVo.id!''},0,'${baseCatalogVo.name!''}')">+添加下级</button></p>
									
								</div>
								<div id="catalog_${baseCatalogVo.id!''}"></div>
							</div>
						</#list>
					<#else>
						<h1 class="answer_msg"><img src="${basePath!''}/images/no-content.png"><br>暂无信息！！！</h1>
					</#if>
					
					<!-- 测评的弹窗 -->
					<div class="layer_open" style="display: none">
						<h3>下级信息</h3>
						<div class="test_msg_list">
							<div class="test_object">
								<span>父名称：</span>
								<span1 id="catalogName"></span1>
							</div>
							<div class="test_object">
								<span><n style="color:#f90202">*</n>子名称：</span>
								<input type="text" id="catalogdetailName" placeholder="一百字以内">
								<em id="title_msg" style="display:none"><img src="${basePath!''}/images/warning_msg.png" class="warning_msg"><i class="err_msg">姓名不可以为空</i></em>
							</div>
						</div>
						<div class="baocun">
							<button class="bc">保存</button>
						</div>
						
					</div>
				</div>
				<!-- 分页 -->
				<div class="page_list clearfix" id="demo2">
					<div class="mids fr">
						<ul class="page_num clearfix">
						   <#if pageBean.pageNo != 1>
						   	  <li onClick="search_ask('page','${pageBean.firstPageNo!''}')" >首页</li>
              	              <li onClick="search_ask('page','${pageBean.prePageNo!''}')" >上一页</li>
                           </#if>
                            <#list pageBean.startNo..pageBean.endNo as index>
              					<#if index == pageBean.pageNo>
              						<li class="active"   onClick="search_ask('page','${pageBean.pageNo}')">${pageBean.pageNo}</li>
              					<#else>
              						<li  onClick="search_ask('page','${index}')">${index}</li>
              					</#if>
			  				</#list>
			  				
			  				 <#if pageBean.pageNo != pageBean.totalPages>
								<li onClick="search_ask('page','${pageBean.nextPageNo!''}')">下一页</li>
								<li onClick="search_ask('page','${pageBean.lastPageNo!''}')">未页</li>
              				</#if>
              				<li>${pageBean.pageNo}/${pageBean.totalPages}</li>
              				<li>共${pageBean.rows}条记录，分 ${pageBean.totalPages} 页</li>
						</ul>
					</div>	
				</div>
				
			</div>

		<!-- 右侧边栏 -->


		</div>
	</div>

	<div class="footer">
		<div class="footer_b">
			<span>Copyright © 华南师范大学人才测评与考试研究所 广东省心理学会 水晶球教育信息有限公司</span>
		</div>
	</div>


<script src="${basePath!''}/js/jquery.min.js"></script>
<script src="${basePath!''}/js/placeholder.js"></script>
<script src="${basePath!''}/layer/layer.js"></script>
<script type="text/javascript">
	$(function(){
		<#if search??>	
			$('#gradeId').val(${search.gradeId!''});
			$('#subjectId').val('${search.subjectId!''}');
			$('#versionId').val(${search.versionId!''});
			$('#catalogName').val('${search.name!''}');
		</#if>	
	})
	
	//初始化
	function get_leve(id,parentId,catalogName){
		$('#catalogName').html(catalogName);
		var layers = layer.open({
			  type: 1,
			  title: false,
			  area: ['600px','380px'],
			  // skin: 'layui-layer-nobg', //没有背景色
			  shadeClose: true,
			  content: $('.layer_open'),
			  success:function(dom){
				  console.log(dom);
				  var confirm = dom.find('.bc');	//确定按钮
		
				  	//关闭
				  confirm.on('click',function(){
				  		save_catalogDetail($('#catalogdetailName').val(),parentId,id);
				  		layer.close(layers);
				  		window.location.reload();
				  })
			  }
		})
	}
	
	function save_catalogDetail1(name,parentId,catalogId){
		alert(name+"="+parentId+"="+catalogId);
	}
	
	//保存
	function save_catalogDetail(name,parentId,catalogId){
		$.ajax({  
          type:'post',  
          url:'${basePath!''}/base/catalogDetail/list/save.htm',  
          data:{
          		'name':name,
          		'parentId':parentId,
          		'catalogId':catalogId
          	},
          async:false,
          success:function(data){  
        	                 
          }  
       });
	}
	
	//点击加载章节
	function get_catalogDetail(id){
	   var htmlStr = "";
	   var type = $("#img_"+id).attr("type");
	   if(type=="1"){
	   		$.ajax({  
		       type:'get',  
		       url:'${basePath!''}/base/catalogDetail/listbysearch.htm',  
		       data:{'catalogId':id,'parentId':'0'},
		       async:false,
		       success:function(data){  
		       	 var Curedata = $.extend(true, [], data);      	  
				 if (Curedata != null) {
					 for ( var i = 0; i < Curedata.length; i++) {
					 	 var detailName = "'"+Curedata[i].name+"'";
					 	 var gradeId = "'"+Curedata[i].gradeId+"'";
					 	 var subjectId = "'"+Curedata[i].subjectId+"'";
						 htmlStr += '<div class="some_detail clearfix">'+
							'<p class="fl catalog_one" type="1" onClick="catalogDetail_child('+Curedata[i].id+')">&nbsp&nbsp&nbsp&nbsp<img id="img_detail'+Curedata[i].id+'" type="1" src="${basePath!''}/images/catalog_right.png">'+Curedata[i].name+'</p>'+
							'<p class="fl catalog_towe" >-</p>'+
							'<p class="fl catalog_towe" >-</p>'+
							'<p class="fl catalog_towe" >-</p>'+
							'<p class="fl staff_three"><button onClick="get_leve('+Curedata[i].catalogId+','+Curedata[i].id+','+detailName+')">添加下级</button></p>'+
						  '</div>';
						  //下级菜单
						  var childData = $.extend(true, [], Curedata[i].bcdvs);
						  htmlStr +='<div id="child_'+Curedata[i].id+'" style="display:none;">'
						  for(var j = 0; j < childData.length; j++){
						  	   htmlStr += '<div class="some_detail clearfix">'+
								'<p class="fl catalog_one1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp'+childData[j].name+'</p>'+
								'<p class="fl catalog_towe" >-</p>'+
								'<p class="fl catalog_towe" >-</p>'+
								'<p class="fl catalog_towe" >-</p>'+
								'<p class="fl staff_three"><span >-</span></p>'+
							  '</div>';
						  } 
						  htmlStr +='</div>'; 
					 }	
					 $("#catalog_"+id).append(htmlStr);
			     }                
		      }
		   });
	   		$("#img_"+id).attr("type","2");
	   		$("#img_"+id).attr("src","${basePath!''}/images/catalog_down.png");
	   }else{
	   		$("#img_"+id).attr("type","1");
	   		$("#img_"+id).attr("src","${basePath!''}/images/catalog_right.png");
	   		$("#catalog_"+id).html("");
	   }
	   
	}
	
	//点击加载章节后面内容
	function catalogDetail_child(id){
		var type = $("#child_"+id).attr("type");
		if(type=="1"){
			$("#child_"+id).attr("type","2");
			$("#img_detail"+id).attr("src","${basePath!''}/images/catalog_down.png");
			$("#child_"+id).show();	
		}else{
			$("#child_"+id).attr("type","1");
			$("#img_detail"+id).attr("src","${basePath!''}/images/catalog_right.png");
			$("#child_"+id).hide();	
		}
		
	}
	
	//组装跳转
	function search_ask(type,id){
		var data = "";
		var url = "${basePath!''}/base/catalog/list.htm?";
		var gradeId = $('#gradeId').val();
		var subjectId = $('#subjectId').val();
		var versionId = $('#versionId').val();
		var versionId = $('#versionId').val();
		var name = $('#catalogName').val();
		if(gradeId!=null && gradeId!=''){
			data += "&gradeId="+gradeId;
		}
		if(subjectId!=null && subjectId!=''){
			data += "&subjectId="+subjectId;
		}
		if(versionId!=null && versionId!=''){
			data += "&versionId="+versionId;
		}	
		if(name!=null && name!=''){
			data += "&name="+name;
		}
		if(type == 'page'){
			data += "&pageNo="+id;
		}
		window.location.href=url+data;
	}
</script>
</body>
</html>