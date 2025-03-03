package v0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.woxthebox.draglistview.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: v0.G  reason: case insensitive filesystem */
public final class C1509G {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f15870d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f15871a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f15872b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f15873c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f15871a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a8 = a(viewGroup.getChildAt(childCount));
                    if (a8 != null) {
                        return a8;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
