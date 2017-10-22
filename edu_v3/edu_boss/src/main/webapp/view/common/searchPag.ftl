<div class="row">
  <div class="col-xs-7 m-t-20"> Showing ${((pb.pageNo-1) * 15) +1} - ${pb.pageNo * pb.pageSize} of ${pb.rows!''} </div>
  <div class="col-xs-5 m-t-20">
    <div class="pull-right"   style="padding-top:0px">
         <ul class="pagination pagination-split">
         <#if pb.pageNo != 1>
          <li> <a  href="javascript:void(0);" onclick="changeNextPage(${pb.pageSize },${pb.pageNo-1 })"><i class="fa fa-angle-left"></i></a> </li>
         </#if>
         <#if pb.pageNo == 1>
          <li class="disabled"> <a href="#"><i class="fa fa-angle-left"></i></a> </li>
         </#if>
         <#list pb.startNo .. pb.endNo as sta>
         	<#if pb.pageNo == pb.startNo + sta - 1>
         		<li   class="active"> <a href="#">${pb.startNo + sta - 1}</a> </li>
         	<#else>
         	 	<li> <a  href="javascript:void(0);"  onclick="changeNextPage(${pb.pageSize },${pb.startNo+sta-1})" >${pb.startNo +sta - 1}</a> </li>
         	</#if>
         </#list>
          <#if pb.pageNo != pb.totalPages>
          	<li> <a  href="javascript:void(0);"  onclick="changeNextPage(${pb.pageSize },${pb.pageNo+1 })"><i class="fa fa-angle-right"></i></a> </li>
          </#if>
          <#if pb.pageNo == pb.totalPages>
          	<li  class="disabled"> <a href="#"><i class="fa fa-angle-right"></i></a> </li>
          </#if>
          
        </ul>
    </div>
  </div>
</div>

<head>
    <script type="text/javascript">
        var formId=$("#formId").val();

        function changeNextPage(pageSize,pageNo){
            $("#"+$("#formId").val()).attr("action",$("#formName").val())
                    .append("<input type='hidden' name='pageSize' value='"+pageSize+"''>")
                    .append("<input type='hidden' name='pageNo' value='"+pageNo+"''>")
                    .submit();
        }
    </script>
</head>




