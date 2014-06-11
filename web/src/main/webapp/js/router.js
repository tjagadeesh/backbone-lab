// Filename: router.js
define(['collections/Students','views/MenuView', 'views/HeaderView', 'views/StudentsList','backbone'], function(Students, MenuView,
		HeaderView, StudentsList, Backbone){
  var Router = Backbone.Router.extend({
    routes: {
    	'/student/add' : 'addStudents',
    	'/students' : 'showStudents',
    	'' : 'showStudents',
    	'*action' : 'showStudents'	
    },
    initialize: function(){
      Backbone.history.start(); 
    },
    showStudents: function(){
        console.log("in the show staudents method.");
        var menuView = new MenuView();
		var headerView = new HeaderView();
		var studentsListView = new StudentsList();
    }
      
  });
  return Router;
});
