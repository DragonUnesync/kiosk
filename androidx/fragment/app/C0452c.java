package androidx.fragment.app;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c  reason: case insensitive filesystem */
public final class C0452c implements Parcelable {
    public static final Parcelable.Creator<C0452c> CREATOR = new S(13);

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f7987U;

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f7988V;

    public C0452c(Parcel parcel) {
        this.f7987U = parcel.createStringArrayList();
        this.f7988V = parcel.createTypedArrayList(C0451b.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f7987U);
        parcel.writeTypedList(this.f7988V);
    }
}
