package recap2benn;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        String gun="persembe";
        gun=gun.toLowerCase();

        switch (gun){
            case "pazartesi":
            case "sali":
                System.out.println("java dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("selenyum dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
            default:
                System.out.println("izin gunu");
        }
    }
}
