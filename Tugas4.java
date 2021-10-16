class Smartphone{ // main class
    public String Kamera = "108MP";
    public double Layar = 6.5 ;
    public int Ram = 8;
    
    public String Kamera(){
        return this.Kamera;
    }
    
    public double Layer(){
        return this.Layar;
    }

    public int Ram(){
        return this.Ram;
    }
}

class Xiaomi extends Smartphone{ //sub class
    public String Type_Series = "Xiaomi Mi 10T Pro";

    public void Gpu(){
        System.out.println("Gpu Adreno 650");
    }

    public String Fingerprint (String x){
        return x;
    }
}


class Samsung extends Smartphone{ 
    public String Type_Series = "Samsung Galaxy A32";

    public void Gpu(){
        System.out.println("Gpu Mali-G52 MC2");
    }

    public String Fingerprint(String x){
        return x;
    }
}

public class Tugas4 {
    public static void main(String[] args) {
        //inisialisasi object
        Smartphone s = new Smartphone();//init object
        System.out.println("Class Smartphone - main class");  
        System.out.println("Kamera Smartphone:"+s.Kamera);
        double Layer = s.Layer();
        System.out.println("Layer Smartphone:"+Layer+" GHz");
        int Ram = s.Ram();        
        System.out.println("Tipe Ram:"+Ram);

        System.out.println("=====================================");
        System.out.println("Class Xiaomi - Subclass");
        Xiaomi i = new Xiaomi(); //init object
        System.out.println("Kamera Smartphone:"+s.Kamera);
        i.Gpu();
        Layer = i.Layer();
        System.out.println("Layer Smartphone:"+Layer+" GHz");
        Ram = s.Ram();        
        System.out.println("Tipe Ram:"+Ram+" GB");
        String Fingerprint = i.Fingerprint(" Mendukung");
        System.out.println("Mendukung Finger Print ? "+Fingerprint);
        System.out.println("Tipe Series Smartphone :"+i.Type_Series);
        
        Samsung a = new Samsung();
        System.out.println("=====================================");
        System.out.println("Class Samsung - Subclass");
        System.out.println("Kamera Smartphone:"+s.Kamera);
        a.Gpu();
        Layer = a.Layer();
        System.out.println("Layer Smartphone:"+Layer+" GHz");
        Ram = s.Ram();        
        System.out.println("Tipe Ram:"+Ram+" GB");
        Fingerprint = a.Fingerprint("Mendukung");
        System.out.println("Mendukung Finger Print ? "+Fingerprint);
        System.out.println("Tipe Series Smartphone :"+a.Type_Series);

        System.out.println("=====================================");
        System.out.println("Class Encapsulation_Tugas4");
        Encapsulation_Tugas4 e = new Encapsulation_Tugas4();
        e.setKamera("108Mp");
        e.setRam(8);
        e.setLayar(6.5);

        System.out.println(e.getKamera());
        System.out.println(e.getRam());
        System.out.println(e.getLayar()); 
    }
}
