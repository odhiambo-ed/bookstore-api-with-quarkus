package org.acme;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private final List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return books;
    }

    public Book createBook(Book book) {
        books.add(book);
        return book;
    }
}
