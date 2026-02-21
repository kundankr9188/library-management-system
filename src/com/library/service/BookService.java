package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public void removeBook(String isbn) {
        bookRepository.removeBook(isbn);
    }

    public Book searchByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    public List<Book> searchByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
