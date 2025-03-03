package de.ozerov.fully;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

/* renamed from: de.ozerov.fully.f1  reason: case insensitive filesystem */
public class C0694f1 extends E {

    /* renamed from: A1  reason: collision with root package name */
    public C0664a1 f10624A1;

    public final View U() {
        View view;
        if (this.f10624A1.f10543a != null) {
            view = this.f9850f1.getLayoutInflater().inflate(2131558467, (ViewGroup) null);
        } else {
            view = this.f9850f1.getLayoutInflater().inflate(2131558468, (ViewGroup) null);
        }
        if (view != null) {
            EditText editText = (EditText) view.findViewById(2131362607);
            String str = this.f10624A1.f10544b;
            if (!(str == null || editText == null)) {
                editText.setText(str);
            }
            EditText editText2 = (EditText) view.findViewById(2131361881);
            String str2 = this.f10624A1.f10543a;
            if (!(str2 == null || editText2 == null)) {
                editText2.setText(str2);
            }
            EditText editText3 = (EditText) view.findViewById(2131362581);
            String str3 = this.f10624A1.f10545c;
            if (!(str3 == null || editText3 == null)) {
                editText3.setText(str3);
            }
            EditText editText4 = (EditText) view.findViewById(2131362150);
            String str4 = this.f10624A1.f10546d;
            if (!(str4 == null || editText4 == null)) {
                editText4.setText(str4);
            }
            ImageView imageView = (ImageView) view.findViewById(2131362152);
            if (!(imageView == null || editText4 == null)) {
                imageView.setOnClickListener(new C0682d1(this, editText4, 0));
            }
            ImageView imageView2 = (ImageView) view.findViewById(2131362609);
            if (!(imageView2 == null || editText == null)) {
                imageView2.setOnClickListener(new C0682d1(this, editText, 1));
            }
            return view;
        }
        throw new IllegalStateException("Can't get custom layout for LauncherItemEditDialog");
    }

    public final void V() {
        if (this.f9862l1 != null) {
            EditText editText = (EditText) this.f9852h1.findViewById(2131362581);
            if (editText.getText() != null && !editText.getText().toString().isEmpty()) {
                this.f10624A1.f10545c = editText.getText().toString();
            }
            if (this.f10624A1.f10543a != null) {
                EditText editText2 = (EditText) this.f9852h1.findViewById(2131361881);
                if (editText2.getText() != null && !editText2.getText().toString().isEmpty()) {
                    this.f10624A1.f10543a = editText2.getText().toString();
                }
            } else {
                EditText editText3 = (EditText) this.f9852h1.findViewById(2131362607);
                if (editText3.getText() != null && !editText3.getText().toString().isEmpty()) {
                    this.f10624A1.f10544b = editText3.getText().toString();
                }
            }
            EditText editText4 = (EditText) this.f9852h1.findViewById(2131362150);
            if (editText4.getText() != null) {
                if (!editText4.getText().toString().isEmpty()) {
                    this.f10624A1.f10546d = editText4.getText().toString();
                    this.f10624A1.e = null;
                } else {
                    C0664a1 a1Var = this.f10624A1;
                    a1Var.f10546d = null;
                    C0664a1.b(a1Var, this.f9850f1);
                }
            }
            this.f9862l1.i((String) null);
        }
    }
}
