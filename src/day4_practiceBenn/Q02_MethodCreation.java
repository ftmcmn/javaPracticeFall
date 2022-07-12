package day4_practiceBenn;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

    public static void main(String[] args) {

        int santim=100000;
        donusum(santim);


    }

    private static void donusum(int santim) {

        double metre=santim/100;
        double kilometre=santim/100000;

        System.out.println(santim+" santimetre "+metre+" metredir.");
        System.out.println(santim+" santimetre "+kilometre+" kilometredir.");





    }
}
