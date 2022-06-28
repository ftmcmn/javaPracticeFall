package recap2benn;

import java.util.Scanner;

public class Q06_StringManipulation {

    //Scanner kullanarak iki ayri deger giriniz
    // ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin
    //ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("iki ayri kelime giriniz");
        String deger1=scan.nextLine();
        String deger2=scan.nextLine();

        System.out.println(deger1.concat(deger2));
        System.out.println(deger1.substring(1,deger1.length()).concat(deger2.substring(1,deger2.length())));


    }
}
