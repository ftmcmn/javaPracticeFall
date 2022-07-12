package day4_practiceBenn;

import java.util.Scanner;

public class Q03_MethodCreation {
       /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = sc.nextInt();


        fibonacci(sayi);

    }

    private static void fibonacci(int sayi) {

        int sayi1 = -1;
        int sayi2 = 1;

        int toplam = 0;
        System.out.print(toplam+" ");


        for (int i = 0; i < sayi; i++) {

            sayi1 = sayi2;
            sayi2 = toplam;
            toplam = sayi1 + sayi2;


            if (toplam<47){
                System.out.print(toplam+" ");
            }

        }
    }
}

