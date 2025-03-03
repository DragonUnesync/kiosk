package u4;

/* renamed from: u4.a  reason: case insensitive filesystem */
public final class C1492a extends d {

    /* renamed from: Y  reason: collision with root package name */
    public static final C1492a f15774Y = new d(new byte[0]);

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ int f15775Z = 0;

    /* JADX WARNING: type inference failed for: r0v5, types: [u4.d, u4.a] */
    public static C1492a i(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 65535 && !d.f(bArr)) {
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                byte b8 = bArr[i];
                if (!(b8 == 35 || b8 == 43)) {
                    i++;
                }
            }
            return new d(bArr);
        }
        return null;
    }
}
