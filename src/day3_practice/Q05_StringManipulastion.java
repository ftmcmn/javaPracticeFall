package day3_practice;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin ve
    // hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi yaziniz");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();

        if (isim.length()<soyisim.length()){
            System.out.println("soyisim daha uzun : "+soyisim);
        }else if(isim.length()>soyisim.length()) {
            System.out.println("isim daha uzun : " + isim);
        }else System.out.println("isim ve soyisim uzunluklari esit");
    }
}
