FROM java:8
EXPOSE 8080
COPY logback.xml /logback.xml
COPY businessdemo.jar /businessdemo.jar
COPY application.properties /application.properties
CMD ["java", "-jar","-Dspring.profiles.active=default","/businessdemo.jar"]