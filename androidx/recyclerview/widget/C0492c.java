package androidx.recyclerview.widget;

import P5.E;
import Q0.g;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.c  reason: case insensitive filesystem */
public final class C0492c {

    /* renamed from: a  reason: collision with root package name */
    public final D f8372a;

    /* renamed from: b  reason: collision with root package name */
    public final E f8373b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8374c;

    /* renamed from: d  reason: collision with root package name */
    public int f8375d = 0;
    public View e;

    public C0492c(D d8) {
        this.f8372a = d8;
        this.f8373b = new E(2);
        this.f8374c = new ArrayList();
    }

    public final void a(View view, int i, boolean z) {
        int i8;
        RecyclerView recyclerView = this.f8372a.f8270a;
        if (i < 0) {
            i8 = recyclerView.getChildCount();
        } else {
            i8 = f(i);
        }
        this.f8373b.G(i8, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, i8);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i8;
        RecyclerView recyclerView = this.f8372a.f8270a;
        if (i < 0) {
            i8 = recyclerView.getChildCount();
        } else {
            i8 = f(i);
        }
        this.f8373b.G(i8, z);
        if (z) {
            i(view);
        }
        j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "reAttach " + childViewHolderInt);
                }
                childViewHolderInt.clearTmpDetachFlag();
            } else {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(g.n(recyclerView, sb));
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(i8);
            throw new IllegalArgumentException(g.n(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, i8, layoutParams);
    }

    public final void c(int i) {
        int f8 = f(i);
        this.f8373b.I(f8);
        RecyclerView recyclerView = this.f8372a.f8270a;
        View childAt = recyclerView.getChildAt(f8);
        if (childAt != null) {
            j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                    }
                    childViewHolderInt.addFlags(256);
                } else {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(g.n(recyclerView, sb));
                }
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f8);
            throw new IllegalArgumentException(g.n(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f8);
    }

    public final View d(int i) {
        return this.f8372a.f8270a.getChildAt(f(i));
    }

    public final int e() {
        return this.f8372a.f8270a.getChildCount() - this.f8374c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f8372a.f8270a.getChildCount();
        int i8 = i;
        while (i8 < childCount) {
            E e8 = this.f8373b;
            int A8 = i - (i8 - e8.A(i8));
            if (A8 == 0) {
                while (e8.D(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += A8;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f8372a.f8270a.getChildAt(i);
    }

    public final int h() {
        return this.f8372a.f8270a.getChildCount();
    }

    public final void i(View view) {
        this.f8374c.add(view);
        D d8 = this.f8372a;
        j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(d8.f8270a);
        }
    }

    public final void j(int i) {
        D d8 = this.f8372a;
        int i8 = this.f8375d;
        if (i8 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i8 != 2) {
            try {
                int f8 = f(i);
                View childAt = d8.f8270a.getChildAt(f8);
                if (childAt == null) {
                    this.f8375d = 0;
                    this.e = null;
                    return;
                }
                this.f8375d = 1;
                this.e = childAt;
                if (this.f8373b.I(f8)) {
                    k(childAt);
                }
                d8.c(f8);
                this.f8375d = 0;
                this.e = null;
            } catch (Throwable th) {
                this.f8375d = 0;
                this.e = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public final void k(View view) {
        if (this.f8374c.remove(view)) {
            D d8 = this.f8372a;
            j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(d8.f8270a);
            }
        }
    }

    public final String toString() {
        return this.f8373b.toString() + ", hidden list:" + this.f8374c.size();
    }
}
