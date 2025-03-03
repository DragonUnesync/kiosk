package de.ozerov.fully;

import C3.C0025a;
import L0.c;
import N5.f;
import Y2.d;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.recyclerview.widget.C0500k;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.woxthebox.draglistview.DragListView;
import java.util.ArrayList;
import n2.a;

/* renamed from: de.ozerov.fully.q3  reason: case insensitive filesystem */
public class C0762q3 extends E0 {

    /* renamed from: m1  reason: collision with root package name */
    public ArrayList f10898m1;

    /* renamed from: n1  reason: collision with root package name */
    public C0750o3 f10899n1;

    /* renamed from: o1  reason: collision with root package name */
    public DragListView f10900o1;

    /* renamed from: p1  reason: collision with root package name */
    public final f f10901p1 = new f(8, this);

    public final void A() {
        super.A();
        this.f10899n1.f();
        C0726k3.b(this.f9850f1, this.f10898m1);
        c.a(this.f9850f1).d(this.f10901p1);
    }

    public final void H(View view, Bundle bundle) {
        super.H(view, bundle);
        c.a(this.f9850f1).b(this.f10901p1, new IntentFilter("com.fullykiosk.singleapp.event.keyboard_hide"));
    }

    public final String U() {
        return "Schedule Wakeup and Sleep (PLUS)";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [Y2.c, android.content.ContextWrapper] */
    public final void x(Bundle bundle) {
        super.x(bundle);
        R();
        ArrayList a8 = C0726k3.a(this.f9850f1);
        this.f10898m1 = a8;
        if (a8.size() == 0) {
            this.f10898m1.add(new C0726k3());
        }
        FullyActivity fullyActivity = this.f9850f1;
        int i = d.f6575b;
        Toast makeText = Toast.makeText(fullyActivity, "Not every device can wake up on schedule, just try out", 1);
        d.a(makeText.getView(), new ContextWrapper(fullyActivity));
        d dVar = new d(fullyActivity, makeText);
        if (!a.q0() || a.b0(this.f9850f1) < 30) {
            dVar.setGravity(49, 0, 200);
        }
        dVar.show();
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [com.woxthebox.draglistview.DragListView$DragListListener, java.lang.Object] */
    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.y(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(2131558582, viewGroup, false);
        ((Button) inflate.findViewById(2131362436)).setOnClickListener(new C0025a(15, this));
        this.f10900o1 = (DragListView) inflate.findViewById(2131362437);
        this.f10899n1 = new C0750o3(this.f9850f1, this.f10898m1);
        this.f10900o1.getRecyclerView().setVerticalScrollBarEnabled(true);
        this.f10900o1.setAdapter(this.f10899n1, true);
        this.f10900o1.setLayoutManager(new LinearLayoutManager(1));
        this.f10900o1.getRecyclerView().addItemDecoration(new C0500k(this.f10900o1.getRecyclerView().getContext(), new LinearLayoutManager(1).f8283j0));
        this.f10900o1.setDragListListener(new Object());
        return inflate;
    }
}
