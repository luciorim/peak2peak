FROM eclipse-temurin:21.0.2_13-jdk-jammy AS builder
WORKDIR /opt/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw
COPY ./src ./src

RUN ./mvnw clean
RUN ./mvnw -B package -Dmaven.test.skip

FROM eclipse-temurin:21.0.2_13-jre-jammy
WORKDIR /opt/app
EXPOSE 8085
COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
ENTRYPOINT ["java", "-jar", "/opt/app/*.jar"]
