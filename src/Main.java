
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(cat + "   " + dog + "   " + paper);

        var inc = 4;

        System.out.println((cat + inc) + "   " + (dog + inc) + "  " + (paper + inc) );

        var decDog = dog-3.5;
        var decCat = cat-1.6;
        var decPaper = paper-7639;

        System.out.println(decCat + "   " + decDog + "   " + decPaper);

        var friend = 19;
        var frog =3.5;

        System.out.println(friend + "    " + (friend + 2) + "    " + (friend /7));
        System.out.println(frog + "   " + (frog * 10) + "  " + (frog * 10 /3.5) +  "   " + ((frog * 10 /3.5)+4) );

        var onePerson = 78.2;
        var twoPerson = 82.7;

        System.out.println((onePerson + twoPerson) + "    " + (twoPerson - onePerson));
        System.out.println((onePerson + twoPerson) + "    " + (twoPerson %onePerson));

        var hoursPeople = 640;
        var hoursPerson = 8;

        System.out.println("«Всего работников в компании - " + (hoursPeople / hoursPerson) + " человек»."  );

        var allWorkPeople = (hoursPeople/hoursPerson)+94 ;

        System.out.println("«Если в компании работает " + allWorkPeople + " человек, "  + " то всего  "  + (hoursPeople / allWorkPeople) +  " часов работы может быть поделено между сотрудниками».");


    }
}