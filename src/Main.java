import sun.rmi.server.LoaderHandler;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Parkolo p = new Parkolo();
        p.beolvasFile("jarmuvek.txt");
        System.out.println(p.getFerohelyAuto());
        System.out.println((p.getJarmu(1)).getRendszam());
        //Mindharom osztalyt helzesen keri le, vagyis rnedben van a feltoltes es lekeres
        System.out.println((p.getJarmuRendszam("AAA-123")).getClass());
        System.out.println((p.getJarmuRendszam("CBA-321")).getClass());
        System.out.println((p.getJarmuRendszam("RGG-234")).getClass());
        //itt volt a proba vissza töltés
        System.out.println("proba feltoltes");

        //NAV proba

        NAV n = new NAV();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime date1 = LocalDateTime.parse("2020-11-22 12:55", formatter);
        LocalDateTime date2 = LocalDateTime.parse("2020-11-22 12:55", formatter);
        LocalDateTime date3 = LocalDateTime.parse("2020-11-22 12:55", formatter);

        Szamla sz1 = new Szamla("ABC-123", date1, 250);
        Szamla sz2 = new Szamla("ABC-123", date2, 300);
        Szamla sz3 = new Szamla("ABC-123", date1, 400);

        n.addSzamla(sz1);
        n.addSzamla(sz2);
        n.addSzamla(sz3);



        n.getSzamla();
    }
}

