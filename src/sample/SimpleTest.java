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
        fremgangsmaade = "- Put teen i kogende vand, vent 2 minutter og server.";
        Opskrift.visFremgangsmaade("Te");

        Opskrift glasur = new Opskrift();
        navn = "Glasur";
        te.addIngrediens(new Ingrediens("Vand"));
        te.addIngrediens(new Ingrediens("Flormelis"));
        fremgangsmaade = "- Du blander flormelis og sukker, og smører det på kagen.";
        Opskrift.visFremgangsmaade("Glasur");

    }
    public void blankLine(){
        System.out.println("\n");
    }
}
