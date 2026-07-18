# 🚀 Java Full Stack Journey - Day 16 Revision

# `this` Keyword, `super` Keyword & Parent Class Constructor

---

# 📚 Topics Covered

* ✅ What is `this` keyword?
* ✅ Why do we use `this`?
* ✅ `this` with Constructor
* ✅ Real-Time Examples
* ✅ What is `super` keyword?
* ✅ Access Parent Class Variables
* ✅ Call Parent Class Constructor using `super()`
* ✅ Constructor Execution Flow
* ✅ Interview Questions
* ✅ Quick Revision

---

# What is `this` Keyword?

`this` is a **reference variable** that refers to the **current object**.

Whenever we create an object, Java automatically provides a `this` reference.

---

# Telugu Understanding 😄

Imagine your classroom.

Teacher says:

```text
Sandeep, come here.
```

Only **Sandeep** should respond.

Similarly,

```java
this.name
```

means

```text
Current object's name.
```

---

# Why do we use `this`?

Suppose constructor parameters and instance variables have the same names.

Without `this`:

```java
class Employee
{
    int id;

    Employee(int id)
    {
        id = id;
    }
}
```

Both `id` variables refer to the constructor parameter.

The instance variable never gets updated.

---

Correct:

```java
this.id = id;
```

Meaning:

```text
Current Object's id = Constructor Parameter id
```

---

# Example (Your Program)

```java
class Employee
{
    int id;
    String name;

    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
```

---

# Dry Run

Object Creation

```java
Employee emp =
new Employee(101,"Ravi");
```

Java internally thinks like this

```text
this.id = 101

this.name = "Ravi"
```

Object becomes

```text
id =101

name = Ravi
```

---

# Output

```text
id -> 101

name -> Ravi
```

---

# Telugu Understanding 😄

Think of a bank account.

```text
Current Customer

↓

Current Account

↓

Current Balance
```

`this` always refers to the **current object**.

---

# Another Example

```java
Student stu =
new Student("Sandeep","CSE");
```

Constructor

```java
this.name=name;

this.course=course;
```

Output

```text
Student name -> Sandeep

Student course -> CSE
```

---

# What is `super` Keyword?

`super` refers to the **parent class object**.

It is used to access:

* Parent variables
* Parent methods
* Parent constructors

---

# Telugu Understanding 😄

Imagine:

```text
Father 👨

↓

Son 👦
```

Son can ask help from father.

Similarly,

Child class can access parent members using `super`.

---

# Access Parent Variables

Your Program

```java
class Person
{
    String name="Sandeep";

    int age=21;
}

class Student extends Person
{
    void display()
    {
        System.out.println(super.name);

        System.out.println(super.age);
    }
}
```

Output

```text
Sandeep

21
```

---

# Dry Run

Student object created

↓

Student searches for `name`

↓

`super.name`

↓

Parent class variable printed.

---

# `super` with Variables

Example

```java
class Animal
{
    String colour="White";
}

class Dog extends Animal
{
    String colour="Brown";

    void display()
    {
        System.out.println(colour);

        System.out.println(super.colour);
    }
}
```

Output

```text
Brown

White
```

---

# Explanation

```java
colour
```

Current class variable.

---

```java
super.colour
```

Parent class variable.

---

# Telugu Understanding 😄

Suppose

Father Bike

↓

White

Son Bike

↓

Brown

If son says

```java
colour
```

Brown

If son says

```java
super.colour
```

White

---

# Calling Parent Constructor

Your Program

```java
class Person
{
    Person()
    {
        System.out.println("Parent class constructor");
    }
}

class Student extends Person
{
    Student()
    {
        super();

        System.out.println("Child class constructor");
    }
}
```

---

Object Creation

```java
Student st=new Student();
```

Output

```text
Parent class constructor

Child class constructor
```

---

# Constructor Execution Flow

```text
Student Object Created

↓

super()

↓

Parent Constructor Executes

↓

Child Constructor Executes

↓

Object Ready
```

---

# Telugu Understanding 😄

Imagine constructing a house.

First

```text
Foundation
```

Then

```text
First Floor
```

Foundation is the Parent.

First Floor is the Child.

Parent constructor always executes first.

---

# Real-Time Example

```java
class Car
{
    Car()
    {
        System.out.println("Car Created");
    }
}

class FuelCar extends Car
{
    FuelCar()
    {
        super();

        System.out.println("Fuel Car Ready");
    }
}
```

Output

```text
Car Created

Fuel Car Ready
```

---

# Constructor Calling Order

```text
Object Creation

↓

Parent Constructor

↓

Child Constructor

↓

Methods Can Be Called
```

Example

```java
FuelCar fc=new FuelCar();

fc.drive();

fc.fuel();
```

Output

```text
Car Created

Fuel Car Ready

Petrol Filling
```

---

# Difference between `this` and `super`

| this                                 | super                                |
| ------------------------------------ | ------------------------------------ |
| Refers to current object             | Refers to parent object              |
| Access current class variables       | Access parent variables              |
| Calls current constructor (`this()`) | Calls parent constructor (`super()`) |
| Used inside current class            | Used in child class                  |

---

# Common Mistakes ❌

### Forgetting `this`

Wrong

```java
id=id;
```

Correct

```java
this.id=id;
```

---

### Calling `super()` after another statement

Wrong

```java
System.out.println("Hello");

super();
```

Compilation Error ❌

---

Correct

```java
super();

System.out.println("Hello");
```

`super()` must be the **first statement** inside a constructor.

---

# Interview Questions 🔥

### What is `this` keyword?

It refers to the current object.

---

### Why do we use `this`?

To differentiate instance variables from constructor parameters.

---

### What is `super`?

It refers to the parent class object.

---

### Why is `super()` used?

To call the parent class constructor.

---

### When is `super()` executed?

Automatically before the child constructor (if not written explicitly, Java inserts it when possible).

---

### Can we access parent variables using `super`?

Yes.

Example

```java
super.name;
```

---

### Can `this` and `super` be used together?

Yes, but `this()` and `super()` constructor calls cannot both be the first statement in the same constructor.

---

### Which constructor executes first?

```text
Parent Constructor
```

Then

```text
Child Constructor
```

---

# Quick Revision 🚀

```text
this
↓

Current Object

this.variable
↓

Current Class Variable

super
↓

Parent Object

super.variable
↓

Parent Variable

super()
↓

Calls Parent Constructor

Constructor Order
↓

Parent

↓

Child
```

---

# Git Commit Summary

```text
feat(day-16): learned this and super keyword

✓ this keyword
✓ super keyword
✓ Parent constructor
✓ Constructor execution flow
✓ Variable access
✓ Constructor calling
✓ Interview questions
✓ Quick revision
```

---

```text
"this means 'my current object'."

"super means 'my parent object'."

"Parent constructor always runs before child constructor."

Happy Coding 🚀
```

