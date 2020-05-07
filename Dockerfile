FROM openjdk:8
EXPOSE : 8000
ADD target/calculator-devops.jar calculator-devops.jar
ENTRYPOINT ["java", "-jar", "/calculator-devops.jar"]