FROM openjdk:8
EXPOSE : 8080
ADD target/calculator-devops.jar calculator-devops.jar
ENTRYPOINT["java", "-jar", "/calculator-devops.jar"]