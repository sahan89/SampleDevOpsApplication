#FROM java:8-jdk-alpine
#MAINTAINER Sahan Ekanayake
#LABEL version="1.0"
#LABEL description="First image with Dockerfile."
#EXPOSE 8085
#ADD /target/sample-devops-application-0.0.1.war sample-devops-application-0.0.1.war
#ENTRYPOINT ["java","-jar","sample-devops-application-0.0.1.war"]
#FROM andreptb/oracle-java:8
#LABEL maintainer="sahanekanayake08@gmail.com"

#ADD target/sample-devops-application-0.0.1.war /usr/local/tomcat/webapps/

#EXPOSE 8081
#CMD ["catalina.sh","run"]
# Alpine Linux with OpenJDK JRE
FROM openjdk:8
EXPOSE 8085
ADD target/sample-devops-application.war sample-devops-application.war
ENTRYPOINT ["java","-jar","ample-devops-application.war"]

