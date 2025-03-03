package k2;

import android.content.pm.PackageInfo;
import android.os.Build;
import j2.C1122c;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: k2.k  reason: case insensitive filesystem */
public final class C1154k extends C1146c {

    /* renamed from: d  reason: collision with root package name */
    public final Pattern f13020d = Pattern.compile("\\A\\d+");

    public C1154k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        int i;
        PackageInfo packageInfo;
        boolean b8 = super.b();
        if (!b8 || (i = Build.VERSION.SDK_INT) >= 29) {
            return b8;
        }
        int i8 = C1122c.f12864a;
        if (i >= 26) {
            packageInfo = C1147d.a();
        } else {
            try {
                packageInfo = C1122c.b();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            return false;
        }
        Matcher matcher = this.f13020d.matcher(packageInfo.versionName);
        if (!matcher.find() || Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) < 105) {
            return false;
        }
        return true;
    }
}
