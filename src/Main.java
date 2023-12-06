
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float variable1 = 27.12f;
        long variable2 = 987678965549L;
        double variable3 = 2.786;
        short variable4 = 569;
        short variable5 = -159;
        int variable6 = 27897;
        byte variable7 = 67;

        System.out.println("«Значение переменной variable7 c типом byte равно " +  variable7 + "».");
        System.out.println("«Значение переменной variable5 и variable4  c типом short равно " +  variable5 + " " + variable4 + "».");
        System.out.println("«Значение переменной variable6 c типом int равно " +  variable6 + "».");
        System.out.println("«Значение переменной variable2 c типом long равно " +  variable2 + "».");
        System.out.println("«Значение переменной variable1 c типом float равно " +  variable1+ "».");
        System.out.println("«Значение переменной variable3 c типом double равно " +  variable3 +"».");

        // Задача 3

        byte personClass1 = 23;
        byte personClass2 = 27;
        byte personClass3 = 30;
        short allPaper = 480;
        System.out.println("«На каждого ученика рассчитано " + (allPaper /(personClass1+personClass2+personClass3)) + " листов бумаги.»");

        // Задача 4

        byte bottles = 16/2;
        short min = (short)20;
        short day = 1;
        short day3 = 3;
        short month = 30; // за среднее взяла 30 дней в месяце
        int all;
        System.out.println("«За " + min + " минут машина произвела " + (all=(min*bottles)) + " бутылок».");
        System.out.println("«За " + day + " день машина произвела " + (all=(24*60*bottles)) + " бутылок».");
        System.out.println("«За " + day3 + " дня машина произвела " + (all=(24*60*3*bottles)) + " бутылок».");
        System.out.println("«За " + month + " месяц машина произвела " + (all=(24*60*3*30*bottles)) + " бутылок».");

        //Я не понимала почему переменная all выглядит как непрочитанная,
        //но при этом код работает. Решила сделать ещё один вариант/ Но попрошу пояснить почему так бывает


        byte bottlesn = 16/2;
        short minn = (short) (20 * bottlesn);
        short dayn = (short) (24*60*bottlesn);
        int day3n = dayn * 3;
        int monthn = day3n * 10; // за среднее взяла 30 дней в месяце
        System.out.println("«За " + min + " минут машина произвела " + minn + " бутылок».");
        System.out.println("«За " + day + " день машина произвела " + dayn + " бутылок».");
        System.out.println("«За " + day3 + " дня машина произвела " + day3n + " бутылок».");
        System.out.println("«За " + month + " месяц машина произвела " + monthn + " бутылок».");

        // Задача 5

        byte allClass = 120/(2+4);
        byte whitePaints = (byte) (allClass * 2);
        byte brownPaints = (byte) (allClass * 4);
        System.out.println("«В школе, где " + allClass + " классов, нужно " + whitePaints +  " банок белой краски и " + brownPaints + " банок коричневой краски».");

        // Задача 6

        short bananas = 5 * 80;
        float milk =  (200 * (105/100f));
        short ice = 2 * 100;
        short eggs = 4 * 70;
        float allEat= (short) (bananas+milk+ice+eggs);
        float allEatKg= allEat/1000;

        System.out.println("«Всего " + allEat + " грамм, что в переводе в килограммы будет " + allEatKg + " кг».");

        // Задача 7

        int wheightOne = 1000/250 * 7;
        int wheightTwo = 1000/500 * 7;

        System.out.println("«Если спортсмен будет терять каждый день по 250 грамм ,тогда  потеряет вес за " + wheightOne + " дней ,а если 500 грамм " + wheightTwo + " дней».");

        // Задача 8

        int salaryMasha = 67760;
        int salaryMashaPro = 67760*12;
        int salaryDenis = 83690;
        int salaryDenisPro = 83690 * 12;
        int salaryKristina = 76230;
        int salaryKristinaPro= 76230 * 12;

        System.out.println("«Маша теперь получает " + ((salaryMasha/10)+salaryMasha) + " рублей. Годовой доход вырос на " + ((((salaryMasha/10)+salaryMasha) * 12) % salaryMashaPro) + "рублей».");
        System.out.println("«Денис теперь получает " + ((salaryDenis/10)+salaryDenis) + " рублей. Годовой доход вырос на " + ((((salaryDenis/10)+salaryDenis) * 12) % salaryDenisPro) + "рублей».");
        System.out.println("«Кристина теперь получает " + ((salaryKristina/10)+salaryKristina) + " рублей. Годовой доход вырос на " + ((((salaryKristina/10)+salaryKristina) * 12) % salaryKristinaPro) + "рублей».");



    }
}