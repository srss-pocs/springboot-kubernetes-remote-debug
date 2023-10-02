Spring Boot 3.1.4
A Simple Spring Boot Kubernetes Remote Debug Aplication

mvn clean install -DskipTests

docker build -t springboot-kubernetes-remote-debug .

docker tag springboot-kubernetes-remote-debug rkbdocker/springboot-kubernetes-remote-debug

docker push rkbdocker/springboot-kubernetes-remote-debug

kubectl create secret docker-registry myregistrykey --docker-server=docker.io --docker-username=rkbdocker --docker-password=xxxx --docker-email=xxxx@gmail.com


kubectl apply -f deployment.yaml

kubectl apply -f service.yaml

kubectl get pods

kubectl port-forward application-deployment-8b95d84d4-kxvhx 8080:8080

kubectl port-forward application-deployment-8b95d84d4-kxvhx 5005:5005

Below screenshot is for remote debug will not start server

![image](https://github.com/srss-pocs/springboot-kubernetes-remote-debug/assets/145287517/c0db3bb5-085a-4a6e-93de-9ab15f74a38c)


Trigger API : http://localhost:8080/message

![image](https://github.com/srss-pocs/springboot-kubernetes-remote-debug/assets/145287517/00357c39-65fc-4afa-a8f1-16b95cb2d9c3)
