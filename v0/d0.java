package v0;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

public class d0 extends c0 {
    public d0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
    }

    public j0 a() {
        return j0.g((View) null, this.f15925c.consumeDisplayCutout());
    }

    public C1535h e() {
        DisplayCutout j7 = this.f15925c.getDisplayCutout();
        if (j7 == null) {
            return null;
        }
        return new C1535h(j7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!Objects.equals(this.f15925c, d0Var.f15925c) || !Objects.equals(this.f15928g, d0Var.f15928g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f15925c.hashCode();
    }
}
