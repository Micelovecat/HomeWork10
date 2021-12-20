package ru.skypro;

import java.util.Objects;

public class Book {
    private final String name;
    private final String Author;
    private int yearOfIssie;

    public Book(String name, String Author, int yearOfIssie) {
        this.name = name;
        this.Author = Author;
        this.yearOfIssie = yearOfIssie;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getYearOfIssie() {
        return this.yearOfIssie;
    }

    public void setYearOfIssie(int yearOfIssie) {
        this.yearOfIssie = yearOfIssie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", yearOfIssie=" + yearOfIssie +
                '}';
    }
}
