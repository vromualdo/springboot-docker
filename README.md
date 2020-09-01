# springboot-docker


**Criando Imagem**
- docker image build -t springbootbuild:1.0.0 .

**Criando Container**
- docker container run -d -p 8083:8080 --name springboot springbootbuild:1.0.0

**Iniciar Container**
- docker container start springboot

**Swagger**
http://localhost:8084/swagger-ui.html