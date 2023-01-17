# Getting Started with OpenWeatherApp

This project is created using the spring boot version 2.2.7.

### `./mvn clean package -U`

Build the jar using above command

### `java -jar target/openweathermap-0.0.1-SNAPSHOT.jar`

Or

### `DOCKER_BUILDKIT=1 docker build -t openmapweathermap --label dockerfile-path=Dockerfile`
### `docker run -p 8080:8080 -it openmapweathermap`

Runs the above command.\
Open Swagger
UI [http://localhost:8080/openweathermap/swagger-ui/index.html](http://localhost:8080/openweathermap/swagger-ui/index.html)
to view it in your browser.