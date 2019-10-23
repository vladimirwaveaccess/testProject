package com.company.LS7OOP;

import java.util.Arrays;
import java.util.Objects;

public class Reader {
    private String name;
    private String libraryCard;
    private String faculty;
    private String birthday;
    private String phone;

    public Reader() {
    }

    public Reader(String name, String libraryCard, String faculty, String birthday, String phone) {
        this.name = name;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(String libraryCard) {
        this.libraryCard = libraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(name, reader.name) &&
                Objects.equals(libraryCard, reader.libraryCard) &&
                Objects.equals(faculty, reader.faculty) &&
                Objects.equals(birthday, reader.birthday) &&
                Objects.equals(phone, reader.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, libraryCard, faculty, birthday, phone);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", libraryCard='" + libraryCard + '\'' +
                ", faculty='" + faculty + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void takeBook(int bookCount) {
        System.out.printf("%s take %d bok(s)", getName(), bookCount);
    }

    public void takeBook(String... bookName) {
        System.out.printf("%s take book(s): %s", getName(), Arrays.toString(bookName));
    }

    public void takeBook(Book... books) {
        System.out.printf("%s take book(s): \n", getName());
        for (Book book: books) {
            System.out.println(book.getBookName());
        }
    }

    public void returnBook(int bookCount) {
        System.out.printf("%s is returned %d bok(s)", getName(), bookCount);
    }

    public void returnBook(String... bookName) {
        System.out.printf("%s is returned book(s): %s", getName(), Arrays.toString(bookName));
    }
}
