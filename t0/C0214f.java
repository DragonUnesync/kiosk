package T0;

import P0.z;
import java.util.Locale;
import u.C1477r;

/* renamed from: T0.f  reason: case insensitive filesystem */
public final class C0214f {

    /* renamed from: a  reason: collision with root package name */
    public int f4818a;

    /* renamed from: b  reason: collision with root package name */
    public int f4819b;

    /* renamed from: c  reason: collision with root package name */
    public int f4820c;

    /* renamed from: d  reason: collision with root package name */
    public int f4821d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f4822f;

    /* renamed from: g  reason: collision with root package name */
    public int f4823g;

    /* renamed from: h  reason: collision with root package name */
    public int f4824h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f4825j;

    /* renamed from: k  reason: collision with root package name */
    public long f4826k;

    /* renamed from: l  reason: collision with root package name */
    public int f4827l;

    public final String toString() {
        int i8 = this.f4818a;
        int i9 = this.f4819b;
        int i10 = this.f4820c;
        int i11 = this.f4821d;
        int i12 = this.e;
        int i13 = this.f4822f;
        int i14 = this.f4823g;
        int i15 = this.f4824h;
        int i16 = this.i;
        int i17 = this.f4825j;
        long j7 = this.f4826k;
        int i18 = this.f4827l;
        int i19 = z.f3748a;
        Locale locale = Locale.US;
        StringBuilder e8 = C1477r.e("DecoderCounters {\n decoderInits=", i8, ",\n decoderReleases=", i9, "\n queuedInputBuffers=");
        e8.append(i10);
        e8.append("\n skippedInputBuffers=");
        e8.append(i11);
        e8.append("\n renderedOutputBuffers=");
        e8.append(i12);
        e8.append("\n skippedOutputBuffers=");
        e8.append(i13);
        e8.append("\n droppedBuffers=");
        e8.append(i14);
        e8.append("\n droppedInputBuffers=");
        e8.append(i15);
        e8.append("\n maxConsecutiveDroppedBuffers=");
        e8.append(i16);
        e8.append("\n droppedToKeyframeEvents=");
        e8.append(i17);
        e8.append("\n totalVideoFrameProcessingOffsetUs=");
        e8.append(j7);
        e8.append("\n videoFrameProcessingOffsetCount=");
        e8.append(i18);
        e8.append("\n}");
        return e8.toString();
    }
}
