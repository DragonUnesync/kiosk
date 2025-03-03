package C3;

import A3.e;
import B0.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class G extends b {
    public static final Parcelable.Creator<G> CREATOR = new e(2);

    /* renamed from: W  reason: collision with root package name */
    public CharSequence f572W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f573X;

    public G(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f572W = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f573X = parcel.readInt() != 1 ? false : true;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f572W + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f572W, parcel, i);
        parcel.writeInt(this.f573X ? 1 : 0);
    }
}
