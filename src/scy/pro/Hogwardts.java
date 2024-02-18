package scy.pro;

public class Hogwardts {

    private String name;
    private int spellPower;
    private int transgressDistance;


    public Hogwardts(String name, int spellPower, int transgressDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgressDistance = transgressDistance;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    @Override
    public String toString() {
        return "Hogwardts{" +
                "name='" + name + '\'' +
                ", spellPower=" + spellPower +
                ", transgressDistance=" + transgressDistance +
                '}';
    }

}
