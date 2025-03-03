package x0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.camera.lifecycle.c;
import k2.C1160q;

/* renamed from: x0.c  reason: case insensitive filesystem */
public final class C1597c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f16231a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1597c(InputConnection inputConnection, c cVar) {
        super(inputConnection, false);
        this.f16231a = cVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C1160q qVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            qVar = new C1160q(29, (Object) new C1599e(inputContentInfo));
        }
        if (this.f16231a.l(qVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
