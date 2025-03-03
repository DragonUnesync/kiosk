package D2;

import A.f;
import A.h;
import A4.d;
import G.i;
import G.k;
import L3.b;
import M0.C0128p;
import P0.l;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Range;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import h.C1007H;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import l1.j;
import n.m;
import n.x;
import o.C1269g;
import o.C1277k;
import t0.C1417e;
import t0.C1418f;
import u.C1465f;
import u.C1482w;
import u.c0;

public final class G implements x, c0 {

    /* renamed from: U  reason: collision with root package name */
    public boolean f1051U;

    /* renamed from: V  reason: collision with root package name */
    public Object f1052V;

    public /* synthetic */ G(Object obj) {
        this.f1052V = obj;
    }

    public void C() {
    }

    public void a(m mVar, boolean z) {
        C1277k kVar;
        if (!this.f1051U) {
            this.f1051U = true;
            C1007H h5 = (C1007H) this.f1052V;
            ActionMenuView actionMenuView = h5.f12113a.f14023a.f7576U;
            if (!(actionMenuView == null || (kVar = actionMenuView.f7448q0) == null)) {
                kVar.c();
                C1269g gVar = kVar.f13997n0;
                if (gVar != null && gVar.b()) {
                    gVar.i.dismiss();
                }
            }
            h5.f12114b.onPanelClosed(108, mVar);
            this.f1051U = false;
        }
    }

    public void b(TotalCaptureResult totalCaptureResult) {
    }

    public void c(int i) {
        l.j(!this.f1051U);
        ((SparseBooleanArray) this.f1052V).append(i, true);
    }

    public C0128p d() {
        l.j(!this.f1051U);
        this.f1051U = true;
        return new C0128p((SparseBooleanArray) this.f1052V);
    }

    public CameraCaptureSession.CaptureCallback e(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f1051U) {
            return captureCallback;
        }
        C1465f fVar = new C1465f(3);
        b bVar = (b) fVar.f15614b;
        ((List) this.f1052V).add(bVar);
        Log.d("RequestMonitor", "RequestListener " + fVar + " monitoring " + this);
        bVar.d(new d(this, fVar, bVar, 16), D7.b.l());
        return new C1482w(Arrays.asList(new CameraCaptureSession.CaptureCallback[]{fVar, captureCallback}));
    }

    public boolean f() {
        return this.f1051U;
    }

    public b g() {
        List list = (List) this.f1052V;
        if (list.isEmpty()) {
            return k.f1612W;
        }
        G.m mVar = new G.m(new ArrayList(new ArrayList(list)), false, D7.b.l());
        j jVar = new j(7);
        return i.d(i.f(mVar, new f(20, (Object) jVar), D7.b.l()));
    }

    public boolean h(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        } else if (((C1417e) this.f1052V) == null) {
            return f();
        } else {
            char c8 = 2;
            for (int i8 = 0; i8 < i && c8 == 2; i8++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i8));
                G g8 = C1418f.f15178a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                                break;
                            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                                break;
                            default:
                                c8 = 2;
                                break;
                        }
                    }
                    c8 = 0;
                }
                c8 = 1;
            }
            if (c8 == 0) {
                return true;
            }
            if (c8 != 1) {
                return f();
            }
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, android.media.MediaPlayer$OnCompletionListener] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.media.MediaPlayer$OnErrorListener, java.lang.Object] */
    public void i() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new Object());
        mediaPlayer.setOnErrorListener(new Object());
        try {
            openRawResourceFd = ((Context) this.f1052V).getResources().openRawResourceFd(2131886089);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            Log.w("G", e);
            mediaPlayer.reset();
            mediaPlayer.release();
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    public synchronized void j(D d8, boolean z) {
        try {
            if (!this.f1051U) {
                if (!z) {
                    this.f1051U = true;
                    d8.e();
                    this.f1051U = false;
                }
            }
            ((Handler) this.f1052V).obtainMessage(1, d8).sendToTarget();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void k(boolean z) {
        if (z != this.f1051U) {
            this.f1051U = z;
            if (!z) {
                synchronized (((Y0.b) this.f1052V).f6312a) {
                }
            }
        }
    }

    public void l() {
        LinkedList linkedList = new LinkedList((List) this.f1052V);
        while (!linkedList.isEmpty()) {
            b bVar = (b) linkedList.poll();
            Objects.requireNonNull(bVar);
            bVar.cancel(true);
        }
    }

    public void m(h hVar) {
        hVar.g(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(1.0f));
        if (this.f1051U && Build.VERSION.SDK_INT >= 34) {
            hVar.g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
        }
    }

    public boolean n(m mVar) {
        ((C1007H) this.f1052V).f12114b.onMenuOpened(108, mVar);
        return true;
    }

    public float o() {
        return ((Float) ((Range) this.f1052V).getUpper()).floatValue();
    }

    public float y() {
        return ((Float) ((Range) this.f1052V).getLower()).floatValue();
    }

    public /* synthetic */ G(Object obj, boolean z) {
        this.f1051U = z;
        this.f1052V = obj;
    }

    public G(int i) {
        switch (i) {
            case 1:
                this.f1052V = new SparseBooleanArray();
                return;
            default:
                this.f1052V = new Handler(Looper.getMainLooper(), new B3.d(1));
                return;
        }
    }

    public G(boolean z) {
        this.f1052V = DesugarCollections.synchronizedList(new ArrayList());
        this.f1051U = z;
    }

    public G(C1417e eVar, boolean z) {
        this((Object) eVar);
        this.f1051U = z;
    }
}
