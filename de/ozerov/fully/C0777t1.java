package de.ozerov.fully;

import Y2.g;
import android.content.Context;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;

/* renamed from: de.ozerov.fully.t1  reason: case insensitive filesystem */
public final class C0777t1 {

    /* renamed from: a  reason: collision with root package name */
    public File f10961a;

    /* renamed from: b  reason: collision with root package name */
    public long f10962b;

    /* renamed from: c  reason: collision with root package name */
    public long f10963c;

    /* renamed from: d  reason: collision with root package name */
    public C0771s1 f10964d;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, de.ozerov.fully.t1] */
    public static ArrayList a(Context context, ArrayList arrayList) {
        File file;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a.Z(context, true).iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (!gVar.f6585c) {
                Iterator it2 = arrayList.iterator();
                long j7 = 0;
                while (true) {
                    boolean hasNext = it2.hasNext();
                    file = gVar.f6584b;
                    if (!hasNext) {
                        break;
                    }
                    C0783u1 u1Var = (C0783u1) it2.next();
                    if (u1Var.f10990d && a.s0(u1Var.f10988b, file)) {
                        j7 += u1Var.f10989c;
                    }
                }
                if (j7 > 0) {
                    long usableSpace = file.getUsableSpace();
                    ? obj = new Object();
                    obj.f10961a = file;
                    obj.f10962b = usableSpace;
                    obj.f10963c = j7;
                    if (((double) usableSpace) > ((double) j7) * 1.05d) {
                        obj.f10964d = C0771s1.f10946U;
                    } else if (usableSpace > j7) {
                        obj.f10964d = C0771s1.f10947V;
                    } else {
                        obj.f10964d = C0771s1.f10948W;
                    }
                    arrayList2.add(obj);
                    Objects.toString(file);
                }
            }
        }
        return arrayList2;
    }
}
