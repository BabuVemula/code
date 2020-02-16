FROM java:8
EXPOSE 8080
VOLUME /logs
COPY input.json /input.json
ENV jsoninput=$(cat /input.json)
COPY /target/businessdemo.jar /businessdemo.jar
CMD ["java", "-jar","-Dspring.profiles.active=default", "-Dlogging.config=/logback.xml", "/businessdemo.jar"]