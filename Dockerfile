# Establecer la imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establecer un volumen temporal para almacenamiento de datos temporales
VOLUME /tmp

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/microservice-concert-0.0.1-SNAPSHOT.jar app.jar

# Configurar el comando de inicio del contenedor
ENTRYPOINT ["java","-jar","/app.jar"]

# Exponer el puerto en el que la aplicación escuchará
EXPOSE 8082
