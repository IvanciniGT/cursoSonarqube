# Tranformarnos en root (superusuario)
sudo su -

# Una vez somos root, configuramos algunas variables que hacen falta en la maquina
sysctl -w vm.max_map_count=262144
sysctl -w fs.file-max=65536
ulimit -n 65536
ulimit -u 4096

# Dejo de ser root
exit

# Descargar la imagen llamada                                                          SONARQUBE
#                                                                                         VVVV
# Crear un contenedor llamado MISONARQUBE
#                      VVVV                                        
# Cambiar el puerto en que se ejecuta sonarQUBE
#                                                                             VVVV                                        
docker run -d --name misonarqube -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 8080:9000 sonarqube:latest

# NOTA: El cmabio que hemos hecho en el puerto, es una restricción de AMAZON.
# AMAZON solo me deja ejecutar cosas en los puertos ++ 8080 ++ , 8081, 8082

docker run -d --name misonarqubeenterprise -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 8081:9000 sonarqube:enterprise
docker pull sonarqube:enterprise

------------------------------------

SONARQUBE --------> Dónde? EN UN SERVIDOR

Cñodigo REPO GITHUB---------> MI MAQUINA
    git clone
Código?? ---------> Donde? EN MI MAQUINA

¿¿ Cómo llega mi código al servidor de SonarQube?
Programa que lleve mi código al servidor de SONARQUBE
    JAVA [ Gradle ] . La gente de sonar me ha dicho: PUEDES USAR GRADLE PARA DARME TU CODIGO
    JAVA [ Maven  ] . La gente de sonar me ha dicho: PUEDES USAR MAVEN  PARA DARME TU CODIGO
    C#              . La gente de sonar me ha dicho: PUEDES USAR VStudio  PARA DARME TU CODIGO
    OTRO............. La gente de sonar me ha dicho: Necesitas un programa para mandarme el código. Te paso uno
        Sonar Scanner <------ MI MAQUINA 