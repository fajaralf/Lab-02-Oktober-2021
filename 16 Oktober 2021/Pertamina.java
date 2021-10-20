package lab16okt;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

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