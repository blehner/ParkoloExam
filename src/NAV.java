import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class NAV {

    private final ArrayList<Szamla> navSzamlatarolo = new ArrayList<>();

    //----------------------------------

    public void addSzamla(Szamla sz) {
        this.navSzamlatarolo.add(sz);
    }

    public void getSzamla() {
        System.out.println("Az osszes NAV-nak bekuldott szamla listaja: ");
        System.out.println("--------------------------------------------" + "\t");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        for (int i = 0; i < this.navSzamlatarolo.size(); i++) {
            System.out.print("A(z)" + i + ". szamu szamla: ");
            System.out.println(this.navSzamlatarolo.get(i).getDatum().format(formatter) + " " +
                    "Rendszam: " + this.navSzamlatarolo.get(i).getRendszam() + " " +
                    "Osszeg: " + this.navSzamlatarolo.get(i).getOsszeg());
        }
    }
}
