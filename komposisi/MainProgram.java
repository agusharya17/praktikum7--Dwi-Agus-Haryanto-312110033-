package komposisi;

public class MainProgram {
    public static void main(String[] args){
        
        // Membuat Objek Manusia
        Manusia Agus = new Manusia ("Agus Haryanto", 24);
        
        /* Memanggil atribut dan niali */
        Agus.merk = "Agus Yanto";
        Agus.powerON();
        Agus.run();
        Agus.powerOFF();
        
    }
    
}
