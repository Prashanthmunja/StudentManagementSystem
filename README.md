# StudentManagementSystem
tudent Management System built using Spring Boot, H2 Database, and RESTful APIs. Supports CRUD operations for managing student data.

Student Management System
📖 Description

A simple Student Management System built using Spring Boot, Spring Data JPA, H2 Database, and Lombok.
It provides CRUD REST APIs to manage student information such as name, email, and age.

 Tech Stack

Java 17

Spring Boot 3.x

Spring Data JPA

H2 Database

Lombok

Maven

Features

✅ Add a new student
✅ Get all students
✅ Get a student by ID
✅ Update student details
✅ Delete a student

🗂️ Project Structure
StudentManagementSystem/
│
├── src/main/java/com/example/StudentManagementSystem/
│   ├── Controller/StudentController.java
│   ├── Service/StudentService.java
│   ├── Repository/StudentRepository.java
│   ├── model/StudentModel.java
│   └── StudentManagementSystemApplication.java
│
├── src/main/resources/
│   ├── application.properties
│
├── pom.xml
└── README.md

⚡ Setup Instructions

Clone the repository

git clone https://github.com/<your-username>/StudentManagementSystem.git


Open the project in your IDE (IntelliJ / Eclipse / VS Code)

Run the application

From IDE → Run StudentManagementSystemApplication.java

Or from terminal:

mvn spring-boot:run


Access the H2 console

Open http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

🧠 API Endpoints
Method	Endpoint	Description
POST	/students	Add a new student
GET	/students	Get all students
GET	/students/{id}	Get a student by ID
PUT	/students/{id}	Update a student
DELETE	/students/{id}	Delete a student
🧾 Example JSON for POST / PUT
{
  "name": "Prashanth Munja",
  "email": "prashanth@example.com",
  "age": 22
}

🧰 Build and Run with Maven
mvn clean install
mvn spring-boot:run

📦 Database Configuration (H2)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true

🧑‍💻 Author

Prashanth Munja
💼 Java | Spring Boot | Microservices | Full Stack Developer
