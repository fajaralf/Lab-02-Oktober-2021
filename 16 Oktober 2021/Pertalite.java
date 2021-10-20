package lab16okt;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

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
        File file = new File("D:/xampp/htdocs/Tugas/lab16okt/Pertalite.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Pertalite> Pertalite = new ArrayList<Pertalite>();

        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while(dis.available() != 0){
                String line = dis.readLine();
                String[] data = line.split(",");

                Pertalite a = new Pertalite();
                a.setNama(data[0]);
                double harga = Double.parseDouble(data[1]);
                a.setHarga(harga);
                a.setTipe(data[2]);

                Pertalite.add(a);
            }
        }

        catch (Exception e) {//yang tidak bisa dikerjakan
            System.out.println("File "+file.getName()+" Tidak Ditemukan");
            System.out.println("Error "+e.getMessage());
        }

        for(Pertalite a : Pertalite){
            System.out.println("=====================");
            System.out.println("Nama : "+a.getNama());
            System.out.println("Harga : Rp."+a.getHarga()+" /liter");
            System.out.println("Tipe : "+a.getTipe());
        }
    }
}