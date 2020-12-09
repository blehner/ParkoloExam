import sun.rmi.server.LoaderHandler;

import java.time.LocalDateTime;


public class Motor implements Jarmu {

    private String rendszam;
    private LocalDateTime belepesiIdo;
    private LocalDateTime kilepesiIdo;
    private boolean fizteve;
    private double parkolasiOradij = 200.0;

    public Motor(String rendszam, LocalDateTime belepesiIdo, LocalDateTime kilepesiIdo, boolean fizteve) {
        this.rendszam = rendszam;
        this.belepesiIdo = belepesiIdo;
        this.kilepesiIdo = kilepesiIdo;
        this.fizteve = fizteve;
    }

    @Override
    public void setRendszam(String rendszam) {

    }

    @Override
    public String getRendszam() {
        return null;
    }

    @Override
    public void setBelepesiIdo(LocalDateTime belepesiIdo) {

    }

    @Override
    public LocalDateTime getBelepesiIdo() {
        return null;
    }

    @Override
    public void setKilepesiIdo(LocalDateTime kilepesiIdo) {

    }

    @Override
    public LocalDateTime getKilepesiIdo() {
        return null;
    }

    @Override
    public void setFizetve(boolean fizetve) {

    }

    @Override
    public boolean getFizetve() {
        return false;
    }

    @Override
    public double getParkolasiOradij() {
        return 0;
    }

    @Override
    public void setParkolasiOradij(double pOradij) {
        this.parkolasiOradij = pOradij;
    }
}
