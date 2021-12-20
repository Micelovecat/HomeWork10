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

        Book warAndPeace = new Book("Война и мир", "Л.Н. Толстой", 1989);
        warAndPeace.setYearOfIssie(1994);
        System.out.println(warAndPeace);

        Book idiot = new Book("Идиот", "Ф.М. Достоевский", 1990);
        idiot.setYearOfIssie(1991);
        System.out.println(idiot);


        Author authorFirstAndLastName1 = new Author("Лев", "Толстой");
        System.out.println(authorFirstAndLastName1);

        Author authorFirstAndLastName2 = new Author("Федор","Достоевский");
        System.out.println(authorFirstAndLastName2);
    }
}
