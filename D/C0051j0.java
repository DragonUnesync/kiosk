package D;

import H.k;
import H3.C;
import H3.E;
import H3.h0;
import M0.r;
import N1.d;
import U1.e;
import X0.b;
import Y1.D;
import android.util.Size;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.C0695f2;
import de.ozerov.fully.C0788v0;
import de.ozerov.fully.T;
import f1.C0895h;
import java.io.File;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k1.C1137f;
import k1.C1138g;
import k1.C1143l;
import k1.o;
import k1.p;
import l1.t;

/* renamed from: D.j0  reason: case insensitive filesystem */
public final /* synthetic */ class C0051j0 implements Comparator {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f911U;

    public /* synthetic */ C0051j0(int i) {
        this.f911U = i;
    }

    public final int compare(Object obj, Object obj2) {
        h0 h0Var;
        switch (this.f911U) {
            case 0:
                return ((C0036c) obj).f888a.compareTo(((C0036c) obj2).f888a);
            case 1:
                return Integer.compare(((d) obj2).f3314b, ((d) obj).f3314b);
            case 2:
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file.isDirectory() == file2.isDirectory()) {
                    return file.getName().compareToIgnoreCase(file2.getName());
                }
                if (file.isDirectory()) {
                    return -1;
                }
                return 1;
            case 3:
                File file3 = (File) obj;
                File file4 = (File) obj2;
                if (file3.isDirectory() == file4.isDirectory()) {
                    return file3.getName().compareToIgnoreCase(file4.getName());
                }
                if (file3.isDirectory()) {
                    return -1;
                }
                return 1;
            case 4:
                return ((String) obj2).length() - ((String) obj).length();
            case 5:
                return Integer.compare(((e) obj).f5398a.f5401b, ((e) obj2).f5398a.f5401b);
            case 6:
                return Long.compare(((U1.d) obj).f5395b, ((U1.d) obj2).f5395b);
            case 7:
                b bVar = (b) obj;
                b bVar2 = (b) obj2;
                int compare = Integer.compare(bVar.f6212c, bVar2.f6212c);
                if (compare != 0) {
                    return compare;
                }
                return bVar.f6211b.compareTo(bVar2.f6211b);
            case 8:
                D d8 = (D) obj;
                D d9 = (D) obj2;
                int compare2 = Integer.compare(d9.f6327b, d8.f6327b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo = d8.f6328c.compareTo(d9.f6328c);
                if (compareTo != 0) {
                    return compareTo;
                }
                return d8.f6329d.compareTo(d9.f6329d);
            case 9:
                D d10 = (D) obj;
                D d11 = (D) obj2;
                int compare3 = Integer.compare(d11.f6326a, d10.f6326a);
                if (compare3 != 0) {
                    return compare3;
                }
                int compareTo2 = d11.f6328c.compareTo(d10.f6328c);
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                return d11.f6329d.compareTo(d10.f6329d);
            case 10:
                return -Integer.compare(((T) obj).f10353g, ((T) obj2).f10353g);
            case 11:
                return ((T) obj).f10349b.compareToIgnoreCase(((T) obj2).f10349b);
            case 12:
                return ((T) obj).f10348a.compareToIgnoreCase(((T) obj2).f10348a);
            case 13:
                NetworkInterface networkInterface = (NetworkInterface) obj;
                NetworkInterface networkInterface2 = (NetworkInterface) obj2;
                if (networkInterface.getName().contains("eth") && !networkInterface2.getName().contains("eth")) {
                    return -1;
                }
                if (networkInterface.getName().contains("eth") || !networkInterface2.getName().contains("eth")) {
                    if (networkInterface.getName().contains("wlan") && !networkInterface2.getName().contains("wlan")) {
                        return -1;
                    }
                    if (networkInterface.getName().contains("wlan") || !networkInterface2.getName().contains("wlan")) {
                        return 0;
                    }
                }
                return 1;
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                int i = C0695f2.f10625d0;
                return -Integer.compare(((C0788v0) obj).f11003a, ((C0788v0) obj2).f11003a);
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                return k.b(((C0895h) obj).f11544a.f11541c, ((C0895h) obj2).f11544a.f11541c);
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                return ((r) obj2).f3032j - ((r) obj).f3032j;
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                return Integer.compare(((C1138g) ((List) obj).get(0)).f12950Z, ((C1138g) ((List) obj2).get(0)).f12950Z);
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                return ((C1137f) Collections.max((List) obj)).compareTo((C1137f) Collections.max((List) obj2));
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C.f(o.c((o) Collections.max(list, new C0051j0(22)), (o) Collections.max(list2, new C0051j0(22)))).a(list.size(), list2.size()).b((o) Collections.max(list, new C0051j0(23)), (o) Collections.max(list2, new C0051j0(23)), new C0051j0(23)).e();
            case 21:
                return ((C1143l) ((List) obj).get(0)).compareTo((C1143l) ((List) obj2).get(0));
            case 22:
                return o.c((o) obj, (o) obj2);
            case 23:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                if (!oVar.f12984Y || !oVar.f12987b0) {
                    h0Var = p.f12999j.a();
                } else {
                    h0Var = p.f12999j;
                }
                C c8 = E.f2008a;
                oVar.f12985Z.getClass();
                return c8.b(Integer.valueOf(oVar.f12990e0), Integer.valueOf(oVar2.f12990e0), h0Var).b(Integer.valueOf(oVar.f12989d0), Integer.valueOf(oVar2.f12989d0), h0Var).e();
            case 24:
                return ((t) obj).f13159a - ((t) obj2).f13159a;
            case 25:
                return Float.compare(((t) obj).f13161c, ((t) obj2).f13161c);
            case 26:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i8 = 0; i8 < bArr.length; i8++) {
                    byte b8 = bArr[i8];
                    byte b9 = bArr2[i8];
                    if (b8 != b9) {
                        return b8 - b9;
                    }
                }
                return 0;
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }
}
