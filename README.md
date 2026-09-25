# Spring Boot JPA One-to-Many

A simple Spring Boot project demonstrating a **One-to-Many relationship using Spring Data JPA and Hibernate**.

## 🚀 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## 📌 Project Overview

This project demonstrates how to map a **One-to-Many relationship** between `Customer` and `Order`.

### Relationship

```text
Customer
   |
   | One-to-Many
   ↓
Orders
```

One customer can have multiple orders.

## 📂 Project Structure

```text
src/main/java/in/ashokit
│
├── SbJpaOneToManyApplication.java
│
├── model
│   ├── Customer.java
│   └── Order.java
│
├── repository
│   └── CustomerRepository.java
│
└── runner
    └── MyApplicationRunner.java
```

## ⚙️ Configuration

Update your database configuration in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace the database username and password with your own values.

## ▶️ How to Run

### Using Maven

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

Or run `SbJpaOneToManyApplication.java` directly from your IDE.

## 🎯 Key Concepts

* Spring Boot
* Spring Data JPA
* Hibernate
* Entity Mapping
* `@OneToMany`
* `@ManyToOne`
* JPA Repository
* Entity relationships
* Database persistence

## 👨‍💻 Author

**Shayan Arshi**

GitHub: [Shayanarshi](https://github.com/Shayanarshi)
