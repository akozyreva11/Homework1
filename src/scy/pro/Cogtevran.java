package scy.pro;

public class Cogtevran extends Hogwardts {
   private int smart;
   private int wisdom;
   private int wit;
   private int creation;

   public Cogtevran(String name, int spellPower, int transgressDistance, int smart, int wisdom, int wit, int creation) {
      super(name, spellPower, transgressDistance);
      this.smart = smart;
      this.wisdom = wisdom;
      this.wit = wit;
      this.creation = creation;
   }


   public int getWit() {
      return wit;
   }

   public int getSmart() {
      return smart;
   }

   public int getWisdom() {
      return wisdom;
   }

   public int getCreation() {
      return creation;
   }

   public void setWisdom(int wisdom) {
      this.wisdom = wisdom;
   }

   public void setSmart(int smart) {
      this.smart = smart;
   }

   public void setWit(int wit) {
      this.wit = wit;
   }

   public void setCreation(int creation) {
      this.creation = creation;
   }

}
