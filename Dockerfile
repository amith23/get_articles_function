FROM openjdk:17-jdk-alpine
MAINTAINER amithdarshana@gmail.com


RUN ls
COPY target/article_get-SNAPSHOT.jar article_get_function.jar
ENTRYPOINT ["java","-jar","/article_get_function.jar"]