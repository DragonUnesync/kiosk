package de.ozerov.fully;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: de.ozerov.fully.w  reason: case insensitive filesystem */
public final class C0793w extends ArrayAdapter {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0686e f11016U;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0793w(C0686e eVar, Context context, ArrayList arrayList) {
        super(context, 2131558436, arrayList);
        this.f11016U = eVar;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0686e eVar = this.f11016U;
        if (view == null) {
            view = ((C0805y) eVar.f10605b).f9850f1.getLayoutInflater().inflate(2131558436, (ViewGroup) null);
        }
        T t8 = (T) ((C0805y) eVar.f10605b).f11108v1.get(i);
        ((ImageView) view.findViewById(2131362169)).setImageDrawable(t8.e);
        ((TextView) view.findViewById(2131362181)).setText(t8.f10348a);
        TextView textView = (TextView) view.findViewById(2131362180);
        textView.setText(C0794w0.L(t8.f10349b));
        textView.setSelected(true);
        CheckBox checkBox = (CheckBox) view.findViewById(2131362174);
        checkBox.setChecked(t8.f10352f);
        checkBox.setOnClickListener(new C0787v(this, t8, checkBox, i));
        return view;
    }
}
