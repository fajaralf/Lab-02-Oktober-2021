package lab16okt;

public class Pertamina {
    public static char[] myPertamina;
    public String slogan, nama;
    public String Nama(){
        return nama;
    }
    public void setNama(String newNama){
        this.nama = newNama;
    }
    public String slogan(){
        return slogan;
    }
    public void setSlogan(String newSlogan){
        this.slogan = newSlogan;
    }
    static void Pertamina(){
        Pertamina mypertamina = new Pertamina();
        mypertamina.setNama("Pertamina");
        System.out.println(mypertamina.Nama());
        mypertamina.setSlogan("Pasti Pas");
        System.out.println(mypertamina.slogan());
    }
}

class PertamaxTurbo extends Pertamina{
    public double harga;
    public String tipe, nama;
    public String getNama(){
        return nama;
    }
    public void setNama(String newNama){
        this.nama = newNama;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double newHarga){
        this.harga = newHarga;
    }
    public String getTipe(){
        return tipe;
    }
    public void setTipe(String newTipe){
        this.tipe = newTipe;
    }
    
    static void PertamaxTurbo(){
        PertamaxTurbo myPertamaxTurbo = new PertamaxTurbo();
        myPertamaxTurbo.setNama("Pertamax Turbo");
        System.out.println("Nama : " + myPertamaxTurbo.getNama());
        myPertamaxTurbo.setHarga(12000);
        System.out.println("Harga : Rp."+myPertamaxTurbo.getHarga() + " /liter");
        myPertamaxTurbo.setTipe("oktan 95");
        System.out.println("Tipe Bahan Bakar : "+myPertamaxTurbo.getTipe());
    }
}

class Pertamax extends Pertamina{
    public double harga;
    public String tipe, nama;
    public String getNama(){
        return nama;
    }
    public void setNama(String newNama){
        this.nama = newNama;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double newHarga){
        this.harga = newHarga;
    }
    public String getTipe(){
        return tipe;
    }
    public void setTipe(String newTipe){
        this.tipe = newTipe;
    }
    
    static void Pertamax(){
        Pertamax myPertamax = new Pertamax();
        myPertamax.setNama("Pertamax");
        System.out.println("Nama : " + myPertamax.getNama());
        myPertamax.setHarga(9000);
        System.out.println("Harga : Rp."+myPertamax.getHarga() + " /liter");
        myPertamax.setTipe("oktan 92");
        System.out.println("Tipe Bahan Bakar : "+myPertamax.getTipe());
    }
}

class Pertalite extends Pertamina{
    public double harga;
    public String tipe, nama;
    public String getNama(){
        return nama;
    }
    public void setNama(String newNama){
        this.nama = newNama;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double newHarga){
        this.harga = newHarga;
    }
    public String getTipe(){
        return tipe;
    }
    public void setTipe(String newTipe){
        this.tipe = newTipe;
    }
    
    static void Pertalite(){
        Pertalite myPertalite = new Pertalite();
        myPertalite.setNama("Pertalite");
        System.out.println("Nama : " + myPertalite.getNama());
        myPertalite.setHarga(7650);
        System.out.println("Harga : Rp."+myPertalite.getHarga() + " /liter");
        myPertalite.setTipe("oktan 90");
        System.out.println("Tipe Bahan Bakar : "+myPertalite.getTipe());
    }
}

class PertaminaDex extends Pertamina{
    public double harga;
    public String tipe, nama;
    public String getNama(){
        return nama;
    }
    public void setNama(String newNama){
        this.nama = newNama;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double newHarga){
        this.harga = newHarga;
    }
    public String getTipe(){
        return tipe;
    }
    public void setTipe(String newTipe){
        this.tipe = newTipe;
    }
    
    static void PertaminaDex(){
        PertaminaDex myPertaminaDex = new PertaminaDex();
        myPertaminaDex.setNama("PertaminaDex");
        System.out.println("Nama : " + myPertaminaDex.getNama());
        myPertaminaDex.setHarga(11150);
        System.out.println("Harga : Rp."+myPertaminaDex.getHarga() + " /liter");
        myPertaminaDex.setTipe("Solar");
        System.out.println("Tipe Bahan Bakar : "+myPertaminaDex.getTipe());
    }
}

class main{
    public static void main (String[] args) {
      Pertamina.Pertamina();
      PertamaxTurbo.PertamaxTurbo();
      Pertamax.Pertamax();
      Pertalite.Pertalite();
      PertaminaDex.PertaminaDex();
    }
}