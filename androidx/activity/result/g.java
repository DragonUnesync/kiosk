package androidx.activity.result;

import G5.s;
import G5.u;
import R6.d;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.camera.lifecycle.c;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.t;
import de.ozerov.fully.FullyActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7335a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7336b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7337c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f7338d = new ArrayList();
    public final transient HashMap e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f7339f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f7340g = new Bundle();

    public final boolean a(int i, int i8, Intent intent) {
        String str = (String) this.f7335a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.e.get(str);
        if (eVar != null) {
            b bVar = eVar.f7331a;
            if (this.f7338d.contains(str)) {
                bVar.b(eVar.f7332b.w(i8, intent));
                this.f7338d.remove(str);
                return true;
            }
        }
        this.f7339f.remove(str);
        this.f7340g.putParcelable(str, new a(i8, intent));
        return true;
    }

    public abstract void b(int i, s sVar, u uVar);

    public final c c(String str, FullyActivity fullyActivity, s sVar, c cVar) {
        t tVar = fullyActivity.f7290X;
        if (tVar.f8156c.compareTo(C0486m.f8148X) < 0) {
            e(str);
            HashMap hashMap = this.f7337c;
            f fVar = (f) hashMap.get(str);
            if (fVar == null) {
                fVar = new f(tVar);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, str, cVar, sVar);
            fVar.f7333a.a(activityResultRegistry$1);
            fVar.f7334b.add(activityResultRegistry$1);
            hashMap.put(str, fVar);
            return new c(this, str, sVar);
        }
        throw new IllegalStateException("LifecycleOwner " + fullyActivity + " is attempting to register while current state is " + tVar.f8156c + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final d d(String str, s sVar, b bVar) {
        e(str);
        this.e.put(str, new e(bVar, sVar));
        HashMap hashMap = this.f7339f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.b(obj);
        }
        Bundle bundle = this.f7340g;
        a aVar = (a) bundle.getParcelable(str);
        if (aVar != null) {
            bundle.remove(str);
            bVar.b(sVar.w(aVar.f7324U, aVar.f7325V));
        }
        return new d(this, str, sVar);
    }

    public final void e(String str) {
        HashMap hashMap = this.f7336b;
        if (((Integer) hashMap.get(str)) == null) {
            d.f4346U.getClass();
            int nextInt = d.f4347V.a().nextInt(2147418112);
            while (true) {
                int i = nextInt + 65536;
                HashMap hashMap2 = this.f7335a;
                if (hashMap2.containsKey(Integer.valueOf(i))) {
                    d.f4346U.getClass();
                    nextInt = d.f4347V.a().nextInt(2147418112);
                } else {
                    hashMap2.put(Integer.valueOf(i), str);
                    hashMap.put(str, Integer.valueOf(i));
                    return;
                }
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f7338d.contains(str) && (num = (Integer) this.f7336b.remove(str)) != null) {
            this.f7335a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f7339f;
        if (hashMap.containsKey(str)) {
            StringBuilder s8 = Q0.g.s("Dropping pending result for request ", str, ": ");
            s8.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", s8.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f7340g;
        if (bundle.containsKey(str)) {
            StringBuilder s9 = Q0.g.s("Dropping pending result for request ", str, ": ");
            s9.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", s9.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f7337c;
        f fVar = (f) hashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f7334b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f7333a.f((C0489p) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
