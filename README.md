## Media Machine Application

> Built with Java | Object-Oriented Design | File I/O | Transaction Processing

A console-based Java system that simulates a transactional media vending platform with inventory management, purchase validation, audit logging, and automated sales reporting.
It models real-world transaction handling and inventory control through structured object-oriented design principles.

---

## Overview

The system demonstrates structured object-oriented architecture and controlled transaction processing in Java.

On startup, it:

* Loads inventory from `mediaInput.csv`
* Restores product quantities to their initial state
* Initializes transaction tracking and reporting components

The system manages the complete purchase lifecycle, including product validation, balance management, inventory updates, optimal change calculation, and financial audit logging.

---

## Supported Media Types

* Books
* Movies
* Albums
* Video Games
* Audio Books

Each product includes:

* Unique identifier
* Title
* Price
* Quantity
* Shared attributes (genre, release year)
* Category-specific attributes (author, director, platform, narrator, etc.)

Items with zero quantity are clearly marked **SOLD OUT** and cannot be purchased.

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
cd media-machine-java
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



