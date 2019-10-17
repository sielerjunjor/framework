FROM openjdk:11-alpine

EXPOSE 3000  

ADD target/*.jar /app.jar

ENTRYPOINT [ "java", "-Dspring.data.mongodb.uri=mongodb://172.17.0.1:27017/frameworks", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar" ]


# docker run -d -p 28017:27017 --name mongo mongo
# docker run -p 3000:3000 --name <name> --link=<ContainerName>