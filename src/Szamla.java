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

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(double osszeg) {
        this.osszeg = osszeg;
    }
}
