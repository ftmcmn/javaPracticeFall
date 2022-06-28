package recap2benn;

public class Q04_NestedIfandTernary {
     /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
     public static void main(String[] args) {

         int sayi=7;

         if (sayi>=0 && sayi<10){
             if (sayi==9){
                 System.out.println("dokuz");
             }else if (sayi==8){
                 System.out.println("sekiz");
             }else if (sayi==7){
                 System.out.println("yedi");
             }else if (sayi==6){
                 System.out.println("alti");
             }else if (sayi==5){
                 System.out.println("bes");
             }else if (sayi==4){
                 System.out.println("dort");
             }else if (sayi==3){
                 System.out.println("uc");
             }else if (sayi==2){
                 System.out.println("iki");
             }else System.out.println("sifir");

         }else System.out.println("gecersiz");

         String sonuc=(sayi>9 || sayi<0)?"gecersiz":sayi==9?"dokuz":sayi==8?"sekiz":sayi==7?"yedi":sayi==6?"alti":
                               sayi==5?"bes":sayi==4?"dort":sayi==3?"uc":sayi==2?"iki":sayi==1?"bir":"sifir";

         System.out.println(sonuc);

     }
}
