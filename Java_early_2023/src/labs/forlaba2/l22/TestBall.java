package labs.forlaba2.l22;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        double x1;
        double y1;
        Ball a1 = new Ball(0, 0);
        System.out.println(a1.toString());
        Scanner source = new Scanner(System.in);
        System.out.println("Введите изменение координат: ");
        x1 = source.nextDouble();
        y1 = source.nextDouble();
        a1.move(x1, y1);
        System.out.println(a1.toString());
    }
}