
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();

        System.out.println("Задача 1");
        // Бухгалтеры попросили посчитать сумму всех выплат за месяц. Напишите программу, которая решит эту
        // задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
        System.out.println(" ");


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");
        //  найти минимальную и максимальную трату за день.
        System.out.println(" ");

        int maxValue = -1;
        int minValue = 200000;

        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            } else if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minValue + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxValue + " рублей");

        System.out.println("Задача 3");
        //  Бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней..
        System.out.println(" ");
        int sum1=0;
        for (int i = 0; i < arr.length; i++) {
        sum1=sum1+arr[i];
          }
         int average=sum1/30;
        System.out.println ("Средняя сумма трат за день составила " + average  + " рублей");

        System.out.println("Задача 4");
        //  Бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней..
        System.out.println(" ");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    }

