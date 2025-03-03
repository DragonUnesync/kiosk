package de.ozerov.fully;

import B3.q;
import Q0.g;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C0450a;
import androidx.fragment.app.C0470v;
import androidx.fragment.app.J;
import androidx.fragment.app.L;
import h.C1022j;
import j$.util.Objects;

/* renamed from: de.ozerov.fully.t4  reason: case insensitive filesystem */
public abstract class C0780t4 extends C1022j {

    /* renamed from: s0  reason: collision with root package name */
    public final String f10978s0 = getClass().getSimpleName();

    /* renamed from: t0  reason: collision with root package name */
    public final q f10979t0 = new q((Context) this);

    /* renamed from: u0  reason: collision with root package name */
    public volatile boolean f10980u0 = false;

    /* renamed from: v0  reason: collision with root package name */
    public volatile boolean f10981v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public volatile boolean f10982w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public volatile boolean f10983x0 = false;

    public final void A(int i, C0470v vVar, String str) {
        L l8 = l();
        l8.getClass();
        C0450a aVar = new C0450a(l8);
        if (i != 0) {
            aVar.f(i, vVar, str, 2);
            if (aVar.f7961h) {
                aVar.f7960g = true;
                aVar.i = str;
                aVar.e(true, true);
                return;
            }
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final void B(J3 j32) {
        L l8 = l();
        l8.getClass();
        C0450a aVar = new C0450a(l8);
        aVar.f(2131362643, j32, "single_app_manager", 2);
        aVar.e(true, true);
    }

    public final void C() {
        String u3 = u();
        u3.getClass();
        if (l().G() > 0 && l().F(l().G() - 1).i.equals(u3)) {
            try {
                if (this.f10980u0) {
                    L l8 = l();
                    l8.getClass();
                    l8.x(new J(l8, -1, 0), false);
                    z();
                } else {
                    Log.e(this.f10978s0, "Can't pop fragment X while activity is stopped");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (getFragmentManager().getBackStackEntryCount() > 0 && getFragmentManager().getBackStackEntryAt(getFragmentManager().getBackStackEntryCount() - 1).getName().equals(u3)) {
            try {
                if (this.f10980u0) {
                    getFragmentManager().popBackStack();
                    z();
                    return;
                }
                Log.e(this.f10978s0, "Can't pop fragment while activity is stopped");
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Objects.toString(bundle.get(str));
            }
            bundle.remove("android:support:fragments");
            bundle.remove("android:fragments");
            bundle.remove("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f10982w0 = true;
    }

    public void onPause() {
        super.onPause();
        this.f10981v0 = true;
    }

    public void onPostResume() {
        this.f10980u0 = true;
        try {
            super.onPostResume();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f10981v0 = false;
    }

    public void onStop() {
        super.onStop();
        this.f10980u0 = false;
    }

    public final void startLockTask() {
        try {
            super.startLockTask();
            this.f10983x0 = true;
        } catch (Exception e) {
            g.x(e, new StringBuilder("Lock task mode start failed due to "), this.f10978s0);
        }
    }

    public final void stopLockTask() {
        this.f10983x0 = false;
        try {
            super.stopLockTask();
        } catch (Exception e) {
            g.x(e, new StringBuilder("Lock task mode stop failed due to "), this.f10978s0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (y(r0) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String u() {
        /*
            r3 = this;
            androidx.fragment.app.L r0 = r3.l()
            int r0 = r0.G()
            if (r0 <= 0) goto L_0x0025
            androidx.fragment.app.L r0 = r3.l()
            androidx.fragment.app.L r1 = r3.l()
            int r1 = r1.G()
            int r1 = r1 + -1
            androidx.fragment.app.a r0 = r0.F(r1)
            java.lang.String r0 = r0.i
            boolean r1 = r3.y(r0)
            if (r1 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            java.lang.String r0 = ""
        L_0x0027:
            android.app.FragmentManager r1 = r3.getFragmentManager()
            int r1 = r1.getBackStackEntryCount()
            if (r1 <= 0) goto L_0x004e
            android.app.FragmentManager r1 = r3.getFragmentManager()
            android.app.FragmentManager r2 = r3.getFragmentManager()
            int r2 = r2.getBackStackEntryCount()
            int r2 = r2 + -1
            android.app.FragmentManager$BackStackEntry r1 = r1.getBackStackEntryAt(r2)
            java.lang.String r1 = r1.getName()
            boolean r2 = r3.y(r1)
            if (r2 == 0) goto L_0x004e
            r0 = r1
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0780t4.u():java.lang.String");
    }

    public final boolean v() {
        l().G();
        getFragmentManager().getBackStackEntryCount();
        if (getFragmentManager().getBackStackEntryCount() + l().G() > 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if (isFinishing() || this.f10982w0 || isDestroyed()) {
            return false;
        }
        return true;
    }

    public final boolean x(String str) {
        if (l().G() > 0 && l().F(l().G() - 1).i.equals(str)) {
            return true;
        }
        if (getFragmentManager().getBackStackEntryCount() <= 0 || !getFragmentManager().getBackStackEntryAt(getFragmentManager().getBackStackEntryCount() - 1).getName().equals(str)) {
            return false;
        }
        return true;
    }

    public final boolean y(String str) {
        C0470v C8 = l().C(str);
        if (C8 != null) {
            C8.s();
            return C8.s();
        }
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag(str);
        if (findFragmentByTag == null) {
            return false;
        }
        findFragmentByTag.isVisible();
        return findFragmentByTag.isVisible();
    }

    public void z() {
    }
}
