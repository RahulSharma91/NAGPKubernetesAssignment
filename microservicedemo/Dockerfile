FROM openjdk:8
WORKDIR /app
COPY target/microservicedemo-0.0.1-SNAPSHOT.jar /app/application.jar
ENV POSTGRESDBURL=""
ENV POSTGRESDBUSER=""
ENV POSTGRESDBPASSWORD=""
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/application.jar"]