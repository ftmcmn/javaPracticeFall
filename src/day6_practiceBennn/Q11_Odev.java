package day6_practiceBennn;

import java.util.Scanner;

public class Q11_Odev {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String pin="";

        String pinKodu="Ftmcmn88";

        int girishakki=3;

        while (!(girishakki==0)){

            System.out.println("pin kodunuzu giriniz");
            pin=scan.nextLine();

            if (pin.equals(pinKodu)){

                System.out.println("gecerli pin kodu");break;
            }else {
                girishakki--;
                System.out.println("kalan hakkınız : "+girishakki);

                if (girishakki==0){
                    System.out.println("kartiniz bloke olmustur");
                }
            }
        }

    }

    

}
