package com.library.repository;

import com.library.model.Book;

import java.util.*;

public class BookRepository {

    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public Book findByIsbn(String isbn) {
        return books.get(isbn);
    }

    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public Collection<Book> getAllBooks() {
        return books.values();
    }
}
