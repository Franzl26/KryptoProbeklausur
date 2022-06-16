package Probeklausur;

import static Funktionen.Funktionen.*;

public class AufgabeF {
    public static void main(String[] args) {
        long s = 22;
        long p = 131;
        long betta = 75;
        long b = 12;
        long[] m = new long[]{69, 105, 115};
        long[] r = new long[]{74, 75, 13};
        long[] c1 = new long[3];
        long[] c2 = new long[3];
        long[] x = new long[3];
        long[] xInv = new long[3];
        long[] m2 = new long[3];
        for (int i = 0; i<3;i++) {
            c1[i] = modPow(s, r[i], p).longValue();
            c2[i] = mod(modPow(betta,r[i],p).longValue() * m[i], p);
            x[i] = modPow(c1[i], b, p).longValue();
            xInv[i] = inverseBerechnenLong(x[i], p);
            m2[i] = mod(xInv[i] * c2[i], p);
            System.out.println("c1: " + c1[i]);
            System.out.println("c2: " + c2[i]);
            System.out.println("x: " + x[i]);
            System.out.println("x^-1: " + xInv[i]);
            System.out.println("m: " + m2[i]);
            System.out.println();
        }
    }
}
