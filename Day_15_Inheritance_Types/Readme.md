# Java Inheritance

A beginner-friendly Java repository covering **Inheritance** in detail with real-time examples, interview questions, diagrams, and Java programs.

---

# Introduction

Inheritance is one of the **four pillars of Object-Oriented Programming (OOP)**.

It allows one class to **inherit (reuse)** the properties and methods of another class.

Instead of writing the same code repeatedly, Java allows a child class to reuse the code of an existing parent class.

This improves:

- Code Reusability
- Readability
- Maintainability
- Extensibility

---

# Definition

> Inheritance is the process by which one class acquires the properties (variables) and behaviors (methods) of another class.

The existing class is called the **Parent (Superclass)**.

The new class is called the **Child (Subclass)**.

---

# Real-Time Example

Imagine a **Father**.

Father has

- House
- Land
- Bike

Son automatically gets these properties.

```
Father
   │
inherits
   │
Son
```

Instead of buying everything again, the son reuses what the father already owns.

Inheritance works the same way in Java.

---

# Syntax

```java
class Parent
{

}

class Child extends Parent
{

}
```

The keyword used is

```java
extends
```

---

# Why Do We Use Inheritance?

Without inheritance

```java
class Dog
{
    void eat(){}
}

class Cat
{
    void eat(){}
}
```

The `eat()` method is duplicated.

With inheritance

```java
class Animal
{
    void eat(){}
}

class Dog extends Animal
{

}

class Cat extends Animal
{

}
```

Only one copy of `eat()` is written.

Advantages:

- Less Code
- Easy Maintenance
- Reusability
- Better Organization

---

# Types of Inheritance

Java supports the following inheritance types:

```
Inheritance
│
├── Single
├── Multilevel
├── Hierarchical
├── Multiple (Not Supported with Classes)
└── Hybrid (Not Supported with Classes)
```

---

# 1. Single Inheritance

## Definition

One child class inherits from one parent class.

Diagram

```
Parent
   │
   ▼
Child
```

Example

```
Animal
   │
   ▼
Dog
```

Real-Life Example

- Animal → Dog
- Vehicle → Car
- Employee → Manager

---

# 2. Multilevel Inheritance

## Definition

A child class becomes the parent of another class.

Diagram

```
GrandParent
      │
      ▼
 Parent
      │
      ▼
 Child
```

Example

```
Person
   │
Employee
   │
Developer
```

Real-Life Example

- Human
- Employee
- Software Engineer

---

# 3. Hierarchical Inheritance

## Definition

One parent class has multiple child classes.

Diagram

```
        Animal
       /   |   \
     Dog  Cat Snake
```

Example

```
Vehicle
│
├── Car
├── Bus
└── Bike
```

Real-Life Example

- Animal
- Vehicle
- Employee

---

# 4. Multiple Inheritance

## Definition

One child class inherits from more than one parent class.

Diagram

```
 Parent1     Parent2
      \       /
       \     /
        Child
```

---

# Why Doesn't Java Support Multiple Inheritance?

Java **does not support multiple inheritance using classes** because it creates the **Diamond Problem (Ambiguity Problem).**

Example:

```java
class Parent1
{
    void display()
    {
        System.out.println("Parent1");
    }
}

class Parent2
{
    void display()
    {
        System.out.println("Parent2");
    }
}

// Not Allowed
class Child extends Parent1, Parent2
{

}
```

Question:

If the child calls

```java
display();
```

Which method should Java execute?

```
Parent1.display()

OR

Parent2.display()
```

Java cannot decide.

This confusion is called the **Diamond Problem**.

Therefore Java does **not allow multiple inheritance with classes.**

---

# Diamond Problem

```
        Animal
        /    \
     Dog      Cat
        \    /
        Puppy
```

If both Dog and Cat have

```java
sound();
```

Which version should Puppy inherit?

This ambiguity is the Diamond Problem.

---

# How Does Java Solve It?

Java supports **Multiple Inheritance using Interfaces.**

Example

```java
interface Camera
{
    void click();
}

interface Music
{
    void play();
}

class Mobile implements Camera, Music
{

}
```

Interfaces remove ambiguity because methods are implemented by the child class.

---

# 5. Hybrid Inheritance

## Definition

Hybrid inheritance is a combination of two or more inheritance types.

Diagram

```
      Animal
      /     \
    Dog     Cat
      \     /
      Puppy
```

Hybrid includes

- Single
- Multilevel
- Hierarchical
- Multiple

---

# Why Doesn't Java Support Hybrid Inheritance?

Hybrid inheritance also contains **Multiple Inheritance**, which causes the Diamond Problem.

Therefore Java does not support Hybrid Inheritance using classes.

It can only be achieved using interfaces.

---

# Keyword Used

```java
extends
```

---

# Advantages of Inheritance

- Code Reusability
- Less Code Duplication
- Easy Maintenance
- Method Reuse
- Better Organization
- Easy Extension
- Supports Polymorphism

---

# Disadvantages

- Tight Coupling
- Improper hierarchy causes maintenance issues
- Multiple inheritance ambiguity (avoided in Java)

---

# Real-Time Examples

| Parent | Child |
|---------|-------|
| Animal | Dog |
| Vehicle | Car |
| Person | Employee |
| Employee | Manager |
| Mobile | SmartPhone |
| User | Admin |

---

# Interview Questions

### What is Inheritance?

Inheritance allows one class to acquire the properties and methods of another class.

---

### Which keyword is used?

```
extends
```

---

### How many types of inheritance exist?

- Single
- Multilevel
- Hierarchical
- Multiple
- Hybrid

---

### Which inheritance types are supported by Java classes?

✅ Single

✅ Multilevel

✅ Hierarchical

---

### Which inheritance types are NOT supported by Java classes?

❌ Multiple

❌ Hybrid

---

### Why doesn't Java support Multiple Inheritance?

Because of the **Diamond Problem (Ambiguity Problem).**

---

### How can Multiple Inheritance be achieved?

Using **Interfaces**.

---

# Quick Revision

```
Inheritance

↓

Reuse Parent Class

↓

Keyword

extends

↓

Types

Single

Multilevel

Hierarchical

Multiple ❌

Hybrid ❌

↓

Reason

Diamond Problem

↓

Solution

Interfaces
```

---

# Learning Outcome

After completing this repository, you will understand:

- What is Inheritance
- Why Inheritance is used
- Types of Inheritance
- Single, Multilevel, and Hierarchical Inheritance
- Why Java does not support Multiple and Hybrid Inheritance
- Diamond Problem
- Interfaces as the solution
- Interview-Oriented Concepts

---

# Repository Purpose

This repository is part of my **Java Developer Interview Preparation Journey**. It contains beginner-friendly examples, real-world scenarios, diagrams, and interview-focused notes on **Inheritance** to build strong Core Java fundamentals.
