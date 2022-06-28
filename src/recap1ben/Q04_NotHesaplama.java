package recap1ben;

import java.util.Scanner;

public class Q04_NotHesaplama {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("vize1 notunuzu giriniz");
        double vize1=scan.nextDouble();
        System.out.println("vize2 notunuzu giriniz");
        double vize2=scan.nextDouble();
        System.out.println("final notunuzu giriniz");
        double finall=scan.nextDouble();

        double gecmeNotu=(vize1+vize2)/2*30/100+finall*70/100;

        System.out.println(gecmeNotu);

    }


}
