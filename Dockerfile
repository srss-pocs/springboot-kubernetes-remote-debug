FROM openjdk:21
EXPOSE 8080
ADD target/springboot-kubernetes-remote-debug.jar springboot-kubernetes-remote-debug.jar 
ENTRYPOINT ["java","-jar","/springboot-kubernetes-remote-debug.jar"]