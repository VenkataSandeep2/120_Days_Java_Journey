# 🚀 Java Full Stack Journey - Day 11 Revision

# ARRAYS IN JAVA

---

# 📚 Topics Covered

✅ 1D Arrays

✅ Array Creation

✅ Array Initialization

✅ Array Traversal

✅ Finding Largest Element

✅ Sum of Array Elements

✅ Character Arrays

✅ Boolean Arrays

✅ String Arrays

✅ 2D Arrays

✅ Jagged Arrays

---

# What is an Array?

An Array is a collection of similar data type elements stored under a single variable name.

---

# Telugu Understanding 😄

Without Array:

```java
int telugu = 90;
int maths = 99;
int english = 80;
```

For 100 subjects?

```text
Need 100 Variables ❌
```

---

With Array:

```java
int marks[] = {90,99,80};
```

Single variable stores multiple values.

```text
Easy Management ✅
```

---

# Array Syntax

### Declaration

```java
int[] arr;
```

OR

```java
int arr[];
```

---

### Creation

```java
int[] arr = new int[5];
```

---

### Initialization

```java
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
```

---

# Important Formula

```java
arr.length
```

Returns total size of array.

---

# Array Index

```text
Array Size = 7

Index Starts From 0

0 1 2 3 4 5 6
```

---

# Array Traversal

```java
for(int i=0;i<arr.length;i++)
{
    System.out.println(arr[i]);
}
```

---

# Largest Element Logic

```java
int max = arr[0];

for(int i=1;i<arr.length;i++)
{
    if(arr[i] > max)
    {
        max = arr[i];
    }
}
```

---

# Sum of Array Logic

```java
int sum = 0;

for(int i=0;i<arr.length;i++)
{
    sum = sum + arr[i];
}
```

---

# Character Array

```java
char grades[] = {'A','B'};
```

Access:

```java
grades[0]
grades[1]
```

---

# Boolean Array

```java
boolean arr[] = new boolean[1];

arr[0] = true;
```

---

# String Array

```java
String names[] =
{
    "AVS",
    "Sandeep"
};
```

---

# 2D Array

Think like Matrix.

```java
int[][] arr =
{
    {1,2,3},
    {4,5,6},
    {7,8,9}
};
```

---

# Accessing Elements

```java
arr[0][0]
arr[1][1]
arr[2][2]
```

---

# Traversing 2D Array

```java
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr[i].length;j++)
    {
        System.out.print(arr[i][j]);
    }
}
```

---

# Jagged Array

Rows can have different sizes.

```java
int[][] arr = new int[3][];

arr[0] = new int[]{10,20,30};

arr[1] = new int[]{40,50};

arr[2] = new int[]{60,70,80,90};
```

---

# Output Structure

```text
10 20 30
40 50
60 70 80 90
```

---

# Common Exceptions

## ArrayIndexOutOfBoundsException

Wrong:

```java
int arr[] = new int[3];

arr[3] = 100;
```

Valid Index:

```text
0 1 2
```

---

# Interview Questions 🔥

### 1. What is an Array?

Array is a collection of similar data type elements stored under one variable name.

---

### 2. Why Arrays are Used?

To store multiple values using a single variable.

---

### 3. What is Default Index of Array?

```text
0
```

---

### 4. What is Last Index Formula?

```java
arr.length - 1
```

---

### 5. Can Array Store Different Data Types?

```text
No
```

Array stores only same type elements.

---

### 6. What is ArrayIndexOutOfBoundsException?

Occurs when accessing invalid index.

Example:

```java
arr[10]
```

when array size is 5.

---

### 7. What is arr.length?

Returns total size of array.

---

### 8. Difference Between length and length()?

```java
arr.length
```

Used for Arrays.

---

```java
str.length()
```

Used for Strings.

---

### 9. What is a 2D Array?

Array containing rows and columns.

Example:

```java
int[][] marks;
```

---

### 10. What is a Jagged Array?

Rows contain different column sizes.

---

### 11. Can Array Size Change Dynamically?

```text
No
```

Array size is fixed.

---

### 12. What is Default Value of int Array?

```text
0
```

---

### 13. What is Default Value of boolean Array?

```text
false
```

---

### 14. What is Default Value of String Array?

```text
null
```

---

# Quick Revision 🚀

```text
Array
↓
Collection of Similar Data

Index Starts
↓
0

Last Index
↓
length - 1

Array Traversal
↓
for loop

Largest Element
↓
max variable

Sum of Elements
↓
sum variable

2D Array
↓
Rows + Columns

Jagged Array
↓
Unequal Column Sizes

Exception
↓
ArrayIndexOutOfBoundsException
```

---

# Git Commit Summary

```text
feat(day-11): completed arrays in java

✓ 1D Arrays
✓ Array Traversal
✓ Largest Element
✓ Sum of Array Elements
✓ Character Arrays
✓ Boolean Arrays
✓ String Arrays
✓ 2D Arrays
✓ Jagged Arrays
✓ Interview Questions
✓ Quick Revision
```

---

```text
"Single variable lo multiple values store cheyyadam ante Array."

"Array ardham ayithe Collections easy ga ardham avuthayi."

Practice Arrays Daily 🚀
```
