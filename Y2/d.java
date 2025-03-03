package Y2;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import java.lang.reflect.Field;

public final class d extends Toast {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f6575b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Toast f6576a;

    public d(Context context, Toast toast) {
        super(context);
        this.f6576a = toast;
    }

    public static void a(View view, c cVar) {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = View.class.getDeclaredField("mContext");
                declaredField.setAccessible(true);
                declaredField.set(view, cVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final int getDuration() {
        return this.f6576a.getDuration();
    }

    public final int getGravity() {
        return this.f6576a.getGravity();
    }

    public final float getHorizontalMargin() {
        return this.f6576a.getHorizontalMargin();
    }

    public final float getVerticalMargin() {
        return this.f6576a.getVerticalMargin();
    }

    public final View getView() {
        return this.f6576a.getView();
    }

    public final int getXOffset() {
        return this.f6576a.getXOffset();
    }

    public final int getYOffset() {
        return this.f6576a.getYOffset();
    }

    public final void setDuration(int i) {
        this.f6576a.setDuration(i);
    }

    public final void setGravity(int i, int i8, int i9) {
        this.f6576a.setGravity(i, i8, i9);
    }

    public final void setMargin(float f8, float f9) {
        this.f6576a.setMargin(f8, f9);
    }

    public final void setText(int i) {
        this.f6576a.setText(i);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [Y2.c, android.content.ContextWrapper] */
    public final void setView(View view) {
        this.f6576a.setView(view);
        a(view, new ContextWrapper(view.getContext()));
    }

    public final void show() {
        this.f6576a.show();
    }

    public final void setText(CharSequence charSequence) {
        this.f6576a.setText(charSequence);
    }
}
