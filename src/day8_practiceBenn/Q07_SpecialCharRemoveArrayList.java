package day8_practiceBenn;

import java.util.ArrayList;
import java.util.List;

public class Q07_SpecialCharRemoveArrayList {
      /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
      public static void main(String[] args) {

          List<String>list=new ArrayList<>();

          list.add("$-13");
          list.add("$15");
          list.add("$-20");

          gettSum(list);

      }

    private static void gettSum(List<String> list) {

        int sonuc=0;
        int sayi;


        for (int i = 0; i <list.size(); i++) {

           list.set(i,list.get(i).replace("$",""));
           sayi=Integer.parseInt(list.get(i));
           sonuc+=sayi;

        }

        if (sonuc<0){
            System.out.println("cevap : "+-1);
        }else{
        System.out.println("cevap : "+sonuc);
        }
    }
}
