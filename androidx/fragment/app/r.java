package androidx.fragment.app;

import C0.e;
import F.h;
import Q0.g;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.l;
import androidx.lifecycle.J;
import h.C1022j;

public class r extends C0470v implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: P0  reason: collision with root package name */
    public Handler f8018P0;

    /* renamed from: Q0  reason: collision with root package name */
    public final e f8019Q0 = new e(12, this);

    /* renamed from: R0  reason: collision with root package name */
    public final C0463n f8020R0 = new C0463n(this);

    /* renamed from: S0  reason: collision with root package name */
    public final C0464o f8021S0 = new C0464o(this);

    /* renamed from: T0  reason: collision with root package name */
    public int f8022T0 = 0;

    /* renamed from: U0  reason: collision with root package name */
    public int f8023U0 = 0;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f8024V0 = true;

    /* renamed from: W0  reason: collision with root package name */
    public boolean f8025W0 = true;

    /* renamed from: X0  reason: collision with root package name */
    public int f8026X0 = -1;

    /* renamed from: Y0  reason: collision with root package name */
    public boolean f8027Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public final C0465p f8028Z0 = new C0465p(this);

    /* renamed from: a1  reason: collision with root package name */
    public Dialog f8029a1;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f8030b1;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f8031c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f8032d1 = false;

    public void A() {
        this.f8088y0 = true;
        if (!this.f8031c1) {
            this.f8031c1 = true;
        }
        this.f8055K0.i(this.f8028Z0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[Catch:{ all -> 0x004e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.LayoutInflater B(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r0 = super.B(r8)
            boolean r1 = r7.f8025W0
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L_0x009a
            boolean r4 = r7.f8027Y0
            if (r4 == 0) goto L_0x0011
            goto L_0x009a
        L_0x0011:
            if (r1 != 0) goto L_0x0014
            goto L_0x0071
        L_0x0014:
            boolean r1 = r7.f8032d1
            if (r1 != 0) goto L_0x0071
            r1 = 0
            r4 = 1
            r7.f8027Y0 = r4     // Catch:{ all -> 0x004e }
            android.app.Dialog r8 = r7.P(r8)     // Catch:{ all -> 0x004e }
            r7.f8029a1 = r8     // Catch:{ all -> 0x004e }
            boolean r5 = r7.f8025W0     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0068
            int r5 = r7.f8022T0     // Catch:{ all -> 0x004e }
            if (r5 == r4) goto L_0x003b
            if (r5 == r2) goto L_0x003b
            r6 = 3
            if (r5 == r6) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            android.view.Window r5 = r8.getWindow()     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x003b
            r6 = 24
            r5.addFlags(r6)     // Catch:{ all -> 0x004e }
        L_0x003b:
            r8.requestWindowFeature(r4)     // Catch:{ all -> 0x004e }
        L_0x003e:
            android.content.Context r8 = r7.j()     // Catch:{ all -> 0x004e }
            boolean r5 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0050
            android.app.Dialog r5 = r7.f8029a1     // Catch:{ all -> 0x004e }
            android.app.Activity r8 = (android.app.Activity) r8     // Catch:{ all -> 0x004e }
            r5.setOwnerActivity(r8)     // Catch:{ all -> 0x004e }
            goto L_0x0050
        L_0x004e:
            r8 = move-exception
            goto L_0x006e
        L_0x0050:
            android.app.Dialog r8 = r7.f8029a1     // Catch:{ all -> 0x004e }
            boolean r5 = r7.f8024V0     // Catch:{ all -> 0x004e }
            r8.setCancelable(r5)     // Catch:{ all -> 0x004e }
            android.app.Dialog r8 = r7.f8029a1     // Catch:{ all -> 0x004e }
            androidx.fragment.app.n r5 = r7.f8020R0     // Catch:{ all -> 0x004e }
            r8.setOnCancelListener(r5)     // Catch:{ all -> 0x004e }
            android.app.Dialog r8 = r7.f8029a1     // Catch:{ all -> 0x004e }
            androidx.fragment.app.o r5 = r7.f8021S0     // Catch:{ all -> 0x004e }
            r8.setOnDismissListener(r5)     // Catch:{ all -> 0x004e }
            r7.f8032d1 = r4     // Catch:{ all -> 0x004e }
            goto L_0x006b
        L_0x0068:
            r8 = 0
            r7.f8029a1 = r8     // Catch:{ all -> 0x004e }
        L_0x006b:
            r7.f8027Y0 = r1
            goto L_0x0071
        L_0x006e:
            r7.f8027Y0 = r1
            throw r8
        L_0x0071:
            boolean r8 = android.util.Log.isLoggable(r3, r2)
            if (r8 == 0) goto L_0x008d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r1 = " from dialog context"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r3, r8)
        L_0x008d:
            android.app.Dialog r8 = r7.f8029a1
            if (r8 == 0) goto L_0x0099
            android.content.Context r8 = r8.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r8)
        L_0x0099:
            return r0
        L_0x009a:
            boolean r8 = android.util.Log.isLoggable(r3, r2)
            if (r8 == 0) goto L_0x00d5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            boolean r1 = r7.f8025W0
            if (r1 != 0) goto L_0x00c4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mShowsDialog = false: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.util.Log.d(r3, r8)
            goto L_0x00d5
        L_0x00c4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mCreatingDialog = true: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.util.Log.d(r3, r8)
        L_0x00d5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.B(android.os.Bundle):android.view.LayoutInflater");
    }

    public void E(Bundle bundle) {
        Dialog dialog = this.f8029a1;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f8022T0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i8 = this.f8023U0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z = this.f8024V0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z6 = this.f8025W0;
        if (!z6) {
            bundle.putBoolean("android:showsDialog", z6);
        }
        int i9 = this.f8026X0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    public void F() {
        this.f8088y0 = true;
        Dialog dialog = this.f8029a1;
        if (dialog != null) {
            this.f8030b1 = false;
            dialog.show();
            View decorView = this.f8029a1.getWindow().getDecorView();
            J.b(decorView, this);
            decorView.setTag(2131362626, this);
            R.e.t(decorView, this);
        }
    }

    public void G() {
        this.f8088y0 = true;
        Dialog dialog = this.f8029a1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void I(Bundle bundle) {
        Bundle bundle2;
        this.f8088y0 = true;
        if (this.f8029a1 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f8029a1.onRestoreInstanceState(bundle2);
        }
    }

    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.f8045A0 == null && this.f8029a1 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f8029a1.onRestoreInstanceState(bundle2);
        }
    }

    public final void O(boolean z, boolean z6) {
        if (!this.f8031c1) {
            this.f8031c1 = true;
            Dialog dialog = this.f8029a1;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f8029a1.dismiss();
                if (!z6) {
                    if (Looper.myLooper() == this.f8018P0.getLooper()) {
                        onDismiss(this.f8029a1);
                    } else {
                        this.f8018P0.post(this.f8019Q0);
                    }
                }
            }
            this.f8030b1 = true;
            if (this.f8026X0 >= 0) {
                L l8 = l();
                int i = this.f8026X0;
                if (i >= 0) {
                    l8.x(new J(l8, i, 1), z);
                    this.f8026X0 = -1;
                    return;
                }
                throw new IllegalArgumentException(g.m(i, "Bad id: "));
            }
            C0450a aVar = new C0450a(l());
            aVar.f7968p = true;
            aVar.h(this);
            if (z) {
                aVar.e(true, true);
            } else {
                aVar.e(false, true);
            }
        }
    }

    public Dialog P(Bundle bundle) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new l(K(), this.f8023U0);
    }

    public final void Q() {
        this.f8024V0 = true;
        Dialog dialog = this.f8029a1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public final void R() {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to 2, 2132017163");
        }
        this.f8022T0 = 2;
        this.f8023U0 = 2132017163;
    }

    public final h f() {
        return new C0466q(this, new C0468t(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f8030b1) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            O(true, true);
        }
    }

    public final void t() {
        this.f8088y0 = true;
    }

    public void w(C1022j jVar) {
        super.w(jVar);
        this.f8055K0.f(this.f8028Z0);
        this.f8031c1 = false;
    }

    public void x(Bundle bundle) {
        boolean z;
        super.x(bundle);
        this.f8018P0 = new Handler();
        if (this.f8082s0 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f8025W0 = z;
        if (bundle != null) {
            this.f8022T0 = bundle.getInt("android:style", 0);
            this.f8023U0 = bundle.getInt("android:theme", 0);
            this.f8024V0 = bundle.getBoolean("android:cancelable", true);
            this.f8025W0 = bundle.getBoolean("android:showsDialog", this.f8025W0);
            this.f8026X0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public final void z() {
        this.f8088y0 = true;
        Dialog dialog = this.f8029a1;
        if (dialog != null) {
            this.f8030b1 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f8029a1.dismiss();
            if (!this.f8031c1) {
                onDismiss(this.f8029a1);
            }
            this.f8029a1 = null;
            this.f8032d1 = false;
        }
    }
}
