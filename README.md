#fullstack-backend

## Overview

This is a Java-based Full Stack web application that serves as the backend for managing user data. It provides RESTful API endpoints for creating, retrieving, updating, and deleting user records. The application uses Spring Boot for the backend framework, MySQL for the database, and Hibernate for JPA (Java Persistence API) for data persistence.

## Features

- Create a new user.
- Retrieve a list of all users.
- Retrieve a specific user by ID.
- Update an existing user's information.
- Delete a user by ID.

## Technologies Used

- **Spring Boot**: A popular framework for building Java applications, used for creating RESTful APIs and handling requests.
- **MySQL**: A relational database management system for storing user data.
- **Hibernate JPA**: A Java-based ORM (Object-Relational Mapping) framework for mapping Java objects to database tables.
- **Java Persistence API (JPA)**: A Java specification for ORM.
- **Maven**: A build automation tool for managing project dependencies.

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository:
   ```sh
   git clone https://github.com/ElGirasolMaestro/fullstack-backend.git
   
2. Configure your MySQL database settings in `application.properties`.

3. Build and run the project using Maven:
   ```sh
   cd fullstack-backend
   ```
   ```sh
   mvn spring-boot:run
   
4. The application will be accessible at http://localhost:8083 by default.
   
## API Endpoints
- POST /addUser: Create a new user.
- GET /getUsers: Retrieve all users.
- GET /getUser/{id}: Retrieve a user by ID.
- PUT /modifyUser/{id}: Update a user by ID.
- DELETE /deleteUser/{id}: Delete a user by ID.
  
## Examples
Here are some example API requests using Postman:
1. Create a New User (POST /addUser)
Request:
```sh
POST http://localhost:8083/addUser
Content-Type: application/json

{
    "name": "John Doe",
    "username": "johndoe",
    "email": "john@example.com"
}
```
2. Retrieve All Users (GET /getUsers)
Request:
```sh
GET http://localhost:8083/getUsers
```
3. Retrieve a User by ID (GET /getUser/{id})
Request:

Replace {id} with the actual user ID, for example, 1.
```sh
GET http://localhost:8083/getUser/1
```
4. Update a User by ID (PUT /modifyUser/{id})
Request:

Replace {id} with the actual user ID, for example, 1.
```sh
PUT http://localhost:8083/modifyUser/1
Content-Type: application/json

{
    "name": "Updated Name",
    "username": "updatedusername",
    "email": "updated@example.com"
}
```
5. Delete a User by ID (DELETE /deleteUser/{id})
Request:

Replace {id} with the actual user ID, for example, 1.
```sh
DELETE http://localhost:8083/deleteUser/1
```
## Contributing
Feel free to contribute to this project by opening issues or submitting pull requests. Contributions are welcome and appreciated.

## Contact
For inquiries, contact grisol225@gmail.com.

  
