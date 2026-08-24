# ScrapYard-API
# Java Scrapyard Management System (JDBC & MySQL)

A Java-based database management system for scrapyards and vehicle inventory processing. The application parses external text data, maps structured objects to a MySQL database via **JDBC**, and provides an interactive CLI menu system for database interaction.

This application was developed as an academic Java OOP & Database examination project.

---

## 🚀 Key Features

* **File Parsing & Data Ingestion:** Reads structured text files line-by-line using custom parsing logic and populates object models.
* **Object-Oriented Design:** 
  * Uses an abstract `Vehicle` superclass with specialized subclasses: `FossilCar`, `ElectricCar`, and `Motorcycle`.
  * Demonstrates inheritance, encapsulation, polymorphism, and dynamic list handling.
* **Secure JDBC Database Integration:**
  * Externalized database configuration using `Con.properties` to ensure credentials remain protected.
  * Dedicated `DatabaseManager` and `PropertiesProvider` classes for connection pooling and query execution.
* **CLI Menu System:** Interactive command-line interface allowing users to navigate scrapyard inventory and execute database queries.

---

## 🛠️ Tech Stack

* **Language:** Java (JDK 8+)
* **Database:** MySQL
* **Database Connectivity:** JDBC (`mysql-connector-j`)
* **IDE / Build Support:** IntelliJ IDEA, Eclipse, VS Code

---

##How to run the code in your MySQL

Ensure you have a running MySQL instance and create a database named scrapyarddb:
CREATE DATABASE scrapyarddb;

Create or edit the Con.properties file in the root directory with your local MySQL credentials:
host=localhost
db_name=scrapyarddb
port=3306
uname=YOUR_MYSQL_USERNAME
pwd=YOUR_MYSQL_PASSWORD

Execution order:
Run Main.java first: Parses the raw data file and populates the MySQL database tables.
Run Main2.java second: Launches the interactive CLI menu for navigating and managing scrapyards and vehicles.

---

## 📂 Project Structure

```text
├── src/
│   ├── models/          # Abstract Vehicle, FossilCar, ElectricCar, Motorcycle, Scrapyard
│   ├── database/        # DatabaseManager, PropertiesProvider (JDBC connection)
│   ├── utils/           # File Parser & Reader logic
│   ├── Main.java        # Part 1: Data parsing & MySQL insertion
│   └── Main2.java       # Part 2: Interactive CLI Menu System
├── Con.properties       # Database credentials configuration (Excluded from git)
└── README.md
