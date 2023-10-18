# AS <NAME> to name this stage as maven
FROM openjdk:17-oracle

EXPOSE 8080

COPY /application/target/application-1.0.0.jar /usr/app/
WORKDIR /usr/app

CMD ["java","-jar","application-1.0.0.jar"]

