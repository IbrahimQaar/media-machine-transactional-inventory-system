# Media Machine Application

 A console-based Java system that simulates a transactional media vending platform with inventory control, purchase validation, audit logging, and automated sales reporting.

---

## Overview

The Media Machine Application demonstrates disciplined object-oriented design and controlled transaction processing in Java.

On startup, the system:

* Loads inventory from `mediaInput.csv`
* Automatically restocks all media items
* Initializes transaction and reporting components

The application manages the complete purchase lifecycle including validation, balance tracking, inventory updates, optimal change calculation, and audit logging.

---

## Supported Media Types

* Books
* Movies
* Albums
* Video Games
* Audio Books

Each product contains:

* Unique identifier
* Title
* Price
* Quantity
* Shared attributes (genre, release year)
* Category-specific attributes (author, director, platform, narrator, etc.)

Items with zero quantity are clearly marked **SOLD OUT** and are restricted from purchase.

---

## Core Functionality

### Inventory Display

* Category-based filtering
* Structured tabular output
* Sold-out state validation

---

### Purchase Workflow

* Accepts denominations: `$1`, `$5`, `$10`, `$20`, `$50`
* Validates product selection
* Prevents invalid or insufficient-balance purchases
* Updates balance and inventory state
* Calculates optimal change using dollars, quarters, dimes, and nickels

---

### Transaction Logging

All financial activity is recorded in `Log.txt`.

Each entry includes:

* Timestamp
* Transaction type
* Processed amount
* Updated balance

---

### Sales Reporting

A hidden main menu option generates a timestamped sales report that:

* Aggregates total items sold per category
* Calculates total revenue per category
* Displays overall gross sales

---

## Architecture & Design

* Encapsulation of product data and transaction state
* Inheritance hierarchy with a shared `Product` base class
* Polymorphism across media categories
* Separation of concerns between UI, business logic, and data loading
* Business logic isolated from console interaction
* Classes structured for unit testing

---

## Running the Application

```bash
git clone https://github.com/IbrahimQaar/media-machine-application.git
cd media-machine-application
javac *.java
java Application
```

Or run using your preferred IDE.

---

## Documentation

Full system requirements are documented in:

```
PROJECT_SPEC.md
```

---

## Author

**Ibrahim Qaar**
Software Engineering


