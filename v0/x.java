package V0;

import B.q0;
import android.media.AudioTrack;

public final class x extends AudioTrack.StreamEventCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0 f5610a;

    public x(q0 q0Var) {
        this.f5610a = q0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r1 = (V0.y) r0.f5610a.f302X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDataRequest(android.media.AudioTrack r1, int r2) {
        /*
            r0 = this;
            B.q0 r2 = r0.f5610a
            java.lang.Object r2 = r2.f302X
            V0.y r2 = (V0.y) r2
            android.media.AudioTrack r2 = r2.f5668v
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x000f
            return
        L_0x000f:
            B.q0 r1 = r0.f5610a
            java.lang.Object r1 = r1.f302X
            V0.y r1 = (V0.y) r1
            H3.P r2 = r1.f5664r
            if (r2 == 0) goto L_0x0028
            boolean r1 = r1.f5635V
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r2.f2027U
            V0.B r1 = (V0.B) r1
            T0.A r1 = r1.f8871z0
            if (r1 == 0) goto L_0x0028
            r1.a()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.x.onDataRequest(android.media.AudioTrack, int):void");
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(((y) this.f5610a.f302X).f5668v)) {
            ((y) this.f5610a.f302X).f5634U = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r2 = (V0.y) r1.f5610a.f302X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTearDown(android.media.AudioTrack r2) {
        /*
            r1 = this;
            B.q0 r0 = r1.f5610a
            java.lang.Object r0 = r0.f302X
            V0.y r0 = (V0.y) r0
            android.media.AudioTrack r0 = r0.f5668v
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x000f
            return
        L_0x000f:
            B.q0 r2 = r1.f5610a
            java.lang.Object r2 = r2.f302X
            V0.y r2 = (V0.y) r2
            H3.P r0 = r2.f5664r
            if (r0 == 0) goto L_0x0028
            boolean r2 = r2.f5635V
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r0.f2027U
            V0.B r2 = (V0.B) r2
            T0.A r2 = r2.f8871z0
            if (r2 == 0) goto L_0x0028
            r2.a()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.x.onTearDown(android.media.AudioTrack):void");
    }
}
