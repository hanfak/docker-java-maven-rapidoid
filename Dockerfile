FROM java:8

WORKDIR /code

# Make sure jar has been created via maven mvn package
ADD target/App-jar-with-dependencies.jar App-jar-with-dependencies.jar

EXPOSE 8080

CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "App-jar-with-dependencies.jar"]

