package day7_practiceBennn;

import java.util.Arrays;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */

    public static void main(String[] args) {
        String cumle= "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        cumle=cumle.replace(" ","");
        System.out.println(cumle.length());

        String arr[]=cumle.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }

}
