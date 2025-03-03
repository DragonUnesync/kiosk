package A7;

import P6.f;
import android.content.Context;
import java.io.InputStream;

public final class g extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f136b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str, int i) {
        super(str);
        f.e(str, "certificateType");
        this.f136b = i;
    }

    public final InputStream a(Context context) {
        f.e(context, "context");
        InputStream openRawResource = context.getResources().openRawResource(this.f136b);
        f.d(openRawResource, "openRawResource(...)");
        return openRawResource;
    }
}
