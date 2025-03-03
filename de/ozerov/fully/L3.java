package de.ozerov.fully;

import android.media.MediaRecorder;
import android.os.Handler;
import java.util.Timer;

public final class L3 {

    /* renamed from: f  reason: collision with root package name */
    public static volatile long f10076f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f10077g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final SoundMeterService f10078a;

    /* renamed from: b  reason: collision with root package name */
    public MediaRecorder f10079b = null;

    /* renamed from: c  reason: collision with root package name */
    public Timer f10080c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f10081d;
    public volatile int e;

    public L3(SoundMeterService soundMeterService) {
        this.f10078a = soundMeterService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = n2.a.y0()     // Catch:{ all -> 0x0012 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            de.ozerov.fully.SoundMeterService r0 = r9.f10078a     // Catch:{ all -> 0x0012 }
            int r0 = r0.checkSelfPermission("android.permission.RECORD_AUDIO")     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0015
            monitor-exit(r9)
            return r1
        L_0x0012:
            r0 = move-exception
            goto L_0x00c4
        L_0x0015:
            android.media.MediaRecorder r0 = r9.f10079b     // Catch:{ all -> 0x0012 }
            r2 = 1
            if (r0 != 0) goto L_0x00c2
            java.util.Timer r0 = r9.f10080c     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x00c2
            android.media.MediaRecorder r0 = new android.media.MediaRecorder     // Catch:{ Exception -> 0x0055 }
            r0.<init>()     // Catch:{ Exception -> 0x0055 }
            r9.f10079b = r0     // Catch:{ Exception -> 0x0055 }
            r0.setAudioSource(r2)     // Catch:{ Exception -> 0x0055 }
            android.media.MediaRecorder r0 = r9.f10079b     // Catch:{ Exception -> 0x0055 }
            r0.setOutputFormat(r2)     // Catch:{ Exception -> 0x0055 }
            android.media.MediaRecorder r0 = r9.f10079b     // Catch:{ Exception -> 0x0055 }
            r0.setAudioEncoder(r2)     // Catch:{ Exception -> 0x0055 }
            boolean r0 = n2.a.q0()     // Catch:{ Exception -> 0x0055 }
            if (r0 == 0) goto L_0x0057
            android.media.MediaRecorder r0 = r9.f10079b     // Catch:{ Exception -> 0x0055 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0055 }
            r3.<init>()     // Catch:{ Exception -> 0x0055 }
            de.ozerov.fully.SoundMeterService r4 = r9.f10078a     // Catch:{ Exception -> 0x0055 }
            java.io.File r4 = r4.getExternalCacheDir()     // Catch:{ Exception -> 0x0055 }
            r3.append(r4)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r4 = "/soundmeter.3gp"
            r3.append(r4)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0055 }
            r0.setOutputFile(r3)     // Catch:{ Exception -> 0x0055 }
            goto L_0x005e
        L_0x0055:
            r0 = move-exception
            goto L_0x0097
        L_0x0057:
            android.media.MediaRecorder r0 = r9.f10079b     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = "/dev/null"
            r0.setOutputFile(r3)     // Catch:{ Exception -> 0x0055 }
        L_0x005e:
            android.media.MediaRecorder r0 = r9.f10079b     // Catch:{ Exception -> 0x0055 }
            r0.prepare()     // Catch:{ Exception -> 0x0055 }
            android.media.MediaRecorder r0 = r9.f10079b     // Catch:{ Exception -> 0x0055 }
            r0.start()     // Catch:{ Exception -> 0x0055 }
            P5.O r4 = new P5.O     // Catch:{ Exception -> 0x0055 }
            r0 = 5
            r4.<init>(r0, r9)     // Catch:{ Exception -> 0x0055 }
            java.util.Timer r3 = new java.util.Timer     // Catch:{ Exception -> 0x0055 }
            r3.<init>()     // Catch:{ Exception -> 0x0055 }
            r9.f10080c = r3     // Catch:{ Exception -> 0x0055 }
            r5 = 0
            r7 = 200(0xc8, double:9.9E-322)
            r3.schedule(r4, r5, r7)     // Catch:{ Exception -> 0x0055 }
            boolean r0 = n2.a.q0()     // Catch:{ Exception -> 0x0055 }
            if (r0 == 0) goto L_0x0095
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x0055 }
            r0.<init>()     // Catch:{ Exception -> 0x0055 }
            r9.f10081d = r0     // Catch:{ Exception -> 0x0055 }
            de.ozerov.fully.M2 r3 = new de.ozerov.fully.M2     // Catch:{ Exception -> 0x0055 }
            r4 = 4
            r3.<init>((int) r4, (java.lang.Object) r9)     // Catch:{ Exception -> 0x0055 }
            r4 = 1200000(0x124f80, double:5.92879E-318)
            r0.postDelayed(r3, r4)     // Catch:{ Exception -> 0x0055 }
        L_0x0095:
            monitor-exit(r9)
            return r2
        L_0x0097:
            r0.printStackTrace()     // Catch:{ all -> 0x0012 }
            de.ozerov.fully.SoundMeterService r0 = r9.f10078a     // Catch:{ all -> 0x0012 }
            java.lang.String r3 = "Acoustic motion detection failed to start"
            n2.a.a1(r2, r0, r3)     // Catch:{ all -> 0x0012 }
            android.media.MediaRecorder r0 = r9.f10079b     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r0 == 0) goto L_0x00ab
            r0.release()     // Catch:{ all -> 0x0012 }
            r9.f10079b = r2     // Catch:{ all -> 0x0012 }
        L_0x00ab:
            java.util.Timer r0 = r9.f10080c     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x00b9
            r0.cancel()     // Catch:{ all -> 0x0012 }
            java.util.Timer r0 = r9.f10080c     // Catch:{ all -> 0x0012 }
            r0.purge()     // Catch:{ all -> 0x0012 }
            r9.f10080c = r2     // Catch:{ all -> 0x0012 }
        L_0x00b9:
            android.os.Handler r0 = r9.f10081d     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x00c0
            r0.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0012 }
        L_0x00c0:
            monitor-exit(r9)
            return r1
        L_0x00c2:
            monitor-exit(r9)
            return r2
        L_0x00c4:
            monitor-exit(r9)     // Catch:{ all -> 0x0012 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.L3.a():boolean");
    }

    public final synchronized void b() {
        Timer timer = this.f10080c;
        if (timer != null) {
            timer.cancel();
            this.f10080c.purge();
            this.f10080c = null;
        }
        Handler handler = this.f10081d;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        MediaRecorder mediaRecorder = this.f10079b;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
                this.f10079b.release();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            this.f10079b = null;
        }
    }
}
