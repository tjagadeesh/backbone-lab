define(['backbone', '../models/Student'], function(Backbone, Student) {
    
	var Students = Backbone.Collection.extend({
        url: 'http://localhost:8080/studentservice/student',
        model: Student,
        initialize: function(){
            this.fetch({
                async:false,
                success: this.fetchSuccess,
                error: this.fetchError
            });
        },

        fetchSuccess: function (collection, response) {
            console.log('Collection fetch success', response);
            console.log('Collection models: ', collection.models);
        },

        fetchError: function (collection, response) {
            throw new Error("Books fetch error");
        }
    });
	return Students;
});