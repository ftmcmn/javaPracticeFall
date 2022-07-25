package day8_practiceBenn;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Q04_HackerLanguage {

// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin=scan.nextLine();

        hackerDilii(metin);
    }

    private static void hackerDilii(String metin) {

        System.out.println(metin.replace("s", "5").
                replace("a", "4").replace("e", "3").
                replace("i","1").replace("o","0"));



    }


}
