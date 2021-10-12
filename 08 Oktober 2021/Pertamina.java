class Pertamina{
    public String slogan;
    public String nama(){
        return "Pertamina";
    }
    public String slogan(){
        return slogan;
    }
    public void setSlogan(String newSlogan){
        this.slogan = newSlogan;
    }
}

class Pertamax_Turbo extends Pertamina{
    public int harga;
    public String nama(){
        return "Pertamax Turbo";
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int newHarga){
        this.harga = newHarga;
    }
}

class Pertamax extends Pertamina{
    public int harga;
    public String nama(){
        return "Pertamax";
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int newHarga){
        this.harga = newHarga;
    }
}

class Pertalite extends Pertamina{
    public int harga;
    public String nama(){
        return "Pertalite";
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int newHarga){
        this.harga = newHarga;
    }
}

class PertaminaDex extends Pertamina{
    public int harga;
    public String nama(){
        return "PertaminaDex";
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int newHarga){
        this.harga = newHarga;
    }
}

class Hasil{
    public static void main(String[] args){
        Pertamina myPertamina = new Pertamina();
        System.out.println(myPertamina.nama());
        myPertamina.setSlogan("Pasti Pas");
        System.out.println(myPertamina.slogan());

        Pertamax_Turbo myPertamax_Turbo = new Pertamax_Turbo();
        System.out.println(myPertamax_Turbo.nama());
        myPertamax_Turbo.setHarga(12000);
        System.out.println("Harga : Rp."+myPertamax_Turbo.getHarga() + " /liter");

        Pertamax myPertamax = new Pertamax();
        System.out.println(myPertamax.nama());
        myPertamax.setHarga(9000);
        System.out.println("Harga : Rp."+myPertamax.getHarga() + " /liter");

        Pertalite myPertalite = new Pertalite();
        System.out.println(myPertalite.nama());
        myPertalite.setHarga(7650);
        System.out.println("Harga : Rp."+myPertalite.getHarga() + " /liter");

        PertaminaDex myPertaminaDex = new PertaminaDex();
        System.out.println(myPertaminaDex.nama());
        myPertaminaDex.setHarga(11150);
        System.out.println("Harga : Rp."+myPertaminaDex.getHarga() + " /liter");
    }
}