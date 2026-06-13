# 🚀 Java Full Stack Journey - Day 9 Revision

# METHODS IN JAVA

---

# 📚 Topics Covered

✅ What is a Method?

✅ Why Methods are Used?

✅ Method Without Parameters & Without Return Type

✅ Method With Parameters & Without Return Type

✅ Real-Time Examples

---

# What is a Method?

A method is a block of code that performs a specific task.

Instead of writing the same code again and again, we write it once inside a method and call it whenever needed.

---

# Telugu Understanding 😄

Imagine your mother.

You say:

```text
"Amma, coffee prepare cheyyi."
```

She already knows the steps.

You don't explain every time.

The process is stored.

That process is like a **Method**.

---

# Why Methods?

Without Methods:

```java
System.out.println(10 + 20);
System.out.println(10 + 20);
System.out.println(10 + 20);
```

Repeated code ❌

---

With Methods:

```java
sum();
sum();
sum();
```

Reusable code ✅

---

# Benefits of Methods

✅ Code Reusability

✅ Reduces Duplicate Code

✅ Easy Maintenance

✅ Improves Readability

---

# Method Syntax

```java
access_modifier returnType methodName(parameters)
{
    // statements
}
```

Example:

```java
public void sum()
{
    System.out.println("Hello");
}
```

---

# Type 1

# Method Without Parameters and Without Return Type

```java
class Test
{
    public void sum()
    {
        int a = 10;
        int b = 20;

        System.out.println(a + b);
    }
}
```

---

# Calling Method

```java
Test t = new Test();

t.sum();
```

---

# Output

```text
30
```

---

# How Java Thinks

```text
Object Created
      ↓
Method Called
      ↓
sum() Executes
      ↓
Output Printed
```

---

# Telugu Understanding 😄

```text
Amma, tea prepare cheyyi.
```

No ingredients given.

Nothing returned.

Only work is done.

---

# Type 2

# Method With Parameters and Without Return Type

```java
public void sum(int a, int b)
{
    System.out.println(a + b);
}
```

---

# Method Call

```java
sum(10, 20);

sum(50, 60);
```

---

# Output

```text
30

110
```

---

# Telugu Understanding 😄

```text
Amma, 2 spoons sugar veyyi.
```

You are giving inputs.

Method performs work.

Nothing is returned.

---

# Example 1

# Greeting Method

```java
public void greet()
{
    System.out.println("Good Morning");
}
```

Call:

```java
greet();
```

Output:

```text
Good Morning
```

---

# Real-Time Example 1

# Restaurant Order

```java
public void orderTea()
{
    System.out.println("Tea Prepared");
}
```

Call:

```java
orderTea();
```

Output:

```text
Tea Prepared
```

---

# Real-Time Example 2

# Mobile Recharge

```java
public void recharge(int amount)
{
    System.out.println("Recharge Successful : " + amount);
}
```

Call:

```java
recharge(299);

recharge(499);
```

Output:

```text
Recharge Successful : 299

Recharge Successful : 499
```

---

# Real-Time Example 3

# ATM Withdrawal

```java
public void withdraw(int amount)
{
    System.out.println("Withdrawn Amount : " + amount);
}
```

Call:

```java
withdraw(1000);

withdraw(5000);
```

---

# Real-Time Example 4

# Student Attendance

```java
public void markAttendance(String name)
{
    System.out.println(name + " Present");
}
```

Call:

```java
markAttendance("Sandeep");

markAttendance("Ravi");
```

Output:

```text
Sandeep Present

Ravi Present
```

---

# Real-Time Example 5

# Voting Eligibility

```java
public void checkVote(int age)
{
    if(age >= 18)
    {
        System.out.println("Eligible");
    }
    else
    {
        System.out.println("Not Eligible");
    }
}
```

Call:

```java
checkVote(20);

checkVote(15);
```

Output:

```text
Eligible

Not Eligible
```

---

# Method Execution Flow

```text
main()
   ↓
Object Creation
   ↓
Method Call
   ↓
Method Executes
   ↓
Control Returns to main()
```

---

# Common Mistakes ❌

## Defining Method Inside main()

Wrong:

```java
public static void main(String args[])
{
    public void sum()
    {

    }
}
```

---

Methods cannot be defined inside another method.

---

## Forgetting Object Creation

Wrong:

```java
sum();
```

---

Correct:

```java
Test t = new Test();

t.sum();
```

---

# Interview Questions 🔥

## What is a Method?

A block of code used to perform a specific task.

---

## Why are Methods Used?

To reuse code.

---

## Can a Method Call Another Method?

Yes.

---

## Can We Create a Method Inside Another Method?

No.

---

## Why Do We Create Objects?

To access non-static methods.

---

## Difference Between Parameters and Arguments?

Parameters:

```java
sum(int a, int b)
```

Arguments:

```java
sum(10, 20)
```

---

# Quick Revision

```text
Method
↓
Performs a Task

No Parameters
↓
No Inputs

Parameters
↓
Inputs Given

Void
↓
Nothing Returned
```

---

# Git Commit Summary

```text
feat(day-9): learned methods in java

✓ Method Introduction
✓ Method Syntax
✓ Without Parameters & Without Return Type
✓ With Parameters & Without Return Type
✓ Greeting Program
✓ Voting Eligibility Program
✓ Real-Time Examples
✓ Parameters vs Arguments
✓ Interview Questions
```

---

# Today's Achievement 🏆

✅ Understood Why Methods Are Needed

✅ Learned Method Declaration

✅ Learned Method Calling

✅ Practiced Using Objects

✅ Connected Methods with Real-Life Scenarios

---

# Next Topic

➡️ Methods with Return Type

1. Without Parameters & With Return Type

2. With Parameters & With Return Type

3. Method Overloading

4. Static Methods

---

```text
"Method ardham ayithe coding easy avuthundi."

"Write once... Call many times."
```

### Happy Coding 🚀
