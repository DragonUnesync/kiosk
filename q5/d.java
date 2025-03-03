package Q5;

import android.app.AlertDialog;
import android.os.Handler;
import android.widget.Button;
import java.util.List;

public final class d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4132U = 1;

    /* renamed from: V  reason: collision with root package name */
    public int f4133V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f4134W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f4135X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f4136Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f4137Z;

    public d(int i, AlertDialog alertDialog, Button button, CharSequence charSequence, Handler handler) {
        this.f4134W = alertDialog;
        this.f4135X = button;
        this.f4136Y = charSequence;
        this.f4137Z = handler;
        this.f4133V = i;
    }

    public final void run() {
        switch (this.f4132U) {
            case 0:
                i iVar = (i) this.f4137Z;
                b bVar = (b) this.f4134W;
                try {
                    bVar.getClass();
                    e eVar = bVar.f4128b;
                    if (eVar != null) {
                        int i = this.f4133V;
                        List list = (List) this.f4135X;
                        if (list == null) {
                            list = iVar.f4177t0;
                        }
                        List list2 = (List) this.f4136Y;
                        if (list2 == null) {
                            list2 = iVar.f4177t0;
                        }
                        eVar.b(i, list, list2);
                    }
                    return;
                } finally {
                    iVar.r();
                }
            default:
                if (((AlertDialog) this.f4134W).isShowing()) {
                    StringBuilder sb = new StringBuilder();
                    CharSequence charSequence = (CharSequence) this.f4136Y;
                    sb.append(charSequence);
                    sb.append(" (");
                    sb.append(this.f4133V);
                    sb.append(")");
                    String sb2 = sb.toString();
                    Button button = (Button) this.f4135X;
                    button.setText(sb2);
                    int i8 = this.f4133V;
                    if (i8 == 0) {
                        button.setText(charSequence);
                        button.setEnabled(true);
                        return;
                    }
                    this.f4133V = i8 - 1;
                    ((Handler) this.f4137Z).postDelayed(this, 1000);
                    return;
                }
                return;
        }
    }

    public d(i iVar, b bVar, int i, List list, List list2) {
        this.f4137Z = iVar;
        this.f4134W = bVar;
        this.f4133V = i;
        this.f4135X = list;
        this.f4136Y = list2;
    }
}
