package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0470v;
import androidx.fragment.app.C0472x;
import b2.C0526e;
import d.C0626a;
import h.C1022j;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class f implements C0626a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7280a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1022j f7281b;

    public /* synthetic */ f(C1022j jVar, int i) {
        this.f7280a = i;
        this.f7281b = jVar;
    }

    public final void a() {
        switch (this.f7280a) {
            case 0:
                C1022j jVar = this.f7281b;
                Bundle c8 = ((C0526e) jVar.f7291Y.f9082X).c("android:support:activity-result");
                if (c8 != null) {
                    g gVar = jVar.f7297e0;
                    gVar.getClass();
                    ArrayList<Integer> integerArrayList = c8.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c8.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        gVar.f7338d = c8.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = c8.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = gVar.f7340g;
                        bundle2.putAll(bundle);
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            HashMap hashMap = gVar.f7336b;
                            boolean containsKey = hashMap.containsKey(str);
                            HashMap hashMap2 = gVar.f7335a;
                            if (containsKey) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.intValue();
                            String str2 = stringArrayList.get(i);
                            hashMap2.put(num2, str2);
                            hashMap.put(str2, num2);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C0472x xVar = (C0472x) this.f7281b.f12212m0.f6955V;
                xVar.f8095g0.b(xVar, xVar, (C0470v) null);
                return;
        }
    }
}
