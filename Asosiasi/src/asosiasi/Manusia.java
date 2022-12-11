package asosiasi;

public class Manusia {
    public String merk, Processor;
    public Komputer Mesin;
    
    public void powerON(){
        Mesin.powerON();
    }
    
    public void powerOFF(){
        Mesin.powerOFF();
    }
    
    public void run(){
        System.out.println("Komputer sedang menyala- active");
    }
}
