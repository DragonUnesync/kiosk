package Z5;

import S5.C0185n;
import S5.C0206y;
import e6.C0847f;
import e6.C0852k;

public abstract class M {
    public static void encoderHeader(CharSequence charSequence, CharSequence charSequence2, C0185n nVar) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        nVar.ensureWritable(length + length2 + 4);
        int writerIndex = nVar.writerIndex();
        writeAscii(nVar, writerIndex, charSequence);
        int i = writerIndex + length;
        C0206y.setShortBE(nVar, i, 14880);
        int i8 = i + 2;
        writeAscii(nVar, i8, charSequence2);
        int i9 = i8 + length2;
        C0206y.setShortBE(nVar, i9, 3338);
        nVar.writerIndex(i9 + 2);
    }

    private static void writeAscii(C0185n nVar, int i, CharSequence charSequence) {
        if (charSequence instanceof C0847f) {
            C0206y.copy((C0847f) charSequence, 0, nVar, i, charSequence.length());
        } else {
            nVar.setCharSequence(i, charSequence, C0852k.US_ASCII);
        }
    }
}
