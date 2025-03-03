package e6;

import g6.B;
import g6.C0980m;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Map;

/* renamed from: e6.k  reason: case insensitive filesystem */
public abstract class C0852k {
    private static final Charset[] CHARSETS;
    public static final Charset ISO_8859_1;
    public static final Charset US_ASCII;
    public static final Charset UTF_16;
    public static final Charset UTF_16BE;
    public static final Charset UTF_16LE;
    public static final Charset UTF_8;

    static {
        Charset forName = Charset.forName("UTF-16");
        UTF_16 = forName;
        Charset forName2 = Charset.forName("UTF-16BE");
        UTF_16BE = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        UTF_16LE = forName3;
        Charset forName4 = Charset.forName("UTF-8");
        UTF_8 = forName4;
        Charset forName5 = Charset.forName("ISO-8859-1");
        ISO_8859_1 = forName5;
        Charset forName6 = Charset.forName("US-ASCII");
        US_ASCII = forName6;
        CHARSETS = new Charset[]{forName, forName2, forName3, forName4, forName5, forName6};
    }

    public static CharsetEncoder encoder(Charset charset, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2) {
        B.checkNotNull(charset, "charset");
        CharsetEncoder newEncoder = charset.newEncoder();
        newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction2);
        return newEncoder;
    }

    public static CharsetEncoder encoder(Charset charset) {
        B.checkNotNull(charset, "charset");
        Map<Charset, CharsetEncoder> charsetEncoderCache = C0980m.get().charsetEncoderCache();
        CharsetEncoder charsetEncoder = charsetEncoderCache.get(charset);
        if (charsetEncoder != null) {
            CharsetEncoder reset = charsetEncoder.reset();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            reset.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            return charsetEncoder;
        }
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
        CharsetEncoder encoder = encoder(charset, codingErrorAction2, codingErrorAction2);
        charsetEncoderCache.put(charset, encoder);
        return encoder;
    }
}
