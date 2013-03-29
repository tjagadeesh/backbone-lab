var Headview = Backbone.View.extend({

	template : _.template(headTemplString),
	el: $('div.head '),
	initialize : function() {
		//Var headtmpl =$("#headtmpl").html();
		//this.template=headTemplString;
		this.render();
	},
	events : {
		"click .add" : "addStudent",
		"click .remove" : "deleteStudent"
	},
	addStudent : function(event) {
		var s= new Student();
		//alert(c.length);
		s.set({
			name : $('.name').val(),
			id : $('.no').val(),
			spec : $('.spec').val()
		});
		c.add(s);
		contview.render(s);
		//alert(c.length);
		this.reset();
		return this;
	},
	deleteStudent:function(){
		
	},
	reset:function(){
			$('.name').val("");
			$('.no').val("");
			$('.spec').val("");
	},
	render : function() {
		$(this.el).html(this.template());
	}
});
