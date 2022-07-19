package day6_practiceBennn;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {
        int sayi=1258779;


        int toplam=0;
        int birlerBasamagi=0;

        while (!(sayi==0)){

            birlerBasamagi=sayi%10;

            toplam+=birlerBasamagi;

            sayi/=10;



        }
        System.out.println(toplam);

    }
}
