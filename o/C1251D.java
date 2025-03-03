package o;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import k2.C1160q;
import v0.C1510H;
import v0.C1531d;

/* renamed from: o.D  reason: case insensitive filesystem */
public abstract class C1251D {
    /* JADX INFO: finally extract failed */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        C1160q qVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                qVar = new C1160q(clipData, 3);
            } else {
                C1531d dVar = new C1531d();
                dVar.f15931V = clipData;
                dVar.f15932W = 3;
                qVar = dVar;
            }
            C1510H.l(textView, qVar.d());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        C1160q qVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            qVar = new C1160q(clipData, 3);
        } else {
            C1531d dVar = new C1531d();
            dVar.f15931V = clipData;
            dVar.f15932W = 3;
            qVar = dVar;
        }
        C1510H.l(view, qVar.d());
        return true;
    }
}
