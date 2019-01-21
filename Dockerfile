FROM openjdk:8
ADD target/a4jd.jar a4jd-backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "a4jd-backend.jar"]