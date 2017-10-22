<link rel="stylesheet" type="text/css" href="${basePath!''}/css/common.css">
<link rel="stylesheet" type="text/css" href="${basePath!''}/css/popup.css">

<div class="pop_shade">
<!-- 完成考试 -->
<div class="pop" type='1' style="display: none">
	<h3 class="hand_success clearfix">交卷成功 <span class="fr"></span></h3>
	<div class="finish">
		<h3><img src="${basePath!''}/images/right.png"></h3>
		<p class="tip_msg">恭喜您完成本次考试</p>
		<p class="test_time">考试用时<span>50</span>分钟</p>
	</div>
</div>

<!-- 完成问卷调查 -->
<div class="pop" type='2' style="display: none">
	<h3 class="hand_success clearfix">交卷成功 <span class="fr"></span></h3>
	<div class="finish">
		<h3><img src="${basePath!''}/images/right.png"></h3>
		<p class="tip_msg">恭喜您完成本次考试</p>
		<p class="check_report">
			<span class="now_check">现在查看报告</span> | <span class="i_know">知道了，以后再看</span>
		</p>
	</div>
</div>

<!-- 完成自适应测验 -->
<div class="pop" type='3' style="display: none">
	<h3 class="hand_success clearfix">交卷成功 <span class="fr"></span></h3>
	<div class="finish">
		<h3><img src="${basePath!''}/images/right.png"></h3>
		<p class="tip_msg">恭喜您完成本次自适应测验！</p>
		<p class="check_report">
			<span class="now_check">现在查看报告</span> | <span class="i_know">知道了，以后再看</span>
		</p>
	</div>
</div>
		
<!-- 作业提交成功 -->
<div class="pop" type='4' style="display: none">
	<h3 class="hand_success clearfix">提交成功 <span class="fr"></span></h3>
	<div class="finish">
		<h3><img src="${basePath!''}/images/right.png"></h3>
		<p class="tip_msg">恭喜您完成本项作业！</p>
		
	</div>
</div>


<!-- 自适应测试超时提交 -->
<div class="pop" type='5' style="display: none">
	<h3 class="hand_success clearfix">考试超时<span class="fr"></span></h3>
	<div class="finish">
		<h3><img src="${basePath!''}/images/错误.png"></h3>
		<p class="tip_msg">考试时间已到，正在帮您提交试卷，请稍候可直接查看报告</p>
		<p class="check_report">
			<span class="now_check" id="now_check" style="color：red">正在提交试卷...</span> | <span class="i_know">知道了，以后再看</span>
		</p>
	</div>
</div>


</div>
<script src="${basePath!''}/js/popup.js"></script>