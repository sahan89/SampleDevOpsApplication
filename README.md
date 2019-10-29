## *Overview*
Sample REST Application for DevOps.

## *Prerequisites*
* Java 1.8
* Maven
* MySQL
* Spring Boot
* Hibernate
* JUnit

## *Build Project*
1. Create Database ```CREATE DATABASE sample_devops_db;``` (Create Database automatically) 
2. Set Username and Password in the ```application.yml``` file
3. Clone the project
4. Invoke ```mvn clean install -DskipTests```
5. Navigate to target folder

## *Run Project*

Rest API body
`{
 	"subjectCode" : "IT-210",
     "subjectName" :"Business Intelligence",
     "department" :"Computer Science"
 }`

Header
`Content-Type application/json`