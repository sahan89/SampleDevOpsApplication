FROM java:8-jdk-alpine
EXPOSE 8085
ADD /target/sample-devops-application-0.0.1.war sample-devops-application-0.0.1.war
ENTRYPOINT ["java","-jar","sample-devops-application-0.0.1.war"]