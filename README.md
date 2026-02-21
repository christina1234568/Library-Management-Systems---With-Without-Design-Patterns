# Library-Management-Systems---With-Without-Design-Patterns
A Java-based library management system demonstrating the use of Design Patterns (Strategy and Factory) to refactor a traditional object-oriented system. The project compares implementations with and without design patterns to highlight improvements in scalability, maintainability, and code modularity.

Overview

This project models a library system with Normal and Premium users, handling book borrowing and returning according to specific rules. It illustrates how design patterns can improve code modularity and maintainability.

Features

Library management with books and users

Borrowing and returning of books with type-specific rules

Factory pattern for user regulations

Strategy pattern for borrowing policies

Project Structure
WithPatterns/
├── Book.java
├── Library.java
├── Main.java
├── Operations.java
├── Regulations.java
├── NormalUserRegulations.java
├── PremiumUserRegulations.java
└── RegulationsFactory.java
How to Run

Open the project in an IDE that supports Java.

Run Main.java inside the WithPatterns package.

Observe the console output simulating user interactions with the library.
