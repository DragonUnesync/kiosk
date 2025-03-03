package b4;

import a4.C0425h;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b4.a  reason: case insensitive filesystem */
public abstract class C0531a extends C0425h {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f8664a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f8665b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f8666c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f8667d;
    public final int[] e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f8668f;

    public C0531a() {
        int[] iArr = new int[8];
        this.f8665b = iArr;
        this.f8666c = new float[4];
        this.f8667d = new float[4];
        this.e = new int[(iArr.length / 2)];
        this.f8668f = new int[(iArr.length / 2)];
    }

    public static void h(int[] iArr, float[] fArr) {
        int i = 0;
        float f8 = fArr[0];
        for (int i8 = 1; i8 < iArr.length; i8++) {
            float f9 = fArr[i8];
            if (f9 < f8) {
                i = i8;
                f8 = f9;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    public static void i(int[] iArr, float[] fArr) {
        int i = 0;
        float f8 = fArr[0];
        for (int i8 = 1; i8 < iArr.length; i8++) {
            float f9 = fArr[i8];
            if (f9 > f8) {
                i = i8;
                f8 = f9;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    public static boolean j(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f8 = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f8 >= 0.7916667f && f8 <= 0.89285713f) {
            int i8 = Integer.MAX_VALUE;
            int i9 = RecyclerView.UNDEFINED_DURATION;
            for (int i10 : iArr) {
                if (i10 > i9) {
                    i9 = i10;
                }
                if (i10 < i8) {
                    i8 = i10;
                }
            }
            if (i9 < i8 * 10) {
                return true;
            }
        }
        return false;
    }
}
