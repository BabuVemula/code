Demo business app
============================

Introduction
==========================
This demo application is developed using Spring boot and it has an get API `/info`. This application is built with `maven` and all project dependencies are defined in `pom.xml`. Also, environment details are managed in `application.properties` under resources folder. Also `SSL` is enabled to have end to end encryption while hitting the `/info` API. Application logs are managed using spring boot `logback` configuration and writting to `/application` directory under `home` folder.

Once application is built with maven, it created a `businessdemo.jar` under `target` directory. This jar file is deployed to docker using the `DockerFile`.

Requirements
======================
- Maven
- JAVA 8
- Docker

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
"https://github.com/BabuVemula/code.git"

```
Run Maven clean to clean the maven directory
```sh
 "mvn clean" 
 ```
Then, run `mvn package` to build the application. This creates a directory target and businessdemo.jar.

Now, it is time to deploy the application in docker. Please run below commands

To create docker image
sudo docker build -t businessdemo .

To run docker image
sudo docker run --name businessdemo
	 -e app=babu
	 -e ver=0.0.1
	 -e sha=gitsha
	 -d -p 8080:8080 businessdemo


