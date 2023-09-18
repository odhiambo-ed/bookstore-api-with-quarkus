package org.acme;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {
    @GET
    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Java for Beginers", "Edward", 2023, "Java"),
                new Book(1, "JavaScript for Beginers", "Edward", 2023, "JavaScript"),
                new Book(1, "Ruby for Beginers", "Edward", 2023, "Ruby"),
                new Book(1, "React for Beginers", "Edward", 2023, "React")
                );
    }
    
    //Count Books
    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks() {
        return getAllBooks().size();
    }
}
