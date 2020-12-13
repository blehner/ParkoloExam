import sun.rmi.server.LoaderHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here


    }
}


// Ez itt csak a teszteleshez alkalmazott kod lett...

//        LocalDateTime be = LocalDateTime.now();
//        LocalDateTime ki = LocalDateTime.now();
//
//        System.out.println(be.toString());
//        System.out.println(ki.toString());
//
//        Jarmu fabia = new Auto("abc-123", be, ki, false);
//        Jarmu jazz = new Auto("abc-234", LocalDateTime.now(), LocalDateTime.now(), false);
//        Jarmu vespa = new Motor("abc-234", LocalDateTime.now(), LocalDateTime.now(), false);
//
//        System.out.println("A harom osztaly pontos meghatarozasa: ");
//        System.out.println(fabia.getClass());
//        System.out.println(jazz.getClass());
//        System.out.println(vespa.getClass());
//
//
//        System.out.println("Ekkor lepett ki a Fabia:  " + fabia.getKilepesiIdo().toString());
//        System.out.println("Ekkor lepett ki a Jazz:  " + jazz.getKilepesiIdo().toString());
//
//        ArrayList<Jarmu> tarolo = new ArrayList<>();
//
//        tarolo.add(fabia);
//        tarolo.add(jazz);
//
//        System.out.println("Ez az egyes auto rendszama:  " + tarolo.get(0).getRendszam());
//        System.out.println("Ez az kettes auto rendszama:  " + tarolo.get(1).getRendszam());
//
//        //PL. torles a tarolobol (vagyis kilepes)
//
//        for (int i = 0; i < tarolo.size(); i++) {
//            if (tarolo.get(i).getRendszam().equals("abc-234")) {
//                tarolo.remove(i);
//            }
//        }
//
//        System.out.println("A tarolo merete: " + tarolo.size());
//
//
//    }
//}
