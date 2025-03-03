package a6;

import Q0.g;
import S5.C0185n;
import S5.D0;
import e6.C0852k;

/* renamed from: a6.b  reason: case insensitive filesystem */
public final class C0434b extends G {
    public C0434b(C0429C c8, String str) {
        this(requireValidStatusCode(c8.code()), str);
    }

    private static C0185n newBinaryData(int i, String str) {
        if (str == null) {
            str = "";
        }
        C0185n buffer = D0.buffer(str.length() + 2);
        buffer.writeShort(i);
        if (!str.isEmpty()) {
            buffer.writeCharSequence(str, C0852k.UTF_8);
        }
        return buffer;
    }

    public static int requireValidStatusCode(int i) {
        if (C0429C.isValidStatusCode(i)) {
            return i;
        }
        throw new IllegalArgumentException(g.m(i, "WebSocket close status code does NOT comply with RFC-6455: "));
    }

    public C0434b(int i, String str) {
        this(true, 0, requireValidStatusCode(i), str);
    }

    public C0434b touch(Object obj) {
        super.touch(obj);
        return this;
    }

    public C0434b(boolean z, int i, int i8, String str) {
        super(z, i, newBinaryData(requireValidStatusCode(i8), str));
    }

    public C0434b(boolean z, int i, C0185n nVar) {
        super(z, i, nVar);
    }
}
