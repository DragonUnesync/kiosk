package de.ozerov.fully;

import Z1.c;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

public final class B4 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9802a = 1;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f9803b;

    public /* synthetic */ B4() {
    }

    public final void handleMessage(Message message) {
        switch (this.f9802a) {
            case 0:
                C4 c42 = (C4) this.f9803b.get();
                if (c42 != null && c42.f9812U != null) {
                    int i = message.what;
                    if (i == 1) {
                        c42.c();
                        return;
                    } else if (i == 2) {
                        int e = c42.e();
                        if (!c42.f9820f0 && c42.f9819e0 && ((K4) ((c) c42.f9812U).f6955V).f10053a.isPlaying()) {
                            sendMessageDelayed(obtainMessage(2), (long) (1000 - (e % 1000)));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                int i8 = message.what;
                if (i8 == -3 || i8 == -2 || i8 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f9803b.get(), message.what);
                    return;
                } else if (i8 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                } else {
                    return;
                }
        }
    }

    public B4(C4 c42) {
        this.f9803b = new WeakReference(c42);
    }
}
