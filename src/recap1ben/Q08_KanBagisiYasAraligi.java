package recap1ben;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {


		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("yasinizi giriniz");
            double yas=scan.nextDouble();
            System.out.println("kilonuzu giriniz");
            double kilo=scan.nextDouble();

            if (yas<18){
                System.out.println("kan bagişi yapamazsiniz");

            }else {
                if (kilo<50){
                    System.out.println("kan bagişi yapamazsiniz");
                }else System.out.println("kan bagişi yapabilir");
            }
        }

}