function popup(type){
	$('.pop_shade').show();
	var this_ele = $('.pop_shade').find('.pop[type='+ type +']');
	this_ele.show().siblings().hide();
}


//关闭弹窗
$('.hand_success span,.i_know').click(function(){
	$('.pop_shade').hide();
})