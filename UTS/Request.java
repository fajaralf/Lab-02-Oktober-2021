package UTS;

import java.util.Scanner;

class Request extends product{
    static void Request(){
        String jenis;
        int usia;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Request Jenis Anjing yang ingin dibeli");
        System.out.print("Jenis Anjing: ");
        jenis = keyboard.nextLine();
        System.out.print("Usia(Bulan): ");
        usia = keyboard.nextInt();

        System.out.println("-------------------");
        System.out.println("Jenis Anjing yang di Request");
        System.out.println("Jenis Anjing " + jenis);
        System.out.println("Usia " + usia + " Bulan");
    }
}
