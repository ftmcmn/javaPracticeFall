package day8_practiceBenn;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};

        List<Integer> arrList=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            arrList.add(arr[i]);

        }
        System.out.println(arrList);
        arrList.remove(arrList.indexOf(1));
        System.out.println(arrList);

        List<Integer>maximum=new ArrayList<>();


        int n=3;
        int i=1;

        while (i<=n){
            int maxSayi=arrList.get(0);

            for (int j = 0; j <arrList.size() ; j++) {

                if (arrList.get(j)>maxSayi && !(maximum.contains(arrList.get(j)))){

                    maxSayi=arrList.get(j);
                }

            }
            System.out.println(maxSayi);
            //arrList.remove(arrList.indexOf(maxSayi));
            maximum.add(maxSayi);

            i++;

        }

        System.out.println(maximum);


    }


}
