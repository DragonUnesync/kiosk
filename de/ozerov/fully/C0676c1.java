package de.ozerov.fully;

import A3.b;
import U0.c;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.j0;
import com.bumptech.glide.m;
import com.woxthebox.draglistview.DragItemAdapter;
import java.util.ArrayList;
import n2.a;

/* renamed from: de.ozerov.fully.c1  reason: case insensitive filesystem */
public final class C0676c1 extends DragItemAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final int f10575a = 2131558499;

    /* renamed from: b  reason: collision with root package name */
    public final int f10576b = 2131362172;

    /* renamed from: c  reason: collision with root package name */
    public final FullyActivity f10577c;

    public C0676c1(FullyActivity fullyActivity, ArrayList arrayList) {
        this.f10577c = fullyActivity;
        setItemList(arrayList);
    }

    public static /* synthetic */ void a(C0676c1 c1Var, int i) {
        if (i < 0) {
            c1Var.getClass();
        } else if (c1Var.mItemList.size() > i) {
            c1Var.mItemList.remove(i);
            c1Var.notifyDataSetChanged();
            C0664a1.d(c1Var.f10577c, c1Var.mItemList);
        }
    }

    public static /* synthetic */ void b(C0676c1 c1Var) {
        c1Var.notifyDataSetChanged();
        C0664a1.d(c1Var.f10577c, c1Var.mItemList);
    }

    public static void c(C0676c1 c1Var, C0670b1 b1Var) {
        C0664a1 a1Var;
        c1Var.getClass();
        int adapterPosition = b1Var.getAdapterPosition();
        if (adapterPosition >= 0 && c1Var.mItemList.size() > adapterPosition && (a1Var = (C0664a1) c1Var.mItemList.get(adapterPosition)) != null) {
            C0694f1 f1Var = new C0694f1();
            f1Var.f9865o1 = "Edit launcher item";
            f1Var.f9868r1 = "Cancel";
            f1Var.f9867q1 = "Save";
            f1Var.Q();
            f1Var.f10624A1 = a1Var;
            f1Var.s1 = "Delete";
            f1Var.f9872y1 = false;
            f1Var.f9863m1 = new c(14);
            f1Var.f9864n1 = new b(adapterPosition, 3, c1Var);
            f1Var.f9862l1 = new androidx.camera.lifecycle.c(6, c1Var);
            f1Var.T(c1Var.f10577c.l(), "LauncherItemEditDialog");
        }
    }

    /* renamed from: d */
    public final void onBindViewHolder(C0670b1 b1Var, int i) {
        super.onBindViewHolder(b1Var, i);
        Drawable drawable = ((C0664a1) this.mItemList.get(i)).e;
        FullyActivity fullyActivity = this.f10577c;
        if (drawable != null) {
            A0 Q02 = C0794w0.Q0(fullyActivity);
            ImageView imageView = b1Var.f10558a;
            Q02.getClass();
            Q02.n(new m(imageView));
            b1Var.f10558a.setImageDrawable(((C0664a1) this.mItemList.get(i)).e);
        } else if (((C0664a1) this.mItemList.get(i)).f10546d == null || ((C0664a1) this.mItemList.get(i)).f10546d.isEmpty()) {
            A0 Q03 = C0794w0.Q0(fullyActivity);
            ImageView imageView2 = b1Var.f10558a;
            Q03.getClass();
            Q03.n(new m(imageView2));
            b1Var.f10558a.setImageResource(2131230966);
        } else {
            ((C0812z0) ((C0812z0) C0794w0.Q0(fullyActivity).l(Drawable.class)).G(a.m0(a.F(fullyActivity, ((C0664a1) this.mItemList.get(i)).f10546d)))).p(P.m(fullyActivity)).g().D(b1Var.f10558a);
        }
        b1Var.f10559b.setText(((C0664a1) this.mItemList.get(i)).f10545c);
        String str = ((C0664a1) this.mItemList.get(i)).f10543a;
        TextView textView = b1Var.f10560c;
        if (str != null) {
            textView.setText(C0794w0.L(((C0664a1) this.mItemList.get(i)).f10543a));
        } else if (((C0664a1) this.mItemList.get(i)).f10544b != null) {
            textView.setText(((C0664a1) this.mItemList.get(i)).f10544b);
        } else {
            textView.setText("");
        }
        textView.setSelected(true);
        int i8 = ((C0664a1) this.mItemList.get(i)).f10547f;
        TextView textView2 = b1Var.f10559b;
        if (i8 != 1) {
            if (((C0664a1) this.mItemList.get(i)).f10543a != null) {
                textView2.append(" (NOT FOUND)");
            }
            textView2.setTextColor(fullyActivity.getResources().getColor(17170455));
        } else {
            textView2.append("");
            textView2.setTextColor(fullyActivity.getResources().getColor(17170444));
        }
        b1Var.f10561d.setOnClickListener(new B3.m(this, 2, b1Var));
        b1Var.itemView.setTag(this.mItemList.get(i));
    }

    public final long getUniqueItemId(int i) {
        return (long) ((C0664a1) this.mItemList.get(i)).hashCode();
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [com.woxthebox.draglistview.DragItemAdapter$ViewHolder, androidx.recyclerview.widget.j0, de.ozerov.fully.b1] */
    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f10575a, viewGroup, false);
        ? viewHolder = new DragItemAdapter.ViewHolder(inflate, this.f10576b, false);
        viewHolder.f10558a = (ImageView) inflate.findViewById(2131362169);
        viewHolder.f10559b = (TextView) inflate.findViewById(2131362181);
        viewHolder.f10560c = (TextView) inflate.findViewById(2131362180);
        viewHolder.f10561d = (ImageView) inflate.findViewById(2131362171);
        return viewHolder;
    }
}
