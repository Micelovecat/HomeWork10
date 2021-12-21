package ru.skypro;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String name;
    private int yearOfIssie;

    public Book(Author author, String name, int yearOfIssie) {
        this.author = author;
        this.name = name;
        this.yearOfIssie = yearOfIssie;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfIssie() {
        return yearOfIssie;
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
