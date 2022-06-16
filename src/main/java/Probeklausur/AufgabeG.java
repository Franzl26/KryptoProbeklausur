package Probeklausur;

import Funktionen.*;

public class AufgabeG {
    public static void main(String[] args) {
        ECGleichung g = new ECGleichung(2,2,17);
        g.printAllElements().forEach(o -> System.out.println(o + ": " + o.isPrimitive()));
        ECPunkt P = new ECPunkt(g,7,6);
        ECPunkt QA = P.mult(2);
        System.out.println("QA = " + QA);
    }
}
