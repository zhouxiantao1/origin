	function addDate(startId,endId){
		//layData日期选择
		var start = {
		  elem: startId,
		  format: 'YYYY-MM-DD hh:mm:ss',
		  min: laydate.now(), //设定最小日期为当前日期
		  max: '2099-06-16 23:59:59', //最大日期
		  istime: true,
		  istoday: false,
		  choose: function(datas){
		     end.min = datas; //开始日选好后，重置结束日的最小日期
		     end.start = datas //将结束日的初始值设定为开始日
		  }
		};
		var end = {
		  elem: endId,
		  format: 'YYYY-MM-DD hh:mm:ss',
		  min: laydate.now(),
		  max: '2099-06-16 23:59:59',
		  istime: true,
		  istoday: false,
		  choose: function(datas){
		    start.max = datas; //结束日选好后，重置开始日的最大日期
		  }
		};
		laydate(start);
		laydate(end);
	}


	function selected(){
		var checkLabel = $('.report_list label');
		var checkInput = checkLabel.find('input');
		//左侧菜单 控制右侧显示
		checkLabel.on('click',function(){
			var self = $(this);
			if($(this).hasClass('part_father')){
				if($(this).children('input').prop('checked') == true){
					$(this).next('ul').find(':checkbox').prop('checked',true);
					var allIdx = $(this).next('ul').find('label');
					var thisIdx = $(this).attr('idx');

					$('#part' + thisIdx).show();
					allIdx.each(function(index,item){
						var count = $(this).attr('idx');
						$('#part' + count).show();
					})
					
				}else{
					$(this).next('ul').find(':checkbox').prop('checked',false);
					var allIdx = $(this).next('ul').find('label');
					var thisIdx = $(this).attr('idx');
					$('#part' + thisIdx).hide();

					allIdx.each(function(index,item){
						var count = $(this).attr('idx');
						$('#part' + count).hide();
					})
				}
			}else{
				if(self.children('input').prop('checked') == true){
					var idx = self.attr('idx');
					$('#part' + idx).show();
				}else{
					var idx = self.attr('idx');
					$('#part' + idx).hide();
				}
			}
		})
	}