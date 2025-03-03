package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import u.C1477r;

/* renamed from: f0.b  reason: case insensitive filesystem */
public final class C0874b {

    /* renamed from: a  reason: collision with root package name */
    public int f11293a;

    /* renamed from: b  reason: collision with root package name */
    public int f11294b;

    /* renamed from: c  reason: collision with root package name */
    public float f11295c;

    /* renamed from: d  reason: collision with root package name */
    public String f11296d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f11297f;

    public C0874b(C0874b bVar, Object obj) {
        bVar.getClass();
        this.f11293a = bVar.f11293a;
        b(obj);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [f0.b, java.lang.Object] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f11458c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i = 0;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == 3) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == 2) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else {
                if (index == 7) {
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    i = 2;
                } else if (index == 6) {
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    i = 1;
                } else if (index == 8) {
                    obj = obtainStyledAttributes.getString(index);
                    i = 5;
                }
                i = 7;
            }
        }
        if (!(str == null || obj == null)) {
            ? obj2 = new Object();
            obj2.f11293a = i;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (C1477r.h(this.f11293a)) {
            case 0:
                this.f11294b = ((Integer) obj).intValue();
                return;
            case 1:
                this.f11295c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f11297f = ((Integer) obj).intValue();
                return;
            case 4:
                this.f11296d = (String) obj;
                return;
            case 5:
                this.e = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f11295c = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
