# BL-JAVAIO — Java I/O & File Operations System

A modular Java project designed to demonstrate core and advanced Java I/O (Input/Output) operations, file handling, stream processing, and data persistence using standard Java conventions and JUnit test-driven verification.

---

## 📌 Project Overview
This repository follows the **BridgeLabz Git Branching and Workflow Standard**, ensuring a clean separation between high-level project documentation, the core project skeleton, and modular feature implementations.

### 🎯 Objectives
- Implement robust File and Directory operations using `java.io` and `java.nio.file`.
- Handle data persistence, file reading/writing, and stream operations.
- Maintain test-driven reliability with JUnit test suites.
- Follow Gitflow best practices (`main` for documentation, `develop` for baseline structure, `feature/*` for isolated use case development).

---

## 🌿 Branching Strategy & Repository Structure

| Branch | Content | Purpose |
| :--- | :--- | :--- |
| **`main`** | `README.md` only | High-level project documentation, architecture overview, and daily progress logs. No source code. |
| **`develop`** | Clean project skeleton (`src/main/java`, `src/test/java`, `pom.xml`) | The integration branch containing the baseline structure ready for use case implementations. |
| **`feature/*`** | Use case specific implementation & tests | Isolated branch per usecase (e.g., `feature/uc1-file-operations`). Merged into `develop` once completed and tested. |

---

## 📋 Use Cases Covered

| Use Case | Description | Feature Branch | Status |
| :--- | :--- | :--- | :--- |
| **UC 1** | File Operations: Check file existence, delete file, create directory, create empty file, list files & directories with extension filter | `feature/uc1-file-operations` | ⏳ Pending |
| **UC 2** | Employee Payroll Service: Read and write employee payroll data to/from console and local files | `feature/uc2-payroll-service` | ⏳ Pending |
| **UC 3** | File Watch Service: Monitor directory changes (create, modify, delete events) using Java NIO WatchService | `feature/uc3-watch-service` | ⏳ Pending |
| **UC 4** | Employee Payroll File I/O: Write Employee Payroll data to a file, print entries, and count entries using Java Streams | `feature/uc4-file-io-operations` | ⏳ Pending |
| **UC 5** | File Analysis & Counting: Count lines, words, and characters in files using Java Streams | `feature/uc5-file-analysis` | ⏳ Pending |
| **UC 6** | CSV / JSON File I/O Handling: Reading and writing structured records using standard formats | `feature/uc6-csv-json-io` | ⏳ Pending |

---

## 🛠️ Development & Workflow Rules

1. **Feature Branch Creation**:
   Always branch off `develop`:
   ```bash
   git checkout develop
   git pull origin develop
   git checkout -b feature/<use-case-name>
   ```

2. **Testing & Verification**:
   Before merging, compile and run JUnit test cases:
   ```bash
   mvn test
   ```

3. **Merging into Develop**:
   Merge the tested feature branch into `develop`:
   ```bash
   git checkout develop
   git merge feature/<use-case-name>
   git push origin develop
   ```

---

## 📝 Daily Progress Log

### Day 01 — Setup & Initialization
- **What I have done:**
  - Initialized repository with standard branching strategy (`main`, `develop`, initial feature branches).
  - Configured `main` branch with comprehensive project documentation and use case mapping.
  - Setup clean Maven/Java project skeleton in `develop`.
- **What I will do:**
  - Begin implementation of UC 1 in `feature/uc1-file-operations`.
- **Issues faced:**
  - None. Clean setup established.
