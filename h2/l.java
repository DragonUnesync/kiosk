package H2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

public final class l implements e {

    /* renamed from: X  reason: collision with root package name */
    public static final String[] f1966X = {"_data"};

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1967U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f1968V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f1969W;

    public /* synthetic */ l(Object obj, int i, Object obj2) {
        this.f1967U = i;
        this.f1968V = obj;
        this.f1969W = obj2;
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void g() {
    }

    private final void h() {
    }

    public final Class a() {
        switch (this.f1967U) {
            case 0:
                return File.class;
            default:
                return ((z) this.f1969W).b();
        }
    }

    public final void b() {
        int i = this.f1967U;
    }

    public final void cancel() {
        int i = this.f1967U;
    }

    public final int e() {
        switch (this.f1967U) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public final void f(f fVar, d dVar) {
        Object obj;
        switch (this.f1967U) {
            case 0:
                Cursor query = ((Context) this.f1968V).getContentResolver().query((Uri) this.f1969W, f1966X, (String) null, (String[]) null, (String) null);
                String str = null;
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow("_data"));
                        }
                    } finally {
                        query.close();
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    dVar.c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f1969W)));
                    return;
                }
                dVar.d(new File(str));
                return;
            default:
                byte[] bArr = (byte[]) this.f1968V;
                switch (((z) this.f1969W).f2000U) {
                    case 1:
                        obj = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        obj = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar.d(obj);
                return;
        }
    }
}
