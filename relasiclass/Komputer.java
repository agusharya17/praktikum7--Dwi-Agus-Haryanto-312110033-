package relasiclass;

public class Komputer implements Laptop{
    public String merk,Processor;
    public int Keluaran;
    
    @Override
    public void powerON(){
        System.out.println("Start--Laptop dinyalakan...");
    }
    
    @Override
    public void powerOFF(){
        System.out.println("ShuttingDown--Laptop dimatikan...");
    }
}
