package androidx.savedstate;

import N.e;
import P6.f;
import android.os.Bundle;
import androidx.lifecycle.C0482i;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import b2.C0522a;
import b2.C0524c;
import b2.C0526e;
import b2.C0527f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import u.C1477r;

public final class Recreator implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final C0527f f8562U;

    public Recreator(C0527f fVar) {
        this.f8562U = fVar;
    }

    public final void c(r rVar, C0485l lVar) {
        boolean z;
        if (lVar == C0485l.ON_CREATE) {
            rVar.e().f(this);
            C0527f fVar = this.f8562U;
            Bundle c8 = fVar.a().c("androidx.savedstate.Restarter");
            if (c8 != null) {
                ArrayList<String> stringArrayList = c8.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C0524c.class);
                            f.d(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                                    f.d(newInstance, "{\n                constr…wInstance()\n            }");
                                    C0524c cVar = (C0524c) newInstance;
                                    if (fVar instanceof P) {
                                        O d8 = ((P) fVar).d();
                                        C0526e a8 = fVar.a();
                                        d8.getClass();
                                        LinkedHashMap linkedHashMap = d8.f8131a;
                                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                        while (it.hasNext()) {
                                            String str = (String) it.next();
                                            f.e(str, "key");
                                            M m8 = (M) linkedHashMap.get(str);
                                            f.b(m8);
                                            t e = fVar.e();
                                            f.e(a8, "registry");
                                            f.e(e, "lifecycle");
                                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) m8.getTag("androidx.lifecycle.savedstate.vm.tag");
                                            if (savedStateHandleController != null && !(z = savedStateHandleController.f8135U)) {
                                                if (z) {
                                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                                }
                                                savedStateHandleController.f8135U = true;
                                                e.a(savedStateHandleController);
                                                throw null;
                                            }
                                        }
                                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                            Class<C0482i> cls = C0482i.class;
                                            if (a8.f8650c) {
                                                C0522a aVar = (C0522a) a8.f8652f;
                                                if (aVar == null) {
                                                    aVar = new C0522a(a8);
                                                }
                                                a8.f8652f = aVar;
                                                try {
                                                    cls.getDeclaredConstructor((Class[]) null);
                                                    C0522a aVar2 = (C0522a) a8.f8652f;
                                                    if (aVar2 != null) {
                                                        ((LinkedHashSet) aVar2.f8646b).add(cls.getName());
                                                    }
                                                } catch (NoSuchMethodException e8) {
                                                    throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                                                }
                                            } else {
                                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    }
                                } catch (Exception e9) {
                                    throw new RuntimeException(C1477r.d("Failed to instantiate ", next), e9);
                                }
                            } catch (NoSuchMethodException e10) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                            }
                        } catch (ClassNotFoundException e11) {
                            throw new RuntimeException(e.y("Class ", next, " wasn't found"), e11);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
