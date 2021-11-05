FROM openjdk:11
#ADD target/docker-spring-boot.jar docker-spring-boot.jar
COPY target/LibrarySystem-0.0.1-SNAPSHOT.jar /code.jar
EXPOSE 8085
ENTRYPOINT java -jar /code.jar