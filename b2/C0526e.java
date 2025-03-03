package b2;

import E.e;
import G5.s;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import o.r;
import q.C1350c;
import q.C1353f;

/* renamed from: b2.e  reason: case insensitive filesystem */
public final class C0526e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8648a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8649b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8650c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8651d;
    public Parcelable e;

    /* renamed from: f  reason: collision with root package name */
    public Object f8652f;

    public /* synthetic */ C0526e(TextView textView) {
        this.e = null;
        this.f8652f = null;
        this.f8648a = false;
        this.f8649b = false;
        this.f8651d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f8651d;
        Drawable p3 = s.p(compoundButton);
        if (p3 == null) {
            return;
        }
        if (this.f8648a || this.f8649b) {
            Drawable mutate = e.z(p3).mutate();
            if (this.f8648a) {
                mutate.setTintList((ColorStateList) this.e);
            }
            if (this.f8649b) {
                mutate.setTintMode((PorterDuff.Mode) this.f8652f);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    public void b() {
        r rVar = (r) this.f8651d;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f8648a || this.f8649b) {
            Drawable mutate = e.z(checkMarkDrawable).mutate();
            if (this.f8648a) {
                mutate.setTintList((ColorStateList) this.e);
            }
            if (this.f8649b) {
                mutate.setTintMode((PorterDuff.Mode) this.f8652f);
            }
            if (mutate.isStateful()) {
                mutate.setState(rVar.getDrawableState());
            }
            rVar.setCheckMarkDrawable(mutate);
        }
    }

    public Bundle c(String str) {
        if (this.f8649b) {
            Bundle bundle = (Bundle) this.e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.e;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.e = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f8651d
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r1 = r0.getContext()
            int[] r3 = g.C0940a.f11824m
            d4.k r7 = d4.k.K2(r1, r10, r3, r11)
            java.lang.Object r1 = r7.f9767W
            r8 = r1
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            android.content.Context r2 = r0.getContext()
            java.lang.Object r1 = r7.f9767W
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r0
            r4 = r10
            r6 = r11
            v0.C1510H.o(r1, r2, r3, r4, r5, r6)
            r10 = 1
            boolean r11 = r8.hasValue(r10)     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r11 == 0) goto L_0x003e
            int r10 = r8.getResourceId(r10, r1)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x003e
            android.content.Context r11 = r0.getContext()     // Catch:{ NotFoundException -> 0x003e }
            android.graphics.drawable.Drawable r10 = B.C0003d.r(r11, r10)     // Catch:{ NotFoundException -> 0x003e }
            r0.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003e }
            goto L_0x0055
        L_0x003c:
            r10 = move-exception
            goto L_0x007b
        L_0x003e:
            boolean r10 = r8.hasValue(r1)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x0055
            int r10 = r8.getResourceId(r1, r1)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x0055
            android.content.Context r11 = r0.getContext()     // Catch:{ all -> 0x003c }
            android.graphics.drawable.Drawable r10 = B.C0003d.r(r11, r10)     // Catch:{ all -> 0x003c }
            r0.setButtonDrawable(r10)     // Catch:{ all -> 0x003c }
        L_0x0055:
            r10 = 2
            boolean r11 = r8.hasValue(r10)     // Catch:{ all -> 0x003c }
            if (r11 == 0) goto L_0x0063
            android.content.res.ColorStateList r10 = r7.v(r10)     // Catch:{ all -> 0x003c }
            r0.setButtonTintList(r10)     // Catch:{ all -> 0x003c }
        L_0x0063:
            r10 = 3
            boolean r11 = r8.hasValue(r10)     // Catch:{ all -> 0x003c }
            if (r11 == 0) goto L_0x0077
            r11 = -1
            int r10 = r8.getInt(r10, r11)     // Catch:{ all -> 0x003c }
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = o.C1286o0.c(r10, r11)     // Catch:{ all -> 0x003c }
            r0.setButtonTintMode(r10)     // Catch:{ all -> 0x003c }
        L_0x0077:
            r7.M2()
            return
        L_0x007b:
            r7.M2()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0526e.d(android.util.AttributeSet, int):void");
    }

    public void e(String str, C0525d dVar) {
        Object obj;
        C1353f fVar = (C1353f) this.f8651d;
        C1350c b8 = fVar.b(str);
        if (b8 != null) {
            obj = b8.f14691V;
        } else {
            C1350c cVar = new C1350c(str, dVar);
            fVar.f14700X++;
            C1350c cVar2 = fVar.f14698V;
            if (cVar2 == null) {
                fVar.f14697U = cVar;
                fVar.f14698V = cVar;
            } else {
                cVar2.f14692W = cVar;
                cVar.f14693X = cVar2;
                fVar.f14698V = cVar;
            }
            obj = null;
        }
        if (((C0525d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public C0526e() {
        this.f8651d = new C1353f();
        this.f8650c = true;
    }
}
