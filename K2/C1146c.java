package k2;

import android.os.Build;
import java.util.HashSet;

/* renamed from: k2.c  reason: case insensitive filesystem */
public abstract class C1146c implements C1151h {

    /* renamed from: c  reason: collision with root package name */
    public static final HashSet f13015c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final String f13016a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13017b;

    public C1146c(String str, String str2) {
        this.f13016a = str;
        this.f13017b = str2;
        f13015c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = C1144a.f13013a;
        String str = this.f13017b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if (("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"))) {
                return true;
            }
            return false;
        }
        return true;
    }
}
