package labs;
import java.util.Scanner;

public class laby {

}


        /*
        №3


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество чисел в массиве: ");
        int arrayLength = sc.nextInt();
        System.out.println("Введите числа для добаваления в массив:");
        int[] array = new int[arrayLength];
        int arraysum = 0;
        for(int i=0; i < arrayLength; i++){
            array[i] = sc.nextInt();
            arraysum = arraysum + array[i];
        }
        System.out.println("Сумма элементов массива: " + arraysum);
        System.out.println("Среднее арифметическое массива: " + (arraysum/arrayLength));
    }
 */


/*

№4


    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа для добаваления в массив. " +
                "Если хотите прекратить ввод чисел, напишите stop:");
        String answer = sc.next();
        int[] array = new int[128];
        int i = 0; int summ = 0;
        int minn = 2147483647; int maxx = -2147483648;


        do {
            array[i] = Integer.parseInt(answer);
            answer = sc.next();

            if(array[i] < minn){
                minn = array[i];
            }
            if(array[i] > maxx){
                maxx = array[i];
            }
            summ = summ + array[i];

            i++;
        } while (isInteger(answer));

        System.out.printf("Минимальный элемент массива: %s %n" +
                "Максимальный элемент массива: %s %n" +
                "Сумма элементов массива: %s", minn, maxx, summ);
    }
}
 */

/*

№5


    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i+1) + ": " + args[i]);
        }
    }
 */

/*

№6


    public static void main(String[] args) {
        double grm = 0;
        for(int i = 1; i < 11; i++){
            grm = grm + 1./i;
            System.out.printf("%s число гармонического ряда: %.5s \n", i, grm);
        }
    }
 */

/*

№7


 */