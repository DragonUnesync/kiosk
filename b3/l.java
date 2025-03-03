package B3;

import android.media.MediaCodecInfo;
import android.view.SurfaceControl;

public abstract /* synthetic */ class l {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(int i, int i8, int i9) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i8, i9);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ SurfaceControl.Transaction j() {
        return new SurfaceControl.Transaction();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void l() {
        /*
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r0 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.l.l():void");
    }
}
