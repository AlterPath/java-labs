package labs.forlaba2.l27;

import javax.swing.*;
import java.util.Scanner;

public class Bookshelf {
    private Book[] books = new Book[20];
    private int i = 0;

    public void addExistingBook(Book book){
        books[i] = book;
        i++;
    }
    public void addBook(){
        Scanner source = new Scanner(System.in);
        System.out.println("Введите автора, год издания, название и жанр книги:");
        String author = source.nextLine();
        int year = source.nextInt();
        String name = source.nextLine();
        String genre = source.nextLine();
        Book book = new Book(author, year, name, genre);
        books[i] = book;
        i++;
    }
    public Bookshelf() {
    }

    public void newAndLate() {
        Book newest = new Book("AAA", 0, "Tales of aaa", "horror");
        Book latest = new Book("AAA", 10000, "Tales of aaa", "horror");
        for (int j = 0; j < i; j++) {
            if (books[j].getYearOfPubl() > newest.getYearOfPubl()) {
                newest = books[j];
            }
            if (books[j].getYearOfPubl() < latest.getYearOfPubl()) {
                latest = books[j];
            }
        }
        System.out.println("Самая недавняя книга:");
        System.out.println(newest.toString());
        System.out.println("Самася древняя книга: ");
        System.out.println(latest.toString());
    }
}

