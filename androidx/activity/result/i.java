package androidx.activity.result;

import M0.S;
import P6.f;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new S(11);

    /* renamed from: U  reason: collision with root package name */
    public final IntentSender f7341U;

    /* renamed from: V  reason: collision with root package name */
    public final Intent f7342V;

    /* renamed from: W  reason: collision with root package name */
    public final int f7343W;

    /* renamed from: X  reason: collision with root package name */
    public final int f7344X;

    public i(IntentSender intentSender, Intent intent, int i, int i8) {
        this.f7341U = intentSender;
        this.f7342V = intent;
        this.f7343W = i;
        this.f7344X = i8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        f.e(parcel, "dest");
        parcel.writeParcelable(this.f7341U, i);
        parcel.writeParcelable(this.f7342V, i);
        parcel.writeInt(this.f7343W);
        parcel.writeInt(this.f7344X);
    }
}
