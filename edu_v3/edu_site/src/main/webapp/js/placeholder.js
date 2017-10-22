//兼容ie浏览器文本框的placeholder属性
/*var doc = window.document, input = doc.createElement('input');
if (typeof input['placeholder'] == 'undefined'){ // 如果不支持placeholder属性

	$('input').each(function (ele) {
		var me = $(this);
		var ph = me.attr('placeholder');
		if (ph && !me.val()) {
		    me.val(ph).css('color', '#aaa').css('line-height', me.css('height'));
		}
		me.on('focus', function () {
			if (me.val() === ph) {
			    me.val(null).css('color', '');
			}
		}).on('blur', function () {
			if (!me.val()) {
			    me.val(ph).css('color', '#aaa').css('line-height', me.css('height'));
			}
		});
	});
}*/


/*
 * jQuery placeholder, fix for IE6,7,8,9
 * @author JENA
 * @since 20131115.1504
 * @website ishere.cn
 */
var JPlaceHolder = {
    //检测
    _check : function(){
        return 'placeholder' in document.createElement('input');
    },
    //初始化
    init : function(){
        if(!this._check()){
            this.fix();
        }
    },
    //修复
    fix : function(){
        jQuery(':input[placeholder]').each(function(index, element) {
            var self = $(this), txt = self.attr('placeholder');
            if(self.val()!= ''){
                return;
            }else{
                self.wrap($('<div></div>').css({position:'relative', zoom:'1', border:'none', background:'none', padding:'none', margin:'none',display:'inline-block'}));
                var pos = self.position(), h = self.innerHeight(), paddingleft = self.css('padding-left'),width = self.innerWidth(),textIndent=self.css('text-indent');
                var holder = $('<span></span>').text(txt).css({position:'absolute',width:width, left:pos.left, top:pos.top, height:h,lineHeight:h+'px', paddingLeft:paddingleft, color:'#aaa',textAlign:'left',textIndent:textIndent}).appendTo(self.parent());
                self.focusin(function(e) {
                    holder.hide();
                }).focusout(function(e) {
                    if(!self.val()){
                        holder.show();
                    }
                });
                holder.click(function(e) {
                    holder.hide();
                    self.focus();
                });
            }
        });
    }
};
//执行
jQuery(function(){
    JPlaceHolder.init();    
});
