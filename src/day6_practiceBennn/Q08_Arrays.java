package day6_practiceBennn;

import java.util.Scanner;

public class Q08_Arrays {

     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[8];
        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

            System.out.println(i+" . index deki sayiyi giriniz");
            arr[i]=scan.nextInt();
            System.out.println(arr[i]);

            if (arr[i]%3==0){
                sayac++;
            }

        }
        System.out.println("aralarından "+sayac+ " tane sayi 3'e bölünebilir");

    }



}
