
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = in.nextInt();
        findYear(year);
        //**************************
        printStars();
        Scanner inYear = new Scanner(System.in);
        System.out.println("Введите год выпуска вашего телефона:");
        int year2 = inYear.nextInt();
        Scanner systemChoose = new Scanner(System.in);
        System.out.println("Введите тип операционной ситсемы 1 - это IOS и 0 - это Android:");
        int system = systemChoose.nextInt();
        chooseDownload(year2,system);
        printStars();
        //**************************
        int deliveryDistance = 105;
        int day = 1;
        findDay(deliveryDistance, day);
        printStars();
        //**************************
    }

    public static void printStars() {
        System.out.println("*****************************");
        System.out.println("*****************************");

    }

    public static void findYear(int year) {
        if (year > 1584 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год невисокосный");
        }
    }

    public static void chooseDownload(int year2, int system) {
        if (system == 0 && year2 < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке»");
        } else if (system == 1 && year2 < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке»");
        } else if (system == 0 && year2 >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке»");
        } else {
            System.out.println("Установите обычную версию приложения для IOS по ссылке»");
        }
    }

    public static void findDay(int deliveryDistance, int day) {
        if (deliveryDistance <= 20) {
        System.out.println("«Потребуется " + day + " день»");
    } else if (deliveryDistance > 20 && deliveryDistance < 60) {
        System.out.println("«Потребуется " + (day + 1) + " дня»");
    } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
        System.out.println("«Потребуется " + (day + 2) + " дня»");
    } else {
        System.out.println("«Свыше 100 км доставки нет");
    }
    }
}
//        System.out.println("Привет, мир!");
//
//    }}
//public static void scannerYearVisokos(String[] args){
//    inputForScanner(year);
//
//}

