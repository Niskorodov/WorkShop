package org.example.homework1.models;

import org.example.homework1.interfaces.Displayable;

public class Book implements Displayable {
    private String title;
    private String author;
    private int year;

    public Book(String number, String author) {
    }

    public String getTitle() {
        return title;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void display() {
        System.out.println("Book: " + title + " by " + author + ", Year: " + year);
    }
}
