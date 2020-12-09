import java.time.LocalDateTime;

public class Szamla {

    private String rendszam;
    private LocalDateTime datum;
    private double osszeg;

    public Szamla(String rendszam, LocalDateTime datum, double osszeg) {
        this.rendszam = rendszam;
        this.datum = datum;
        this.osszeg = osszeg;
    }
}
