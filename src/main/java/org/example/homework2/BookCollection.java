package org.example.homework2;

import java.util.HashSet;
import java.util.Set;

public class BookCollection {
    private Set<Book> books = new HashSet<>();

    public boolean addBook(Book book) {
        return books.add(book);
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public boolean containsBook(Book book) {
        return books.contains(book);
    }

    public Set<Book> getAllBooks() {
        return new HashSet<>(books);
    }
}
