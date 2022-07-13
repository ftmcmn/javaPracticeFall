package day5_practiceBenn;

public class Q04_MetCreationForLoop {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

    public static void main(String[] args) {

        String str="hayat cok zor";

        reverseString(str);
    }

    private static void reverseString(String str) {

        for (int i =str.length()-1; i >=0 ; i--) {

            String ters="";
            ters+=str.charAt(i);

            System.out.print(ters);

        }
    }
}
