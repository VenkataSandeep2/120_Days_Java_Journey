# 🚀 Java Full Stack Journey — Day 23

# Multithreading in Java — Interview Preparation

> **Goal:** Understand Multithreading from the examples practiced in this project and explain the concepts confidently in a Java interview.

---

## 📚 Topics Covered

* What is Multithreading?
* Process vs Thread
* Main Thread
* Creating a Thread using `Thread`
* Creating a Thread using `Runnable`
* `run()` vs `start()`
* Thread Scheduling
* Thread Names
* Thread Life Cycle
* `getState()`
* `sleep()`
* `join()`
* `yield()`
* `InterruptedException`
* Multiple Threads
* Real-Time Thread Examples
* Deadlock Introduction
* Most Asked Interview Questions

---

# 1. What is Multithreading?

**Interview Answer:**

> Multithreading is the process of executing multiple threads concurrently within a single process. It allows an application to perform multiple tasks independently and improves responsiveness and resource utilization.

A **Thread** is the smallest unit of execution.

### Simple Flow

```text
Java Application
       |
       +------ Main Thread
       |
       +------ Thread-1
       |
       +------ Thread-2
       |
       +------ Thread-3
```

Your ZIP contains examples where multiple threads are started together, such as `Main_2`, `Main_8`, and `Test_2`.

---

# 2. What is a Process?

A **Process** is an independent program running in memory.

Example:

```text
Chrome
Eclipse
VS Code
Spotify
```

Each running application can be considered a process.

A process can contain multiple threads.

```text
Process
   |
   +-- Thread 1
   +-- Thread 2
   +-- Thread 3
```

---

# 3. Process vs Thread

| Process                                  | Thread                                                   |
| ---------------------------------------- | -------------------------------------------------------- |
| Independent running program              | Smallest execution unit                                  |
| Heavyweight                              | Lightweight                                              |
| Has its own memory space                 | Threads share process resources                          |
| More expensive to create                 | Less expensive to create                                 |
| Communication is comparatively expensive | Communication is easier through shared process resources |

### Interview Answer

> A process is an independent program, whereas a thread is a lightweight execution unit inside a process. Multiple threads can exist within one process.

---

# 4. Main Thread

Every Java application starts execution from the `main()` method.

```java
public static void main(String[] args)
```

The JVM creates the **main thread** to execute this method.

Your project repeatedly demonstrates the relationship between the main thread and newly created threads.

Example:

```java
System.out.println("Main thread");
```

while another thread performs work.

---

# 5. Creating a Thread by Extending Thread

One example in your ZIP is:

```java
public class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread Runn....");
    }
}
```

Then:

```java
MyThread t = new MyThread();

t.start();
```

### Flow

```text
MyThread
   |
extends Thread
   |
override run()
   |
create object
   |
start()
   |
JVM schedules thread
   |
run()
```

---

# 6. Why do we Override `run()`?

`run()` contains the task that the new thread should execute.

Example from your project:

```java
@Override
public void run()
{
    System.out.println("Playing Song...");
}
```

The thread's work is written inside `run()`.

---

# 7. Most Important: `start()` vs `run()`

This is a **very common interview question**.

## `start()`

```java
t.start();
```

`start()` asks the JVM to start a new thread. The JVM then invokes the thread's `run()` method.

## `run()`

```java
t.run();
```

Calling `run()` directly is just a normal method call. It does **not** create a new thread.

### Interview Answer

> `start()` creates a new thread of execution and eventually invokes `run()`. Calling `run()` directly does not create a new thread; it executes the method in the current thread.

---

# 8. Your ZIP Example — `run()` and `start()`

Your `exp_1/Test_1.java` contains:

```java
MyThread t = new MyThread();

t.run();

t.start();
```

This is a very useful learning example.

### First

```java
t.run();
```

Normal method call.

```text
main thread
    |
    +---- run()
```

### Then

```java
t.start();
```

New thread is started.

```text
main thread
    |
    +---- Thread object
             |
             +---- run()
```

### Interview Trap 🚨

If interviewer asks:

**"Does calling `run()` create a new thread?"**

Answer:

> No. Calling `run()` directly does not create a new thread. It behaves like a normal method call. We use `start()` to begin a separate thread of execution.

---

# 9. Runnable Interface

Your ZIP also contains examples using:

```java
implements Runnable
```

Example:

```java
public class Exp_5 implements Runnable
{
    public void run()
    {
        System.out.println("Runnable in the Sup");
    }
}
```

Then:

```java
Exp_5 exp = new Exp_5();

Thread t1 = new Thread(exp);

t1.start();
```

### Flow

```text
Runnable Object
      |
      v
Thread Object
      |
      v
start()
      |
      v
run()
```

---

# 10. Thread vs Runnable

### Extending Thread

```java
class MyThread extends Thread
{
    public void run()
    {
        // task
    }
}
```

### Implementing Runnable

```java
class MyTask implements Runnable
{
    public void run()
    {
        // task
    }
}
```

Then:

```java
Thread t = new Thread(new MyTask());

t.start();
```

### Interview Answer

> `Runnable` is generally preferred when the class needs to inherit from another class because Java supports single class inheritance. It also separates the task from the thread object.

---

# 11. Thread Names

Your project demonstrates:

```java
t1.setName("Thread -1");
t2.setName("Thread - 2");
```

You can retrieve the name using:

```java
getName()
```

Example:

```java
System.out.println(getName());
```

Another example from your project creates threads with names through the `Thread` constructor:

```java
public MyThread_2(String name)
{
    super(name);
}
```

Then:

```java
MyThread_2 t1 = new MyThread_2("San");
```

### Interview Question

**How can you set a thread name?**

Answer:

> We can use `setName()` or provide the name through a `Thread` constructor.

---

# 12. Multiple Threads

Your `thread_Schedular/Test_2.java` creates five threads:

```java
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
```

Conceptually:

```text
Main Thread
     |
     +---- Thread 1
     |
     +---- Thread 2
     |
     +---- Thread 3
     |
     +---- Thread 4
     |
     +---- Thread 5
```

The order in which these threads execute is **not something you should assume from the order of `start()` calls**.

---

# 13. Thread Scheduling

The JVM and underlying operating system determine when runnable threads get CPU time.

Your project demonstrates this using multiple threads and `getName()`.

Example:

```java
System.out.println(getName() + " " + i);
```

Possible output ordering can vary.

### Interview Answer

> Thread scheduling determines which runnable thread gets CPU time. The exact execution order should not be assumed unless the program explicitly coordinates the threads.

---

# 14. Thread Life Cycle

A simplified interview-friendly view is:

```text
        NEW
         |
       start()
         |
         v
     RUNNABLE
         |
         |
     CPU Scheduling
         |
         v
     RUNNING
      /   |   \
     /    |    \
 sleep() join() lock
   |      |      |
   v      v      v
TIMED   WAITING BLOCKED
WAITING
     \    |    /
      \   |   /
       RUNNABLE
          |
       completed
          |
          v
     TERMINATED
```

### Important

In Java's official `Thread.State`, there is no separate `RUNNING` enum constant.

The JVM represents both ready-to-run and currently executing threads under:

```text
RUNNABLE
```

This is an important interview detail.

---

# 15. `getState()`

Your project uses:

```java
System.out.println(s.getState());
```

Example:

```java
Student_7 s = new Student_7();

System.out.println("Before start: " + s.getState());

s.start();
```

Before `start()`:

```text
NEW
```

After starting, the thread may be:

```text
RUNNABLE
```

After completing:

```text
TERMINATED
```

---

# 16. Thread States

Java's `Thread.State` contains:

```text
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED
```

### Quick Meaning

| State         | Meaning                                        |
| ------------- | ---------------------------------------------- |
| NEW           | Thread created but not started                 |
| RUNNABLE      | Eligible to run / running under JVM's model    |
| BLOCKED       | Waiting to acquire a monitor lock              |
| WAITING       | Waiting indefinitely for another thread/action |
| TIMED_WAITING | Waiting for a specified period                 |
| TERMINATED    | Execution completed                            |

---

# 17. `Thread.sleep()`

Your ZIP contains several `sleep()` examples.

Example:

```java
Thread.sleep(1000);
```

This pauses the **currently executing thread** for approximately the specified duration.

Example from your countdown:

```java
for(int i = 5; i >= 1; i--)
{
    System.out.println("Countdown : " + i);

    Thread.sleep(1000);
}
```

Output conceptually:

```text
Countdown : 5
     ↓
1 second
     ↓
Countdown : 4
     ↓
1 second
     ↓
Countdown : 3
```

### Real-Time Example

Your `FoodDelivery_6` example models:

```text
Order Accepted
       ↓
    2 seconds
       ↓
Food Prepared
       ↓
    2 seconds
       ↓
Food Delivered
```

This is a simple way to understand a delayed operation.

---

# 18. Important Interview Question: Does `sleep()` release the lock?

**Answer:**

> No. `Thread.sleep()` does not release a monitor lock held by the thread. The thread enters `TIMED_WAITING`, but it keeps any monitor locks it already owns.

This is a very important distinction between `sleep()` and mechanisms such as `wait()`.

---

# 19. `InterruptedException`

Your `sleep()` examples handle:

```java
catch(InterruptedException e)
{
    System.out.println(e);
}
```

`Thread.sleep()` can throw `InterruptedException`.

Therefore code that calls it must handle or declare that checked exception.

---

# 20. `join()`

Your `Main_7` and `Main_9` examples use:

```java
s.join();
```

`join()` makes the current thread wait until the target thread completes.

### Flow

```text
Main Thread
     |
     | start Student Thread
     v
Student Thread
     |
     | performs task
     v
Student Thread finishes
     |
     v
Main Thread continues
```

### Real-Time Example

Imagine:

```text
Download Report

       ↓

Wait for Download to Finish

       ↓

Open Report
```

That is the basic idea behind `join()`.

---

# 21. `yield()`

Your `Download_8` example uses:

```java
Thread.yield();
```

`yield()` is a scheduling hint that the current thread is willing to give other runnable threads an opportunity to execute.

### Important Interview Answer

> `yield()` is only a hint to the scheduler. It does not guarantee that another thread will run immediately.

---

# 22. `sleep()` vs `join()` vs `yield()`

| Method    | Purpose                                                                    |
| --------- | -------------------------------------------------------------------------- |
| `sleep()` | Pause current thread for a specified time                                  |
| `join()`  | Wait for another thread to finish                                          |
| `yield()` | Hint that current thread is willing to let another runnable thread execute |

---

# 23. Real-Time Example from Your ZIP — Music App

Your `exp_3` example:

```java
class MyThread_3 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Playing Song...");
    }
}
```

Main:

```java
MyThread_3 t3 = new MyThread_3();

t3.start();

System.out.println("Music App Opened");
```

Concept:

```text
Music Application
       |
       +---- Start music task
       |
       +---- Continue application
```

The exact console ordering can vary because thread scheduling is not deterministic.

---

# 24. Real-Time Example — File Download

Your project contains:

```text
Download_8
```

and:

```java
getName() + " Downloading " + i
```

This demonstrates multiple download-like tasks:

```text
File-A
  |
  +---- Downloading

File-B
  |
  +---- Downloading
```

Two thread objects can perform their work concurrently.

---

# 25. Real-Time Example — Student Study

Your `Student_9` example:

```java
System.out.println("Student thread started");

Thread.sleep(2000);

System.out.println("Study material downloaded");
```

Concept:

```text
Student Thread
      |
      v
Start
      |
      v
Wait / Download Simulation
      |
      v
Study Material Downloaded
```

Then `join()` is used by the main thread to wait for completion.

---

# 26. Real-Time Example — Food Delivery

Your `FoodDelivery_6` example:

```text
Order Accepted
      |
      v
Food Prepared
      |
      v
Food Delivered
```

The program uses `sleep()` between stages to simulate time-consuming operations.

This is useful for understanding how a thread can pause while performing a task.

---

# 27. Deadlock Introduction

Your ZIP also contains a `deadlock` package.

It demonstrates two resources:

```text
Resource-1
Resource-2
```

and two threads:

```text
Thread-1
Thread-2
```

The concept is:

```text
Thread-1
   |
 locks Resource-1
   |
 waits for Resource-2


Thread-2
   |
 locks Resource-2
   |
 waits for Resource-1
```

This can lead to:

```text
Thread-1 → waiting
Thread-2 → waiting

      ↓

   DEADLOCK
```

### Interview Definition

> Deadlock is a situation where two or more threads are permanently waiting for resources held by each other, so none of them can proceed.

---

# 28. Four Conditions for Deadlock

The classic necessary conditions are:

```text
1. Mutual Exclusion
2. Hold and Wait
3. No Preemption
4. Circular Wait
```

### Easy Memory Trick

```text
M H N C

Mutual
Hold
No Preemption
Circular
```

---

# 29. Most Important Interview Questions ⭐⭐⭐⭐⭐

These are the questions I would prioritize from your Day 23 material.

---

## Q1. What is Multithreading?

**Expected Interview Answer:**

> Multithreading is the concurrent execution of multiple threads within a process. It helps applications perform multiple independent tasks efficiently and improves responsiveness and resource utilization.

---

## Q2. What is the difference between `start()` and `run()`?

**Expected Answer:**

> `start()` starts a new thread and causes the JVM to invoke `run()`. Calling `run()` directly is only a normal method call and does not create a new thread.

### One-Line Memory

```text
start() → New Thread
run()   → Normal Method Call
```

---

## Q3. What is the difference between Thread and Runnable?

**Expected Answer:**

> `Thread` is a class that represents a thread, while `Runnable` represents the task to be executed. Using `Runnable` is often preferred because the class can still extend another class.

---

## Q4. What is `sleep()`?

**Expected Answer:**

> `sleep()` pauses the currently executing thread for a specified amount of time and puts it into `TIMED_WAITING`. It does not release locks held by the thread.

---

## Q5. What is `join()`?

**Expected Answer:**

> `join()` makes the current thread wait until another thread completes its execution.

---

## Q6. What is `yield()`?

**Expected Answer:**

> `yield()` is a scheduling hint indicating that the current thread is willing to give other runnable threads an opportunity to execute. It is not guaranteed.

---

## Q7. What are the states of a Java Thread?

**Expected Answer:**

```text
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED
```

---

## Q8. What is the difference between `sleep()` and `join()`?

**Expected Answer:**

> `sleep()` pauses the current thread for a specified duration, whereas `join()` makes the current thread wait for another thread to complete.

---

## Q9. Does `sleep()` release the lock?

**Expected Answer:**

> No. `sleep()` does not release a monitor lock held by the sleeping thread.

---

## Q10. Can we call `start()` twice on the same Thread object?

**Expected Answer:**

> No. A thread can be started only once. Calling `start()` again on the same Thread object results in `IllegalThreadStateException`.

---

## Q11. Can we call `run()` multiple times?

**Expected Answer:**

> Yes, as a normal method call, `run()` can be invoked multiple times, but those calls do not create new threads.

---

## Q12. What happens if we call `run()` instead of `start()`?

**Expected Answer:**

> The `run()` method executes in the current thread. No new thread is created.

---

## Q13. What is the Main Thread?

**Expected Answer:**

> The main thread is the thread that starts execution of a Java application's `main()` method.

---

## Q14. What is Thread Scheduling?

**Expected Answer:**

> Thread scheduling is the mechanism by which the JVM and operating system determine which runnable thread gets CPU execution time.

---

## Q15. Is thread execution order guaranteed?

**Expected Answer:**

> No. Without explicit coordination, the exact execution order of multiple threads should not be assumed.

---

## Q16. What is Deadlock?

**Expected Answer:**

> Deadlock occurs when two or more threads wait indefinitely for resources held by each other.

---

## Q17. What are the four conditions required for deadlock?

**Expected Answer:**

```text
Mutual Exclusion
Hold and Wait
No Preemption
Circular Wait
```

---

## Q18. Why do we use Multithreading?

**Expected Answer:**

> To perform multiple tasks concurrently, improve application responsiveness, and make better use of available system resources.

---

## Q19. Can multiple threads share data?

**Expected Answer:**

> Yes. Threads within the same process can share process resources. When shared mutable data is accessed concurrently, proper synchronization or other concurrency mechanisms may be required.

---

## Q20. What exception does `sleep()` throw?

**Expected Answer:**

> `Thread.sleep()` can throw `InterruptedException`, which is a checked exception.

---

# 🎯 Top 5 Questions to Memorize First

If the interviewer asks only a few Multithreading questions, be especially ready for:

```text
1. start() vs run()

2. Thread vs Runnable

3. sleep() vs join()

4. Thread Life Cycle / Thread States

5. What is Deadlock?
```

These are the questions you should be able to explain with both **definition + example**.

---

# 🧠 Interview Answer Formula

When an interviewer asks a Multithreading question, use:

```text
Definition
    ↓
Difference / Purpose
    ↓
Small Code Example
    ↓
Real-Time Example
```

Example:

### Interviewer:

**What is `join()`?**

### Strong Answer:

> `join()` is a method used when one thread needs to wait for another thread to complete. For example, if a report must be downloaded before it is opened, the main thread can call `downloadThread.join()` and continue only after the download thread finishes.

This style is much stronger than giving only a one-line definition.

---

# ⚡ Quick Revision Cheat Sheet

```text
Thread
  ↓
Smallest unit of execution

start()
  ↓
Starts new thread

run()
  ↓
Contains thread task

Runnable
  ↓
Represents task

sleep()
  ↓
TIMED_WAITING

join()
  ↓
Wait for another thread

yield()
  ↓
Scheduling hint

getState()
  ↓
Returns Thread.State

Multiple Threads
  ↓
Concurrent execution

Deadlock
  ↓
Threads waiting for each other's resources
```

---

# 📌 Day 23 Project Mapping

| Project Example    | Concept                        |
| ------------------ | ------------------------------ |
| `exp_1`            | `Thread`, `run()`, `start()`   |
| `exp_2`            | Thread execution               |
| `exp_3`            | Real-time music example        |
| `exp_4`            | Download simulation            |
| `thread_LifeCycle` | Thread states and lifecycle    |
| `Count`            | `sleep()`                      |
| `FoodDelivery_6`   | `sleep()` + real-time workflow |
| `Student_7`        | `join()`                       |
| `Student_9`        | `sleep()` + `join()` + states  |
| `Download_8`       | `yield()` + multiple threads   |
| `thread_Schedular` | Thread names and scheduling    |
| `commmm.exp_4`     | `Runnable`                     |
| `deadlock`         | Deadlock introduction          |

---

# 🏆 Day 23 Achievement

```text
✅ Multithreading Introduction
✅ Process vs Thread
✅ Main Thread
✅ Thread Class
✅ Runnable Interface
✅ start()
✅ run()
✅ Thread Names
✅ Thread Scheduling
✅ Thread States
✅ sleep()
✅ join()
✅ yield()
✅ InterruptedException
✅ Multiple Threads
✅ Deadlock Introduction
✅ Real-Time Examples
✅ Interview Preparation
```

---

# 🔥 Final Interview Revision

Remember these five lines:

```text
start() → creates/starts a new thread of execution

run() → contains the task; direct call is normal method execution

sleep() → pauses current thread; does NOT release monitor locks

join() → current thread waits for another thread to finish

yield() → scheduling hint, NOT a guarantee
```

And remember:

```text
Thread
   ↓
Runnable
   ↓
start()
   ↓
run()
   ↓
Thread executes
   ↓
sleep / wait / block when applicable
   ↓
run() completes
   ↓
TERMINATED
```

> **Interview Tip:** Don't just memorize definitions. For every Multithreading question, explain **what it does + a small example + one real-world use case**. That is the level expected in a practical Java interview.
