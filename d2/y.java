package D2;

import B2.f;
import N.e;
import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class y extends Exception {

    /* renamed from: Z  reason: collision with root package name */
    public static final StackTraceElement[] f1194Z = new StackTraceElement[0];

    /* renamed from: U  reason: collision with root package name */
    public final List f1195U;

    /* renamed from: V  reason: collision with root package name */
    public f f1196V;

    /* renamed from: W  reason: collision with root package name */
    public int f1197W;

    /* renamed from: X  reason: collision with root package name */
    public Class f1198X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f1199Y;

    public y(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof y) {
            for (Throwable a8 : ((y) th).f1195U) {
                a(a8, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, x xVar) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            xVar.append((CharSequence) "Cause (");
            int i8 = i + 1;
            xVar.append((CharSequence) String.valueOf(i8));
            xVar.append(" of ");
            xVar.append(String.valueOf(size));
            xVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof y) {
                ((y) th).e(xVar);
            } else {
                c(th, xVar);
            }
            i = i8;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i8 = i + 1;
            sb.append(i8);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i8;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f1195U, new x(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f1199Y);
        String str3 = "";
        if (this.f1198X != null) {
            str = ", " + this.f1198X;
        } else {
            str = str3;
        }
        sb.append(str);
        int i = this.f1197W;
        if (i != 0) {
            str2 = ", ".concat(e.M(i));
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.f1196V != null) {
            str3 = ", " + this.f1196V;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace() {
        e(System.err);
    }

    public y(String str, List list) {
        this.f1199Y = str;
        setStackTrace(f1194Z);
        this.f1195U = list;
    }

    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }
}
