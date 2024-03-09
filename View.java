package com.jsp.lms_view;

import java.util.Scanner;

import com.jsp.lms_controller.Controller;
import com.jsp.lms_model.Book;
import com.jsp.lms_model.Library;

public class View {
	
	 static private Library library = new  Library();
	 
	 
	 public static Library getLibrary() {
		return library;
	}
	public static void setLibrary(Library library) {
		View.library = library;
	}
	
	static Controller controller = new Controller();
	
	static Scanner myInput = new Scanner(System.in);
	 
	 static {
		 System.out.println("----- Welcome to us -----");
		 
		 System.out.print("Enter name of the library: ");
		 String libraryName = myInput.nextLine();
		 library.setLibraryName(libraryName);
		 
		 System.out.print("Enter address of library: ");
		 library.setLibraryAddress(myInput.nextLine());
		 
		 System.out.print("Enter pincode: ");
		 library.setPincode(myInput.nextInt());
		 myInput.nextLine();
		 
	 }
	 public static void main(String[] args) {
		
		 do {
			 System.out.println("Select option to perform:");
			 System.out.println("1.Add Book:\n 2.Remove Book:\n 3.Update Book:\n 4.Get Book: \n 0.Exit: ");
			 System.out.println("Enter the appropriate desired option: ");
			 int userchoice = myInput.nextByte();
			 myInput.nextLine();
			 
			 switch (userchoice) {
			 
			 case 0:
				 myInput.close();
				 System.out.println("------E X I T E D------- ");
				 System.exit(0);

				break;
					
			case 1:
				Book book = new Book();
				System.out.println("Enter the name of book:");
				String bookname = myInput.nextLine();
				book.setBookName(bookname);
				
				System.out.println("Enter the auther of the book:");
				book.setAuthor(myInput.nextLine());
				
				System.out.println("Enter the price:");
				book.setBookPrice(myInput.nextDouble());
			
				controller.addBook(book);
				
				
				break;
				
			case 2:
				System.out.println("Enter the book name to be removed:");
				String booktoRemove = myInput.nextLine();
				if (controller.removeBook(booktoRemove)) {
					System.out.println("removed");
					
				} else {
					System.out.println("not exited!");

				}

				break;

			case 3:
				System.out.println("Enter the book name to update:");
				Book bookExist = controller.getBook(myInput.nextLine());
				Book bookToUpdate = bookExist;
				if (bookExist != null) {
					System.out.println("What to update:");
					System.out.println("1.Book Name:\n2.Author Name:\n3.Book Price:");
					System.out.println("Enter desired option");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					switch (updateChoice) {
					case 1:
						System.out.println("Enter book name to update:");
						String newBookName = myInput.nextLine();
						break;
                    case 2:
                    	System.out.println("Enter Author name to update:");
						String newAuthorName = myInput.nextLine();
						
						break;
                    case 3:
	                      System.out.println("Enter book price ");
	                      double newBookPrice = myInput.nextDouble();
	                      myInput.nextLine();
	                      bookExist.setBookPrice(newBookPrice);
	             
	                   break;

					default:
						System.out.println("-----INVALID SELECTION-----");
						break;
					}
				}
				else {
                    System.out.println("Book does not exit, it can not be updated!");
				}
				if (controller.update(bookExist, bookToUpdate)) {
					System.out.println("updation completed successfully");
				} else {
					System.out.println("failed updation");
				}

				break;

			case 4:
				System.out.println("Enter book name you are looking for:");
				Book fetchBook = controller.getBook(myInput.nextLine());
				if (fetchBook != null) {
					System.out.println("Book is available:");
					System.out.println("Details:");
					System.out.println(fetchBook);
				}
				else {
					System.out.println("Book is not available:");
				}

				break;


			default:
				System.out.println("Invalid Selection:5");
				break;
			}
			
		} while (true);		 
	}

}
