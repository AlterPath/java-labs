package labs.forlaba2.l24;
import java.util.Scanner;

public class Shop {
    public Shop(int i) {
        int answer;
        Comp[] arrcomp = new Comp[10];
        Comp a1 = new Comp(10000, 4, "Help");
        Comp a2 = new Comp(15000, 8, "Mamma MIa");
        Comp a3 = new Comp(18000, 16, "What does the fox say");
        arrcomp[1] = a1;
        arrcomp[2] = a2;
        arrcomp[3] = a3;
        Scanner source = new Scanner(System.in);

        do {
            if(i!=2){
                    System.out.println("""
                            Введите цифру характеристики по которой будем сравнивать компьютеры:
                            1. Цена\s
                            2. Оперативная память""");

                    answer = source.nextInt();
                switch (answer) {
                    case 1 -> {
                        System.out.println("Введите максимальную цену:");
                        int cost = source.nextInt();
                        for (Comp comp : arrcomp) {
                            if (comp.getCost() < cost) {
                                System.out.println(comp.toString());
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Введите минимальный объем памяти:");
                        int memory = source.nextInt();
                        for (Comp comp : arrcomp) {
                            if (comp.getOpMemory() > memory) {
                                System.out.println(comp.toString());
                            }
                        }
                    }
                }
            }
            i = source.nextInt();
        } while (i != 2);
    }
}

