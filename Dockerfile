FROM openjdk:17-oracle

EXPOSE 8080

ADD target/docker-demo-0.0.1-SNAPSHOT.jar docker-demo.jar

ENTRYPOINT ["java","-jar","docker-demo.jar"]