package Y1;

import C3.C0025a;
import M0.Q;
import M0.Y;
import T0.C0232y;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.j0;
import java.util.ArrayList;
import java.util.List;
import k1.C1141j;

/* renamed from: Y1.f  reason: case insensitive filesystem */
public final class C0373f extends F {

    /* renamed from: a  reason: collision with root package name */
    public List f6431a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f6432b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6433c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f6434d;

    public C0373f(r rVar, int i) {
        this.f6433c = i;
        this.f6434d = rVar;
        this.f6432b = rVar;
    }

    private final void e(String str) {
    }

    public boolean a(C1141j jVar) {
        for (int i = 0; i < this.f6431a.size(); i++) {
            if (jVar.f2932q.containsKey(((C0382o) this.f6431a.get(i)).f6452a.f2935b)) {
                return true;
            }
        }
        return false;
    }

    public void b(List list) {
        Drawable drawable;
        String str;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            C0382o oVar = (C0382o) list.get(i);
            if (oVar.f6452a.e[oVar.f6453b]) {
                z = true;
                break;
            }
            i++;
        }
        r rVar = this.f6434d;
        ImageView imageView = rVar.f6525t0;
        if (imageView != null) {
            if (z) {
                drawable = rVar.f6483V0;
            } else {
                drawable = rVar.f6485W0;
            }
            imageView.setImageDrawable(drawable);
            if (z) {
                str = rVar.f6486X0;
            } else {
                str = rVar.f6487Y0;
            }
            rVar.f6525t0.setContentDescription(str);
        }
        this.f6431a = list;
    }

    public void c(C0381n nVar, int i) {
        int i8;
        switch (this.f6433c) {
            case 1:
                d(nVar, i);
                if (i > 0) {
                    C0382o oVar = (C0382o) this.f6431a.get(i - 1);
                    View view = nVar.f6451b;
                    if (oVar.f6452a.e[oVar.f6453b]) {
                        i8 = 0;
                    } else {
                        i8 = 4;
                    }
                    view.setVisibility(i8);
                    return;
                }
                return;
            default:
                d(nVar, i);
                return;
        }
    }

    public final void d(C0381n nVar, int i) {
        int i8;
        Q q7 = this.f6432b.f6496d1;
        if (q7 != null) {
            if (i == 0) {
                switch (this.f6433c) {
                    case 0:
                        nVar.f6450a.setText(2131951763);
                        Q q8 = this.f6434d.f6496d1;
                        q8.getClass();
                        if (a(((C0232y) q8).F())) {
                            i8 = 4;
                        } else {
                            i8 = 0;
                        }
                        nVar.f6451b.setVisibility(i8);
                        nVar.itemView.setOnClickListener(new C0025a(4, this));
                        return;
                    default:
                        nVar.f6450a.setText(2131951764);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 < this.f6431a.size()) {
                                C0382o oVar = (C0382o) this.f6431a.get(i10);
                                if (oVar.f6452a.e[oVar.f6453b]) {
                                    i9 = 4;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        nVar.f6451b.setVisibility(i9);
                        nVar.itemView.setOnClickListener(new C0025a(6, this));
                        return;
                }
            } else {
                boolean z = true;
                C0382o oVar2 = (C0382o) this.f6431a.get(i - 1);
                Y y8 = oVar2.f6452a.f2935b;
                int i11 = 0;
                if (((C0232y) q7).F().f2932q.get(y8) == null || !oVar2.f6452a.e[oVar2.f6453b]) {
                    z = false;
                }
                nVar.f6450a.setText(oVar2.f6454c);
                if (!z) {
                    i11 = 4;
                }
                nVar.f6451b.setVisibility(i11);
                nVar.itemView.setOnClickListener(new p(this, q7, y8, oVar2));
            }
        }
    }

    public final int getItemCount() {
        if (this.f6431a.isEmpty()) {
            return 0;
        }
        return this.f6431a.size() + 1;
    }

    public /* bridge */ /* synthetic */ void onBindViewHolder(j0 j0Var, int i) {
        switch (this.f6433c) {
            case 1:
                c((C0381n) j0Var, i);
                return;
            default:
                c((C0381n) j0Var, i);
                return;
        }
    }

    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C0381n(LayoutInflater.from(this.f6432b.getContext()).inflate(2131558482, viewGroup, false));
    }
}
