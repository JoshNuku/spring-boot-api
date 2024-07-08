FROM openjdk:21
VOLUME /tmp
EXPOSE 1414
COPY /target/cpen_208.jar cpen_208.jar
ENTRYPOINT ["java", "-jar", "cpen_208.jar"]