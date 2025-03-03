package l1;

import F.h;
import H3.i0;
import P0.t;
import P0.z;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13110a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f13111b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13112c;

    /* renamed from: d  reason: collision with root package name */
    public final t f13113d;
    public final boolean e;

    public g(Context context) {
        Context context2;
        String str;
        TelephonyManager telephonyManager;
        if (context == null) {
            context2 = null;
        } else {
            context2 = context.getApplicationContext();
        }
        this.f13110a = context2;
        int i = z.f3748a;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                str = h.F(networkCountryIso);
                int[] a8 = h.a(str);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                i0 i0Var = h.f13114n;
                hashMap.put(2, (Long) i0Var.get(a8[0]));
                hashMap.put(3, (Long) h.f13115o.get(a8[1]));
                hashMap.put(4, (Long) h.f13116p.get(a8[2]));
                hashMap.put(5, (Long) h.f13117q.get(a8[3]));
                hashMap.put(10, (Long) h.f13118r.get(a8[4]));
                hashMap.put(9, (Long) h.f13119s.get(a8[5]));
                hashMap.put(7, (Long) i0Var.get(a8[0]));
                this.f13111b = hashMap;
                this.f13112c = 2000;
                this.f13113d = t.f3738a;
                this.e = true;
            }
        }
        str = h.F(Locale.getDefault().getCountry());
        int[] a82 = h.a(str);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        i0 i0Var2 = h.f13114n;
        hashMap2.put(2, (Long) i0Var2.get(a82[0]));
        hashMap2.put(3, (Long) h.f13115o.get(a82[1]));
        hashMap2.put(4, (Long) h.f13116p.get(a82[2]));
        hashMap2.put(5, (Long) h.f13117q.get(a82[3]));
        hashMap2.put(10, (Long) h.f13118r.get(a82[4]));
        hashMap2.put(9, (Long) h.f13119s.get(a82[5]));
        hashMap2.put(7, (Long) i0Var2.get(a82[0]));
        this.f13111b = hashMap2;
        this.f13112c = 2000;
        this.f13113d = t.f3738a;
        this.e = true;
    }
}
