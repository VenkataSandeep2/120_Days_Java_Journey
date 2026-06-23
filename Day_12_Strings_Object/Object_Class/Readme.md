# Object Class in Java

## Introduction

The **Object class** is the root (super) class of the Java class hierarchy. Every class in Java directly or indirectly inherits from the `Object` class.

It is available in the `java.lang` package and provides common methods that every Java object can use.

```java
class Student
{
}
```

Internally, Java treats it as:

```java
class Student extends Object
{
}
```

---

# Why Object Class?

Since every class inherits from `Object`, all objects get access to common functionality such as:

* Object comparison
* String representation
* Runtime class information
* Cloning
* Thread synchronization
* Garbage collection support

---

# Important Methods of Object Class

## 1. toString()

### Purpose

Returns a string representation of an object.

### Syntax

```java
public String toString()
```

### Example

```java
class Student
{
    int id = 101;
}

public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student();
        System.out.println(s);
    }
}
```

### Output

```text
Student@15db9742
```

---

## 2. equals()

### Purpose

Compares two objects based on their contents.

### Syntax

```java
public boolean equals(Object obj)
```

### Example

```java
class Student
{
    int id;

    Student(int id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj)
    {
        Student s = (Student)obj;
        return this.id == s.id;
    }
}
```

---

## 3. hashCode()

### Purpose

Returns a unique integer value (hash code) for an object.

### Syntax

```java
public int hashCode()
```

### Uses

* HashMap
* HashSet
* Hashtable

---

## 4. getClass()

### Purpose

Returns runtime class information.

### Syntax

```java
public final Class<?> getClass()
```

### Example

```java
Student s = new Student();
System.out.println(s.getClass());
```

### Output

```text
class Student
```

---

## 5. clone()

### Purpose

Creates a copy of an object.

### Syntax

```java
protected Object clone()
```

### Notes

* Class must implement `Cloneable`.
* Produces a shallow copy by default.

---

## 6. finalize() (Deprecated)

### Purpose

Invoked before an object is garbage collected.

### Syntax

```java
protected void finalize()
```

### Note

Deprecated in modern Java versions.

---

## 7. wait()

### Purpose

Makes the current thread wait until another thread notifies it.

### Syntax

```java
wait();
wait(long millis);
wait(long millis, int nanos);
```

---

## 8. notify()

### Purpose

Wakes up one waiting thread.

### Syntax

```java
notify();
```

---

## 9. notifyAll()

### Purpose

Wakes up all waiting threads.

### Syntax

```java
notifyAll();
```

---

# Object Class Hierarchy

```text
Object
   │
   ├── Student
   ├── Employee
   ├── String
   ├── ArrayList
   └── Any User Defined Class
```

---

# Difference Between == and equals()

| ==                    | equals()                |
| --------------------- | ----------------------- |
| Compares references   | Compares contents       |
| Operator              | Method                  |
| Checks memory address | Checks logical equality |

### Example

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);      // false
System.out.println(s1.equals(s2)); // true
```

---

# Interview Questions

### Q1. Which class is the parent of all classes in Java?

**Answer:** Object class

### Q2. In which package is Object class available?

**Answer:** java.lang

### Q3. Why do we override equals()?

To compare object contents instead of object references.

### Q4. Why do we override hashCode() with equals()?

To maintain consistency in hash-based collections like HashMap and HashSet.

### Q5. Which Object class method returns runtime class information?

**Answer:** getClass()

---

# Quick Revision

| Method      | Purpose                   |
| ----------- | ------------------------- |
| toString()  | Convert object to String  |
| equals()    | Compare objects           |
| hashCode()  | Generate hash value       |
| getClass()  | Get runtime class         |
| clone()     | Create object copy        |
| finalize()  | Before garbage collection |
| wait()      | Pause thread              |
| notify()    | Wake one thread           |
| notifyAll() | Wake all threads          |

---

# Key Takeaway

* Object is the root class of Java.
* Every Java class inherits from Object.
* Provides common methods used by all objects.
* Forms the foundation of Java's Object-Oriented Programming model.

**One-Line Definition:**

> The Object class is the universal superclass of all Java classes and provides common behavior to every object in Java.
