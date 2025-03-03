package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class U extends Writer {

    /* renamed from: U  reason: collision with root package name */
    public final String f7940U = "FragmentManager";

    /* renamed from: V  reason: collision with root package name */
    public final StringBuilder f7941V = new StringBuilder(128);

    public final void close() {
        k();
    }

    public final void flush() {
        k();
    }

    public final void k() {
        StringBuilder sb = this.f7941V;
        if (sb.length() > 0) {
            Log.d(this.f7940U, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    public final void write(char[] cArr, int i, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c8 = cArr[i + i9];
            if (c8 == 10) {
                k();
            } else {
                this.f7941V.append(c8);
            }
        }
    }
}
