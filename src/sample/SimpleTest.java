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

        Opskrift opskrift = new Opskrift();
        navn = "Te";
        opskrift.addIngrediens(new Ingrediens("Vand"));
        opskrift.addIngrediens(new Ingrediens("Tebreve"));
        opskrift.addIngrediens(new Ingrediens("Citron"));
        fremgangsmaade = "- Put teen i kogende vand, vent 2 minutter og server.";
        opskrift.visFremgangsmaade();


        navn = "Glasur";
        opskrift.addIngrediens(new Ingrediens("Vand"));
        opskrift.addIngrediens(new Ingrediens("Flormelis"));
        fremgangsmaade = "- Du blander flormelis og sukker, og smører det på kagen.";
        opskrift.visFremgangsmaade();

    }
    public void blankLine(){
        System.out.println("\n");
    }

        Ingrediens ingrediens = new Ingrediens();
        navn = "citron";
        kalorier = 15;
        ingrediens.rigPaaKalorier();

        navn = "sukker"
        kalorier = 350;
        ingrediens.rigPaaKalorier();


}
