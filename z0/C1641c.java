package z0;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: z0.c  reason: case insensitive filesystem */
public final class C1641c extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public C1639a f16412a;

    public final CharSequence convertResultToString(Object obj) {
        return this.f16412a.b((Cursor) obj);
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c8 = this.f16412a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c8 != null) {
            filterResults.count = c8.getCount();
            filterResults.values = c8;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C1639a aVar = this.f16412a;
        Cursor cursor = aVar.f16406W;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            aVar.a((Cursor) obj);
        }
    }
}
