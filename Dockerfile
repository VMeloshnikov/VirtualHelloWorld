FROM maven:3.6.3-adoptopenjdk-11 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
COPY --from=build /home/app/target/my-app-1.0-SNAPSHOT.jar /usr/local/lib/my-app.jar
CMD ["java", "-jar", "/usr/local/lib/my-app.jar"]