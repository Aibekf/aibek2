# Assignment 2 — Vehicle Management System

## Project Overview

This project is a **Vehicle Management System** developed in Java to demonstrate core **Object-Oriented Programming (OOP)** concepts such as **inheritance**, **abstraction**, **composition**, and **aggregation**.

The system is built around an abstract `Vehicle` superclass with multiple concrete subclasses (`Car`, `Motorcycle`, `Truck`). Each vehicle can be associated with a `Driver`, showing real-world relationships between objects.

Key OOP concepts used:

* **Inheritance**: Common behavior is defined in the `Vehicle` superclass and reused by subclasses.
* **Abstraction**: The `Vehicle` class is abstract and defines abstract methods that must be implemented by subclasses.
* **Method Overriding**: Each vehicle type provides its own implementation of engine behavior.
* **Composition & Aggregation**: Vehicles have drivers, and one driver may operate multiple vehicles.

---

## Class Hierarchy

### Superclass

**Vehicle (abstract)**

* Fields: `brand`, `year`, `driver`
* Abstract methods: `startEngine()`, `stopEngine()`
* Concrete method: `displayInfo()`

### Subclasses

**Car**

* Additional fields: `doors`, `fuelType`
* Overrides engine methods

**Motorcycle**

* Additional field: `hasSidecar`
* Overrides engine methods

**Truck**

* Additional fields: `capacity`, `numAxles`
* Overrides engine methods

### Driver Class

**Driver**

* Fields: `name`, `licenseNumber`
* Method: `displayDriverInfo()`

The `Driver` class demonstrates:

* **Composition**: Each `Vehicle` has a `Driver` object
* **Aggregation**: One `Driver` can be associated with multiple vehicles

---

## UML Class Diagram

```
              +------------------+
              |    Vehicle       |
              |------------------|
              | # brand: String  |
              | # year: int      |
              | # driver: Driver |
              |------------------|
              | + startEngine()  |
              | + stopEngine()   |
              | + displayInfo()  |
              +---------▲--------+
                        |
        -----------------------------------
        |                |                |
+---------------+ +---------------+ +---------------+
|      Car      | |  Motorcycle   | |     Truck     |
|---------------| |---------------| |---------------|
| - doors       | | - hasSidecar  | | - capacity    |
| - fuelType    | |               | | - numAxles    |
|---------------| |---------------| |---------------|
| startEngine() | | startEngine() | | startEngine() |
| stopEngine()  | | stopEngine()  | | stopEngine()  |
+---------------+ +---------------+ +---------------+

              +------------------+
              |      Driver      |
              |------------------|
              | - name           |
              | - licenseNumber  |
              |------------------|
              | displayDriverInfo|
              +------------------+
```

---

## Instructions to Compile and Run

From the `src` directory, run:

```bash
javac *.java
java Main
```

---

## Reflection

Inheritance significantly simplified the system design by allowing common vehicle properties and behaviors to be defined once in the abstract `Vehicle` class. This reduced code duplication and made the system easier to extend with new vehicle types.

Method overriding allowed each subclass to provide its own specific engine behavior while still following a common interface. The main challenge was correctly using protected and private access modifiers to maintain encapsulation while allowing subclasses to access required data.
