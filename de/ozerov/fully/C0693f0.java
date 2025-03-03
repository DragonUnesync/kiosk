package de.ozerov.fully;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.woxthebox.draglistview.R;
import java.util.ArrayList;

/* renamed from: de.ozerov.fully.f0  reason: case insensitive filesystem */
public final class C0693f0 extends BaseAdapter {

    /* renamed from: U  reason: collision with root package name */
    public FullyActivity f10622U;

    /* renamed from: V  reason: collision with root package name */
    public ArrayList f10623V;

    public final int getCount() {
        return this.f10623V.size();
    }

    public final Object getItem(int i) {
        return this.f10623V.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f10622U.getSystemService("layout_inflater")).inflate(2131558464, (ViewGroup) null);
        }
        ArrayList arrayList = this.f10623V;
        ((TextView) view.findViewById(R.id.title)).setText(((J1) arrayList.get(i)).f10021b);
        ((TextView) view.findViewById(2131362526)).setText(((J1) arrayList.get(i)).f10022c);
        ((ImageView) view.findViewById(R.id.icon)).setImageResource(((J1) arrayList.get(i)).f10023d);
        ((J1) arrayList.get(i)).e = view;
        return view;
    }
}
