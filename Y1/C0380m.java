package Y1;

import E2.a;
import M0.Q;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.j0;

/* renamed from: Y1.m  reason: case insensitive filesystem */
public final class C0380m extends F {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f6446a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f6447b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable[] f6448c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f6449d;

    public C0380m(r rVar, String[] strArr, Drawable[] drawableArr) {
        this.f6449d = rVar;
        this.f6446a = strArr;
        this.f6447b = new String[strArr.length];
        this.f6448c = drawableArr;
    }

    public final boolean a(int i) {
        r rVar = this.f6449d;
        Q q7 = rVar.f6496d1;
        if (q7 == null) {
            return false;
        }
        if (i == 0) {
            return ((a) q7).e(13);
        }
        if (i != 1) {
            return true;
        }
        if (!((a) q7).e(30) || !((a) rVar.f6496d1).e(29)) {
            return false;
        }
        return true;
    }

    public final int getItemCount() {
        return this.f6446a.length;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final void onBindViewHolder(j0 j0Var, int i) {
        C0379l lVar = (C0379l) j0Var;
        if (a(i)) {
            lVar.itemView.setLayoutParams(new S(-1, -2));
        } else {
            lVar.itemView.setLayoutParams(new S(0, 0));
        }
        lVar.f6442a.setText(this.f6446a[i]);
        String str = this.f6447b[i];
        TextView textView = lVar.f6443b;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f6448c[i];
        ImageView imageView = lVar.f6444c;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        r rVar = this.f6449d;
        return new C0379l(rVar, LayoutInflater.from(rVar.getContext()).inflate(2131558481, viewGroup, false));
    }
}
