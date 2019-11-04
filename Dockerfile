FROM java:8-jdk-alpine
MAINTAINER Sahan Ekanayake
LABEL version="1.0"
LABEL description="First image with Dockerfile."
EXPOSE 8085
ADD /target/sample-devops-application-0.0.1.war sample-devops-application-0.0.1.war
ENTRYPOINT ["java","-jar","sample-devops-application-0.0.1.war"]