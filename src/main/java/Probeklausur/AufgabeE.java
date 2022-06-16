package Probeklausur;

import static Funktionen.Funktionen.*;

public class AufgabeE {
    public static void main(String[] args) {
        long inv = inverseBerechnenLong(17,60);
        System.out.println("17^-1 mod 60 = " + inv);
        long c = modPow(2,17,77).longValue();
        System.out.println("2^17 mod 77 = " + c);
    }
}
