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
        this.rendszam = rendszam;
    }

    @Override
    public String getRendszam() {
        return this.rendszam;
    }

    @Override
    public void setBelepesiIdo(LocalDateTime belepesiIdo) {
        this.belepesiIdo = belepesiIdo;
    }

    @Override
    public LocalDateTime getBelepesiIdo() {
        return this.belepesiIdo;
    }

    @Override
    public void setKilepesiIdo(LocalDateTime kilepesiIdo) {
        this.kilepesiIdo = kilepesiIdo;
    }

    @Override
    public LocalDateTime getKilepesiIdo() {
        return this.kilepesiIdo;
    }

    @Override
    public void setFizetve(boolean fizetve) {
        this.fizteve = fizetve;
    }

    @Override
    public boolean getFizetve() {
        return this.fizteve;
    }

    @Override
    public double getParkolasiOradij() {
        return this.parkolasiOradij;
    }

    @Override
    public void setParkolasiOradij(double pOradij) {
        this.parkolasiOradij = pOradij;
    }
}
