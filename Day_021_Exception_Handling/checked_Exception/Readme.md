# 📘 Java Checked Exceptions

## What is a Checked Exception?

A **Checked Exception** is an exception that the **Java compiler checks at compile time**. The compiler **forces the programmer** to either:

* Handle the exception using `try-catch`
* Declare the exception using the `throws` keyword

If we do neither, the program **will not compile**.

> **Note:** A checked exception does **not** occur during compilation. The compiler only checks whether it is handled or declared. The actual exception occurs during program execution (runtime).

---

# Exception Hierarchy

```text
Object
   │
Throwable
   │
Exception
   │
├── IOException
│     └── FileNotFoundException
│
├── SQLException
│
├── ClassNotFoundException
│
└── InterruptedException
```

All the above are **Checked Exceptions**.

---

# Characteristics of Checked Exceptions

* Checked by the compiler.
* Must be handled using `try-catch` or declared using `throws`.
* Usually occur during file handling, database operations, thread operations, and class loading.
* Subclasses of `Exception` (excluding the `RuntimeException` branch).

---

# Common Checked Exceptions

## 1. FileNotFoundException

### Definition

Occurs when Java cannot find or open the specified file.

### Real-Time Example

```java
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileExample {

    public static void main(String[] args) {

        try {

            FileReader file = new FileReader("student.txt");

            System.out.println("File Found");

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found");
        }
    }
}
```

### Real-Time Scenario

* Reading a student record file
* Opening a configuration file
* Reading employee details

---

## 2. IOException

### Definition

Occurs when an input/output operation fails.

### Real-Time Example

```java
import java.io.*;

public class IOExceptionExample {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("student.txt"));

            System.out.println(br.readLine());

            br.close();

        } catch (IOException e) {

            System.out.println("I/O Operation Failed");
        }
    }
}
```

### Real-Time Scenario

* Reading files
* Writing files
* Network streams
* Input and output operations

---

## 3. SQLException

### Definition

Occurs when a database operation fails.

### Real-Time Example

```java
try {

    // JDBC Database Operations

}
catch (SQLException e) {

    System.out.println("Database Error");
}
```

### Real-Time Scenario

* Wrong SQL query
* Database connection failure
* Invalid table name
* Constraint violation

---

## 4. ClassNotFoundException

### Definition

Occurs when Java cannot locate the specified class at runtime.

### Real-Time Example

```java
try {

    Class.forName("com.mysql.cj.jdbc.Driver");

}
catch (ClassNotFoundException e) {

    System.out.println("Driver Class Not Found");
}
```

### Real-Time Scenario

* Loading JDBC Driver
* Dynamic class loading
* Reflection

---

## 5. InterruptedException

### Definition

Occurs when a sleeping or waiting thread is interrupted.

### Real-Time Example

```java
public class SleepExample {

    public static void main(String[] args) {

        try {

            System.out.println("Waiting...");

            Thread.sleep(3000);

            System.out.println("Completed");

        }
        catch (InterruptedException e) {

            System.out.println("Thread Interrupted");
        }
    }
}
```

### Real-Time Scenario

* Background tasks
* Thread scheduling
* Multithreading applications

---

# Two Ways to Handle Checked Exceptions

## Method 1: try-catch

```java
try {

    Thread.sleep(1000);

}
catch (InterruptedException e) {

    System.out.println("Interrupted");
}
```

---

## Method 2: throws

```java
public static void main(String[] args)
        throws InterruptedException {

    Thread.sleep(1000);
}
```

---

# File Handling and Checked Exceptions

**File Handling is NOT a checked exception.**

File handling is an operation.

During file handling, Java may throw checked exceptions such as:

* FileNotFoundException
* IOException

Example:

```java
FileReader file = new FileReader("student.txt");
```

If the file is missing, Java throws:

```text
FileNotFoundException
```

---

# Checked vs Unchecked Exceptions

| Checked Exception      | Unchecked Exception            |
| ---------------------- | ------------------------------ |
| Compiler checks        | Compiler does not check        |
| Must handle or declare | Handling is optional           |
| Subclass of Exception  | Subclass of RuntimeException   |
| IOException            | ArithmeticException            |
| FileNotFoundException  | NullPointerException           |
| SQLException           | NumberFormatException          |
| InterruptedException   | ArrayIndexOutOfBoundsException |
| ClassNotFoundException | InputMismatchException         |

---

# Advantages of Checked Exceptions

* Improves program reliability.
* Encourages proper error handling.
* Prevents unexpected application crashes.
* Makes programs more maintainable.
* Useful for file handling, database operations, and networking.

---

# Interview Questions

### What is a Checked Exception?

A checked exception is an exception that the compiler checks at compile time and requires the programmer to handle using `try-catch` or declare using `throws`.

---

### Give examples of Checked Exceptions.

* FileNotFoundException
* IOException
* SQLException
* InterruptedException
* ClassNotFoundException

---

### Does a Checked Exception occur at compile time?

No.

The compiler only checks whether it is handled or declared.

The actual exception occurs during runtime.

---

### How do we handle Checked Exceptions?

* Using `try-catch`
* Using `throws`

---

### Is File Handling a Checked Exception?

No.

File handling is an operation that can throw checked exceptions such as `FileNotFoundException` and `IOException`.

---

# Quick Revision

```text
Checked Exception

✔ Compiler checks
✔ Must handle or declare
✔ try-catch
✔ throws

Examples

• FileNotFoundException
• IOException
• SQLException
• InterruptedException
• ClassNotFoundException

Remember:

File Handling ≠ Checked Exception

File Handling
       ↓
May Throw
       ↓
FileNotFoundException
IOException
```

---

# Easy Memory Trick

```text
F I S I C

F → FileNotFoundException
I → IOException
S → SQLException
I → InterruptedException
C → ClassNotFoundException
```

**Remember:** These are the five most commonly asked checked exceptions in Java interviews.
