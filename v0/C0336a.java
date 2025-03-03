package V0;

import android.content.ClipData;
import android.view.ContentInfo;
import android.view.View;
import android.window.SplashScreenView;

/* renamed from: V0.a  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0336a {
    public static /* synthetic */ ContentInfo.Builder i(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo k(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView n(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean z(View view) {
        return view instanceof SplashScreenView;
    }
}
