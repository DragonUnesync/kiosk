package c1;

import P0.z;

public final /* synthetic */ class i implements u {

    /* renamed from: U  reason: collision with root package name */
    public static final i f8794U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public static final i f8795V = new Object();

    public int g(Object obj) {
        String str = ((n) obj).f8797a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (z.f3748a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
