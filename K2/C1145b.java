package k2;

import android.os.Build;

/* renamed from: k2.b  reason: case insensitive filesystem */
public class C1145b extends C1146c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f13014d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1145b(int i, String str, String str2) {
        super(str, str2);
        this.f13014d = i;
    }

    public final boolean a() {
        switch (this.f13014d) {
            case 0:
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            case 1:
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            case 2:
                return false;
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            case 5:
                if (Build.VERSION.SDK_INT >= 28) {
                    return true;
                }
                return false;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
        }
    }
}
