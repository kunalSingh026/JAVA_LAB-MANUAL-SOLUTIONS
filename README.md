# ☕ Java Programming Lab Manual
### Netaji Subhas University, Jamshedpur

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![Repo Size](https://img.shields.io/github/repo-size/kunalSingh026/JAVA_LAB-MANUAL-SOLUTIONS?style=for-the-badge&color=blue)

> **Repository Description:** > This repository contains the complete collection of solutions for the Java Programming Lab Manual. Each program is optimized, commented, and tested to demonstrate core Java concepts ranging from basic algorithms to advanced OOPs, File I/O, and Exception Handling.

---

## 📂 Index of Programs

| Q# | Problem Statement | Solution File | Concepts Covered |
|:--:|:---|:---|:---|
| 1 | **Palindrome Check** (No built-in reverse) | [`PalindromeCheck.java`](./PalindromeCheck.java) | String Manipulation, Two-Pointer |
| 2 | **Matrix Transpose & Symmetry** | [`MatrixSymmetry.java`](./MatrixSymmetry.java) | 2D Arrays, Logic Building |
| 3 | **Overloading & Overriding** | [`OverloadingOverridingDemo.java`](./OverloadingOverridingDemo.java) | Polymorphism |
| 4 | **Dynamic Method Dispatch** | [`DynamicDispatchDemo.java`](./DynamicDispatchDemo.java) | Inheritance, Runtime Polymorphism |
| 5 | **Constructor Chaining** | [`ConstructorChainingDemo.java`](./ConstructorChainingDemo.java) | `this()`, `super()` |
| 6 | **String Anagram Check** | [`AnagramCheck.java`](./AnagramCheck.java) | Arrays, Sorting, String API |
| 7 | **Prime Numbers in Array** | [`PrimeArraySum.java`](./PrimeArraySum.java) | Arrays, Math Logic |
| 8 | **File Character Count** | [`FileStats.java`](./FileStats.java) | File I/O, Scanners |
| 9 | **Custom Exception (InvalidAge)** | [`CustomExceptionDemo.java`](./CustomExceptionDemo.java) | Exception Handling, `throw` |
| 10 | **Command-Line Calculator** | [`CommandLineCalculator.java`](./CommandLineCalculator.java) | CLI Args, Parsing |
| 11 | **Interface Implementation** | [`InterfaceDemo.java`](./InterfaceDemo.java) | Interfaces, Abstraction |
| 12 | **Abstract Class (Bank)** | [`AbstractBankDemo.java`](./AbstractBankDemo.java) | Abstract Classes, Inheritance |
| 13 | **Multiple Interfaces** | [`MultipleInterfaceDemo.java`](./MultipleInterfaceDemo.java) | Ambiguity Resolution |
| 14 | **Package Creation** | [`TestPackage.java`](./TestPackage.java) | User-defined Packages |
| 15 | **Super Keyword Usage** | [`SuperKeywordDemo.java`](./SuperKeywordDemo.java) | `super` keyword |
| 16 | **File Copy (Manual)** | [`FileCopyManual.java`](./FileCopyManual.java) | FileStreams, Byte Handling |
| 17 | **Object Serialization** | [`SerializationDemo.java`](./SerializationDemo.java) | `Serializable`, Object Streams |
| 18 | **Final Keyword Demo** | [`FinalDemo.java`](./FinalDemo.java) | Constants, Immutability |
| 19 | **String Compression** | [`StringCompression.java`](./StringCompression.java) | `StringBuilder`, Algorithms |
| 20 | **Modular Calculator** | [`ModularCalculator.java`](./ModularCalculator.java) | Methods, Switch-Case |

---

## 🚀 How to Run

### Standard Programs
For most files (Q1–Q13, Q15–Q20), open your terminal in the directory and run:

```bash
javac Filename.java
java Filename


# Compile the package first
javac geometry/Circle.java

# Compile and run the main program
javac TestPackage.java
java TestPackage

javac CommandLineCalculator.java
# Example Usage:
java CommandLineCalculator 10 + 20
java CommandLineCalculator 5 "*" 5
