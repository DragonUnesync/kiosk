package M7;

import java.io.StringWriter;

public abstract class d extends c {
    public final int a(int i, StringWriter stringWriter, String str) {
        return b(Character.codePointAt(str, i), stringWriter) ? 1 : 0;
    }

    public abstract boolean b(int i, StringWriter stringWriter);
}
