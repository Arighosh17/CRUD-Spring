# CRUD Application

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-13-blue)
![Java](https://img.shields.io/badge/Java-11-orange)
![License](https://img.shields.io/badge/License-MIT-yellow)

## 🚀 Introduction

This is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot and PostgreSQL. It demonstrates the basic operations for managing a set of resources with a RESTful API.

## 🛠 Features

- Create new records
- Read existing records
- Update existing records
- Delete records

## 🏗 Architecture

- **Backend:** Spring Boot
- **Database:** PostgreSQL
- **ORM:** Hibernate
- **Build Tool:** Maven

## 🎯 Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- PostgreSQL

### Installation

1. **Clone the repository**
    ```bash
    git clone https://github.com/YOUR_GITHUB_USERNAME/YOUR_REPOSITORY_NAME.git
    cd YOUR_REPOSITORY_NAME
    ```

2. **Configure the database**

    Create a database in PostgreSQL and update the `application.properties` file with your database configurations.
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
    spring.datasource.username=your_db_username
    spring.datasource.password=your_db_password
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Build the project**
    ```bash
    mvn clean install
    ```

4. **Run the application**
    ```bash
    mvn spring-boot:run
    ```

5. **Access the application**

    The application will be available at `http://localhost:8080`.

## 📚 API Endpoints

### Create a new record
```http
POST /api/tms/tasks/create
