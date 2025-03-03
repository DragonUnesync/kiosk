package de.ozerov.fully;

import android.telephony.data.ApnSetting;
import android.webkit.TracingConfig;

/* renamed from: de.ozerov.fully.b0  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0669b0 {
    public static /* synthetic */ ApnSetting.Builder d() {
        return new ApnSetting.Builder();
    }

    public static /* bridge */ /* synthetic */ ApnSetting f(Object obj) {
        return (ApnSetting) obj;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void j() {
        /*
            android.telephony.data.ApnSetting$Builder r0 = new android.telephony.data.ApnSetting$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0669b0.j():void");
    }

    public static /* synthetic */ void w() {
        new TracingConfig.Builder();
    }
}
