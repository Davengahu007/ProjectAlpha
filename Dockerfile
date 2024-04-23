# Use the official OpenJDK image as the base image
FROM openjdk:11-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the working directory
COPY target/*.jar app.jar

# Command to run the application
CMD ["java", "-jar", "app.jar"]

# Expose the port the application runs on
EXPOSE 5000
