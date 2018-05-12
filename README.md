
Small example of using rapidoid to create a quick website, where the app is packaged into an uber jar, and run via docker.


To run jar

1. In project directory
2. `mvn package`
3. `java -jar target/uber-jar.jar'
    - OR Use  `mvn exec:java`
4. Go to browser and look up http://localhost:8080/

To run via docker

1. In project directory
2. `mvn package`
3.