package Probeklausur;

import DES.*;

import static DES.Schnittstelle.*;

public class AufgabeD {
    public static void main(String[] args) {
        BitArray input = hexStringToBitArray("e4 76 c9 57 f3 0a 1b 55");
        BitArray key = hexStringToBitArray("01 ff 01 ff 01 ff 01 ff");
        System.out.println("m = " + input);
        BitArray ipDone = doIP(input);
        System.out.println("ipDone = " + ipDone.toString(16, true));

        Des d = getDesIteratorWithoutIP(input, key, false);
        d.doIP();
        d.nextRound();
        System.out.println("after 1. round = " + d.getCurrentText().toString(16, true));
    }
}
