//driver class
//program to demonstrate on JPA queries
package org.sjcem.client;

import org.sjcem.service.BookServiceImpl;
import org.sjcem.service.BookService;

public class Client {

	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
		
		System.out.println("book with specific id");
		System.out.println(service.getBookById(101));
		
		System.out.println("book with specific author");
		System.out.println(service.getAuthorBooks("Akash"));
		
		System.out.println("book with specific title");
		System.out.println(service.getBookByTitle("AI"));
		
		System.out.println("book count");
		System.out.println(service.getBookCount());
		
		System.out.println("book with specific price range");
		System.out.println(service.getBookByPrice(300, 500));
	}

}
