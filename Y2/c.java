package Y2;

import android.content.Context;
import android.content.ContextWrapper;

public final class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f6574a = 0;

    public final Context getApplicationContext() {
        return new a(this, getBaseContext().getApplicationContext());
    }
}
