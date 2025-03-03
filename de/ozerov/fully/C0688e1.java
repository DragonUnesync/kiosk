package de.ozerov.fully;

import Z2.a;
import android.net.Uri;
import android.widget.EditText;
import java.io.File;

/* renamed from: de.ozerov.fully.e1  reason: case insensitive filesystem */
public final /* synthetic */ class C0688e1 implements a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10606U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0694f1 f10607V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ EditText f10608W;

    public /* synthetic */ C0688e1(C0694f1 f1Var, EditText editText, int i) {
        this.f10606U = i;
        this.f10607V = f1Var;
        this.f10608W = editText;
    }

    public final void d(String[] strArr) {
        switch (this.f10606U) {
            case 0:
                C0694f1 f1Var = this.f10607V;
                f1Var.getClass();
                if (strArr.length > 0) {
                    this.f10608W.setText(Uri.fromFile(new File(n2.a.Y0(f1Var.f9850f1, strArr[0]))).toString());
                    return;
                }
                return;
            default:
                C0694f1 f1Var2 = this.f10607V;
                f1Var2.getClass();
                if (strArr.length > 0) {
                    this.f10608W.setText(Uri.fromFile(new File(n2.a.Y0(f1Var2.f9850f1, strArr[0]))).toString());
                    return;
                }
                return;
        }
    }
}
