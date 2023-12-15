
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Задача 1

        char clientOs = 1;
        if (clientOs == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        } else {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }


        // Задача 2
        char clientOss = 1;
        int agePhone = 2015;
        if (clientOss == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
            if (agePhone <= 2015) {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
            }
        } else if (clientOss == 1) {
            System.out.println(" «Установите версию приложения для Android по ссылке»");
            if (agePhone <= 2015) {
            System.out.println(" «Установите облегченную версию приложения для Android по ссылке»");

            }
        }

        // Задача 3

        short year = 2001;

        if (year % 400 == 0 && year > 1584 && year % 4 == 0 && year % 100 != 0) {
            System.out.println(" " + year + " год является високосным");
        } else {
            System.out.println(" " + year + " год не является високосным");
        }

        // Задача 4

        short deliveryDistance =95;
        byte day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("«Потребуется "  + day +" день»");
        }
        else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("«Потребуется " + (day+1) + " дня»" );
        }
        else if (deliveryDistance >= 60 && deliveryDistance <=100) {
            System.out.println("«Потребуется " + (day+2) + " дня»");
        }
        else  {
            System.out.println("«Свыше 100 км доставки нет");
        }

        // Задача 5

        byte monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц - сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц - сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц - сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц - сезон зима");
                break;
            default: {
                System.out.println(monthNumber + " месяц - такого месяца не существует, попробуйте ещё раз.");
            }
        }


    }
 }
