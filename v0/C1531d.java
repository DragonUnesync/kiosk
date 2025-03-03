package v0;

import N.e;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import n2.a;

/* renamed from: v0.d  reason: case insensitive filesystem */
public final class C1531d implements C1530c, C1532e {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15930U = 0;

    /* renamed from: V  reason: collision with root package name */
    public ClipData f15931V;

    /* renamed from: W  reason: collision with root package name */
    public int f15932W;

    /* renamed from: X  reason: collision with root package name */
    public int f15933X;

    /* renamed from: Y  reason: collision with root package name */
    public Uri f15934Y;

    /* renamed from: Z  reason: collision with root package name */
    public Bundle f15935Z;

    public /* synthetic */ C1531d() {
    }

    public void D(int i) {
        this.f15933X = i;
    }

    public ClipData c() {
        return this.f15931V;
    }

    public C1533f d() {
        return new C1533f(new C1531d(this));
    }

    public void i(Bundle bundle) {
        this.f15935Z = bundle;
    }

    public int r() {
        return this.f15933X;
    }

    public ContentInfo t() {
        return null;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        switch (this.f15930U) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f15931V.getDescription());
                sb.append(", source=");
                int i = this.f15932W;
                if (i == 0) {
                    str = "SOURCE_APP";
                } else if (i == 1) {
                    str = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    str = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    str = "SOURCE_DRAG_AND_DROP";
                } else if (i == 4) {
                    str = "SOURCE_AUTOFILL";
                } else if (i != 5) {
                    str = String.valueOf(i);
                } else {
                    str = "SOURCE_PROCESS_TEXT";
                }
                sb.append(str);
                sb.append(", flags=");
                int i8 = this.f15933X;
                if ((i8 & 1) != 0) {
                    str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    str2 = String.valueOf(i8);
                }
                sb.append(str2);
                String str4 = "";
                Uri uri = this.f15934Y;
                if (uri == null) {
                    str3 = str4;
                } else {
                    str3 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str3);
                if (this.f15935Z != null) {
                    str4 = ", hasExtras";
                }
                return e.A(sb, str4, "}");
            default:
                return super.toString();
        }
    }

    public void w(Uri uri) {
        this.f15934Y = uri;
    }

    public int x() {
        return this.f15932W;
    }

    public C1531d(C1531d dVar) {
        ClipData clipData = dVar.f15931V;
        clipData.getClass();
        this.f15931V = clipData;
        int i = dVar.f15932W;
        a.j("source", i, 0, 5);
        this.f15932W = i;
        int i8 = dVar.f15933X;
        if ((i8 & 1) == i8) {
            this.f15933X = i8;
            this.f15934Y = dVar.f15934Y;
            this.f15935Z = dVar.f15935Z;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }
}
