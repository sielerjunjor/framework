FROM openjdk

EXPOSE 3000  

ADD target/*.jar /app.jar

ENTRYPOINT [ "java", "-Dspring.data.mongodb.uri=mongodb://mongo", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar" ]