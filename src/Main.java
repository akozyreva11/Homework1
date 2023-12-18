
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <Public> void main(String[] args) {


        // Задача 1

        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        } else {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }


        // Задача 2
        char clientOss = 1;
        int agePhone = 2016;
        if (clientOss == 0 && agePhone <= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке. Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке. Установите облегченную версию приложения для Android по ссылке. ");
        }


        // Задача 3

        short year = 1584;

        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year >= 1584 && year % 400 == 0) {
            System.out.println(" " + year + " год является високосным");
        } else {
            System.out.println(" " + year + " год не является високосным или был введен год менее 1584");
        }


        // Задача 4

        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("«Потребуется " + day + " день»");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("«Потребуется " + (day + 1) + " дня»");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("«Потребуется " + (day + 2) + " дня»");
        } else {
            System.out.println("«Свыше 100 км доставки нет");
        }

        System.out.println(getSeason(4));
    };
        // Задача 5
        private static String getSeason ( int monthNumber) {
            return switch (monthNumber) {
                case 12, 1, 2 -> "зима";
                case 3, 4, 5 -> "весна";
                case 6, 7, 8 -> "лето";
                case 9, 10, 11 -> "осень";
                default -> "такого месяца не существует, попробуйте ещё раз.";
            };
        }
}

