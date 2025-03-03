package de.ozerov.fully;

import Z2.a;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.EditText;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: de.ozerov.fully.c4  reason: case insensitive filesystem */
public final /* synthetic */ class C0679c4 implements C0799x, a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10583U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ TextPref f10584V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ EditText f10585W;

    public /* synthetic */ C0679c4(TextPref textPref, EditText editText, int i) {
        this.f10583U = i;
        this.f10584V = textPref;
        this.f10585W = editText;
    }

    public void d(String[] strArr) {
        int i = TextPref.f10366Z;
        TextPref textPref = this.f10584V;
        textPref.getClass();
        if (strArr.length > 0) {
            this.f10585W.setText(Uri.fromFile(new File(n2.a.Y0(textPref.f10371Y, strArr[0]))).toString());
        }
    }

    public void k(ArrayList arrayList) {
        EditText editText = this.f10585W;
        TextPref textPref = this.f10584V;
        switch (this.f10583U) {
            case 0:
                int i = TextPref.f10366Z;
                textPref.getClass();
                if (arrayList.size() == 1) {
                    Intent intent = new Intent();
                    intent.setComponent(C0794w0.p(textPref.f10371Y, ((T) arrayList.get(0)).f10349b));
                    editText.setText(n2.a.o0(intent));
                    return;
                }
                return;
            default:
                int i8 = TextPref.f10366Z;
                textPref.getClass();
                ArrayList a8 = TextPref.a(editText.getText().toString(), true, false);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String L8 = C0794w0.L(((T) it.next()).f10349b);
                    if (!a8.contains(L8)) {
                        a8.add(L8);
                    }
                }
                editText.setText(TextUtils.join("\n", a8));
                return;
        }
    }
}
