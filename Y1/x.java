package Y1;

import B.C0002c;
import androidx.media3.ui.PlayerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final /* synthetic */ class x implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerView f6567a;

    public /* synthetic */ x(PlayerView playerView) {
        this.f6567a = playerView;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int i = PlayerView.f8209D0;
        PlayerView playerView = this.f6567a;
        playerView.getClass();
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        playerView.f8227l0.post(new C0002c((Object) playerView, 27, (Object) objArr[1]));
        return null;
    }
}
