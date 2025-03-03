package D;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class I {

    /* renamed from: h  reason: collision with root package name */
    public static final C0036c f786h = new C0036c("camerax.core.captureConfig.rotation", Integer.TYPE, (CaptureRequest.Key) null);
    public static final C0036c i = new C0036c("camerax.core.captureConfig.jpegQuality", Integer.class, (CaptureRequest.Key) null);

    /* renamed from: j  reason: collision with root package name */
    public static final C0036c f787j = new C0036c("camerax.core.captureConfig.resolvedFrameRate", Range.class, (CaptureRequest.Key) null);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f788a;

    /* renamed from: b  reason: collision with root package name */
    public final C0053k0 f789b;

    /* renamed from: c  reason: collision with root package name */
    public final int f790c;

    /* renamed from: d  reason: collision with root package name */
    public final List f791d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final H0 f792f;

    /* renamed from: g  reason: collision with root package name */
    public final C0064s f793g;

    public I(ArrayList arrayList, C0053k0 k0Var, int i8, ArrayList arrayList2, boolean z, H0 h02, C0064s sVar) {
        this.f788a = arrayList;
        this.f789b = k0Var;
        this.f790c = i8;
        this.f791d = DesugarCollections.unmodifiableList(arrayList2);
        this.e = z;
        this.f792f = h02;
        this.f793g = sVar;
    }

    public final int a() {
        int i8 = 0;
        try {
            i8 = this.f789b.b0(L0.f808B);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) i8;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int b() {
        int i8 = 0;
        try {
            i8 = this.f789b.b0(L0.f809C);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) i8;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
