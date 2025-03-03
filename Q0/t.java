package Q0;

import P0.r;
import P0.z;
import T0.g0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import d4.k;
import g.C0940a;
import h1.f0;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import o.C1286o0;
import o.C1292s;
import v0.C1510H;
import v0.C1553z;
import y2.C1629d;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public int f4074a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4075b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4076c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4077d;
    public Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f4078f;

    public t(View view) {
        this.f4074a = -1;
        this.f4075b = view;
        this.f4076c = C1292s.a();
    }

    public static void b(StringBuffer stringBuffer, Writer writer) {
        int length = stringBuffer.length();
        if (length != 0 && stringBuffer.charAt(length - 1) != 10) {
            writer.write(10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r8 < ((Q0.r) r1.peek()).f4073V) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r8, P0.r r10) {
        /*
            r7 = this;
            int r0 = r7.f4074a
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r1 = r7.e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -1
            if (r0 == r2) goto L_0x0023
            int r0 = r1.size()
            int r3 = r7.f4074a
            if (r0 < r3) goto L_0x0023
            java.lang.Object r0 = r1.peek()
            Q0.r r0 = (Q0.r) r0
            int r3 = P0.z.f3748a
            long r3 = r0.f4073V
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0023
            goto L_0x00a1
        L_0x0023:
            java.lang.Object r0 = r7.f4076c
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0033
            P0.r r0 = new P0.r
            r0.<init>()
            goto L_0x0039
        L_0x0033:
            java.lang.Object r0 = r0.pop()
            P0.r r0 = (P0.r) r0
        L_0x0039:
            int r3 = r10.a()
            r0.E(r3)
            byte[] r3 = r10.f3732a
            int r10 = r10.f3733b
            byte[] r4 = r0.f3732a
            int r5 = r0.a()
            r6 = 0
            java.lang.System.arraycopy(r3, r10, r4, r6, r5)
            java.lang.Object r10 = r7.f4078f
            Q0.r r10 = (Q0.r) r10
            if (r10 == 0) goto L_0x0060
            long r3 = r10.f4073V
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0060
            java.util.ArrayList r8 = r10.f4072U
            r8.add(r0)
            return
        L_0x0060:
            java.lang.Object r10 = r7.f4077d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x0070
            Q0.r r10 = new Q0.r
            r10.<init>()
            goto L_0x0076
        L_0x0070:
            java.lang.Object r10 = r10.pop()
            Q0.r r10 = (Q0.r) r10
        L_0x0076:
            r10.getClass()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0083
            r6 = 1
        L_0x0083:
            P0.l.d(r6)
            java.util.ArrayList r3 = r10.f4072U
            boolean r4 = r3.isEmpty()
            P0.l.j(r4)
            r10.f4073V = r8
            r3.add(r0)
            r1.add(r10)
            r7.f4078f = r10
            int r8 = r7.f4074a
            if (r8 == r2) goto L_0x00a0
            r7.d(r8)
        L_0x00a0:
            return
        L_0x00a1:
            java.lang.Object r0 = r7.f4075b
            Q0.s r0 = (Q0.s) r0
            r0.b(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.t.a(long, P0.r):void");
    }

    public void c() {
        View view = (View) this.f4075b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : ((g0) this.f4077d) != null) {
                if (((g0) this.f4078f) == null) {
                    this.f4078f = new g0(3);
                }
                g0 g0Var = (g0) this.f4078f;
                g0Var.f4838b = null;
                g0Var.f4840d = false;
                g0Var.e = null;
                g0Var.f4839c = false;
                WeakHashMap weakHashMap = C1510H.f15874a;
                ColorStateList c8 = C1553z.c(view);
                if (c8 != null) {
                    g0Var.f4840d = true;
                    g0Var.f4838b = c8;
                }
                PorterDuff.Mode d8 = C1553z.d(view);
                if (d8 != null) {
                    g0Var.f4839c = true;
                    g0Var.e = d8;
                }
                if (g0Var.f4840d || g0Var.f4839c) {
                    C1292s.e(background, g0Var, view.getDrawableState());
                    return;
                }
            }
            g0 g0Var2 = (g0) this.e;
            if (g0Var2 != null) {
                C1292s.e(background, g0Var2, view.getDrawableState());
                return;
            }
            g0 g0Var3 = (g0) this.f4077d;
            if (g0Var3 != null) {
                C1292s.e(background, g0Var3, view.getDrawableState());
            }
        }
    }

    public void d(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.e;
            if (priorityQueue.size() > i) {
                r rVar = (r) priorityQueue.poll();
                int i8 = z.f3748a;
                int i9 = 0;
                while (true) {
                    int size = rVar.f4072U.size();
                    arrayList = rVar.f4072U;
                    if (i9 >= size) {
                        break;
                    }
                    ((s) this.f4075b).b(rVar.f4073V, (r) arrayList.get(i9));
                    ((ArrayDeque) this.f4076c).push((r) arrayList.get(i9));
                    i9++;
                }
                arrayList.clear();
                r rVar2 = (r) this.f4078f;
                if (rVar2 != null && rVar2.f4073V == rVar.f4073V) {
                    this.f4078f = null;
                }
                ((ArrayDeque) this.f4077d).push(rVar);
            } else {
                return;
            }
        }
    }

    public ColorStateList e() {
        g0 g0Var = (g0) this.e;
        if (g0Var != null) {
            return (ColorStateList) g0Var.f4838b;
        }
        return null;
    }

    public PorterDuff.Mode f() {
        g0 g0Var = (g0) this.e;
        if (g0Var != null) {
            return (PorterDuff.Mode) g0Var.e;
        }
        return null;
    }

    public void g(AttributeSet attributeSet, int i) {
        ColorStateList i8;
        View view = (View) this.f4075b;
        Context context = view.getContext();
        int[] iArr = C0940a.f11812A;
        k K22 = k.K2(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) K22.f9767W;
        View view2 = (View) this.f4075b;
        C1510H.o(view2, view2.getContext(), iArr, attributeSet, (TypedArray) K22.f9767W, i);
        boolean z = false;
        try {
            if (typedArray.hasValue(0)) {
                this.f4074a = typedArray.getResourceId(0, -1);
                C1292s sVar = (C1292s) this.f4076c;
                Context context2 = view.getContext();
                int i9 = this.f4074a;
                synchronized (sVar) {
                    i8 = sVar.f14067a.i(context2, i9);
                }
                if (i8 != null) {
                    k(i8);
                }
            }
            if (typedArray.hasValue(1)) {
                C1510H.r(view, K22.v(1));
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c8 = C1286o0.c(typedArray.getInt(2, -1), (PorterDuff.Mode) null);
                int i10 = Build.VERSION.SDK_INT;
                C1553z.k(view, c8);
                if (i10 == 21) {
                    Drawable background = view.getBackground();
                    if (!(C1553z.c(view) == null && C1553z.d(view) == null)) {
                        z = true;
                    }
                    if (background != null && z) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            K22.M2();
        } catch (Throwable th) {
            K22.M2();
            throw th;
        }
    }

    public void h() {
        this.f4074a = -1;
        k((ColorStateList) null);
        c();
    }

    public void i(int i) {
        ColorStateList colorStateList;
        this.f4074a = i;
        C1292s sVar = (C1292s) this.f4076c;
        if (sVar != null) {
            Context context = ((View) this.f4075b).getContext();
            synchronized (sVar) {
                colorStateList = sVar.f14067a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        k(colorStateList);
        c();
    }

    public void j() {
        StringBuffer stringBuffer;
        int indexOf;
        while (true) {
            StringBuffer stringBuffer2 = (StringBuffer) this.f4076c;
            int indexOf2 = stringBuffer2.indexOf("\n");
            if (indexOf2 >= 0 && (indexOf = stringBuffer.indexOf("\n")) >= 0) {
                StringWriter stringWriter = (StringWriter) this.f4075b;
                if (indexOf2 != 0) {
                    stringWriter.write(stringBuffer2.substring(0, indexOf2));
                }
                if (indexOf != 0) {
                    for (int i = this.f4074a - indexOf2; i > 0; i--) {
                        stringWriter.write(32);
                    }
                    stringWriter.write(stringBuffer.substring(0, indexOf));
                }
                stringWriter.write(10);
                stringBuffer2.delete(0, indexOf2 + 1);
                (stringBuffer = (StringBuffer) this.f4077d).delete(0, indexOf + 1);
            } else {
                return;
            }
        }
    }

    public void k(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((g0) this.f4077d) == null) {
                this.f4077d = new g0(3);
            }
            g0 g0Var = (g0) this.f4077d;
            g0Var.f4838b = colorStateList;
            g0Var.f4840d = true;
        } else {
            this.f4077d = null;
        }
        c();
    }

    public void l(ColorStateList colorStateList) {
        if (((g0) this.e) == null) {
            this.e = new g0(3);
        }
        g0 g0Var = (g0) this.e;
        g0Var.f4838b = colorStateList;
        g0Var.f4840d = true;
        c();
    }

    public void m(PorterDuff.Mode mode) {
        if (((g0) this.e) == null) {
            this.e = new g0(3);
        }
        g0 g0Var = (g0) this.e;
        g0Var.e = mode;
        g0Var.f4839c = true;
        c();
    }

    public t(s sVar) {
        this.f4075b = sVar;
        this.f4076c = new ArrayDeque();
        this.f4077d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f4074a = -1;
    }

    public t(StringWriter stringWriter, int i, int i8, String str) {
        if (stringWriter == null) {
            throw new NullPointerException("out == null");
        } else if (i < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        } else if (i8 >= 1) {
            StringWriter stringWriter2 = new StringWriter(1000);
            StringWriter stringWriter3 = new StringWriter(1000);
            this.f4075b = stringWriter;
            this.f4074a = i;
            this.f4076c = stringWriter2.getBuffer();
            this.f4077d = stringWriter3.getBuffer();
            this.e = new C1629d(i, stringWriter2, "");
            this.f4078f = new C1629d(i8, stringWriter3, str);
        } else {
            throw new IllegalArgumentException("rightWidth < 1");
        }
    }

    public t(int[] iArr, f0[] f0VarArr, int[] iArr2, int[][][] iArr3, f0 f0Var) {
        this.f4075b = iArr;
        this.f4076c = f0VarArr;
        this.e = iArr3;
        this.f4077d = iArr2;
        this.f4078f = f0Var;
        this.f4074a = iArr.length;
    }
}
