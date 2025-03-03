package c2;

import C6.b;
import F.h;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: c2.a  reason: case insensitive filesystem */
public final class C0612a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile C0612a f8876d;
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8877a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f8878b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f8879c;

    public C0612a(Context context) {
        this.f8879c = context.getApplicationContext();
    }

    public static C0612a c(Context context) {
        if (f8876d == null) {
            synchronized (e) {
                try {
                    if (f8876d == null) {
                        f8876d = new C0612a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8876d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f8879c.getString(2131951644);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f8878b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C0613b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e8) {
                throw new b((Throwable) e8, 6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (h.t()) {
            try {
                Trace.beginSection(h.H(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f8877a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                C0613b bVar = (C0613b) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a8 = bVar.a();
                if (!a8.isEmpty()) {
                    for (Class cls2 : a8) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.create(this.f8879c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
