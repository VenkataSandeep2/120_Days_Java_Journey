# 🚀 Java For Loop

## Complete Beginner to Intermediate Guide

### Telugu Friendly Notes for Andhra Students

---

# 📚 Topic Overview

Loops are used when we want to execute a block of code multiple times.

Before loops:

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

Imagine printing 1 to 1000 manually 😱

Loops solve this problem.

---

# Why For Loop?

The **for loop** is used when we already know:

✅ Starting value

✅ Ending value

✅ Increment/Decrement

---

# Syntax

```java
for(initialization; condition; update)
{
    statements;
}
```

---

# Structure Breakdown

```java
for(int i=1; i<=5; i++)
{
    System.out.println(i);
}
```

---

## Initialization

```java
int i = 1;
```

Starting point.

Java creates variable `i`.

---

## Condition

```java
i <= 5
```

As long as condition is true,

loop continues.

---

## Update

```java
i++
```

Increase value after every iteration.

---

# How Java Executes

```java
for(int i=1; i<=3; i++)
{
    System.out.println(i);
}
```

---

### Iteration 1

```java
i = 1
```

Check:

```java
1 <= 3
```

True

Print:

```java
1
```

Update:

```java
i = 2
```

---

### Iteration 2

Check:

```java
2 <= 3
```

True

Print:

```java
2
```

Update:

```java
i = 3
```

---

### Iteration 3

Check:

```java
3 <= 3
```

True

Print:

```java
3
```

Update:

```java
i = 4
```

---

### Iteration 4

Check:

```java
4 <= 3
```

False

Loop Stops.

---

# Program 1

# Print Numbers 1 to 5

```java
class PrintNumbers
{
    public static void main(String args[])
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println(i);
        }
    }
}
```

Output

```text
1
2
3
4
5
```

---

# Program 2

# Print Numbers 1 to 10

```java
for(int i=1; i<=10; i++)
{
    System.out.println(i);
}
```

Output

```text
1
2
3
4
5
6
7
8
9
10
```

---

# Program 3

# Print Even Numbers

```java
for(int i=2; i<=20; i=i+2)
{
    System.out.println(i);
}
```

Output

```text
2
4
6
8
10
12
14
16
18
20
```

---

# Logic

Start:

```java
i = 2
```

Update:

```java
i = i + 2
```

Only even numbers are generated.

---

# Program 4

# Print Odd Numbers

```java
for(int i=1; i<=20; i=i+2)
{
    System.out.println(i);
}
```

Output

```text
1
3
5
7
9
11
13
15
17
19
```

---

# Program 5

# Reverse Numbers

```java
for(int i=10; i>=1; i--)
{
    System.out.println(i);
}
```

Output

```text
10
9
8
7
6
5
4
3
2
1
```

---

# Logic

Initialization:

```java
i = 10
```

Condition:

```java
i >= 1
```

Update:

```java
i--
```

---

# Program 6

# Multiplication Table

```java
int num = 5;

for(int i=1; i<=10; i++)
{
    System.out.println(num + " x " + i +
                       " = " + (num*i));
}
```

Output

```text
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
```

---

# Program 7

# Sum of Numbers

```java
int sum = 0;

for(int i=1; i<=5; i++)
{
    sum = sum + i;
}

System.out.println(sum);
```

---

# Dry Run

```java
sum = 0
```

Iteration 1

```java
sum = 0 + 1
```

sum = 1

---

Iteration 2

```java
sum = 1 + 2
```

sum = 3

---

Iteration 3

```java
sum = 3 + 3
```

sum = 6

---

Iteration 4

```java
sum = 6 + 4
```

sum = 10

---

Iteration 5

```java
sum = 10 + 5
```

sum = 15

Output

```text
15
```

---

# Program 8

# Factorial Program

```java
int fact = 1;

for(int i=1; i<=5; i++)
{
    fact = fact * i;
}

System.out.println(fact);
```

Output

```text
120
```

Because

```java
1 × 2 × 3 × 4 × 5
```

=

```java
120
```

---

# Infinite For Loop

```java
for(;;)
{
    System.out.println("Hello");
}
```

---

# Why?

No condition.

Always true.

Runs forever.

---

# Interview Questions 🔥

## Q1

What are the three parts of a for loop?

Answer:

```java
Initialization
Condition
Update
```

---

## Q2

When should we use for loop?

Answer:

When the number of iterations is known.

---

## Q3

Can initialization be skipped?

Example:

```java
int i = 1;

for(; i<=5; i++)
{
}
```

Answer:

Yes.

---

## Q4

Can update be skipped?

Example:

```java
for(int i=1; i<=5;)
{
    i++;
}
```

Answer:

Yes.

---

## Q5

Can condition be skipped?

Example:

```java
for(;;)
{
}
```

Answer:

Yes.

Creates infinite loop.

---

## Q6

Difference Between While and For?

### While Loop

```java
while(condition)
{
}
```

Used when number of iterations is unknown.

Example:

PIN Validation

Password Checking

Login Systems

---

### For Loop

```java
for(start; condition; update)
{
}
```

Used when number of iterations is known.

Example:

Print 1-100

Tables

Array Traversal

---

# Real Life Examples

### ATM

```java
3 Attempts
```

Use:

```java
for loop
```

---

### Attendance

```java
50 Students
```

Use:

```java
for loop
```

---

### Multiplication Tables

```java
1 to 10
```

Use:

```java
for loop
```

---

### Exam Marks

```java
6 Subjects
```

Use:

```java
for loop
```

---

# Common Mistakes

❌ Missing update

```java
for(int i=1; i<=5;)
{
}
```

Infinite Loop

---

❌ Wrong condition

```java
for(int i=10; i<=1; i++)
{
}
```

No Output

---

# Quick Revision

```text
for(initialization;
    condition;
    update)
{
    statements;
}
```

---

Initialization → Start

Condition → Check

Update → Change

Repeat Until Condition Becomes False

---

# Git Commit Summary

✅ Introduction to For Loop

✅ Syntax

✅ Execution Flow

✅ Print Numbers

✅ Even Numbers

✅ Odd Numbers

✅ Reverse Numbers

✅ Multiplication Table

✅ Sum of Numbers

✅ Factorial Program

✅ Infinite Loop

✅ Interview Questions

---

# 🎯 Next Topic

After For Loop:

1. Nested For Loop
2. Star Pattern Programs
3. Number Pattern Programs
4. Break Statement
5. Continue Statement

These are very important for coding rounds and Java interviews.

Happy Coding 🚀
