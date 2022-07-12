package day4_practiceBenn;

public class Q01_MethodCreation {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {
        String input= "aabbcccccddddaaa";

        enFazlaBirKezYaz(input);

    }

    private static void enFazlaBirKezYaz(String input) {

        String output=input.substring(0,1);

        for (int i = 0; i <input.length()-1 ; i++) {

            for (int j = i+1; j < input.length()-1; j++) {


                if (!output.contains(input.substring(j,j+1))){
                    output+=input.substring(j,j+1);
                }

            }


        }
        System.out.println(output);

    }


}
