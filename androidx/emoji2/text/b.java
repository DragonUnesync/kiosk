package androidx.emoji2.text;

import a1.C0410a;
import android.content.pm.PackageManager;
import android.content.pm.Signature;

public final class b extends C0410a {
    public final Signature[] q(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
