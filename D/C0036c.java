package D;

import android.hardware.camera2.CaptureRequest;

/* renamed from: D.c  reason: case insensitive filesystem */
public final class C0036c {

    /* renamed from: a  reason: collision with root package name */
    public final String f888a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f889b;

    /* renamed from: c  reason: collision with root package name */
    public final CaptureRequest.Key f890c;

    public C0036c(String str, Class cls, CaptureRequest.Key key) {
        if (str != null) {
            this.f888a = str;
            if (cls != null) {
                this.f889b = cls;
                this.f890c = key;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0036c)) {
            return false;
        }
        C0036c cVar = (C0036c) obj;
        if (this.f888a.equals(cVar.f888a) && this.f889b.equals(cVar.f889b)) {
            CaptureRequest.Key key = cVar.f890c;
            CaptureRequest.Key key2 = this.f890c;
            if (key2 == null) {
                if (key == null) {
                    return true;
                }
            } else if (key2.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f888a.hashCode() ^ 1000003) * 1000003) ^ this.f889b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.f890c;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Option{id=" + this.f888a + ", valueClass=" + this.f889b + ", token=" + this.f890c + "}";
    }
}
