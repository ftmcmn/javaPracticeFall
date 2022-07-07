package day3_practice;

import java.util.Scanner;

public class Q04_StringManipulastion {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla
		 karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime girin");
        String str= scan.next();


       if( str.length()%2!=0 && str.length()>2) {
           System.out.println(str.substring(str.length()/2,str.length()/2+1));
       }else System.out.println("kelime 3 karakterden az");

    }
}
