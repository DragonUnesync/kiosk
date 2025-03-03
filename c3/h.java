package C3;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

public abstract /* synthetic */ class h {
    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("4565", "Fully Sticky Low Priority", 2);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder j(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void m() {
        /*
            android.media.AudioFocusRequest$Builder r0 = new android.media.AudioFocusRequest$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.h.m():void");
    }
}
