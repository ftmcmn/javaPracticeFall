package day7_practiceBennn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("kullanici adinizi giriniz :");
        String kullAdi=scan.nextLine();

        kullAdi=kullAdi.replace(" ","");

        List<String> kullAdlari=new ArrayList<>();
        kullAdlari.add("fatma");
        kullAdlari.add("elmas");
        kullAdlari.add("zeynep");

        if (kullAdlari.contains(kullAdi)){

            kullAdlari.add(kullAdi+4);
        }else {
            kullAdlari.add(kullAdi);
        }
        System.out.println(kullAdlari);
    }
}
