package scy.pro;

import java.util.Objects;

public class Grifindor extends Hogwardts{

    private int nobility;
    private int honor;
    private int bravery;

    public Grifindor(String name, int spellPower, int transgressDistance, int nobility, int honor, int bravery) {
    super(name, spellPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return "Grifindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grifindor grifindor = (Grifindor) o;
        return nobility == grifindor.nobility && honor == grifindor.honor && bravery == grifindor.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }

}
