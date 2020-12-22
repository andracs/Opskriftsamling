package sample;

public class SimpleTest {

        static String navn;
        static int kalorie;
        static String fremgangsmaade;
        static int antalPortioner;
        static int tilberedningstid;
        static String ingredienser;


    public static void main(String[] args) {
        System.out.println("Velkommen til min opskrifts-applikations-dummy");

        Opskrift te = new Opskrift();
        String[] Te = {"tebrev", "vand", "citron"};

        Opskrift glasur = new Opskrift();
        String[] Glasur = {"vand", "flormelis"};


    }
    public void blankLine(){
        System.out.println("\n");
    }
}
