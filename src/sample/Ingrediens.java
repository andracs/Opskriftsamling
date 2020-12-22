package sample;

public class Ingrediens {

    String navn;
    int kalorie;


    void setNavn(String navn) {
        this.navn = navn;
    }

    void setKalorie(int kalorie) {
        this.kalorie = kalorie;
    }

    String getNavn() {
        return navn;
    }

    int getKalorie() {
        return kalorie;
    }

    Ingrediens() {
        System.out.println("Opskrift er oprettet: ");
    }

    public boolean rigPaaKalorier() {


        if (kalorie > 100) {System.out.println("" + navn + " er rig på kalorier.");}
        else {System.out.println("" + navn + " er ikke rig på kalorier.");}
    }

}
