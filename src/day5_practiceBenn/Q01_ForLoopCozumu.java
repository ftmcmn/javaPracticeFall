package day5_practiceBenn;

import java.util.Scanner;

public class Q01_ForLoopCozumu {
    public static void main(String[] args) {
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
        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String str = scan.next();
        char harf = str.charAt(0);


        for (int i = 0; i < 255; i++) {
            i = harf;

            if (!(i <= 122 && i >= 97) || str.length() > 1) {
                System.out.println("yanlıs karakter girdiniz");

            } else if (i == 'a' || i == 'e' || i == 'u' || i == 'o' || i == 'i') {
                System.out.println("sesli");

            } else
                System.out.println("sessiz");
            break;


        }


    }


}

