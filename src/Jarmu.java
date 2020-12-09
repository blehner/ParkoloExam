import java.time.LocalDateTime;

public interface Jarmu {

    void setRendszam(String rendszam);

    String getRendszam();

    void setBelepesiIdo(LocalDateTime belepesiIdo);

    LocalDateTime getBelepesiIdo();

    void setKilepesiIdo(LocalDateTime kilepesiIdo);

    LocalDateTime getKilepesiIdo();

    void setFizetve(boolean fizetve);

    boolean getFizetve();

    double getParkolasiOradij();

    void setParkolasiOradij(double pOradij);


}
