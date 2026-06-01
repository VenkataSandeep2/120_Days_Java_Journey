# 🚀 Java Logical Operators & Ternary Operator

## Easy Telugu Style Notes for Andhra Students 😄

---

# 📚 Topics Covered

✅ Logical Operators

✅ Ternary Operator

---

# 1️⃣ Logical Operators

Logical Operators are used to combine multiple conditions.

Imagine:

👉 Vote veyyali

👉 Age 18+ undali

👉 Voter ID undali

Multiple conditions ni check cheyyadaniki Logical Operators use chestam.

---

# Types of Logical Operators

 Operator -> Meaning     
 &&      -> Logical AND 
 
 ||       -> Logical OR  
 
 !        ->Logica NOT 

---

# 🔥 Logical AND (&&)

### Rule

Both conditions must be true.

---

## Example

```java
boolean isMajor = true;
boolean hasVoterId = false;

System.out.println(isMajor && hasVoterId);
```

### Output

```java
false
```

### Explanation 😄

```java
true && false
```

Both are not true.

Result:

```java
false
```

---

## Example

```java
boolean isMajor = true;
boolean hasDrivingLicense = true;

System.out.println(isMajor && hasDrivingLicense);
```

### Output

```java
true
```

Because:

```java
true && true
```

Result:

```java
true
```

---

# Easy Memory Trick

```text
AND (&&)

Both Pass → True

One Fail → False
```

---

# 🔥 Logical OR (||)

### Rule

At least one condition should be true.

---

## Example

```java
System.out.println(isMajor || hasVoterId);
```

### Output

```java
true
```

Because:

```java
true || false
```

One condition true.

Result:

```java
true
```

---

# Easy Memory Trick

```text
OR (||)

Any One Pass → True

Both Fail → False
```

---

# 🔥 Logical NOT (!)

NOT operator reverses the result.

---

## Example

```java
System.out.println(!isMajor);
```

### Output

```java
false
```

Because:

```java
isMajor = true
```

NOT changes it.

```java
!true = false
```

---

## Example

```java
System.out.println(!(!hasVoterId));
```

### Output

```java
false
```

Explanation:

```java
hasVoterId = false
```

First NOT:

```java
!false = true
```

Second NOT:

```java
!true = false
```

Final Output:

```java
false
```

---

# Logical Expressions

## Example

```java
boolean large = (10 > 5) && (15 > 10);
```

### Step 1

```java
10 > 5
```

Result:

```java
true
```

---

### Step 2

```java
15 > 10
```

Result:

```java
true
```

---

### Final

```java
true && true
```

Output:

```java
true
```

---

## Example

```java
boolean large1 = (10 < 5) && (15 > 10);
```

Step:

```java
false && true
```

Output:

```java
false
```

---

## Example

```java
boolean large2 = (10 > 5) || (15 > 10);
```

Step:

```java
true || true
```

Output:

```java
true
```

---

## Example

```java
boolean large3 = (10 < 15) || (15 > 10);
```

Step:

```java
true || true
```

Output:

```java
true
```

---

# 🔥 Short Circuit Evaluation

Interview Favorite Question 😎

---

## Example

```java
boolean res =
(10 > 5) ||
(15 < 6) &&
(15 > 25) &&
(10 >= 5);
```

### Step 1

```java
10 > 5
```

Result:

```java
true
```

Java immediately stops.

Remaining conditions are not checked.

Output:

```java
true
```

This is called:

```text
Short Circuit Evaluation
```

---

## Example

```java
boolean res1 =
(10 < 5) ||
(15 < 6) &&
(15 > 25) &&
(10 >= 5);
```

Step:

```java
false || false && false && true
```

Result:

```java
false
```

---

# Real Time Examples

## Example

```java
int a = 15;

System.out.println(false || (a > 5));
```

Output

```java
true
```

---

## Example

```java
System.out.println(!true || (a < 5));
```

Output

```java
false
```

---

## Example

```java
System.out.println(!false || (a < 5));
```

Output

```java
true
```

---

# 2️⃣ Ternary Operator

Ternary Operator is a shortcut for if-else.

---

# Syntax

```java
(condition)
?
true statement
:
false statement
```

---

# Example 1

```java
System.out.println(
(10 < 5)
?
"10 is big"
:
"5 is big"
);
```

### Output

```java
5 is big
```

Because:

```java
10 < 5
```

is false.

---

# Example 2

```java
System.out.println(
(10 > 5)
?
"10 is big"
:
"5 is big"
);
```

### Output

```java
10 is big
```

Because:

```java
10 > 5
```

is true.

---

# Example 3

```java
String res =
(5 <= 5)
?
"5 is big"
:
"5 is big";
```

### Output

```java
5 is big
```

---

# Biggest Number Program

```java
int num1 = 10;
int num2 = 5;

String bignum =
(num2 > num1)
?
(num2 + " is big")
:
(num1 + " is big");

System.out.println(bignum);
```

### Output

```java
10 is big
```

---

# Positive or Negative Program

```java
int num3 = 5;

String result =
(num3 > 0)
?
"positive"
:
"negative";

System.out.println(result);
```

### Output

```java
positive
```

---

# Interview Questions 🔥

## Q1

What are Logical Operators?

### Answer

Used to combine multiple conditions.

---

## Q2

How many Logical Operators are available?

### Answer

```java
&&
||
!
```

---

## Q3

Difference between && and || ?

### Answer

```text
&& → Both conditions true

|| → Any one condition true
```

---

## Q4

What is Short Circuit Evaluation?

### Answer

When result is already decided, Java stops checking remaining conditions.

---

## Q5

What is Ternary Operator?

### Answer

Shortcut version of if-else.

---

## Q6

Can Ternary Operator return a value?

### Answer

```java
Yes
```

Example:

```java
String result =
(age >= 18)
?
"Eligible"
:
"Not Eligible";
```

---

# 🏆 Golden Rules

✅ && → Both True

✅ || → Any One True

✅ ! → Reverse Result

✅ Ternary → Shortcut If Else

✅ Ternary Returns Value

✅ Java Uses Short Circuit Evaluation

---

# 🎯 Revision

Today We Completed:

✔ Logical AND (&&)

✔ Logical OR (||)

✔ Logical NOT (!)

✔ Short Circuit Evaluation

✔ Ternary Operator

✔ Biggest Number Program

✔ Positive Negative Program

✔ Interview Questions

---

Remember:

```text
&& → Both Pass

|| → Any One Pass

! → Reverse

?: → Shortcut If Else
```

Practice daily and Java becomes easy 😄
