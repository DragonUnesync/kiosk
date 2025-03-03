package m;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: m.k  reason: case insensitive filesystem */
public abstract class C1192k {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
