package T0;

import P0.l;
import android.view.View;
import androidx.emoji2.text.f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4608a = 2;

    /* renamed from: b  reason: collision with root package name */
    public int f4609b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4610c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4611d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public Object f4612f;

    public C(int i) {
        this.f4609b = i;
        byte[] bArr = new byte[131];
        this.f4612f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i8) {
        if (this.f4610c) {
            int i9 = i8 - i;
            byte[] bArr2 = (byte[]) this.f4612f;
            int length = bArr2.length;
            int i10 = this.e;
            if (length < i10 + i9) {
                this.f4612f = Arrays.copyOf(bArr2, (i10 + i9) * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f4612f, this.e, i9);
            this.e += i9;
        }
    }

    public void b() {
        int i;
        if (this.f4610c) {
            i = ((f) this.f4612f).g();
        } else {
            i = ((f) this.f4612f).k();
        }
        this.e = i;
    }

    public void c(View view, int i) {
        if (this.f4610c) {
            this.e = ((f) this.f4612f).m() + ((f) this.f4612f).b(view);
        } else {
            this.e = ((f) this.f4612f).e(view);
        }
        this.f4609b = i;
    }

    public void d(View view, int i) {
        int m8 = ((f) this.f4612f).m();
        if (m8 >= 0) {
            c(view, i);
            return;
        }
        this.f4609b = i;
        if (this.f4610c) {
            int g8 = (((f) this.f4612f).g() - m8) - ((f) this.f4612f).b(view);
            this.e = ((f) this.f4612f).g() - g8;
            if (g8 > 0) {
                int c8 = this.e - ((f) this.f4612f).c(view);
                int k8 = ((f) this.f4612f).k();
                int min = c8 - (Math.min(((f) this.f4612f).e(view) - k8, 0) + k8);
                if (min < 0) {
                    this.e = Math.min(g8, -min) + this.e;
                    return;
                }
                return;
            }
            return;
        }
        int e8 = ((f) this.f4612f).e(view);
        int k9 = e8 - ((f) this.f4612f).k();
        this.e = e8;
        if (k9 > 0) {
            int g9 = (((f) this.f4612f).g() - Math.min(0, (((f) this.f4612f).g() - m8) - ((f) this.f4612f).b(view))) - (((f) this.f4612f).c(view) + e8);
            if (g9 < 0) {
                this.e -= Math.min(k9, -g9);
            }
        }
    }

    public boolean e(int i) {
        if (!this.f4610c) {
            return false;
        }
        this.e -= i;
        this.f4610c = false;
        this.f4611d = true;
        return true;
    }

    public void f(int i) {
        boolean z;
        boolean z6 = this.f4610c;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f4610c = z6 | z;
        this.f4609b += i;
    }

    public void g() {
        switch (this.f4608a) {
            case 1:
                this.f4610c = false;
                this.f4611d = false;
                return;
            default:
                this.f4609b = -1;
                this.e = RecyclerView.UNDEFINED_DURATION;
                this.f4610c = false;
                this.f4611d = false;
                return;
        }
    }

    public void h(int i) {
        boolean z = true;
        l.j(!this.f4610c);
        if (i != this.f4609b) {
            z = false;
        }
        this.f4610c = z;
        if (z) {
            this.e = 3;
            this.f4611d = false;
        }
    }

    public String toString() {
        switch (this.f4608a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f4609b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.f4610c + ", mValid=" + this.f4611d + '}';
            default:
                return super.toString();
        }
    }

    public C(X x8) {
        this.f4612f = x8;
    }

    public C() {
        g();
    }
}
