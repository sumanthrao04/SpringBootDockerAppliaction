FROM eclipse-temurin:17-jdk-alpine
LABEL maintainer="Sumanth P"
ADD target/welcomeDocker-0.0.1-SNAPSHOT.jar Springbootwelcomedocker.jar
ENTRYPOINT ["java","-jar","Springbootwelcomedocker.jar"]

