public class Encapsulation_Tugas4 {
    public String Kamera = "108Mp";
    public double Layar = 6.5 ;
    public int Ram = 8;
    
    public String getKamera() {
        return Kamera;
    }

    public void setKamera(String Kamera) {
        this.Kamera = Kamera;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }   

    public void setLayar(double x){
        this.Layar = x;
    }

    public double getLayar(){
        return this.Layar;
    }
}
