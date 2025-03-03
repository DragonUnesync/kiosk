package V1;

import D2.j;
import androidx.recyclerview.widget.RecyclerView;
import i5.t;
import java.io.Serializable;
import java.util.Arrays;
import java.util.function.ToIntFunction;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    public int f5714a;

    /* renamed from: b  reason: collision with root package name */
    public int f5715b;

    /* renamed from: c  reason: collision with root package name */
    public int f5716c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5717d;
    public Serializable e;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object[], java.io.Serializable] */
    public G(j jVar) {
        this.f5717d = jVar;
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(jVar.f1093U - 1));
        this.e = new Object[numberOfLeadingZeros];
        jVar.getClass();
        this.f5716c = (int) (((float) numberOfLeadingZeros) * 0.25f);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object[], java.io.Serializable] */
    public void a() {
        Object[] objArr;
        Object obj;
        int i;
        int i8 = this.f5715b + 1;
        this.f5715b = i8;
        if (i8 > this.f5716c) {
            Object[] objArr2 = (Object[]) this.e;
            if (objArr2.length < 1073741824) {
                int length = objArr2.length;
                int i9 = length << 1;
                int i10 = i9 - 1;
                ? r52 = new Object[i9];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    j jVar = (j) this.f5717d;
                    if (i11 < length) {
                        Object obj2 = objArr2[i11];
                        if (obj2 != null) {
                            Class<t> cls = t.class;
                            if (obj2.getClass() == cls) {
                                t tVar = (t) obj2;
                                int i13 = i11 + length;
                                t tVar2 = null;
                                objArr = objArr2;
                                t tVar3 = null;
                                t tVar4 = null;
                                t tVar5 = null;
                                while (true) {
                                    if ((tVar.f12759a & i10) == i11) {
                                        if (tVar3 == null) {
                                            r52[i11] = tVar;
                                        } else {
                                            tVar3.f12761c = tVar;
                                            tVar4 = tVar3;
                                        }
                                        tVar3 = tVar;
                                    } else {
                                        if (tVar2 == null) {
                                            r52[i13] = tVar;
                                        } else {
                                            tVar2.f12761c = tVar;
                                            tVar5 = tVar2;
                                        }
                                        tVar2 = tVar;
                                    }
                                    obj = tVar.f12761c;
                                    i = i12 + 1;
                                    if (obj.getClass() != cls) {
                                        break;
                                    }
                                    tVar = (t) obj;
                                    i12 = i;
                                }
                                if ((((ToIntFunction) jVar.f1094V).applyAsInt(obj) & i10) == i11) {
                                    if (tVar3 == null) {
                                        r52[i11] = obj;
                                    } else {
                                        tVar3.f12761c = obj;
                                    }
                                    if (tVar2 != null) {
                                        if (tVar5 == null) {
                                            r52[i13] = tVar2.f12760b;
                                        } else {
                                            tVar5.f12761c = tVar2.f12760b;
                                        }
                                    }
                                } else {
                                    if (tVar2 == null) {
                                        r52[i13] = obj;
                                    } else {
                                        tVar2.f12761c = obj;
                                    }
                                    if (tVar3 != null) {
                                        if (tVar4 == null) {
                                            r52[i11] = tVar3.f12760b;
                                        } else {
                                            tVar4.f12761c = tVar3.f12760b;
                                        }
                                    }
                                }
                                i12 = i;
                            } else {
                                objArr = objArr2;
                                r52[((ToIntFunction) jVar.f1094V).applyAsInt(obj2) & i10] = obj2;
                            }
                        } else {
                            objArr = objArr2;
                        }
                        i11++;
                        objArr2 = objArr;
                    } else {
                        this.e = r52;
                        this.f5715b = i12;
                        jVar.getClass();
                        this.f5716c = (int) (((float) i9) * 0.25f);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object[], java.io.Serializable] */
    public void b() {
        if (this.f5714a > 0) {
            Object[] objArr = (Object[]) this.e;
            int length = objArr.length;
            j jVar = (j) this.f5717d;
            int i = jVar.f1093U;
            if (length == i) {
                Arrays.fill(objArr, (Object) null);
            } else {
                this.e = new Object[i];
            }
            this.f5714a = 0;
            this.f5715b = 0;
            jVar.getClass();
            this.f5716c = (int) (((float) jVar.f1093U) * 0.25f);
        }
    }

    public void c() {
        int i;
        int i8 = this.f5716c;
        if (i8 == Integer.MIN_VALUE) {
            i = this.f5714a;
        } else {
            i = i8 + this.f5715b;
        }
        this.f5716c = i;
        this.e = ((String) this.f5717d) + this.f5716c;
    }

    public void d() {
        if (this.f5716c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public Object e(Object obj, boolean z) {
        Object[] objArr = (Object[]) this.e;
        j jVar = (j) this.f5717d;
        int applyAsInt = ((ToIntFunction) jVar.f1094V).applyAsInt(obj);
        int length = (objArr.length - 1) & applyAsInt;
        Object obj2 = objArr[length];
        if (obj2 == null) {
            objArr[length] = obj;
            this.f5714a++;
            return null;
        }
        Class<?> cls = obj2.getClass();
        ToIntFunction toIntFunction = (ToIntFunction) jVar.f1094V;
        Class<t> cls2 = t.class;
        if (cls == cls2) {
            while (true) {
                t tVar = (t) obj2;
                if (tVar.f12759a == applyAsInt) {
                    Object obj3 = tVar.f12760b;
                    if (z) {
                        tVar.f12760b = obj;
                    }
                    return obj3;
                }
                Object obj4 = tVar.f12761c;
                if (obj4.getClass() == cls2) {
                    obj2 = obj4;
                } else {
                    int applyAsInt2 = toIntFunction.applyAsInt(obj4);
                    if (applyAsInt2 == applyAsInt) {
                        if (z) {
                            tVar.f12761c = obj;
                        }
                        return obj4;
                    }
                    tVar.f12761c = new t(obj4, applyAsInt2, obj);
                    this.f5714a++;
                    a();
                    return null;
                }
            }
        } else {
            int applyAsInt3 = toIntFunction.applyAsInt(obj2);
            if (applyAsInt3 == applyAsInt) {
                if (z) {
                    objArr[length] = obj;
                }
                return obj2;
            }
            objArr[length] = new t(obj2, applyAsInt3, obj);
            this.f5714a++;
            a();
            return null;
        }
    }

    public Object f(int i) {
        Object[] objArr = (Object[]) this.e;
        int length = (objArr.length - 1) & i;
        Object obj = objArr[length];
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        j jVar = (j) this.f5717d;
        Class<t> cls2 = t.class;
        if (cls == cls2) {
            t tVar = (t) obj;
            if (tVar.f12759a == i) {
                objArr[length] = tVar.f12761c;
                this.f5715b--;
                g();
                return tVar.f12760b;
            }
            Object obj2 = tVar.f12761c;
            Class<?> cls3 = obj2.getClass();
            Object obj3 = obj2;
            if (cls3 == cls2) {
                while (true) {
                    t tVar2 = (t) obj3;
                    if (tVar2.f12759a == i) {
                        tVar.f12761c = tVar2.f12761c;
                        this.f5715b--;
                        g();
                        return tVar2.f12760b;
                    }
                    Object obj4 = tVar2.f12761c;
                    if (obj4.getClass() == cls2) {
                        tVar = tVar2;
                        obj3 = obj4;
                    } else if (((ToIntFunction) jVar.f1094V).applyAsInt(obj4) != i) {
                        return null;
                    } else {
                        tVar.f12761c = tVar2.f12760b;
                        this.f5715b--;
                        g();
                        return obj4;
                    }
                }
            } else if (((ToIntFunction) jVar.f1094V).applyAsInt(obj2) != i) {
                return null;
            } else {
                objArr[length] = tVar.f12760b;
                this.f5715b--;
                g();
                return obj2;
            }
        } else if (((ToIntFunction) jVar.f1094V).applyAsInt(obj) != i) {
            return null;
        } else {
            objArr[length] = null;
            g();
            return obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object[], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g() {
        /*
            r13 = this;
            int r0 = r13.f5714a
            int r0 = r0 + -1
            r13.f5714a = r0
            int r1 = r13.f5716c
            if (r0 >= r1) goto L_0x0078
            java.io.Serializable r0 = r13.e
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r0.length
            java.lang.Object r2 = r13.f5717d
            D2.j r2 = (D2.j) r2
            int r3 = r2.f1093U
            if (r1 <= r3) goto L_0x0078
            int r1 = r0.length
            int r3 = r1 >> 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r13.f5715b
            r6 = 0
            java.lang.System.arraycopy(r0, r6, r4, r6, r3)
            r6 = r3
        L_0x0023:
            if (r6 >= r1) goto L_0x0069
            r7 = r0[r6]
            if (r7 == 0) goto L_0x0066
            int r8 = r6 - r3
            r9 = r4[r8]
            if (r9 != 0) goto L_0x0032
            r4[r8] = r7
            goto L_0x0066
        L_0x0032:
            java.lang.Class r10 = r9.getClass()
            java.lang.Object r11 = r2.f1094V
            java.util.function.ToIntFunction r11 = (java.util.function.ToIntFunction) r11
            java.lang.Class<i5.t> r12 = i5.t.class
            if (r10 != r12) goto L_0x005a
            i5.t r9 = (i5.t) r9
        L_0x0040:
            java.lang.Object r8 = r9.f12761c
            java.lang.Class r10 = r8.getClass()
            if (r10 != r12) goto L_0x004c
            r9 = r8
            i5.t r9 = (i5.t) r9
            goto L_0x0040
        L_0x004c:
            i5.t r10 = new i5.t
            int r11 = r11.applyAsInt(r8)
            r10.<init>(r8, r11, r7)
            r9.f12761c = r10
        L_0x0057:
            int r5 = r5 + 1
            goto L_0x0066
        L_0x005a:
            i5.t r10 = new i5.t
            int r11 = r11.applyAsInt(r9)
            r10.<init>(r9, r11, r7)
            r4[r8] = r10
            goto L_0x0057
        L_0x0066:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0069:
            r13.e = r4
            r13.f5715b = r5
            float r0 = (float) r3
            r2.getClass()
            r1 = 1048576000(0x3e800000, float:0.25)
            float r0 = r0 * r1
            int r0 = (int) r0
            r13.f5716c = r0
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.G.g():void");
    }

    public G(int i, int i8) {
        this(RecyclerView.UNDEFINED_DURATION, i, i8);
    }

    public G(int i, int i8, int i9) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f5717d = str;
        this.f5714a = i8;
        this.f5715b = i9;
        this.f5716c = RecyclerView.UNDEFINED_DURATION;
        this.e = "";
    }
}
