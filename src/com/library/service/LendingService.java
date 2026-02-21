package com.library.service;

import com.library.model.Book;
import com.library.model.Loan;
import com.library.model.Patron;
import com.library.repository.BookRepository;
import com.library.repository.PatronRepository;
import java.util.logging.Logger;

public class LendingService {

    private static final Logger logger = Logger.getLogger(LendingService.class.getName());
    private BookRepository bookRepository;
    private PatronRepository patronRepository;

    public LendingService(BookRepository bookRepository, PatronRepository patronRepository) {
        this.bookRepository = bookRepository;
        this.patronRepository = patronRepository;
    }

    public void checkoutBook(String isbn, String patronId) {
        Book book = bookRepository.findByIsbn(isbn);
        Patron patron = patronRepository.findById(patronId);

        if (book == null || patron == null) {
            logger.warning("Invalid book or patron.");
            return;
        }

        if (!book.isAvailable()) {
            logger.info("Book is not available. Adding to reservation list.");
            book.addObserver(patron);
            return;
        }

        book.setAvailable(false);
        Loan loan = new Loan(book, patron);
        patron.addLoan(loan);

        logger.info("Book checked out successfully.");
    }

    public void returnBook(String isbn) {
        Book book = bookRepository.findByIsbn(isbn);

        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            logger.info("Book returned successfully.");

            book.notifyObservers("The book '" + book.getTitle() + "' is now available.");
        }
    }
}
