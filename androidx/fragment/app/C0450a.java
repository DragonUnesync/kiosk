package androidx.fragment.app;

import H0.d;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a  reason: case insensitive filesystem */
public final class C0450a implements I {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7955a;

    /* renamed from: b  reason: collision with root package name */
    public int f7956b;

    /* renamed from: c  reason: collision with root package name */
    public int f7957c;

    /* renamed from: d  reason: collision with root package name */
    public int f7958d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f7959f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7960g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7961h;
    public String i;

    /* renamed from: j  reason: collision with root package name */
    public int f7962j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f7963k;

    /* renamed from: l  reason: collision with root package name */
    public int f7964l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f7965m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f7966n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f7967o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7968p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f7969q;

    /* renamed from: r  reason: collision with root package name */
    public final L f7970r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7971s;

    /* renamed from: t  reason: collision with root package name */
    public int f7972t;

    public C0450a(L l8) {
        l8.I();
        C0472x xVar = l8.f7893w;
        if (xVar != null) {
            xVar.f8093e0.getClassLoader();
        }
        this.f7955a = new ArrayList();
        this.f7961h = true;
        this.f7968p = false;
        this.f7972t = -1;
        this.f7970r = l8;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f7960g) {
            return true;
        }
        this.f7970r.f7876d.add(this);
        return true;
    }

    public final void b(S s8) {
        this.f7955a.add(s8);
        s8.f7931d = this.f7956b;
        s8.e = this.f7957c;
        s8.f7932f = this.f7958d;
        s8.f7933g = this.e;
    }

    public final void c(int i8) {
        if (this.f7960g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i8);
            }
            ArrayList arrayList = this.f7955a;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                S s8 = (S) arrayList.get(i9);
                C0470v vVar = s8.f7929b;
                if (vVar != null) {
                    vVar.f8077m0 += i8;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + s8.f7929b + " to " + s8.f7929b.f8077m0);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f7955a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            S s8 = (S) arrayList.get(size);
            if (s8.f7930c) {
                if (s8.f7928a == 8) {
                    s8.f7930c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i8 = s8.f7929b.f8082s0;
                    s8.f7928a = 2;
                    s8.f7930c = false;
                    for (int i9 = size - 1; i9 >= 0; i9--) {
                        S s9 = (S) arrayList.get(i9);
                        if (s9.f7930c && s9.f7929b.f8082s0 == i8) {
                            arrayList.remove(i9);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z, boolean z6) {
        if (!this.f7971s) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new U());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.f7971s = true;
            boolean z8 = this.f7960g;
            L l8 = this.f7970r;
            if (z8) {
                this.f7972t = l8.f7881k.getAndIncrement();
            } else {
                this.f7972t = -1;
            }
            if (z6) {
                l8.x(this, z);
            }
            return this.f7972t;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void f(int i8, C0470v vVar, String str, int i9) {
        String str2 = vVar.f8051G0;
        if (str2 != null) {
            d.c(vVar, str2);
        }
        Class<?> cls = vVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = vVar.f8083t0;
            if (str3 == null || str.equals(str3)) {
                vVar.f8083t0 = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + vVar + ": was " + vVar.f8083t0 + " now " + str);
            }
        }
        if (i8 != 0) {
            if (i8 != -1) {
                int i10 = vVar.f8081r0;
                if (i10 == 0 || i10 == i8) {
                    vVar.f8081r0 = i8;
                    vVar.f8082s0 = i8;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + vVar + ": was " + vVar.f8081r0 + " now " + i8);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + vVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new S(i9, vVar));
        vVar.f8078n0 = this.f7970r;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7972t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7971s);
            if (this.f7959f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f7959f));
            }
            if (!(this.f7956b == 0 && this.f7957c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7956b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7957c));
            }
            if (!(this.f7958d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7958d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.f7962j == 0 && this.f7963k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7962j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f7963k);
            }
            if (!(this.f7964l == 0 && this.f7965m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7964l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f7965m);
            }
        }
        ArrayList arrayList = this.f7955a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                S s8 = (S) arrayList.get(i8);
                switch (s8.f7928a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + s8.f7928a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(s8.f7929b);
                if (z) {
                    if (!(s8.f7931d == 0 && s8.e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(s8.f7931d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(s8.e));
                    }
                    if (s8.f7932f != 0 || s8.f7933g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(s8.f7932f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(s8.f7933g));
                    }
                }
            }
        }
    }

    public final void h(C0470v vVar) {
        L l8 = vVar.f8078n0;
        if (l8 == null || l8 == this.f7970r) {
            b(new S(3, vVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + vVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f7972t >= 0) {
            sb.append(" #");
            sb.append(this.f7972t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
