package T5;

import f6.C0934y;
import g6.Y;
import h6.C1082c;
import h6.d;
import java.net.SocketAddress;
import java.security.AccessController;
import java.util.Map;

/* renamed from: T5.c0  reason: case insensitive filesystem */
public abstract class C0239c0 {
    private static final C0934y MASKS = new Z();
    /* access modifiers changed from: private */
    public static final C1082c logger = d.getInstance((Class<?>) C0239c0.class);

    private static boolean isSkippable(Class<?> cls, String str, Class<?>... clsArr) {
        return ((Boolean) AccessController.doPrivileged(new C0235a0(cls, str, clsArr))).booleanValue();
    }

    public static int mask(Class<? extends W> cls) {
        Map map = (Map) MASKS.get();
        Integer num = (Integer) map.get(cls);
        if (num == null) {
            num = Integer.valueOf(mask0(cls));
            map.put(cls, num);
        }
        return num.intValue();
    }

    private static int mask0(Class<? extends W> cls) {
        int i;
        int i8 = 1;
        Class<SocketAddress> cls2 = SocketAddress.class;
        Class<C0274u0> cls3 = C0274u0.class;
        try {
            Class<Object> cls4 = Object.class;
            Class<Y> cls5 = Y.class;
            if (C0243e0.class.isAssignableFrom(cls)) {
                i = 511;
                try {
                    if (isSkippable(cls, "channelRegistered", cls5)) {
                        i = 509;
                    }
                    try {
                        if (isSkippable(cls, "channelUnregistered", cls5)) {
                            i &= -5;
                        }
                        if (isSkippable(cls, "channelActive", cls5)) {
                            i &= -9;
                        }
                        if (isSkippable(cls, "channelInactive", cls5)) {
                            i &= -17;
                        }
                        if (isSkippable(cls, "channelRead", cls5, cls4)) {
                            i &= -33;
                        }
                        if (isSkippable(cls, "channelReadComplete", cls5)) {
                            i &= -65;
                        }
                        if (isSkippable(cls, "channelWritabilityChanged", cls5)) {
                            i &= -257;
                        }
                        if (isSkippable(cls, "userEventTriggered", cls5, cls4)) {
                            i &= -129;
                        }
                    } catch (Exception e) {
                        e = e;
                        i8 = i;
                        Y.throwException(e);
                        return i8;
                    }
                } catch (Exception e8) {
                    e = e8;
                    i8 = 511;
                    Y.throwException(e);
                    return i8;
                }
            } else {
                i = 1;
            }
            if (C0265p0.class.isAssignableFrom(cls)) {
                int i9 = i | 130561;
                if (isSkippable(cls, "bind", cls5, cls2, cls3)) {
                    i9 &= -513;
                }
                if (isSkippable(cls, "connect", cls5, cls2, cls2, cls3)) {
                    i9 &= -1025;
                }
                if (isSkippable(cls, "disconnect", cls5, cls3)) {
                    i9 &= -2049;
                }
                if (isSkippable(cls, "close", cls5, cls3)) {
                    i9 &= -4097;
                }
                if (isSkippable(cls, "deregister", cls5, cls3)) {
                    i9 &= -8193;
                }
                if (isSkippable(cls, "read", cls5)) {
                    i9 &= -16385;
                }
                if (isSkippable(cls, "write", cls5, cls4, cls3)) {
                    i9 = -32769 & i9;
                }
                if (isSkippable(cls, "flush", cls5)) {
                    i &= -65537;
                }
            }
            if (isSkippable(cls, "exceptionCaught", cls5, Throwable.class)) {
                return i & -2;
            }
            return i;
        } catch (Exception e9) {
            e = e9;
            Y.throwException(e);
            return i8;
        }
    }
}
