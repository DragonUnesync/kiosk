package T2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4987U = 0;

    /* renamed from: V  reason: collision with root package name */
    public final Object f4988V;

    public c(d dVar) {
        this.f4988V = new WeakReference(dVar);
    }

    public final boolean onPreDraw() {
        int i;
        int i8;
        switch (this.f4987U) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                d dVar = (d) ((WeakReference) this.f4988V).get();
                if (dVar == null) {
                    return true;
                }
                ArrayList arrayList = dVar.f4991b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                View view = dVar.f4990a;
                int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int i9 = 0;
                if (layoutParams != null) {
                    i = layoutParams.width;
                } else {
                    i = 0;
                }
                int a8 = dVar.a(view.getWidth(), i, paddingRight);
                int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    i9 = layoutParams2.height;
                }
                int a9 = dVar.a(view.getHeight(), i9, paddingBottom);
                if (a8 <= 0 && a8 != Integer.MIN_VALUE) {
                    return true;
                }
                if (a9 <= 0 && a9 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).b(a8, a9);
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(dVar.f4992c);
                }
                dVar.f4992c = null;
                arrayList.clear();
                return true;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                h hVar = (h) ((WeakReference) this.f4988V).get();
                if (hVar == null) {
                    return true;
                }
                ArrayList arrayList2 = hVar.f4997b;
                if (arrayList2.isEmpty()) {
                    return true;
                }
                ImageView imageView = hVar.f4996a;
                int paddingRight2 = imageView.getPaddingRight() + imageView.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                int i10 = 0;
                if (layoutParams3 != null) {
                    i8 = layoutParams3.width;
                } else {
                    i8 = 0;
                }
                int a10 = hVar.a(imageView.getWidth(), i8, paddingRight2);
                int paddingBottom2 = imageView.getPaddingBottom() + imageView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                if (layoutParams4 != null) {
                    i10 = layoutParams4.height;
                }
                int a11 = hVar.a(imageView.getHeight(), i10, paddingBottom2);
                if (a10 <= 0 && a10 != Integer.MIN_VALUE) {
                    return true;
                }
                if (a11 <= 0 && a11 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it2 = new ArrayList(arrayList2).iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).b(a10, a11);
                }
                ViewTreeObserver viewTreeObserver2 = imageView.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(hVar.f4998c);
                }
                hVar.f4998c = null;
                arrayList2.clear();
                return true;
            default:
                ((CoordinatorLayout) this.f4988V).p(0);
                return true;
        }
    }

    public c(h hVar) {
        this.f4988V = new WeakReference(hVar);
    }

    public c(CoordinatorLayout coordinatorLayout) {
        this.f4988V = coordinatorLayout;
    }
}
