# 🚀 Java Switch Statement, While Loop & Do-While Loop

## Telugu Friendly Revision Notes for Andhra Students

---

# 📚 Topics Covered

✅ Switch Statement

✅ While Loop

✅ Do-While Loop

✅ Real-Time Examples

✅ Interview Questions

---

# 🎯 Why Loops?

Imagine:

❌ Print 1 to 100 manually

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
...
System.out.println(100);
```

Too much work 😅

Loops help us repeat tasks automatically.

---

# 1️⃣ While Loop

A while loop checks the condition first.

If condition is true → execute block.

If condition is false → stop.

---

# Syntax

```java
while(condition)
{
    statements;
}
```

---

# Flow

```text
Condition Check
      ↓
True ?
      ↓
Execute Block
      ↓
Update Variable
      ↓
Condition Check Again
```

---

# Example 1

```java
int i = 1;

while(i <= 5)
{
    System.out.println(i);
    i++;
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

# How Java Thinks

Initially:

```java
i = 1
```

Check:

```java
1 <= 5
```

True

Print:

```text
1
```

Increase:

```java
i++
```

Now:

```java
i = 2
```

Same process repeats.

---

# Example 2

# Print Even Numbers

```java
int i = 2;

while(i <= 20)
{
    System.out.println(i);
    i = i + 2;
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

Every iteration:

```java
i = i + 2
```

So only even numbers are generated.

---

# Common Mistake

```java
while(i <= 5)
{
    System.out.println(i);
}
```

Forgot:

```java
i++;
```

Result:

```text
Infinite Loop
```

Program never ends.

---

# 2️⃣ Do-While Loop

Very Important Interview Question 🔥

---

# Difference

While:

```java
Check → Execute
```

Do-While:

```java
Execute → Check
```

---

# Syntax

```java
do
{
    statements;
}
while(condition);
```

---

# Important Rule

Do-While executes at least once.

Even if condition is false.

---

# Example

```java
int i = 10;

do
{
    System.out.println(i);
}
while(i < 5);
```

Output

```text
10
```

---

# Why?

Java executes block first.

Then checks:

```java
10 < 5
```

False

Loop stops.

---

# Real Time Example

# Security PIN System

```java
do
{
    System.out.println("Enter PIN");

    pin = sc.nextInt();

}
while(pin != 5566);
```

---

# How Java Thinks

User enters:

```text
8899
```

Check:

```java
8899 != 5566
```

True

Loop continues.

---

User enters:

```text
5566
```

Check:

```java
5566 != 5566
```

False

Loop ends.

---

Output

```text
Access Granted
```

---

# Real Time Example

# Dice Game

```java
do
{
    diceRoll = random.nextInt(6) + 1;

    System.out.println(diceRoll);

}
while(diceRoll != 6);
```

---

# Logic

Possible values:

```text
1
2
3
4
5
6
```

Keep rolling until:

```text
6
```

comes.

---

Example Output

```text
2
4
1
5
6
```

Loop stops.

---

# 3️⃣ Switch Statement

Used when multiple choices exist.

Instead of many if-else statements.

---

# Syntax

```java
switch(variable)
{
    case value1:
        statements;
        break;

    case value2:
        statements;
        break;

    default:
        statements;
}
```

---

# Day Finder Program

```java
switch(day)
{
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

---

# Example

Input

```text
3
```

Output

```text
Wednesday
```

---

# How Java Thinks

Check:

```java
day == 1
```

False

Check:

```java
day == 2
```

False

Check:

```java
day == 3
```

True

Execute:

```java
Wednesday
```

Break.

Stop.

---

# Importance Of Break

Without break:

```java
case 1:
    System.out.println("Monday");

case 2:
    System.out.println("Tuesday");
```

Input:

```text
1
```

Output:

```text
Monday
Tuesday
```

This is called:

```text
Fall Through
```

---

# Example

# Even Odd Using Switch

```java
switch(num % 2)
{
    case 0:
        System.out.println("Even");
        break;

    case 1:
        System.out.println("Odd");
        break;
}
```

---

# Input

```text
20
```

Calculation

```java
20 % 2
```

Result

```java
0
```

Case:

```java
case 0
```

Output

```text
Even
```

---

# When To Use?

| Situation             | Best Choice |
| --------------------- | ----------- |
| Single Condition      | if          |
| Two Conditions        | if-else     |
| Multiple Conditions   | else-if     |
| Fixed Choices         | switch      |
| Repeat Work           | while       |
| Execute At Least Once | do-while    |

---

# Interview Questions 🔥

## Q1

Difference between while and do-while?

Answer:

```text
while:
Condition First

do-while:
Execution First
```

---

## Q2

How many times does do-while execute minimum?

Answer:

```text
One Time
```

---

## Q3

What causes Infinite Loop?

Answer:

Forgetting update statement.

Example:

```java
while(i < 10)
{
}
```

---

## Q4

Why use break in switch?

Answer:

To stop execution of remaining cases.

---

## Q5

What is Fall Through?

Answer:

Executing multiple cases because break is missing.

---

## Q6

Can switch work with String?

Answer:

```java
Yes
```

Example:

```java
switch(dayName)
{
    case "MONDAY":
}
```

---

# Quick Revision

## While Loop

```text
Check → Execute
```

---

## Do While Loop

```text
Execute → Check
```

---

## Switch Statement

```text
Choose One Option
```

---

# Git Commit Summary

### Concepts Practiced

✅ While Loop

✅ Printing Numbers

✅ Even Numbers

✅ Infinite Loop Concept

✅ Do-While Loop

✅ Dice Simulation

✅ Security PIN Validation

✅ Switch Statement

✅ Day Finder

✅ Even Odd Using Switch

---

# 🎯 Next Topic

After Switch & Loops:

1. For Loop
2. Nested Loops
3. Pattern Programs
4. Break Statement
5. Continue Statement

These are the most important topics for Java interviews and coding rounds.

Happy Coding 🚀
