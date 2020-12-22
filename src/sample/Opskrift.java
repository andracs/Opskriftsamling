package sample;

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

}
