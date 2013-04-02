## Backbone Labs
This project will take you through the usage of backbone.js. To better explain and
to demonstrate the best practices for SPA, we have used RequireJS for dependency 
management at ui layer. Along with that for the time being we have created a 
restful web service using spring 3.2 mvc. In future we will be adding more such 
services and ui components.

Components:
* web - backbone-lab web context
* studentservice - JAX-RS web service

## Prerequisites
You need the following packages to be installed:
* Java 7
* Tomcat 7
* Maven 3.0.5
* Git

## Building from source
After completing the prerequisites, you can follow the instructions to build the project.

### check out sources

	git clone https://github.com/tjagadeesh/backbone-lab.git

once you clone the project change the tomcat webapp path in your parent pom.xml. So that your 
wars will be get copied to webapp.	

### compile and test, build all wars

	mvn clean install

One successfull built the project, you can start tomcat to test.

##studentservice Testing

###GET

	url:http://localhost:8080/studentservice/student, http://localhost:8080/studentservice/student/1
	request header:Accept:application/json
	
	response body:
   	[ 
	  {
          	 "id": 1,
          	 "rollNo": "200130364",
          	 "name": "Satish Kumar",
          	 "standard": "1st"
      	  }
   	]

###POST
	url:http://localhost:8080/studentservice/student
        request header:Accept:application/json, Content-Type:application/json
	request body:
          {
                 "rollNo": "200130364",
                 "name": "Satish Kumar",
                 "standard": "1st"
          }
	
	response body:true
###PUT
	url:http://localhost:8080/studentservice/student/1
        request header:Accept:application/json, Content-Type:application/json
        request body:
          {
		 "id":1,
                 "rollNo": "200130364",
                 "name": "Satish Kumar",
                 "standard": "1st"
          }

        response body:true

###DELETE
	url:http://localhost:8080/studentservice/student/1
        request header:Accept:application/json

        response body:true


## Contributing
Pull requests are welcome.

## Staying in touch

## License
