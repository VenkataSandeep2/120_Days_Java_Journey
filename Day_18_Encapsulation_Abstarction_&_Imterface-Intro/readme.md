
# 🚀 Java Full Stack Journey - Day 18

# Encapsulation | Abstraction | Interface

---

# 📚 Topics Covered

✅ Encapsulation

✅ Getters & Setters

✅ Data Hiding

✅ Abstraction

✅ Abstract Class

✅ Abstract Method

✅ Interface

✅ implements Keyword

✅ Multiple Inheritance using Interface

✅ Real-Time Examples

---

# Introduction

Today's topic is one of the most important topics in Java OOP.

Every Java interview—from Freshers to Experienced—asks questions from

- Encapsulation
- Abstraction
- Interface

If these three concepts are clear, Java becomes much easier.

---

# 1️⃣ Encapsulation

## What is Encapsulation?

Encapsulation means

> Wrapping Data + Methods into a single class.

OR

> Protecting data from direct access.

We hide variables using

private

and access them using

Getter and Setter methods.

---

# Real-Time Example

Think about an ATM.

You cannot directly change your bank balance.

You must enter

✔ PIN

✔ Withdraw Amount

✔ Deposit Amount

The bank validates everything.

Exactly the same in Java.

```
private double balance;
```

Nobody can access it directly.

---

# Telugu Understanding 🇮🇳

Imagine

మీ ఇంటి Beeruva (Locker)

Inside

Gold

Documents

Cash

Can everyone open it?

❌ No

Only using Key.

That key is

Getter

Setter

This is called

Encapsulation.

---

# Why Encapsulation?

✅ Data Security

✅ Data Hiding

✅ Easy Maintenance

✅ Controlled Access

---

# Example

```java
class BankAccount
{
    private double balance;

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }
}
```

---

# Interview Definition

Encapsulation is the process of wrapping data and methods into one class while hiding data using private access modifier.

---

# Advantages

✔ Security

✔ Data Hiding

✔ Easy Modification

✔ Better Control

✔ Reusability

---

# 2️⃣ Abstraction

## What is Abstraction?

Showing only

Important Details

and

Hiding Internal Implementation.

---

# Telugu Example

When you drive Bike

You only

Start Bike

Accelerate

Brake

You never know

How Engine Works

That hidden logic

=

Abstraction

---

# Mobile Example

Click Camera

Photo comes.

Do you know

How image processing happens?

❌ No

That is Abstraction.

---

# Java Abstraction

Achieved using

Abstract Class

and

Interface.

---

# Abstract Class

An abstract class

cannot create objects.

```
abstract class Animal
{
    abstract void sound();
}
```

---

# Child Class

```java
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog Barks");
    }
}
```

---

# Why Abstract Class?

Suppose

Every Animal

has different sound.

Instead of writing common logic many times

Parent tells

"You must implement sound()."

Child decides

how.

---

# Real-Time Example (Your Project)

Animal

↓

Dog

↓

Cat

Each animal gives

different implementation.

---

# Employee Example

Employee

↓

Developer

↓

Tester

Every employee

works differently.

---

# Payment Example

Payment

↓

UPI

↓

Credit Card

Both perform payment

in different ways.

Excellent interview example.

---

# Restaurant Example

Restaurant

↓

KFC

↓

Pizza Hut

Different implementation

Same concept.

---

# Features

✔ Code Reusability

✔ Runtime Polymorphism

✔ Loose Coupling

✔ Clean Design

---

# Advantages

✔ Security

✔ Maintainability

✔ Better Design

✔ Easy Extension

---

# 3️⃣ Interface

## What is Interface?

Interface is

a blueprint

that contains

only method declarations.

---

Example

```java
interface Car
{
    void start();

    void stop();
}
```

---

Implementation

```java
class FuelCar implements Car
{
    public void start()
    {
        System.out.println("Fuel Engine Started");
    }

    public void stop()
    {
        System.out.println("Fuel Engine Stopped");
    }
}
```

---

# Telugu Understanding

Imagine

Government gives Driving Rules.

Every vehicle

must follow.

Bike

Car

Bus

Truck

Implementation changes.

Rules remain same.

That is Interface.

---

# Why Interface?

To achieve

100% abstraction

and

Multiple Inheritance.

---

# Real-Time Example

Payment Gateway

UPI

Credit Card

Net Banking

Wallet

Every payment

has

pay()

but implementation differs.

---

# Car Example (Your Project)

Car Interface

↓

FuelCar

↓

ElectricCar

Excellent example.

---

# implements Keyword

Abstract Class

↓

extends

Interface

↓

implements

Example

```java
class FuelCar implements Car
{

}
```

---

# Difference

Abstract Class

Uses

extends

Interface

Uses

implements

---

# Can Interface have Variables?

Yes

They are

public static final

by default.

---

# Can Interface have Methods?

Java 8+

✔ abstract

✔ default

✔ static

Java 9+

✔ private methods

---

# Multiple Inheritance

Java

doesn't support

Multiple Inheritance

using classes.

But

supports

using Interfaces.

Example

```
Interface A

Interface B

↓

Class C implements A,B
```

---

# Real-Time Example

Smart Phone

Camera

Music

GPS

Internet

Everything in one device.

Implemented using interfaces.

---

# Interview Questions ⭐⭐⭐⭐⭐

## Q1 What is Encapsulation?

Expected Answer

Encapsulation is wrapping variables and methods into one class while protecting data using private access modifier.

---

## Q2 Why private variables?

Expected Answer

To prevent unauthorized access and provide security.

---

## Q3 Difference between Encapsulation and Abstraction?

Expected Answer

Encapsulation hides data.

Abstraction hides implementation.

---

## Q4 Can we create object of Abstract Class?

Expected Answer

No.

---

## Q5 Why use Abstract Class?

Expected Answer

To provide common functionality while forcing child classes to implement specific methods.

---

## Q6 Can Abstract Class have Constructors?

Expected Answer

Yes.

---

## Q7 Can Abstract Class contain normal methods?

Expected Answer

Yes.

---

## Q8 What is Interface?

Expected Answer

Interface is a blueprint that contains method declarations and achieves abstraction.

---

## Q9 Difference between Abstract Class and Interface?

Expected Answer

Abstract Class:
- Can have constructors
- Can have instance variables
- Uses `extends`

Interface:
- No constructors
- Variables are `public static final`
- Uses `implements`

---

## Q10 Can Interface have Constructor?

Expected Answer

No.

---

## Q11 Can Interface have Objects?

Expected Answer

No.

---

## Q12 Why Interface?

Expected Answer

To achieve abstraction, loose coupling and multiple inheritance.

---

## Q13 Which is faster?

Expected Answer

There is no meaningful performance difference in normal application code. Choose based on design requirements, not speed.

---

## Q14 What is Multiple Inheritance?

Expected Answer

A class implementing multiple interfaces.

Example

```java
class Student implements Sports, Cultural
{

}
```

---

## Q15 Which concept is mostly used in Spring Boot?

Expected Answer

Interfaces are heavily used because they support loose coupling, dependency injection, and flexible design.

---

# Quick Revision

```
Encapsulation
↓

Data Hiding

private

Getter

Setter

-----------------------

Abstraction
↓

Hide Implementation

Abstract Class

Abstract Method

extends

-----------------------

Interface
↓

100% Blueprint

implements

Multiple Inheritance

Loose Coupling
```

---

# Interview Shortcut

```
private
↓

Encapsulation

abstract
↓

Abstraction

interface
↓

Contract / Blueprint

implements
↓

Interface

extends
↓

Inheritance
```

---

# Git Commit

```
feat(day-18): learned encapsulation abstraction interface

✔ Encapsulation
✔ Data Hiding
✔ Getter Setter
✔ Abstract Class
✔ Abstract Methods
✔ Interface
✔ implements
✔ Multiple Inheritance
✔ Real-Time Examples
✔ Interview Questions
```

---

# Today's Achievement 🏆

✅ Understood Encapsulation

✅ Learned Data Hiding

✅ Learned Getter & Setter

✅ Mastered Abstract Classes

✅ Understood Interfaces

✅ Learned `implements`

✅ Understood Multiple Inheritance using Interfaces

✅ Practiced Real-Time Examples (ATM, Bank, Payment, Restaurant, Car)

---

