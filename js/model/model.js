var Student = Backbone.Model.extend({
    defaults : {
	   "name" :"defaultname",
	   "id" :"999",
	   "spec"  :"OSGI"
	}
});

var Class = Backbone.Collection.extend({
	model : Student
});

var c=new Class();
