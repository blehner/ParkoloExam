import sun.rmi.server.LoaderHandler;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        System.out.println("proba feltoltes");
    }
}

