package h;

/* renamed from: h.I  reason: case insensitive filesystem */
public final class C1008I {

    /* renamed from: d  reason: collision with root package name */
    public static C1008I f12120d;

    /* renamed from: a  reason: collision with root package name */
    public long f12121a;

    /* renamed from: b  reason: collision with root package name */
    public long f12122b;

    /* renamed from: c  reason: collision with root package name */
    public int f12123c;

    public final void a(long j7, double d8, double d9) {
        float f8 = ((float) (j7 - 946728000000L)) / 8.64E7f;
        float f9 = (0.01720197f * f8) + 6.24006f;
        double d10 = (double) f9;
        double sin = (Math.sin((double) (f9 * 3.0f)) * 5.236000106378924E-6d) + (Math.sin((double) (2.0f * f9)) * 3.4906598739326E-4d) + (Math.sin(d10) * 0.03341960161924362d) + d10 + 1.796593063d + 3.141592653589793d;
        double d11 = (-d9) / 360.0d;
        double sin2 = (Math.sin(2.0d * sin) * -0.0069d) + (Math.sin(d10) * 0.0053d) + ((double) (((float) Math.round(((double) (f8 - 9.0E-4f)) - d11)) + 9.0E-4f)) + d11;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d12 = 0.01745329238474369d * d8;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d12))) / (Math.cos(asin) * Math.cos(d12));
        if (sin3 >= 1.0d) {
            this.f12123c = 1;
            this.f12121a = -1;
            this.f12122b = -1;
        } else if (sin3 <= -1.0d) {
            this.f12123c = 0;
            this.f12121a = -1;
            this.f12122b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            this.f12121a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f12122b = round;
            if (round >= j7 || this.f12121a <= j7) {
                this.f12123c = 1;
            } else {
                this.f12123c = 0;
            }
        }
    }
}
