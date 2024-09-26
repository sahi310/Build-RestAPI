# Build-RestAPI
If you are a beginner and want to learn how to build a REST API in Spring Boot, here is a guide for you.

**Tools used :** Eclipse, Maven, Postman, Mysql
**Develop REST APIs in Spring Boot to perform CRUD operations on an user database.**

Spring Boot is a java framework used for developing web applications. To create the spring boot application, we will use a tool called Spring Intializr. This tool provides the basic structure of a Spring Boot project for us to start quickly.

Go to Spring Initializer site and follow as shown below:
![Screenshot 2024-09-26 143625](https://github.com/user-attachments/assets/2355ce27-f8cf-444a-807b-ed3214624f63)

Click the generate button at the bottom of the screen. This will download a zip file containing our project boilerplate. Extract it to the preferred folder location.

* application.properties file under the resource folder contains all the properties of our Spring Boot will use to configure the application.
NOTE : aa your database configuration details also.
* pom.xml file contains all the dependencies that we have added while creating the Spring Boot project in Spring Initializr.

* Main Layers that a Spring Boot application must include.
  1. Repository : This layer connects to the database ans access the data.
  2. Service : To perform calculations on the data received and perform business logic on it.
  3. Model : This contains all the java objects that will be mapped to the database table using.
  4. Controller : When a request comes for a particular REST API, the controller will process the REST API request calls one or more services and returns an HTTP response to the client.

Post completing all the modules, use the command mvn clean install -Dmaven.test.skip=true , a popular build automation tool for Java projects. Then run the project.
![Screenshot 2024-09-26 144812](https://github.com/user-attachments/assets/3cada7fe-9ca8-48dc-86fd-b963a42fd1e0)

To test the services, I have used Postman tool( this is an application that helps in developing, testing and dosumenting API's).  This project implements 4 services (POST,GET,PUT and DELETE) .I'm attaching 4 screenshots to show how the results got displayed.

POST :
![Screenshot 2024-09-26 145400](https://github.com/user-attachments/assets/87246c94-5a46-4e24-bba0-cdb86f1efa98)

GET :
![Screenshot 2024-09-26 145332](https://github.com/user-attachments/assets/6c2d41a6-7d7b-47c3-8e5b-a25a0b0c62ea)

PUT :
![Screenshot 2024-09-26 145254](https://github.com/user-attachments/assets/9fd4cf53-94e5-48f2-aad9-15dea9531796)

DELETE :
![Screenshot 2024-09-26 145433](https://github.com/user-attachments/assets/ac5cdb80-08f5-4991-b209-4dc2c11f657f)

Database images :
Befor:
![Screenshot 2024-09-26 145634](https://github.com/user-attachments/assets/adefe5b6-e3c2-4bc2-801b-180b3f0ca39b)
After:
![Screenshot 2024-09-26 145628](https://github.com/user-attachments/assets/dbfdc83b-17aa-4c5f-8582-5e6b08b1e509)









