package scy.pro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hogwardts[] hogwardts = {
                new Hogwardts("Гарри Поттер",155552,12),
                new Hogwardts("Гермиона Грейнджер",11,34),
                new Hogwardts("Рон Уизли", 8,98),
                new Hogwardts("Драко Малфой",10,0),
                new Hogwardts("Грэхэм Монтегю",9,94),
                new Hogwardts("Грегори Гойл",8,83),
                new Hogwardts("Захария Смит",10,1),
                new Hogwardts("Седрик Диггори",7,7),
                new Hogwardts( "Джастин Финч-Флетчли",8,8),
                new Hogwardts("Чжоу Чанг",10,210),
                new Hogwardts("Падма Патил",9,19),
                new Hogwardts("Маркус Белби",33,233),
        };
        Grifindor[] grifindors ={
                new Grifindor("Гарри Поттер", 10,100,10,10,11 ),
                new Grifindor("Гермиона Грейнджер", 9,90,9,9,9 ),
                new Grifindor("Рон Уизли", 8,80,8,8,8 ),
        };
        Slizerin [] slizerins = {
                new Slizerin("Драко Малфой",10,10,10,10,10,10,10),
                new Slizerin("Грэхэм Монтегю",9,9,9,9,9,9,9),
                new Slizerin("Грегори Гойл",8,8,8,8,8,8,8),
        };
        Puffendyu[] puffendyus = {
                new Puffendyu("Захария Смит",10,10,10,10,10),
                new Puffendyu("Седрик Диггори",7,7,7,7,7),
                new Puffendyu( "Джастин Финч-Флетчли",8,8,8,8,8),
        };
        Cogtevran[] cogtevrans = {
                new Cogtevran("Чжоу Чанг",10,10,10,10,10,10),
                new Cogtevran("Падма Патил",9,9,9,9,9,9),
                new Cogtevran("Маркус Белби",33,8,233,8,8,8),
        };
        CompareService compareService = new CompareService();
        compareService.compare(grifindors);
        compareService.compare(cogtevrans);
        compareService.compare(puffendyus);
        compareService.compare(slizerins);
        compareService.compare(hogwardts);
    }

    }

