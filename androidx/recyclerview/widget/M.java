package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

public abstract class M {

    /* renamed from: a  reason: collision with root package name */
    public K f8297a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f8298b;

    /* renamed from: c  reason: collision with root package name */
    public long f8299c;

    /* renamed from: d  reason: collision with root package name */
    public long f8300d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f8301f;

    public static void b(j0 j0Var) {
        int i = j0Var.mFlags;
        if (!j0Var.isInvalid() && (i & 4) == 0) {
            j0Var.getOldPosition();
            j0Var.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(j0 j0Var, j0 j0Var2, L l8, L l9);

    public final void c(j0 j0Var) {
        K k8 = this.f8297a;
        if (k8 != null) {
            D d8 = (D) k8;
            d8.getClass();
            j0Var.setIsRecyclable(true);
            if (j0Var.mShadowedHolder != null && j0Var.mShadowingHolder == null) {
                j0Var.mShadowedHolder = null;
            }
            j0Var.mShadowingHolder = null;
            if (!j0Var.shouldBeKeptAsChild()) {
                View view = j0Var.itemView;
                RecyclerView recyclerView = d8.f8270a;
                if (!recyclerView.removeAnimatingView(view) && j0Var.isTmpDetached()) {
                    recyclerView.removeDetachedView(j0Var.itemView, false);
                }
            }
        }
    }

    public abstract void d(j0 j0Var);

    public abstract void e();

    public abstract boolean f();
}
