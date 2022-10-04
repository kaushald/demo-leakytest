FROM arm64v8/amazoncorretto:18
ARG JAR_FILE=build/libs/leakytest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]