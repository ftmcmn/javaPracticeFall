package recap1ben;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
    public static void main(String[] args) {

        char finalNotu='B';

        System.out.println(finalNotu=='A'?"gayet basarili":finalNotu=='B'
                                         ?"basarili":finalNotu=='C'?"ha gayret":"digerleri");
    }


}
