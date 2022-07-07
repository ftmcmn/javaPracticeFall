package recap2benn;

import java.util.Scanner;

public class Q05_StringManipulation {

    //Kullanicidan ismini ve soyisimi girmesini isteyin,
    //sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyisminiz giriniz");
        String isim=scan.nextLine(), soyisim=scan.nextLine();

        String fullName=isim.concat(" "+soyisim).toUpperCase();

        System.out.println(fullName);
    }
}
