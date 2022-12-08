package Dependensi;

import relasi_class.Engine;
import relasi_class.Mobil_Dependensi;

public class MainProgram_Dependensi {
    public static void main(String[] args){
        
        // Membuat object engine
        Engine mesin = new Engine();
        
        /* memanggil atribut dan nilai*/
        mesin.merk = "Honda F23A";
        mesin.cc = 2300;
        
        Mobil_Dependensi odyssey = new Mobil_Dependensi();
        
        odyssey.merk = "Honda Odssey";
        odyssey.start(mesin);
        odyssey.run();
        odyssey.stop(mesin);
    }
}
