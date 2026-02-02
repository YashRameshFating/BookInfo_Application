# BookInfo_Application
# 📚 Book Management REST API

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![JPA](https://img.shields.io/badge/JPA-Hibernate-blue)
![Build](https://img.shields.io/badge/Build-Maven-success)

A **Spring Boot RESTful API** for managing books using **Spring Data JPA**.  
This project demonstrates **clean backend architecture**, **CRUD operations**, and **REST API development**.

---

## 🚀 Features
- Add new books
- Fetch all books
- Fetch book by ID
- Update book details
- Delete book
- RESTful API design
- Spring Data JPA with Hibernate

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST APIs
- MySQL / H2
- Maven

---

## 📂 Project Structure
├── controller
│ └── MainController.java
├── services
│ └── BookService.java
├── dao
│ └── BookRepository.java
├── entities
│ └── Book.java
└── BookApplication.java

---

## 🔗 API Endpoints

| Method | Endpoint         | Description        |
|------|------------------|--------------------|
| GET  | `/books`         | Get all books      |
| GET  | `/books/{id}`    | Get book by ID     |
| POST | `/books`         | Add a new book     |
| PUT  | `/books/{id}`    | Update book        |
| DELETE | `/books/{id}`  | Delete book        |

---

## 📌 Sample Request (POST / PUT)
```json
{
  "name": "Spring Boot in Action",
  "author": "Craig Walls"
}
