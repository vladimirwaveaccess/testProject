package com.company.LS7OOP;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader = new Reader("Student1", "AD123456", "IT", "10.10.2000", "0571236547");
        Book book1 = new Book("author1", "book1");
        Book book2 = new Book("author2", "book2");
        Book book3 = new Book("author3", "book3");
        Book book4 = new Book("author4", "book4");

        reader.takeBook(book1, book2, book3, book4);
    }
}
