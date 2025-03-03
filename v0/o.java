package V0;

import android.media.AudioTrack;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final n f5546a;

    /* renamed from: b  reason: collision with root package name */
    public int f5547b;

    /* renamed from: c  reason: collision with root package name */
    public long f5548c;

    /* renamed from: d  reason: collision with root package name */
    public long f5549d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f5550f;

    public o(AudioTrack audioTrack) {
        this.f5546a = new n(audioTrack);
        a();
    }

    public final void a() {
        if (this.f5546a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.f5547b = i;
        if (i == 0) {
            this.e = 0;
            this.f5550f = -1;
            this.f5548c = System.nanoTime() / 1000;
            this.f5549d = 10000;
        } else if (i == 1) {
            this.f5549d = 10000;
        } else if (i == 2 || i == 3) {
            this.f5549d = 10000000;
        } else if (i == 4) {
            this.f5549d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
