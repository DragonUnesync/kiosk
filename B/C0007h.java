package B;

import D.C0071z;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: B.h  reason: case insensitive filesystem */
public final class C0007h {

    /* renamed from: a  reason: collision with root package name */
    public final Size f251a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f252b;

    /* renamed from: c  reason: collision with root package name */
    public final C0071z f253c;

    /* renamed from: d  reason: collision with root package name */
    public final int f254d;
    public final boolean e;

    public C0007h(Size size, Rect rect, C0071z zVar, int i, boolean z) {
        if (size != null) {
            this.f251a = size;
            if (rect != null) {
                this.f252b = rect;
                this.f253c = zVar;
                this.f254d = i;
                this.e = z;
                return;
            }
            throw new NullPointerException("Null inputCropRect");
        }
        throw new NullPointerException("Null inputSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0007h)) {
            return false;
        }
        C0007h hVar = (C0007h) obj;
        if (this.f251a.equals(hVar.f251a) && this.f252b.equals(hVar.f252b)) {
            C0071z zVar = hVar.f253c;
            C0071z zVar2 = this.f253c;
            if (zVar2 != null ? zVar2.equals(zVar) : zVar == null) {
                if (this.f254d == hVar.f254d && this.e == hVar.e) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8;
        int hashCode = (((this.f251a.hashCode() ^ 1000003) * 1000003) ^ this.f252b.hashCode()) * 1000003;
        C0071z zVar = this.f253c;
        if (zVar == null) {
            i = 0;
        } else {
            i = zVar.hashCode();
        }
        int i9 = (((hashCode ^ i) * 1000003) ^ this.f254d) * 1000003;
        if (this.e) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return i9 ^ i8;
    }

    public final String toString() {
        return "CameraInputInfo{inputSize=" + this.f251a + ", inputCropRect=" + this.f252b + ", cameraInternal=" + this.f253c + ", rotationDegrees=" + this.f254d + ", mirroring=" + this.e + "}";
    }
}
