package UTS;

import java.util.Scanner;

class main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.println("Toko Anjing ALF");
        System.out.println("1 => lihat product \n2 => request");
        System.out.println("Masukan pilihan = ");
        pilihan = input.nextInt();
    
        if (pilihan==1)
            product.Product();
        else if (pilihan==2)
            Request.Request();
        else 
            System.out.println("pilihan salah");

         
    }
}
