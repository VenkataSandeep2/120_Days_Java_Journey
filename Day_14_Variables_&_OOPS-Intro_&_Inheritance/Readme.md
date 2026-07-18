# Java Variables and Object-Oriented Programming (OOP)

A beginner-friendly Java repository covering **Variables** and **Object-Oriented Programming (OOP)** with real-time examples, interview questions, and practice programs.

---

# Topics Covered

## Variables

- Introduction to Variables
- Types of Variables
  - Instance Variable
  - Static Variable
  - Local Variable
- Memory Allocation
- Real-Time Examples
- Interview Questions

---

## Object-Oriented Programming (OOP)

- Introduction to OOP
- Why OOP?
- Class
- Object
- Class vs Object
- Four Pillars of OOP
  - Encapsulation
  - Inheritance
  - Polymorphism
  - Abstraction
- Features of OOP
- Advantages & Disadvantages
- Memory Representation
- Real-Time Examples
- Interview Questions

---

# Folder Structure

```text
Java-Variables-and-OOP
│
├── README.md
│
├── Variables
│   ├── InstanceVariable.java
│   ├── StaticVariable.java
│   ├── LocalVariable.java
│   └── Notes.md
│
├── OOP
│   ├── Student.java
│   ├── Car.java
│   ├── BankAccount.java
│   ├── Inheritance
│   ├── Encapsulation
│   ├── Polymorphism
│   ├── Abstraction
│   └── Notes.md
```

---

# Variables

## Introduction

A **Variable** is a named memory location used to store data. The value stored in a variable can change during program execution.

---

## Types of Variables

### 1. Instance Variable

- Declared inside a class but outside methods.
- Each object has its own copy.
- Created when an object is created.

### Example

```java
class Student {

    int id;
    String name;
}
```

---

### 2. Static Variable

- Declared using the `static` keyword.
- Shared by all objects.
- Memory is allocated only once.

### Example

```java
class Student {

    static String college = "KHIT";
}
```

---

### 3. Local Variable

- Declared inside a method, constructor, or block.
- Exists only while the method executes.

### Example

```java
public void display() {

    int marks = 95;

    System.out.println(marks);
}
```

---

# Variable Comparison

| Feature | Instance | Static | Local |
|----------|----------|---------|--------|
| Belongs To | Object | Class | Method |
| Memory | Heap | Method Area | Stack |
| Default Value | Yes | Yes | No |
| Access | Object | Class/Object | Method Only |

---

# Real-Time Examples of Variables

| Variable Type | Example |
|--------------|----------|
| Instance | Student Name, Employee ID |
| Static | College Name, Company Name |
| Local | Marks, Salary, Age |

---

# Object-Oriented Programming (OOP)

## Introduction

Object-Oriented Programming (OOP) is a programming paradigm that organizes software using **classes** and **objects**.

Each object contains:

- Data (Variables)
- Behavior (Methods)

Java follows OOP principles to build secure, reusable, maintainable, and scalable applications.

---

# Why OOP?

Before OOP, applications were developed using Procedural Programming, which had several limitations:

- Difficult to maintain
- Code duplication
- Low security
- Poor code reusability
- Hard to manage large projects

OOP solves these problems using classes and objects.

---

# Real-Time Example

## Car

### Properties

- Brand
- Model
- Color
- Price

### Behaviors

- Start()
- Stop()
- Accelerate()

```java
class Car {

    String brand;
    String color;

    void start() {
        System.out.println("Car Started");
    }

    void stop() {
        System.out.println("Car Stopped");
    }
}
```

---

# Another Example

## Student

### Properties

- Roll Number
- Name
- Age

### Behaviors

- Study()
- AttendClass()
- WriteExam()

```java
class Student {

    int rollNo;
    String name;

    void study() {
        System.out.println("Student is Studying");
    }
}
```

---

# Class

A **Class** is a blueprint used to create objects.

It contains:

- Variables
- Methods
- Constructors

Example

```java
class Student {

    int id;
    String name;

    void display() {

        System.out.println(id);
        System.out.println(name);
    }
}
```

---

# Object

An **Object** is an instance of a class.

Example

```java
Student s = new Student();
```

Here,

- Student → Class
- s → Reference Variable
- new Student() → Object

---

# Four Pillars of OOP

```
               OOP
                │
     ┌──────────┼──────────┐
     │          │          │
Encapsulation Inheritance Polymorphism
                │
          Abstraction
```

---

# 1. Encapsulation

### Definition

Binding data and methods into a single unit while protecting the data.

Achieved using:

- private variables
- Getter methods
- Setter methods

Real-Time Examples

- ATM
- Mobile Phone
- Bank Account

---

# 2. Inheritance

### Definition

Allows one class to inherit properties and behaviors of another class.

Keyword

```java
extends
```

Real-Time Examples

- Animal → Dog
- Vehicle → Car
- Employee → Manager

Advantages

- Code Reusability
- Easy Maintenance
- Less Code

---

# 3. Polymorphism

### Definition

One Object, Many Forms.

Types

- Compile-Time (Method Overloading)
- Run-Time (Method Overriding)

Real-Time Example

Payment System

- UPI
- Credit Card
- Debit Card

---

# 4. Abstraction

### Definition

Showing essential details while hiding implementation.

Achieved using

- Abstract Class
- Interface

Real-Time Examples

- ATM
- TV Remote
- Washing Machine
- Car

---

# Features of OOP

- Classes
- Objects
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Reusability
- Security
- Flexibility
- Scalability
- Maintainability

---

# Advantages of OOP

- Code Reusability
- Data Security
- Easy Maintenance
- Better Organization
- Real-World Modeling
- Scalable Applications

---

# Disadvantages of OOP

- Learning curve for beginners
- More memory usage
- Small programs require more code

---

# OOP Memory Representation

```text
Class
   │
   ▼
Blueprint
   │
   ▼
Object
   │
   ▼
Variables + Methods
```

---

# Class vs Object

| Class | Object |
|--------|---------|
| Blueprint | Instance |
| Logical Entity | Physical Entity |
| No Memory Allocation | Occupies Memory |
| Used to Create Objects | Created from Class |

---

# Real-Time Examples

| Application | Class | Object |
|-------------|-------|---------|
| Banking | BankAccount | Rahul Account |
| College | Student | Sai |
| Hospital | Patient | Ravi |
| Amazon | Product | Laptop |
| Railway | Ticket | Tatkal Ticket |
| Library | Book | Java Programming |

---

# Interview Questions

## Variables

### What is a Variable?

A named memory location used to store data.

---

### How many types of variables are there?

- Instance Variable
- Static Variable
- Local Variable

---

### Which variable is shared among all objects?

**Static Variable**

---

### Which variable belongs to an object?

**Instance Variable**

---

### Where is a Local Variable stored?

**Stack Memory**

---

## OOP

### What is OOP?

Object-Oriented Programming is a programming paradigm based on classes and objects.

---

### What are the four pillars of OOP?

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

### Why is OOP important?

- Reusability
- Security
- Maintainability
- Scalability

---

### Difference between Class and Object?

Class is a blueprint, while an object is an instance of that blueprint.

---

# Technologies Used

- Java
- Eclipse IDE
- JDK 17+ (Compatible with modern Java versions)

---

# Learning Outcome

After completing this repository, you will understand:

- Java Variables
- Instance, Static, and Local Variables
- Object-Oriented Programming
- Class and Object
- Four Pillars of OOP
- Real-Time Examples
- Interview-Oriented Concepts

---

# Author

**Sai**

Java Developer | Learning Core Java, DSA, JDBC, Spring Boot

---

# Repository Purpose

This repository is part of my **Java Developer Interview Preparation Journey**. It contains beginner-friendly explanations, practical examples, and interview-focused notes on **Variables** and **Object-Oriented Programming (OOP)** to build strong Core Java fundamentals.
