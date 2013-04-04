// Filename: router.js
define(['backbone'], function(Backbone){
  var AppRouter = Backbone.Router.extend({
    routes: {
      // Define some URL routes
      '/projects': 'showProjects'
      //'/users': 'showUsers',

      // Default
      //'*actions': 'defaultAction'
    },
    initialize: function(){
      Backbone.history.start();  
    }
  });
  return AppRouter;
});
