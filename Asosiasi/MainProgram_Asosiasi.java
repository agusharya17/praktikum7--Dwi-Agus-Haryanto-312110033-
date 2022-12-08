package Asosiasi;

import Asosiasi.Mobil_Asosiasi;
import relasi_class.Engine;

public class MainProgram_Asosiasi {
    public static void main(String[] args){
        
        // Membuat object engine
        Engine mesin = new Engine();
        
        /* memanggil atribut dan nilai*/
        mesin.merk = "Honda F23A";
        mesin.cc = 2300;
        
        Mobil_Asosiasi odyssey = new Mobil_Asosiasi();
        
        odyssey.merk = "Honda Odyssey";
        odyssey.mesin = mesin;
        odyssey.start();
        odyssey.run();
        odyssey.stop();
    }
}
