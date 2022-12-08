package relasi_class;

public class Computer{
    public String merk,Processor,Clockspeed;
    public int build;
    
    public Computer(Dekstop e){
        Computer = e;
    }
    
    public void powerOn(){
        Komputer.powerOn();
    }
    
    public void powerOff(){
        Komputer.powerOff();
    }
    
    public void run(){
        System.out.println("Komputer sedang berjalan...");
    }
}
