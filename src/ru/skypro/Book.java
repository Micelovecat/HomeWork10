package ru.skypro;

import java.util.Objects;

public class Book {
    private final String name;
    private String author;
    private int yearOfIssie;

    public Book(String name, String author, int yearOfIssie) {
        this.name = name;
        this.author = author;
        this.yearOfIssie = yearOfIssie;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return String.valueOf(this.author);
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
        return yearOfIssie == book.yearOfIssie && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfIssie);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssie=" + yearOfIssie +
                '}';
    }
}
