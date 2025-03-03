package v0;

import D0.c;
import android.text.TextUtils;
import android.view.View;

/* renamed from: v0.v  reason: case insensitive filesystem */
public final class C1549v extends c {
    public final /* synthetic */ int e;

    public C1549v(int i, Class cls, int i8, int i9, int i10) {
        this.e = i10;
        this.f977a = i;
        this.f980d = cls;
        this.f979c = i8;
        this.f978b = i9;
    }

    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(C1505C.c(view));
            case 1:
                return C1505C.a(view);
            case 2:
                return C1507E.a(view);
            default:
                return Boolean.valueOf(C1505C.b(view));
        }
    }

    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                C1505C.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                C1505C.e(view, (CharSequence) obj);
                return;
            case 2:
                C1507E.b(view, (CharSequence) obj);
                return;
            default:
                C1505C.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    public final boolean e(Object obj, Object obj2) {
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9;
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z10 = false;
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                if (bool2 == null || !bool2.booleanValue()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (z == z6) {
                    z10 = true;
                }
                return !z10;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z11 = false;
                if (bool3 == null || !bool3.booleanValue()) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (bool4 == null || !bool4.booleanValue()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z8 == z9) {
                    z11 = true;
                }
                return !z11;
        }
    }
}
