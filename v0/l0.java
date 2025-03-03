package v0;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

public class l0 extends k0 {
    public final void r(boolean z) {
        if (z) {
            Window window = this.f15953a;
            window.clearFlags(67108864);
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        C(8192);
    }
}
