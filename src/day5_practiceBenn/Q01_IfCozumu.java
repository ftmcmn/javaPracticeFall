package day5_practiceBenn;

import java.util.Scanner;

public class Q01_IfCozumu {

     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("bir harf giriniz");
         String str=scan.next();

         char harf=str.charAt(0);

         if (str.length()>1){
         System.out.println("yanlıs karakter girdiniz");

         }else if (harf>=97 && harf<=122){

                if (harf=='a'||harf=='e'||harf=='u'||harf=='o'|| harf=='i'){

                    System.out.println(harf+" harfi sesli harftir");

                }else
                    System.out.println(harf+" harfi sessiz harftir");

        }else System.out.println("yanlış karakter girdiniz");







     }

}
