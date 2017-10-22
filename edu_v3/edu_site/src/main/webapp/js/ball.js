	function drag_step(id, initPos, Callback) {
	    /* 初始化*/
	    var status = false;
	    var dom = $('#' + id);
	    if (initPos) {
	        dom.attr('data-step', initPos);
	        dom.find('.ball').css('left', dom.width() / 100 * initPos - 10);
	        dom.find('.top').css('width', dom.width() / 100 * initPos);
	    } else {
	        dom.find('.ball').css('left', 0);
	        dom.find('.ball').css('left', 0);
	    }
	    dom.find('.bottom').css('with', dom.width());
	    /* 点击ball的时候 改变移动状态 */
	    dom.mousedown(function () {
	        dom.find('.value').show();
	        status = true;	
	        
	    });
	    /* 恢复移动状态*/
	    $(document).mouseup(function () {
	        dom.find('.value').hide();
	        status = false;
	    });
	    /* 点击 拖动小球*/
	    dom.on('mousedown', dom, function (e) {
	        /* 判断ball是否可以移动*/
	        if (status) {
	            MoveBall(e, dom);
	        }
	    });
	    /* 移动 拖动小球*/
	    $(document).on('mousemove', dom, function (e) {
	        /* 判断ball是否可以移动*/
	        if (status) {
	            MoveBall(e, dom);
	        }
	    });
	    /* 小球移动函数*/
	    var MoveBall = function (e, dom) {
	        // var scrollX = document.documentElement.scrollLeft || document.body.scrollLeft;
	        e = window.event || e;
	        var dis_x = parseInt(dom.find('.ball').css('left')) + e.clientX - dom.find('.ball').offset().left;
	        // console.log(dom.find('.ball').css('left'))
	        // console.log(dom.find('.ball').offset().left)
	        var width = dom.width();
	        if (dis_x > 0 && dis_x < width + 5) {
	            dom.find('.ball').css('left', dis_x - 10);
	            /* 值移动*/
	            dom.find('.value').css('left', dis_x - 10);
	            dom.find('.top').css('width', dis_x);
	            var step = parseInt(dis_x / width * 100);
	            if (step > 100) {
	                step = 100;
	            }
	            /* 进度条数字赋值*/
	            dom.attr('data-step', step);
	            if (Callback) {
	                Callback(step);
	            } else {
	                dom.find('.value').html(step);
	            }
	        }
	        //清除拖动时选中文字
	        window.getSelection ? window.getSelection().removeAllRanges() : document.selection.empty();
	    };
	}