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

