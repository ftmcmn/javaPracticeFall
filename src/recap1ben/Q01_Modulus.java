package recap1ben;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basamaklı bir sayi giriniz");
        int sayi=scan.nextInt();

        int ilkIki=sayi%100;
        int toplam1=ilkIki%10 + ilkIki/10;
        int sonIki=sayi/1000;
        int toplam2=sonIki%10 + sonIki/10;

        System.out.println(toplam1+toplam2);
    }


}
