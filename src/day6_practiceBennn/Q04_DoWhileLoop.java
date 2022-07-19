package day6_practiceBennn;

import java.util.Scanner;

public class Q04_DoWhileLoop {
     /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String input="";

        do {
            System.out.println("lutfen kelime giriniz");
            input=scan.next();

            if (input.length()>2 && input.length()%2==1){

                System.out.println(input.charAt(input.length()/2));

            }else System.out.println("yanlıs kelime");

        }while (!(input.length()%2==1 && input.length()>2));


    }
}
