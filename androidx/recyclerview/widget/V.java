package androidx.recyclerview.widget;

import android.view.MotionEvent;

public interface V {
    boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

    void onRequestDisallowInterceptTouchEvent(boolean z);

    void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
}
