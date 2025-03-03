package z0;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: z0.e  reason: case insensitive filesystem */
public final class C1643e extends C1642d {

    /* renamed from: f0  reason: collision with root package name */
    public int[] f16416f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int[] f16417g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f16418h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public final String[] f16419i0;

    public C1643e(Activity activity, int i, String[] strArr, int[] iArr) {
        e(activity, 2);
        this.f16414d0 = i;
        this.f16413c0 = i;
        this.f16415e0 = (LayoutInflater) activity.getSystemService("layout_inflater");
        this.f16417g0 = iArr;
        this.f16419i0 = strArr;
        this.f16416f0 = null;
    }

    public final String b(Cursor cursor) {
        int i = this.f16418h0;
        if (i > -1) {
            return cursor.getString(i);
        }
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public final void d(View view, Cursor cursor) {
        int[] iArr = this.f16417g0;
        int length = iArr.length;
        int[] iArr2 = this.f16416f0;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                String string = cursor.getString(iArr2[i]);
                if (string == null) {
                    string = "";
                }
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(string);
                } else if (findViewById instanceof ImageView) {
                    ImageView imageView = (ImageView) findViewById;
                    try {
                        imageView.setImageResource(Integer.parseInt(string));
                    } catch (NumberFormatException unused) {
                        imageView.setImageURI(Uri.parse(string));
                    }
                } else {
                    throw new IllegalStateException(findViewById.getClass().getName().concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                }
            }
        }
    }

    public final Cursor g(Cursor cursor) {
        String[] strArr = this.f16419i0;
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.f16416f0;
            if (iArr == null || iArr.length != length) {
                this.f16416f0 = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f16416f0[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
        } else {
            this.f16416f0 = null;
        }
        return super.g(cursor);
    }
}
