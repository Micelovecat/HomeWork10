package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");

        System.out.println("lev.firstNameAuthor = " + tolstoy.getFirstNameAuthor());
        System.out.println("tolstoy.lastNameAuthor = " + tolstoy.getLastNameAuthor());


        Author dostoevsky = new Author("Федор","Достоевский");

        System.out.println("fedor.firstNameAuthor = " + dostoevsky.getFirstNameAuthor());
        System.out.println("dostoevsky.lastNameAuthor = " + dostoevsky.getLastNameAuthor());



        Book warAndPeace = new Book(tolstoy, "Война и мир", 1989);
        System.out.println("warAndPeace.name = " + warAndPeace.getName());
        System.out.println("warAndPeace.author = " + warAndPeace.getAuthor());
        System.out.println("warAndPeace.yearOfIssie = " + warAndPeace.getYearOfIssie());
        warAndPeace.setYearOfIssie(1994);
        System.out.println("warAndPeace.getYearOfIssie() = " + warAndPeace.getYearOfIssie());

        Book idiot = new Book(dostoevsky, "Идиот", 1990);
        System.out.println("idiot.name = " + idiot.getName());
        System.out.println("idiot.author = " + idiot.getAuthor());
        System.out.println("idiot.yearOfIssie = " + idiot.getYearOfIssie());
        idiot.setYearOfIssie(1991);
        System.out.println("idiot.getYearOfIssie() = " + idiot.getYearOfIssie());

    }
}
