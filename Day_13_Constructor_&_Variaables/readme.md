# Java Access Modifiers and Constructors

A beginner-friendly Java repository covering **Access Modifiers** and **Constructors** with simple real-time examples, explanations, interview questions, and best practices.

---

# Topics Covered

## Access Modifiers

- Introduction to Access Modifiers
- public
- private
- protected
- default (package-private)
- Visibility Table
- Real-Time Examples
- Interview Questions

---

## Constructors

- Introduction to Constructor
- Constructor Syntax
- Why Constructors?
- Parameterized Constructor
- Constructor using `this` Keyword
- Real-Time Examples
- Constructor vs Method
- Interview Questions

---

# Folder Structure

```text
Java-Access-Modifiers-and-Constructors
│
├── README.md
│
├── Access-Modifiers
│   ├── ATM.java
│   ├── EmployeeDetails.java
│   └── Notes.md
│
└── Constructors
    ├── BankAccount.java
    ├── Mobile.java
    ├── FoodOrder.java
    └── Notes.md
```

---

# Access Modifiers

## Introduction

Access Modifiers control the **visibility (accessibility)** of classes, variables, methods, and constructors.

Java provides four access modifiers.

| Access Modifier | Same Class | Same Package | Subclass | Other Package |
|-----------------|-----------|--------------|----------|---------------|
| public | ✅ | ✅ | ✅ | ✅ |
| protected | ✅ | ✅ | ✅ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| private | ✅ | ❌ | ❌ | ❌ |

---

# Example 1 - Private Access Modifier

```java
class ATM {

    private int pin = 1234;

    void showPin() {
        System.out.println(pin);
    }
}
```

### Concepts Covered

- private variable
- Data Hiding
- Access through method

### Output

```text
1234
```

---

# Example 2 - Protected Access Modifier

```java
class Employee {

    protected int employeeId = 101;

    void display() {
        System.out.println(employeeId);
    }
}
```

### Concepts Covered

- protected variable
- Same package accessibility
- Member access

### Output

```text
Employee ID: 101
```

---

# Why Use Access Modifiers?

They help achieve:

- Data Security
- Encapsulation
- Controlled Access
- Code Reusability
- Better Object-Oriented Design

---

# Constructor

## Introduction

A **Constructor** is a special member of a class that is automatically called when an object is created.

It is mainly used to initialize object data.

---

# Constructor Syntax

```java
class Student {

    Student() {

    }
}
```

### Rules

- Constructor name must be the same as the class name.
- Constructor has no return type.
- Automatically called during object creation.
- Can be overloaded.

---

# Example 1 - Bank Account

```java
class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {

        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}
```

### Concepts Covered

- Parameterized Constructor
- Object Initialization
- this Keyword

### Output

```text
Account Holder: Sanjay
Balance: 5000.0
```

---

# Example 2 - Mobile

```java
class Mobile {

    String brand;
    double price;

    Mobile(String brand, double price) {

        this.brand = brand;
        this.price = price;
    }
}
```

### Concepts Covered

- Constructor
- Object Creation
- Data Initialization

### Output

```text
Brand: Samsung
Price: 25000.0
```

---

# Example 3 - Food Order

```java
class FoodOrder {

    String foodName;
    int quantity;

    FoodOrder(String foodName, int quantity) {

        this.foodName = foodName;
        this.quantity = quantity;
    }
}
```

### Concepts Covered

- Parameterized Constructor
- Object Initialization
- this Keyword

### Output

```text
Food: Biryani
Quantity: 2
```

---

# Constructor vs Method

| Constructor | Method |
|-------------|--------|
| Same name as class | Any valid name |
| No return type | Must have return type (or void) |
| Called automatically | Called explicitly |
| Initializes object | Performs operations |
| Executes once per object creation | Can be called multiple times |

---

# Real-Time Examples

## Access Modifiers

- ATM PIN Security (`private`)
- Employee ID (`protected`)
- Banking Applications
- Login Credentials
- User Profile

---

## Constructors

- Bank Account Creation
- Mobile Details
- Food Ordering System
- Student Registration
- Vehicle Registration

---

# Interview Questions

## Access Modifiers

### 1. What are Access Modifiers?

They define the accessibility of classes, variables, methods, and constructors.

---

### 2. How many Access Modifiers are available in Java?

- public
- protected
- default
- private

---

### 3. Which Access Modifier provides the highest security?

**private**

---

### 4. Can we access a private variable directly?

No. It can only be accessed within the same class or indirectly through methods.

---

### 5. What is the default access modifier if none is specified?

**default (package-private)**

---

## Constructors

### 1. What is a Constructor?

A special method that initializes an object.

---

### 2. Can a Constructor have a return type?

No.

---

### 3. Can Constructors be overloaded?

Yes.

---

### 4. When is a Constructor executed?

Automatically during object creation.

---

### 5. Why is the `this` keyword used inside a Constructor?

To distinguish instance variables from local variables.

---

# Technologies Used

- Java
- Eclipse IDE
- JDK 17+ (Compatible with modern Java versions)

---

# Learning Outcome

After completing this repository, you will understand:

- Java Access Modifiers
- Data Hiding
- Encapsulation Basics
- Object Initialization
- Constructors
- Parameterized Constructors
- `this` Keyword
- Constructor vs Method
- Interview-Oriented Examples

---
**

Java Developer | Learning Core Java, DSA, JDBC, Spring Boot

---

# Repository Purpose

This repository is part of my **Java Developer Interview Preparation Journey**. It contains beginner-friendly examples, real-time scenarios, and interview-focused notes on **Access Modifiers** and **Constructors** to strengthen Core Java fundamentals.
