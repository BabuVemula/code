FROM java:8
EXPOSE 8080
VOLUME /logs
ENV jsoninput={"service_name": "myapplication","version": "1.0.0","git_commit_sha": "abc57858585"}
COPY logback.xml /logback.xml
COPY /target/businessdemo.jar /businessdemo.jar
CMD ["java", "-jar","-Dspring.profiles.active=default", "-Dlogging.config=/logback.xml", "/businessdemo.jar"]