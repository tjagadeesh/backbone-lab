//Filename: HeaderView.js

define(['backbone', 'text!../../templates/studentsList.tmpl', 'collections/Students'], function(Backbone, studentListTemplate, Students){
	  var HeaderView = Backbone.View.extend({

		template : _.template(studentListTemplate),
		el: $('div.content'),
		initialize : function() {
			//Var headtmpl =$("#headtmpl").html();
			//this.template=headTemplString;
            this.collection = new Students();
			this.render();
		},
		
		render : function() {
            console.log("Students : " + JSON.stringify(this.collection.models));
            console.log("Length : " + this.collection.models.length);
			$(this.el).html(this.template({'students':this.collection.models}));
		}
	});
	return HeaderView;
});