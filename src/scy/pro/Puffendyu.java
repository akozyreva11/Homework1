package scy.pro;

public class Puffendyu extends Hogwardts {

   private int hardworking;
   private int loyal;
   private int honest;

   public Puffendyu(String name, int spellPower, int transgressDistance, int hardworking, int loyal, int honest) {
      super(name, spellPower, transgressDistance);
      this.hardworking = hardworking;
      this.loyal = loyal;
      this.honest = honest;
   }

   public int getHardworking() {
      return hardworking;
   }

   public int getLoyal() {
      return loyal;
   }

   public int getHonest() {
      return honest;
   }

   public void setHardworking(int hardworking) {
      this.hardworking = hardworking;
   }

   public void setLoyal(int loyal) {
      this.loyal = loyal;
   }

   public void setHonest(int honest) {
      this.honest = honest;
   }

   @Override
   public String toString() {
      return "Puffendyu{" +
              "hardworking=" + hardworking +
              ", loyal=" + loyal +
              ", honest=" + honest +
              '}';
   }

}
