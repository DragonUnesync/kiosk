package T0;

import G3.i;
import G3.j;
import G3.l;
import P0.z;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.io.Serializable;

/* renamed from: T0.d  reason: case insensitive filesystem */
public final class C0212d {

    /* renamed from: a  reason: collision with root package name */
    public final i f4791a;

    /* renamed from: b  reason: collision with root package name */
    public final C0211c f4792b;

    /* renamed from: c  reason: collision with root package name */
    public C0229v f4793c;

    /* renamed from: d  reason: collision with root package name */
    public int f4794d;
    public float e = 1.0f;

    public C0212d(Context context, Handler handler, C0229v vVar) {
        i iVar;
        C0210b bVar = new C0210b(context, 0);
        if (bVar instanceof Serializable) {
            iVar = new j(bVar);
        } else {
            iVar = new l(bVar);
        }
        this.f4791a = iVar;
        this.f4793c = vVar;
        this.f4792b = new C0211c(this, handler);
        this.f4794d = 0;
    }

    public final void a() {
        int i = this.f4794d;
        if (i != 1 && i != 0) {
            int i8 = z.f3748a;
            i iVar = this.f4791a;
            if (i8 < 26) {
                ((AudioManager) iVar.get()).abandonAudioFocus(this.f4792b);
            }
        }
    }

    public final void b(int i) {
        float f8;
        if (this.f4794d != i) {
            this.f4794d = i;
            if (i == 4) {
                f8 = 0.2f;
            } else {
                f8 = 1.0f;
            }
            if (this.e != f8) {
                this.e = f8;
                C0229v vVar = this.f4793c;
                if (vVar != null) {
                    C0232y yVar = vVar.f4905U;
                    yVar.N(1, 2, Float.valueOf(yVar.f4931T0 * yVar.f4967w0.e));
                }
            }
        }
    }

    public final int c(int i, boolean z) {
        a();
        b(0);
        return 1;
    }
}
