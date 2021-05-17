package fr.eni.main;

import fr.eni.bo.Cycle;
import fr.eni.bo.Gyropode;
import fr.eni.bo.Gyroroue;
import fr.eni.bo.Velo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cycle v1 = new Velo("lapierre", "speed 400", LocalDate.of(2020,5,3), (byte)27);
        Cycle v2 = new Velo("Btwin", "riverside 900", LocalDate.of(2020,7,27), (byte)10);
        Cycle gp1 = new Gyropode("Segway", "Ninebot elite", LocalDate.of(2021,2,21),(short)40,(short)150);
        Cycle gp2 = new Gyropode("Weebot", "Echo", LocalDate.of(2019,8,23), (short)35, (short)160);
        Cycle go1 = new Gyroroue("Immotion", "v8", LocalDate.of(2020,12,18),(short)40);
        Cycle go2 = new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2021,1,30),(short)30);
        v1.afficher();
        v2.afficher();
        gp1.afficher();
        gp2.afficher();
        go1.afficher();
        go2.afficher();
    }
}
