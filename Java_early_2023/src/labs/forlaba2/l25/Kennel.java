package labs.forlaba2.l25;

import java.util.Scanner;

public class Kennel {
    private int i = 0;
    private Dog[] arrDog = new Dog[10];
    Scanner source = new Scanner(System.in);
    public void addDod(){
        System.out.println("Введите кличку и возраст собаки:");
        String  name = source.next();
        int age = source.nextInt();
        Dog dog = new Dog(name, age);
        arrDog[i] = dog;
        i++;
    }

    public Kennel(int i, Dog[] arrDog) {
        this.i = i;
        this.arrDog = arrDog;
        System.out.println("""
        Введите опцию (число):\s
        1. Выход\s
        2. Добавить собаку\s
        3. Вывести возраст собаки\s""");
        int ans = source.nextInt();
        while(ans != 1){
            switch (ans){
                case 2:
                    addDod();
                    break;
                case 3:
                    for (int a = 0; a <arrDog.length; a++){
                        arrDog[a].getName();
                        arrDog[a].getAge();
                    }
                    System.out.println("Введите номер собаки в приюте:");
                    int num = source.nextInt();
                    arrDog[num].turnAge();
                    break;
            }
        }
        addDod();

    }
}
