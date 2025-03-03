package h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: h.c  reason: case insensitive filesystem */
public final class C1015c implements AdapterView.OnItemClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1018f f12163U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1016d f12164V;

    public C1015c(C1016d dVar, C1018f fVar) {
        this.f12164V = dVar;
        this.f12163U = fVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        C1016d dVar = this.f12164V;
        DialogInterface.OnClickListener onClickListener = dVar.f12174l;
        C1018f fVar = this.f12163U;
        onClickListener.onClick(fVar.f12184b, i);
        if (!dVar.f12176n) {
            fVar.f12184b.dismiss();
        }
    }
}
