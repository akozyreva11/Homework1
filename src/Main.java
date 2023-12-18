
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // Задача 1
        System.out.println("Задача 1");

        for (int i=1;i<=10;i++) {
            System.out.println(i);
        }

        // Задача 2
        System.out.println("Задача 2");

        for (int i=10;i>=1;i--) {

            System.out.println(i);
        }

        // Задача 3

        System.out.println("Задача 3");

        for (int i=0;i<17;i=i+2) {
            System.out.println(i);
        }

        // Задача 4
        System.out.println("Задача 4");

        for (int i=10;i>=-10;i--) {
            System.out.println(i);
        }


        // Задача 5
        System.out.println("Задача 5");

        for (int i=1904;i<2096;i=i+4) {
            System.out.println(i + " год является високосным");
        }

        // Задача 6
        System.out.println("Задача 6");

        for (int i=7;i<99;i=i+7) {
            System.out.println(i);
        }


        // Задача 7
        System.out.println("Задача 7");
        int number=1;
        for (int i=1;i<513;i=i+number) {
            number=number+number;

            System.out.println(number);
        }

        // Задача 8
        System.out.println("Задача 8");
        int cashAccumulated=0;
        for (int i=1;i<=12;i++) {
            cashAccumulated=cashAccumulated + 29000;
            System.out.println("Месяц " + i +", сумма накоплений равна " + cashAccumulated + " рублей».");
        }

        // Задача 9
        System.out.println("Задача 9");
        int cashAccumulated1=0;
        for (int i=1;i<=12;i++) {
            cashAccumulated1=cashAccumulated1 + 29000;
            cashAccumulated1=cashAccumulated1/100+cashAccumulated1;
            System.out.println("Месяц " + i +", сумма накоплений равна " + cashAccumulated1 + " рублей».");
        }

        // Задача 10
        System.out.println("Задача 10");
        int amount;
        for (int i=1;i<=10;i++) {
            amount=2*i;
            System.out.println("2*"+i+"="+amount);
        }
    }


}
