package a3;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import b3.C0528a;
import b3.C0529b;
import b3.C0530c;
import d3.C0633a;
import d3.g;
import de.ozerov.fully.C0679c4;
import de.ozerov.fully.TextPref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: a3.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0415a implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7168U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f7169V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f7170W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f7171X;

    public /* synthetic */ C0415a(Object obj, Object obj2, Object obj3, int i) {
        this.f7168U = i;
        this.f7169V = obj;
        this.f7170W = obj2;
        this.f7171X = obj3;
    }

    public final void onClick(View view) {
        int i;
        int i8;
        Object obj = this.f7171X;
        Object obj2 = this.f7170W;
        Object obj3 = this.f7169V;
        switch (this.f7168U) {
            case 0:
                C0417c cVar = (C0417c) obj3;
                cVar.getClass();
                C0529b bVar = (C0529b) obj;
                if (!((C0416b) obj2).f7175d.isChecked()) {
                    C0530c.f8663a.remove(bVar.f8660V);
                } else if (cVar.f7178W.f8653a == 1) {
                    C0530c.f8663a.put(bVar.f8660V, bVar);
                } else {
                    HashMap hashMap = C0530c.f8663a;
                    HashMap hashMap2 = new HashMap();
                    C0530c.f8663a = hashMap2;
                    hashMap2.put(bVar.f8660V, bVar);
                }
                g gVar = (g) cVar.f7179X.f7669V;
                String str = gVar.f9745h0;
                Context context = gVar.f9732U;
                if (str == null) {
                    str = context.getResources().getString(2131951670);
                }
                gVar.f9745h0 = str;
                int size = C0530c.f8663a.size();
                if (size == 0) {
                    gVar.f9743f0.setEnabled(false);
                    if (Build.VERSION.SDK_INT >= 23) {
                        i8 = context.getResources().getColor(2131099695, context.getTheme());
                    } else {
                        i8 = context.getResources().getColor(2131099695);
                    }
                    gVar.f9743f0.setTextColor(Color.argb(128, Color.red(i8), Color.green(i8), Color.blue(i8)));
                    gVar.f9743f0.setText(gVar.f9745h0);
                } else {
                    gVar.f9743f0.setEnabled(true);
                    if (Build.VERSION.SDK_INT >= 23) {
                        i = context.getResources().getColor(2131099695, context.getTheme());
                    } else {
                        i = context.getResources().getColor(2131099695);
                    }
                    gVar.f9743f0.setTextColor(i);
                    gVar.f9743f0.setText(gVar.f9745h0 + " (" + size + ") ");
                }
                if (gVar.f9738a0.f8653a == 0) {
                    gVar.f9742e0.notifyDataSetChanged();
                    return;
                }
                return;
            case 1:
                g gVar2 = (g) obj3;
                gVar2.getClass();
                PopupMenu popupMenu = new PopupMenu(gVar2.f9732U, (Button) obj2);
                ArrayList arrayList = (ArrayList) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Y2.g gVar3 = (Y2.g) it.next();
                    int indexOf = arrayList.indexOf(gVar3);
                    popupMenu.getMenu().add(0, indexOf, indexOf, gVar3.f6583a);
                }
                popupMenu.setOnMenuItemClickListener(new C0633a(gVar2, arrayList));
                popupMenu.show();
                return;
            case 2:
                int i9 = TextPref.f10366Z;
                TextPref textPref = (TextPref) obj3;
                textPref.getClass();
                C0528a aVar = new C0528a();
                aVar.f8653a = 0;
                aVar.f8655c = 0;
                String str2 = textPref.f10369W;
                if (str2 != null && !str2.isEmpty()) {
                    aVar.f8658g = str2.split(",");
                }
                g gVar4 = new g(textPref.f10371Y, aVar);
                gVar4.setTitle("Pick a file");
                gVar4.f9739b0 = new C0679c4(textPref, (EditText) obj2, 2);
                gVar4.f9749l0 = ((Dialog) obj).getWindow();
                gVar4.show();
                return;
            default:
                int i10 = TextPref.f10366Z;
                TextPref textPref2 = (TextPref) obj3;
                textPref2.getClass();
                EditText editText = (EditText) obj2;
                int inputType = editText.getInputType();
                if ((1 & inputType) != 0) {
                    if ((inputType & 4080) == 128) {
                        editText.setInputType(145);
                    } else {
                        editText.setInputType(129);
                    }
                }
                if ((inputType & 2) != 0) {
                    if ((inputType & 16) == 0) {
                        editText.setInputType(18);
                    } else {
                        editText.setInputType(2);
                    }
                }
                editText.setSelection(editText.length());
                Button button = (Button) obj;
                if (button.getText().equals(textPref2.f10371Y.getResources().getString(2131951657))) {
                    button.setText(2131951656);
                    return;
                } else {
                    button.setText(2131951657);
                    return;
                }
        }
    }
}
