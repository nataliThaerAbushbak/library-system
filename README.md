# Java Library Management System

This project is a console-based library management system developed using Java. It was created to demonstrate fundamental object-oriented programming concepts and basic data management operations through a simple library system.

The application allows books to be added, displayed, updated, and deleted from a library collection. Each book contains important information such as title, ID, author, publication year, and price.

---

## Features

- Add books to the library
- Delete books by title
- Display a specific book
- Display all books in the library
- Update book information
- Store book records using an `ArrayList`
- Validate unique book titles and IDs

---

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- HashSet
- Iterator
- Scanner
- Console-Based Application

---

## Project Structure

### `Book.java`

Represents the book object and stores book details such as:

- Title
- ID
- Author
- Year
- Price

This class also includes validation to prevent duplicate book titles and IDs.

### `Library.java`

Contains the main library operations, including:

- Adding books
- Deleting books
- Displaying one book
- Displaying all books
- Updating book information

The class uses an `ArrayList` to store book objects and an `Iterator` to remove books safely.

### `Assignment.java`

Contains the `main` method used to create book objects and test the library system operations.

---

## Concepts Demonstrated

This project applies several Java programming concepts, including:

- Classes and objects
- Constructors
- Encapsulation
- Inheritance
- ArrayList-based storage
- HashSet validation
- Iterators
- Exception handling
- User input using Scanner
- CRUD operations

---

## How the System Works

The system creates book objects and stores them inside a library collection. Each book has a title and ID, and the program checks that these values are not duplicated.

The library class manages the collection using an `ArrayList`. Users can add books, delete books by title, display a specific book, display all books, and update existing book information.

---

## Sample Operations

```java
Book b1 = new Book("Phisics", "123");
b1.setAuthor("author 1");
b1.setPrice(30);
b1.setYear(2007);

Library l1 = new Library();

l1.add(b1);
l1.displayAll();
l1.update("Mathmatic");
l1.delete("English");
```

---

## Purpose of the Project

The purpose of this project is to practice Java object-oriented programming through a simple and understandable library management example.

It demonstrates how objects can be created, stored, searched, updated, and removed from a collection. The project also provides practice with validation, user input, and basic data organization.

---

## How to Run

1. Download or clone the repository.
2. Open the project in a Java IDE such as NetBeans, IntelliJ IDEA, or Eclipse.
3. Make sure the files are inside the same package.
4. Compile and run `Assignment.java`.
5. Follow the console output and input prompts.

---

## Academic Context

This project was developed as an academic Java programming exercise. It focuses on applying object-oriented design, collection handling, and basic CRUD functionality in a console-based system.
