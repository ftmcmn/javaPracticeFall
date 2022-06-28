package recap1ben;

public class Q09_NestedIF {

    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */
    public static void main(String[] args) {
        int yas=17;

        if (yas>=18) {
            System.out.println("oy kullanmaya uygun");

            if (yas < 50) {
                System.out.println("oy kullanmaya uygun");
                System.out.println("bir kez oy kullanabilir");
            } else if (yas < 70) {
                System.out.println("iki kez oy kullanabilir");
            } else {
                System.out.println("uc kez oy kullanabilir");
            }
        }else System.out.println("oy kullanamazsınız");


    }

}
