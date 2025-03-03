package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.W;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends W {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f9289a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f9290b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f9291c;

    public j(k kVar, s sVar, MaterialButton materialButton) {
        this.f9291c = kVar;
        this.f9289a = sVar;
        this.f9290b = materialButton;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f9290b.getText());
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i8) {
        int i9;
        String str;
        k kVar = this.f9291c;
        if (i < 0) {
            i9 = ((LinearLayoutManager) kVar.f9298W0.getLayoutManager()).Y0();
        } else {
            i9 = ((LinearLayoutManager) kVar.f9298W0.getLayoutManager()).Z0();
        }
        b bVar = this.f9289a.f9345a;
        Calendar a8 = w.a(bVar.f9268U.f9329U);
        a8.add(2, i9);
        kVar.f9294S0 = new o(a8);
        Calendar a9 = w.a(bVar.f9268U.f9329U);
        a9.add(2, i9);
        a9.set(5, 1);
        Calendar a10 = w.a(a9);
        a10.get(2);
        a10.get(1);
        a10.getMaximum(7);
        a10.getActualMaximum(5);
        a10.getTimeInMillis();
        long timeInMillis = a10.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = w.f9349a;
            DateFormat a11 = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            a11.setTimeZone(TimeZone.getTimeZone("UTC"));
            a11.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            str = a11.format(new Date(timeInMillis));
        } else {
            str = DateUtils.formatDateTime((Context) null, timeInMillis, 8228);
        }
        this.f9290b.setText(str);
    }
}
