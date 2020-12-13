import sun.security.krb5.internal.crypto.Aes128;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Parkolo {
    private int ferohelyMotor = 25;
    private int ferohelyAuto = 120;
    private int ferohelyTeherauto = 20;
    private final ArrayList<Automata> automataTarolo = new ArrayList<>();
    private final ArrayList<Jarmu> jarmuTarolo = new ArrayList<>();
    LocalDateTime ido;

    public int getFerohelyMotor() {
        return ferohelyMotor;
    }

    public void setFerohelyMotor(int ferohelyMotor) {
        this.ferohelyMotor = ferohelyMotor;
    }

    public int getFerohelyAuto() {
        return ferohelyAuto;
    }

    public void setFerohelyAuto(int ferohelyAuto) {
        this.ferohelyAuto = ferohelyAuto;
    }

    public int getFerohelyTeherauto() {
        return ferohelyTeherauto;
    }

    public void setFerohelyTeherauto(int ferohelyTeherauto) {
        this.ferohelyTeherauto = ferohelyTeherauto;
    }

    public LocalDateTime getIdo() {
        return ido;
    }

    public void setIdo(LocalDateTime ido) {
        this.ido = ido;
    }

    public Jarmu getJarmuRendszam(String rendszam) {

        for (int i = 0; i < this.jarmuTarolo.size(); i++) {
            if (this.jarmuTarolo.get(i).getRendszam().equals(rendszam.trim())) {
                return this.jarmuTarolo.get(i);
            }
        }
        return null;
    }


    public Jarmu getJarmu(int szam) {
        return this.jarmuTarolo.get(szam);
    }


    //készítettem egy beolvasást tesztelve müködik!
    public void beolvasFile(String fajlNev) throws IOException {
        File fajl = new File(fajlNev);
        try (FileReader fr = new FileReader(fajl);
             BufferedReader br = new BufferedReader(fr)) {

            String sorok;
            //ArrayList<Jarmu> tarolo = new ArrayList<>();

            while ((sorok = br.readLine()) != null) {
                String[] szetvagSorok = sorok.split(";");

                switch (szetvagSorok[0]) {
                    case "auto":
                        Jarmu auto = new Auto(szetvagSorok[1].trim(), LocalDateTime.parse(szetvagSorok[2]), LocalDateTime.parse(szetvagSorok[3]), false);
                        this.jarmuTarolo.add(auto);
                        this.setFerohelyAuto(getFerohelyAuto() - 1);
                        break;
                    case "motor":
                        Jarmu motor = new Motor(szetvagSorok[1].trim(), LocalDateTime.parse(szetvagSorok[2]), LocalDateTime.parse(szetvagSorok[3]), false);
                        this.jarmuTarolo.add(motor);
                        this.setFerohelyMotor(getFerohelyMotor() - 1);
                        break;
                    case "teherauto":
                        Jarmu teher = new Teherauto(szetvagSorok[1].trim(), LocalDateTime.parse(szetvagSorok[2]), LocalDateTime.parse(szetvagSorok[3]), false);
                        this.jarmuTarolo.add(teher);
                        this.setFerohelyTeherauto(getFerohelyTeherauto() - 1);
                        break;
                }
            }

        }
    }

    public boolean belepJarmu() {
        return true;
    }

    public void kilepJarmu(Jarmu j) {
        for (int i = 0; i < jarmuTarolo.size(); i++) {
            if (jarmuTarolo.get(i).equals(j) && j.getFizetve()) {
                jarmuTarolo.remove(j);
            }
        }
    }

    public void hozzaadAutomata() {

    }

    public void kiveszAutomata() {

    }
}