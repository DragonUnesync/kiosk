package E0;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.emoji2.text.g;
import java.lang.ref.WeakReference;

public final class h extends g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1310a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f1311b;

    public h(EditText editText) {
        this.f1311b = new WeakReference(editText);
    }

    public void a() {
        switch (this.f1310a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f1311b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void b() {
        switch (this.f1310a) {
            case 0:
                i.a((EditText) this.f1311b.get(), 1);
                return;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f1311b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.f1311b = new WeakReference(switchCompat);
    }
}
