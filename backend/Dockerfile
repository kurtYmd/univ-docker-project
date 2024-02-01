FROM maven:3.9.6-eclipse-temurin-21-alpine

WORKDIR app

COPY . .

RUN mvn -Ddb-url=jdbc:postgresql://postgres:5432/backenddb \
        -Ddb-username=backend \
        -Ddb-password=backend \
        clean package -Dmaven.test.skip

ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ./app.jar
ENTRYPOINT ["java","-jar","./target/backend-0.0.1-SNAPSHOT.jar"]

