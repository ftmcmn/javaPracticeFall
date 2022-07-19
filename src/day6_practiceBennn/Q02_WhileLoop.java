package day6_practiceBennn;

import java.util.Scanner;

public class Q02_WhileLoop {

     /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil(tek ise)

        */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         System.out.println("sayi giriniz");

         int sayi=0;

         while (!(sayi==101)){
             sayi=scan.nextInt();

             if (sayi%2==1){
                 System.out.println(sayi+" ");
             }

         }
     }

}
