package N;

import A.g;
import B.B;
import B.C0022x;
import B.q0;
import D.C0036c;
import D.C0041e0;
import D.C0053k0;
import D.J;
import D.K;
import D.L0;
import D.N0;
import D.V;
import D.X;
import D.t0;
import H3.L;
import H3.O;
import M1.k;
import P.a;
import P.b;
import P.c;
import P0.l;
import P0.z;
import P6.f;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Set;

public abstract /* synthetic */ class e {
    public static String A(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder B(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ void C(int i) {
        if (i == 0) {
            NullPointerException nullPointerException = new NullPointerException();
            f.h(nullPointerException, f.class.getName());
            throw nullPointerException;
        }
    }

    public static void D(int i, int i8, int i9, int i10, int i11) {
        z.J(i);
        z.J(i8);
        z.J(i9);
        z.J(i10);
        z.J(i11);
    }

    public static /* synthetic */ void E(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Class<f> cls = f.class;
            String name = cls.getName();
            int i8 = 0;
            while (!stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            while (stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            StackTraceElement stackTraceElement = stackTrace[i8];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            f.h(nullPointerException, cls.getName());
            throw nullPointerException;
        }
    }

    public static void F(int i, HashMap hashMap, String str, int i8, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i8));
    }

    public static /* synthetic */ void G(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void H(String str, String str2, String str3) {
        l.B(str3, str + str2);
    }

    public static C0053k0 I(K k8, K k9) {
        C0041e0 e0Var;
        if (k8 == null && k9 == null) {
            return C0053k0.f919W;
        }
        if (k9 != null) {
            e0Var = C0041e0.c(k9);
        } else {
            e0Var = C0041e0.b();
        }
        if (k8 != null) {
            for (C0036c J8 : k8.J()) {
                J(e0Var, k9, k8, J8);
            }
        }
        return C0053k0.a(e0Var);
    }

    public static void J(C0041e0 e0Var, K k8, K k9, C0036c cVar) {
        if (Objects.equals(cVar, X.f874q)) {
            b bVar = (b) k9.o0(cVar, (Object) null);
            b bVar2 = (b) k8.o0(cVar, (Object) null);
            J m8 = k9.m(cVar);
            if (bVar == null) {
                bVar = bVar2;
            } else if (bVar2 != null) {
                q0 q0Var = new q0(13);
                q0Var.f300V = bVar2.f3682a;
                q0Var.f301W = bVar2.f3683b;
                q0Var.f302X = bVar2.f3684c;
                a aVar = bVar.f3682a;
                if (aVar != null) {
                    q0Var.f300V = aVar;
                }
                c cVar2 = bVar.f3683b;
                if (cVar2 != null) {
                    q0Var.f301W = cVar2;
                }
                N5.l lVar = bVar.f3684c;
                if (lVar != null) {
                    q0Var.f302X = lVar;
                }
                bVar = new b((a) q0Var.f300V, (c) q0Var.f301W, (N5.l) q0Var.f302X);
            }
            e0Var.d(cVar, m8, bVar);
            return;
        }
        e0Var.d(cVar, k9.m(cVar), k9.b0(cVar));
    }

    public static /* synthetic */ String K(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "CRITICAL";
        }
        return "RECOVERABLE";
    }

    public static /* synthetic */ String L(int i) {
        if (i == 1) {
            return "PENDING_OPEN";
        }
        if (i == 2) {
            return "OPENING";
        }
        if (i == 3) {
            return "OPEN";
        }
        if (i != 4) {
            return i != 5 ? "null" : "CLOSED";
        }
        return "CLOSING";
    }

    public static /* synthetic */ String M(int i) {
        if (i == 1) {
            return "LOCAL";
        }
        if (i == 2) {
            return "REMOTE";
        }
        if (i == 3) {
            return "DATA_DISK_CACHE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "MEMORY_CACHE";
        }
        return "RESOURCE_DISK_CACHE";
    }

    public static /* synthetic */ String N(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int O(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("GET")) {
            return 1;
        } else {
            if (str.equals("PUT")) {
                return 2;
            }
            if (str.equals("POST")) {
                return 3;
            }
            if (str.equals("DELETE")) {
                return 4;
            }
            if (str.equals("HEAD")) {
                return 5;
            }
            if (str.equals("OPTIONS")) {
                return 6;
            }
            if (str.equals("TRACE")) {
                return 7;
            }
            if (str.equals("CONNECT")) {
                return 8;
            }
            if (str.equals("PATCH")) {
                return 9;
            }
            if (str.equals("PROPFIND")) {
                return 10;
            }
            if (str.equals("PROPPATCH")) {
                return 11;
            }
            if (str.equals("MKCOL")) {
                return 12;
            }
            if (str.equals("MOVE")) {
                return 13;
            }
            if (str.equals("COPY")) {
                return 14;
            }
            if (str.equals("LOCK")) {
                return 15;
            }
            if (str.equals("UNLOCK")) {
                return 16;
            }
            throw new IllegalArgumentException("No enum constant de.ozerov.fully.remoteadmin.NanoHTTPD.Method.".concat(str));
        }
    }

    public static boolean a(t0 t0Var, C0036c cVar) {
        return t0Var.x().q0(cVar);
    }

    public static void b(t0 t0Var, g gVar) {
        t0Var.x().Q(gVar);
    }

    public static N0 c(L0 l02) {
        return (N0) l02.b0(L0.f807A);
    }

    public static C0022x d(L0 l02) {
        C0022x xVar = (C0022x) l02.o0(V.f865h, C0022x.f359c);
        xVar.getClass();
        return xVar;
    }

    public static J e(t0 t0Var, C0036c cVar) {
        return t0Var.x().m(cVar);
    }

    public static int f(L0 l02) {
        return ((Integer) l02.o0(L0.f808B, 0)).intValue();
    }

    public static Set g(t0 t0Var, C0036c cVar) {
        return t0Var.x().g(cVar);
    }

    public static int h(L0 l02) {
        return ((Integer) l02.o0(L0.f814w, 0)).intValue();
    }

    public static String i(L0 l02) {
        return (String) l02.b0(H.l.f1802E);
    }

    public static String j(L0 l02, String str) {
        return (String) l02.o0(H.l.f1802E, str);
    }

    public static int k(L0 l02) {
        return ((Integer) l02.o0(L0.f809C, 0)).intValue();
    }

    public static boolean l(L0 l02) {
        return ((Boolean) l02.o0(L0.z, Boolean.FALSE)).booleanValue();
    }

    public static boolean m(L0 l02) {
        return ((Boolean) l02.o0(L0.f816y, Boolean.FALSE)).booleanValue();
    }

    public static Set n(t0 t0Var) {
        return t0Var.x().J();
    }

    public static M1.b o(M1.l lVar, byte[] bArr, int i) {
        L j7 = O.j();
        lVar.D(bArr, 0, i, k.f3087c, new B(10, j7));
        return new M1.b(j7.g());
    }

    public static Object p(t0 t0Var, C0036c cVar) {
        return t0Var.x().b0(cVar);
    }

    public static Object q(t0 t0Var, C0036c cVar, Object obj) {
        return t0Var.x().o0(cVar, obj);
    }

    public static Object r(t0 t0Var, C0036c cVar, J j7) {
        return t0Var.x().Y(cVar, j7);
    }

    public static int s(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return O(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static /* synthetic */ boolean t(int i) {
        switch (i) {
            case 1:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
            case 7:
            case 8:
                return false;
            default:
                throw null;
        }
    }

    public static int u(int i, int i8, String str) {
        return (str.hashCode() + i) * i8;
    }

    public static String v(String str, int i, String str2, int i8, String str3) {
        return str + i + str2 + i8 + str3;
    }

    public static String w(String str, long j7) {
        return str + j7;
    }

    public static String x(String str, String str2) {
        return str + str2;
    }

    public static String y(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String z(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }
}
