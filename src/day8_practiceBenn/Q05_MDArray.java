package day8_practiceBenn;

public class Q05_MDArray {

          /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */

    public static void main(String[] args) {

        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        kacEleman(arr);

    }

    public static void kacEleman(int[][] arr) {

        int count=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

               // System.out.print(arr[i][j]+" ");

                count++;

            }

        }
        System.out.println("eleman sayisi : "+count);


    }
}
