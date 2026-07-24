
# 🎯 Java Interview Preparation - Method Overloading & Method Overriding

---

# ⭐ Most Frequently Asked Interview Question

## Q1. What is Method Overloading?

### Interview Answer (Expected)

Method Overloading is a feature of Java where multiple methods in the **same class** have the **same name** but **different parameters**.

The compiler decides which method to call based on the arguments passed.

Therefore, Method Overloading is known as **Compile Time Polymorphism** or **Static Binding**.

---

## Simple Definition

> Same Method Name + Different Parameters = Method Overloading

---

## Formula

```text
Method Name  ✅ Same

Parameters   ❌ Different
```

---

# Example 1 (Calculator)

```java
class Calculator
{
    void add(int a,int b){ }

    void add(double a,double b){ }

    void add(int a,int b,int c){ }
}
```

Compiler decides which method to execute.

---

# Example 2 (Login System)

```java
login(String email)

login(String email,String password)

login(long mobileNumber)
```

Same method

Different inputs

Different execution.

---

# Example 3 (Food Order)

```java
order()

order(String food)

order(String food,int quantity)
```

---

# Real-Time Example

Think about Swiggy.

You can order

- One Item
- Two Items
- Family Pack

Same Order Button

Different Inputs

This is Method Overloading.

---

# Why is Method Overloading Needed?

✅ Improves Readability

✅ Code Reusability

✅ Easy Maintenance

✅ One Method Name

---

# Rules of Method Overloading

✔ Same Method Name

✔ Different Number of Parameters

✔ Different Data Types

✔ Different Parameter Order

✔ Return Type Alone Cannot Overload

---

# Interview Question

## Can we overload constructors?

✅ Yes

Example

```java
Student()

Student(int id)

Student(String name)
```

---

## Can we overload static methods?

✅ Yes

---

## Can we overload private methods?

✅ Yes

---

## Can we overload main()?

✅ Yes

```java
public static void main(){}

public static void main(String name){}

public static void main(int a){}
```

JVM only calls

```java
public static void main(String[] args)
```

---

## Can return type alone overload a method?

❌ No

Wrong

```java
int add(int a,int b)

double add(int a,int b)
```

Compiler Error.

---

# ⭐ Most Frequently Asked Interview Question

## Q2. What is Method Overriding?

### Interview Answer (Expected)

Method Overriding is a feature where a child class provides its own implementation of a method already defined in the parent class.

Both methods must have the **same method name** and **same parameters**.

The JVM decides which method to execute during runtime.

Therefore Method Overriding is called **Runtime Polymorphism** or **Dynamic Binding**.

---

## Simple Definition

> Child Class changes the behavior of Parent Class Method.

---

# Formula

```text
Method Name     ✅ Same

Parameters      ✅ Same

Implementation  ❌ Different
```

---

# Example (Shape)

```java
class Shape
{
    void draw()
    {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}
```

---

Object

```java
Shape s = new Circle();

s.draw();
```

Output

```text
Drawing Circle
```

JVM decides at Runtime.

---

# Example (Employee)

Parent

```java
Employee
```

Child

```java
Developer
```

Both have

```java
work()
```

Developer changes implementation.

---

# Example (Mobile)

Parent

```java
Mobile
```

Child

```java
SmartPhone
```

Method

```java
features()
```

Different implementation.

---

# Example (TV Remote)

Parent

```java
Remote
```

Child

```java
SmartRemote
```

Method

```java
changeChannel()
```

Different behavior.

---

# Why is Method Overriding Needed?

Every child object behaves differently.

Example

Payment

```
Payment

↓

UPI

↓

Credit Card

↓

Cash
```

Every payment has

```java
pay()
```

Different implementation.

---

# Rules of Method Overriding

✔ Inheritance Required

✔ Same Method Name

✔ Same Parameters

✔ Same Return Type (or Covariant)

✔ Access Modifier Cannot Be More Restrictive

✔ @Override Recommended

---

# Interview Questions

## Can constructors be overridden?

❌ No

Reason

Constructors are not inherited.

---

## Can private methods be overridden?

❌ No

Private methods are not inherited.

---

## Can final methods be overridden?

❌ No

---

## Can static methods be overridden?

❌ No

Static methods are hidden, not overridden.

---

## What is Upcasting?

```java
Shape s = new Circle();
```

Reference Variable

```
Shape
```

Object

```
Circle
```

Called

```
Upcasting
```

---

## What is Dynamic Method Dispatch?

The JVM decides which overridden method should execute based on the object created during runtime.

Example

```java
Shape s = new Circle();

s.draw();
```

Although the reference is Shape,

JVM executes

```java
Circle.draw()
```

---

# ⭐ Difference Between Overloading and Overriding

| Method Overloading | Method Overriding |
|--------------------|-------------------|
| Same Class | Parent & Child Class |
| Compile Time | Runtime |
| Static Binding | Dynamic Binding |
| Different Parameters | Same Parameters |
| No Inheritance | Inheritance Required |
| Improves Readability | Supports Runtime Polymorphism |

---

# ⭐ One-Line Interview Answers

### What is Method Overloading?

> Same method name with different parameters in the same class. It is Compile Time Polymorphism.

---

### What is Method Overriding?

> Child class provides its own implementation of the parent method. It is Runtime Polymorphism.

---

### Which is Faster?

✅ Method Overloading

Compiler decides.

---

### Which is More Powerful?

✅ Method Overriding

Supports Dynamic Method Dispatch.

---

### Which is Used More in Spring Boot?

✅ Method Overriding

Because frameworks rely heavily on Runtime Polymorphism.

---

# ⭐ Where Companies Use It

✔ Spring Boot

✔ Hibernate

✔ JDBC

✔ REST APIs

✔ Payment Gateway

✔ Notification Service

✔ Banking Software

✔ Food Delivery Apps

✔ E-Commerce Applications

---

# ⭐ Quick Revision

```
Method Overloading

↓

Same Method

Different Parameters

↓

Compile Time

↓

Compiler Decides

-----------------------------------

Method Overriding

↓

Same Method

Same Parameters

↓

Runtime

↓

JVM Decides
```

---

# 🏆 Interview Tip

If the interviewer asks:

> **"Explain Polymorphism with a real-time example."**

Answer like this:

> "A Payment Gateway is the best example. Every payment mode (UPI, Credit Card, Net Banking, Cash) has the same method `pay()`, but each implements it differently. This is Runtime Polymorphism using Method Overriding. Similarly, a Calculator with multiple `add()` methods is an example of Compile Time Polymorphism using Method Overloading."

This type of answer is concise, practical, and demonstrates both conceptual understanding and real-world application.
