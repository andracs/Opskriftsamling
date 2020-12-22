package sample;

import java.util.ArrayList;

public class Opskrift {
    String navn;
    String fremgangsmaade;
    int antalPortioner;
    int tilberedningstid;
    String ingredienser;


    void setNavn(String navn){
        this.navn = navn;
    }

    void setFremgangsmaade(String fremgangsmaade){
        this.fremgangsmaade = fremgangsmaade;
}

    void setAntalPortioner(int antalPortioner){
        this.antalPortioner = antalPortioner;
    }

    void setTilberedningstid(int tilberedningstid){
        this.tilberedningstid = tilberedningstid;
    }

    void setIngredienser(String ingredienser){
        this.ingredienser = ingredienser;
    }


    String getNavn(){
        return navn;
    }

    String getFremgangsmaade(){
        return fremgangsmaade;
    }

    int getAntalPortioner(){
        return antalPortioner;
    }

    int getTilberedningstid(){
        return tilberedningstid;
    }

    String getIngredienser(){
        return ingredienser;
    }

    Opskrift(){

        System.out.println("Opskrift er oprettet: " + navn);
    }

    public void addIngrediens(Ingrediens ingrediens){
        ArrayList<Ingrediens> ingredienser = new ArrayList<Ingrediens>();
        for (int i = 0; i < 4; i++){
           Ingrediens ingr = new Ingrediens();

            ingredienser.add(ingr);
        }
    }

    public void visIngredienser(){
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }

    public void visFremgangsmaade(){
        System.out.println("Opskriften for " + getNavn() + ": \n" + fremgangsmaade + "\n");

    }
    public void visOpskrift(){
        visIngredienser();
        visFremgangsmaade();
    }


}
