
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача 1

        System.out.println(" ");
        System.out.println("Задача 1");
        System.out.println(" ");

        int cashAccumulated2 = 0;
        int cash = 0;
        int month = 0;
        while (cashAccumulated2 < 2459000) {
            cash = cash + 15000;
            cashAccumulated2 = cash / 100 + cash;
            month = month + 1;
        }
        System.out.println("Через  " + month + " месяца, сумма накоплений с процентом по вкладку равна  " + cashAccumulated2 + " рублей».");


        // Задача 2

        System.out.println(" ");
        System.out.println("Задача 2");
        System.out.println(" ");

        for (int s = 1; s <= 10; s++) {
            System.out.print(" " + s + " ");

        }
        System.out.println(" ");

        int m = 10;
        while (m > 0) {
            System.out.print(" " + m + " ");
            m--;

        }
        System.out.println(" ");


        // Задача 3

        System.out.println(" ");
        System.out.println("Задача 3");
        System.out.println(" ");

        int people = 12000000;
        int baby = 17 * people / 1000;
        int did = 8 * people / 1000;
        int year = 0;
        while (year < 10) {
            people = people + baby - did;
            year++;
            System.out.println("Через " + year + " год/лет численность населения составит " + people);
        }

        // Задача 4
        System.out.println(" ");
        System.out.println("Задача 4");
        System.out.println(" ");


        int cashAccumulated1 = 0;
        int cash1 = 15000;
        int month1 = 0;
        while (cash1 < 12000000) {
            cashAccumulated1 = (cash1 / 100) * 7;
            cash1 = cashAccumulated1 + cash1;
            month1 = month1 + 1;
            if (month1 % 36 == 0) {
                System.out.println("Месяц " + month1 + ", сумма промежуточных накоплений за каждые 3 года равна  " + cash1 + " рублей».");
            }
        }
        System.out.println("Месяцев" + month1 + ", сумма накоплений с процентом по вкладку равна  " + cash1 + " рублей».");

        // Задача 5 Очень похожее задание, только в предыдущем не было указано за какой  промежуточный срок выполнять вывод в консоль
        System.out.println(" ");
        System.out.println("Задача 5");
        System.out.println(" ");

        int cashAccumulated3 = 0;
        int cash3 = 15000;
        int month3 = 0;
        while (cash3 < 12000000) {
            cashAccumulated3 = (cash3 / 100) * 7;
            cash3 = cashAccumulated3 + cash3;
            month3 = month3 + 1;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма промежуточных накоплений за каждые 3 года равна  " + cash3 + " рублей».");
            }
        }

        // Задача 6
        System.out.println(" ");
        System.out.println("Задача 6");
        System.out.println(" ");

        int cash4 = 15000;
        int month12 = 12 * 9;
        int month2 = 1;
        while (month2 <= month12) {
            int cashAccumulated4 = (cash4 / 100) * 7;
            cash4 = cashAccumulated4 + cash4;
            month2 = month2 + 1;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма промежуточных накоплений за каждые полгода на протяжении 9 лет равна  " + cash4 + " рублей».");
            }
        }

        // Задача 7
        System.out.println(" ");
        System.out.println("Задача 7");
        System.out.println(" ");
        int firstFriday = 3;

        for (int g = 1; g <= 31; g++) {
            if (g % 7 == firstFriday) {
                System.out.println("Сегодня пятница " + g + " число. Необходимо подготовить отчёт");
            }
        }

        // Задача 8
        System.out.println(" ");
        System.out.println("Задача 8");
        System.out.println(" ");

        int beforeYear = 2023 - 200;
        int afterYear = 2023 + 100;
        int year1 = 0;
            for (;year1<=afterYear;) {
            year1=year1+79;
                if (year1>=beforeYear && year1<=afterYear) {
                    System.out.println(year1);
                }
        }
    }
}



