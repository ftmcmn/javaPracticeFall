package recap1ben;

import java.util.Scanner;

public class Q05_Scanner {


    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("a sayisini giriniz :");
        double a=scan.nextDouble();
        System.out.print("b sayisini giriniz :");
        double b=scan.nextDouble();
        System.out.print("c sayisini giriniz :");
        double c=scan.nextDouble();

        double sonuc=(Math.pow(a,2)-Math.pow(b,2))/3*c;

        System.out.println(sonuc);





    }


}
