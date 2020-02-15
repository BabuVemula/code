FROM java:8
EXPOSE 8080
COPY logback.xml /logback.xml
ADD /target/businessdemo.jar businessdemo.jar
ENTRYPOINT ["java", "-jar", "-Dlogging.config=logback.xml", "businessdemo.jar"]