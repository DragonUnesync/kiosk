package P5;

import A4.d;
import B3.f;
import F.i;
import Z1.c;
import android.view.View;
import android.webkit.WebStorage;
import com.google.android.material.behavior.SwipeDismissBehavior;
import de.ozerov.fully.C0780t4;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.M2;
import de.ozerov.fully.MyWebView;
import de.ozerov.fully.O4;
import de.ozerov.fully.V4;
import de.ozerov.fully.g5;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.logging.Level;
import n2.a;
import u.C1478s;
import v0.C1510H;

public final class M implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3847U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f3848V;

    /* renamed from: W  reason: collision with root package name */
    public Object f3849W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f3850X;

    public /* synthetic */ M(int i, Object obj, Object obj2, boolean z) {
        this.f3847U = i;
        this.f3850X = obj;
        this.f3849W = obj2;
        this.f3848V = z;
    }

    public final void run() {
        f fVar;
        switch (this.f3847U) {
            case 0:
                try {
                    ServerSocket serverSocket = ((P) this.f3850X).f3861b;
                    ((P) this.f3850X).getClass();
                    serverSocket.bind(new InetSocketAddress(((P) this.f3850X).f3860a));
                    this.f3848V = true;
                    do {
                        try {
                            Socket accept = ((P) this.f3850X).f3861b.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            P p3 = (P) this.f3850X;
                            p3.e.C(new A(p3, inputStream, accept));
                        } catch (IOException e) {
                            P.f3856p.log(Level.FINE, "Communication with the client broken", e);
                        }
                    } while (!((P) this.f3850X).f3861b.isClosed());
                    return;
                } catch (IOException e8) {
                    this.f3849W = e8;
                    return;
                }
            case 1:
                g5 g5Var = (g5) this.f3850X;
                if (g5Var.f10676t.w()) {
                    boolean n4 = ((c) g5Var.f10677u.f9767W).n("waitInternetOnReload", true);
                    String str = (String) this.f3849W;
                    if (n4) {
                        C0780t4 t4Var = g5Var.f10676t;
                        if (!C0794w0.e0(t4Var) && !str.startsWith("file://") && !str.startsWith("http://localhost") && !str.startsWith("https://localhost") && !str.startsWith("fully://") && !str.startsWith("javascript:") && !str.startsWith("intent:")) {
                            if (this.f3848V) {
                                if (g5.f10658x % 5 == 0) {
                                    a.b1(t4Var, "Waiting for Network Connection...");
                                }
                                g5.f10658x++;
                            }
                            g5Var.f10678v.postDelayed(this, 1000);
                            return;
                        }
                    }
                    g5.f10658x = 0;
                    V4 v4 = g5Var.f10667k;
                    MyWebView myWebView = g5Var.f10664g;
                    v4.getClass();
                    C0780t4 t4Var2 = v4.f10443a;
                    Iterator it = O4.a(t4Var2, "mainWebAutomation").iterator();
                    while (true) {
                        if (it.hasNext()) {
                            O4 o42 = (O4) it.next();
                            if (o42.f10228a == 1 && a.M0(str, a.W(o42.f10229b)) && o42.f10230c.equals("REMOVE_ITEMS_BEFORE") && o42.f10231d.equals("ALL_WEBSTORAGE")) {
                                try {
                                    WebStorage.getInstance().deleteAllData();
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                }
                            }
                        }
                    }
                    Iterator it2 = O4.a(t4Var2, "mainWebAutomation").iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            O4 o43 = (O4) it2.next();
                            if (o43.f10228a == 1 && a.M0(str, a.W(o43.f10229b)) && o43.f10230c.equals("REMOVE_ITEMS_AFTER") && o43.f10231d.equals("ALL_HISTORY")) {
                                myWebView.f10123c0 = true;
                            }
                        }
                    }
                    Iterator it3 = O4.a(t4Var2, "mainWebAutomation").iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            O4 o44 = (O4) it3.next();
                            if (o44.f10228a == 1 && a.M0(str, a.W(o44.f10229b)) && o44.f10230c.equals("REMOVE_ITEMS_BEFORE") && o44.f10231d.equals("ALL_CACHE")) {
                                myWebView.clearCache(true);
                            }
                        }
                    }
                    Iterator it4 = O4.a(t4Var2, "mainWebAutomation").iterator();
                    while (it4.hasNext()) {
                        O4 o45 = (O4) it4.next();
                        if (o45.f10228a == 1 && a.M0(str, a.W(o45.f10229b)) && o45.f10230c.equals("REMOVE_ITEMS_BEFORE") && o45.f10231d.equals("ALL_COOKIES")) {
                            v4.b(false, new d(v4, myWebView, str, 12));
                            return;
                        }
                    }
                    v4.l(myWebView, str);
                    return;
                }
                return;
            case 2:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3850X;
                C0.f fVar2 = swipeDismissBehavior.f9156a;
                View view = (View) this.f3849W;
                if (fVar2 != null && fVar2.f()) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    view.postOnAnimation(this);
                    return;
                } else if (this.f3848V && (fVar = swipeDismissBehavior.f9157b) != null) {
                    fVar.a(view);
                    return;
                } else {
                    return;
                }
            default:
                ((i) this.f3849W).execute(new M2(15, (Object) this));
                return;
        }
    }

    public M(P p3) {
        this.f3847U = 0;
        this.f3850X = p3;
        this.f3848V = false;
    }

    public M(C1478s sVar, i iVar) {
        this.f3847U = 3;
        this.f3850X = sVar;
        this.f3848V = false;
        this.f3849W = iVar;
    }
}
