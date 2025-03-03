package de.ozerov.fully;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.C0500k;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.woxthebox.draglistview.DragListView;
import java.util.ArrayList;
import n2.a;

public class V2 extends E0 {

    /* renamed from: r1  reason: collision with root package name */
    public static final /* synthetic */ int f10437r1 = 0;

    /* renamed from: m1  reason: collision with root package name */
    public ArrayList f10438m1;

    /* renamed from: n1  reason: collision with root package name */
    public Q2 f10439n1;

    /* renamed from: o1  reason: collision with root package name */
    public DragListView f10440o1;

    /* renamed from: p1  reason: collision with root package name */
    public String f10441p1;

    /* renamed from: q1  reason: collision with root package name */
    public String f10442q1;

    public final void D() {
        this.f8088y0 = true;
        C0794w0.A0(this.f9850f1, true, true);
        this.f8029a1.getWindow().setNavigationBarColor(-16777216);
        this.f8029a1.getWindow().setStatusBarColor(-16777216);
    }

    public final void H(View view, Bundle bundle) {
        super.H(view, bundle);
        view.findViewById(2131361870).requestFocus();
    }

    public final String U() {
        return "Items on Playlist";
    }

    public final void V(O2 o2) {
        this.f10438m1.add(o2);
        this.f10439n1.notifyDataSetChanged();
        O2.c(this.f9850f1, this.f10441p1, this.f10438m1);
        this.f10440o1.getRecyclerView().scrollToPosition(this.f10438m1.size() - 1);
    }

    public final void x(Bundle bundle) {
        super.x(bundle);
        R();
        this.f10438m1 = O2.b(this.f9850f1, this.f10441p1);
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.y(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(2131558578, viewGroup, false);
        ((Button) inflate.findViewById(2131361869)).setOnClickListener(new S2(this, 0));
        ((Button) inflate.findViewById(2131361868)).setOnClickListener(new S2(this, 1));
        ((Button) inflate.findViewById(2131361870)).setOnClickListener(new S2(this, 2));
        Button button = (Button) inflate.findViewById(2131361871);
        if (a.Q0(P.t(this.f9850f1)) < 67) {
            button.setVisibility(8);
        } else {
            button.setOnClickListener(new S2(this, 3));
        }
        this.f10440o1 = (DragListView) inflate.findViewById(2131362470);
        this.f10439n1 = new Q2(this.f9850f1, this.f10441p1, this.f10438m1);
        this.f10440o1.getRecyclerView().setVerticalScrollBarEnabled(true);
        this.f10440o1.setAdapter(this.f10439n1, true);
        this.f10440o1.setLayoutManager(new LinearLayoutManager(1));
        this.f10440o1.getRecyclerView().addItemDecoration(new C0500k(this.f10440o1.getRecyclerView().getContext(), new LinearLayoutManager(1).f8283j0));
        this.f10440o1.setDragListListener(new U2(this));
        if (this.f10442q1 != null) {
            ((TextView) inflate.findViewById(2131362471)).setText(this.f10442q1);
        }
        return inflate;
    }
}
