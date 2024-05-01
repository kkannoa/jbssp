FROM openjdk:17

EXPOSE 8080

ADD ./build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "-Duser.timsezone=Asia/Seoul", "/app.jar"]