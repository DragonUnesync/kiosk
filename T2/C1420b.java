package t2;

import android.support.v4.media.session.b;
import y2.C1628c;
import y2.C1630e;

/* renamed from: t2.b  reason: case insensitive filesystem */
public final class C1420b extends C1628c {

    /* renamed from: W  reason: collision with root package name */
    public final C1630e f15186W;

    /* renamed from: X  reason: collision with root package name */
    public int f15187X = -1;

    public C1420b(int i) {
        super(i);
        this.f15186W = new C1630e(i);
    }

    public final int h() {
        C1630e eVar = this.f15186W;
        int i = eVar.f16380W - 1;
        while (i >= 0 && eVar.f(i) < 0) {
            i--;
        }
        int i8 = i + 1;
        if (i8 < 0) {
            eVar.getClass();
            throw new IllegalArgumentException("newSize < 0");
        } else if (i8 <= eVar.f16380W) {
            eVar.d();
            eVar.f16380W = i8;
            return i8;
        } else {
            throw new IllegalArgumentException("newSize > size");
        }
    }

    public final C1419a i(int i) {
        int i8;
        C1630e eVar = this.f15186W;
        if (i >= eVar.f16380W) {
            i8 = -1;
        } else {
            i8 = eVar.f(i);
        }
        if (i8 >= 0) {
            return (C1419a) e(i8);
        }
        throw new IllegalArgumentException("no such label: ".concat(b.P(i)));
    }
}
