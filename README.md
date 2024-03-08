# Library_Management_System

Document for Console-Based Library Management System:

A Library Management System (LMS) is a software application designed to automate and manage the operations of a library. It helps librarians and library staff to efficiently organize, catalog, circulate, and manage library resources such as books, journals, multimedia, and other materials.
This project is a Library Management System developed in Java, following the MVC (Model-View-Controller) architecture. The MVC pattern is used to separate the concerns of the application into three main components:

• Model: The Model represents the data and business logic of the application. In this project, the Model includes two main entities: Book and Library. The Book entity represents a book with attributes such as name, price, and author name. The Library entity represents a library with attributes such as name, address, pincode, and a list of books.

• View: The View is responsible for presenting the data to the user and receiving user input. In this project, the View would include the user interface components such as forms, tables, and buttons used to interact with the system.

• Controller: The Controller acts as an intermediary between the Model and the View. It processes user input from the View, interacts with the Model to perform actions such as adding, removing, updating, and deleting books, and updates the View to reflect the changes.

Book:
Attributes:
BookName: A String variable representing the name or title of the book.
Author: A String variable representing the author of the book.
BookPrice: A double variable representing the price of the book.

Methods:
getBookName(): Returns the name of the book.
setBookName(String bookName): Sets the name of the book.
getAuthor(): Returns the author of the book.
setAuthor(String author): Sets the author of the book.
getBookPrice(): Returns the price of the book.
setBookPrice(double bookPrice): Sets the price of the book.
toString(): Overrides the toString() method to provide a string representation of the Book object.

