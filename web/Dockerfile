FROM openjdk:17-jdk-alpine3.14

MAINTAINER Dani Herzka "dani.herzka@bbzbl-it.ch"

EXPOSE 7070

WORKDIR /usr/local/bin

COPY ./target/web-0.0.1-SNAPSHOT.jar web-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "web-0.0.1-SNAPSHOT.jar"]