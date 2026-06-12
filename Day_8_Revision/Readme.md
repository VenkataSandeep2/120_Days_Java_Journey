
# 🚀 Java Full Stack Journey - Day 8 Revision

## 📅 Day 8 Topics Covered

* ✅ Even or Odd Program using `if-else`
* ✅ Fibonacci Series using `for` loop
* ✅ Star Pattern Programs using Nested `for` loops
* ✅ Number Pattern Programs

---

# 1️⃣ Even or Odd Program

### Problem Statement

Check whether the entered number is Even or Odd.

---

## Logic

```text
If number % 2 == 0
       ↓
Even Number
Else
       ↓
Odd Number
```

---

## Code

```java
import java.util.*;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println(num + " is even number");
        }
        else
        {
            System.out.println(num + " is odd number");
        }
    }
}
```

---

## Example

Input:

```text
12
```

Output:

```text
12 is even number
```

---

### Telugu Understanding 😄

```text
Remainder 0 vaste Even Number.

Remainder 1 vaste Odd Number.
```

Example:

```text
10 % 2 = 0 → Even

11 % 2 = 1 → Odd
```

---

# 2️⃣ Fibonacci Series

## What is Fibonacci?

Each number is the sum of previous two numbers.

```text
0 1 1 2 3 5 8 13 21 34 ...
```

---

## Logic

```text
a = 0
b = 1

c = a + b

a = b
b = c
```

Repeat.

---

## Code

```java
int num = 7;

int a = 0;
int b = 1;

for(int i=1; i<=num; i++)
{
    System.out.print(a + " ");

    int c = a + b;

    a = b;

    b = c;
}
```

---

## Dry Run

| Iteration | a | b  | Output |
| --------- | - | -- | ------ |
| 1         | 0 | 1  | 0      |
| 2         | 1 | 1  | 1      |
| 3         | 1 | 2  | 1      |
| 4         | 2 | 3  | 2      |
| 5         | 3 | 5  | 3      |
| 6         | 5 | 8  | 5      |
| 7         | 8 | 13 | 8      |

---

## Output

```text
0 1 1 2 3 5 8
```

---

### Telugu Understanding 😄

```text
Anna, previous rendu numbers ni add chesthu
next number vastundi.

0 + 1 = 1

1 + 1 = 2

1 + 2 = 3

2 + 3 = 5
```

---

# 3️⃣ Pattern Programs

---

# Pattern 1

```java
for(int i=1; i<=5; i++)
{
    System.out.println("*");
}
```

Output

```text
*
*
*
*
*
```

---

# Pattern 2

```java
for(int i=1; i<=5; i++)
{
    System.out.print("* ");
}
```

Output

```text
* * * * *
```

---

# Pattern 3

```java
for(int i=1; i<=5; i++)
{
    for(int j=1; j<=5; j++)
    {
        System.out.print("* ");
    }

    System.out.println();
}
```

Output

```text
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

---

# Pattern 4

```java
for(int i=1; i<=5; i++)
{
    for(int j=1; j<=i; j++)
    {
        System.out.print("* ");
    }

    System.out.println();
}
```

Output

```text
*
* *
* * *
* * * *
* * * * *
```

---

## Logic

```text
Row 1 → 1 Star

Row 2 → 2 Stars

Row 3 → 3 Stars
```

---

# Pattern 5

```java
for(int i=1; i<=5; i++)
{
    for(int j=5; j>=i; j--)
    {
        System.out.print("* ");
    }

    System.out.println();
}
```

Output

```text
* * * * *
* * * *
* * *
* *
*
```

---

## Logic

```text
Every row lo one star thaggutundi.
```

---

# Pattern 6

```java
for(int i=1; i<=5; i++)
{
    for(int j=1; j<=i; j++)
    {
        System.out.print(j + " ");
    }

    System.out.println();
}
```

Output

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

---

### Telugu Understanding 😄

```text
Outer Loop → Rows

Inner Loop → Columns
```

---

# Pattern Formula

```text
Outer Loop = Number of Rows

Inner Loop = What to Print
```

---

# Interview Questions 🔥

### Q1. How do you check Even or Odd?

```java
num % 2 == 0
```

---

### Q2. What is Fibonacci Series?

```text
Series where each number is the sum of previous two numbers.
```

---

### Q3. Which loop is mostly used for Patterns?

```text
Nested For Loop
```

---

### Q4. What is Nested Loop?

```text
Loop inside another loop.
```

Example:

```java
for(...)
{
    for(...)
    {
    }
}
```

---

### Q5. Which loop controls rows?

```text
Outer Loop
```

---

### Q6. Which loop controls columns?

```text
Inner Loop
```

---

# Common Mistakes ❌

### Fibonacci

```java
a = b;
b = a + b;
```

Wrong order.

---

### Patterns

Missing:

```java
System.out.println();
```

Entire pattern prints in one line.

---

### Even Odd

```java
num / 2 == 0
```

Wrong.

Use:

```java
num % 2 == 0
```

---

# Git Commit Summary

```text
feat(day-8): practiced logical programs and patterns

✓ Even Odd Program
✓ Fibonacci Series
✓ Nested For Loop
✓ Star Patterns
✓ Number Patterns
✓ Pattern Logic Understanding
✓ Dry Run Practice
```

---

# Quick Revision

```text
Even Number
→ num % 2 == 0

Odd Number
→ num % 2 != 0

Fibonacci
→ c = a + b

Patterns
→ Outer Loop = Rows

→ Inner Loop = Columns
```

---

# Day 8 Achievement 🏆

✅ Condition Checking

✅ Loop Practice

✅ Nested Loop Understanding

✅ Problem Solving

✅ Pattern Building Skills

---

# Next Topic

➡️ Methods in Java

* Method Declaration
* Method Calling
* Parameters
* Return Type
* Types of Methods

---

## Keep Practicing 🚀

```text
"Logic osthe coding easy avuthundi."

"Patterns ardham ayithe loops complete ayinatte."
```

### Happy Coding ❤️
