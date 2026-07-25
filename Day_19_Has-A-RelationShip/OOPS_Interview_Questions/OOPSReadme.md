# 🚀 Java Full Stack Journey - Day 18 Revision

# 📚 Object-Oriented Programming (OOP) in Java

> **Topics Covered**
>
> ✅ Class & Object  
> ✅ Constructor  
> ✅ this Keyword  
> ✅ super Keyword  
> ✅ Inheritance  
> ✅ Types of Inheritance  
> ✅ HAS-A Relationship  
> ✅ Polymorphism  
> ✅ Encapsulation  
> ✅ Abstraction  
> ✅ Interface  
> ✅ Interview Questions  
> ✅ Quick Revision

---

# 📖 What is OOP?

**OOP (Object-Oriented Programming)** is a programming paradigm used to design software using **Classes** and **Objects**.

Instead of writing everything inside one program, we divide the program into multiple objects.

Each object has

- Properties (Variables)
- Behaviors (Methods)

---

# 🎯 Real-Time Example

Think about **Amazon**.

```
Amazon
│
├── Customer
├── Product
├── Cart
├── Payment
├── Delivery
└── Notification
```

Each one is a separate class.

---

# Telugu Understanding 🇮🇳

Imagine a College.

```
Principal

Teachers

Students

Library

Classrooms
```

Everyone has different responsibilities.

Similarly,

Every Java class has its own responsibility.

---

# OOP Architecture

```
                OOP

                  │
      ┌───────────┼────────────┐
      │           │            │
   Class       Object      Methods
      │
      ▼
  Four Pillars

      │
 ┌────┼────┬────┬────┐
 │    │    │    │
Inheritance
Encapsulation
Abstraction
Polymorphism
```

---

# 1️⃣ Class

A **Class** is a blueprint.

It defines

- Variables
- Methods

No memory is allocated until an object is created.

---

## Example

```java
class Student
{

}
```

---

# Real-Time Example

Blueprint

↓

House

---

Blueprint is Class.

House is Object.

---

# 2️⃣ Object

An Object is an instance of a class.

Memory is allocated only after creating an object.

---

Example

```java
Student s = new Student();
```

---

Flow

```
Class

↓

Object Created

↓

Methods Executed
```

---

# 3️⃣ Constructor

A Constructor initializes an object.

It is called automatically whenever an object is created.

---

Syntax

```java
ClassName()
{

}
```

---

Example

```java
BankAccount account =
new BankAccount("Sandeep",5000);
```

---

Flow

```
new Object()

↓

Constructor()

↓

Variables Initialized

↓

Object Ready
```

---

Real-Time Example

Opening Bank Account

↓

Customer Details

↓

Constructor Initializes

↓

Account Created

---

# Types of Constructors

## Default Constructor

```java
Student()
{

}
```

---

## Parameterized Constructor

```java
Student(String name,int age)
{

}
```

---

# Constructor vs Method

| Constructor | Method |
|------------|---------|
| Same name as class | Any name |
| No return type | Return type allowed |
| Executes automatically | Called manually |
| Initializes object | Performs task |

---

# 4️⃣ this Keyword

Used to refer to the current object.

---

Example

```java
this.name=name;
```

---

Flow

```
Current Object

↓

this

↓

Current Variables
```

---

Real-Time Example

```java
Mobile(String brand)
{
this.brand=brand;
}
```

---

# 5️⃣ super Keyword

Used to access Parent Class variables, methods and constructor.

---

Flow

```
Parent

↑

Child

↓

super()
```

---

Example

```java
super.display();
```

---

# Difference

| this | super |
|-------|-------|
| Current Class | Parent Class |
| Current Variables | Parent Variables |
| Current Methods | Parent Methods |

---

# 6️⃣ Inheritance

Inheritance allows one class to acquire properties and methods of another class.

---

Syntax

```java
class Dog extends Animal
{

}
```

---

Flow

```
Animal

↑

Dog
```

---

Advantages

- Code Reusability
- Less Coding
- Easy Maintenance

---

# Types of Inheritance

```
Inheritance

│

├── Single

├── Multilevel

├── Hierarchical

├── Multiple (Interface)

└── Hybrid (Interface)
```

---

# Real-Time Example

```
Vehicle

↑

Car

↑

BMW
```

---

# 7️⃣ HAS-A Relationship

One object contains another object.

---

Composition

```
Car

↓

Engine
```

---

Aggregation

```
College

↓

Student
```

---

Difference

| Composition | Aggregation |
|-------------|-------------|
| Strong Relationship | Weak Relationship |
| Cannot exist separately | Can exist separately |

---

# 8️⃣ Polymorphism

One interface

Many Forms

---

Example

```
Payment

↓

UPI

Card

NetBanking
```

---

Types

## Compile-Time

Method Overloading

---

## Runtime

Method Overriding

---

Difference

| Overloading | Overriding |
|-------------|------------|
| Same class | Parent & Child |
| Parameters Different | Same Parameters |
| Compile Time | Runtime |

---

# 9️⃣ Encapsulation

Wrapping variables and methods into one class and protecting data.

---

Example

```
Customer

↓

Deposit()

↓

Private Balance
```

---

Advantages

- Data Hiding
- Security
- Flexibility
- Easy Maintenance

---

# 🔟 Abstraction

Showing only necessary information while hiding implementation.

---

Example

```
TV Remote

↓

Button

↓

TV Works
```

User doesn't know internal implementation.

---

Using

- Abstract Class
- Interface

---

# 1️⃣1️⃣ Interface

Interface provides complete abstraction.

Contains method declarations.

---

Syntax

```java
interface Car
{

}
```

---

Implementation

```java
class BMW implements Car
{

}
```

---

Flow

```
Interface

↓

implements

↓

Class
```

---

Advantages

- Multiple Inheritance
- Loose Coupling
- 100% Abstraction

---

# OOP Complete Flow

```
Class

↓

Object

↓

Constructor

↓

this

↓

super

↓

Inheritance

↓

Polymorphism

↓

Encapsulation

↓

Abstraction

↓

Interface
```

---

# Most Asked Java Interview Questions

## Q1. What is OOP?

Expected Answer:

Object-Oriented Programming is a programming paradigm that organizes software using classes and objects. It improves code reusability, security, and maintainability.

---

## Q2. What are the four pillars of OOP?

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

## Q3. What is a Class?

Blueprint for creating objects.

---

## Q4. What is an Object?

Instance of a class.

---

## Q5. What is a Constructor?

A special method used to initialize objects automatically during object creation.

---

## Q6. Why is a Constructor needed?

To initialize object data and avoid writing initialization code repeatedly.

---

## Q7. Difference between Constructor and Method?

| Constructor | Method |
|------------|---------|
| Initializes object | Performs operations |
| Same name as class | Any valid name |
| No return type | Can have return type |
| Auto-called | Called manually |

---

## Q8. What is the `this` keyword?

Refers to the current object and is commonly used to resolve variable shadowing.

---

## Q9. What is the `super` keyword?

Used to access parent class constructors, methods, and variables.

---

## Q10. What is Inheritance?

The process by which a child class acquires properties and methods from a parent class.

---

## Q11. Why doesn't Java support multiple inheritance with classes?

To avoid the **Diamond Problem**. Java supports multiple inheritance through interfaces.

---

## Q12. What is Polymorphism?

One interface with multiple implementations.

---

## Q13. Difference between Method Overloading and Method Overriding?

| Method Overloading | Method Overriding |
|--------------------|-------------------|
| Same class | Parent and Child |
| Different parameters | Same parameters |
| Compile-time | Runtime |

---

## Q14. What is Encapsulation?

Binding data and methods together while hiding internal data using access modifiers.

---

## Q15. What is Abstraction?

Hiding implementation details while exposing only essential functionality.

---

## Q16. Abstract Class vs Interface?

| Abstract Class | Interface |
|----------------|-----------|
| Can have constructors | No constructors |
| Can contain instance variables | Only constants |
| Partial abstraction | Full abstraction (traditional concept) |
| Uses `extends` | Uses `implements` |

---

## Q17. What is a HAS-A Relationship?

A relationship where one class contains another class as a member.

---

## Q18. Why is OOP important?

- Code Reusability
- Easy Maintenance
- Security
- Scalability
- Modular Programming

---

# Quick Revision

```
Class
↓

Object
↓

Constructor
↓

this
↓

super
↓

Inheritance
↓

Polymorphism
↓

Encapsulation
↓

Abstraction
↓

Interface
↓

HAS-A Relationship
```

---

# Memory Trick

```
C → Class

O → Object

C → Constructor

T → this

S → super

I → Inheritance

P → Polymorphism

E → Encapsulation

A → Abstraction

I → Interface

H → HAS-A
```

---

# Git Commit

```bash
git add .

git commit -m "docs(day-18): complete OOP revision handbook with interview notes"

git push origin main
```

---

# 🎯 Today's Achievement

✅ Understood the complete OOP concept

✅ Learned Constructors

✅ Learned `this` and `super`

✅ Mastered Inheritance

✅ Learned Polymorphism

✅ Understood Encapsulation

✅ Learned Abstraction

✅ Learned Interfaces

✅ Practiced interview-focused OOP concepts

---

> **"Master OOP once, and Java becomes much easier to understand."** 🚀
