package practice_6.library;

import practice_6.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1994", "Оруелл"));
        library.addBook(new Book("Мартин Иден", "Лондон"));
        library.addBook(new Book("Онегин", "Пушкин"));
        // library.addBook(new Book("Онегин", "Пушкин"));

        try {
            library.findBook("344");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение!");
        }
    }
}
