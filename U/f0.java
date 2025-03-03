package u;

import android.hardware.camera2.params.InputConfiguration;

public abstract /* synthetic */ class f0 {
    public static /* synthetic */ InputConfiguration a(int i, int i8, int i9) {
        return new InputConfiguration(i, i8, i9);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void c() {
        /*
            android.hardware.camera2.params.InputConfiguration r0 = new android.hardware.camera2.params.InputConfiguration
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.f0.c():void");
    }
}
