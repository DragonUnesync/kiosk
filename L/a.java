package L;

import android.util.Size;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Size f2673a = new Size(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Size f2674b = new Size(640, 480);

    /* renamed from: c  reason: collision with root package name */
    public static final Size f2675c = new Size(720, 480);

    /* renamed from: d  reason: collision with root package name */
    public static final Size f2676d = new Size(1280, 720);
    public static final Size e = new Size(1920, 1080);

    /* renamed from: f  reason: collision with root package name */
    public static final Size f2677f = new Size(1920, 1440);

    static {
        new Size(320, 240);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
