package r2;

import N.e;
import android.support.v4.media.session.b;
import com.samsung.android.knox.accounts.Account;
import java.util.TreeMap;
import m2.C1208a;
import u2.t;
import y2.C1627b;

public final class m extends o {
    public final void a(C1387f fVar) {
    }

    public final q b() {
        return q.TYPE_HEADER_ITEM;
    }

    public final int c() {
        return 112;
    }

    public final void d(C1387f fVar, C1627b bVar) {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        int b8 = fVar.f14885c.b();
        int b9 = fVar.f14883a.b();
        w wVar = fVar.f14885c;
        int b10 = wVar.b();
        wVar.f();
        int i13 = (b10 + wVar.i) - b9;
        String y8 = e.y("dex\n", "035", "\u0000");
        if (bVar.d()) {
            bVar.b(8, "magic: " + new t(y8).f());
            bVar.b(4, "checksum");
            bVar.b(20, Account.SIGNATURE);
            int i14 = fVar.f14895o;
            if (i14 >= 0) {
                bVar.b(4, "file_size:       ".concat(b.Q(i14)));
                bVar.b(4, "header_size:     ".concat(b.Q(112)));
                bVar.b(4, "endian_tag:      ".concat(b.Q(305419896)));
                bVar.b(4, "link_size:       0");
                bVar.b(4, "link_off:        0");
                bVar.b(4, "map_off:         ".concat(b.Q(b8)));
            } else {
                throw new RuntimeException("file size not yet known");
            }
        }
        for (int i15 = 0; i15 < 8; i15++) {
            bVar.i(y8.charAt(i15));
        }
        bVar.n(24);
        int i16 = fVar.f14895o;
        if (i16 >= 0) {
            bVar.j(i16);
            bVar.j(112);
            bVar.j(305419896);
            bVar.n(8);
            bVar.j(b8);
            z zVar = fVar.e;
            zVar.f();
            int size = ((TreeMap) zVar.f14942g).size();
            if (size == 0) {
                i = 0;
            } else {
                i = zVar.b();
            }
            if (bVar.d()) {
                bVar.b(4, "string_ids_size: ".concat(b.Q(size)));
                bVar.b(4, "string_ids_off:  ".concat(b.Q(i)));
            }
            bVar.j(size);
            bVar.j(i);
            z zVar2 = fVar.f14887f;
            zVar2.f();
            TreeMap treeMap = (TreeMap) zVar2.f14942g;
            int size2 = treeMap.size();
            if (size2 == 0) {
                i8 = 0;
            } else {
                i8 = zVar2.b();
            }
            if (size2 <= 65536) {
                if (bVar.d()) {
                    bVar.b(4, "type_ids_size:   ".concat(b.Q(size2)));
                    bVar.b(4, "type_ids_off:    ".concat(b.Q(i8)));
                }
                bVar.j(size2);
                bVar.j(i8);
                z zVar3 = fVar.f14888g;
                zVar3.f();
                int size3 = ((TreeMap) zVar3.f14942g).size();
                if (size3 == 0) {
                    i9 = 0;
                } else {
                    i9 = zVar3.b();
                }
                if (size3 <= 65536) {
                    if (bVar.d()) {
                        bVar.b(4, "proto_ids_size:  ".concat(b.Q(size3)));
                        bVar.b(4, "proto_ids_off:   ".concat(b.Q(i9)));
                    }
                    bVar.j(size3);
                    bVar.j(i9);
                    l lVar = fVar.f14889h;
                    lVar.f();
                    int size4 = lVar.f14902f.size();
                    if (size4 == 0) {
                        i10 = 0;
                    } else {
                        i10 = lVar.b();
                    }
                    if (bVar.d()) {
                        bVar.b(4, "field_ids_size:  ".concat(b.Q(size4)));
                        bVar.b(4, "field_ids_off:   ".concat(b.Q(i10)));
                    }
                    bVar.j(size4);
                    bVar.j(i10);
                    v vVar = fVar.i;
                    vVar.f();
                    int size5 = vVar.f14929f.size();
                    if (size5 == 0) {
                        i11 = 0;
                    } else {
                        i11 = vVar.b();
                    }
                    if (bVar.d()) {
                        bVar.b(4, "method_ids_size: ".concat(b.Q(size5)));
                        bVar.b(4, "method_ids_off:  ".concat(b.Q(i11)));
                    }
                    bVar.j(size5);
                    bVar.j(i11);
                    C1385d dVar = fVar.f14890j;
                    dVar.f();
                    int size6 = dVar.f14876f.size();
                    if (size6 != 0) {
                        i12 = dVar.b();
                    }
                    if (bVar.d()) {
                        bVar.b(4, "class_defs_size: ".concat(b.Q(size6)));
                        bVar.b(4, "class_defs_off:  ".concat(b.Q(i12)));
                    }
                    bVar.j(size6);
                    bVar.j(i12);
                    if (bVar.d()) {
                        bVar.b(4, "data_size:       ".concat(b.Q(i13)));
                        bVar.b(4, "data_off:        ".concat(b.Q(b9)));
                    }
                    bVar.j(i13);
                    bVar.j(b9);
                    return;
                }
                throw new UnsupportedOperationException("too many proto ids");
            }
            throw new C1208a((Exception) null, String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", new Object[]{Integer.valueOf(treeMap.values().size()), 65536}));
        }
        throw new RuntimeException("file size not yet known");
    }
}
