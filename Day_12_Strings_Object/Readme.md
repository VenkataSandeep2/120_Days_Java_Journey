# Java Strings and Object Class

A beginner-friendly Java repository containing String concepts, Object class fundamentals, examples, interview questions, and practice programs.

---

# Topics Covered

## Java String

- Introduction to String
- String Object Creation
- String Literals
- Different Constructors of String
- String from byte[]
- String from char[]
- String Length
- isEmpty()
- charAt()
- toCharArray()
- getBytes()
- ASCII Value Conversion
- String Traversal
- String Interview Examples

---

## Java Object Class

- Introduction to Object Class
- Object Hierarchy
- Why Object Class?
- toString()
- equals()
- hashCode()
- getClass()
- clone()
- finalize()
- wait()
- notify()
- notifyAll()
- == vs equals()
- Object Class Interview Questions

---

# Folder Structure

```
Java-Strings-and-Object-Class
│
├── README.md
│
├── String
│   ├── String1.java
│   ├── String2.java
│   └── String3.java
│
└── Object-Class
    └── ObjectClassNotes.md
```

---

# String Programs

## String1.java

Topics Covered

- Creating String using new keyword
- Creating String from another String
- length()
- isEmpty()

### Output

```
Sa_ndeep
The Length of String
isEmpty()
```

---

## String2.java

Topics Covered

- Empty String
- String using byte array
- String using offset and length
- charAt()
- Traversing String

Methods Used

- length()
- isEmpty()
- charAt()

---

## String3.java

Topics Covered

- ASCII Values
- byte[] to String
- char[] to String
- toCharArray()
- getBytes()

Methods Used

- length()
- toCharArray()
- getBytes()

---

# Object Class

The Object class is the root class of Java.

Every class directly or indirectly extends Object.

Example

```java
class Student
{
}
```

Internally

```java
class Student extends Object
{
}
```

---

# Important Object Class Methods

| Method | Purpose |
|----------|----------|
| toString() | Converts Object into String |
| equals() | Compares Objects |
| hashCode() | Generates Hash Value |
| getClass() | Returns Runtime Class |
| clone() | Copies Object |
| finalize() | Before Garbage Collection |
| wait() | Thread Waiting |
| notify() | Wake One Thread |
| notifyAll() | Wake All Threads |

---

# == vs equals()

| == | equals() |
|------|-----------|
| Compare References | Compare Contents |
| Operator | Method |

Example

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);

System.out.println(s1.equals(s2));
```

Output

```
false
true
```

---

# Interview Questions

### Java String

- What is String?
- Why is String Immutable?
- Difference between String and StringBuilder?
- Difference between == and equals()?
- What is String Pool?
- Difference between new String() and String Literal?

---

### Object Class

- Why Object class is parent of all classes?
- Which package contains Object class?
- Why override equals()?
- Why override hashCode()?
- Explain getClass().
- Explain toString().

---

# Technologies Used

- Java
- Eclipse IDE
- JDK 17+ (Compatible with other modern JDK versions)

---

# Learning Outcome

After completing this repository you will understand

- Java String Fundamentals
- String Constructors
- String Methods
- String Conversion
- Object Class
- Object Class Methods
- Object Comparison
- Java Interview Questions

---

# Author

**Sai**

Java Developer | Learning Core Java, DSA, JDBC, Spring Boot

---

# Repository Purpose

This repository is part of my **Java Developer Interview Preparation Journey**. It contains beginner-friendly examples, detailed explanations, and interview-focused notes on Java Strings and the Object Class.
