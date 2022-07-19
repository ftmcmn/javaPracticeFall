package day6_practiceBennn;

import java.util.Scanner;

public class Q10_Interview {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime=scan.next();
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();

        ilkvesonHarf(kelime,sayi);

    }

    private static void ilkvesonHarf(String kelime, int sayi) {

        String output="";

        for (int i = 0; i < sayi; i++) {

            output+=kelime.substring(0,1)+kelime.substring(kelime.length()-1);

        }
        System.out.println(output);
    }


}
