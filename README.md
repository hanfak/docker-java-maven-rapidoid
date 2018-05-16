
Small example of using rapidoid to create a quick website, where the app is packaged into an uber jar, and run via docker.

## Instructions to run

To run jar

1. In project directory
2. `mvn package`
3. `java -jar target/uber-jar.jar'
    - OR Use  `mvn exec:java`
4. Go to browser and look up http://localhost:8080/

To run via docker

1. In project directory
2. Create jar `mvn package`
3. Build docker image `docker build -t uber /{path to project}/docker-java-example/`
4. Run docker container `docker run --name web -d -p 8080:8080 uber`
5. check image is running `docker ps`
6. Go to browser and look up http://localhost:8080/
7. to remove image `docker rm -fv web`

To run via fabric8

1. In project directory
2. `mvn clean pre-integration-test`

To stop the container: `mvn docker:stop@stop-image`
    - runs  docker rm -fv
To bring up the  container: `mvn docker:start@start-image`
    - runs `docker run --name web -d -p 8080:8080 uber` for example

check image is running `docker ps`

mvn clean pre-integration-test
mvn docker:start
mvn clean pre-integration-test
mvn docker:stop@stop-image


#### TODO

push to docker hub, create account
http://www.littlebigextra.com/push-docker-images-docker-hub-using-maven/

Store jars in remote binary repository
https://binary-repositories-comparison.github.io/

run on remote server
https://devcenter.heroku.com/articles/container-registry-and-runtime
https://aws.amazon.com/getting-started/tutorials/deploy-docker-containers/

Deploy to heroku or other


### NOTEs:

There is an alternative docker file which run mavens in the container, but this will make the docker file size larger and can take time to build image

To use just copy everything in Dockerfile1 and replace it all in Dockerfile