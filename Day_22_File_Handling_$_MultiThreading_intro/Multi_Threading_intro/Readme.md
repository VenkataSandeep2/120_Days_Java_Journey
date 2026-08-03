# 🚀 Java Full Stack Journey - Day 22

# Introduction to Multithreading in Java

> **"Multithreading allows a Java program to perform multiple tasks simultaneously, making applications faster, more responsive, and efficient."**

---

# 📚 Topics Covered

✅ What is Multithreading?

✅ What is a Process?

✅ What is a Thread?

✅ Why Multithreading?

✅ Process vs Thread

✅ Advantages of Multithreading

✅ Real-Time Examples

✅ Applications of Multithreading

✅ Interview Questions

---

# 🎯 Learning Objectives

After completing this chapter, you will be able to:

- Understand the concept of Multithreading.
- Differentiate between Process and Thread.
- Explain why Multithreading is important.
- Relate Multithreading to real-world applications.
- Answer basic Multithreading interview questions confidently.

---

# What is Multithreading?

**Multithreading** is the ability of a program to execute **multiple threads simultaneously** within a single process.

A thread is the **smallest unit of execution**.

Instead of performing one task after another, multiple tasks can run at the same time.

---

# Telugu Understanding 😊

Imagine your mother in the kitchen.

At the same time she is:

- 🍚 Cooking Rice
- 🍛 Preparing Curry
- ☕ Making Tea
- 📱 Talking on Phone

```text
Mother

↓

Cooking

↓

Tea

↓

Phone

↓

Cleaning
```

She is performing multiple tasks simultaneously.

This is similar to **Multithreading** in Java.

---

# What is a Process?

A **Process** is an independent program that is currently running in memory.

Examples:

- Google Chrome
- Eclipse IDE
- VS Code
- Spotify
- WhatsApp

Every running application is a **Process**.

---

# What is a Thread?

A **Thread** is the smallest unit of execution inside a process.

One process can have one or more threads.

Every Java application starts with one thread called the **Main Thread**.

---

# Process vs Thread

| Process | Thread |
|----------|---------|
| Independent Program | Smallest Execution Unit |
| Heavy Weight | Light Weight |
| Own Memory | Shares Process Memory |
| Slow to Create | Fast to Create |
| High Resource Usage | Low Resource Usage |

---

# Why Do We Need Multithreading?

Without Multithreading

```text
Download File

↓

Wait

↓

Play Music

↓

Wait

↓

Open Browser
```

Only one task executes at a time.

---

With Multithreading

```text
Download File

        ||

Play Music

        ||

Open Browser

        ||

Background Update
```

Multiple tasks execute simultaneously.

---

# Advantages of Multithreading

✅ Faster Program Execution

✅ Better CPU Utilization

✅ Improved Performance

✅ Better User Experience

✅ Resource Sharing

✅ Supports Background Tasks

---

# Real-Time Examples

### 🎥 YouTube

- Video Playing
- Audio Playing
- Comments Loading
- Suggestions Loading

---

### 💬 WhatsApp

- Sending Messages
- Receiving Messages
- Downloading Images
- Voice Calls

---

### 🏦 Banking Application

- Balance Check
- Money Transfer
- SMS Notification
- Transaction History

---

### 🛒 Online Shopping

- Product Search
- Payment Processing
- Order Tracking
- Notifications

---

### 📱 Mobile Phone

- Music Playing
- Internet Browsing
- Notifications
- Charging

---

# Applications of Multithreading

- Banking Applications
- Spring Boot Applications
- Android Apps
- Gaming
- Video Streaming
- Web Servers
- Cloud Applications
- File Download Managers
- Operating Systems
- Network Programming

---

# Most Asked Interview Questions

## 1. What is Multithreading?

**Answer:**

Multithreading is the process of executing multiple threads simultaneously within a single process to improve application performance and CPU utilization.

---

## 2. What is a Thread?

**Answer:**

A Thread is the smallest unit of execution inside a process.

---

## 3. What is a Process?

**Answer:**

A Process is an independent program running in memory that contains one or more threads.

---

## 4. Why is Multithreading used?

**Answer:**

Multithreading is used to perform multiple tasks simultaneously, improve application performance, efficiently utilize CPU resources, and provide a better user experience.

---

## 5. Give some real-time examples of Multithreading.

**Answer:**

- YouTube
- WhatsApp
- Banking Applications
- Online Shopping
- Android Applications
- Games
- Web Servers

---

## 6. What is the Main Thread?

**Answer:**

The Main Thread is the first thread created by the JVM that starts executing the `main()` method.

---

## 7. What is the difference between Process and Thread?

**Answer:**

A Process is an independent program, whereas a Thread is a lightweight execution unit within a process. Multiple threads share the same process resources.

---

# Quick Revision

```text
Process

↓

Thread

↓

Main Thread

↓

Multiple Threads

↓

Parallel Execution

↓

Better Performance

↓

Efficient CPU Usage
```

---

# Git Commit Summary

```text
feat(day-22): introduction to multithreading

✓ Introduction to Multithreading
✓ Process
✓ Thread
✓ Process vs Thread
✓ Advantages
✓ Real-Time Examples
✓ Interview Questions
✓ Quick Revision
```

---

# Today's Achievement 🏆

✅ Learned the basics of Multithreading

✅ Understood Process and Thread

✅ Learned why Multithreading is important

✅ Connected Multithreading with real-world applications

✅ Prepared for basic Java interview questions

---

# Next Topic

➡️ **Creating Threads in Java**

- Thread Class
- Runnable Interface
- `start()` Method
- `run()` Method
- Thread Life Cycle
- `sleep()`
- `join()`
- `yield()`
- Synchronization
- Real-Time Programs
- Interview Questions

---

```text
"One program can perform many tasks simultaneously using Multithreading."

"Today's goal is to understand the concept.
Tomorrow, we'll learn how to create and manage threads in Java."
```

### Happy Coding 🚀
