package Q0;

import java.util.ArrayList;
import java.util.Arrays;

public final class b extends d {

    /* renamed from: W  reason: collision with root package name */
    public final long f4013W;

    /* renamed from: X  reason: collision with root package name */
    public final ArrayList f4014X = new ArrayList();

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f4015Y = new ArrayList();

    public b(int i, long j7) {
        super(i, 0);
        this.f4013W = j7;
    }

    public final b r(int i) {
        ArrayList arrayList = this.f4015Y;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) arrayList.get(i8);
            if (bVar.f4018V == i) {
                return bVar;
            }
        }
        return null;
    }

    public final c t(int i) {
        ArrayList arrayList = this.f4014X;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = (c) arrayList.get(i8);
            if (cVar.f4018V == i) {
                return cVar;
            }
        }
        return null;
    }

    public final String toString() {
        return d.b(this.f4018V) + " leaves: " + Arrays.toString(this.f4014X.toArray()) + " containers: " + Arrays.toString(this.f4015Y.toArray());
    }
}
