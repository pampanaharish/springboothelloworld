FROM eclipse-temurin:17-jdk-jammy
COPY target/spring-boot-3-hello-world-0.0.1-SNAPSHOT.jar  app.jar
ENTRYPOINT 	["java","-jar","app.jar"]
