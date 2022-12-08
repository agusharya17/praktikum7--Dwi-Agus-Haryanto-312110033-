package agregasi;

public class MainProgram {
    public static void main(String[] args){
        
        // Membuat Object Mesin
        Komputer Mesin = new Komputer();
        
        /* Memanggil atribut dan nilai*/
        Mesin.merk = "with GT$ 5000 HD";
        Mesin.Processor = "Intel i9 12100 U";
        Mesin.Keluaran = 2021;
        
        Manusia Agus = new Manusia(Mesin);
        
        Agus.merk = "Asus ITX 100i";
        Agus.Mesin = Mesin;
        Agus.powerON();
        Agus.run();
        Agus.powerOFF();
    }
}