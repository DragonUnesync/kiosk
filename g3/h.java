package G3;

import A.f;
import D2.o;
import Q7.g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u.C1477r;

public final class h implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public int f1641U = 2;

    /* renamed from: V  reason: collision with root package name */
    public String f1642V;

    /* renamed from: W  reason: collision with root package name */
    public final CharSequence f1643W;

    /* renamed from: X  reason: collision with root package name */
    public final c f1644X;

    /* renamed from: Y  reason: collision with root package name */
    public int f1645Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public int f1646Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ f f1647a0;

    public h(f fVar, o oVar, CharSequence charSequence) {
        this.f1647a0 = fVar;
        this.f1644X = (c) oVar.f1138W;
        this.f1646Z = oVar.f1137V;
        this.f1643W = charSequence;
    }

    public final boolean hasNext() {
        String str;
        int i = this.f1641U;
        if (i != 4) {
            int h5 = C1477r.h(i);
            if (h5 == 0) {
                return true;
            }
            if (h5 == 2) {
                return false;
            }
            this.f1641U = 4;
            int i8 = this.f1645Y;
            while (true) {
                int i9 = this.f1645Y;
                if (i9 == -1) {
                    this.f1641U = 3;
                    str = null;
                    break;
                }
                b bVar = (b) this.f1647a0.f17V;
                CharSequence charSequence = this.f1643W;
                int length = charSequence.length();
                g.h(i9, length);
                while (true) {
                    if (i9 >= length) {
                        i9 = -1;
                        break;
                    } else if (bVar.a(charSequence.charAt(i9))) {
                        break;
                    } else {
                        i9++;
                    }
                }
                if (i9 == -1) {
                    i9 = charSequence.length();
                    this.f1645Y = -1;
                } else {
                    this.f1645Y = i9 + 1;
                }
                int i10 = this.f1645Y;
                if (i10 == i8) {
                    int i11 = i10 + 1;
                    this.f1645Y = i11;
                    if (i11 > charSequence.length()) {
                        this.f1645Y = -1;
                    }
                } else {
                    c cVar = this.f1644X;
                    if (i8 < i9) {
                        charSequence.charAt(i8);
                        cVar.getClass();
                    }
                    if (i9 > i8) {
                        charSequence.charAt(i9 - 1);
                        cVar.getClass();
                    }
                    int i12 = this.f1646Z;
                    if (i12 == 1) {
                        i9 = charSequence.length();
                        this.f1645Y = -1;
                        if (i9 > i8) {
                            charSequence.charAt(i9 - 1);
                            cVar.getClass();
                        }
                    } else {
                        this.f1646Z = i12 - 1;
                    }
                    str = charSequence.subSequence(i8, i9).toString();
                }
            }
            this.f1642V = str;
            if (this.f1641U == 3) {
                return false;
            }
            this.f1641U = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    public final Object next() {
        if (hasNext()) {
            this.f1641U = 2;
            String str = this.f1642V;
            this.f1642V = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
