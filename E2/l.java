package E2;

import A1.d;
import Q0.g;
import W2.m;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class l {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f1357d;
    public static final Bitmap.Config[] e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f1358f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f1359g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f1360h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final f f1361a = new f(1);

    /* renamed from: b  reason: collision with root package name */
    public final d f1362b = new d(10);

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1363c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f1357d = configArr;
        e = configArr;
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d8 = d(bitmap.getConfig());
        Integer num2 = (Integer) d8.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(m.c(bitmap), bitmap.getConfig()) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d8.remove(num);
        } else {
            d8.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final Bitmap b(int i, int i8, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int i9 = 0;
        int d8 = m.d(config) * i * i8;
        f fVar = this.f1361a;
        i iVar = (i) ((ArrayDeque) fVar.f1328V).poll();
        if (iVar == null) {
            iVar = fVar.p();
        }
        k kVar = (k) iVar;
        kVar.f1355b = d8;
        kVar.f1356c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i10 = j.f1353a[config.ordinal()];
            if (i10 == 1) {
                configArr = f1357d;
            } else if (i10 == 2) {
                configArr = f1358f;
            } else if (i10 != 3) {
                configArr = i10 != 4 ? new Bitmap.Config[]{config} : f1360h;
            } else {
                configArr = f1359g;
            }
        } else {
            configArr = e;
        }
        int length = configArr.length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i9];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(d8));
            if (num == null || num.intValue() > d8 * 8) {
                i9++;
            } else if (num.intValue() != d8 || (config2 != null ? !config2.equals(config) : config != null)) {
                fVar.j(kVar);
                int intValue = num.intValue();
                i iVar2 = (i) ((ArrayDeque) fVar.f1328V).poll();
                if (iVar2 == null) {
                    iVar2 = fVar.p();
                }
                kVar = (k) iVar2;
                kVar.f1355b = intValue;
                kVar.f1356c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f1362b.t(kVar);
        if (bitmap != null) {
            a(Integer.valueOf(kVar.f1355b), bitmap);
            bitmap.reconfigure(i, i8, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.f1363c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int c8 = m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        f fVar = this.f1361a;
        i iVar = (i) ((ArrayDeque) fVar.f1328V).poll();
        if (iVar == null) {
            iVar = fVar.p();
        }
        k kVar = (k) iVar;
        kVar.f1355b = c8;
        kVar.f1356c = config;
        this.f1362b.G(kVar, bitmap);
        NavigableMap d8 = d(bitmap.getConfig());
        Integer num = (Integer) d8.get(Integer.valueOf(kVar.f1355b));
        Integer valueOf = Integer.valueOf(kVar.f1355b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        d8.put(valueOf, Integer.valueOf(i));
    }

    public final String toString() {
        StringBuilder r8 = g.r("SizeConfigStrategy{groupedMap=");
        r8.append(this.f1362b);
        r8.append(", sortedSizes=(");
        HashMap hashMap = this.f1363c;
        for (Map.Entry entry : hashMap.entrySet()) {
            r8.append(entry.getKey());
            r8.append('[');
            r8.append(entry.getValue());
            r8.append("], ");
        }
        if (!hashMap.isEmpty()) {
            r8.replace(r8.length() - 2, r8.length(), "");
        }
        r8.append(")}");
        return r8.toString();
    }
}
