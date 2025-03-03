package l0;

import A3.c;
import D2.o;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import i0.C1087a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m0.C1195a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r0.C1370d;

/* renamed from: l0.b  reason: case insensitive filesystem */
public abstract class C1169b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f13061a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f13062b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f13063c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f13064d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final Object e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static Method f13065f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f13066g;

    public static o b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        o oVar;
        if (d(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i8 = typedValue.type;
            if (i8 >= 28 && i8 <= 31) {
                return new o((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                oVar = o.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e8) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e8);
                oVar = null;
            }
            if (oVar != null) {
                return oVar;
            }
        }
        return new o((Shader) null, (ColorStateList) null, 0);
    }

    public static String c(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (!d(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int e(float f8) {
        float f9;
        boolean z;
        float f10;
        if (f8 < 1.0f) {
            return -16777216;
        }
        if (f8 > 99.0f) {
            return -1;
        }
        float f11 = (f8 + 16.0f) / 116.0f;
        if (f8 > 8.0f) {
            f9 = f11 * f11 * f11;
        } else {
            f9 = f8 / 903.2963f;
        }
        float f12 = f11 * f11 * f11;
        if (f12 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f10 = f12;
        } else {
            f10 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f12 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f13063c;
        return C1195a.a((double) (f10 * fArr[0]), (double) (f9 * fArr[1]), (double) (f12 * fArr[2]));
    }

    public static float f(int i) {
        float pow;
        float f8 = ((float) i) / 255.0f;
        if (f8 <= 0.04045f) {
            pow = f8 / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f8 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static d j(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        boolean z;
        int i8;
        int i9;
        C1370d dVar;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C1087a.f12633b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(5);
                String string3 = obtainAttributes.getString(6);
                String string4 = obtainAttributes.getString(2);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(3, 1);
                int integer2 = obtainAttributes.getInteger(4, 500);
                String string5 = obtainAttributes.getString(7);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C1087a.f12634c);
                                int i10 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i10 = 1;
                                }
                                int i11 = obtainAttributes2.getInt(i10, 400);
                                if (obtainAttributes2.hasValue(6)) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                                if (1 == obtainAttributes2.getInt(i, 0)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int i12 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i12 = 3;
                                }
                                if (obtainAttributes2.hasValue(7)) {
                                    i8 = 7;
                                } else {
                                    i8 = 4;
                                }
                                String string6 = obtainAttributes2.getString(i8);
                                int i13 = obtainAttributes2.getInt(i12, 0);
                                if (obtainAttributes2.hasValue(5)) {
                                    i9 = 5;
                                } else {
                                    i9 = 0;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i9, 0);
                                String string7 = obtainAttributes2.getString(i9);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    m(xmlResourceParser);
                                }
                                arrayList.add(new f(i11, i13, resourceId2, string7, string6, z));
                            } else {
                                m(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new e((f[]) arrayList.toArray(new f[0]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        m(xmlResourceParser);
                    }
                    List k8 = k(resources2, resourceId);
                    if (string4 != null) {
                        dVar = new C1370d(string, string2, string4, k8);
                    } else {
                        dVar = null;
                    }
                    return new g(new C1370d(string, string2, string3, k8), dVar, integer, integer2, string5);
                }
            } else {
                m(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List k(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void l(Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            k.a(theme);
        } else if (i >= 23) {
            synchronized (e) {
                if (!f13066g) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", (Class[]) null);
                        f13065f = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e8) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e8);
                    }
                    f13066g = true;
                }
                Method method = f13065f;
                if (method != null) {
                    try {
                        method.invoke(theme, (Object[]) null);
                    } catch (IllegalAccessException | InvocationTargetException e9) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e9);
                        f13065f = null;
                    }
                }
            }
        }
    }

    public static void m(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static float n() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new c(i, 8, (Object) this));
    }

    public abstract void h(int i);

    public abstract void i(Typeface typeface);
}
