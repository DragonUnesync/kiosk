package de.ozerov.fully;

import A3.b;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import n2.a;

public class E extends D0 implements TextView.OnEditorActionListener {

    /* renamed from: l1  reason: collision with root package name */
    public D f9862l1;

    /* renamed from: m1  reason: collision with root package name */
    public C f9863m1;

    /* renamed from: n1  reason: collision with root package name */
    public b f9864n1;

    /* renamed from: o1  reason: collision with root package name */
    public String f9865o1 = "";

    /* renamed from: p1  reason: collision with root package name */
    public String f9866p1 = null;

    /* renamed from: q1  reason: collision with root package name */
    public String f9867q1 = "OK";

    /* renamed from: r1  reason: collision with root package name */
    public String f9868r1 = null;
    public String s1 = null;
    public int t1 = 0;

    /* renamed from: u1  reason: collision with root package name */
    public int f9869u1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    public float f9870v1 = 0.0f;
    public AlertDialog w1;

    /* renamed from: x1  reason: collision with root package name */
    public EditText f9871x1;

    /* renamed from: y1  reason: collision with root package name */
    public boolean f9872y1 = true;

    /* renamed from: z1  reason: collision with root package name */
    public boolean f9873z1 = true;

    public void D() {
        if (this.f9870v1 != 0.0f) {
            WindowManager.LayoutParams attributes = this.f8029a1.getWindow().getAttributes();
            float f8 = this.f9870v1;
            if (f8 != 0.0f) {
                attributes.width = a.p(f8, this.f9851g1);
            }
            this.f8029a1.getWindow().setAttributes(attributes);
        }
        this.f8088y0 = true;
    }

    public Dialog P(Bundle bundle) {
        int i;
        View U8 = U();
        if (U8 != null) {
            if (!this.f9872y1 && !P.y(this.f9851g1)) {
                U8.setFocusable(true);
                U8.setFocusableInTouchMode(true);
            }
            if (this.f9872y1 && (i = this.f9869u1) != 0) {
                U8.findViewById(i).requestFocus();
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f9851g1);
        builder.setTitle(this.f9865o1);
        String str = this.f9866p1;
        if (str != null) {
            builder.setMessage(str);
        }
        if (U8 != null) {
            builder.setView(U8);
        }
        builder.setCancelable(false);
        builder.setPositiveButton(this.f9867q1, new B(this, 0));
        String str2 = this.f9868r1;
        if (str2 != null) {
            builder.setNegativeButton(str2, new B(this, 1));
        }
        String str3 = this.s1;
        if (str3 != null) {
            builder.setNeutralButton(str3, new B(this, 2));
        }
        AlertDialog create = builder.create();
        this.w1 = create;
        if (this.f9872y1) {
            create.getWindow().setSoftInputMode(53);
        }
        this.w1.setCanceledOnTouchOutside(this.f9873z1);
        H(U8, (Bundle) null);
        return this.w1;
    }

    public void S() {
        AlertDialog alertDialog = this.w1;
        if (alertDialog != null) {
            alertDialog.setButton(-1, "", (DialogInterface.OnClickListener) null);
            this.w1.setButton(-3, "", (DialogInterface.OnClickListener) null);
            this.w1.setButton(-2, "", (DialogInterface.OnClickListener) null);
            this.w1 = null;
            EditText editText = this.f9871x1;
            if (editText != null) {
                editText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
                this.f9871x1 = null;
            }
        }
        super.S();
    }

    public View U() {
        LinearLayout linearLayout = (LinearLayout) this.f9851g1.getLayoutInflater().inflate(this.t1, (ViewGroup) null);
        if (linearLayout != null) {
            EditText editText = (EditText) linearLayout.findViewById(this.f9869u1);
            this.f9871x1 = editText;
            if (editText != null) {
                editText.setOnEditorActionListener(this);
                return linearLayout;
            }
            throw new IllegalStateException("Field not found for id=" + this.f9869u1);
        }
        throw new IllegalStateException("Layout not found for id=" + this.t1);
    }

    public void V() {
        if (this.f9862l1 != null) {
            EditText editText = this.f9871x1;
            if (editText == null) {
                throw new IllegalStateException("Field not found in " + this.f9849e1 + " for id=" + this.f9869u1);
            } else if (editText.getText() != null) {
                this.f9862l1.i(this.f9871x1.getText().toString());
            } else {
                this.f9862l1.i("");
            }
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C c8 = this.f9863m1;
        if (c8 != null) {
            c8.c();
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (2 != i || this.w1 == null) {
            return false;
        }
        if (textView instanceof EditText) {
            V();
        }
        S();
        return true;
    }
}
