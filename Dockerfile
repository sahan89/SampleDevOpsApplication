FROM openjdk:8
EXPOSE 8085
ADD target/sample-devops-application.war sample-devops-application.war
ENTRYPOINT ["java","-jar","sample-devops-application.war"]

