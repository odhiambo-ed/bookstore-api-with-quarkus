package org.acme;

import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;

@Transactional
public class BookService {
    public List<Book> getAllBooks() {
        return Book.listAll();
    }

    public Book createBook(Book book) {
        book.persist();
        return book;
    }
}
