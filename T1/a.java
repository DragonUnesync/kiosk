package T1;

import H3.M;
import H3.O;
import H3.i0;
import M1.d;
import M1.k;
import M1.l;
import N.e;
import O0.b;
import P0.c;
import P0.r;
import P0.z;
import Q0.g;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.altbeacon.bluetooth.Pdu;

public final class a implements l {

    /* renamed from: U  reason: collision with root package name */
    public final r f4973U = new r();

    /* renamed from: V  reason: collision with root package name */
    public final boolean f4974V;

    /* renamed from: W  reason: collision with root package name */
    public final int f4975W;

    /* renamed from: X  reason: collision with root package name */
    public final int f4976X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f4977Y;

    /* renamed from: Z  reason: collision with root package name */
    public final float f4978Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f4979a0;

    public a(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f4975W = bArr[24];
            this.f4976X = ((bArr[26] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24) | ((bArr[27] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[28] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (bArr[29] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
            this.f4977Y = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f4979a0 = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.f4974V = z;
            if (z) {
                this.f4978Z = z.h(((float) ((bArr[11] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[10] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8))) / ((float) i), 0.0f, 0.95f);
            } else {
                this.f4978Z = 0.85f;
            }
        } else {
            this.f4975W = 0;
            this.f4976X = -1;
            this.f4977Y = str;
            this.f4974V = false;
            this.f4978Z = 0.85f;
            this.f4979a0 = -1;
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i8, int i9, int i10, int i11) {
        if (i != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i, int i8, int i9, int i10, int i11) {
        boolean z;
        boolean z6;
        if (i != i8) {
            int i12 = i11 | 33;
            boolean z8 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z) {
                if (z6) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                }
            } else if (z6) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
            }
            if ((i & 4) == 0) {
                z8 = false;
            }
            if (z8) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            }
            if (!z8 && !z && !z6) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
            }
        }
    }

    public final void D(byte[] bArr, int i, int i8, k kVar, c cVar) {
        boolean z;
        String str;
        boolean z6;
        boolean z8;
        boolean z9;
        int i9 = i;
        c cVar2 = cVar;
        int i10 = 1;
        r rVar = this.f4973U;
        rVar.F(i9 + i8, bArr);
        rVar.H(i9);
        int i11 = 2;
        if (rVar.a() >= 2) {
            z = true;
        } else {
            z = false;
        }
        P0.l.d(z);
        int B8 = rVar.B();
        if (B8 == 0) {
            str = "";
        } else {
            int i12 = rVar.f3733b;
            Charset D8 = rVar.D();
            int i13 = B8 - (rVar.f3733b - i12);
            if (D8 == null) {
                D8 = StandardCharsets.UTF_8;
            }
            str = rVar.t(i13, D8);
        }
        if (str.isEmpty()) {
            M m8 = O.f2026V;
            cVar2.accept(new M1.a(i0.f2073Y, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        c(spannableStringBuilder2, this.f4975W, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder2, this.f4976X, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str2 = this.f4977Y;
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f8 = this.f4978Z;
        while (rVar.a() >= 8) {
            int i14 = rVar.f3733b;
            int i15 = rVar.i();
            int i16 = rVar.i();
            if (i16 == 1937013100) {
                if (rVar.a() >= i11) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                P0.l.d(z8);
                int B9 = rVar.B();
                int i17 = 0;
                while (i17 < B9) {
                    if (rVar.a() >= 12) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    P0.l.d(z9);
                    int B10 = rVar.B();
                    int B11 = rVar.B();
                    rVar.I(i11);
                    int v4 = rVar.v();
                    rVar.I(i10);
                    int i18 = rVar.i();
                    if (B11 > spannableStringBuilder.length()) {
                        StringBuilder p3 = g.p(B11, "Truncating styl end (", ") to cueText.length() (");
                        p3.append(spannableStringBuilder.length());
                        p3.append(").");
                        P0.l.B("Tx3gParser", p3.toString());
                        B11 = spannableStringBuilder.length();
                    }
                    if (B10 >= B11) {
                        P0.l.B("Tx3gParser", e.v("Ignoring styl with start (", B10, ") >= end (", B11, ")."));
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                        int i19 = B10;
                        int i20 = B11;
                        c(spannableStringBuilder3, v4, this.f4975W, i19, i20, 0);
                        b(spannableStringBuilder3, i18, this.f4976X, i19, i20, 0);
                    }
                    i10 = 1;
                    i17++;
                    i11 = 2;
                }
            } else if (i16 != 1952608120 || !this.f4974V) {
                i11 = 2;
            } else {
                i11 = 2;
                if (rVar.a() >= 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                P0.l.d(z6);
                f8 = z.h(((float) rVar.B()) / ((float) this.f4979a0), 0.0f, 0.95f);
            }
            rVar.H(i14 + i15);
        }
        cVar2.accept(new M1.a(O.r(new b(spannableStringBuilder, (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, f8, 0, 0, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    public final /* synthetic */ void a() {
    }

    public final /* synthetic */ d o(byte[] bArr, int i, int i8) {
        return e.o(this, bArr, i8);
    }

    public final int y() {
        return 2;
    }
}
