# Object-Oriented Programming (OOP) in Java

# Introduction

Object-Oriented Programming (OOP) is a programming paradigm that organizes software around **objects** rather than functions or procedures.

An **object** represents a real-world entity that contains **data (variables)** and **behavior (methods)**.

Java is a **100% Object-Oriented Programming Language** (except for primitive data types) and uses OOP concepts to build secure, reusable, maintainable, and scalable applications.

---

# What is OOP?

**Definition**

> Object-Oriented Programming (OOP) is a programming approach that models software using objects. Each object contains **properties (variables)** and **behaviors (methods)**.

### Simple Definition

OOP is a way of writing programs by creating **classes** and **objects** that represent real-world things.

---

# Why OOP?

Before OOP, programmers mainly used **Procedural Programming**, where the focus was on writing functions.

### Problems in Procedural Programming

- Difficult to maintain large applications
- Code duplication
- Low security
- Difficult to reuse code
- Hard to manage multiple developers

OOP solves these problems using objects and four important principles.

---

# Real-Time Example

Imagine a **Car**.

A car has:

### Properties (Data)

- Brand
- Color
- Model
- Speed
- Price

### Behaviors (Methods)

- Start()
- Stop()
- Accelerate()
- Brake()

In Java

```java
class Car
{
    String brand;
    String color;

    void start()
    {
        System.out.println("Car Started");
    }

    void stop()
    {
        System.out.println("Car Stopped");
    }
}
```

Here,

- Variables → Properties
- Methods → Behaviors
- Class → Blueprint
- Object → Real Car

---

# Another Real-Time Example

## Student

Properties

- Roll Number
- Name
- Age
- Branch

Behaviors

- Study()
- AttendClass()
- WriteExam()

```java
class Student
{
    int rollNo;
    String name;

    void study()
    {
        System.out.println("Student is Studying");
    }
}
```

---

# Class and Object

## Class

A **Class** is a blueprint or template used to create objects.

It contains:

- Variables
- Methods
- Constructors

Example

```java
class Student
{
    int id;
    String name;

    void display()
    {
        System.out.println(id);
        System.out.println(name);
    }
}
```

---

## Object

An object is an **instance of a class**.

Example

```java
Student s = new Student();
```

Here

- Student → Class
- s → Reference Variable
- new Student() → Object

---

# Four Pillars of OOP

```
                OOP
                 │
    ┌────────────┼────────────┐
    │            │            │
Encapsulation  Inheritance  Polymorphism
                 │
            Abstraction
```

---

# 1. Encapsulation

### Definition

Encapsulation is the process of **binding data and methods into a single unit (class)** while protecting the data by making variables private.

Achieved using:

- private variables
- Getter methods
- Setter methods

Example

```java
private int age;

public void setAge(int age)
{
    this.age = age;
}

public int getAge()
{
    return age;
}
```

Real-Life Example

- ATM Machine
- Mobile Phone
- Bank Account

---

# 2. Inheritance

### Definition

Inheritance allows one class to acquire the properties and behaviors of another class.

Keyword

```java
extends
```

Example

```java
class Animal
{
    public void sound()
    {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal
{

}
```

Real-Life Example

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

Polymorphism means **One Object, Many Forms.**

Types

### Compile-Time Polymorphism

Method Overloading

```java
add(int a,int b)

add(double a,double b)
```

### Run-Time Polymorphism

Method Overriding

```java
class Animal
{
    public void sound()
    {

    }
}

class Dog extends Animal
{
    @Override
    public void sound()
    {

    }
}
```

Real-Life Example

Payment

- UPI
- Credit Card
- Debit Card

All perform **pay()**, but differently.

---

# 4. Abstraction

### Definition

Abstraction means **showing only essential information and hiding implementation details**.

Achieved using

- Abstract Class
- Interface

Example

```java
abstract class Animal
{
    public abstract void sound();
}
```

Real-Life Example

- ATM
- Car
- TV Remote
- Washing Machine

---

# Features of OOP

- Object-Based Programming
- Class and Object
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Code Reusability
- Security
- Modularity
- Flexibility
- Scalability
- Easy Maintenance

---

# Advantages of OOP

✅ Code Reusability

Write once and reuse multiple times.

---

✅ Data Security

Private variables protect sensitive information.

---

✅ Easy Maintenance

Changes can be made without affecting the entire application.

---

✅ Flexibility

New features can be added easily.

---

✅ Better Organization

Code is divided into classes.

---

✅ Real-World Modeling

Objects represent real-world entities.

---

# Disadvantages of OOP

- Learning curve for beginners
- More memory usage than procedural programming
- Small programs may require more code

---

# OOP Memory Representation

```
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

# Real-Time Examples of OOP

| Application | Class | Object |
|-------------|-------|---------|
| Banking | BankAccount | Rahul Account |
| College | Student | Rahul |
| Hospital | Patient | Ravi |
| Car Showroom | Car | Toyota |
| Amazon | Product | Laptop |
| Railway | Ticket | Tatkal Ticket |
| Employee Management | Employee | Manager |
| Library | Book | Java Book |

---

# OOP Interview Questions

### What is OOP?

Object-Oriented Programming is a programming paradigm that organizes software using classes and objects.

---

### What are the four pillars of OOP?

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

### Why is OOP important?

- Code Reusability
- Security
- Easy Maintenance
- Scalability
- Flexibility

---

### Difference Between Class and Object

| Class | Object |
|---------|---------|
| Blueprint | Instance |
| Logical Entity | Physical Entity |
| No Memory | Occupies Memory |
| Used to Create Objects | Created from Class |

---

# OOP Roadmap

```
OOP
│
├── Class
├── Object
├── Constructor
├── Variables
├── Methods
├── this Keyword
├── super Keyword
├── Encapsulation
├── Inheritance
├── Polymorphism
├── Abstraction
├── Interface
├── Object Class
├── Packages
├── Exception Handling
└── Collections
```

---

# Quick Revision

```
Object-Oriented Programming (OOP)

↓

Uses Classes and Objects

↓

Four Pillars

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

↓

Advantages

✔ Reusability
✔ Security
✔ Flexibility
✔ Maintenance
✔ Scalability
```

---

# Interview One-Line Summary

> **Object-Oriented Programming (OOP) is a programming paradigm that models software using classes and objects. It focuses on four core principles—Encapsulation, Inheritance, Polymorphism, and Abstraction—to build secure, reusable, maintainable, and scalable applications.**
