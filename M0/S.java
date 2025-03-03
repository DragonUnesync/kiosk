package M0;

import Q0.a;
import Q0.e;
import Q0.f;
import Z0.r;
import Z0.s;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.activity.result.i;
import androidx.fragment.app.C0451b;
import androidx.fragment.app.C0452c;
import androidx.fragment.app.H;
import androidx.fragment.app.M;
import androidx.fragment.app.P;
import androidx.recyclerview.widget.C0512x;
import androidx.recyclerview.widget.p0;
import androidx.recyclerview.widget.q0;
import androidx.versionedparcelable.ParcelImpl;
import c.C0602d;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.d;
import com.google.android.material.datepicker.o;
import com.samsung.android.knox.EnterpriseDeviceManager;
import e2.C0837j;
import e3.g;

public final class S implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2858a;

    public /* synthetic */ S(int i) {
        this.f2858a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: c.b} */
    /* JADX WARNING: type inference failed for: r6v3, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r1v16, types: [java.lang.Object, androidx.fragment.app.H] */
    /* JADX WARNING: type inference failed for: r1v17, types: [androidx.fragment.app.M, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v19, types: [androidx.recyclerview.widget.x, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v20, types: [java.lang.Object, androidx.recyclerview.widget.p0] */
    /* JADX WARNING: type inference failed for: r1v21, types: [java.lang.Object, androidx.recyclerview.widget.q0] */
    /* JADX WARNING: type inference failed for: r1v22, types: [c.d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v5, types: [c.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v10, types: [android.view.ViewGroup$MarginLayoutParams, java.lang.Object, e3.e] */
    /* JADX WARNING: type inference failed for: r6v11, types: [android.view.ViewGroup$MarginLayoutParams, e3.g, java.lang.Object, androidx.recyclerview.widget.S] */
    /* JADX WARNING: type inference failed for: r1v61, types: [e3.i, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v63, types: [android.view.View$BaseSavedState, java.lang.Object, n3.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0363  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r20) {
        /*
            r19 = this;
            r0 = r20
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = r19
            int r10 = r9.f2858a
            switch(r10) {
                case 0: goto L_0x039a;
                case 1: goto L_0x0394;
                case 2: goto L_0x038e;
                case 3: goto L_0x0388;
                case 4: goto L_0x0382;
                case 5: goto L_0x037c;
                case 6: goto L_0x0376;
                case 7: goto L_0x0308;
                case 8: goto L_0x0302;
                case 9: goto L_0x02f4;
                case 10: goto L_0x02ee;
                case 11: goto L_0x02c0;
                case 12: goto L_0x02ba;
                case 13: goto L_0x02b4;
                case 14: goto L_0x02a2;
                case 15: goto L_0x0254;
                case 16: goto L_0x024e;
                case 17: goto L_0x0233;
                case 18: goto L_0x020b;
                case 19: goto L_0x01b0;
                case 20: goto L_0x0188;
                case 21: goto L_0x014d;
                case 22: goto L_0x0143;
                case 23: goto L_0x0136;
                case 24: goto L_0x0130;
                case 25: goto L_0x00b5;
                case 26: goto L_0x0045;
                case 27: goto L_0x0033;
                case 28: goto L_0x002d;
                default: goto L_0x0015;
            }
        L_0x0015:
            n3.b r1 = new n3.b
            r1.<init>(r0)
            java.lang.Class<n3.b> r2 = n3.b.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Object r0 = r0.readValue(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.f13760U = r0
            return r1
        L_0x002d:
            androidx.versionedparcelable.ParcelImpl r1 = new androidx.versionedparcelable.ParcelImpl
            r1.<init>(r0)
            return r1
        L_0x0033:
            e3.i r1 = new e3.i
            r1.<init>()
            int r2 = r20.readInt()
            r1.f11253U = r2
            int r0 = r20.readInt()
            r1.f11254V = r0
            return r1
        L_0x0045:
            e3.g r6 = new e3.g
            r10 = -2
            r6.<init>((int) r10, (int) r10)
            r6.f11237Y = r5
            r6.f11238Z = r4
            r6.f11239a0 = r3
            r6.f11240b0 = r2
            r6.f11243e0 = r1
            r6.f11244f0 = r1
            float r1 = r20.readFloat()
            r6.f11237Y = r1
            float r1 = r20.readFloat()
            r6.f11238Z = r1
            int r1 = r20.readInt()
            r6.f11239a0 = r1
            float r1 = r20.readFloat()
            r6.f11240b0 = r1
            int r1 = r20.readInt()
            r6.f11241c0 = r1
            int r1 = r20.readInt()
            r6.f11242d0 = r1
            int r1 = r20.readInt()
            r6.f11243e0 = r1
            int r1 = r20.readInt()
            r6.f11244f0 = r1
            byte r1 = r20.readByte()
            if (r1 == 0) goto L_0x008e
            r7 = 1
        L_0x008e:
            r6.f11245g0 = r7
            int r1 = r20.readInt()
            r6.bottomMargin = r1
            int r1 = r20.readInt()
            r6.leftMargin = r1
            int r1 = r20.readInt()
            r6.rightMargin = r1
            int r1 = r20.readInt()
            r6.topMargin = r1
            int r1 = r20.readInt()
            r6.height = r1
            int r0 = r20.readInt()
            r6.width = r0
            return r6
        L_0x00b5:
            e3.e r6 = new e3.e
            r6.<init>(r7, r7)
            r6.f11220U = r8
            r6.f11221V = r5
            r6.f11222W = r4
            r6.f11223X = r3
            r6.f11224Y = r2
            r6.f11225Z = r3
            r6.f11226a0 = r3
            r6.f11227b0 = r1
            r6.f11228c0 = r1
            int r1 = r20.readInt()
            r6.f11220U = r1
            float r1 = r20.readFloat()
            r6.f11221V = r1
            float r1 = r20.readFloat()
            r6.f11222W = r1
            int r1 = r20.readInt()
            r6.f11223X = r1
            float r1 = r20.readFloat()
            r6.f11224Y = r1
            int r1 = r20.readInt()
            r6.f11225Z = r1
            int r1 = r20.readInt()
            r6.f11226a0 = r1
            int r1 = r20.readInt()
            r6.f11227b0 = r1
            int r1 = r20.readInt()
            r6.f11228c0 = r1
            byte r1 = r20.readByte()
            if (r1 == 0) goto L_0x0109
            r7 = 1
        L_0x0109:
            r6.f11229d0 = r7
            int r1 = r20.readInt()
            r6.bottomMargin = r1
            int r1 = r20.readInt()
            r6.leftMargin = r1
            int r1 = r20.readInt()
            r6.rightMargin = r1
            int r1 = r20.readInt()
            r6.topMargin = r1
            int r1 = r20.readInt()
            r6.height = r1
            int r0 = r20.readInt()
            r6.width = r0
            return r6
        L_0x0130:
            e2.j r1 = new e2.j
            r1.<init>(r0)
            return r1
        L_0x0136:
            int r1 = r20.readInt()
            int r0 = r20.readInt()
            com.google.android.material.datepicker.o r0 = com.google.android.material.datepicker.o.k(r1, r0)
            return r0
        L_0x0143:
            com.google.android.material.datepicker.d r1 = new com.google.android.material.datepicker.d
            long r2 = r20.readLong()
            r1.<init>(r2)
            return r1
        L_0x014d:
            java.lang.Class<com.google.android.material.datepicker.o> r1 = com.google.android.material.datepicker.o.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            r4 = r2
            com.google.android.material.datepicker.o r4 = (com.google.android.material.datepicker.o) r4
            java.lang.ClassLoader r2 = r1.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            r5 = r2
            com.google.android.material.datepicker.o r5 = (com.google.android.material.datepicker.o) r5
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r7 = r1
            com.google.android.material.datepicker.o r7 = (com.google.android.material.datepicker.o) r7
            java.lang.Class<com.google.android.material.datepicker.d> r1 = com.google.android.material.datepicker.d.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r6 = r1
            com.google.android.material.datepicker.d r6 = (com.google.android.material.datepicker.d) r6
            int r8 = r20.readInt()
            com.google.android.material.datepicker.b r0 = new com.google.android.material.datepicker.b
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x0188:
            c.d r1 = new c.d
            r1.<init>()
            android.os.IBinder r0 = r20.readStrongBinder()
            int r2 = c.C0601c.f8704c
            if (r0 != 0) goto L_0x0196
            goto L_0x01ad
        L_0x0196:
            java.lang.String r2 = c.C0600b.f8703a
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            if (r2 == 0) goto L_0x01a6
            boolean r3 = r2 instanceof c.C0600b
            if (r3 == 0) goto L_0x01a6
            r6 = r2
            c.b r6 = (c.C0600b) r6
            goto L_0x01ad
        L_0x01a6:
            c.a r6 = new c.a
            r6.<init>()
            r6.f8702b = r0
        L_0x01ad:
            r1.f8706U = r6
            return r1
        L_0x01b0:
            androidx.recyclerview.widget.q0 r1 = new androidx.recyclerview.widget.q0
            r1.<init>()
            int r2 = r20.readInt()
            r1.f8495U = r2
            int r2 = r20.readInt()
            r1.f8496V = r2
            int r2 = r20.readInt()
            r1.f8497W = r2
            if (r2 <= 0) goto L_0x01d0
            int[] r2 = new int[r2]
            r1.f8498X = r2
            r0.readIntArray(r2)
        L_0x01d0:
            int r2 = r20.readInt()
            r1.f8499Y = r2
            if (r2 <= 0) goto L_0x01df
            int[] r2 = new int[r2]
            r1.f8500Z = r2
            r0.readIntArray(r2)
        L_0x01df:
            int r2 = r20.readInt()
            if (r2 != r8) goto L_0x01e7
            r2 = 1
            goto L_0x01e8
        L_0x01e7:
            r2 = 0
        L_0x01e8:
            r1.f8502b0 = r2
            int r2 = r20.readInt()
            if (r2 != r8) goto L_0x01f2
            r2 = 1
            goto L_0x01f3
        L_0x01f2:
            r2 = 0
        L_0x01f3:
            r1.f8503c0 = r2
            int r2 = r20.readInt()
            if (r2 != r8) goto L_0x01fc
            r7 = 1
        L_0x01fc:
            r1.f8504d0 = r7
            java.lang.Class<androidx.recyclerview.widget.p0> r2 = androidx.recyclerview.widget.p0.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.util.ArrayList r0 = r0.readArrayList(r2)
            r1.f8501a0 = r0
            return r1
        L_0x020b:
            androidx.recyclerview.widget.p0 r1 = new androidx.recyclerview.widget.p0
            r1.<init>()
            int r2 = r20.readInt()
            r1.f8487U = r2
            int r2 = r20.readInt()
            r1.f8488V = r2
            int r2 = r20.readInt()
            if (r2 != r8) goto L_0x0223
            r7 = 1
        L_0x0223:
            r1.f8490X = r7
            int r2 = r20.readInt()
            if (r2 <= 0) goto L_0x0232
            int[] r2 = new int[r2]
            r1.f8489W = r2
            r0.readIntArray(r2)
        L_0x0232:
            return r1
        L_0x0233:
            androidx.recyclerview.widget.x r1 = new androidx.recyclerview.widget.x
            r1.<init>()
            int r2 = r20.readInt()
            r1.f8544U = r2
            int r2 = r20.readInt()
            r1.f8545V = r2
            int r0 = r20.readInt()
            if (r0 != r8) goto L_0x024b
            r7 = 1
        L_0x024b:
            r1.f8546W = r7
            return r1
        L_0x024e:
            androidx.fragment.app.P r1 = new androidx.fragment.app.P
            r1.<init>((android.os.Parcel) r0)
            return r1
        L_0x0254:
            androidx.fragment.app.M r1 = new androidx.fragment.app.M
            r1.<init>()
            r1.f7900Y = r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7901Z = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7902a0 = r2
            java.util.ArrayList r2 = r20.createStringArrayList()
            r1.f7896U = r2
            java.util.ArrayList r2 = r20.createStringArrayList()
            r1.f7897V = r2
            android.os.Parcelable$Creator<androidx.fragment.app.b> r2 = androidx.fragment.app.C0451b.CREATOR
            java.lang.Object[] r2 = r0.createTypedArray(r2)
            androidx.fragment.app.b[] r2 = (androidx.fragment.app.C0451b[]) r2
            r1.f7898W = r2
            int r2 = r20.readInt()
            r1.f7899X = r2
            java.lang.String r2 = r20.readString()
            r1.f7900Y = r2
            java.util.ArrayList r2 = r20.createStringArrayList()
            r1.f7901Z = r2
            android.os.Parcelable$Creator<androidx.fragment.app.c> r2 = androidx.fragment.app.C0452c.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r2)
            r1.f7902a0 = r2
            android.os.Parcelable$Creator<androidx.fragment.app.H> r2 = androidx.fragment.app.H.CREATOR
            java.util.ArrayList r0 = r0.createTypedArrayList(r2)
            r1.f7903b0 = r0
            return r1
        L_0x02a2:
            androidx.fragment.app.H r1 = new androidx.fragment.app.H
            r1.<init>()
            java.lang.String r2 = r20.readString()
            r1.f7851U = r2
            int r0 = r20.readInt()
            r1.f7852V = r0
            return r1
        L_0x02b4:
            androidx.fragment.app.c r1 = new androidx.fragment.app.c
            r1.<init>(r0)
            return r1
        L_0x02ba:
            androidx.fragment.app.b r1 = new androidx.fragment.app.b
            r1.<init>((android.os.Parcel) r0)
            return r1
        L_0x02c0:
            java.lang.String r1 = "inParcel"
            P6.f.e(r0, r1)
            androidx.activity.result.i r1 = new androidx.activity.result.i
            java.lang.Class<android.content.IntentSender> r2 = android.content.IntentSender.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            P6.f.b(r2)
            android.content.IntentSender r2 = (android.content.IntentSender) r2
            java.lang.Class<android.content.Intent> r3 = android.content.Intent.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r0.readParcelable(r3)
            android.content.Intent r3 = (android.content.Intent) r3
            int r4 = r20.readInt()
            int r0 = r20.readInt()
            r1.<init>(r2, r3, r4, r0)
            return r1
        L_0x02ee:
            androidx.activity.result.a r1 = new androidx.activity.result.a
            r1.<init>(r0)
            return r1
        L_0x02f4:
            android.support.v4.media.RatingCompat r1 = new android.support.v4.media.RatingCompat
            int r2 = r20.readInt()
            float r0 = r20.readFloat()
            r1.<init>(r2, r0)
            return r1
        L_0x0302:
            android.support.v4.media.MediaMetadataCompat r1 = new android.support.v4.media.MediaMetadataCompat
            r1.<init>(r0)
            return r1
        L_0x0308:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.os.Parcelable$Creator r2 = android.media.MediaDescription.CREATOR
            java.lang.Object r0 = r2.createFromParcel(r0)
            if (r0 == 0) goto L_0x0375
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            java.lang.String r11 = android.support.v4.media.a.g(r0)
            java.lang.CharSequence r12 = android.support.v4.media.a.i(r0)
            java.lang.CharSequence r13 = android.support.v4.media.a.h(r0)
            java.lang.CharSequence r14 = android.support.v4.media.a.c(r0)
            android.graphics.Bitmap r15 = android.support.v4.media.a.e(r0)
            android.net.Uri r16 = android.support.v4.media.a.f(r0)
            android.os.Bundle r2 = android.support.v4.media.a.d(r0)
            if (r2 == 0) goto L_0x0336
            android.os.Bundle r2 = android.support.v4.media.session.b.S(r2)
        L_0x0336:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0341
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x0342
        L_0x0341:
            r4 = r6
        L_0x0342:
            if (r4 == 0) goto L_0x035c
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r2.containsKey(r5)
            if (r7 == 0) goto L_0x0356
            int r7 = r2.size()
            r8 = 2
            if (r7 != r8) goto L_0x0356
            r17 = r6
            goto L_0x035e
        L_0x0356:
            r2.remove(r3)
            r2.remove(r5)
        L_0x035c:
            r17 = r2
        L_0x035e:
            if (r4 == 0) goto L_0x0363
            r18 = r4
            goto L_0x036d
        L_0x0363:
            r2 = 23
            if (r1 < r2) goto L_0x036b
            android.net.Uri r6 = android.support.v4.media.b.a(r0)
        L_0x036b:
            r18 = r6
        L_0x036d:
            android.support.v4.media.MediaDescriptionCompat r6 = new android.support.v4.media.MediaDescriptionCompat
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r6.f7229c0 = r0
        L_0x0375:
            return r6
        L_0x0376:
            android.support.v4.media.MediaBrowserCompat$MediaItem r1 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            r1.<init>(r0)
            return r1
        L_0x037c:
            Z0.r r1 = new Z0.r
            r1.<init>(r0)
            return r1
        L_0x0382:
            Z0.s r1 = new Z0.s
            r1.<init>(r0)
            return r1
        L_0x0388:
            Q0.f r1 = new Q0.f
            r1.<init>(r0)
            return r1
        L_0x038e:
            Q0.e r1 = new Q0.e
            r1.<init>(r0)
            return r1
        L_0x0394:
            Q0.a r1 = new Q0.a
            r1.<init>(r0)
            return r1
        L_0x039a:
            M0.T r1 = new M0.T
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.S.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i) {
        switch (this.f2858a) {
            case 0:
                return new T[i];
            case 1:
                return new a[i];
            case 2:
                return new e[i];
            case 3:
                return new f[i];
            case 4:
                return new s[i];
            case 5:
                return new r[i];
            case 6:
                return new MediaBrowserCompat$MediaItem[i];
            case 7:
                return new MediaDescriptionCompat[i];
            case 8:
                return new MediaMetadataCompat[i];
            case 9:
                return new RatingCompat[i];
            case 10:
                return new androidx.activity.result.a[i];
            case 11:
                return new i[i];
            case 12:
                return new C0451b[i];
            case 13:
                return new C0452c[i];
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                return new H[i];
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                return new M[i];
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                return new P[i];
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                return new C0512x[i];
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                return new p0[i];
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                return new q0[i];
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                return new C0602d[i];
            case 21:
                return new b[i];
            case 22:
                return new d[i];
            case 23:
                return new o[i];
            case 24:
                return new C0837j[i];
            case 25:
                return new e3.e[i];
            case 26:
                return new g[i];
            case 27:
                return new e3.i[i];
            case 28:
                return new ParcelImpl[i];
            default:
                return new n3.b[i];
        }
    }
}
