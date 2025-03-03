package U0;

import D2.o;
import M0.C0137z;
import M0.K;
import M0.V;
import M0.W;
import M0.X;
import M0.r;
import P0.n;
import P0.z;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import h1.C1031B;
import java.util.HashMap;

public final class h {

    /* renamed from: A  reason: collision with root package name */
    public boolean f5346A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5347a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5348b;

    /* renamed from: c  reason: collision with root package name */
    public final PlaybackSession f5349c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5350d = SystemClock.elapsedRealtime();
    public final W e = new W();

    /* renamed from: f  reason: collision with root package name */
    public final V f5351f = new V();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f5352g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f5353h = new HashMap();
    public String i;

    /* renamed from: j  reason: collision with root package name */
    public PlaybackMetrics.Builder f5354j;

    /* renamed from: k  reason: collision with root package name */
    public int f5355k;

    /* renamed from: l  reason: collision with root package name */
    public int f5356l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f5357m = 0;

    /* renamed from: n  reason: collision with root package name */
    public K f5358n;

    /* renamed from: o  reason: collision with root package name */
    public o f5359o;

    /* renamed from: p  reason: collision with root package name */
    public o f5360p;

    /* renamed from: q  reason: collision with root package name */
    public o f5361q;

    /* renamed from: r  reason: collision with root package name */
    public r f5362r;

    /* renamed from: s  reason: collision with root package name */
    public r f5363s;

    /* renamed from: t  reason: collision with root package name */
    public r f5364t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5365u;

    /* renamed from: v  reason: collision with root package name */
    public int f5366v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5367w;

    /* renamed from: x  reason: collision with root package name */
    public int f5368x;

    /* renamed from: y  reason: collision with root package name */
    public int f5369y;
    public int z;

    public h(Context context, PlaybackSession playbackSession) {
        this.f5347a = context.getApplicationContext();
        this.f5349c = playbackSession;
        f fVar = new f();
        this.f5348b = fVar;
        fVar.f5343d = this;
    }

    public final boolean a(o oVar) {
        String str;
        if (oVar != null) {
            String str2 = (String) oVar.f1139X;
            f fVar = this.f5348b;
            synchronized (fVar) {
                str = fVar.f5344f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long j7;
        long j8;
        int i8;
        PlaybackMetrics.Builder builder = this.f5354j;
        if (builder != null && this.f5346A) {
            builder.setAudioUnderrunCount(this.z);
            this.f5354j.setVideoFramesDropped(this.f5368x);
            this.f5354j.setVideoFramesPlayed(this.f5369y);
            Long l8 = (Long) this.f5352g.get(this.i);
            PlaybackMetrics.Builder builder2 = this.f5354j;
            if (l8 == null) {
                j7 = 0;
            } else {
                j7 = l8.longValue();
            }
            builder2.setNetworkTransferDurationMillis(j7);
            Long l9 = (Long) this.f5353h.get(this.i);
            PlaybackMetrics.Builder builder3 = this.f5354j;
            if (l9 == null) {
                j8 = 0;
            } else {
                j8 = l9.longValue();
            }
            builder3.setNetworkBytesRead(j8);
            PlaybackMetrics.Builder builder4 = this.f5354j;
            if (l9 == null || l9.longValue() <= 0) {
                i8 = 0;
            } else {
                i8 = 1;
            }
            builder4.setStreamSource(i8);
            this.f5349c.reportPlaybackMetrics(this.f5354j.build());
        }
        this.f5354j = null;
        this.i = null;
        this.z = 0;
        this.f5368x = 0;
        this.f5369y = 0;
        this.f5362r = null;
        this.f5363s = null;
        this.f5364t = null;
        this.f5346A = false;
    }

    public final void c(X x8, C1031B b8) {
        int b9;
        PlaybackMetrics.Builder builder = this.f5354j;
        if (b8 != null && (b9 = x8.b(b8.f12277a)) != -1) {
            V v4 = this.f5351f;
            int i8 = 0;
            x8.f(b9, v4, false);
            int i9 = v4.f2864c;
            W w2 = this.e;
            x8.n(i9, w2);
            C0137z zVar = w2.f2872c.f2786b;
            int i10 = 2;
            if (zVar != null) {
                int H8 = z.H(zVar.f3060a, zVar.f3061b);
                if (H8 == 0) {
                    i8 = 3;
                } else if (H8 == 1) {
                    i8 = 5;
                } else if (H8 != 2) {
                    i8 = 1;
                } else {
                    i8 = 4;
                }
            }
            builder.setStreamType(i8);
            if (w2.f2880m != -9223372036854775807L && !w2.f2878k && !w2.i && !w2.a()) {
                builder.setMediaDurationMillis(z.c0(w2.f2880m));
            }
            if (!w2.a()) {
                i10 = 1;
            }
            builder.setPlaybackType(i10);
            this.f5346A = true;
        }
    }

    public final void d(a aVar, String str) {
        C1031B b8 = aVar.f5317d;
        if ((b8 == null || !b8.b()) && str.equals(this.i)) {
            b();
        }
        this.f5352g.remove(str);
        this.f5353h.remove(str);
    }

    public final void e(int i8, long j7, r rVar, int i9) {
        int i10;
        String str;
        TrackChangeEvent.Builder n4 = n.k(i8).setTimeSinceCreatedMillis(j7 - this.f5350d);
        if (rVar != null) {
            n4.setTrackState(1);
            if (i9 != 1) {
                i10 = 3;
                if (i9 != 2) {
                    if (i9 != 3) {
                        i10 = 1;
                    } else {
                        i10 = 4;
                    }
                }
            } else {
                i10 = 2;
            }
            n4.setTrackChangeReason(i10);
            String str2 = rVar.f3035m;
            if (str2 != null) {
                n4.setContainerMimeType(str2);
            }
            String str3 = rVar.f3036n;
            if (str3 != null) {
                n4.setSampleMimeType(str3);
            }
            String str4 = rVar.f3033k;
            if (str4 != null) {
                n4.setCodecName(str4);
            }
            int i11 = rVar.f3032j;
            if (i11 != -1) {
                n4.setBitrate(i11);
            }
            int i12 = rVar.f3043u;
            if (i12 != -1) {
                n4.setWidth(i12);
            }
            int i13 = rVar.f3044v;
            if (i13 != -1) {
                n4.setHeight(i13);
            }
            int i14 = rVar.f3014C;
            if (i14 != -1) {
                n4.setChannelCount(i14);
            }
            int i15 = rVar.f3015D;
            if (i15 != -1) {
                n4.setAudioSampleRate(i15);
            }
            String str5 = rVar.f3028d;
            if (str5 != null) {
                int i16 = z.f3748a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                n4.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    n4.setLanguageRegion((String) obj);
                }
            }
            float f8 = rVar.f3045w;
            if (f8 != -1.0f) {
                n4.setVideoFrameRate(f8);
            }
        } else {
            n4.setTrackState(0);
        }
        this.f5346A = true;
        this.f5349c.reportTrackChangeEvent(n4.build());
    }
}
