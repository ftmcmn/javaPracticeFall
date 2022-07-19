package day6_practiceBennn;

import java.util.Scanner;

public class Q03_DoWhileLoop {

      /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
      public static void main(String[] args) {

          Scanner scan=new Scanner(System.in);
          String harf;

          do {
              harf=scan.next();

              if (!harf.equalsIgnoreCase("x")) {
                  System.out.println("program çalisiyor");
              }

          }while (!harf.equalsIgnoreCase("x"));
          System.out.println("program bitti");

      }

}
