package Asosiasi;

import relasi_class.Engine;

public class Mobil_Asosiasi {
    public String merk;
    public Engine mesin;
    
    public void start(){
        mesin.start();
    }
    
    public void stop(){
        mesin.stop();
    }
    
    public void run(){
        System.out.println("Mobil running...");
    }
}
