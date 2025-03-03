package G5;

import android.content.Intent;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f1727a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1728b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f1729c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1730d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1731f;

    /* renamed from: g  reason: collision with root package name */
    public final Intent f1732g;

    public t(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f1727a = str;
        this.f1728b = str2;
        this.f1729c = bArr;
        this.f1730d = num;
        this.e = str3;
        this.f1731f = str4;
        this.f1732g = intent;
    }

    public final String toString() {
        int i;
        byte[] bArr = this.f1729c;
        if (bArr == null) {
            i = 0;
        } else {
            i = bArr.length;
        }
        return "Format: " + this.f1728b + "\nContents: " + this.f1727a + "\nRaw bytes: (" + i + " bytes)\nOrientation: " + this.f1730d + "\nEC level: " + this.e + "\nBarcode image: " + this.f1731f + "\nOriginal intent: " + this.f1732g + 10;
    }
}
