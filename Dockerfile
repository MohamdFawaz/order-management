FROM maven:3.9.4-amazoncorretto-17 AS MAVEN_TOOL_CHAIN

COPY . /tmp/
WORKDIR /tmp/
RUN mvn -B dependency:go-offline -f pom.xml -s /usr/share/maven/ref/settings-docker.xml
RUN mvn -B -X -s /usr/share/maven/ref/settings-docker.xml -Dmaven.test.skip package

FROM openjdk:17-oracle

EXPOSE 8080

RUN mkdir /app
COPY --from=MAVEN_TOOL_CHAIN /tmp/application/target/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]