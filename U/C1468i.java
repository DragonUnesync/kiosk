package u;

import B.C0017s;
import B.C0018t;
import D.C0034b;
import D.C0069x;
import D.E;
import F.h;
import K1.k;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import com.bumptech.glide.d;
import g7.C0996d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import v.C1502a;
import v.i;
import v.r;

/* renamed from: u.i  reason: case insensitive filesystem */
public final class C1468i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15647a;

    /* renamed from: b  reason: collision with root package name */
    public final k f15648b;

    /* renamed from: c  reason: collision with root package name */
    public final C0034b f15649c;

    /* renamed from: d  reason: collision with root package name */
    public final E f15650d;
    public final r e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f15651f;

    /* renamed from: g  reason: collision with root package name */
    public final C1450J f15652g;

    /* renamed from: h  reason: collision with root package name */
    public final long f15653h;
    public final HashMap i = new HashMap();

    public C1468i(Context context, C0034b bVar, C0017s sVar, long j7) {
        String str;
        this.f15647a = context;
        this.f15649c = bVar;
        r a8 = r.a(context, bVar.f884b);
        this.e = a8;
        this.f15652g = C1450J.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            i iVar = a8.f15868a;
            iVar.getClass();
            List<String> asList = Arrays.asList(((CameraManager) iVar.f15852V).getCameraIdList());
            if (sVar == null) {
                for (String add : asList) {
                    arrayList.add(add);
                }
            } else {
                try {
                    str = C0996d.e(a8, sVar.b(), asList);
                } catch (IllegalStateException unused) {
                    str = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : asList) {
                    if (!str2.equals(str)) {
                        arrayList2.add(b(str2));
                    }
                }
                for (C0069x e8 : sVar.a(arrayList2)) {
                    arrayList.add(e8.e());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.equals("0") || str3.equals("1")) {
                    arrayList3.add(str3);
                } else if (d.j(str3, this.e)) {
                    arrayList3.add(str3);
                } else {
                    h.j("Camera2CameraFactory", "Camera " + str3 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
            this.f15651f = arrayList3;
            k kVar = new k(this.e);
            this.f15648b = kVar;
            E e9 = new E(kVar);
            this.f15650d = e9;
            ((ArrayList) kVar.f2581V).add(e9);
            this.f15653h = j7;
        } catch (CameraAccessException e10) {
            throw new C1502a(e10);
        } catch (C1502a e11) {
            throw new Exception(new Exception(e11));
        } catch (C0018t e12) {
            throw new Exception(e12);
        }
    }

    public final C1479t a(String str) {
        if (this.f15651f.contains(str)) {
            C1481v b8 = b(str);
            C0034b bVar = this.f15649c;
            Executor executor = bVar.f883a;
            return new C1479t(this.f15647a, this.e, str, b8, this.f15648b, this.f15650d, executor, bVar.f884b, this.f15652g, this.f15653h);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public final C1481v b(String str) {
        HashMap hashMap = this.i;
        try {
            C1481v vVar = (C1481v) hashMap.get(str);
            if (vVar != null) {
                return vVar;
            }
            C1481v vVar2 = new C1481v(str, this.e);
            hashMap.put(str, vVar2);
            return vVar2;
        } catch (C1502a e8) {
            throw new Exception(e8);
        }
    }
}
