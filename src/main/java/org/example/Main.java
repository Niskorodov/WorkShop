package org.example;


import org.example.homework1.models.*;
//import org.example.homework1.models.Book;
//import org.example.homework1.models.Student;


import org.example.homework2.*;
import org.example.homework2.Book;
import org.example.homework2.Student;
import org.example.task1.BankAccount;

import java.util.*;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println();
//        Book book1 = new Book("Преступление и наказание", "Фёдор Достоевский", 1866);
//        book1.display();
//        System.out.println();
//        Student student = new Student("Иван Иванов", "123", 4.5);
//        student.print();
//        System.out.println();
//        Point point = new Point(0, 0);
//        point.printPosition();
//        point.moveUp();
//        point.moveRight();
//        point.printPosition();
//        System.out.println();
//        Clock clock = new Clock(23, 59, 58);
//        clock.readTime();
//        clock.tick();
//        clock.readTime();
//        clock.tick();
//        clock.readTime();
//        System.out.println();
//        Car car = new Car("Toyota", "Camry", 2020);
//        car.drive(10);
//        car.start();
//        car.drive(10);
//        car.stop();
//        System.out.println();
        System.out.println("== Студенты ==");
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student("Иван Иванов", 1));
        studentManager.addStudent(new Student("Петр Петров", 2));
        System.out.println("Студенты: " + studentManager.getAllStudents());
        studentManager.removeStudentById(1);
        System.out.println("После удаления студента с ID=1: " + studentManager.getAllStudents());

        System.out.println("\n== Книги ==");
        BookCollection bookCollection = new BookCollection();
        Book b1 = new Book("Война и мир", "Толстой");
        Book b2 = new Book("Преступление и наказание", "Достоевский");
        bookCollection.addBook(b1);
        bookCollection.addBook(b2);
        System.out.println("Книги в коллекции: " + bookCollection.getAllBooks());
        bookCollection.removeBook(b1);
        System.out.println("После удаления книги: " + bookCollection.getAllBooks());

        System.out.println("\n== Товары ==");
        PriceList priceList = new PriceList();
        priceList.addProduct("Молоко", 50.0);
        priceList.addProduct("Хлеб", 30.0);

        System.out.println("Цена молока: " + priceList.getPrice("Молоко"));
        System.out.println("Цена хлеба: " + priceList.getPrice("Хлеб"));

        priceList.updatePrice("Молоко", 55.0);
        priceList.updatePrice("Хлеб", 35.0);

        System.out.println("Обновленная цена молока: " + priceList.getPrice("Молоко"));
        System.out.println("Обновленная цена хлеба: " + priceList.getPrice("Хлеб"));

        System.out.println("\n== Задачи ==");
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new Task("Сделать домашку", 2));
        taskManager.addTask(new Task("Пойти в магазин", 1));
        System.out.println("Задачи по приоритету: " + taskManager.getTasksSortedByPriority());
        List<Task> tasks = taskManager.getTasksSortedByPriority();
        if (!tasks.isEmpty()) {
            taskManager.removeTask(tasks.get(0));
        }
        System.out.println("После удаления задачи: " + taskManager.getTasksSortedByPriority());

        System.out.println("\n== Музыка ==");
        MusicLibrary musicLibrary = new MusicLibrary();
        MusicTrack t1 = new MusicTrack("Track1", "Artist1", "Rock");
        MusicTrack t2 = new MusicTrack("Track2", "Artist2", "Jazz");
        MusicTrack t3 = new MusicTrack("Track3", "Artist1", "Rock");
        musicLibrary.addTrack(t1);
        musicLibrary.addTrack(t2);
        musicLibrary.addTrack(t3);

        System.out.println("Рок треки: " + musicLibrary.getTracksByGenre("Rock"));
        musicLibrary.removeTrack(t1);
        System.out.println("Рок треки после удаления: " + musicLibrary.getTracksByGenre("Rock"));
    }
}