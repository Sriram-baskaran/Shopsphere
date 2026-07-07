# 🛒 ShopSphere Backend

A RESTful e-commerce backend built with **Spring Boot** that provides product management, product reviews, order creation, and product search functionality.

This project was developed to learn Spring Boot fundamentals, REST APIs, JPA/Hibernate, and backend architecture.

---

## 🚀 Features

- Product Management
- Product Reviews
- Order Management
- Dynamic Product Search
- DTO-based API Responses
- JPA Entity Relationships
- MySQL Database Integration
- Spring Data JPA Specifications
- RESTful API Design

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- IntelliJ IDEA
- Git & GitHub

---

## 📂 Project Structure

```
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── spec
 ├── seed
 └── resources
```

The project follows a layered architecture:

```
Controller
      │
      ▼
Service
      │
      ▼
Repository
      │
      ▼
MySQL Database
```

---

## 📦 Database

The application uses **MySQL**.

Entities include:

- Product
- ProductImage
- ProductReview
- Order
- OrderItem

Relationships are implemented using JPA annotations such as:

- `@OneToMany`
- `@ManyToOne`
- `@JoinColumn`

---

## 🔍 API Endpoints

### Products

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/products` | Get all products |
| GET | `/api/products/{id}` | Get product by ID |
| GET | `/api/products/search` | Search products |

### Reviews

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/reviews` | Add a review |

### Orders

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/orders` | Create an order |
| GET | `/api/orders/{referenceId}` | Get order by reference ID |

---

## ⚙️ Configuration

Configure your database in `application.properties`.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/shopsphere
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

---

## ▶️ Running the Project

Clone the repository

```bash
git clone https://github.com/Sriram-baskaran/Shopsphere.git
```

Navigate to the project

```bash
cd Shopsphere
```

Run the application

```bash
./mvnw spring-boot:run
```

or run `ShopsphereApplication.java` directly from IntelliJ.

---

## 📚 Concepts Practiced

- Spring Boot
- REST APIs
- Dependency Injection
- Layered Architecture
- DTO Pattern
- JPA/Hibernate
- Entity Relationships
- CRUD Operations
- Repository Pattern
- Spring Data JPA Specifications
- Pagination
- Java Streams
- UUID Generation
- Exception Handling

---

## 🔮 Future Improvements

- JWT Authentication
- User Registration & Login
- Role-based Authorization
- Shopping Cart
- Payment Gateway Integration
- Docker Support
- AWS Deployment
- Image Upload API
- API Documentation (Swagger/OpenAPI)

---


**Sriram Baskaran**

GitHub: https://github.com/Sriram-baskaran
