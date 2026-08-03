# 🚀 Java Full Stack Journey - Day 22

# Byte Stream in Java (Interview Preparation)

> **"Byte Streams are used to read and write binary data such as images, PDFs, videos, audio files, and text files."**

---

# 📚 Topics Covered

- ✅ Introduction to Byte Stream
- ✅ Why Byte Stream?
- ✅ FileInputStream
- ✅ FileOutputStream
- ✅ Reading One Byte
- ✅ Reading All Bytes
- ✅ Writing Data into File
- ✅ Copying File
- ✅ Deleting File
- ✅ Character Reading
- ✅ Real-Time Examples
- ✅ Interview Questions
- ✅ Quick Revision

---

# What is Byte Stream?

A **Byte Stream** is used to read and write data **one byte (8 bits) at a time**.

Byte Streams are mainly used for

- Images
- PDF Files
- Videos
- Audio Files
- Binary Files
- Text Files

Java provides Byte Stream classes in

```java
java.io
```

package.

---

# Telugu Understanding 😊

Imagine you are filling a water bottle.

Instead of pouring the whole bucket,

you pour water little by little.

```text
Water

↓

Small Quantity

↓

Bottle Filled
```

Similarly,

Byte Stream transfers

```text
File

↓

1 Byte

↓

1 Byte

↓

1 Byte

↓

Destination
```

---

# Why Byte Stream?

Without Byte Stream

```text
Cannot Read

Images

PDF

Videos

Audio
```

With Byte Stream

```text
Read

↓

Modify

↓

Write

↓

Save
```

---

# Byte Stream Hierarchy

```text
                Object
                   │
             InputStream
                   │
          FileInputStream


                Object
                   │
            OutputStream
                   │
         FileOutputStream
```

---

# FileInputStream

Used to read data from a file.

Example from the project

```java
FileInputStream fis =
        new FileInputStream("sample.txt");
```

---

# FileOutputStream

Used to write data into a file.

Example

```java
FileOutputStream fos =
        new FileOutputStream("sample.txt");
```

---

# Program 1 : Read One Byte

(Project: **ReadByte.java**)

Purpose

Read one character from a file.

Flow

```text
File

↓

FileInputStream

↓

read()

↓

ASCII Value

↓

Character
```

Real-Time Example

Reading the first character of a configuration file.

---

# Program 2 : Read All Bytes

(Project: **ReadAllByte.java**)

Purpose

Read complete file data.

Flow

```text
Text File

↓

FileInputStream

↓

Loop

↓

Display Entire File
```

Real-Time Example

Reading notes from a text file.

---

# Program 3 : Write into File

(Project: **WriteFile.java**)

Purpose

Create a file and store data.

Flow

```text
Program

↓

FileOutputStream

↓

write()

↓

Text File
```

Real-Time Example

Saving student details into a report.

---

# Program 4 : Read and Write File

(Project: **ReadWrite.java**)

Purpose

Copy one file into another.

Flow

```text
Source File

↓

Read

↓

Write

↓

Destination File
```

Real-Time Example

Backup System

```text
Original Resume

↓

Copy

↓

Backup Resume
```

---

# Program 5 : Delete File

(Project: **DeleteFile.java**)

Purpose

Delete an existing file.

Real-Time Example

Deleting temporary files after project completion.

---

# Program 6 : Character Reading

(Project: **ReadChar.java**)

Purpose

Read file data as characters.

Useful when handling

- Text Files
- Configuration Files
- Logs

---

# Real-Time Applications

### Banking

```text
Transaction Receipt

↓

Write into File
```

---

### Student Management

```text
Student Report

↓

Save into File
```

---

### Hospital

```text
Patient Record

↓

Read

↓

Update

↓

Save
```

---

### Online Shopping

```text
Invoice

↓

Generate

↓

Store
```

---

### Image Upload

```text
Image

↓

Read Bytes

↓

Upload

↓

Server
```

---

# Important Methods

## FileInputStream

```java
read()

available()

close()
```

---

## FileOutputStream

```java
write()

flush()

close()
```

---

# Why close()?

Always close the stream.

Otherwise

```text
Memory Leak

↓

Resource Wastage

↓

File Lock
```

---

# Exception Handling

Byte Streams throw

```text
IOException
```

Therefore

```java
try
{
}
catch(IOException e)
{
}
```

or

```java
throws IOException
```

---

# Byte Stream Flow

```text
File

↓

FileInputStream

↓

Program

↓

FileOutputStream

↓

New File
```

---

# Byte Stream vs Character Stream

| Byte Stream | Character Stream |
|-------------|------------------|
| Reads bytes | Reads characters |
| Images | Text Files |
| PDF | Text |
| Video | Characters |
| Binary Data | Unicode Data |

---

# Advantages

✅ Simple

✅ Fast

✅ Supports Binary Files

✅ Easy File Copy

✅ Supports Images

✅ Supports Audio

✅ Supports PDF

---

# Common Mistakes

❌ Forgetting close()

❌ Wrong file path

❌ Not handling IOException

❌ Reading after stream is closed

---

# Best Practices

✅ Always use try-catch

✅ Close streams

✅ Use try-with-resources (Java 7+)

✅ Handle IOException properly

---

# Most Asked Interview Questions

## 1. What is Byte Stream?

A Byte Stream reads and writes data **one byte (8 bits)** at a time using `InputStream` and `OutputStream`.

---

## 2. Why do we use Byte Streams?

To process binary data such as images, PDFs, audio, videos, and files.

---

## 3. What is FileInputStream?

`FileInputStream` is used to read bytes from a file.

---

## 4. What is FileOutputStream?

`FileOutputStream` is used to write bytes into a file.

---

## 5. Difference between Byte Stream and Character Stream?

| Byte Stream | Character Stream |
|-------------|------------------|
| Binary Data | Text Data |
| InputStream | Reader |
| OutputStream | Writer |

---

## 6. Which package contains Byte Stream classes?

```java
java.io
```

---

## 7. Which method reads data?

```java
read()
```

---

## 8. Which method writes data?

```java
write()
```

---

## 9. Why should we close streams?

To release system resources and prevent memory leaks or file locks.

---

## 10. Which exception is commonly thrown?

```text
IOException
```

---

## 11. Can Byte Streams read images?

Yes.

Images are binary files, so Byte Streams are suitable.

---

## 12. Can Byte Streams read PDF files?

Yes.

---

## 13. Which stream is used for copying files?

Use `FileInputStream` to read and `FileOutputStream` to write.

---

## 14. Which is faster for text?

Character Stream is generally preferred for text because it is designed for character data.

---

## 15. Which is better for binary files?

Byte Stream.

---

# Quick Revision

```text
Byte Stream

↓

InputStream

↓

FileInputStream

↓

read()

↓

OutputStream

↓

FileOutputStream

↓

write()

↓

close()

↓

IOException
```

---

# Git Commit Summary

```text
feat(day-22): learned byte stream in java

✓ Byte Stream
✓ FileInputStream
✓ FileOutputStream
✓ Read One Byte
✓ Read Complete File
✓ Write File
✓ Copy File
✓ Delete File
✓ Character Reading
✓ Real-Time Examples
✓ Interview Questions
✓ Quick Revision
```

---

# Today's Achievement 🏆

✅ Understood Byte Streams

✅ Learned FileInputStream

✅ Learned FileOutputStream

✅ Practiced Reading Files

✅ Practiced Writing Files

✅ Learned File Copy

✅ Learned File Delete

✅ Prepared for Java IO Interview Questions

---

# Next Topic

➡️ Character Streams (FileReader & FileWriter)

- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- Reading Text Files
- Writing Text Files
- Real-Time Examples
- Interview Questions

---

```text
"Byte Streams are the foundation of Java File Handling."

"Master FileInputStream and FileOutputStream to confidently work with binary files in Java."
```

### Happy Coding 🚀
