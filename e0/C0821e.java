package e0;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e0.e  reason: case insensitive filesystem */
public class C0821e implements C0820d {

    /* renamed from: a  reason: collision with root package name */
    public l f11139a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11140b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11141c = false;

    /* renamed from: d  reason: collision with root package name */
    public final l f11142d;
    public int e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f11143f;

    /* renamed from: g  reason: collision with root package name */
    public int f11144g;

    /* renamed from: h  reason: collision with root package name */
    public int f11145h = 1;
    public C0822f i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11146j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f11147k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f11148l = new ArrayList();

    public C0821e(l lVar) {
        this.f11142d = lVar;
    }

    public final void a(C0820d dVar) {
        ArrayList arrayList = this.f11148l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0821e) it.next()).f11146j) {
                return;
            }
        }
        this.f11141c = true;
        l lVar = this.f11139a;
        if (lVar != null) {
            lVar.a(this);
        }
        if (this.f11140b) {
            this.f11142d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0821e eVar = null;
        int i8 = 0;
        while (it2.hasNext()) {
            C0821e eVar2 = (C0821e) it2.next();
            if (!(eVar2 instanceof C0822f)) {
                i8++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i8 == 1 && eVar.f11146j) {
            C0822f fVar = this.i;
            if (fVar != null) {
                if (fVar.f11146j) {
                    this.f11143f = this.f11145h * fVar.f11144g;
                } else {
                    return;
                }
            }
            d(eVar.f11144g + this.f11143f);
        }
        l lVar2 = this.f11139a;
        if (lVar2 != null) {
            lVar2.a(this);
        }
    }

    public final void b(l lVar) {
        this.f11147k.add(lVar);
        if (this.f11146j) {
            lVar.a(lVar);
        }
    }

    public final void c() {
        this.f11148l.clear();
        this.f11147k.clear();
        this.f11146j = false;
        this.f11144g = 0;
        this.f11141c = false;
        this.f11140b = false;
    }

    public void d(int i8) {
        if (!this.f11146j) {
            this.f11146j = true;
            this.f11144g = i8;
            Iterator it = this.f11147k.iterator();
            while (it.hasNext()) {
                C0820d dVar = (C0820d) it.next();
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11142d.f11156b.f9604W);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.f11146j) {
            obj = Integer.valueOf(this.f11144g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f11148l.size());
        sb.append(":d=");
        sb.append(this.f11147k.size());
        sb.append(">");
        return sb.toString();
    }
}
