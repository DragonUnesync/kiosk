package C1;

import F.h;
import M0.H;
import Q7.g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y1.C1625a;

public final class a extends g {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f530c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    public final CharsetDecoder f531a = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    public final CharsetDecoder f532b = StandardCharsets.ISO_8859_1.newDecoder();

    public final H q(C1625a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f532b;
        CharsetDecoder charsetDecoder2 = this.f531a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new H(new c((String) null, bArr, (String) null));
        }
        Matcher matcher = f530c.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String E8 = h.E(group);
                E8.getClass();
                if (E8.equals("streamurl")) {
                    str3 = group2;
                } else if (E8.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new H(new c(str2, bArr, str3));
    }
}
