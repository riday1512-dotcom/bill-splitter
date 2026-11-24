# Java Bill Splitter

A clean, console-based Java utility that calculates individual share amounts when splitting a bill, factoring in custom tip amounts and basic input validation.

## Purpose
This project demonstrates core Java fundamentals in a practical, real-world scenario—taking dynamic user input from the terminal, validating edge cases, and performing accurate arithmetic calculations.

## Target Audience
- **Java Beginners:** Learners practicing object-oriented structure, method invocation, and `Scanner` input handling.
- **Students & Educators:** Anyone looking for a straightforward reference implementation of conditional logic (`if/else`) and division-by-zero prevention in Java.

## Key Learning Outcomes
- **User Input Handling:** Reading `double` and `int` values from standard input using `java.util.Scanner`.
- **Object-Oriented Basics:** Defining classes, instance methods (`billsplit()`), and instantiating objects inside `main()`.
- **Input Validation:** Safeguarding calculations against invalid entries (such as zero or negative headcounts and negative amounts).
- **Resource Management:** Properly closing `Scanner` streams to prevent resource leaks.

## Prerequisites
- **Java Development Kit (JDK):** Version 8 or higher installed and configured in your system `PATH`.

## Usage

### 1. Clone the Repository
```bash
git clone https://github.com
cd YOUR-REPO-NAME
```

### 2. Compile the Program
```bash
javac Bill.java
```

### 3. Run the Application
```bash
java Bill
```

### Sample Output
```text
Enter the bill Amount: 
1200
Enter the tip amount: 
150
Enter the number of people: 
3
Each person has to pay: 450.0
```

## Project Structure
```text
├── Bill.java      # Main source file containing input, validation, and split logic
└── README.md      # Project documentation
```

## Future Enhancements
- Support tip calculation by percentage in addition to fixed amounts.
- Format currency output to two decimal places (e.g., `₹450.00`).
- Migrate core logic into a native Android mobile application.
