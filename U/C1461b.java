package u;

import D.C0;
import D.C0048i;
import D.L0;
import android.util.Size;
import java.util.ArrayList;

/* renamed from: u.b  reason: case insensitive filesystem */
public final class C1461b {

    /* renamed from: a  reason: collision with root package name */
    public final String f15594a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f15595b;

    /* renamed from: c  reason: collision with root package name */
    public final C0 f15596c;

    /* renamed from: d  reason: collision with root package name */
    public final L0 f15597d;
    public final Size e;

    /* renamed from: f  reason: collision with root package name */
    public final C0048i f15598f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f15599g;

    public C1461b(String str, Class cls, C0 c02, L0 l02, Size size, C0048i iVar, ArrayList arrayList) {
        if (str != null) {
            this.f15594a = str;
            this.f15595b = cls;
            if (c02 != null) {
                this.f15596c = c02;
                if (l02 != null) {
                    this.f15597d = l02;
                    this.e = size;
                    this.f15598f = iVar;
                    this.f15599g = arrayList;
                    return;
                }
                throw new NullPointerException("Null useCaseConfig");
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1461b)) {
            return false;
        }
        C1461b bVar = (C1461b) obj;
        if (this.f15594a.equals(bVar.f15594a) && this.f15595b.equals(bVar.f15595b) && this.f15596c.equals(bVar.f15596c) && this.f15597d.equals(bVar.f15597d)) {
            Size size = bVar.e;
            Size size2 = this.e;
            if (size2 != null ? size2.equals(size) : size == null) {
                C0048i iVar = bVar.f15598f;
                C0048i iVar2 = this.f15598f;
                if (iVar2 != null ? iVar2.equals(iVar) : iVar == null) {
                    ArrayList arrayList = bVar.f15599g;
                    ArrayList arrayList2 = this.f15599g;
                    if (arrayList2 == null) {
                        if (arrayList == null) {
                            return true;
                        }
                    } else if (arrayList2.equals(arrayList)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8;
        int hashCode = (((((((this.f15594a.hashCode() ^ 1000003) * 1000003) ^ this.f15595b.hashCode()) * 1000003) ^ this.f15596c.hashCode()) * 1000003) ^ this.f15597d.hashCode()) * 1000003;
        int i9 = 0;
        Size size = this.e;
        if (size == null) {
            i = 0;
        } else {
            i = size.hashCode();
        }
        int i10 = (hashCode ^ i) * 1000003;
        C0048i iVar = this.f15598f;
        if (iVar == null) {
            i8 = 0;
        } else {
            i8 = iVar.hashCode();
        }
        int i11 = (i10 ^ i8) * 1000003;
        ArrayList arrayList = this.f15599g;
        if (arrayList != null) {
            i9 = arrayList.hashCode();
        }
        return i11 ^ i9;
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f15594a + ", useCaseType=" + this.f15595b + ", sessionConfig=" + this.f15596c + ", useCaseConfig=" + this.f15597d + ", surfaceResolution=" + this.e + ", streamSpec=" + this.f15598f + ", captureTypes=" + this.f15599g + "}";
    }
}
