package androidx.activity.result;

import M0.S;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new S(10);

    /* renamed from: U  reason: collision with root package name */
    public final int f7324U;

    /* renamed from: V  reason: collision with root package name */
    public final Intent f7325V;

    public a(int i, Intent intent) {
        this.f7324U = i;
        this.f7325V = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f7324U;
        if (i == -1) {
            str = "RESULT_OK";
        } else if (i != 0) {
            str = String.valueOf(i);
        } else {
            str = "RESULT_CANCELED";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f7325V);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i8;
        parcel.writeInt(this.f7324U);
        Intent intent = this.f7325V;
        if (intent == null) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        parcel.writeInt(i8);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public a(Parcel parcel) {
        this.f7324U = parcel.readInt();
        this.f7325V = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
