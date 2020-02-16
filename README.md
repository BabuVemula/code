# Requirements
- Maven
- java 8
- Docker

# Maven
To install maven use
 "sudo yum install maven"

#Java
To install Java
 "sudo yum install java"

#Step to build and Deploy the application
Once Maven and java is installed clone the repository and run 
 "mvn clean" to clean the maven directory.
Then, run "mvn package" to build the application. This creates a directory target and businessdemo.jar.

Now, it is time to deploy the application in docker. Please run below commands

To create docker image
sudo docker build -t businessdemo .

To run docker image
sudo docker run --name businessdemo
	 -e app=babu
	 -e ver=0.0.1
	 -e sha=gitsha
	 -d -p 8080:8080 businessdemo


