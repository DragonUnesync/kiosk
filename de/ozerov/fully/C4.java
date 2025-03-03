package de.ozerov.fully;

import Z1.c;
import android.content.Context;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.woxthebox.draglistview.R;
import java.util.Formatter;
import java.util.Locale;

public final class C4 extends FrameLayout {

    /* renamed from: U  reason: collision with root package name */
    public A4 f9812U;

    /* renamed from: V  reason: collision with root package name */
    public final Context f9813V;

    /* renamed from: W  reason: collision with root package name */
    public ViewGroup f9814W;

    /* renamed from: a0  reason: collision with root package name */
    public View f9815a0;

    /* renamed from: b0  reason: collision with root package name */
    public ProgressBar f9816b0;

    /* renamed from: c0  reason: collision with root package name */
    public TextView f9817c0;

    /* renamed from: d0  reason: collision with root package name */
    public TextView f9818d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f9819e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f9820f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f9821g0;

    /* renamed from: h0  reason: collision with root package name */
    public StringBuilder f9822h0;

    /* renamed from: i0  reason: collision with root package name */
    public Formatter f9823i0;

    /* renamed from: j0  reason: collision with root package name */
    public ImageButton f9824j0;

    /* renamed from: k0  reason: collision with root package name */
    public ImageButton f9825k0;

    /* renamed from: l0  reason: collision with root package name */
    public ImageButton f9826l0;

    /* renamed from: m0  reason: collision with root package name */
    public ImageButton f9827m0;

    /* renamed from: n0  reason: collision with root package name */
    public ImageButton f9828n0;

    /* renamed from: o0  reason: collision with root package name */
    public final B4 f9829o0 = new B4(this);
    public final C0804x4 p0 = new C0804x4(this, 0);

    /* renamed from: q0  reason: collision with root package name */
    public final C0810y4 f9830q0;

    /* renamed from: r0  reason: collision with root package name */
    public final C0816z4 f9831r0;

    /* renamed from: s0  reason: collision with root package name */
    public final C0816z4 f9832s0;

    public C4(Context context) {
        super(context);
        new C0804x4(this, 1);
        this.f9830q0 = new C0810y4(this);
        this.f9831r0 = new C0816z4(this, 0);
        this.f9832s0 = new C0816z4(this, 1);
        this.f9813V = context;
        this.f9821g0 = true;
        Log.i("C4", "C4");
        Log.i("C4", "C4");
    }

    public final void a() {
        A4 a42 = this.f9812U;
        if (a42 != null) {
            try {
                if (this.f9824j0 != null) {
                    a42.getClass();
                }
                if (this.f9826l0 != null) {
                    this.f9812U.getClass();
                }
                if (this.f9825k0 != null) {
                    this.f9812U.getClass();
                }
            } catch (IncompatibleClassChangeError e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        A4 a42 = this.f9812U;
        if (a42 != null) {
            if (((K4) ((c) a42).f6955V).f10053a.isPlaying()) {
                ((K4) ((c) this.f9812U).f6955V).f10053a.pause();
            } else {
                ((K4) ((c) this.f9812U).f6955V).f10053a.start();
            }
            h();
        }
    }

    public final void c() {
        ViewGroup viewGroup = this.f9814W;
        if (viewGroup != null) {
            try {
                viewGroup.removeView(this);
                this.f9829o0.removeMessages(2);
                Log.d("C4", "Hide VideoController");
            } catch (IllegalArgumentException unused) {
                Log.w("C4", "VideoController already removed");
            }
            this.f9819e0 = false;
        }
    }

    public final void d(View view) {
        int i;
        int i8;
        ImageButton imageButton = (ImageButton) view.findViewById(2131362363);
        this.f9824j0 = imageButton;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.f9824j0.setOnClickListener(this.p0);
        }
        ImageButton imageButton2 = (ImageButton) view.findViewById(2131362083);
        this.f9825k0 = imageButton2;
        boolean z = this.f9821g0;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(this.f9832s0);
            ImageButton imageButton3 = this.f9825k0;
            if (z) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            imageButton3.setVisibility(i8);
        }
        ImageButton imageButton4 = (ImageButton) view.findViewById(2131362420);
        this.f9826l0 = imageButton4;
        if (imageButton4 != null) {
            imageButton4.setOnClickListener(this.f9831r0);
            ImageButton imageButton5 = this.f9826l0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageButton5.setVisibility(i);
        }
        ImageButton imageButton6 = (ImageButton) view.findViewById(2131362307);
        this.f9827m0 = imageButton6;
        if (imageButton6 != null) {
            imageButton6.setVisibility(8);
        }
        ImageButton imageButton7 = (ImageButton) view.findViewById(2131362393);
        this.f9828n0 = imageButton7;
        if (imageButton7 != null) {
            imageButton7.setVisibility(8);
        }
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131362255);
        this.f9816b0 = progressBar;
        if (progressBar != null) {
            if (progressBar instanceof SeekBar) {
                ((SeekBar) progressBar).setOnSeekBarChangeListener(this.f9830q0);
            }
            this.f9816b0.setMax(1000);
        }
        this.f9817c0 = (TextView) view.findViewById(R.id.time);
        this.f9818d0 = (TextView) view.findViewById(2131362577);
        this.f9822h0 = new StringBuilder();
        this.f9823i0 = new Formatter(this.f9822h0, Locale.getDefault());
        ImageButton imageButton8 = this.f9827m0;
        if (imageButton8 != null) {
            imageButton8.setOnClickListener((View.OnClickListener) null);
            this.f9827m0.setEnabled(false);
        }
        ImageButton imageButton9 = this.f9828n0;
        if (imageButton9 != null) {
            imageButton9.setOnClickListener((View.OnClickListener) null);
            this.f9828n0.setEnabled(false);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (this.f9812U == null) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z) {
                b();
                f(3000);
                ImageButton imageButton = this.f9824j0;
                if (imageButton != null) {
                    imageButton.requestFocus();
                }
            }
            return true;
        } else if (keyCode == 126) {
            if (z && !((K4) ((c) this.f9812U).f6955V).f10053a.isPlaying()) {
                ((K4) ((c) this.f9812U).f6955V).f10053a.start();
                h();
                f(3000);
            }
            return true;
        } else if (keyCode == 86 || keyCode == 127) {
            if (z && ((K4) ((c) this.f9812U).f6955V).f10053a.isPlaying()) {
                ((K4) ((c) this.f9812U).f6955V).f10053a.pause();
                h();
                f(3000);
            }
            return true;
        } else if (keyCode == 25 || keyCode == 24 || keyCode == 164) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            if (keyCode == 4 || keyCode == 82) {
                if (z) {
                    c();
                }
                return true;
            }
            f(3000);
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    public final int e() {
        A4 a42 = this.f9812U;
        if (a42 == null || this.f9820f0) {
            return 0;
        }
        int currentPosition = ((K4) ((c) a42).f6955V).f10053a.getCurrentPosition();
        int duration = ((K4) ((c) this.f9812U).f6955V).f10053a.getDuration();
        ProgressBar progressBar = this.f9816b0;
        if (progressBar != null) {
            if (duration > 0) {
                progressBar.setProgress((int) ((((long) currentPosition) * 1000) / ((long) duration)));
            }
            this.f9812U.getClass();
            this.f9816b0.setSecondaryProgress(0);
        }
        TextView textView = this.f9817c0;
        if (textView != null) {
            textView.setText(g(duration));
        }
        TextView textView2 = this.f9818d0;
        if (textView2 != null) {
            textView2.setText(g(currentPosition));
        }
        return currentPosition;
    }

    public final void f(int i) {
        if (!this.f9819e0 && this.f9814W != null) {
            e();
            ImageButton imageButton = this.f9824j0;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            a();
            this.f9814W.addView(this, new FrameLayout.LayoutParams(-1, -2, 80));
            this.f9819e0 = true;
            Log.d("C4", "Show VideoController");
        }
        h();
        B4 b42 = this.f9829o0;
        b42.sendEmptyMessage(2);
        Message obtainMessage = b42.obtainMessage(1);
        if (i != 0) {
            b42.removeMessages(1);
            b42.sendMessageDelayed(obtainMessage, (long) i);
        }
    }

    public final String g(int i) {
        int i8 = i / 1000;
        int i9 = i8 % 60;
        int i10 = (i8 / 60) % 60;
        int i11 = i8 / 3600;
        this.f9822h0.setLength(0);
        if (i11 > 0) {
            return this.f9823i0.format("%d:%02d:%02d", new Object[]{Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i9)}).toString();
        }
        return this.f9823i0.format("%02d:%02d", new Object[]{Integer.valueOf(i10), Integer.valueOf(i9)}).toString();
    }

    public final void h() {
        A4 a42;
        if (this.f9815a0 != null && this.f9824j0 != null && (a42 = this.f9812U) != null) {
            if (((K4) ((c) a42).f6955V).f10053a.isPlaying()) {
                this.f9824j0.setImageResource(2131230994);
            } else {
                this.f9824j0.setImageResource(2131230996);
            }
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        View view = this.f9815a0;
        if (view != null) {
            d(view);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f(3000);
        return true;
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        f(3000);
        return false;
    }

    public void setAnchorView(ViewGroup viewGroup) {
        this.f9814W = viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        removeAllViews();
        View inflate = ((LayoutInflater) this.f9813V.getSystemService("layout_inflater")).inflate(2131558521, (ViewGroup) null);
        this.f9815a0 = inflate;
        d(inflate);
        addView(this.f9815a0, layoutParams);
    }

    public void setEnabled(boolean z) {
        ImageButton imageButton = this.f9824j0;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
        ImageButton imageButton2 = this.f9825k0;
        if (imageButton2 != null) {
            imageButton2.setEnabled(z);
        }
        ImageButton imageButton3 = this.f9826l0;
        if (imageButton3 != null) {
            imageButton3.setEnabled(z);
        }
        ImageButton imageButton4 = this.f9827m0;
        if (imageButton4 != null) {
            imageButton4.setEnabled(false);
        }
        ImageButton imageButton5 = this.f9828n0;
        if (imageButton5 != null) {
            imageButton5.setEnabled(false);
        }
        ProgressBar progressBar = this.f9816b0;
        if (progressBar != null) {
            progressBar.setEnabled(z);
        }
        a();
        super.setEnabled(z);
    }

    public void setMediaPlayer(A4 a42) {
        this.f9812U = a42;
        h();
    }
}
