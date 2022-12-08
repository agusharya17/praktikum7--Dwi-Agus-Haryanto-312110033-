package relasi_class;

public class Dekstop implements PC {
   public String merk,Processor,Clockspeed;
   public int build;
   
   @Override
   public void powerOn(){
       System.out.println("Hidupkan Komputer...");
   }
   
   @Override
   public void powerOff(){
       System.out.println("Mematikan Komputer...");
   }
}
