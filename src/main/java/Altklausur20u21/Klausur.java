package Altklausur20u21;

import AES.*;
import Funktionen.ECGleichung;
import Funktionen.ECPunkt;

import static AES.Schnittstelle.*;
import static Funktionen.Funktionen.*;
import static LFSR.Funktionen.*;

public class Klausur {
    public static void main(String[] args) {
        aufgabe2();
        aufgabe3();
        aufgabe6();
    }

    public static void aufgabe2() {
        BitArray key = hexStringToBitArray("3C 9C F2 39 1A 49 BB DF 56 21 68 59 7A 3E E8 F9");
        RoundKeyGen it = getRoundKeyGenerator(key, false);

        BitArray m = hexStringToBitArray("A5 B7 76 E5 BD 2C EA 93 74 9E 5D 4F A7 16 CB 64");
        BitArray afterA = doAddRoundKey(m, key);
        System.out.println("a) " + afterA.toString(16, true));

        BitArray afterB = doSubstituteByte(afterA);
        System.out.println("b) " + afterB.toString(16, true));

        afterB = hexStringToBitArray("EE F1 5F 86 5C 4D D1 29 93 D8 96 47 C1 34 26 5E");
        BitArray afterC = doShiftRow(afterB);
        System.out.println("c) " + afterC.toString(16, true));

        BitArray afterD = doMixColum(afterC);
        System.out.println("d) " + afterD.toString(16, true));

        afterD = hexStringToBitArray("D8 8B 76 4E 00 A0 89 DD 17 33 62 97 07 17 40 F6");
        it.nextKey();
        BitArray afterF = it.nextKey();
        System.out.println("f) " + afterF.toString(16, true));

        BitArray afterG = doAddRoundKey(afterD, afterF);
        System.out.println("g) " + afterG.toString(16, true));
    }

    public static void aufgabe3() {
        char[] koeff = binString2arr("11111");
        char[] init = binString2arr("1011");
        nRounds(init, koeff, 16, true);
    }

    public static void aufgabe6() {
        ECGleichung gl = new ECGleichung(1, 6, 11);
        ECPunkt A = new ECPunkt(gl, 8, 3);
        //System.out.println(A);
        ECDSASignAndVerify(gl,A,13,3,8,4);
    }
}
