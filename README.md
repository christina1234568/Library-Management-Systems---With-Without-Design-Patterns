# Library-Management-Systems---With-Without-Design-Patterns
A Java-based library management system demonstrating the use of Design Patterns (Strategy and Factory) to refactor a traditional object-oriented system. The project compares implementations with and without design patterns to highlight improvements in scalability, maintainability, and code modularity.

## Overview

- Simulates a library with **Normal** and **Premium** users  
- Users can **borrow and return books** with rules based on their user type  
- Demonstrates **Factory** and **Strategy** design patterns  

## Project Structure

WithPatterns/
├── Book.java
├── Library.java
├── Main.java
├── Operations.java
├── Regulations.java
├── NormalUserRegulations.java
├── PremiumUserRegulations.java
└── RegulationsFactory.java

WithoutPatterns/
├── Book.java
├── Library.java
├── Main.java
├── Operations.java
└── User.java


## How to Run

1. Open the project in a Java IDE (e.g., Eclipse, IntelliJ, NetBeans).  
2. Run `Main.java` inside the `WithPatterns` or `WithoutPatterns` package.  
3. Observe console output for borrowing operations and rule enforcement.
