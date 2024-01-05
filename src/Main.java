
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        double[] second = {1.57, 7.654, 9.986};
        boolean[] secondTwo = {false, true, true};


        // Задача 2
        System.out.println("Задача 2");

        for (int i = 0; i <= 2; i++) {
            System.out.print(first[i] + ", ");
        }
        System.out.println(" ");

        for (int i = 0; i <= 2; i++) {
            System.out.print(second[i] + ", ");
        }

        System.out.println(" ");
        for (int i = 0; i <= 2; i++) {
            System.out.print(secondTwo[i] + ", ");
        }
        System.out.println(" ");

        // Задача 3

        System.out.println("Задача 3");

        for (int i = 2; i >= 0; i--) {
            System.out.print(first[i] + ", ");

        }
        System.out.println(" ");

        for (int i = 2; i >= 0; i--) {
            System.out.print(second[i] + ", ");
        }

        System.out.println(" ");

        for (int i = 2; i >= 0; i--) {
            System.out.print(secondTwo[i] + ", ");
        }
        System.out.println(" ");

        // Задача 4
        System.out.println("Задача 4");

        System.out.println(" ");
        for (int start = 0;start <= 2; start ++) {
            if (start % 2 == 0) {
                first[start]=first[start]+1;
            }
        }
        System.out.println(Arrays.toString(first));
    }
}



