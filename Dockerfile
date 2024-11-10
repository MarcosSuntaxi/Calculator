# Utilizar la imagen base de OpenJDK para Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo Java al contenedor
COPY Calculator.java /app/Calculator.java

# Compilar el archivo Java
RUN javac Calculator.java

# Ejecutar el programa
CMD ["java", "Calculator"]
