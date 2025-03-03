package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.C0514z;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public int f7785a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7786b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7787c;

    public f(Q q7) {
        this.f7785a = RecyclerView.UNDEFINED_DURATION;
        this.f7787c = new Rect();
        this.f7786b = q7;
    }

    public static f a(Q q7, int i) {
        if (i == 0) {
            return new C0514z(q7, 0);
        }
        if (i == 1) {
            return new C0514z(q7, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f7785a) {
            return 0;
        }
        return l() - this.f7785a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public f(i iVar) {
        this.f7785a = 0;
        this.f7787c = new c();
        this.f7786b = iVar;
    }
}
