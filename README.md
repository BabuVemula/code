Demo business app
============================

Introduction
==========================
This demo application is developed using Spring boot and it has an get API `/info`. This application is built with `maven` and all project dependencies are defined in `pom.xml`. Also, environment details are managed in `application.properties` under resources folder. Also `SSL` is enabled to have end to end encryption while hitting the `/info` API. Application logs are managed using spring boot `logback` configuration and writting to `/application` directory under `home` folder.

Once application is built with maven, `businessdemo.jar` is created under `target` directory. This jar file is deployed to docker using the `DockerFile`.

```sh
FROM java:8
EXPOSE 8080
COPY logback.xml /logback.xml
COPY /target/businessdemo.jar /businessdemo.jar
CMD ["java", "-jar","-Dspring.profiles.active=default","/businessdemo.jar"]
```

Requirements and Dependencies
======================
- Maven
- JAVA 8
- Docker
- Internet connection to Maven repo to down all required dependencies.

Maven
===========================
To install maven 
```sh
 "sudo yum install maven"
```
Java
=============================
To install Java
```sh
 "sudo yum install java"
```

Step to build and Deploy the application
==========================================
Once Maven and java is installed clone the repository and run maven commands to build and create the application binaries.

Clone repository to: 
```sh
"git clone https://github.com/BabuVemula/code.git"
```
Run Maven clean to clean the maven directory
```sh
cd code
 "mvn clean" 
 ```
Then, run below command to build the application. This creates a directory `target` and `businessdemo.jar`.
```sh
"mvn package"
```
Docker Creation
=====================
Now, it is time to deploy the application in docker. Please run below commands

To create docker image
```sh
sudo docker build -t businessdemo .
```

Make sure the host machines `/tmp` directory has enough permission to write the logs back from docker `/application` directory.

Run docker,
```sh
sudo docker run --name businessdemo -d -v /tmp:/application/ -p 8080:8080 -e app=my-app -e ver=0.0.1 -e sha=gitsha businessdemo

```
The environment varibles in docker run are set to reflect the values in `/info` api call with 200 response. The `environment` section is auto filled based on application.properties data.

Key Features 
====================
- SSL enabled with self signed certificate
- Unit testing with 100% code coverage
- Spring boot advantages - no application server required, since it can run in java runtime itself.
- Maven build tool is used
- Configurable logging option


