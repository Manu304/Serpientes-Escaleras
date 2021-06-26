# Serpientes y escaleras
## Cuarta práctica IPC1 vacas
El proyecto consiste en desarrollar un juego de escaleras y serpientes.
## Tablero
Para crear el tablero deberá leer un archivo de texto con la siguiente información. 
Donde lo que está entre parentesis deben de ser valores enteros:
- tablero(filas,columnas);
- pierdeturno(fila, columna);
- tiradados(fila,columna);
- avanza(fila, columna, cantPosiciones);
- retrocede(fila, columna, cantPosiciones);
- subida(filaInicial, columnaInicial, filaFinal, columnaFinal)
- bajada(filaInicial, columnaInicial, filaFinal, columnaFinal)

## Compilación con maven
Se utiliza el archivo pom.xml y se ejecutan los comandos:
```
mvn clean
mvn compile
mvn package
```
`mvn clean` para limpiar el directorio y eliminar la carpeta target que se genera al compilar

## Ejecutando JAR en consola
Dentro de la capeta raiz del repositorio se ejecuta:
```
java -jar ./target/Serpientes-Escaleras-1.0-SNAPSHOT.jar
```