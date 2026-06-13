# 🚀 Java Full Stack Journey - Day 10 Revision

# TYPE CASTING IN JAVA

---

# 📚 Topics Covered

✅ What is Type Casting?

✅ Why Type Casting is Needed?

✅ Advantages of Type Casting

✅ Features of Type Casting

✅ Implicit Type Casting (Widening)

✅ Explicit Type Casting (Narrowing)

✅ Real-Time Examples

✅ Common Mistakes

✅ Interview Questions

✅ Introduction to Arrays

---

# What is Type Casting?

Type Casting means **converting one data type into another data type**.

Java performs this conversion either automatically or manually.

---

# Telugu Understanding 😄

Imagine:

```text
Small Glass → Big Bucket
```

Water can be transferred easily.

This is **Implicit Type Casting**.

---

```text
Big Bucket → Small Glass
```

Some water may overflow.

Need careful transfer.

This is **Explicit Type Casting**.

---

# Why Type Casting?

Different data types have different sizes.

Sometimes we need conversion to:

* Store values.
* Perform calculations.
* Read user input.
* Process data efficiently.

---

# Advantages of Type Casting

✅ Better Memory Utilization

✅ Data Conversion Flexibility

✅ Useful in Mathematical Operations

✅ Allows Interoperability between Data Types

✅ Required in Real-Time Applications

---

# Features of Type Casting

```text
Automatic Conversion  → Implicit Casting

Manual Conversion     → Explicit Casting

Possible Data Loss    → Explicit Casting

No Data Loss          → Implicit Casting
```

---

# Primitive Type Promotion Order

```text
byte
 ↓
short
 ↓
int
 ↓
long
 ↓
float
 ↓
double
```

---

# Type 1

# Implicit Type Casting (Widening)

Java automatically converts smaller data types into larger data types.

---

# Example 1

```java
byte b = 120;

short s = b;

int i = s;

long l = s;

float f = l;

double d = f;

System.out.println(b);

System.out.println(i);

System.out.println(s);

System.out.println(l);

System.out.println(f);

System.out.println(d);
```

---

# Output

```text
120

120

120

120

120.0

120.0
```

---

# Dry Run

```text
byte → short → int → long → float → double
```

Java performs conversion automatically.

---

# Telugu Understanding 😄

```text
Chinna dabba ni pedda dabba lo pettadam easy.
```

No information loss.

---

# Example 2

```java
char ch = 'A';

int i = ch;

System.out.println(ch);

System.out.println(i);
```

---

# Output

```text
A

65
```

---

# Explanation

Java stores characters using Unicode values.

```text
A → 65
B → 66
C → 67
```

---

# Example 3

```java
int i = 102;

char ch = i;
```

---

# Compilation Error ❌

```text
Type mismatch:
cannot convert from int to char
```

---

# Why?

```text
char range → 0 to 65535

int range → very large.
```

Java cannot guarantee safety.

---

# Example 4

```java
Scanner sc = new Scanner(System.in);

System.out.println("Enter Integer:");

int num = sc.nextInt();

double d = num;

System.out.println(num);

System.out.println(d);
```

---

# Output

Input:

```text
50
```

Output:

```text
50

50.0
```

---

# Type 2

# Explicit Type Casting (Narrowing)

Converting larger data types into smaller data types manually.

---

# Syntax

```java
datatype variable = (datatype) value;
```

---

# Example 1

```java
short s = 127;

byte b = (byte)s;

System.out.println(b);

b++;

System.out.println(b);

++b;

System.out.println(b);
```

---

# Output

```text
127

-128

-127
```

---

# Explanation

Byte Range:

```text
-128 to 127
```

When exceeded:

```text
127 + 1 = -128
```

Cycle repeats.

---

# Telugu Understanding 😄

```text
Clock lo 12 tarvatha malli 1 vachinattu.
```

---

# Example 2

```java
double d = 2569.524;

int num = (int)d;

System.out.println(d);

System.out.println(num);
```

---

# Output

```text
2569.524

2569
```

---

# Explanation

Decimal part is removed.

---

# Example 3

```java
int num1 = 606;

char ch = (char)num1;

System.out.println(num1);

System.out.println(ch);
```

---

# Output

```text
606

ɞ
```

Unicode character will be printed.

---

# Example 4

```java
long l = 50000L;

int num = (int)l;

System.out.println(num);
```

---

# Output

```text
50000
```

---

# Example 5

```java
int i = 132;

byte b = (byte)i;

System.out.println(i);

System.out.println(b);
```

---

# Output

```text
132

-124
```

---

# Why?

Byte Range:

```text
-128 to 127
```

132 exceeds range.

---

# Common Mistakes ❌

---

## Mistake 1

```java
int i = 102;

char ch = i;
```

Wrong.

---

Correct:

```java
char ch = (char)i;
```

---

## Mistake 2

Assuming Explicit Casting preserves all values.

Wrong.

Data loss may occur.

---

## Mistake 3

Ignoring Data Type Ranges.

Always remember:

```text
byte → -128 to 127
```

---

# Interview Questions 🔥

---

## What is Type Casting?

Converting one data type into another.

---

## Types of Type Casting?

```text
1. Implicit Casting

2. Explicit Casting
```

---

## Which Casting is Automatic?

```text
Implicit Casting
```

---

## Which Casting may cause Data Loss?

```text
Explicit Casting
```

---

## Why does byte overflow?

Because its range is:

```text
-128 to 127
```

---

## What is Unicode value of 'A'?

```text
65
```

---

# Introduction to Arrays

Before Arrays:

Suppose a student has 3 subjects.

Without Arrays:

```java
public class Test
{
    public static void main(String args[])
    {
        int telugu = 90;

        int maths = 99;

        int english = 80;

        System.out.println(telugu);

        System.out.println(maths);

        System.out.println(english);
    }
}
```

---

# Output

```text
90

99

80
```

---

# Problem 🤔

If there are:

```text
50 Subjects?

100 Students?
```

Need:

```text
100 Variables?
```

Very difficult to manage.

---

# Solution ✅

```text
ARRAYS
```

---

# What is an Array?

An Array is a collection of similar type of elements stored using a single variable name.

---

# Telugu Understanding 😄

Without Arrays:

```text
Telugu Marks

Maths Marks

English Marks
```

Separate boxes.

---

With Arrays:

```text
Marks Array
```

One big box containing all marks.

---

# Example

```java
int marks[] = {90, 99, 80};
```

---

# Accessing Elements

```java
System.out.println(marks[0]);

System.out.println(marks[1]);

System.out.println(marks[2]);
```

---

# Output

```text
90

99

80
```

---

# Next Day Topics 🚀

➡️ Arrays in Java

* Array Declaration

* Array Creation

* Array Initialization

* Array Traversal

* For Loop with Arrays

* Student Marks Programs

* Finding Maximum Element

* Sum of Array Elements

---

# Git Commit Summary

```text
feat(day-10): completed type casting concepts

✓ Implicit Type Casting

✓ Explicit Type Casting

✓ Type Promotion Rules

✓ Unicode Concepts

✓ Overflow Examples

✓ Interview Questions

✓ Introduction to Arrays
```

---

# Quick Revision

```text
Type Casting
↓
Data Type Conversion

Implicit Casting
↓
Automatic

Explicit Casting
↓
Manual

Implicit
↓
No Data Loss

Explicit
↓
Possible Data Loss

Arrays
↓
Store Multiple Values Using One Variable
```

---

```text
"Type Casting ardham ayithe data flow ardham avuthundi."

"Arrays nerchukunte multiple values ni easy ga manage cheyyachu."
```

### Happy Coding 🚀

### Java Full Stack Journey Continues 💻
