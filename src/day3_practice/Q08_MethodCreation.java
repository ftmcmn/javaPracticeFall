package day3_practice;

import java.util.Scanner;

public class Q08_MethodCreation {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("toplama işlemi icin + ya\ncikarma islemi icin - ye" +
                 "\ncarpma islemi icin * ya\nbolme islemi icin / ye basiniz");
         char islem=scan.next().charAt(0);

         System.out.println("islem icin iki sayi giriniz");
         double sayi1=scan.nextDouble();
         double sayi2=scan.nextDouble();

         switch (islem){
             case '+':topla(sayi1,sayi2);
                 System.out.println(sayi1 +" ve "+sayi2 +" sayılarının toplami : "+(sayi1+sayi2));
                 break;
             case '-':cıkarma(sayi1,sayi2);
                 System.out.println(sayi1 +" ve "+sayi2 +" sayılarının farki : "+(sayi1-sayi2));
                 break;
             case '*':carpma(sayi1,sayi2);
                 System.out.println(sayi1 +" ve "+sayi2 +" sayılarının carpimi : "+sayi1*sayi2);
                 break;
             case '/':bolme(sayi1,sayi2);
                 System.out.println(sayi1 +" ve "+sayi2 +" sayılarının bolumu : "+sayi1/sayi2);
                 break;
             default:
                 System.out.println("dort islemden birini giriniz");

         }
     }

    private static double bolme(double sayi1, double sayi2) {

      return sayi1/sayi2;
    }

    private static double carpma(double sayi1, double sayi2) {
        return sayi1*sayi2;
    }

    private static double cıkarma(double sayi1, double sayi2) {
        return sayi1-sayi2;
    }

    private static double topla(double sayi1, double sayi2) {
       return sayi1+sayi2;
    }


}
