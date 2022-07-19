package day7_practiceBennn;

import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
       int arr[]=new int[4];
       int enKucuk=100000;
       int enBuyuk=-100000;

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

        System.out.println("array'in en buyuk elemani ile en kucuk elemanının  farkı :"+(enBuyuk-enKucuk));
    }

}
