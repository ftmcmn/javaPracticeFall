package recap2benn;

public class Q03_SwitchCase {

    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {

        int sayi=100;

        int birlerBasamagi=sayi%10;
        int onlarBasamagı=sayi/10%10;
        int yuzlerBasamagı=sayi/100;

        if (sayi>99 && sayi<1000) {

            switch (yuzlerBasamagı) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("yuz");
                    break;
                case 2:
                    System.out.print("ikiyuz");
                    break;
                case 3:
                    System.out.print("ucyuz");
                    break;
                case 4:
                    System.out.print("dortyuz");
                    break;
                case 5:
                    System.out.print("besyuz");
                    break;
                case 6:
                    System.out.print("altıyuz");
                    break;
                case 7:
                    System.out.print("yediyuz");
                    break;
                case 8:
                    System.out.print("sekizyuz");
                    break;
                case 9:
                    System.out.print("dokuzyuz");

            }
            switch (onlarBasamagı) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print(" on");
                    break;
                case 2:
                    System.out.print(" yirmi");
                    break;
                case 3:
                    System.out.print(" otuz");
                    break;
                case 4:
                    System.out.print(" kırk");
                    break;
                case 5:
                    System.out.print(" elli");
                    break;
                case 6:
                    System.out.print(" altmis");
                    break;
                case 7:
                    System.out.print(" yetmis");
                    break;
                case 8:
                    System.out.print(" seksen");
                    break;
                case 9:
                    System.out.print(" doksan");

            }
            switch (birlerBasamagi) {
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print(" bir");
                    break;
                case 2:
                    System.out.print(" iki");
                    break;
                case 3:
                    System.out.print(" uc");
                    break;
                case 4:
                    System.out.print(" dort");
                    break;
                case 5:
                    System.out.print(" bes");
                    break;
                case 6:
                    System.out.print(" alti");
                    break;
                case 7:
                    System.out.print(" yedi");
                    break;
                case 8:
                    System.out.print(" sekiz");
                    break;
                case 9:
                    System.out.print(" dokuz");

            }
        }else System.out.println("3 basamakli sayi giriniz");

   }




}
