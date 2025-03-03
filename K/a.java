package K;

import B.f0;
import D.C0044g;
import android.media.MediaCodec;
import c1.u;
import de.ozerov.fully.O2;
import java.io.File;
import java.util.Comparator;

public final /* synthetic */ class a implements Comparator {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2533U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f2534V;

    public /* synthetic */ a(int i, Object obj) {
        this.f2533U = i;
        this.f2534V = obj;
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        int compare;
        switch (this.f2533U) {
            case 0:
                C0044g gVar = (C0044g) obj2;
                ((b) this.f2534V).getClass();
                Class<MediaCodec> cls = ((C0044g) obj).f899a.f829j;
                int i8 = 1;
                Class<f0> cls2 = f0.class;
                Class<MediaCodec> cls3 = MediaCodec.class;
                if (cls == cls3) {
                    i = 2;
                } else if (cls == cls2) {
                    i = 0;
                } else {
                    i = 1;
                }
                Class<MediaCodec> cls4 = gVar.f899a.f829j;
                if (cls4 == cls3) {
                    i8 = 2;
                } else if (cls4 == cls2) {
                    i8 = 0;
                }
                return i - i8;
            case 1:
                u uVar = (u) this.f2534V;
                return uVar.g(obj2) - uVar.g(obj);
            default:
                File file = (File) obj;
                File file2 = (File) obj2;
                int i9 = ((O2) this.f2534V).e;
                if (i9 == 2) {
                    return file.getAbsolutePath().compareTo(file2.getAbsolutePath());
                }
                if (i9 == 3) {
                    compare = file.getAbsolutePath().compareTo(file2.getAbsolutePath());
                } else if (i9 == 0) {
                    return file.getName().compareTo(file2.getName());
                } else {
                    if (i9 == 1) {
                        compare = file.getAbsolutePath().compareTo(file2.getAbsolutePath());
                    } else if (i9 == 4) {
                        return Long.compare(file.lastModified(), file2.lastModified());
                    } else {
                        if (i9 == 5) {
                            compare = Long.compare(file.lastModified(), file2.lastModified());
                        } else if (i9 == 6) {
                            return Long.compare(file.length(), file2.length());
                        } else {
                            if (i9 != 7) {
                                return file.getName().compareTo(file2.getName());
                            }
                            compare = Long.compare(file.length(), file2.length());
                        }
                    }
                }
                return -compare;
        }
    }
}
