# 📚 Library Management System (Java + JDBC)

## 📖 Project Description

The Library Management System is a console-based Java application built using Core Java and JDBC.  
It allows users to manage students, books, and book issuing operations using a MySQL database.

This project demonstrates practical implementation of database connectivity and CRUD operations using JDBC.

---

## 🛠 Technologies Used

- Java (Core Java)
- MySQL Database
- JDBC (Java Database Connectivity)
- Console-based Interface

---

## 📂 Project Structure

LibraryManagementSystem/
│
├── Main.java
├── DBconnection.java
├── Student.java
├── Book.java
├── Issue.java
└── README.md

---

## ⚙ Features

### 👨‍🎓 Student Management
- Add multiple students using batch processing
- Stores student ID, name, and course

### 📚 Book Management
- Add new books
- Maintain available quantity

### 📖 Issue Book
- Check book availability
- Issue book to a student
- Automatically decrease book quantity after issuing

### 🖥 Menu Driven Interface

1. Add Student  
2. Add Book  
3. Issue a Book  
4. Exit  

---

## 🗄 Database Setup

### 1️⃣ Create Database

```sql
CREATE DATABASE library_management_system;
USE library_management_system;
```

### 2️⃣ Create Tables

#### Student Table

```sql
CREATE TABLE student (
    student_id INT PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(100)
);
```

#### Book Table

```sql
CREATE TABLE book (
    book_id INT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    quantity INT
);
```

#### Issue Table

```sql
CREATE TABLE issue (
    issue_id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT,
    student_id INT,
    issue_date DATE,
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (student_id) REFERENCES student(student_id)
);
```

---

## 🔌 Database Configuration

Update DBconnection.java:

```java
static String url = "jdbc:mysql://localhost:3306/library_management_system";
static String user = "root";
static String password = "your_password";
```

Replace "your_password" with your MySQL password.

---

## 🚀 How to Run the Project

1. Install MySQL
2. Create database and tables
3. Add MySQL JDBC Driver (mysql-connector)
4. Compile the project:

```bash
javac *.java
```

5. Run the program:

```bash
java Main
```

---

## 🧠 Concepts Used

- JDBC Connection
- PreparedStatement
- ResultSet
- Batch Processing
- Exception Handling
- Menu-driven programming

---

## 🔮 Future Improvements

- Return book functionality
- Fine calculation system
- Search student and book
- Update and delete operations
- DAO pattern implementation
- GUI version (JavaFX / Swing)

---

## 👨‍💻 Author

Deepak Muduli

---

⭐ If you like this project, consider giving it a star on GitHub!
