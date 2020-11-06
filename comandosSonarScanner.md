Código Lenguaje de programación
    Compilar/empaquetar ---> AUTOMATIZARLO (herramientas)

JAVA
    MAVEN  <<<< JAVA lenguaje apps empresa
    GRADLE <<<< JAVA lenguaje apps teléfonos moviles
    
    
./gradlew sonarqube \
  -Dsonar.projectKey=OnJava8 \
  -Dsonar.host.url=http://localhost:8080 \
  -Dsonar.login=21ea7958fdef393a58db7ca4f208914e3cc9fe68

export PATH=$PATH:/home/ubuntu/environment/sonar/bin

sonar-scanner \
  -Dsonar.projectKey=JS \
  -Dsonar.sources=. \
  -Dsonar.host.url=http://localhost:8080 \
  -Dsonar.login=21ea7958fdef393a58db7ca4f208914e3cc9fe68
  
  sonar-scanner \
  -Dsonar.projectKey=COBOL \
  -Dsonar.sources=. \
  -Dsonar.host.url=http://localhost:8080 \
  -Dsonar.login=21ea7958fdef393a58db7ca4f208914e3cc9fe68