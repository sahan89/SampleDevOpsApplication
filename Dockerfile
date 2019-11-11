#FROM java:8-jdk-alpine
#MAINTAINER Sahan Ekanayake
#LABEL version="1.0"
#LABEL description="First image with Dockerfile."
#EXPOSE 8085
#ADD /target/sample-devops-application-0.0.1.war sample-devops-application-0.0.1.war
#ENTRYPOINT ["java","-jar","sample-devops-application-0.0.1.war"]
FROM tomcat:8.0-alpine
LABEL maintainer="maheshpcjt@gmail.com"

ADD target/sample-devops-application-0.0.1.war /usr/local/tomcat/webapps/

EXPOSE 8081
CMD ["catalina.sh","run"]
