package androidx.profileinstaller;

import B.C0002c;
import K1.i;
import Z1.h;
import android.content.Context;
import android.os.Build;
import c2.C0613b;
import java.util.Collections;
import java.util.List;

public class ProfileInstallerInitializer implements C0613b {
    public final List a() {
        return Collections.emptyList();
    }

    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new i(28);
        }
        h.a(new C0002c((Object) this, 29, (Object) context.getApplicationContext()));
        return new i(28);
    }
}
