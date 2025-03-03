package u;

import D.C0;
import D.C0048i;
import D.J0;
import D.L0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: u.l  reason: case insensitive filesystem */
public final /* synthetic */ class C1471l implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15659U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1479t f15660V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ String f15661W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C0 f15662X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ L0 f15663Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0048i f15664Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f15665a0;

    public /* synthetic */ C1471l(C1479t tVar, String str, C0 c02, L0 l02, C0048i iVar, ArrayList arrayList, int i) {
        this.f15659U = i;
        this.f15660V = tVar;
        this.f15661W = str;
        this.f15662X = c02;
        this.f15663Y = l02;
        this.f15664Z = iVar;
        this.f15665a0 = arrayList;
    }

    public final void run() {
        switch (this.f15659U) {
            case 0:
                C1479t tVar = this.f15660V;
                tVar.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = this.f15661W;
                sb.append(str);
                sb.append(" UPDATED");
                tVar.u(sb.toString(), (Throwable) null);
                tVar.f15686U.L(str, this.f15662X, this.f15663Y, this.f15664Z, this.f15665a0);
                tVar.L();
                return;
            default:
                C1479t tVar2 = this.f15660V;
                tVar2.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str2 = this.f15661W;
                sb2.append(str2);
                sb2.append(" ACTIVE");
                tVar2.u(sb2.toString(), (Throwable) null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) tVar2.f15686U.f36W;
                J0 j02 = (J0) linkedHashMap.get(str2);
                C0 c02 = this.f15662X;
                L0 l02 = this.f15663Y;
                C0048i iVar = this.f15664Z;
                ArrayList arrayList = this.f15665a0;
                if (j02 == null) {
                    j02 = new J0(c02, l02, iVar, arrayList);
                    linkedHashMap.put(str2, j02);
                }
                j02.f804f = true;
                tVar2.f15686U.L(str2, c02, l02, iVar, arrayList);
                tVar2.L();
                return;
        }
    }
}
