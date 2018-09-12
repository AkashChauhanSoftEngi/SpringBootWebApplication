# SpringBootWebApplication

* Spring Boot{2.0.3.RELEASE} + MVC+ JSP View with pure Java Configuration (no XML), using Maven build tool.

> **###1. Features/Advantages**
* It is very easy to develop Spring Based applications with Java or Groovy.
* It reduces lots of development time and increases productivity.
* Auto Configuration file creation, and @SpringBootApplication is being used in main class automatically
* No need of deployment on Tomcat as it happens automatically after adding necessary dependencies in POM file
* No need to setup, build path and all, as it happens automatically after initializing application using https://start.spring.io/
* By default jsp pages can be resided in template folder as this path is default path for such pages
* We can directly set the port of the server by adding server.port: 8080 in application.properties file
* We can use directly H2-Database in the application, it is very beneficial for testing purpose, also it is easy to integrate as well
* Easy to integrate all related databases
* Easy to maintain code and flow {As flow is quiet simple}
* Better code readability
* Less complex architecture

> **###2. Technologies**
* Spring Boot 2.0.3.RELEASE (Latest)
* Maven 3.1
* JSTL 1.2

> **###3. To Run this project locally**
* $ git clone https://github.com/AkashChauhanSoftEngi/SpringBootWebApplication
* $ tomcat {Embedded}

> **###4.  Access** 
* http://localhost:8080

> **###5. Important points**
* By default we can store jsp pages in resources->template folder or
  we can descrive this in application.properties
```text
	spring.mvc.view.prefix: /WEB-INF/jsp/
	spring.mvc.view.suffix: .jsp
```
* We can access variables values from application.properties file using
```text
	welcome.message inside application.properties
	& @Value("${welcome.message:test}") to access this value
```
* Class having @SpringBootApplication attached to it contains main method
  - So this class can be executed directly, from IDE
  - This class is mainly resposible for running the whole project {In general}
* While using Spring boot there is no need to build the project
  - So when you make change in the project you do not need to update, build and restart the server.
  - Such work has eliminated from Spring Boot
 
