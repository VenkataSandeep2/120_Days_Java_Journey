
# 🚀 Java Full Stack Journey - Day 20

# Wrapper Classes in Java (Scratch to Hero)

> **"Primitive values become Objects using Wrapper Classes."**

---

# 📚 Topics Covered

✅ What are Wrapper Classes?

✅ Why Wrapper Classes are Needed?

✅ Primitive vs Wrapper Classes

✅ Wrapper Class Hierarchy

✅ Boxing

✅ Unboxing

✅ Autoboxing

✅ Auto-Unboxing

✅ Wrapper Utility Methods

✅ String Conversion using Wrapper Classes

✅ Character Class Methods

✅ Wrapper Classes with Collections

✅ Wrapper Classes and `null`

✅ Wrapper Classes are Immutable

✅ Wrapper Object Comparison

✅ Real-Time Examples

✅ Common Exceptions

✅ Interview Questions

---

# What are Wrapper Classes?

Java provides **8 Primitive Data Types**, but sometimes Java requires **Objects** instead of primitive values.

A **Wrapper Class** converts a primitive value into an Object.

Example

```java
int number = 100;

Integer value = 100;
```

Here

- `int` → Primitive
- `Integer` → Wrapper Class (Object)

---

# Primitive Data Types and Wrapper Classes

| Primitive | Wrapper Class |
|------------|---------------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

# Wrapper Class Hierarchy

```text
                    Object
                       │
                  Number Class
      ┌────────────┼────────────┐
      │            │            │
    Byte        Integer      Double
      │            │            │
    Short        Long        Float

Character

Boolean
```

---

# Telugu Understanding 😊

Imagine you bought a mobile phone.

Without a box, it is simply a phone.

After packing it inside a box, it becomes easy to carry and protect.

```text
Phone
↓

Primitive

Phone inside Box
↓

Wrapper Class
```

Primitive = Actual Value

Wrapper = Value packed inside an Object.

---

# Why Do We Need Wrapper Classes?

Primitive data types are **not Objects**.

Many Java libraries work only with Objects.

Example

Wrong

```java
ArrayList<int> list = new ArrayList<>();
```

Correct

```java
ArrayList<Integer> list = new ArrayList<>();
```

Collections store Objects, not primitive values.

---

# Primitive vs Wrapper Classes

| Primitive | Wrapper |
|------------|----------|
| Stores Values | Stores Objects |
| Faster | Slightly Slower |
| Cannot Store null | Can Store null |
| No Methods | Many Utility Methods |
| Used in Arithmetic | Used in Collections |

---

# Boxing

## Definition

Converting a Primitive into a Wrapper Object manually.

```java
int number = 100;

Integer value = Integer.valueOf(number);
```

Flow

```text
Primitive

↓

Wrapper Object
```

---

# Autoboxing

## Definition

Java automatically converts a Primitive into its Wrapper Object.

```java
int number = 100;

Integer value = number;
```

Flow

```text
int

↓

Autoboxing

↓

Integer
```

---

# Unboxing

## Definition

Converting a Wrapper Object into a Primitive manually.

```java
Integer value = Integer.valueOf(100);

int number = value.intValue();
```

Flow

```text
Wrapper

↓

Primitive
```

---

# Auto-Unboxing

## Definition

Java automatically converts a Wrapper Object into a Primitive.

```java
Integer value = 200;

int number = value;
```

Flow

```text
Integer

↓

Auto-Unboxing

↓

int
```

---

# Boxing vs Autoboxing

| Boxing | Autoboxing |
|----------|------------|
| Manual Conversion | Automatic Conversion |
| Uses `valueOf()` | Done by Java Compiler |

---

# Unboxing vs Auto-Unboxing

| Unboxing | Auto-Unboxing |
|-----------|---------------|
| Manual Conversion | Automatic Conversion |
| Uses `intValue()` | Done by Java Compiler |

---

# String Conversion using Wrapper Classes

Convert String into Primitive Values.

```java
String age = "22";

int number = Integer.parseInt(age);

System.out.println(number);
```

Useful Methods

```java
Integer.parseInt()

Long.parseLong()

Double.parseDouble()

Float.parseFloat()

Boolean.parseBoolean()

Short.parseShort()

Byte.parseByte()
```

---

# valueOf()

Returns Wrapper Objects.

```java
Integer number = Integer.valueOf("100");
```

Difference

| parseInt() | valueOf() |
|-------------|-----------|
| Returns int | Returns Integer |

---

# Character Wrapper Methods

```java
Character.isDigit()

Character.isLetter()

Character.isUpperCase()

Character.isLowerCase()

Character.toUpperCase()

Character.toLowerCase()
```

Example

```java
char ch = 'A';

System.out.println(Character.isUpperCase(ch));
```

Output

```text
true
```

---

# Wrapper Classes with Collections

```java
ArrayList<Integer> marks = new ArrayList<>();

marks.add(90);

marks.add(85);

marks.add(95);
```

During

```java
marks.add(90);
```

Java performs

```text
Autoboxing
```

During calculations

```java
total += marks.get(i);
```

Java performs

```text
Auto-Unboxing
```

---

# Wrapper Classes and null

Wrapper Objects can store null.

```java
Integer number = null;
```

Primitive cannot.

```java
int number = null;
```

Compile Time Error

---

# Common Runtime Mistake

```java
Integer number = null;

int value = number;
```

Output

```text
NullPointerException
```

Reason

Java tries Auto-Unboxing on null.

---

# Wrapper Classes are Immutable

```java
Integer number = 100;

number = 200;
```

The old object is never modified.

A new Wrapper Object is created.

---

# Wrapper Object Comparison

Wrong

```java
Integer a = 150;

Integer b = 150;

System.out.println(a == b);
```

Correct

```java
System.out.println(a.equals(b));
```

Always use

```java
equals()
```

for Wrapper value comparison.

---

# Real-Time Examples

### Student Marks

```text
ArrayList<Integer>
```

### Banking Application

```text
Double Balance
```

### Online Shopping

```text
Integer Quantity
```

### Employee Salary

```text
Long Salary
```

### Login System

```text
Boolean Login
```

### OTP Verification

```text
Integer OTP
```

### Character Validation

```text
Character.isLetter()
```

---

# Real-Time Flow

```text
User Input

↓

String

↓

parseInt()

↓

Primitive

↓

Autoboxing

↓

ArrayList<Integer>

↓

Auto-Unboxing

↓

Calculation

↓

Output
```

---

# Common Exceptions

### NumberFormatException

```java
Integer.parseInt("ABC");
```

---

### NullPointerException

```java
Integer number = null;

int value = number;
```

---

# Most Asked Interview Questions

### What is a Wrapper Class?

A Wrapper Class converts a primitive value into an Object.

---

### Why Wrapper Classes?

Collections and many Java APIs require Objects.

---

### Difference between int and Integer?

`int` is a primitive.

`Integer` is an Object.

---

### What is Boxing?

Manual conversion from Primitive to Wrapper.

---

### What is Autoboxing?

Automatic conversion from Primitive to Wrapper.

---

### What is Unboxing?

Manual conversion from Wrapper to Primitive.

---

### What is Auto-Unboxing?

Automatic conversion from Wrapper to Primitive.

---

### Difference between parseInt() and valueOf()?

`parseInt()` returns `int`.

`valueOf()` returns `Integer`.

---

### Can Wrapper Objects store null?

Yes.

---

### Can Primitive store null?

No.

---

### Are Wrapper Classes Immutable?

Yes.

---

### Why can't ArrayList store int?

Collections only store Objects.

---

### Should we use == or equals()?

Use

```java
equals()
```

for comparing Wrapper values.

---

# Quick Revision

```text
Primitive

↓

Wrapper

↓

Boxing

↓

Autoboxing

↓

Collections

↓

Auto-Unboxing

↓

Primitive

↓

parseInt()

↓

valueOf()

↓

Character Methods

↓

equals()

↓

Immutable
```

---

# Cheat Sheet

```text
byte      → Byte

short     → Short

int       → Integer

long      → Long

float     → Float

double    → Double

char      → Character

boolean   → Boolean
```

---

# Git Commit Summary

```text
feat(day-20): learned wrapper classes in java

✓ Wrapper Classes
✓ Primitive vs Wrapper
✓ Boxing
✓ Unboxing
✓ Autoboxing
✓ Auto-Unboxing
✓ parseInt()
✓ valueOf()
✓ Character Methods
✓ Wrapper Classes with Collections
✓ Wrapper and null
✓ Immutable Wrapper Classes
✓ Wrapper Comparison
✓ Real-Time Examples
✓ Interview Questions
✓ Quick Revision
✓ Cheat Sheet
```

---

# Today's Achievement 🏆

✅ Understood Wrapper Classes

✅ Learned Boxing & Unboxing

✅ Learned Autoboxing & Auto-Unboxing

✅ Learned String Conversions

✅ Learned Character Utility Methods

✅ Learned Wrapper Classes with Collections

✅ Solved Real-Time Examples

✅ Prepared for Java Interviews

---

# Next Topic

➡️ Exception Handling in Java

- Introduction to Exceptions
- Types of Exceptions
- try
- catch
- finally
- throw
- throws
- Custom Exceptions
- Real-Time Programs
- Interview Questions

---

```text
"Primitive values are powerful,
but Wrapper Classes make them usable in the Object-Oriented world."

"Learn Wrapper Classes once,
and Collections, Generics, and Frameworks become much easier."
```

### Happy Coding 🚀
