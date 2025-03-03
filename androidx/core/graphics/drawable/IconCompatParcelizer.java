package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import i2.C1096a;
import i2.C1097b;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(C1096a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f7740a = aVar.f(iconCompat.f7740a, 1);
        byte[] bArr = iconCompat.f7742c;
        if (aVar.e(2)) {
            Parcel parcel = ((C1097b) aVar).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f7742c = bArr;
        iconCompat.f7743d = aVar.g(iconCompat.f7743d, 3);
        iconCompat.e = aVar.f(iconCompat.e, 4);
        iconCompat.f7744f = aVar.f(iconCompat.f7744f, 5);
        iconCompat.f7745g = (ColorStateList) aVar.g(iconCompat.f7745g, 6);
        String str = iconCompat.i;
        if (aVar.e(7)) {
            str = ((C1097b) aVar).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f7747j;
        if (aVar.e(8)) {
            str2 = ((C1097b) aVar).e.readString();
        }
        iconCompat.f7747j = str2;
        iconCompat.f7746h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f7740a) {
            case -1:
                Parcelable parcelable = iconCompat.f7743d;
                if (parcelable != null) {
                    iconCompat.f7741b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f7743d;
                if (parcelable2 == null) {
                    byte[] bArr3 = iconCompat.f7742c;
                    iconCompat.f7741b = bArr3;
                    iconCompat.f7740a = 3;
                    iconCompat.e = 0;
                    iconCompat.f7744f = bArr3.length;
                    break;
                } else {
                    iconCompat.f7741b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f7742c, Charset.forName("UTF-16"));
                iconCompat.f7741b = str3;
                if (iconCompat.f7740a == 2 && iconCompat.f7747j == null) {
                    iconCompat.f7747j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f7741b = iconCompat.f7742c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1096a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.f7746h.name();
        switch (iconCompat.f7740a) {
            case -1:
                iconCompat.f7743d = (Parcelable) iconCompat.f7741b;
                break;
            case 1:
            case 5:
                iconCompat.f7743d = (Parcelable) iconCompat.f7741b;
                break;
            case 2:
                iconCompat.f7742c = ((String) iconCompat.f7741b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f7742c = (byte[]) iconCompat.f7741b;
                break;
            case 4:
            case 6:
                iconCompat.f7742c = iconCompat.f7741b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f7740a;
        if (-1 != i) {
            aVar.j(i, 1);
        }
        byte[] bArr = iconCompat.f7742c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((C1097b) aVar).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f7743d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i8 = iconCompat.e;
        if (i8 != 0) {
            aVar.j(i8, 4);
        }
        int i9 = iconCompat.f7744f;
        if (i9 != 0) {
            aVar.j(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f7745g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.i(7);
            ((C1097b) aVar).e.writeString(str);
        }
        String str2 = iconCompat.f7747j;
        if (str2 != null) {
            aVar.i(8);
            ((C1097b) aVar).e.writeString(str2);
        }
    }
}
