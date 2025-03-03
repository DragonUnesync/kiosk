package a3;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.lifecycle.c;
import b3.C0528a;
import b3.C0529b;
import b3.C0530c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: a3.c  reason: case insensitive filesystem */
public final class C0417c extends BaseAdapter {

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f7176U;

    /* renamed from: V  reason: collision with root package name */
    public final Context f7177V;

    /* renamed from: W  reason: collision with root package name */
    public final C0528a f7178W;

    /* renamed from: X  reason: collision with root package name */
    public c f7179X;

    public C0417c(ArrayList arrayList, Context context, C0528a aVar) {
        this.f7176U = arrayList;
        this.f7177V = context;
        this.f7178W = aVar;
    }

    public final int getCount() {
        return this.f7176U.size();
    }

    public final Object getItem(int i) {
        return (C0529b) this.f7176U.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: type inference failed for: r15v4, types: [java.lang.Object, a3.b] */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0416b bVar;
        Context context = this.f7177V;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(2131558459, viewGroup, false);
            ? obj = new Object();
            obj.f7173b = (TextView) view.findViewById(2131362114);
            obj.f7174c = (TextView) view.findViewById(2131362120);
            obj.f7172a = (ImageView) view.findViewById(2131362160);
            obj.f7175d = (CheckBox) view.findViewById(2131362089);
            view.setTag(obj);
            bVar = obj;
        } else {
            bVar = (C0416b) view.getTag();
        }
        C0529b bVar2 = (C0529b) this.f7176U.get(i);
        if (C0530c.f8663a.containsKey(bVar2.f8660V)) {
            view.setAnimation(AnimationUtils.loadAnimation(context, 2130772009));
        } else {
            view.setAnimation(AnimationUtils.loadAnimation(context, 2130772015));
        }
        boolean z = bVar2.f8661W;
        C0528a aVar = this.f7178W;
        if (z) {
            bVar.f7172a.setImageResource(2131755016);
            int i8 = Build.VERSION.SDK_INT;
            ImageView imageView = bVar.f7172a;
            if (i8 >= 23) {
                imageView.setColorFilter(context.getResources().getColor(2131099714, context.getTheme()));
            } else {
                imageView.setColorFilter(context.getResources().getColor(2131099714));
            }
            int i9 = aVar.f8655c;
            CheckBox checkBox = bVar.f7175d;
            if (i9 == 0) {
                checkBox.setVisibility(4);
            } else {
                checkBox.setVisibility(0);
            }
        } else {
            bVar.f7172a.setImageResource(2131755015);
            int i10 = Build.VERSION.SDK_INT;
            ImageView imageView2 = bVar.f7172a;
            if (i10 >= 23) {
                imageView2.setColorFilter(context.getResources().getColor(2131099695, context.getTheme()));
            } else {
                imageView2.setColorFilter(context.getResources().getColor(2131099695));
            }
            int i11 = aVar.f8655c;
            CheckBox checkBox2 = bVar.f7175d;
            if (i11 == 1) {
                checkBox2.setVisibility(4);
            } else {
                checkBox2.setVisibility(0);
            }
        }
        bVar.f7172a.setContentDescription(bVar2.f8659U);
        bVar.f7173b.setText(bVar2.f8659U);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm aa", Locale.getDefault());
        Date date = new Date(bVar2.f8662X);
        TextView textView = bVar.f7174c;
        if (i != 0 || !bVar2.f8659U.startsWith(context.getString(2131951786))) {
            textView.setText(context.getString(2131951788) + simpleDateFormat.format(date) + ", " + simpleDateFormat2.format(date));
        } else {
            textView.setText(2131951787);
        }
        CheckBox checkBox3 = bVar.f7175d;
        if (checkBox3.getVisibility() == 0) {
            if (i == 0 && bVar2.f8659U.startsWith(context.getString(2131951786))) {
                checkBox3.setVisibility(4);
            }
            if (C0530c.f8663a.containsKey(bVar2.f8660V)) {
                checkBox3.setChecked(true);
            } else {
                checkBox3.setChecked(false);
            }
        }
        checkBox3.setOnClickListener(new C0415a(this, bVar, bVar2, 0));
        return view;
    }
}
