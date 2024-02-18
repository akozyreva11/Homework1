package scy.pro;

import javax.sound.midi.Soundbank;

public class CompareService {

    public void compare(Grifindor[] grifindors) {
        System.out.println("Лучший в Грифиндорс:  ");

        for (int i = 1; i < grifindors.length - 1; i++) {
            Grifindor grifindor = grifindors[1];
            int sum = grifindor.getBravery() + grifindor.getHonor() + grifindor.getNobility();
            Grifindor grifindor2 = grifindors[2];
            int sum1 = grifindor2.getBravery() + grifindor2.getHonor() + grifindor2.getNobility();
            if (sum1 > sum) {
                System.out.println(grifindor2.getName() + "  количество баллов  " + sum1);
            } else {
                System.out.println(grifindor.getName() + "  количество баллов  " + sum);
            }
        }
    }

    public void compare(Cogtevran[] cogtevrans) {
        System.out.println("Лучший в Когтевране:  ");

        for (int i = 1; i < cogtevrans.length - 1; i++) {
            Cogtevran cogtevran = cogtevrans[1];
            int sum = cogtevran.getSmart() + cogtevran.getCreation()+ cogtevran.getWit() + cogtevran.getWisdom();
            Cogtevran cogtevran2 = cogtevrans[2];
            int sum1 = cogtevran2.getSmart() + cogtevran2.getCreation()+ cogtevran2.getWit() + cogtevran2.getWisdom();
            if (sum1 > sum) {
                System.out.println(cogtevran2.getName() + "  количество баллов  " + sum1);
            } else {
                System.out.println(cogtevran.getName() + "  количество баллов  " + sum);
            }
        }
    }
    public void compare(Puffendyu[] puffendyus) {
        System.out.println("Лучший в Пуффендурсе:  ");

        for (int i = 1; i < puffendyus.length - 1; i++) {
            Puffendyu puffendyu = puffendyus[1];
            int sum = puffendyu.getHardworking()+ puffendyu.getHonest()+ puffendyu.getLoyal();
            Puffendyu puffendyus2 = puffendyus[2];
            int sum1 = puffendyus2.getHardworking()+ puffendyus2.getHonest()+ puffendyus2.getLoyal();
            if (sum1 > sum) {
                System.out.println(puffendyus2.getName() + "  количество баллов  " + sum1);
            } else {
                System.out.println(puffendyu.getName() + "  количество баллов  " + sum);
            }
        }
    }
    public void compare(Slizerin[] slizerins) {
        System.out.println("Лучший в Слизеринс:  ");

        for (int i = 0; i < slizerins.length - 1; i++) {
            Slizerin slizerin = slizerins[0];
            int sum = slizerin.getAmbition() + slizerin.getCunning()+ slizerin.getSpellPower() + slizerin.getResourcefulness()+slizerin.getThirstForPower();
            Slizerin slizerin2 = slizerins[1];
            int sum1 = slizerin2.getAmbition() + slizerin2.getCunning()+ slizerin2.getSpellPower() + slizerin2.getResourcefulness()+slizerin2.getThirstForPower();
            if (sum1 > sum) {
                System.out.println(slizerin2.getName() + "  количество баллов  " + sum1);
            } else {
                System.out.println(slizerin.getName() + "  количество баллов  " + sum);
            }
        }
    }

    public void compare(Hogwardts[] hogwardts) {
        System.out.println("Лучший в Хогвардсе:  ");
            Hogwardts hogwardt = hogwardts[0];
            int sum = hogwardt.getSpellPower()+hogwardt.getTransgressDistance();
            Hogwardts hogwardt1 = hogwardts[3];
            int sum1 = hogwardt1.getSpellPower()+hogwardt1.getTransgressDistance();
               if (sum > sum1) {
                System.out.println(hogwardt.getName() + "  количество баллов  " + sum);
            } else {
                System.out.println(hogwardt1.getName() + "  количество баллов  " + sum1);
            }

        }
    }

