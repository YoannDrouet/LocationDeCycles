package fr.eni.main;

import fr.eni.bo.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cycle [] tabCycle = new Cycle[15];
        tabCycle[0] = new Velo("lapierre", "speed 400", LocalDate.of(2020,5,3), (byte)27);
        tabCycle[1] = new Velo("Btwin", "riverside 900", LocalDate.of(2020,7,27), (byte)10);
        tabCycle[2] = new Gyropode("Segway", "Ninebot elite", LocalDate.of(2021,2,21),(short)40,(short)150);
        tabCycle[3] = new Gyropode("Weebot", "Echo", LocalDate.of(2019,8,23), (short)35, (short)160);
        tabCycle[4] = new Gyroroue("Immotion", "v8", LocalDate.of(2020,12,18),(short)40);
        tabCycle[6] = new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2021,1,30),(short)30);

        for (int i = 0; i < tabCycle.length; i++) {
            if (tabCycle[i] == null){
                break;
            }
            tabCycle[i].afficher();
        }

        Adresse adresse = new Adresse(12, null, "rue Geoffroy Drouet", 4400, "Nantes");
        Loueur yoann = new Loueur("Drouet", "Yoann", LocalDate.of(1995,7,27), "0641546650", adresse);

        //yoann.location(tabCycle[0], 90);
        yoann.location(tabCycle[0],100);
        //yoann.location(tabCycle[0],100);

        yoann.rendreCycle(tabCycle[0]);
        yoann.rendreCycle(tabCycle[0]);
    }
}
