package Y1;

import C3.C0025a;
import P0.z;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.j0;

/* renamed from: Y1.l  reason: case insensitive filesystem */
public final class C0379l extends j0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f6442a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f6443b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f6444c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f6445d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0379l(r rVar, View view) {
        super(view);
        this.f6445d = rVar;
        if (z.f3748a < 26) {
            view.setFocusable(true);
        }
        this.f6442a = (TextView) view.findViewById(2131362049);
        this.f6443b = (TextView) view.findViewById(2131362071);
        this.f6444c = (ImageView) view.findViewById(2131362047);
        view.setOnClickListener(new C0025a(5, this));
    }
}
