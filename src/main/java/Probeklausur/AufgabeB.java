package Probeklausur;

import java.util.Arrays;

import static Funktionen.Funktionen.mod;

public class AufgabeB {
    public static void main(String[] args) {
        char[] c = "yxbhqgs".toCharArray();
        System.out.println("c = " + Arrays.toString(c));
        for (int i = 0; i < c.length; i++) {
            c[i] -= 'a';
        }
        int[] c2 = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            c2[i] = c[i];
        }
        System.out.println(Arrays.toString(c2));

        char[] k = "geheimg".toCharArray();
        System.out.println("k = " + Arrays.toString(k));
        for (int i = 0; i < k.length; i++) {
            k[i] -= 'a';
        }
        int[] k2 = new int[k.length];
        for (int i = 0; i < k.length; i++) {
            k2[i] = k[i];
        }
        System.out.println(Arrays.toString(k2));

        System.out.println("-----------------------------");
        char[] m = new char[c.length];
        for (int i = 0; i < k.length; i++) {
            m[i] = (char) mod((c[i] - k[i]), 26);
        }
        int[] m2 = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            m2[i] = m[i];
        }
        for (int i = 0; i < m.length; i++) {
            m[i] += 'a';
        }
        System.out.println(Arrays.toString(m2));
        System.out.println("m = " + Arrays.toString(m));

    }
}
