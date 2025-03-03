package de.ozerov.fully;

import L0.c;
import O5.g;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.ToneGenerator;
import android.os.Handler;
import android.util.Log;
import n2.a;

public final class Q3 {

    /* renamed from: a  reason: collision with root package name */
    public MediaPlayer f10296a;

    /* renamed from: b  reason: collision with root package name */
    public ToneGenerator f10297b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f10298c = false;

    /* renamed from: d  reason: collision with root package name */
    public volatile String f10299d = null;
    public int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final FullyActivity f10300f;

    /* renamed from: g  reason: collision with root package name */
    public int f10301g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10302h;

    public Q3(FullyActivity fullyActivity) {
        this.f10300f = fullyActivity;
    }

    public final void a(String str, boolean z, boolean z6, int i) {
        if (!this.f10298c) {
            this.f10302h = z6;
            this.f10301g = i;
            if (z6) {
                FullyActivity fullyActivity = this.f10300f;
                c.a(fullyActivity).c(new Intent("com.fullykiosk.singleapp.event.alarm_sound_start"));
                try {
                    AudioManager audioManager = (AudioManager) fullyActivity.getSystemService("audio");
                    this.e = audioManager.getStreamVolume(this.f10301g);
                    int streamMaxVolume = audioManager.getStreamMaxVolume(this.f10301g);
                    g.b(this.f10301g, streamMaxVolume);
                    audioManager.setStreamVolume(this.f10301g, streamMaxVolume, 8);
                    int i8 = this.f10301g;
                    Log.i("g", "Block change volume for stream: " + i8);
                    g.f3678d = i8;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            if (str == null || str.isEmpty()) {
                try {
                    if (this.f10297b == null) {
                        this.f10297b = new ToneGenerator(i, 100);
                    }
                    this.f10297b.startTone(93);
                    this.f10298c = true;
                    this.f10299d = "tone://TONE_CDMA_ALERT_CALL_GUARD";
                    Handler handler = new Handler();
                    handler.postDelayed(new P3(this, z, handler, z6), 1000);
                } catch (Exception e9) {
                    e9.printStackTrace();
                    if (z6) {
                        b();
                    }
                }
            } else {
                try {
                    if (this.f10296a == null) {
                        this.f10296a = new MediaPlayer();
                    }
                    if (str.startsWith("assets://")) {
                        AssetFileDescriptor openFd = this.f10300f.getAssets().openFd(str.replace("assets://", ""));
                        this.f10296a.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        openFd.close();
                    } else {
                        this.f10296a.setDataSource(str);
                    }
                    this.f10296a.setAudioStreamType(i);
                    if (i == 4) {
                        this.f10296a.setAudioAttributes(new AudioAttributes.Builder().setUsage(4).setContentType(2).build());
                    }
                    this.f10296a.prepareAsync();
                    this.f10298c = true;
                    this.f10299d = str;
                    this.f10296a.setOnCompletionListener(new M3(this, z, z6));
                    this.f10296a.setOnErrorListener(new N3(this, z6));
                    this.f10296a.setOnPreparedListener(new O3(z));
                } catch (Exception unused) {
                    if (z6) {
                        b();
                    }
                    a.a1(1, this.f10300f, "Failed loading sound: Wrong URL or unsupported format?");
                }
            }
        }
    }

    public final void b() {
        FullyActivity fullyActivity = this.f10300f;
        c.a(fullyActivity).c(new Intent("com.fullykiosk.singleapp.event.alarm_sound_stop"));
        if (this.e != -1) {
            try {
                g.b(this.f10301g, this.e);
                ((AudioManager) fullyActivity.getSystemService("audio")).setStreamVolume(this.f10301g, this.e, 0);
                this.e = -1;
                Log.i("g", "Block change volume for stream: -1");
                g.f3678d = -1;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public final void c() {
        MediaPlayer mediaPlayer = this.f10296a;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f10296a.stop();
            this.f10296a.reset();
        }
        ToneGenerator toneGenerator = this.f10297b;
        if (toneGenerator != null) {
            toneGenerator.stopTone();
        }
        if (this.f10302h) {
            b();
        }
        this.f10298c = false;
        this.f10299d = null;
    }
}
