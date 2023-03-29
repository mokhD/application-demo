FROM eclipse-temurin

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-app.jar

EXPOSE 8080

CMD ["java", "-jar", "demo-app.jar"]
