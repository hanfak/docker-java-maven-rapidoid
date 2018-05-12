
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
3. `docker build -t uber /{path to project}/docker-java-example/`
4. `docker run --name web -d -p 8080:8080 uber`
5. check image is running `docker ps`
6. Go to browser and look up http://localhost:8080/
7. to `remove docker rm -fv web`

To do:

1. use fabric8 to build and run the docker image

NOTEs:

There is an alternative docker file which run mavens in the container, but this will make the docker file size larger and can take time to build image

To use just copy everything in Dockerfile1 and replace it all in Dockerfile