
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача 1

        int oldPerson = 65; //тут описала сразу две переменные, так как в условиях к задаче написано про два сообщения, в следующей задачи сделала только одну переменную
        int yuongPerson = 17;
        if (oldPerson >= 18) {
            System.out.println("Если возраст человека равен " + oldPerson + " то он совершеннолетний");
        }
        if (yuongPerson < 18) {
            System.out.println("Если возраст человека равен " + yuongPerson + " то он он не достиг совершеннолетия, нужно немного подождать");
        }


        // Задача 2

        int weather = -20; //В эту переменную можно вносить погоду которую хочется
        boolean weatherСomparison = weather < 5;
        if (weatherСomparison) {
            System.out.println("На улице " + weather + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло " + weather + " градусов, можно идти без шапки");
        }
        // Задача 3

        int km = 11;
        boolean kmComprasion = km > 60;
        if (kmComprasion) {
            System.out.println("Если скорость " + km + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + km + " , можно ездить спокойно");
        }

        // Задача 4
        // Не понимала как сделать подряд много if и в конце один elsse/ так как условие проверяется последним  и получается если предпоследний if не подходит ,то вываливается вторая такая же строка, так как подходит к else
        // Получается у нас ребенок в 1 год тоже может идти работать?? Не хватает условий

        int personAge = 25;
        boolean school = personAge >= 7 && personAge <= 17;
        boolean childerSchool = personAge >= 2 && personAge <= 6;
        boolean student = personAge >= 18 && personAge <= 24;

        if (school) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно ходить в школу.");
        } else if (childerSchool) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно ходить детский сад.");
        } else if (student) {
            System.out.println("Если возраст человека равен " + personAge + " , то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + personAge + " , то ему пора ходить на работу.");
        }

        // Задача 5

        int childrenAge = 5;
        boolean attractionNo = childrenAge < 5;
        boolean childrenParents = childrenAge >=5 && childrenAge < 14;

        if (attractionNo) {
            System.out.println("Если возраст ребенка равен " + childrenAge + " , то ему нельзя кататься на аттракционе.");
        } else if (childrenParents) {
            System.out.println("Если возраст ребенка равен " + childrenAge + " , то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 6 Вроде работает, но я както сложно сделала,если есть вариант проще, то озвучьте мне его пожалуйста

        int peopleToday =11;
        int peopleAll = 102;
        int seatingPlace =60;
        boolean peopleMany =peopleAll>=peopleToday;
        boolean placeSeating =  peopleToday<=seatingPlace;
        if (peopleMany && placeSeating) {
            System.out.println("В вагоне есть " + (peopleAll-peopleToday) + " свободных мест(а) " + (seatingPlace-peopleToday) + " из них сидячих мест " +  ((peopleAll-peopleToday) - (seatingPlace-peopleToday)) + " и свободных стоячих."  );
        } else if (peopleMany && peopleToday>=seatingPlace) {
            System.out.println("В вагоне есть " + (peopleAll-peopleToday) + " свободных мест(а) " + ((seatingPlace-peopleToday)+(-seatingPlace-(-peopleToday))) + " из них сидячих мест " + (peopleAll-peopleToday) + " и свободных стоячих."  );
        } else {
            System.out.println("К сожалению в вагон переполнен, пройдите к следующему вагону!");
        }

        // Задача 7

        int one =0;
        int two =2;
        int three =0;

        if (one>two && one>three && one!=two && one!=three){
            System.out.println("Число one больше всех, оно равно " + one);
        }
        else if (two>one && two>three && two!=one && three!=two){
            System.out.println("Число two больше всех, оно равно " + two);
        }
        else if (three>one && three>two && three!=one && three!=two){
            System.out.println("Число three больше всех, оно равно " + three);
        }
        else {
            System.out.println("Все числа равны!");
        }
    }

}

