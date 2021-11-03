package UTS;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

class product {
    public String jenis;
    public double usia;
    public double harga;

    public String getJenis(){
        return jenis;
    }
    public void setJenis(String newJenis){
        this.jenis = newJenis;
    }
    public double getUsia(){
        return usia;
    }
    public void setUsia(double newUsia){
        this.usia = newUsia;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double newHarga){
        this.harga = newHarga;
    }

    static void Product(){
        File file = new File("D:/Kuliah/Semester 3/Pemograman Berorientasi Objek/GitHub/UTS/Product/Product.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<product> Product = new ArrayList<product>();

        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while(dis.available() != 0){
                String line = dis.readLine();
                String[] data = line.split(",");

                product a = new product();
                a.setJenis(data[0]);
                double usia = Double.parseDouble(data[1]);
                a.setUsia(usia);
                double harga = Double.parseDouble(data[2]);
                a.setHarga(harga);

                Product.add(a);
            }
        }

        catch (Exception e) {//yang tidak bisa dikerjakan
            System.out.println("File "+file.getName()+" Tidak Ditemukan");
            System.out.println("Error "+e.getMessage());
        }

        for(product a : Product){
            System.out.println("=====================");
            System.out.println("Jenis Anjing : "+a.getJenis());
            System.out.println("Usia : "+a.getUsia()+" Bulan");
            System.out.println("Harga : Rp."+a.getHarga());
        }
    }
}

