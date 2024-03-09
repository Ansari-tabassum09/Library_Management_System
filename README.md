# Library_Management_System

Document for Console-Based Library Management System:

A Library Management System (LMS) is a software application designed to automate and manage the operations of a library. It helps librarians and library staff to efficiently organize, catalog, circulate, and manage library resources such as books, journals, multimedia, and other materials.
This project is a Library Management System developed in Java, following the MVC (Model-View-Controller) architecture. The MVC pattern is used to separate the concerns of the application into three main components:

• Model: The Model represents the data and business logic of the application. In this project, the Model includes two main entities: Book and Library. The Book entity represents a book with attributes such as name, price, and author name. The Library entity represents a library with attributes such as name, address, pincode, and a list of books.

• View: The View is responsible for presenting the data to the user and receiving user input. In this project, the View would include the user interface components such as forms, tables, and buttons used to interact with the system.

• Controller: The Controller acts as an intermediary between the Model and the View. It processes user input from the View, interacts with the Model to perform actions such as adding, removing, updating, and deleting books, and updates the View to reflect the changes.

Book:

Attributes:

• bookName: Name of the book  
• bookPrice: Price of the book  
• authorName: Name of the author  

Methods:

• getBookName(): Returns the name of the book  
• setBookName(String bookName): Sets the name of the book  
• getBookPrice(): Returns the price of the book  
• setBookPrice(double bookPrice): Sets the price of the book  
• getAuthorName(): Returns the name of the author  
• setAuthorName(String authorName): Sets the name of the author  
• toString(): Returns a string representation of the book  

Library

• Attributes:-

• libraryName: Name of the library    
• libraryAddress: Address of the library    
• pincode: Pincode of the library location  
• books: List of books in the library  

• Methods:-

• getBooks(): Returns the list of books in the library  
• setBooks(List<Book> books): Sets the list of books in the library  
• getLibraryName(): Returns the name of the library  
• setLibraryName(String libraryName): Sets the name of the library  
• getLibraryAddress(): Returns the address of the library  
• setLibraryAddress(String libraryAddress): Sets the address of the library  
• getPincode(): Returns the pincode of the library location  
• setPincode(int pincode): Sets the pincode of the library location  

Functionality:

• Add a book to the library 

• Update book details 

• Remove a book from the library 

• Retrieve book details 

Screenshot of user interaction:
The application will greet you with a welcome message and prompt you to enter the library:
![image](https://github.com/Ansari-tabassum09/Library_Management_System/assets/126712690/606a79df-981c-468c-93e7-205961758f41)


Add Book:
![image](https://github.com/Ansari-tabassum09/Library_Management_System/assets/126712690/006a1040-1f89-450a-acd2-a45ed01f37a5)


Removed Book:
![image](https://github.com/Ansari-tabassum09/Library_Management_System/assets/126712690/43c8cec1-e7cf-4e71-9393-e173523c25a6)


Get Book:
![image](https://github.com/Ansari-tabassum09/Library_Management_System/assets/126712690/51ca42f2-bda7-4e71-9336-34f2c1567e8c)


Update Book:
![image](https://github.com/Ansari-tabassum09/Library_Management_System/assets/126712690/a252042d-7806-4862-800a-6139b3b2a02e)




