package Probeklausur;

import java.util.Arrays;

import static Funktionen.Funktionen.*;

public class AufgabeA {
    public static void main(String[] args) {
        a();
        b();
    }

    public static void a() {
        char[] m = "pruefung".toCharArray();
        System.out.println("m = " + Arrays.toString(m));
        for (int i = 0; i < m.length; i++) {
            m[i] -= 'a';
        }
        int[] m2 = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            m2[i] = m[i];
        }
        System.out.println(Arrays.toString(m2));

        char[] c = new char[m.length];

        for (int i = 0; i < m.length; i++) {
            c[i] = (char) mod(7 * m[i] + 6, 26);
        }
        int[] c2 = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            c2[i] = c[i];
        }
        System.out.println(Arrays.toString(c2));
        for (int i = 0; i < c.length; i++) {
            c[i] += 'a';
        }
        System.out.println("c = " + Arrays.toString(c));
    }

    public static void b() {
        long inv = inverseBerechnenLong(7,26);
        System.out.println("7^-1 mod 26 = " + inv);
    }
}
