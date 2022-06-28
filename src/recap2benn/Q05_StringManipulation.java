package recap2benn;

import java.util.Scanner;

public class Q05_StringManipulation {

    //Kullanicidan ismini ve soyisimi girmesini isteyin,
    //sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyisminiz giriniz");
        String isim=scan.nextLine().toUpperCase();
        String soyisim=scan.nextLine().toUpperCase();

        System.out.println(isim+" "+soyisim);
    }
}
