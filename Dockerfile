FROM openjdk:17
VOLUME /tmp
ADD ./target/springboot-ms-productos-0.0.1-SNAPSHOT.jar springboot-ms-productos.jar
ENTRYPOINT ["java", "-jar", "/springboot-ms-productos.jar"]