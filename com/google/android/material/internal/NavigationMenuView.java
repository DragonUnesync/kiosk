package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import n.C1220A;
import n.m;

public class NavigationMenuView extends RecyclerView implements C1220A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public final void c(m mVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
