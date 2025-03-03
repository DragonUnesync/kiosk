package G3;

import P0.r;
import Q5.f;
import Q5.h;
import Q5.i;
import android.text.TextUtils;
import androidx.emoji2.text.n;
import androidx.emoji2.text.u;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class e implements n {

    /* renamed from: U  reason: collision with root package name */
    public final String f1639U;

    public /* synthetic */ e(String str, boolean z) {
        this.f1639U = str;
    }

    public static e d(r rVar) {
        String str;
        rVar.I(2);
        int v4 = rVar.v();
        int i = v4 >> 1;
        int v8 = ((rVar.v() >> 3) & 31) | ((v4 & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        if (v8 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(v8);
        return new e(sb.toString(), false);
    }

    public void a(StringBuilder sb, Iterator it) {
        CharSequence charSequence;
        CharSequence charSequence2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    charSequence = (CharSequence) next;
                } else {
                    charSequence = next.toString();
                }
                sb.append(charSequence);
                while (it.hasNext()) {
                    sb.append(this.f1639U);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        charSequence2 = (CharSequence) next2;
                    } else {
                        charSequence2 = next2.toString();
                    }
                    sb.append(charSequence2);
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public i b() {
        i iVar;
        String str = this.f1639U;
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        synchronized (f.class) {
            iVar = null;
            try {
                f.b((i) null);
                ArrayList arrayList = (ArrayList) f.f4138a.get(upperCase);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        i iVar2 = (i) it.next();
                        if (!iVar2.f4151G0) {
                            iVar2.f4151G0 = true;
                            iVar = iVar2;
                            break;
                        }
                    }
                }
            } finally {
                while (true) {
                }
            }
        }
        if (iVar == null) {
            iVar = f.d(str);
            if (!iVar.u()) {
                throw new h();
            } else if (iVar.B()) {
                synchronized (f.class) {
                    try {
                        if (!iVar.C()) {
                            HashMap hashMap = f.f4138a;
                            if (hashMap.get(upperCase) == null) {
                                hashMap.put(upperCase, new ArrayList());
                            }
                            ((ArrayList) hashMap.get(upperCase)).add(iVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                throw new h();
            }
        }
        return iVar;
    }

    public String c(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public Object j() {
        return this;
    }

    public boolean m(CharSequence charSequence, int i, int i8, u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i8), this.f1639U)) {
            return true;
        }
        uVar.f7826c = (uVar.f7826c & 3) | 4;
        return false;
    }

    public e(String str) {
        str.getClass();
        this.f1639U = str;
    }
}
