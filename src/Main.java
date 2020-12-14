import sun.rmi.server.LoaderHandler;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Parkolo p = new Parkolo();
        p.beolvasFile("jarmuvek.txt");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        NAV n = new NAV();
        Automata a = new Automata();
        p.hozzaadAutomata(a);

        Scanner be = new Scanner(System.in);

        //Boolean runs = true;
        String szoveg;

        String tipus;
        String rendszam;
        String idopont;
        short valasz;

        while (true) {

            System.out.println("----------------FOMENU--------------------");
            System.out.println("1. Ugyfelmenu");
            System.out.println("2. Parkoloiranyito");
            System.out.println("3. NAV");
            System.out.println("4. Kilepes");

            valasz = be.nextShort();

            switch (valasz) {
                case 1:
                    be.nextLine();
                    System.out.println("----------------UGYFELMENU--------------------");
                    System.out.println("1. Behajtas a parkoloba");
                    System.out.println("2. Szamla kifizetese");
                    System.out.println("3. Kihajtas a parkolobol");
                    System.out.println("4. Fomenu");

                    valasz = be.nextShort();
                    switch (valasz) {
                        case 1:
                            be.nextLine();
                            System.out.println("A jarmu tipusa: ");
                            //be.nextLine();
                            tipus = be.nextLine();
                            System.out.println("A jarmu rendszama: ");
                            //be.nextLine();
                            rendszam = be.nextLine();
                            System.out.println("Belepesi ido (yyyy-MM-dd HH:mm):");
                            //be.nextLine();
                            idopont = be.nextLine();
                            LocalDateTime belepesiIdo = LocalDateTime.parse(idopont, formatter);
                            if (tipus.toLowerCase().trim().equals("auto") && p.getFerohelyAuto() > 0) {
                                Jarmu auto = new Auto(rendszam, belepesiIdo, null, false);
                                p.belepJarmu(auto);

                            } else if (tipus.toLowerCase().trim().equals("teherauto") && p.getFerohelyTeherauto() > 0) {
                                Jarmu teherauto = new Teherauto(rendszam, belepesiIdo, null, false);
                                p.belepJarmu(teherauto);

                            } else if (tipus.toLowerCase().trim().equals("motor") && p.getFerohelyMotor() > 0) {
                                Jarmu motor = new Motor(rendszam, belepesiIdo, null, false);
                                p.belepJarmu(motor);
                            } else if (p.getFerohelyMotor() == 0 || p.getFerohelyAuto() == 0 || p.getFerohelyTeherauto() == 0) {
                                System.out.println("A parkoloban nincsen hely, kerem jojjon vissza kesobb.");
                            } else {
                                System.out.println(tipus);
                                System.out.println(rendszam);
                                System.out.println(idopont);

                            }
                            break;
                        case 2:
                            System.out.println("Szamlakifizetes");
                            System.out.println("Kerem az auto rendszamat: ");
                            be.nextLine();
                            rendszam = be.nextLine();
                            a.fizetSzamla(p.getJarmu(rendszam), p, n);
                            break;
                        case 3:
                            System.out.println("kilepes a parkolobol");
                            System.out.println("Kerem az auto rendszamat: ");
                            be.nextLine();
                            rendszam = be.nextLine();
                            if (p.getJarmu(rendszam).getFizetve()) {
                                p.kilepJarmu(p.getJarmu(rendszam));
                            } else {
                                System.out.println("Kerem fizessen az automatanal a kilepes elott!");
                            }
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("----------------PARKOLOIRANYITO MENU--------------------");
                    System.out.println("1. Listazza a parkolo jarmuveket");
                    System.out.println("2. Listazza az eddigi szamlakat");
                    System.out.println("3. Fomenu");

                    valasz = be.nextShort();
                    switch (valasz) {
                        case 1:
                            p.parkoloJarmuvekListaja();
                            break;

                        case 2:
                            System.out.println("A parkoloban kifizetett osszes szamla listaja:");
                            a.getSzamla();
                        case 3:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("----------------NAV MENU--------------------");
                    System.out.println("1. NAV Szamlak listazasa");
                    System.out.println("2. Fomenu");
                    int valasz2 = be.nextShort();
                    switch (valasz2) {
                        case 1:
                            n.getSzamla();
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}



