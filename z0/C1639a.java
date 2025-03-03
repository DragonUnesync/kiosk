package z0;

import Q0.g;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import de.ozerov.fully.C0809y3;
import o.D0;
import o.c1;

/* renamed from: z0.a  reason: case insensitive filesystem */
public abstract class C1639a extends BaseAdapter implements Filterable, C1640b {

    /* renamed from: U  reason: collision with root package name */
    public boolean f16404U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f16405V;

    /* renamed from: W  reason: collision with root package name */
    public Cursor f16406W;

    /* renamed from: X  reason: collision with root package name */
    public Context f16407X;

    /* renamed from: Y  reason: collision with root package name */
    public int f16408Y;

    /* renamed from: Z  reason: collision with root package name */
    public C0809y3 f16409Z;

    /* renamed from: a0  reason: collision with root package name */
    public D0 f16410a0;

    /* renamed from: b0  reason: collision with root package name */
    public C1641c f16411b0;

    public void a(Cursor cursor) {
        Cursor g8 = g(cursor);
        if (g8 != null) {
            g8.close();
        }
    }

    public abstract String b(Cursor cursor);

    public Cursor c(CharSequence charSequence) {
        return this.f16406W;
    }

    public abstract void d(View view, Cursor cursor);

    public final void e(Context context, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f16405V = true;
        } else {
            this.f16405V = false;
        }
        this.f16406W = null;
        this.f16404U = false;
        this.f16407X = context;
        this.f16408Y = -1;
        if ((i & 2) == 2) {
            this.f16409Z = new C0809y3(this);
            this.f16410a0 = new D0(1, this);
            return;
        }
        this.f16409Z = null;
        this.f16410a0 = null;
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public Cursor g(Cursor cursor) {
        Cursor cursor2 = this.f16406W;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0809y3 y3Var = this.f16409Z;
            if (y3Var != null) {
                cursor2.unregisterContentObserver(y3Var);
            }
            D0 d02 = this.f16410a0;
            if (d02 != null) {
                cursor2.unregisterDataSetObserver(d02);
            }
        }
        this.f16406W = cursor;
        if (cursor != null) {
            C0809y3 y3Var2 = this.f16409Z;
            if (y3Var2 != null) {
                cursor.registerContentObserver(y3Var2);
            }
            D0 d03 = this.f16410a0;
            if (d03 != null) {
                cursor.registerDataSetObserver(d03);
            }
            this.f16408Y = cursor.getColumnIndexOrThrow("_id");
            this.f16404U = true;
            notifyDataSetChanged();
        } else {
            this.f16408Y = -1;
            this.f16404U = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public final int getCount() {
        Cursor cursor;
        if (!this.f16404U || (cursor = this.f16406W) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f16404U) {
            return null;
        }
        this.f16406W.moveToPosition(i);
        if (view == null) {
            C1642d dVar = (C1642d) this;
            view = dVar.f16415e0.inflate(dVar.f16414d0, viewGroup, false);
        }
        d(view, this.f16406W);
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [z0.c, android.widget.Filter] */
    public final Filter getFilter() {
        if (this.f16411b0 == null) {
            ? filter = new Filter();
            filter.f16412a = this;
            this.f16411b0 = filter;
        }
        return this.f16411b0;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f16404U || (cursor = this.f16406W) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f16406W;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.f16404U || (cursor = this.f16406W) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f16406W.getLong(this.f16408Y);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f16404U) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f16406W.moveToPosition(i)) {
            if (view == null) {
                view = f(this.f16407X, this.f16406W, viewGroup);
            }
            d(view, this.f16406W);
            return view;
        } else {
            throw new IllegalStateException(g.m(i, "couldn't move cursor to position "));
        }
    }

    public boolean hasStableIds() {
        return !(this instanceof c1);
    }
}
