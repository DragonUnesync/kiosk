package z0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: z0.d  reason: case insensitive filesystem */
public abstract class C1642d extends C1639a {

    /* renamed from: c0  reason: collision with root package name */
    public int f16413c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f16414d0;

    /* renamed from: e0  reason: collision with root package name */
    public LayoutInflater f16415e0;

    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f16415e0.inflate(this.f16413c0, viewGroup, false);
    }
}
