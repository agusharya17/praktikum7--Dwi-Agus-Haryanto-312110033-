package Dependensi;



public class Mobil_Dependensi {
    public String merk;
    
    public void start(Engine e){
        e.start();
    }
    
    public void stop(Engine e){
        e.stop();
    }
    
    public void run(){
        System.out.println("Mobil running...");
    }
}
