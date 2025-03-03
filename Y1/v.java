package Y1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class v extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f6539b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w f6540c;

    public /* synthetic */ v(w wVar, r rVar, int i) {
        this.f6538a = i;
        this.f6540c = wVar;
        this.f6539b = rVar;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f6538a) {
            case 0:
                w wVar = this.f6540c;
                wVar.i(1);
                if (wVar.f6542B) {
                    this.f6539b.post(wVar.f6560s);
                    wVar.f6542B = false;
                    return;
                }
                return;
            case 1:
                w wVar2 = this.f6540c;
                wVar2.i(2);
                if (wVar2.f6542B) {
                    this.f6539b.post(wVar2.f6560s);
                    wVar2.f6542B = false;
                    return;
                }
                return;
            default:
                w wVar3 = this.f6540c;
                wVar3.i(2);
                if (wVar3.f6542B) {
                    this.f6539b.post(wVar3.f6560s);
                    wVar3.f6542B = false;
                    return;
                }
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f6538a) {
            case 0:
                this.f6540c.i(3);
                return;
            case 1:
                this.f6540c.i(3);
                return;
            default:
                this.f6540c.i(3);
                return;
        }
    }
}
