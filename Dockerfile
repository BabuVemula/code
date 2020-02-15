FROM java:8
EXPOSE 8080
ADD /target/businessdemo.jar businessdemo.jar
ENTRYPOINT ["java", "-jar", "-Dlogging.config=logback.xml", "businessdemo.jar"]