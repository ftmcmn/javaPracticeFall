package day3_practiceBenn;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin
    // olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup
    // olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime girin");
        String str= scan.nextLine();

        System.out.println(str.contains(" "));
        System.out.println(str.isEmpty());

    }
}
