import java.util.ArrayList;

public class Automata {

    private ArrayList<Szamla> szamlatarolo = new ArrayList<>();
    private int automataSorszama;

    //-----------------------------------

    //todo:ellenorizni kell, hogy szukseges-e a konstruktorba a szamlatarola, ha fent ugyis megvan
    public Automata(int automataSorszama) {
        //this.szamlatarolo = szamlatarolo;
        this.automataSorszama = automataSorszama;
    }

    public Szamla getSzamla() {
        // a szamla kiallitasi programkod az iratok szerint
        return null;
    }

    //todo: ide nem biztos, hogy kell a bool visszateresi ertek!!!

    public boolean fizetSzamla(Jarmu j) {
        return true;
    }

}
