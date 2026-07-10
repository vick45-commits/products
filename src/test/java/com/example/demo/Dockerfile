# 1. Use an official lightweight OpenJDK runtime image
FROM eclipse-temurin:17-jre-alpine

# 2. Set the directory inside the container where commands will run
WORKDIR /app

# 3. Copy the compiled JAR file from your target folder into the container
COPY target/*.jar app.jar

# 4. Expose port 8080 so we can access the web application
EXPOSE 8080

# 5. Tell Docker how to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]
