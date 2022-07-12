package day3_practiceBenn;

import java.util.Scanner;

public class Q07_StringManipulation {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime girin");
        String str= scan.next();

        for (int i = str.length()-1; i >=0; i--) {

            System.out.print(str.charAt(i));

        }

    }

}
