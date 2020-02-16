FROM java:8
EXPOSE 8080
VOLUME /logs
ENV jsoninput=$(cat /etc/config.json)
COPY logback.xml /logback.xml
COPY /target/businessdemo.jar /businessdemo.jar
CMD ["java", "-jar","-Dspring.profiles.active=default", "-Dlogging.config=/logback.xml", "/businessdemo.jar"]