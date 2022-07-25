package day7_practiceBennn;

import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("arayin uzunlugunu giriniz");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];
        int enKucuk=100;
        int enBuyuk=arr[0];

        for (int i = 0; i < arr.length; i++) {

            System.out.print("arrayin "+i+" . elemanini giriniz :");
            arr[i]=scan.nextInt();

            if (arr[i]<enKucuk){

                enKucuk=arr[i];
            }
            if (arr[i]>enBuyuk){

                enBuyuk=arr[i];
            }



        }
        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enKucuk = " + enKucuk);

        System.out.println("array'in en buyuk elemani ile en kucuk elemanının  farkı :"+(enBuyuk-enKucuk));
    }

}
