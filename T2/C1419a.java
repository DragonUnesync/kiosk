package t2;

import android.support.v4.media.session.b;
import m2.C1208a;
import u.C1477r;
import y2.C1630e;

/* renamed from: t2.a  reason: case insensitive filesystem */
public final class C1419a {

    /* renamed from: a  reason: collision with root package name */
    public final int f15182a;

    /* renamed from: b  reason: collision with root package name */
    public final C1425g f15183b;

    /* renamed from: c  reason: collision with root package name */
    public final C1630e f15184c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15185d;

    public C1419a(int i, C1425g gVar, C1630e eVar, int i8) {
        int i9;
        if (i >= 0) {
            try {
                if (!gVar.f16382U) {
                    int length = gVar.f16371V.length;
                    if (length != 0) {
                        int i10 = length - 2;
                        while (true) {
                            boolean z = true;
                            if (i10 >= 0) {
                                if (((C1424f) gVar.e(i10)).f15196U.e == 1) {
                                    i10--;
                                } else {
                                    throw new IllegalArgumentException(C1477r.c(i10, "insns[", "] is a branch or can throw"));
                                }
                            } else if (((C1424f) gVar.e(length - 1)).f15196U.e != 1) {
                                try {
                                    if (!eVar.f16382U) {
                                        int i11 = -1;
                                        if (i8 >= -1) {
                                            if (i8 >= 0) {
                                                int i12 = eVar.f16380W;
                                                if (!eVar.f16381X) {
                                                    i9 = 0;
                                                    while (true) {
                                                        if (i9 >= i12) {
                                                            i9 = -i12;
                                                            break;
                                                        } else if (eVar.f16379V[i9] == i8) {
                                                            break;
                                                        } else {
                                                            i9++;
                                                        }
                                                    }
                                                } else {
                                                    i9 = i12;
                                                    int i13 = -1;
                                                    while (i9 > i13 + 1) {
                                                        int i14 = ((i9 - i13) >> 1) + i13;
                                                        if (i8 <= eVar.f16379V[i14]) {
                                                            i9 = i14;
                                                        } else {
                                                            i13 = i14;
                                                        }
                                                    }
                                                    if (i9 == i12) {
                                                        i9 = (-i12) - 1;
                                                    } else if (i8 != eVar.f16379V[i9]) {
                                                        i9 = (-i9) - 1;
                                                    }
                                                }
                                                if (!((i9 >= 0 ? i9 : i11) < 0 ? false : z)) {
                                                    throw new IllegalArgumentException("primarySuccessor " + i8 + " not in successors " + eVar);
                                                }
                                            }
                                            this.f15182a = i;
                                            this.f15183b = gVar;
                                            this.f15184c = eVar;
                                            this.f15185d = i8;
                                            return;
                                        }
                                        throw new IllegalArgumentException("primarySuccessor < -1");
                                    }
                                    throw new C1208a((Exception) null, "mutable instance");
                                } catch (NullPointerException unused) {
                                    throw new NullPointerException("successors == null");
                                }
                            } else {
                                throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("insns.size() == 0");
                    }
                } else {
                    throw new C1208a((Exception) null, "mutable instance");
                }
            } catch (NullPointerException unused2) {
                throw new NullPointerException("insns == null");
            }
        } else {
            throw new IllegalArgumentException("label < 0");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "{" + b.P(this.f15182a) + '}';
    }
}
