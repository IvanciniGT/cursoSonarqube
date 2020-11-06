# Apache Maven

## Instalación de Maven
sudo apt install maven 

## Crear un proyecto
mvn archetype:generate \
    -DgroupId=curso.es \
    -DartifactId=mi-aplicacion \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false


# GOAL MAVEN
compile  --->Compila lo que tengo en la carpeta src/main
test-compile --->Compila lo que tengo en la carpeta src/test
build
test
package
install