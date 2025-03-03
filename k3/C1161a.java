package k3;

import A3.e;
import B0.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: k3.a  reason: case insensitive filesystem */
public final class C1161a extends b {
    public static final Parcelable.Creator<C1161a> CREATOR = new e(5);

    /* renamed from: W  reason: collision with root package name */
    public final int f13027W;

    /* renamed from: X  reason: collision with root package name */
    public final int f13028X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f13029Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f13030Z;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f13031a0;

    public C1161a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13027W = parcel.readInt();
        this.f13028X = parcel.readInt();
        boolean z = false;
        this.f13029Y = parcel.readInt() == 1;
        this.f13030Z = parcel.readInt() == 1;
        this.f13031a0 = parcel.readInt() == 1 ? true : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f13027W);
        parcel.writeInt(this.f13028X);
        parcel.writeInt(this.f13029Y ? 1 : 0);
        parcel.writeInt(this.f13030Z ? 1 : 0);
        parcel.writeInt(this.f13031a0 ? 1 : 0);
    }

    public C1161a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f13027W = bottomSheetBehavior.f9174L;
        this.f13028X = bottomSheetBehavior.e;
        this.f13029Y = bottomSheetBehavior.f9191b;
        this.f13030Z = bottomSheetBehavior.f9171I;
        this.f13031a0 = bottomSheetBehavior.f9172J;
    }
}
