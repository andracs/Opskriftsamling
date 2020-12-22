package sample;

public class Ingrediens extends Opskrift {

    String navn;
    int kalorie;


    void setNavn(String navn){
        this.navn = navn;
    }

    void setKalorie(int kalorie){
        this.kalorie = kalorie;
    }

    String getNavn(){
        return navn;
    }

    int getKalorie(){
        return kalorie;
    }

    Ingrediens(){
        System.out.println("Opskrift er oprettet: ");
}
}
