FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/notification-service-1.0.0.jar notification-service.jar

EXPOSE 8084

ENTRYPOINT ["java","-jar","notification-service.jar"]
