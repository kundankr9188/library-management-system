# Library Management System (Java)

## 📖 Overview

This project is a console-based Library Management System developed in Java.  
It demonstrates core Object-Oriented Programming (OOP) concepts, SOLID principles, and the implementation of design patterns.

The system allows librarians to manage books, patrons, and lending operations efficiently without using any external database or persistence layer.

---

## 🚀 Features

### 📚 Book Management
- Add new books to inventory
- Remove books
- Search books by ISBN, title, or author
- Track book availability

### 👤 Patron Management
- Register new patrons
- Update patron information
- Track borrowing history

### 🔄 Lending Process
- Checkout books
- Return books
- Automatic availability updates

### 🔔 Reservation & Notification System
- Patrons can reserve unavailable books
- Patrons receive notifications when books become available

---

## 🏗️ Project Structure



---

## 🧠 Design Patterns Used

### 1️⃣ Factory Pattern
Used in `BookFactory` to encapsulate object creation logic.

### 2️⃣ Observer Pattern
Used to implement the reservation notification system:
- `Book` acts as Subject
- `Patron` acts as Observer
- Observers are notified when a reserved book becomes available

---

## 📐 SOLID Principles Applied

- **Single Responsibility Principle**  
  Repository handles storage, Service handles business logic.

- **Open/Closed Principle**  
  Observer pattern allows extension without modifying core logic.

- **Dependency Inversion Principle**  
  Services depend on abstractions and repositories rather than concrete implementations.

- **Encapsulation & Abstraction**  
  Private fields with public methods for controlled access.

---

## 🛠️ Technologies Used

- Java 17
- Java Collections Framework (List, Map, etc.)
- `java.util.logging` for logging

---

## ▶️ How to Run the Project

1. Clone the repository:

2. Open in IntelliJ/VS Code

3. Run:


---

## 📊 Class Diagram

-------------------------------------------------
|                 Subject      Observer         |
-------------------------------------------------
|                     Book                     |
|        Patron                Loan            |
-------------------------------------------------
|      BookRepository     PatronRepository     |
-------------------------------------------------
|  BookService   PatronService   LendingService|
-------------------------------------------------
                   (BookFactory → Book)



---

## 📌 Future Improvements

- Multi-branch support
- Recommendation system
- Database integration
- REST API integration using Spring Boot

---

## 👨‍💻 Author

Kundan Kumar

---

Submission Branch for Assignment
