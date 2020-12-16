import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Automata {

    private final ArrayList<Szamla> szamlatarolo = new ArrayList<>();

    public void getSzamla() {
        System.out.println("Az AUTOMATABAN tarolt szamlak listaja: ");
        System.out.println("------------------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        for (int i = 0; i < this.szamlatarolo.size(); i++) {
            System.out.print("A(z)" + i + ". szamu szamla: ");
            System.out.println(this.szamlatarolo.get(i).getDatum().format(formatter) + " " +
                    "Rendszam: " + this.szamlatarolo.get(i).getRendszam() + " " +
                    "Osszeg: " + this.szamlatarolo.get(i).getOsszeg());
        }
    }

    public boolean fizetSzamla(Jarmu j, Parkolo p, NAV n) {
        LocalDateTime fromDateTime = j.getBelepesiIdo();
        LocalDateTime toDateTime = p.getIdo();
        if (!j.getFizetve()) {
            Duration parkolasiIdo = Duration.between(fromDateTime, toDateTime);
            long pIdo = parkolasiIdo.toHours();

            if (pIdo < 1) {

                //fizetest allitok rajta es igy alkalmas lesz a kilepresre
                j.setFizetve(true);
                j.setKilepesiIdo(toDateTime);
                return true;
            } else if (pIdo > 1) {
                double osszeg = j.getParkolasiOradij() * pIdo;
                Szamla sz = new Szamla(j.getRendszam(), toDateTime, osszeg);
                n.addSzamla(sz);
                this.szamlatarolo.add(sz);
                //kileptets kovetkezik
                j.setFizetve(true);
                j.setKilepesiIdo(toDateTime);
                return true;
            } else {
                //valami hiba tortent
                return false;
            }
        } else {
            System.out.println("On mar kifizette a szamlajat!");
            return false;
        }
    }
}
