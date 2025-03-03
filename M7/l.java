package M7;

import java.io.StringWriter;

public final class l extends d {
    public final boolean b(int i, StringWriter stringWriter) {
        if (i < 55296 || i > 57343) {
            return false;
        }
        return true;
    }
}
