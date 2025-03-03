package com.bumptech.glide;

import B.C0003d;
import I.a;
import Q0.g;
import R.e;
import Y0.h;
import a0.d;
import a0.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraDevice;
import android.media.ImageWriter;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import b7.C0595a;
import b7.C0597c;
import b7.C0598d;
import d4.k;
import j0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;
import o.p1;
import o.r1;
import u.C1444D;
import u.C1477r;
import y0.C1620f;
import z3.t;

public abstract class c implements h, C1620f {
    public static final void a(C0595a aVar, C0597c cVar, String str) {
        Logger logger = C0598d.i;
        logger.fine(cVar.f8691b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f8685a);
    }

    public static CameraDevice.StateCallback g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new CameraDevice.StateCallback();
        }
        if (arrayList.size() == 1) {
            return (CameraDevice.StateCallback) arrayList.get(0);
        }
        return new C1444D(arrayList);
    }

    public static final String h(long j7) {
        String str;
        if (j7 <= -999500000) {
            str = g.o(new StringBuilder(), (j7 - ((long) 500000000)) / ((long) 1000000000), " s ");
        } else if (j7 <= -999500) {
            str = g.o(new StringBuilder(), (j7 - ((long) 500000)) / ((long) 1000000), " ms");
        } else if (j7 <= 0) {
            str = g.o(new StringBuilder(), (j7 - ((long) 500)) / ((long) 1000), " µs");
        } else if (j7 < 999500) {
            str = g.o(new StringBuilder(), (j7 + ((long) 500)) / ((long) 1000), " µs");
        } else if (j7 < 999500000) {
            str = g.o(new StringBuilder(), (j7 + ((long) 500000)) / ((long) 1000000), " ms");
        } else {
            str = g.o(new StringBuilder(), (j7 + ((long) 500000000)) / ((long) 1000000000), " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static ColorStateList j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList c8;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c8 = f.c(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return c8;
    }

    public static ColorStateList l(Context context, k kVar, int i) {
        int resourceId;
        ColorStateList c8;
        TypedArray typedArray = (TypedArray) kVar.f9767W;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c8 = f.c(context, resourceId)) == null) {
            return kVar.v(i);
        }
        return c8;
    }

    public static Drawable o(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable r8;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (r8 = C0003d.r(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return r8;
    }

    public static int p(int i, int i8, boolean z) {
        int i9;
        if (z) {
            i9 = ((i8 - i) + 360) % 360;
        } else {
            i9 = (i8 + i) % 360;
        }
        if (F.h.u(2, F.h.G("CameraOrientationUtil"))) {
            StringBuilder e = C1477r.e("getRelativeImageRotation: destRotationDegrees=", i, ", sourceRotationDegrees=", i8, ", isOppositeFacing=");
            e.append(z);
            e.append(", result=");
            e.append(i9);
            F.h.j("CameraOrientationUtil", e.toString());
        }
        return i9;
    }

    public static boolean q(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static boolean r(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static ImageWriter s(int i, Surface surface) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 23) {
            return a.m(i, surface);
        }
        throw new RuntimeException(C1477r.c(i8, "Unable to call newInstance(Surface, int) on API ", ". Version 23 or higher required."));
    }

    public static S1.g v(S1.g gVar, String[] strArr, Map map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (S1.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                S1.g gVar2 = new S1.g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.a((S1.g) map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            gVar.a((S1.g) map.get(strArr[0]));
            return gVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                gVar.a((S1.g) map.get(strArr[i]));
                i++;
            }
        }
        return gVar;
    }

    public static void w(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            p1.a(view, charSequence);
            return;
        }
        r1 r1Var = r1.f14053e0;
        if (r1Var != null && r1Var.f14055U == view) {
            r1.b((r1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            r1 r1Var2 = r1.f14054f0;
            if (r1Var2 != null && r1Var2.f14055U == view) {
                r1Var2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new r1(view, charSequence);
    }

    public static int z(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(g.m(i, "Unsupported surface rotation: "));
    }

    public abstract boolean d(i iVar, d dVar, d dVar2);

    public abstract boolean e(i iVar, Object obj, Object obj2);

    public abstract boolean f(i iVar, a0.h hVar, a0.h hVar2);

    public abstract void n(t tVar, float f8, float f9);

    public abstract void t(a0.h hVar, a0.h hVar2);

    public abstract void u(a0.h hVar, Thread thread);

    public void x(l6.g gVar) {
        try {
            y(gVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            e.v(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void y(l6.g gVar);
}
