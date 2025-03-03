package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import i2.C1096a;
import i2.C1097b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1096a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f7728a;
        boolean z = true;
        if (aVar.e(1)) {
            obj = aVar.h();
        }
        remoteActionCompat.f7728a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f7729b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1097b) aVar).e);
        }
        remoteActionCompat.f7729b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f7730c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1097b) aVar).e);
        }
        remoteActionCompat.f7730c = charSequence2;
        remoteActionCompat.f7731d = (PendingIntent) aVar.g(remoteActionCompat.f7731d, 4);
        boolean z6 = remoteActionCompat.e;
        if (aVar.e(5)) {
            if (((C1097b) aVar).e.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        remoteActionCompat.e = z6;
        boolean z8 = remoteActionCompat.f7732f;
        if (aVar.e(6)) {
            if (((C1097b) aVar).e.readInt() == 0) {
                z = false;
            }
            z8 = z;
        }
        remoteActionCompat.f7732f = z8;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1096a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f7728a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f7729b;
        aVar.i(2);
        Parcel parcel = ((C1097b) aVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f7730c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f7731d, 4);
        boolean z = remoteActionCompat.e;
        aVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z6 = remoteActionCompat.f7732f;
        aVar.i(6);
        parcel.writeInt(z6 ? 1 : 0);
    }
}
