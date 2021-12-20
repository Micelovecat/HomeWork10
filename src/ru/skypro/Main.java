package ru.skypro;

public class Main {



    public static void main(String[] args) {
        String nameWarAndPeace = "Война и мир";
        String authorWarAndPeace = "Л.Н. Толстой";   //лишний параметр, не входящий в условие задачи
        String firstNameAuthorWarAndPeace = "Лев";
        String lastNameAuthorWarAndPeace = "Толстой";
        int yearOfIssieWarAndPeace = 1996;

        String nameIdiot = "Идиот";
        String authorIdiot = "Ф.М. Достоевский";     //лишний параметр, не входящий в условие задачи
        String firstNameAuthorIdiot = "Федор";
        String lastNameAuthorIdiot = "Достоевский";
        int yearOfIssieIdiot = 1990;

        String[] names = {"Война и мир", "Идиот"};
        String[] authors = {"Л.Н. Толстой", "Ф.М. Достоевский"};   //лишний параметр, не входящий в условие задачи
        String[] firstNameAuthors = {"Лев", "Федор"};
        String[] lastNameAuthors = {"Толстой", "Достоевский"};
        int[] yearsOfIssie = {1996, 1990};

//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Произведение - " + names[i] + "/ /Автор - " + authors[i] + "/ /Имя автора - " + firstNameAuthors[i] + "/ /Фамилия автора - " + lastNameAuthors[i] + "/ /Год издания - " + yearsOfIssie[i]);
//
//        }

        Book warAndPeace = new Book("Война и мир", "Л.Н. Толстой", 1989);
//        System.out.println("warAndPeace.name = " + warAndPeace.getName());
//        System.out.println("warAndPeace.Author = " + warAndPeace.getAuthor());
//        System.out.println("warAndPeace.yearOfIssie = " + warAndPeace.getYearOfIssie());
        warAndPeace.setYearOfIssie(1994);
//        System.out.println("warAndPeace.getYearOfIssie() = " + warAndPeace.getYearOfIssie());
        System.out.println(warAndPeace);

        Book idiot = new Book("Идиот", "Ф.М. Достоевский", 1990);
//        System.out.println("idiot.name = " + idiot.getName());
//        System.out.println("idiot.Author = " + idiot.getAuthor());
//        System.out.println("idiot.yearOfIssie = " + idiot.getYearOfIssie());
        idiot.setYearOfIssie(1991);
//        System.out.println("idiot.getYearOfIssie() = " + idiot.getYearOfIssie());
        System.out.println(idiot);


        Author authorFirstAndLastName1 = new Author("Лев", "Толстой");

//        System.out.println("lev.firstNameAuthor = " + authorFirstAndLastName1.getFirstNameAuthor());
//        System.out.println("tolstoy.lastNameAuthor = " + authorFirstAndLastName1.getLastNameAuthor());

        System.out.println(authorFirstAndLastName1);

        Author authorFirstAndLastName2 = new Author("Федор","Достоевский");

//        System.out.println("fedor.firstNameAuthor = " + authorFirstAndLastName2.getFirstNameAuthor());
//        System.out.println("dostoevsky.lastNameAuthor = " + authorFirstAndLastName2.getLastNameAuthor());
        System.out.println(authorFirstAndLastName2);


    }
}
