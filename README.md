# Java-Flexisaf-Intenship-Backend


# ☕ Java Internship Tasks — Week 1 & 2

Welcome to my Java Internship project repository! This contains hands-on Java practice and SQL database exercises completed during **Week 1 and Week 2** of the internship. I'm using **Java (JDK 17 & 21)** on **Ubuntu** via **VS Code**, and integrating version control with **GitHub**.

---

## ✅ Week 1 Tasks

### 1️⃣ Generic Counter with Java Generics
A program that counts elements in a collection that satisfy a given property (e.g. odd numbers, prime numbers, palindromes).

**File**: `GenericCounter.java`

---

### 2️⃣ Using Iterator Interface
Loops through a collection using the Iterator interface and removes specific words or characters.

**File**: `IteratorExample.java`

---

### 3️⃣ Custom Java Annotation
Defined a custom annotation called `@EnhancementRequest` with elements like `id`, `synopsis`, `engineer`, and `date`.

- **Defaults**:  
  `engineer = "unassigned"`  
  `date = "unknown"`

**Files**:
- `EnhancementRequest.java`
- `LoginEnhancement.java`
- `AnnotationReader.java`

---

### 4️⃣ Month Length Checker
Displays the number of days in each month for a given year, considering leap years.

**File**: `MonthLengths.java`

---

### 5️⃣ List Mondays in a Month
Lists all Mondays for a given month in the current year using `LocalDate`.

**File**: `MondaysInMonth.java`

---

### 6️⃣ Friday the 13th Checker
Checks if a specific month and year contain a Friday the 13th.

**File**: `FridayThe13thChecker.java`

---

## ✅ Week 2 Tasks

### 1️⃣ Custom Exception Handling
Creates and handles a custom exception (`InvalidAgeException`) in Java.

**File**: `CustomExceptionExample.java`

---

### 2️⃣ SQL Database Creation and Operations (MySQL + SQLite)

**Database**: `flexi`

**Table**: `users`  
**Fields**:
- `id` (Primary Key)
- `first_name`
- `last_name`
- `address`
- `occupation`
- `reg_date`

**SQLite Version of Queries**:
```sql
CREATE TABLE users (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL,
    address TEXT,
    occupation TEXT,
    reg_date TEXT
);

INSERT INTO users (first_name, last_name, address, occupation, reg_date)
VALUES ('Timothy', 'Royalty', 'Wuse Market', 'Laravel Dev', '2025-05-13');

UPDATE users
SET occupation = 'Pharmacist'
WHERE first_name = 'Gift';

DELETE FROM users
WHERE first_name = 'Timothy';

SELECT * FROM users;
