package M7;

import java.io.StringWriter;
import java.security.InvalidParameterException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public final class g extends c {

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f3189b;

    /* renamed from: c  reason: collision with root package name */
    public final BitSet f3190c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3191d;
    public final int e;

    public g(Map map) {
        if (map != null) {
            this.f3189b = new HashMap();
            this.f3190c = new BitSet();
            int i = Integer.MAX_VALUE;
            int i8 = 0;
            for (Map.Entry entry : map.entrySet()) {
                this.f3189b.put(((CharSequence) entry.getKey()).toString(), ((CharSequence) entry.getValue()).toString());
                this.f3190c.set(((CharSequence) entry.getKey()).charAt(0));
                int length = ((CharSequence) entry.getKey()).length();
                i = length < i ? length : i;
                if (length > i8) {
                    i8 = length;
                }
            }
            this.f3191d = i;
            this.e = i8;
            return;
        }
        throw new InvalidParameterException("lookupMap cannot be null");
    }

    public final int a(int i, StringWriter stringWriter, String str) {
        if (this.f3190c.get(str.charAt(i))) {
            int i8 = this.e;
            if (i + i8 > str.length()) {
                i8 = str.length() - i;
            }
            while (i8 >= this.f3191d) {
                CharSequence subSequence = str.subSequence(i, i + i8);
                String str2 = (String) this.f3189b.get(subSequence.toString());
                if (str2 != null) {
                    stringWriter.write(str2);
                    return Character.codePointCount(subSequence, 0, subSequence.length());
                }
                i8--;
            }
        }
        return 0;
    }
}
