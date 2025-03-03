package com.google.android.material.datepicker;

import a1.C0410a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.j0;
import java.util.Locale;

public final class y extends F {

    /* renamed from: a  reason: collision with root package name */
    public final k f9351a;

    public y(k kVar) {
        this.f9351a = kVar;
    }

    public final int getItemCount() {
        return this.f9351a.f9293R0.f9273Z;
    }

    public final void onBindViewHolder(j0 j0Var, int i) {
        String str;
        x xVar = (x) j0Var;
        k kVar = this.f9351a;
        int i8 = kVar.f9293R0.f9268U.f9331W + i;
        xVar.f9350a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i8)}));
        TextView textView = xVar.f9350a;
        Context context = textView.getContext();
        if (w.b().get(1) == i8) {
            str = String.format(context.getString(2131951888), new Object[]{Integer.valueOf(i8)});
        } else {
            str = String.format(context.getString(2131951889), new Object[]{Integer.valueOf(i8)});
        }
        textView.setContentDescription(str);
        c cVar = kVar.f9296U0;
        if (w.b().get(1) == i8) {
            C0410a aVar = cVar.f9276b;
        } else {
            C0410a aVar2 = cVar.f9275a;
        }
        throw null;
    }

    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131558543, viewGroup, false));
    }
}
