package day5_practiceBenn;

import java.util.Scanner;

public class Q01_For {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String harf=scan.nextLine();
        if(harf.length()==1) {
            char harf1 = harf.charAt(0);
            for (int i = 0; i <1000 ; i++) {
                if(i==harf1){
                    System.out.println(!(harf1 >= 'a' && harf1 <= 'z') ? "yanlış karakter" :
                            (harf1 == 'a' || harf1 == 'e' || harf1 == 'o' || harf1 == 'u' || harf1 == 'i') ?
                                    "sesli" : "sessiz");
                }
            }
        }else System.out.println("yanlış karakter");
    }
}
