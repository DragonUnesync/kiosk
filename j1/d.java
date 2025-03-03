package J1;

import P0.r;
import R0.g;
import R0.h;
import R0.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import f0.l;
import java.util.ArrayList;
import t2.C1423e;
import t2.C1426h;
import t2.i;
import t2.q;
import u2.j;

public final class d implements c, g, C1423e {

    /* renamed from: U  reason: collision with root package name */
    public int f2351U;

    /* renamed from: V  reason: collision with root package name */
    public int f2352V;

    /* renamed from: W  reason: collision with root package name */
    public Object f2353W;

    public /* synthetic */ d(int i, int i8, Object obj) {
        this.f2351U = i;
        this.f2352V = i8;
        this.f2353W = obj;
    }

    public int a() {
        return this.f2351U;
    }

    public void b(q qVar) {
    }

    public int c() {
        return this.f2352V;
    }

    public void d(i iVar) {
    }

    public int e() {
        int i = this.f2351U;
        if (i == -1) {
            return ((r) this.f2353W).z();
        }
        return i;
    }

    public void f(t2.r rVar) {
    }

    public h g() {
        return new p(this.f2351U, this.f2352V, (A1.d) this.f2353W);
    }

    public void h(C1426h hVar) {
        boolean z;
        if (hVar.f15196U.f15209a == 3) {
            int i = ((j) hVar.f15188Y).f15756U;
            boolean[] zArr = (boolean[]) this.f2353W;
            if (!zArr[0] || (this.f2351U - this.f2352V) + i != hVar.f15198W.f15204U) {
                z = false;
            } else {
                z = true;
            }
            zArr[0] = z;
        }
    }

    public d(int i) {
        switch (i) {
            case 4:
                this.f2353W = new d[256];
                this.f2351U = 0;
                this.f2352V = 0;
                return;
            default:
                this.f2353W = new A1.d(29);
                this.f2351U = 8000;
                this.f2352V = 8000;
                return;
        }
    }

    public d(Context context, XmlResourceParser xmlResourceParser) {
        this.f2353W = new ArrayList();
        this.f2352V = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), f0.p.f11461g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2351U = obtainStyledAttributes.getResourceId(index, this.f2351U);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f2352V);
                this.f2352V = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new l().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
