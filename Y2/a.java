package Y2;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.WindowManager;

public final class a extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f6571a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(c cVar, Context context) {
        super(context);
        this.f6571a = cVar;
    }

    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        return new b(this.f6571a, (WindowManager) getBaseContext().getSystemService(str));
    }
}
