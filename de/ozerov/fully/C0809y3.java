package de.ozerov.fully;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import z0.C1639a;

/* renamed from: de.ozerov.fully.y3  reason: case insensitive filesystem */
public final class C0809y3 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11116a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11117b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0809y3(K2 k22, Handler handler) {
        super(handler);
        this.f11117b = k22;
    }

    public boolean deliverSelfNotifications() {
        switch (this.f11116a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChange(boolean r8, android.net.Uri r9) {
        /*
            r7 = this;
            int r0 = r7.f11116a
            switch(r0) {
                case 0: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onChange(r8, r9)
            return
        L_0x0009:
            super.onChange(r8, r9)
            r9.toString()
            java.lang.Object r8 = r7.f11117b
            de.ozerov.fully.K2 r8 = (de.ozerov.fully.K2) r8
            java.lang.Object r0 = r8.f10050V
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            boolean r0 = n2.a.g0(r0)
            if (r0 == 0) goto L_0x0055
            java.lang.Object r8 = r8.f10050V
            de.ozerov.fully.FullyActivity r8 = (de.ozerov.fully.FullyActivity) r8
            java.lang.String r0 = "_data"
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IllegalStateException -> 0x0049 }
            java.lang.String r8 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r8, r0}     // Catch:{ IllegalStateException -> 0x0049 }
            r5 = 0
            r6 = 0
            r4 = 0
            r2 = r9
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ IllegalStateException -> 0x0049 }
            if (r8 == 0) goto L_0x0049
            boolean r9 = r8.moveToFirst()     // Catch:{ IllegalStateException -> 0x0049 }
            if (r9 == 0) goto L_0x0049
            int r9 = r8.getColumnIndex(r0)     // Catch:{ IllegalStateException -> 0x0049 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ IllegalStateException -> 0x0049 }
            r8.close()     // Catch:{ IllegalStateException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r9 = 0
        L_0x004a:
            if (r9 == 0) goto L_0x0055
            java.lang.String r8 = r9.toLowerCase()
            java.lang.String r9 = "screenshots"
            r8.contains(r9)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0809y3.onChange(boolean, android.net.Uri):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0809y3(C1639a aVar) {
        super(new Handler());
        this.f11117b = aVar;
    }

    public void onChange(boolean z) {
        Cursor cursor;
        switch (this.f11116a) {
            case 1:
                C1639a aVar = (C1639a) this.f11117b;
                if (aVar.f16405V && (cursor = aVar.f16406W) != null && !cursor.isClosed()) {
                    aVar.f16404U = aVar.f16406W.requery();
                    return;
                }
                return;
            default:
                super.onChange(z);
                return;
        }
    }
}
