package v0;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

public final class m0 extends l0 {
    public final void q(boolean z) {
        if (z) {
            Window window = this.f15953a;
            window.clearFlags(134217728);
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        C(16);
    }
}
