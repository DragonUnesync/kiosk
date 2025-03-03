package n3;

import M0.S;
import N.e;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new S(29);

    /* renamed from: U  reason: collision with root package name */
    public int f13760U;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f13760U;
        if (i == 1) {
            str = "checked";
        } else if (i != 2) {
            str = "unchecked";
        } else {
            str = "indeterminate";
        }
        return e.A(sb, str, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f13760U));
    }
}
