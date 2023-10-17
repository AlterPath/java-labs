package labs.forlaba2.l26;

import labs.forlaba2.l25.Dog;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        System.out.println("Введите координаты и радиус первого круга:");
        int x1 = source.nextInt();
        int y1 = source.nextInt();
        int r1 = source.nextInt();
        Circle c1 = new Circle(x1, y1, r1);

        System.out.println("Введите координаты и радиус второго круга:");
        int x2 = source.nextInt();
        int y2 = source.nextInt();
        int r2 = source.nextInt();
        Circle c2 = new Circle(x2, y2, r2);

        Circle.comparec(c1, c2);
    }
}
