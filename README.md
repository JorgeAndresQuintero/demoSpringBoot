# Spring Boot

### What is Spring Boot?

##### What is Spring?
Spring is a widely used Java framework with many modules and extensions.
It eases development of web applications by providing interfaces to databases
(both SQL and NoSQL) and useful packages like Spring Security.

A central component of Spring is Dependendy Injection, a pattern to create decoupled systems where 
consumers of objects (the clients) don't create said objects (the servers) but rather they are
injected into the clients.

##### What is Spring Boot?
Spring Boot is kind of a framework for the framework Spring. The idea is to make setting up projects easier than when using
pure Spring. It repackages some of Spring modules and functionalities into "Starters" that can be automatically added to
Gradle or Maven files during the set-up phase. This is automated in [here](https://start.spring.io/).

Spring and by extension Spring Boot heavily use Java annotations and beans (classes with only private attributes, each with
setter and getter) to implement the dependency injection.

By using the Web starter from Spring Boot, a Tomcat servlet container is automatically started.

### About the small prototype
Small example of Spring Boot at work.

Running the application automatically starts a Tomcat server at localhost:8080. By trying to connect to the address, the
server sends an HTTP GET request that is handled in DemoApplication and returns the index.html file. The Javascript file 
sends HTTP POST and GET requests that save an InfoPoint or retrieve the saved infopoints.

Call ```java -jar build/libs/demo-0.0.1-SNAPSHOT.jar``` to run. 

    