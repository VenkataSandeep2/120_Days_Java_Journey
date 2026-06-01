
# Java Fundamentals - JVM, JRE, JDK & Naming Conventions

## Java Architecture

```text
                JDK
      (Java Development Kit)
   __________________________

   Compiler (javac)
   Debugger
   Development Tools
   JRE
   __________________________
            |
            v

                JRE
   (Java Runtime Environment)
   __________________________

   JVM
   Java Libraries
   __________________________
            |
            v

                JVM
    (Java Virtual Machine)
   __________________________

   Class Loader
   Bytecode Verifier
   Execution Engine
   Garbage Collector
   __________________________
```

---

# Java Program Execution Flow

```text
Source Code (.java)
        |
        v
   javac Compiler
        |
        v
Bytecode (.class)
        |
        v
       JVM
        |
        v
 Machine Code
        |
        v
      Output
```

Example:

```java
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

Compile:

```bash
javac Test.java
```

Run:

```bash
java Test
```

---

# JDK

JDK stands for Java Development Kit.

Used by developers to:

- Write Java programs
- Compile Java programs
- Debug Java programs
- Run Java programs

Contains:

- JRE
- javac Compiler
- Debugger
- Development Tools

---

# JRE

JRE stands for Java Runtime Environment.

Used to:

- Run Java applications

Contains:

- JVM
- Java Libraries

Does NOT contain compiler.

---

# JVM

JVM stands for Java Virtual Machine.

Responsibilities:

- Load class files
- Verify bytecode
- Execute bytecode
- Memory Management
- Garbage Collection

JVM makes Java platform independent.

---

# Relationship

```text
JDK
 |
 +-- JRE
       |
       +-- JVM
```

Memory Trick:

```text
JDK > JRE > JVM
```

---

# Why Java is Platform Independent?

```text
Java Source Code
        |
        v
     Bytecode
        |
        v
 Windows JVM
 Linux JVM
 Mac JVM
```

Same bytecode runs everywhere.

Write Once Run Anywhere (WORA)

---

# Naming Conventions

## Class Names

Use PascalCase

Correct:

```java
Student
EmployeeDetails
BankAccount
```

Wrong:

```java
student
employee_details
```

---

## Variable Names

Use camelCase

Correct:

```java
studentName
employeeSalary
accountBalance
```

Wrong:

```java
StudentName
student_name
```

---

## Method Names

Use camelCase

Correct:

```java
getName()
calculateSalary()
displayData()
```

Wrong:

```java
GetName()
DISPLAYDATA()
```

---

## Constants

Use UPPER_CASE

```java
final double PI = 3.14;
final int MAX_SIZE = 100;
```

---

## Package Names

Always lowercase

```java
com.company.project
com.smartresume.service
```

Wrong:

```java
Com.Company.Project
```

---

# Interview Questions

### Difference Between JDK, JRE and JVM

| Feature | JDK | JRE | JVM |
|----------|----------|----------|----------|
| Full Form | Java Development Kit | Java Runtime Environment | Java Virtual Machine |
| Compiler | Yes | No | No |
| JVM | Yes | Yes | Itself |
| Purpose | Develop + Run | Run | Execute |
| Used By | Developers | End Users | System |

---

# Quick Revision

```text
JDK = Development + Runtime

JRE = Runtime

JVM = Execution Engine

Class -> PascalCase
Variable -> camelCase
Method -> camelCase
Constant -> UPPER_CASE
Package -> lowercase
```
INTERVIEW QUESTION

Difference Between JVM, JRE, and JDK ?

JVM executes Java bytecode. JRE provides the runtime environment containing JVM and libraries required to run Java applications. JDK is the complete development kit that contains JRE, JVM, compiler (javac), debugger, and other tools used to develop, compile, and run Java applications.
