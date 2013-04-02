var ContentView = Backbone.View.extend({

	template : _.template(rowTmpl),
	el: $('div.content'),
	model: Student,
	initialize : function() {
		//Var headtmpl =$("#headtmpl").html();
		//this.template=headTemplString;
		//this.render();
	},
	events : {
		//"click .add" : "addStudent",
		//"click .remove" : "deleteStudent"
	},

	render : function(s) {
		$(this.el).append(this.template(s.toJSON()));
	}
});
