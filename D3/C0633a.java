package d3;

import Y2.g;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupMenu;
import b3.C0528a;
import java.io.File;
import java.util.ArrayList;
import n2.a;

/* renamed from: d3.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0633a implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9718a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f9719b;

    public /* synthetic */ C0633a(g gVar, ArrayList arrayList) {
        this.f9718a = gVar;
        this.f9719b = arrayList;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        g gVar;
        ArrayList arrayList = this.f9719b;
        g gVar2 = this.f9718a;
        gVar2.getClass();
        try {
            gVar = (g) arrayList.get(menuItem.getItemId());
        } catch (IndexOutOfBoundsException unused) {
            Log.e("g", "Wrong item ID");
            gVar = null;
        }
        if (gVar != null) {
            C0528a aVar = gVar2.f9738a0;
            File file = gVar.f6584b;
            aVar.f8656d = file;
            gVar2.f9734W.setText(file.getName());
            gVar2.f9744g0 = gVar.f6583a;
            gVar2.b();
            gVar2.f9735X.setText(file.getAbsolutePath());
            gVar2.a(file, (Runnable) null);
            return true;
        }
        a.b1(gVar2.f9732U, gVar2.getContext().getString(2131951715));
        return true;
    }
}
