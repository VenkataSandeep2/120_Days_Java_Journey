
# Java Operators Tutorial 🚀

## Easy Telugu Style Explanation for Andhra Students 😄

---

# 📘 Introduction

Java lo operators ante enti?

👉 Operators are symbols
👉 They perform operations on variables and values.

Example:

```java
10 + 20
```

Here:

* `10` and `20` → operands
* `+` → operator

---

# 🔥 Types of Operators

1. Arithmetic Operators
2. Relational Operators
3. Unary Operators

---

# 1️⃣ Arithmetic Operators

Arithmetic operators are used for mathematical calculations.

| Operator | Meaning            |
| -------- | ------------------ |
| `+`      | Addition           |
| `-`      | Subtraction        |
| `*`      | Multiplication     |
| `/`      | Division           |
| `%`      | Modulo (Remainder) |

---

# ➕ Addition Operator `+`

```java
int num1 = 10;
int num2 = 20;

System.out.println(num1 + num2);
```

## Output

```java
30
```

### Explanation 😄

10 + 20 = 30

Simple addition ra babu 😂

---

# 🔥 String Addition

```java
String s1 = "Venkata";
String s2 = "Sandeep";

System.out.println(s1 + s2);
```

## Output

```java
VenkataSandeep
```

### Explanation

String ki `+` use chesthe Java join chestundi.

---

```java
System.out.println(s1 + " " + s2);
```

## Output

```java
Venkata Sandeep
```

Space `" "` icham kabatti gap vachindi.

---

# 🔥 String + Number

```java
System.out.println(s1 + num1);
```

## Output

```java
Venkata10
```

### Important Point 🔥

Java lo:

👉 String tho e datatype add chesina
👉 Total String aipothadi.

---

# 😈 Confusing Example

```java
System.out.println(12 + 1 + 3 + s1 + 1 + 2 + s2 );
```

## Step-by-Step

```java
12 + 1 = 13
13 + 3 = 16
```

Now:

```java
16 + s1
```

String vachindi kabatti total String aipothadi.

Final Output:

```java
16Venkata12Sandeep
```

---

# 🔥 Float Example

```java
float num5 = 2.0f;
int num7 = 4;

System.out.println(num5 + num7);
```

## Output

```java
6.0
```

### Explanation

int + float = float

Java automatic ga int ni float ga convert chestundi.

---

# ➖ Subtraction Operator `-`

```java
System.out.println(20 - 10);
```

## Output

```java
10
```

---

# ✖️ Multiplication Operator `*`

```java
System.out.println(20 * 10);
```

## Output

```java
200
```

---

# ➗ Division Operator `/`

```java
System.out.println(10 / 3);
```

## Output

```java
3
```

### Why not 3.333?

Because:

```java
int / int = int
```

Decimal value remove chestundi.

---

```java
System.out.println(5.0 / 2.0);
```

## Output

```java
2.5
```

Because float/double division.

---

# 😈 Infinity Example

```java
System.out.println(10.0 / 0);
```

## Output

```java
Infinity
```

### Explanation

double or float ni zero tho divide chesthe Infinity vastundi.

---

```java
System.out.println(0 / 0.0);
```

## Output

```java
NaN
```

Meaning:

```java
Not a Number
```

---

# 🔥 Modulo Operator `%`

Modulo means remainder.

```java
System.out.println(10 % 3);
```

## Output

```java
1
```

### Explanation

3 table lo:

```java
3 × 3 = 9
```

Remaining:

```java
1
```

---

# 2️⃣ Relational Operators

These operators compare values.

| Operator | Meaning               |
| -------- | --------------------- |
| `==`     | Equal                 |
| `!=`     | Not Equal             |
| `>`      | Greater Than          |
| `<`      | Less Than             |
| `>=`     | Greater Than or Equal |
| `<=`     | Less Than or Equal    |

---

# Example

```java
int a = 10;
int b = 20;

System.out.println(a == b);
```

## Output

```java
false
```

Because:

10 is not equal to 20.

---

```java
System.out.println(a < b);
```

## Output

```java
true
```

Because:

10 is less than 20.

---

# 3️⃣ Unary Operators

Unary operators work on single variable.

---

# ➕ Increment Operator `++`

```java
int x = 10;

x++;
```

Means:

```java
x = x + 1;
```

---

# ➖ Decrement Operator `--`

```java
x--;
```

Means:

```java
x = x - 1;
```

---

# 🔥 Post Increment `x++`

```java
int x = 10;

System.out.println(x++);
```

## Output

```java
10
```

After execution:

```java
x = 11
```

### Logic 😄

👉 First use old value
👉 Then increment

---

# 🔥 Pre Increment `++x`

```java
int x = 10;

System.out.println(++x);
```

## Output

```java
11
```

### Logic 😄

👉 First increment
👉 Then use value

---

# 😈 Dangerous Example

```java
int num1 = 10;
int num2 = 20;
int num4 = 30;

int res1 = ++num1 + num2++ + num4++;
```

## Step-by-Step

### `++num1`

Pre increment:

```java
11
```

---

### `num2++`

Use first:

```java
20
```

Then becomes:

```java
21
```

---

### `num4++`

Use first:

```java
30
```

Then becomes:

```java
31
```

---

## Final Result

```java
11 + 20 + 30 = 61
```

---

# 🏆 Golden Rules

## Rule 1

String vachaka total String aipothadi.

---

## Rule 2

```java
int / int = int
```

---

## Rule 3

float or double vachaka decimal result vastundi.

---

## Rule 4

```java
x++
```

First use → then increase

---

## Rule 5

```java
++x
```

First increase → then use

---

# 🎯 Conclusion

Java operators are very important.

Without operators:

❌ Calculations cheyalem
❌ Conditions check cheyalem
❌ Logic build cheyalem

Operators are foundation of programming 🔥

---

# ❤️ Happy Coding Andhra Developers 😄

Practice daily ra babu…

Java easy aipothundi 🚀
