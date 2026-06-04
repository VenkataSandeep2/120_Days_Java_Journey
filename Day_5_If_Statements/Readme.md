# 🚀 Java Decision Making Statements

## If, If-Else, Else-If Ladder

### Telugu Friendly Revision Notes

---

# 📌 Topic Overview

In real-world applications, programs need to make decisions.

Examples:

* Can user vote?
* Is number even or odd?
* What grade did student get?
* Is customer eligible for loan?

For these situations Java uses:

1. if Statement
2. if-else Statement
3. else-if Ladder

---

# 1️⃣ If Statement

Used when code should execute only when condition is true.

---

## Syntax

```java
if(condition)
{
    statements;
}
```

---

## Example

```java
if(10 > 5)
{
    System.out.println("10 is big");
}
```

### Output

```text
10 is big
```

---

## How Java Thinks

```java
10 > 5
```

Result:

```java
true
```

Since condition is true,

Java enters the block.

---

## Example

```java
if(10 < 5)
{
    System.out.println("10 is big");
}
```

Output:

```text
No Output
```

Why?

```java
10 < 5
```

Result:

```java
false
```

Java skips the block.

---

# Your Example Review

```java
if(10 > 4)
{
    System.out.println("10 is big");
}
```

Condition:

```java
10 > 4
```

Result:

```java
true
```

Output:

```text
10 is big
```

---

```java
if(10 >= 10)
{
    System.out.println("true");
}
```

Condition:

```java
10 >= 10
```

Result:

```java
true
```

Output:

```text
true
```

---

```java
if(20 != 20)
{
    System.out.println("true");
}
```

Condition:

```java
20 != 20
```

Result:

```java
false
```

Output:

```text
Nothing
```

---

# Voting Example

```java
int age = 20;

if(age > 18)
{
    System.out.println("Eligible for vote");
}
```

Output:

```text
Eligible for vote
```

---

# Important Point

```java
if(age < 18)
{
}
```

and

```java
if(age > 18)
{
}
```

Both are independent if blocks.

Java checks each block separately.

---

# 2️⃣ If-Else Statement

Used when there are exactly two possibilities.

---

## Syntax

```java
if(condition)
{
}
else
{
}
```

---

# Even Odd Program

```java
if(num % 2 == 0)
{
    System.out.println("Even");
}
else
{
    System.out.println("Odd");
}
```

---

## Example

Input:

```text
20
```

Calculation:

```java
20 % 2
```

Result:

```java
0
```

Condition:

```java
0 == 0
```

Result:

```java
true
```

Output:

```text
20 Even Number
```

---

## Example

Input:

```text
15
```

Calculation:

```java
15 % 2
```

Result:

```java
1
```

Condition:

```java
1 == 0
```

Result:

```java
false
```

Output:

```text
15 Odd Number
```

---

# Real Life Example

```java
int age = 15;

if(age >= 18)
{
    System.out.println("Vote");
}
else
{
    System.out.println("Cannot Vote");
}
```

Output:

```text
Cannot Vote
```

---

# 3️⃣ Else-If Ladder

Used when there are multiple conditions.

---

## Syntax

```java
if(condition1)
{
}
else if(condition2)
{
}
else if(condition3)
{
}
else
{
}
```

---

# Student Grade Example

```java
int score = 85;
```

---

## Step 1

```java
if(score >= 90)
```

```java
85 >= 90
```

Result:

```java
false
```

Move to next condition.

---

## Step 2

```java
else if(score >= 80)
```

```java
85 >= 80
```

Result:

```java
true
```

Output:

```text
85 Grade: B
```

Java stops checking remaining conditions.

---

# Age Category Program

```java
if(age < 18)
{
    System.out.println("Child");
}
else if(age <= 25)
{
    System.out.println("Adult");
}
else if(age <= 35)
{
    System.out.println("Young");
}
else
{
    System.out.println("Senior Citizen");
}
```

---

## Example Input

```text
22
```

Checking:

```java
22 < 18
```

False

---

Checking:

```java
22 <= 25
```

True

Output:

```text
Adult age 22
```

Java stops here.

---

# Important Interview Concept

Only ONE block executes in an else-if ladder.

---

Example

```java
int score = 95;
```

Even though:

```java
95 >= 80
```

True

and

```java
95 >= 70
```

True

Java executes only:

```java
95 >= 90
```

because it appears first.

Output:

```text
Grade A
```

---

# Real World Use Cases

### Banking

```java
if(balance > 0)
```

---

### Login

```java
if(passwordCorrect)
```

---

### E-Commerce

```java
if(productAvailable)
```

---

### Voting System

```java
if(age >= 18)
```

---

### Student Management

```java
if(score >= 90)
```

---

# Interview Questions

## Q1

What is an if statement?

Answer:

Executes code only when condition is true.

---

## Q2

What happens if condition is false?

Answer:

Java skips the block.

---

## Q3

Can we write if without else?

Answer:

Yes.

---

## Q4

Difference between if and if-else?

Answer:

if:

```java
One possibility
```

if-else:

```java
Two possibilities
```

---

## Q5

Difference between if-else and else-if ladder?

Answer:

if-else:

```java
Two outcomes
```

else-if ladder:

```java
Multiple outcomes
```

---

## Q6

How many blocks execute in else-if ladder?

Answer:

Only one block.

---

# Git Commit Revision

### Concepts Practiced

✅ if Statement

✅ Multiple if Statements

✅ if-else Statement

✅ Even Odd Program

✅ Voting Eligibility Program

✅ else-if Ladder

✅ Student Grade Program

✅ Age Classification Program

---

# Quick Revision

```text
if
↓
Single Condition

if-else
↓
Two Choices

else-if
↓
Multiple Choices
```

---

# 🎯 Next Topic

After Decision Making Statements:

1. Switch Statement
2. For Loop
3. While Loop
4. Do While Loop
5. Nested Loops

These form the complete control flow section in Core Java.

Happy Coding 🚀

