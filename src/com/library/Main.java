package com.library;

import com.library.model.Book;
import com.library.model.Patron;
import com.library.repository.BookRepository;
import com.library.repository.PatronRepository;
import com.library.service.BookService;
import com.library.service.LendingService;
import com.library.service.PatronService;

public class Main {

    public static void main(String[] args) {

        // Create repositories
        BookRepository bookRepository = new BookRepository();
        PatronRepository patronRepository = new PatronRepository();

        // Create services
        BookService bookService = new BookService(bookRepository);
        PatronService patronService = new PatronService(patronRepository);
        LendingService lendingService = new LendingService(bookRepository, patronRepository);

        // Add books
        Book book1 = com.library.factory.BookFactory.createBook("Clean Code", "Robert Martin", "1111", 2008);
        Book book2 = com.library.factory.BookFactory.createBook("Effective Java", "Joshua Bloch", "2222", 2018);


        bookService.addBook(book1);
        bookService.addBook(book2);

        Patron patron1 = new Patron("P1", "Kundan Kumar", "kundan@email.com");
        patronService.registerPatron(patron1);

        Patron patron2 = new Patron("P2", "Rahul Sharma", "rahul@email.com");
        patronService.registerPatron(patron2);

        lendingService.checkoutBook("1111", "P1");
        lendingService.checkoutBook("1111", "P2");  // should reserve P2
        lendingService.returnBook("1111");
    }
}
