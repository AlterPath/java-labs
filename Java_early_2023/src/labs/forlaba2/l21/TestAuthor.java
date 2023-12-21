package labs.forlaba2.l21;

import labs.forlaba2.l21.Author;

import java.lang.*;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        String r;
        Author a1 = new Author("bulgakov", "bylg@yandex.ru", 'm');
        System.out.println(a1.toString());
        Scanner source = new Scanner(System.in);
        System.out.println("Введите почту: ");
        r = source.next();
        a1.setEmail(r);
        System.out.println(a1.toString());

    }
}