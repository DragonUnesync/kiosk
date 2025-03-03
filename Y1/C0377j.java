package Y1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.j0;

/* renamed from: Y1.j  reason: case insensitive filesystem */
public final class C0377j extends F {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f6438a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f6439b;

    /* renamed from: c  reason: collision with root package name */
    public int f6440c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f6441d;

    public C0377j(r rVar, String[] strArr, float[] fArr) {
        this.f6441d = rVar;
        this.f6438a = strArr;
        this.f6439b = fArr;
    }

    public final int getItemCount() {
        return this.f6438a.length;
    }

    public final void onBindViewHolder(j0 j0Var, int i) {
        C0381n nVar = (C0381n) j0Var;
        String[] strArr = this.f6438a;
        if (i < strArr.length) {
            nVar.f6450a.setText(strArr[i]);
        }
        if (i == this.f6440c) {
            nVar.itemView.setSelected(true);
            nVar.f6451b.setVisibility(0);
        } else {
            nVar.itemView.setSelected(false);
            nVar.f6451b.setVisibility(4);
        }
        nVar.itemView.setOnClickListener(new C0376i(this, i));
    }

    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C0381n(LayoutInflater.from(this.f6441d.getContext()).inflate(2131558482, viewGroup, false));
    }
}
