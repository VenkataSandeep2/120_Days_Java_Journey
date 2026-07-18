# Hybrid Inheritance in Java

## Introduction

**Hybrid Inheritance** is a combination of **two or more types of inheritance** in a single program.

It combines inheritance types such as:

- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance
- Multiple Inheritance

Since Hybrid Inheritance includes **Multiple Inheritance**, Java **does not support Hybrid Inheritance using classes**.

---

# Definition

> Hybrid Inheritance is an inheritance model that combines two or more inheritance types to form a complex inheritance hierarchy.

---

# Hybrid Inheritance Diagram

```text
              Animal
             /      \
         Mammal     Bird
             \      /
              Bat
```

Here,

- Animal → Mammal (Hierarchical)
- Animal → Bird (Hierarchical)
- Mammal + Bird → Bat (Multiple)

Since Multiple Inheritance exists, the overall structure becomes **Hybrid Inheritance**.

---

# Real-Time Example

Imagine a child trying to inherit properties from **both parents**.

```
Father

↓

Property

↓

Child

Mother

↓

Property

↓

Child
```

Suppose:

Father says

```java
drive();
```

Mother also says

```java
drive();
```

Now the child calls

```java
drive();
```

Question:

Which parent's method should be executed?

Java cannot decide.

This confusion is called **Ambiguity**.

---

# Example (Not Allowed in Java)

```java
class Father {

    void property() {
        System.out.println("Father Property");
    }
}

class Mother {

    void property() {
        System.out.println("Mother Property");
    }
}

// ❌ Not Allowed
class Child extends Father, Mother {

}
```

### Compile-Time Error

```
The type Child cannot subclass both Father and Mother.
```

---

# Why Doesn't Java Support Hybrid Inheritance?

The main reason is the **Diamond Problem (Ambiguity Problem).**

---

# What is the Diamond Problem?

Consider the following hierarchy:

```text
          Animal
         /      \
      Dog        Cat
         \      /
          Puppy
```

Both **Dog** and **Cat** inherit from **Animal**.

Now assume:

```java
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}
```

Dog overrides the method.

```java
class Dog extends Animal {

    void sound() {
        System.out.println("Dog Bark");
    }
}
```

Cat also overrides the method.

```java
class Cat extends Animal {

    void sound() {
        System.out.println("Cat Meow");
    }
}
```

Now imagine Java allowed:

```java
class Puppy extends Dog, Cat {

}
```

If we write:

```java
Puppy p = new Puppy();

p.sound();
```

Which method should execute?

Option 1

```text
Dog Bark
```

Option 2

```text
Cat Meow
```

Java cannot determine the correct method.

This uncertainty is called the **Diamond Problem**.

---

# Visual Representation

```text
             Animal
             sound()

            /      \

     Dog             Cat
   sound()         sound()

            \      /

             Puppy

         p.sound() ??

Dog Version?

OR

Cat Version?
```

Java cannot choose one automatically.

Therefore it completely **disallows Hybrid Inheritance using classes**.

---

# Another Example

Suppose two classes have the same method.

```java
class Printer {

    void print() {
        System.out.println("Printer");
    }
}

class Scanner {

    void print() {
        System.out.println("Scanner");
    }
}
```

If Java allowed:

```java
class Machine extends Printer, Scanner {

}
```

Then:

```java
Machine m = new Machine();

m.print();
```

Should it print

```text
Printer
```

or

```text
Scanner
```

This ambiguity is exactly why Hybrid Inheritance is not supported.

---

# How Java Solves This Problem

Java supports Hybrid Inheritance **using Interfaces**, not classes.

Example

```java
interface Camera {

    void click();
}

interface Music {

    void play();
}

class Mobile implements Camera, Music {

    public void click() {
        System.out.println("Taking Photo");
    }

    public void play() {
        System.out.println("Playing Music");
    }
}
```

Here, there is **no ambiguity** because the child class provides the implementation of every method.

---

# Why Interfaces Don't Cause the Diamond Problem?

Interfaces only declare methods.

Example

```java
interface A {

    void display();
}

interface B {

    void display();
}
```

When a class implements both interfaces:

```java
class Test implements A, B {

    public void display() {

        System.out.println("Display Method");
    }
}
```

The child class defines **one implementation**, so Java knows exactly which method to execute.

No confusion occurs.

---

# Supported vs Not Supported

| Inheritance Type | Java Classes | Java Interfaces |
|------------------|-------------|-----------------|
| Single | ✅ | ✅ |
| Multilevel | ✅ | ✅ |
| Hierarchical | ✅ | ✅ |
| Multiple | ❌ | ✅ |
| Hybrid | ❌ | ✅ |

---

# Interview Questions

### What is Hybrid Inheritance?

Hybrid Inheritance is a combination of two or more inheritance types.

---

### Why doesn't Java support Hybrid Inheritance?

Because it includes Multiple Inheritance, which leads to the **Diamond Problem (Ambiguity Problem).**

---

### What is the Diamond Problem?

The Diamond Problem occurs when a child class inherits the same method from two different parent classes, making it impossible for Java to determine which method should be executed.

---

### Can Hybrid Inheritance be achieved in Java?

Yes, using **Interfaces**.

---

### Which keyword is used for Hybrid Inheritance with interfaces?

```java
implements
```

---

# Quick Revision

```text
Hybrid Inheritance

↓

Combination of

Single

+

Multilevel

+

Hierarchical

+

Multiple

↓

Contains Multiple Inheritance

↓

Diamond Problem

↓

Method Ambiguity

↓

Java Does NOT Support with Classes

↓

Solution

Interfaces
```

---

# One-Line Interview Answer

> **Hybrid Inheritance is a combination of two or more inheritance types. Java does not support Hybrid Inheritance using classes because it introduces the Diamond Problem (method ambiguity). However, Hybrid Inheritance can be achieved safely using interfaces, where the implementing class provides the method implementation.**
