# 🚀 Java Full Stack Journey — Day 24

# String, StringBuilder & StringBuffer — Interview Preparation

> **Focus:** The questions interviewers repeatedly ask about `String`, `StringBuilder`, and `StringBuffer`, with practical examples based on the programs practiced in this Day 24 project.

---

# 📚 What I Practiced Today

Based on the Day 24 project:

* `String` creation
* `String` constructors
* `length()`
* `isEmpty()`
* `charAt()`
* `equals()`
* `equalsIgnoreCase()`
* `contains()`
* `indexOf()`
* `lastIndexOf()`
* `startsWith()`
* `endsWith()`
* `trim()`
* `compareTo()`
* `compareToIgnoreCase()`
* `replace()`
* `substring()`
* `toUpperCase()`
* `toLowerCase()`
* `toCharArray()`
* `getBytes()`
* `StringBuilder`
* `StringBuffer`
* `append()`
* `insert()`
* `delete()`
* `replace()`
* `reverse()`
* `setCharAt()`
* `capacity()`
* `toString()`
* Thread safety
* Mutable vs immutable objects
* Real-time interview scenarios

---

# ⭐ First Interview Question: What is a String?

### Interview Answer

> A `String` in Java is an object that represents a sequence of characters. The `String` class is immutable, meaning that once a String object is created, its contents cannot be changed.

Example:

```java
String name = "Sandeep";
```

Here:

```text
"Sandeep"
    ↓
String Object
```

---

# ⭐ Why is String Immutable?

This is one of the **most frequently asked Java interview questions**.

Consider:

```java
String name = "Sandeep";

name.concat(" Kumar");

System.out.println(name);
```

Output:

```text
Sandeep
```

Why?

Because `concat()` does not modify the existing String.

It creates another String.

```text
"Sandeep"
    |
    | concat(" Kumar")
    ↓
"Sandeep Kumar"

Original "Sandeep" remains unchanged
```

If we write:

```java
name = name.concat(" Kumar");
```

then `name` refers to the newly created String.

---

# 🎯 Interview Answer: Why is String Immutable?

A strong answer:

> String is immutable in Java, meaning its value cannot be changed after creation. Immutability provides benefits such as security, thread-safety for shared String values, string-pool optimization, and stable hash codes, which are particularly useful when Strings are used as keys in hash-based collections.

---

# ⭐ String Pool

This is another **very important interview topic**.

When we write:

```java
String s1 = "Java";
String s2 = "Java";
```

Java can reuse the same pooled String object.

Conceptually:

```text
             String Pool
                 |
              "Java"
              /    \
             /      \
           s1        s2
```

This saves memory.

---

# String Literal vs `new String()`

Your project contains both styles.

### String Literal

```java
String s1 = "Sandeep";
```

### Using Constructor

```java
String s2 = new String("Sandeep");
```

The important interview point is that `new String(...)` explicitly creates a new String object, whereas a literal can use the String pool.

---

# ⭐ Most Asked: `==` vs `equals()`

### `==`

For objects, `==` compares references.

### `equals()`

For `String`, `equals()` compares the actual character content.

Example:

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
```

Conceptual output:

```text
false
true
```

### Interview Answer

> `==` compares object references, while `equals()` compares String contents.

---

# ⭐ `equals()` vs `equalsIgnoreCase()`

Your `String5` example demonstrates this.

```java
String s1 = "Hello";
String s2 = "hello";

System.out.println(s1.equals(s2));
```

Output:

```text
false
```

Because Java is case-sensitive.

But:

```java
System.out.println(s1.equalsIgnoreCase(s2));
```

Output:

```text
true
```

### Real-Time Example

Login systems may need case-sensitive or case-insensitive comparisons depending on the requirement.

---

# ⭐ What does `length()` do?

```java
String name = "Sandeep";

System.out.println(name.length());
```

It returns the number of characters.

```text
Sandeep
   ↓
7 characters
```

---

# ⭐ What does `charAt()` do?

Returns the character at a specified index.

```java
String name = "Sandeep";

System.out.println(name.charAt(0));
```

Output:

```text
S
```

Remember:

```text
S a n d e e p
0 1 2 3 4 5 6
```

### Interview Trap

If the index is outside the valid range:

```java
name.charAt(20);
```

it results in:

```text
StringIndexOutOfBoundsException
```

---

# ⭐ `substring()`

Your project uses:

```java
s1.substring(1);
```

and:

```java
s1.substring(1, 4);
```

Important:

```text
substring(start)

substring(start, end)
```

The `end` index is **exclusive**.

Example:

```java
String s = "Hello";

System.out.println(s.substring(1, 4));
```

Result:

```text
ell
```

Indexes:

```text
H e l l o
0 1 2 3 4
  |-----|
  1     4
```

Index `4` is not included.

---

# ⭐ `indexOf()` vs `lastIndexOf()`

Your project uses both.

```java
String s = "Hello";
```

```java
s.indexOf('l');
```

returns the first occurrence.

```java
s.lastIndexOf('l');
```

returns the last occurrence.

Concept:

```text
H e l l o
0 1 2 3 4

indexOf('l')      → 2
lastIndexOf('l')  → 3
```

---

# ⭐ `contains()`

Checks whether a sequence exists.

```java
String product = "Java Developer";

System.out.println(product.contains("Java"));
```

Output:

```text
true
```

### Real-Time Example

Searching for a product:

```text
"Samsung Galaxy Mobile"
```

Checking:

```java
contains("Mobile")
```

can tell whether the description contains that word.

---

# ⭐ `startsWith()` and `endsWith()`

Example:

```java
String email = "sandeep@gmail.com";

email.endsWith("@gmail.com");
```

This can be useful for simple validation logic.

Example:

```java
String file = "resume.pdf";

file.endsWith(".pdf");
```

---

# ⭐ `trim()`

Your project demonstrates:

```java
String s = "   Java Programming   ";

System.out.println(s.trim());
```

Output:

```text
Java Programming
```

`trim()` removes leading and trailing whitespace characters.

---

# ⭐ `replace()`

Example:

```java
String s = "Hello";

String result = s.replace('l', 'x');

System.out.println(result);
```

Output:

```text
Hexxo
```

Remember:

`String` is immutable.

So `replace()` returns a new String.

---

# ⭐ `compareTo()`

Your project contains:

```java
"Apple".compareTo("Ball");
```

The result indicates lexicographical ordering.

General rule:

```text
result < 0
    First String comes before second

result == 0
    Both are equal

result > 0
    First String comes after second
```

### Interview Question

**Does `compareTo()` return only -1, 0, or 1?**

### Answer

> No. It returns an integer whose sign indicates the ordering. You should generally check whether the result is less than, equal to, or greater than zero rather than expecting exactly -1 or 1.

---

# ⭐ `compareToIgnoreCase()`

Your project uses:

```java
s1.compareToIgnoreCase(s2);
```

It compares Strings lexicographically without considering case differences.

Example:

```java
"Java".compareToIgnoreCase("java");
```

Result:

```text
0
```

---

# ⭐ `toUpperCase()` and `toLowerCase()`

```java
String name = "Java";

System.out.println(name.toUpperCase());
```

Output:

```text
JAVA
```

And:

```java
System.out.println(name.toLowerCase());
```

Output:

```text
java
```

Again, these return new String values because String is immutable.

---

# ⭐ `toCharArray()`

Your project demonstrates:

```java
String s = "sand";

char[] chars = s.toCharArray();
```

Flow:

```text
String
  |
  v
toCharArray()
  |
  v
char[]
```

Useful when we need to process characters individually.

---

# ⭐ `getBytes()`

Your project demonstrates:

```java
byte[] bytes = s.getBytes();
```

It converts the String into bytes using the platform's default charset.

For production code where encoding matters, prefer specifying the charset explicitly.

---

# 🔥 Now the Most Important Topic

# String vs StringBuilder vs StringBuffer

This is one of the **most frequently asked questions in Java interviews**.

| Feature                               | String     | StringBuilder                | StringBuffer                                        |
| ------------------------------------- | ---------- | ---------------------------- | --------------------------------------------------- |
| Mutable?                              | ❌ No       | ✅ Yes                        | ✅ Yes                                               |
| Thread-safe?                          | Immutable  | ❌ No                         | ✅ Yes for its synchronized methods                  |
| Performance for repeated modification | Lower      | Usually fastest              | Usually slower than StringBuilder                   |
| Typical use                           | Fixed text | Single-threaded modification | Shared mutable text where synchronization is needed |
| Introduced                            | Java 1.0   | Java 5                       | Java 1.0                                            |

---

# ⭐ Why StringBuilder?

Suppose we repeatedly concatenate:

```java
String result = "";

result = result + "Java";
result = result + " Developer";
result = result + " Sandeep";
```

Because String is immutable, repeated modification can create many intermediate String objects.

For repeated modifications, use:

```java
StringBuilder sb = new StringBuilder();

sb.append("Java");
sb.append(" Developer");
sb.append(" Sandeep");
```

---

# Real-Time Example: Shopping Cart

Your ZIP contains:

```java
StringBuffer cart = new StringBuffer();

cart.append("Mobile");
cart.append(", ");
cart.append("Laptop");
cart.append(", ");
cart.append("Headphones");
```

Output:

```text
Cart : Mobile, Laptop, Headphones
```

This is a good example of a **mutable sequence**.

Instead of repeatedly creating new Strings, the builder/buffer can modify its existing character sequence.

---

# ⭐ StringBuilder

Your `StringBuilder_1` example demonstrates:

```java
StringBuilder sb = new StringBuilder("Java");
```

Then:

```java
sb.append(" Developer");
sb.insert(5, "Full Stack ");
sb.replace(5, 15, "Backend");
sb.delete(5, 12);
sb.charAt(0);
sb.setCharAt(0, 'j');
sb.length();
sb.capacity();
sb.indexOf("Developer");
sb.lastIndexOf("Developer");
sb.substring(0, 4);
sb.toString();
```

This is an excellent single example for interview preparation.

---

# `append()`

Adds content to the end.

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Developer");
```

Result:

```text
Java Developer
```

---

# `insert()`

Inserts content at a specified position.

```java
sb.insert(5, "Full Stack ");
```

Concept:

```text
Java Developer
     ↑
   insert
```

---

# `replace()`

Replaces the characters in the specified range.

```java
sb.replace(5, 12, "Backend");
```

Remember:

```text
start → inclusive
end   → exclusive
```

---

# `delete()`

Deletes characters between indexes.

```java
sb.delete(5, 12);
```

Again:

```text
start → inclusive
end   → exclusive
```

---

# `reverse()`

Your project uses:

```java
employee.reverse();
```

Example:

```text
Java
 ↓
avaJ
```

This is useful for simple reverse-string operations.

---

# `setCharAt()`

Changes a character at a specified index.

```java
StringBuilder sb = new StringBuilder("Java");

sb.setCharAt(0, 'j');
```

Result:

```text
java
```

This is possible because `StringBuilder` is mutable.

---

# ⭐ `length()` vs `capacity()`

Very important interview question.

### `length()`

Number of characters currently stored.

### `capacity()`

Amount of character storage available before the builder needs to expand its internal storage.

Example:

```java
StringBuilder sb =
    new StringBuilder("Java");

System.out.println(sb.length());
System.out.println(sb.capacity());
```

---

# ⭐ Default StringBuilder Capacity

For:

```java
new StringBuilder()
```

the initial capacity is **16** characters.

If you construct it with a String:

```java
new StringBuilder("Java")
```

the initial capacity is:

```text
16 + string length
```

So `"Java"` gives an initial capacity of:

```text
20
```

This is a common interview question.

---

# ⭐ StringBuffer

Your ZIP contains several StringBuffer examples.

Example:

```java
StringBuffer sb =
    new StringBuffer("Sai");

sb.append(" Kumar");

System.out.println(sb);
```

Output:

```text
Sai Kumar
```

---

# Why StringBuffer?

`StringBuffer` provides a mutable character sequence and its commonly used mutating methods are synchronized.

This makes it suitable when multiple threads may access and modify the same buffer and you need that built-in synchronization.

---

# StringBuilder vs StringBuffer

### Interview Answer

> Both are mutable character sequences. `StringBuilder` is generally preferred for single-threaded code because it has lower synchronization overhead. `StringBuffer` provides synchronized methods and is appropriate when built-in synchronization is required for shared mutable access.

---

# ⭐ Most Asked Question: Which is Faster?

### Answer

For ordinary single-threaded code:

```text
StringBuilder
```

is generally faster than:

```text
StringBuffer
```

because StringBuffer's relevant methods are synchronized.

### Interview wording

> StringBuilder is generally faster because it is not synchronized, while StringBuffer provides synchronization.

Do not simply say:

> "StringBuffer is always slow."

Performance depends on the actual workload and synchronization requirements.

---

# ⭐ Is StringBuilder Thread-Safe?

**No.**

`StringBuilder` is not synchronized.

If multiple threads modify the same instance concurrently, external synchronization or another concurrency mechanism may be required.

---

# ⭐ Is StringBuffer Thread-Safe?

Its methods are synchronized, so individual operations are synchronized.

But be careful with this interview point:

> Thread-safe methods do not automatically make every multi-step sequence of operations atomic.

For example:

```java
if (buffer.indexOf("Java") >= 0) {
    buffer.delete(...);
}
```

Multiple operations can still require external coordination if they must behave as one indivisible action.

---

# ⭐ String Immutability vs Builder Mutability

### String

```text
String
  |
  | modification
  v
New String
```

### StringBuilder

```text
StringBuilder
  |
  | modification
  v
Same mutable object
```

### StringBuffer

```text
StringBuffer
  |
  | modification
  v
Same mutable object
```

---

# 🌍 Real-Time Example 1 — Employee Details

Your ZIP contains:

```java
StringBuilder employee =
    new StringBuilder("Employee Details");

employee.append("\nName : Sandeep");
employee.append("\nRole : Java Developer");
employee.append("\nSkill : Java");
employee.append("\nExperience : Fresher");
```

This is a realistic example of dynamically building a report.

Flow:

```text
Employee Data
     |
     +-- Name
     |
     +-- Role
     |
     +-- Skill
     |
     +-- Experience
     |
     v
StringBuilder
     |
     v
Employee Report
```

---

# 🌍 Real-Time Example 2 — Shopping Cart

Your `StringBuffer_4` demonstrates:

```text
Mobile
Laptop
Mouse
```

Then:

```text
Insert Keyboard
       ↓
Find Laptop
       ↓
Delete Mouse
       ↓
Reverse
```

This is useful for understanding mutable text manipulation.

---

# 🌍 Real-Time Example 3 — SQL Query Construction

A common practical use of a mutable string sequence is constructing a query or request from many pieces.

Conceptually:

```java
StringBuilder query = new StringBuilder();

query.append("SELECT ");
query.append("name ");
query.append("FROM employee ");
query.append("WHERE department = 'IT'");
```

Result:

```text
SELECT name FROM employee WHERE department = 'IT'
```

**Important:** In real applications, SQL should generally use `PreparedStatement` rather than concatenating untrusted user input into SQL.

---

# 🌍 Real-Time Example 4 — Log Message Construction

```java
StringBuilder log = new StringBuilder();

log.append("User: Sandeep");
log.append(" | Action: Login");
log.append(" | Status: Success");
```

Result:

```text
User: Sandeep | Action: Login | Status: Success
```

This demonstrates why `StringBuilder` is useful when text is built incrementally.

---

# 🌍 Real-Time Example 5 — CSV Generation

```java
StringBuilder csv = new StringBuilder();

csv.append("Name,Role,Experience\n");
csv.append("Sandeep,Java Developer,1\n");
csv.append("Ravi,Tester,2\n");
```

The content can then be converted to:

```java
String result = csv.toString();
```

---

# ⭐ Why do we call `toString()`?

`StringBuilder` and `StringBuffer` are mutable objects.

Sometimes an API expects a `String`.

Therefore:

```java
String result = sb.toString();
```

converts the current contents into a `String`.

---

# 🔥 Top Interview Questions — Day 24

## 1. Why is String immutable?

**Answer:**

> String is immutable, so its value cannot change after creation. This supports security, string pooling, safe sharing, and stable hash-code behavior.

---

## 2. What is the String Pool?

**Answer:**

> The String Pool is a JVM-managed area for canonical String literals. When equal literals are reused, Java can share the same pooled String object instead of creating another one.

---

## 3. Difference between `==` and `equals()` for String?

**Answer:**

> `==` compares references, while `equals()` compares String contents.

---

## 4. Difference between String and StringBuilder?

**Answer:**

> String is immutable, while StringBuilder is mutable. StringBuilder is generally preferred when the same text needs repeated modification in a single-threaded context.

---

## 5. Difference between StringBuilder and StringBuffer?

**Answer:**

> Both are mutable. StringBuilder is not synchronized and is generally faster for single-threaded use. StringBuffer provides synchronized methods and is useful when built-in synchronization is required.

---

## 6. Which is faster: StringBuilder or StringBuffer?

**Answer:**

> StringBuilder is generally faster because it does not synchronize its methods.

---

## 7. Is StringBuilder thread-safe?

**Answer:**

> No. StringBuilder is not synchronized and is not thread-safe for concurrent modification.

---

## 8. Is StringBuffer thread-safe?

**Answer:**

> Its methods are synchronized, providing built-in synchronization for individual operations.

---

## 9. Why is StringBuilder mutable?

**Answer:**

> It is designed to modify a character sequence in place, avoiding the repeated creation of immutable String objects during many modifications.

---

## 10. What is the difference between `length()` and `capacity()`?

**Answer:**

> `length()` is the number of characters currently stored. `capacity()` is the current amount of character storage available before the internal storage needs to grow.

---

## 11. What is the default capacity of StringBuilder?

**Answer:**

> A no-argument StringBuilder starts with a capacity of 16 characters. When constructed from a String, its initial capacity is 16 plus the String's length.

---

## 12. What does `append()` do?

**Answer:**

> It adds data to the end of the existing mutable character sequence.

---

## 13. What does `insert()` do?

**Answer:**

> It inserts characters at a specified position.

---

## 14. What does `delete()` do?

**Answer:**

> It removes characters from a specified range. The starting index is inclusive and the ending index is exclusive.

---

## 15. What does `reverse()` do?

**Answer:**

> It reverses the current character sequence.

---

## 16. What does `setCharAt()` do?

**Answer:**

> It replaces the character at a specified index.

---

## 17. Why do we use `toString()` with StringBuilder?

**Answer:**

> To obtain a String representation of the current contents of the StringBuilder.

---

## 18. Does StringBuilder create a new object for every `append()`?

**Answer:**

> No. It is mutable and is designed to modify its internal character storage as needed. It may expand its internal storage when its capacity is insufficient.

---

## 19. Is String immutable but StringBuilder mutable?

**Answer:**

> Yes. A String's contents cannot be changed after creation, whereas StringBuilder and StringBuffer can modify their character sequences.

---

## 20. What happens when StringBuilder exceeds its capacity?

**Answer:**

> It automatically expands its internal storage so that additional characters can be accommodated.

---

# 🚨 Interview Traps

### Trap 1

**Question:** Is `StringBuilder` immutable?

❌ Wrong:

> Yes.

✅ Correct:

> No. StringBuilder is mutable.

---

### Trap 2

**Question:** Is `StringBuffer` always better because it is thread-safe?

❌ Wrong:

> Yes.

✅ Correct:

> Not necessarily. If synchronization is not required, StringBuilder is generally preferred because it has less synchronization overhead.

---

### Trap 3

**Question:** Does `run()` create a thread?

❌ Wrong:

> Yes.

That was yesterday's topic.

For Day 24, remember the related concurrency distinction:

```text
StringBuilder → not synchronized
StringBuffer  → synchronized methods
```

---

### Trap 4

**Question:** Does String `replace()` modify the original String?

❌ Wrong:

> Yes.

✅ Correct:

> No. String is immutable; `replace()` returns a new String.

---

# 📊 Interview Comparison

| Question                      | Key Point                                           |
| ----------------------------- | --------------------------------------------------- |
| Why String immutable?         | Security, pooling, safe sharing, stable hash        |
| `==` vs `equals()`            | Reference vs content                                |
| String vs StringBuilder       | Immutable vs mutable                                |
| StringBuilder vs StringBuffer | Unsynchronized vs synchronized                      |
| Faster?                       | StringBuilder generally                             |
| Thread-safe?                  | StringBuffer methods synchronized; StringBuilder no |
| `length()`                    | Current character count                             |
| `capacity()`                  | Current internal storage capacity                   |
| `append()`                    | Add at end                                          |
| `insert()`                    | Add at position                                     |
| `delete()`                    | Remove range                                        |
| `reverse()`                   | Reverse sequence                                    |
| `setCharAt()`                 | Modify one character                                |
| `toString()`                  | Convert current contents to String                  |

---

# 🧠 30-Second Interview Revision

If the interviewer says:

### "Explain String, StringBuilder and StringBuffer."

Say:

> `String` is immutable, so once created its contents cannot be modified. It is suitable when the text does not need repeated changes.
>
> `StringBuilder` is mutable and is generally preferred for repeated String modifications in single-threaded code because it avoids unnecessary String creation and does not synchronize its methods.
>
> `StringBuffer` is also mutable, but its methods are synchronized, so it provides built-in synchronization for individual operations and may have more overhead than StringBuilder.
>
> For example, when building an employee report or shopping cart dynamically, I would normally use StringBuilder. If shared mutable text requires the built-in synchronization provided by StringBuffer, I would consider StringBuffer.

---

# 🎯 If You Face the Same Question 9/10 Times

Memorize this table:

```text
String
   ↓
Immutable

StringBuilder
   ↓
Mutable
   ↓
Not synchronized
   ↓
Generally faster
   ↓
Single-threaded modification

StringBuffer
   ↓
Mutable
   ↓
Synchronized methods
   ↓
Generally more overhead
   ↓
When built-in synchronization is required
```

---

# ⚡ Final Quick Revision

```text
String
 ├── Immutable
 ├── String Pool
 ├── equals()
 ├── charAt()
 ├── substring()
 ├── indexOf()
 └── replace()

StringBuilder
 ├── Mutable
 ├── append()
 ├── insert()
 ├── replace()
 ├── delete()
 ├── reverse()
 ├── setCharAt()
 ├── length()
 ├── capacity()
 └── toString()

StringBuffer
 ├── Mutable
 ├── Synchronized methods
 ├── append()
 ├── insert()
 ├── delete()
 └── reverse()
```

---

# 🏆 Day 24 Achievement

* ✅ String fundamentals
* ✅ String immutability
* ✅ String Pool
* ✅ `==` vs `equals()`
* ✅ Important String methods
* ✅ StringBuilder
* ✅ StringBuffer
* ✅ Mutable vs immutable
* ✅ `length()` vs `capacity()`
* ✅ Builder operations
* ✅ Buffer operations
* ✅ Thread-safety difference
* ✅ Real-time examples
* ✅ Interview-focused questions

---

# 🔥 Interview Priority

### ⭐⭐⭐⭐⭐ Must Know

1. Why is String immutable?
2. What is String Pool?
3. `==` vs `equals()`
4. String vs StringBuilder
5. StringBuilder vs StringBuffer
6. Which is faster and why?
7. Is StringBuilder thread-safe?
8. Is StringBuffer thread-safe?
9. `length()` vs `capacity()`
10. Why use StringBuilder?

### ⭐⭐⭐⭐ Good to Know

11. `append()`
12. `insert()`
13. `replace()`
14. `delete()`
15. `reverse()`
16. `setCharAt()`
17. `substring()`
18. `indexOf()`
19. `toString()`
20. String methods such as `trim()`, `contains()`, `startsWith()`, and `endsWith()`

---

# 📌 Day 24 Git Commit

```text
feat(day-24): learned string stringbuilder and stringbuffer

- String fundamentals
- String immutability
- String pool
- String methods
- StringBuilder
- StringBuffer
- Mutable vs immutable
- Thread safety
- Real-time examples
- Interview preparation
```

---

> **Interview Golden Rule:**
> Don't answer only with definitions. Explain **concept → difference → small code example → real-time use case**. That demonstrates that you understand the topic rather than simply memorizing it.

### 🚀 Happy Coding — Day 24 Completed!
