package f0;

import Q0.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.C0519a;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.accounts.Account;
import d0.i;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import u.C1477r;

public final class l {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f11452d = {0, 4, 8};
    public static final SparseIntArray e;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11453a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11454b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f11455c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(C0873a aVar, String str) {
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < split.length) {
            String trim = split[i8].trim();
            Object obj = null;
            try {
                i = o.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f7702j0) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f7702j0.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i9] = i;
            i8++;
            i9++;
        }
        if (i9 != split.length) {
            return Arrays.copyOf(iArr, i9);
        }
        return iArr;
    }

    public static C0879g d(Context context, AttributeSet attributeSet) {
        C0879g gVar = new C0879g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f11456a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            j jVar = gVar.f11370b;
            C0881i iVar = gVar.f11371c;
            k kVar = gVar.e;
            C0880h hVar = gVar.f11372d;
            if (!(index == 1 || 23 == index || 24 == index)) {
                iVar.getClass();
                hVar.getClass();
                kVar.getClass();
            }
            SparseIntArray sparseIntArray = e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    hVar.f11422o = f(obtainStyledAttributes, index, hVar.f11422o);
                    break;
                case 2:
                    hVar.f11380F = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11380F);
                    break;
                case 3:
                    hVar.f11421n = f(obtainStyledAttributes, index, hVar.f11421n);
                    break;
                case 4:
                    hVar.f11420m = f(obtainStyledAttributes, index, hVar.f11420m);
                    break;
                case 5:
                    hVar.f11429v = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    hVar.z = obtainStyledAttributes.getDimensionPixelOffset(index, hVar.z);
                    break;
                case 7:
                    hVar.f11375A = obtainStyledAttributes.getDimensionPixelOffset(index, hVar.f11375A);
                    break;
                case 8:
                    hVar.f11381G = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11381G);
                    break;
                case 9:
                    hVar.f11426s = f(obtainStyledAttributes, index, hVar.f11426s);
                    break;
                case 10:
                    hVar.f11425r = f(obtainStyledAttributes, index, hVar.f11425r);
                    break;
                case 11:
                    hVar.f11386L = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11386L);
                    break;
                case 12:
                    hVar.f11387M = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11387M);
                    break;
                case 13:
                    hVar.f11383I = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11383I);
                    break;
                case EnterpriseDeviceManager.KNOX_2_3:
                    hVar.f11385K = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11385K);
                    break;
                case EnterpriseDeviceManager.KNOX_2_4:
                    hVar.f11388N = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11388N);
                    break;
                case EnterpriseDeviceManager.KNOX_2_4_1:
                    hVar.f11384J = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11384J);
                    break;
                case EnterpriseDeviceManager.KNOX_2_5:
                    hVar.f11407d = obtainStyledAttributes.getDimensionPixelOffset(index, hVar.f11407d);
                    break;
                case EnterpriseDeviceManager.KNOX_2_5_1:
                    hVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, hVar.e);
                    break;
                case EnterpriseDeviceManager.KNOX_2_6:
                    hVar.f11410f = obtainStyledAttributes.getFloat(index, hVar.f11410f);
                    break;
                case EnterpriseDeviceManager.KNOX_2_7:
                    hVar.f11427t = obtainStyledAttributes.getFloat(index, hVar.f11427t);
                    break;
                case 21:
                    hVar.f11405c = obtainStyledAttributes.getLayoutDimension(index, hVar.f11405c);
                    break;
                case 22:
                    int i8 = obtainStyledAttributes.getInt(index, jVar.f11437a);
                    jVar.f11437a = i8;
                    jVar.f11437a = f11452d[i8];
                    break;
                case 23:
                    hVar.f11403b = obtainStyledAttributes.getLayoutDimension(index, hVar.f11403b);
                    break;
                case 24:
                    hVar.f11377C = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11377C);
                    break;
                case 25:
                    hVar.f11412g = f(obtainStyledAttributes, index, hVar.f11412g);
                    break;
                case 26:
                    hVar.f11414h = f(obtainStyledAttributes, index, hVar.f11414h);
                    break;
                case 27:
                    hVar.f11376B = obtainStyledAttributes.getInt(index, hVar.f11376B);
                    break;
                case 28:
                    hVar.f11378D = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11378D);
                    break;
                case 29:
                    hVar.i = f(obtainStyledAttributes, index, hVar.i);
                    break;
                case 30:
                    hVar.f11417j = f(obtainStyledAttributes, index, hVar.f11417j);
                    break;
                case 31:
                    hVar.f11382H = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11382H);
                    break;
                case 32:
                    hVar.f11423p = f(obtainStyledAttributes, index, hVar.f11423p);
                    break;
                case 33:
                    hVar.f11424q = f(obtainStyledAttributes, index, hVar.f11424q);
                    break;
                case 34:
                    hVar.f11379E = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11379E);
                    break;
                case 35:
                    hVar.f11419l = f(obtainStyledAttributes, index, hVar.f11419l);
                    break;
                case 36:
                    hVar.f11418k = f(obtainStyledAttributes, index, hVar.f11418k);
                    break;
                case 37:
                    hVar.f11428u = obtainStyledAttributes.getFloat(index, hVar.f11428u);
                    break;
                case 38:
                    gVar.f11369a = obtainStyledAttributes.getResourceId(index, gVar.f11369a);
                    break;
                case 39:
                    hVar.f11390P = obtainStyledAttributes.getFloat(index, hVar.f11390P);
                    break;
                case 40:
                    hVar.f11389O = obtainStyledAttributes.getFloat(index, hVar.f11389O);
                    break;
                case 41:
                    hVar.f11391Q = obtainStyledAttributes.getInt(index, hVar.f11391Q);
                    break;
                case 42:
                    hVar.f11392R = obtainStyledAttributes.getInt(index, hVar.f11392R);
                    break;
                case 43:
                    jVar.f11439c = obtainStyledAttributes.getFloat(index, jVar.f11439c);
                    break;
                case 44:
                    kVar.f11450k = true;
                    kVar.f11451l = obtainStyledAttributes.getDimension(index, kVar.f11451l);
                    break;
                case 45:
                    kVar.f11443b = obtainStyledAttributes.getFloat(index, kVar.f11443b);
                    break;
                case 46:
                    kVar.f11444c = obtainStyledAttributes.getFloat(index, kVar.f11444c);
                    break;
                case 47:
                    kVar.f11445d = obtainStyledAttributes.getFloat(index, kVar.f11445d);
                    break;
                case 48:
                    kVar.e = obtainStyledAttributes.getFloat(index, kVar.e);
                    break;
                case 49:
                    kVar.f11446f = obtainStyledAttributes.getDimension(index, kVar.f11446f);
                    break;
                case 50:
                    kVar.f11447g = obtainStyledAttributes.getDimension(index, kVar.f11447g);
                    break;
                case 51:
                    kVar.f11448h = obtainStyledAttributes.getDimension(index, kVar.f11448h);
                    break;
                case 52:
                    kVar.i = obtainStyledAttributes.getDimension(index, kVar.i);
                    break;
                case 53:
                    kVar.f11449j = obtainStyledAttributes.getDimension(index, kVar.f11449j);
                    break;
                case 54:
                    hVar.f11393S = obtainStyledAttributes.getInt(index, hVar.f11393S);
                    break;
                case 55:
                    hVar.f11394T = obtainStyledAttributes.getInt(index, hVar.f11394T);
                    break;
                case 56:
                    hVar.f11395U = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11395U);
                    break;
                case 57:
                    hVar.f11396V = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11396V);
                    break;
                case 58:
                    hVar.f11397W = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11397W);
                    break;
                case 59:
                    hVar.f11398X = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11398X);
                    break;
                case 60:
                    kVar.f11442a = obtainStyledAttributes.getFloat(index, kVar.f11442a);
                    break;
                case 61:
                    hVar.f11430w = f(obtainStyledAttributes, index, hVar.f11430w);
                    break;
                case 62:
                    hVar.f11431x = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11431x);
                    break;
                case 63:
                    hVar.f11432y = obtainStyledAttributes.getFloat(index, hVar.f11432y);
                    break;
                case Account.FLAGS_VIBRATE_WHEN_SILENT:
                    iVar.f11433a = f(obtainStyledAttributes, index, iVar.f11433a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        String str = C0519a.f8607a[obtainStyledAttributes.getInteger(index, 0)];
                        iVar.getClass();
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        iVar.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    iVar.getClass();
                    break;
                case 67:
                    iVar.f11436d = obtainStyledAttributes.getFloat(index, iVar.f11436d);
                    break;
                case 68:
                    jVar.f11440d = obtainStyledAttributes.getFloat(index, jVar.f11440d);
                    break;
                case 69:
                    hVar.f11399Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    hVar.f11400Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    hVar.f11402a0 = obtainStyledAttributes.getInt(index, hVar.f11402a0);
                    break;
                case 73:
                    hVar.f11404b0 = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f11404b0);
                    break;
                case 74:
                    hVar.f11409e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    hVar.f11416i0 = obtainStyledAttributes.getBoolean(index, hVar.f11416i0);
                    break;
                case 76:
                    iVar.f11434b = obtainStyledAttributes.getInt(index, iVar.f11434b);
                    break;
                case 77:
                    hVar.f11411f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    jVar.f11438b = obtainStyledAttributes.getInt(index, jVar.f11438b);
                    break;
                case 79:
                    iVar.f11435c = obtainStyledAttributes.getFloat(index, iVar.f11435c);
                    break;
                case 80:
                    hVar.f11413g0 = obtainStyledAttributes.getBoolean(index, hVar.f11413g0);
                    break;
                case 81:
                    hVar.f11415h0 = obtainStyledAttributes.getBoolean(index, hVar.f11415h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return gVar;
    }

    public static int f(TypedArray typedArray, int i, int i8) {
        int resourceId = typedArray.getResourceId(i, i8);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [f0.c, f0.a, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v2, types: [d0.a, d0.i] */
    public final void a(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2;
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        String str;
        l lVar = this;
        ConstraintLayout constraintLayout3 = constraintLayout;
        int i8 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap4 = lVar.f11455c;
        HashSet hashSet = new HashSet(hashMap4.keySet());
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout3.getChildAt(i9);
            int id = childAt.getId();
            if (!hashMap4.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else if (lVar.f11454b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (hashMap4.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0879g gVar = (C0879g) hashMap4.get(Integer.valueOf(id));
                    if (childAt instanceof C0873a) {
                        gVar.f11372d.f11406c0 = i8;
                    }
                    int i10 = gVar.f11372d.f11406c0;
                    if (i10 != -1 && i10 == i8) {
                        C0873a aVar = (C0873a) childAt;
                        aVar.setId(id);
                        C0880h hVar = gVar.f11372d;
                        aVar.setType(hVar.f11402a0);
                        aVar.setMargin(hVar.f11404b0);
                        aVar.setAllowsGoneWidget(hVar.f11416i0);
                        int[] iArr = hVar.f11408d0;
                        if (iArr != null) {
                            aVar.setReferencedIds(iArr);
                        } else {
                            String str2 = hVar.f11409e0;
                            if (str2 != null) {
                                int[] c8 = c(aVar, str2);
                                hVar.f11408d0 = c8;
                                aVar.setReferencedIds(c8);
                            }
                        }
                    }
                    C0877e eVar = (C0877e) childAt.getLayoutParams();
                    eVar.a();
                    gVar.a(eVar);
                    HashMap hashMap5 = gVar.f11373f;
                    Class<?> cls = childAt.getClass();
                    for (String str3 : hashMap5.keySet()) {
                        C0874b bVar = (C0874b) hashMap5.get(str3);
                        String d8 = C1477r.d("set", str3);
                        int i11 = childCount;
                        try {
                            switch (C1477r.h(bVar.f11293a)) {
                                case 0:
                                    hashMap2 = hashMap4;
                                    hashMap3 = hashMap5;
                                    cls.getMethod(d8, new Class[]{Integer.TYPE}).invoke(childAt, new Object[]{Integer.valueOf(bVar.f11294b)});
                                    break;
                                case 1:
                                    hashMap2 = hashMap4;
                                    hashMap3 = hashMap5;
                                    cls.getMethod(d8, new Class[]{Float.TYPE}).invoke(childAt, new Object[]{Float.valueOf(bVar.f11295c)});
                                    break;
                                case 2:
                                    hashMap2 = hashMap4;
                                    hashMap3 = hashMap5;
                                    cls.getMethod(d8, new Class[]{Integer.TYPE}).invoke(childAt, new Object[]{Integer.valueOf(bVar.f11297f)});
                                    break;
                                case 3:
                                    hashMap2 = hashMap4;
                                    hashMap3 = hashMap5;
                                    Method method = cls.getMethod(d8, new Class[]{Drawable.class});
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(bVar.f11297f);
                                    method.invoke(childAt, new Object[]{colorDrawable});
                                    break;
                                case 4:
                                    hashMap2 = hashMap4;
                                    hashMap3 = hashMap5;
                                    cls.getMethod(d8, new Class[]{CharSequence.class}).invoke(childAt, new Object[]{bVar.f11296d});
                                    break;
                                case 5:
                                    hashMap3 = hashMap5;
                                    Method method2 = cls.getMethod(d8, new Class[]{Boolean.TYPE});
                                    hashMap2 = hashMap4;
                                    try {
                                        method2.invoke(childAt, new Object[]{Boolean.valueOf(bVar.e)});
                                    } catch (NoSuchMethodException e8) {
                                        e = e8;
                                        Log.e("TransitionLayout", e.getMessage());
                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                        Log.e("TransitionLayout", cls.getName() + " must have a method " + d8);
                                        ConstraintLayout constraintLayout4 = constraintLayout;
                                        childCount = i11;
                                        hashMap5 = hashMap3;
                                        hashMap4 = hashMap2;
                                    } catch (IllegalAccessException e9) {
                                        e = e9;
                                        StringBuilder s8 = g.s(" Custom Attribute \"", str3, "\" not found on ");
                                        s8.append(cls.getName());
                                        Log.e("TransitionLayout", s8.toString());
                                        e.printStackTrace();
                                        ConstraintLayout constraintLayout42 = constraintLayout;
                                        childCount = i11;
                                        hashMap5 = hashMap3;
                                        hashMap4 = hashMap2;
                                    } catch (InvocationTargetException e10) {
                                        e = e10;
                                        StringBuilder s9 = g.s(" Custom Attribute \"", str3, "\" not found on ");
                                        s9.append(cls.getName());
                                        Log.e("TransitionLayout", s9.toString());
                                        e.printStackTrace();
                                        ConstraintLayout constraintLayout422 = constraintLayout;
                                        childCount = i11;
                                        hashMap5 = hashMap3;
                                        hashMap4 = hashMap2;
                                    }
                                case 6:
                                    hashMap3 = hashMap5;
                                    try {
                                        cls.getMethod(d8, new Class[]{Float.TYPE}).invoke(childAt, new Object[]{Float.valueOf(bVar.f11295c)});
                                        hashMap2 = hashMap4;
                                    } catch (NoSuchMethodException e11) {
                                        e = e11;
                                        hashMap2 = hashMap4;
                                        Log.e("TransitionLayout", e.getMessage());
                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                        Log.e("TransitionLayout", cls.getName() + " must have a method " + d8);
                                        ConstraintLayout constraintLayout4222 = constraintLayout;
                                        childCount = i11;
                                        hashMap5 = hashMap3;
                                        hashMap4 = hashMap2;
                                    } catch (IllegalAccessException e12) {
                                        e = e12;
                                        hashMap2 = hashMap4;
                                        StringBuilder s82 = g.s(" Custom Attribute \"", str3, "\" not found on ");
                                        s82.append(cls.getName());
                                        Log.e("TransitionLayout", s82.toString());
                                        e.printStackTrace();
                                        ConstraintLayout constraintLayout42222 = constraintLayout;
                                        childCount = i11;
                                        hashMap5 = hashMap3;
                                        hashMap4 = hashMap2;
                                    } catch (InvocationTargetException e13) {
                                        e = e13;
                                        hashMap2 = hashMap4;
                                        StringBuilder s92 = g.s(" Custom Attribute \"", str3, "\" not found on ");
                                        s92.append(cls.getName());
                                        Log.e("TransitionLayout", s92.toString());
                                        e.printStackTrace();
                                        ConstraintLayout constraintLayout422222 = constraintLayout;
                                        childCount = i11;
                                        hashMap5 = hashMap3;
                                        hashMap4 = hashMap2;
                                    }
                                default:
                                    hashMap2 = hashMap4;
                                    hashMap3 = hashMap5;
                                    break;
                            }
                        } catch (NoSuchMethodException e14) {
                            e = e14;
                            hashMap2 = hashMap4;
                            hashMap3 = hashMap5;
                            Log.e("TransitionLayout", e.getMessage());
                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + d8);
                            ConstraintLayout constraintLayout4222222 = constraintLayout;
                            childCount = i11;
                            hashMap5 = hashMap3;
                            hashMap4 = hashMap2;
                        } catch (IllegalAccessException e15) {
                            e = e15;
                            hashMap2 = hashMap4;
                            hashMap3 = hashMap5;
                            StringBuilder s822 = g.s(" Custom Attribute \"", str3, "\" not found on ");
                            s822.append(cls.getName());
                            Log.e("TransitionLayout", s822.toString());
                            e.printStackTrace();
                            ConstraintLayout constraintLayout42222222 = constraintLayout;
                            childCount = i11;
                            hashMap5 = hashMap3;
                            hashMap4 = hashMap2;
                        } catch (InvocationTargetException e16) {
                            e = e16;
                            hashMap2 = hashMap4;
                            hashMap3 = hashMap5;
                            StringBuilder s922 = g.s(" Custom Attribute \"", str3, "\" not found on ");
                            s922.append(cls.getName());
                            Log.e("TransitionLayout", s922.toString());
                            e.printStackTrace();
                            ConstraintLayout constraintLayout422222222 = constraintLayout;
                            childCount = i11;
                            hashMap5 = hashMap3;
                            hashMap4 = hashMap2;
                        }
                    }
                    i = childCount;
                    hashMap = hashMap4;
                    childAt.setLayoutParams(eVar);
                    j jVar = gVar.f11370b;
                    if (jVar.f11438b == 0) {
                        childAt.setVisibility(jVar.f11437a);
                    }
                    childAt.setAlpha(jVar.f11439c);
                    k kVar = gVar.e;
                    childAt.setRotation(kVar.f11442a);
                    childAt.setRotationX(kVar.f11443b);
                    childAt.setRotationY(kVar.f11444c);
                    childAt.setScaleX(kVar.f11445d);
                    childAt.setScaleY(kVar.e);
                    if (!Float.isNaN(kVar.f11446f)) {
                        childAt.setPivotX(kVar.f11446f);
                    }
                    if (!Float.isNaN(kVar.f11447g)) {
                        childAt.setPivotY(kVar.f11447g);
                    }
                    childAt.setTranslationX(kVar.f11448h);
                    childAt.setTranslationY(kVar.i);
                    childAt.setTranslationZ(kVar.f11449j);
                    if (kVar.f11450k) {
                        childAt.setElevation(kVar.f11451l);
                    }
                } else {
                    i = childCount;
                    hashMap = hashMap4;
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
                i9++;
                lVar = this;
                constraintLayout3 = constraintLayout;
                childCount = i;
                hashMap4 = hashMap;
                i8 = 1;
            }
            i = childCount;
            hashMap = hashMap4;
            i9++;
            lVar = this;
            constraintLayout3 = constraintLayout;
            childCount = i;
            hashMap4 = hashMap;
            i8 = 1;
        }
        HashMap hashMap6 = hashMap4;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            HashMap hashMap7 = hashMap6;
            C0879g gVar2 = (C0879g) hashMap7.get(num);
            C0880h hVar2 = gVar2.f11372d;
            int i12 = hVar2.f11406c0;
            if (i12 == -1 || i12 != 1) {
                constraintLayout2 = constraintLayout;
            } else {
                Context context = constraintLayout.getContext();
                ? view = new View(context);
                view.f11298U = new int[32];
                view.f11303c0 = new HashMap();
                view.f11300W = context;
                ? iVar = new i();
                iVar.f9558f0 = 0;
                iVar.f9559g0 = true;
                iVar.f9560h0 = 0;
                view.f11292f0 = iVar;
                view.f11301a0 = iVar;
                view.g();
                view.setVisibility(8);
                view.setId(num.intValue());
                int[] iArr2 = hVar2.f11408d0;
                if (iArr2 != null) {
                    view.setReferencedIds(iArr2);
                } else {
                    String str4 = hVar2.f11409e0;
                    if (str4 != null) {
                        int[] c9 = c(view, str4);
                        hVar2.f11408d0 = c9;
                        view.setReferencedIds(c9);
                    }
                }
                view.setType(hVar2.f11402a0);
                view.setMargin(hVar2.f11404b0);
                C0877e a8 = ConstraintLayout.a();
                view.g();
                gVar2.a(a8);
                constraintLayout2 = constraintLayout;
                constraintLayout2.addView(view, a8);
            }
            if (hVar2.f11401a) {
                n nVar = new n(constraintLayout.getContext());
                nVar.setId(num.intValue());
                C0877e a9 = ConstraintLayout.a();
                gVar2.a(a9);
                constraintLayout2.addView(nVar, a9);
            }
            hashMap6 = hashMap7;
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        l lVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = lVar.f11455c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0877e eVar = (C0877e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!lVar.f11454b || id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new C0879g());
                }
                C0879g gVar = (C0879g) hashMap.get(Integer.valueOf(id));
                HashMap hashMap2 = lVar.f11453a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0874b bVar = (C0874b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0874b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0874b(bVar, cls.getMethod("getMap" + str, (Class[]) null).invoke(childAt, (Object[]) null)));
                        }
                    } catch (NoSuchMethodException e8) {
                        e8.printStackTrace();
                    } catch (IllegalAccessException e9) {
                        e9.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
                gVar.f11373f = hashMap3;
                gVar.f11369a = id;
                int i8 = eVar.f11337d;
                C0880h hVar = gVar.f11372d;
                hVar.f11412g = i8;
                hVar.f11414h = eVar.e;
                hVar.i = eVar.f11340f;
                hVar.f11417j = eVar.f11342g;
                hVar.f11418k = eVar.f11344h;
                hVar.f11419l = eVar.i;
                hVar.f11420m = eVar.f11347j;
                hVar.f11421n = eVar.f11349k;
                hVar.f11422o = eVar.f11351l;
                hVar.f11423p = eVar.f11355p;
                hVar.f11424q = eVar.f11356q;
                hVar.f11425r = eVar.f11357r;
                hVar.f11426s = eVar.f11358s;
                hVar.f11427t = eVar.z;
                hVar.f11428u = eVar.f11305A;
                hVar.f11429v = eVar.f11306B;
                hVar.f11430w = eVar.f11352m;
                hVar.f11431x = eVar.f11353n;
                hVar.f11432y = eVar.f11354o;
                hVar.z = eVar.f11320P;
                hVar.f11375A = eVar.f11321Q;
                hVar.f11376B = eVar.f11322R;
                hVar.f11410f = eVar.f11335c;
                hVar.f11407d = eVar.f11331a;
                hVar.e = eVar.f11333b;
                hVar.f11403b = eVar.width;
                hVar.f11405c = eVar.height;
                hVar.f11377C = eVar.leftMargin;
                hVar.f11378D = eVar.rightMargin;
                hVar.f11379E = eVar.topMargin;
                hVar.f11380F = eVar.bottomMargin;
                hVar.f11389O = eVar.f11309E;
                hVar.f11390P = eVar.f11308D;
                hVar.f11392R = eVar.f11311G;
                hVar.f11391Q = eVar.f11310F;
                hVar.f11413g0 = eVar.f11323S;
                hVar.f11415h0 = eVar.f11324T;
                hVar.f11393S = eVar.f11312H;
                hVar.f11394T = eVar.f11313I;
                hVar.f11395U = eVar.f11316L;
                hVar.f11396V = eVar.f11317M;
                hVar.f11397W = eVar.f11314J;
                hVar.f11398X = eVar.f11315K;
                hVar.f11399Y = eVar.f11318N;
                hVar.f11400Z = eVar.f11319O;
                hVar.f11411f0 = eVar.f11325U;
                hVar.f11384J = eVar.f11360u;
                hVar.f11386L = eVar.f11362w;
                hVar.f11383I = eVar.f11359t;
                hVar.f11385K = eVar.f11361v;
                hVar.f11388N = eVar.f11363x;
                hVar.f11387M = eVar.f11364y;
                hVar.f11381G = eVar.getMarginEnd();
                hVar.f11382H = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                j jVar = gVar.f11370b;
                jVar.f11437a = visibility;
                jVar.f11439c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                k kVar = gVar.e;
                kVar.f11442a = rotation;
                kVar.f11443b = childAt.getRotationX();
                kVar.f11444c = childAt.getRotationY();
                kVar.f11445d = childAt.getScaleX();
                kVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    kVar.f11446f = pivotX;
                    kVar.f11447g = pivotY;
                }
                kVar.f11448h = childAt.getTranslationX();
                kVar.i = childAt.getTranslationY();
                kVar.f11449j = childAt.getTranslationZ();
                if (kVar.f11450k) {
                    kVar.f11451l = childAt.getElevation();
                }
                if (childAt instanceof C0873a) {
                    C0873a aVar = (C0873a) childAt;
                    hVar.f11416i0 = aVar.f11292f0.f9559g0;
                    hVar.f11408d0 = aVar.getReferencedIds();
                    hVar.f11402a0 = aVar.getType();
                    hVar.f11404b0 = aVar.getMargin();
                }
                i++;
                lVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0879g d8 = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d8.f11372d.f11401a = true;
                    }
                    this.f11455c.put(Integer.valueOf(d8.f11369a), d8);
                }
            }
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }
}
