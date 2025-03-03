package P5;

import E7.b;
import de.ozerov.fully.C0794w0;
import java.io.File;

/* renamed from: P5.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0141d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3899U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0142e f3900V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ File f3901W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ File f3902X;

    public /* synthetic */ C0141d(C0142e eVar, File file, File file2, int i) {
        this.f3899U = i;
        this.f3900V = eVar;
        this.f3901W = file;
        this.f3902X = file2;
    }

    public final void run() {
        switch (this.f3899U) {
            case 0:
                File file = this.f3901W;
                File file2 = this.f3902X;
                String str = this.f3900V.f3878a;
                try {
                    b.c(file, file2);
                    C0794w0.q0(0, str, "Finished copy folder " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
                    return;
                } catch (Exception e) {
                    C0794w0.q0(1, str, "Failed to copy folder due to " + e.getMessage());
                    return;
                }
            default:
                File file3 = this.f3901W;
                File file4 = this.f3902X;
                String str2 = this.f3900V.f3878a;
                try {
                    b.c(file3, file4);
                    C0794w0.q0(0, str2, "Finished copy file " + file3.getAbsolutePath() + " to " + file4.getAbsolutePath());
                    return;
                } catch (Exception e8) {
                    C0794w0.q0(1, str2, "Failed to copy file due to " + e8.getMessage());
                    return;
                }
        }
    }
}
