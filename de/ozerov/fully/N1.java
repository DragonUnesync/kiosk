package de.ozerov.fully;

import C3.C0025a;
import F5.b;
import Z1.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import d4.k;
import java.util.ArrayList;
import n2.a;

public final class N1 {

    /* renamed from: a  reason: collision with root package name */
    public final ListView f10157a;

    /* renamed from: b  reason: collision with root package name */
    public final C0693f0 f10158b;

    /* renamed from: c  reason: collision with root package name */
    public final SlidingMenu f10159c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f10160d;
    public final FullyActivity e;

    /* renamed from: f  reason: collision with root package name */
    public long f10161f = 0;

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.BaseAdapter, android.widget.ListAdapter, de.ozerov.fully.f0] */
    public N1(FullyActivity fullyActivity) {
        this.e = fullyActivity;
        SlidingMenu slidingMenu = new SlidingMenu(fullyActivity, (AttributeSet) null);
        this.f10159c = slidingMenu;
        slidingMenu.setMode(0);
        slidingMenu.setTouchModeAbove(0);
        slidingMenu.setBehindWidth(a.p(280.0f, fullyActivity));
        slidingMenu.setShadowWidthRes(2131166022);
        slidingMenu.setShadowDrawable(2131231040);
        slidingMenu.setMenu(2131558465);
        ArrayList arrayList = new ArrayList();
        this.f10160d = arrayList;
        ? baseAdapter = new BaseAdapter();
        baseAdapter.f10622U = fullyActivity;
        baseAdapter.f10623V = arrayList;
        this.f10158b = baseAdapter;
        ListView listView = (ListView) slidingMenu.getMenu().findViewById(2131362257);
        this.f10157a = listView;
        listView.setAdapter(baseAdapter);
        d();
        if (slidingMenu.getParent() == null) {
            TypedArray obtainStyledAttributes = fullyActivity.getTheme().obtainStyledAttributes(new int[]{16842836});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            slidingMenu.f9512U = true;
            ViewGroup viewGroup = (ViewGroup) fullyActivity.findViewById(16908290);
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeView(childAt);
            viewGroup.addView(slidingMenu);
            slidingMenu.setContent(childAt);
            if (childAt.getBackground() == null) {
                childAt.setBackgroundResource(resourceId);
            }
            listView.setOnItemClickListener(new L1(this, fullyActivity));
            slidingMenu.setOnOpenedListener(new M1(this));
            slidingMenu.setOnClosedListener(new M1(this));
            return;
        }
        throw new IllegalStateException("This SlidingMenu appears to already be attached");
    }

    public final void a() {
        b();
        this.f10159c.a(true);
    }

    public final boolean b() {
        b bVar = this.f10159c.f9513V;
        if (bVar.getCurrentItem() == 0 || bVar.getCurrentItem() == 2) {
            return true;
        }
        return false;
    }

    public final void c() {
        b();
        this.f10159c.f9513V.h(0, 0, true, false);
    }

    public final void d() {
        ArrayList arrayList = this.f10160d;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new J1("singleAppManager", 2131230977, "Home", "Show quick settings pane"));
        FullyActivity fullyActivity = this.e;
        arrayList2.add(new J1("settings", 2131231003, fullyActivity.getString(2131951852), fullyActivity.getString(2131951853)));
        arrayList2.add(new J1("getLicense", 2131231012, "Get a PLUS License", "Check or obtain the license"));
        if (((c) fullyActivity.f9961z0.f9767W).q("hourCounter", 0) > 96) {
            arrayList2.add(new J1("rateFully", 2131230976, "Happy with Fully?", "Give ★★★★★ at Google Play"));
        }
        if (C0813z1.f11119p1) {
            arrayList2.add(new J1("migration", 2131231013, "Local Files Alert", "App needs your attention!"));
        }
        arrayList2.add(new J1("exit", 2131230968, fullyActivity.getString(2131951844) + "Fully", fullyActivity.getString(2131951842)));
        arrayList.addAll(arrayList2);
        this.f10158b.notifyDataSetChanged();
        SlidingMenu slidingMenu = this.f10159c;
        TextView textView = (TextView) slidingMenu.getMenu().findViewById(2131361888);
        if (textView != null) {
            textView.setText("Version 1.17.1");
        }
        k kVar = new k((Context) fullyActivity, 1);
        TextView textView2 = (TextView) slidingMenu.getMenu().findViewById(2131362256);
        textView2.setText(kVar.O2(((c) kVar.f9767W).r("menuInfo", "Device ID: $deviceId\nIP Address: $ip")));
        textView2.setFocusable(false);
        textView2.setOnClickListener(new C0025a(13, this));
    }
}
