package relasi_class;

public class MainProgram{
    public static void main(String[] args){
        
        // Membuat object Komputer
        Dekstop Komputer = new Dekstop();
        
        /* Memanggil atribut dan nilai*/
        Komputer.merk = "Asus ROG 230X";
        Komputer.Processor = "Intel i9 12900KF";
        Komputer.Clockspeed = "5.9 Ghz";
        Komputer.build = 2021;
        
        Computer Asus = new Computer(Komputer);
        
        Asus.merk = "ROG 230X";
        Asus.powerOn();
        Asus.run();
        Asus.PowerOff();
    }
}
