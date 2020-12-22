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
        navn = "Te";
        te.addIngrediens(new Ingrediens("Vand"));
        te.addIngrediens(new Ingrediens("Tebreve"));
        te.addIngrediens(new Ingrediens("Citron"));

        Opskrift glasur = new Opskrift();
        navn = "Glasur";
        te.addIngrediens(new Ingrediens("Vand"));
        te.addIngrediens(new Ingrediens("Flormelis"));


    }
    public void blankLine(){
        System.out.println("\n");
    }
}
